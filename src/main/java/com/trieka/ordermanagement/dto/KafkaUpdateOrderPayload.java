package com.trieka.ordermanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class KafkaUpdateOrderPayload {
	@JsonProperty("order_id")
	private String orderId;
	@JsonProperty("status")
	private String status;
}
