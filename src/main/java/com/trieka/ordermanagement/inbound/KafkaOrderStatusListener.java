package com.trieka.ordermanagement.inbound;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.trieka.ordermanagement.dto.KafkaUpdateOrderPayload;
import com.trieka.ordermanagement.entity.Order;
import com.trieka.ordermanagement.repo.OrderRepository;
import com.trieka.ordermanagement.util.validation.JsonUtils;

@Service
public class KafkaOrderStatusListener {
	
	@Autowired
	private OrderRepository orderRepo;
	
	
	@KafkaListener(topics = "com.trieka.order.update-status", groupId = "com.trieka.order.ordermanagement.group")
	public void listenUpdateOrderStatus(String message){
		KafkaUpdateOrderPayload payload = JsonUtils.parse(message, KafkaUpdateOrderPayload.class);
		if (payload == null) {
			return;
		}
		
		Optional<Order> order = orderRepo.findById(payload.getOrderId());
		if (!order.isPresent()) {
			return;
		}
		order.get().setOrderStatus(payload.getStatus());
		orderRepo.save(order.get());
	}
	
}
