package com.trieka.ordermanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Order")
@Table(name = "tx_order")
public class Order {

	@Id
	@Column(name = "phone",updatable = false, nullable = false)
	private String orderId;
	
	@Column(name = "order_status")
	private String orderStatus;
	
	@Column(name = "product_code")
	private String productCode;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_phone_number", referencedColumnName = "phone")
	private User user;
	

}
