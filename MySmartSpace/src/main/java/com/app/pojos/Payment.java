package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // how to make auto generated
	private Integer payment_id;
	
	@OneToOne
	@JoinColumn(name = "order_id")
	private Orders order_id;

	 @Column(name = "payment_date")
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		@JsonProperty(value = "payment_date")
		private LocalDate payment_date; 
	
	public Payment() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public Integer getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Integer payment_id) {
		this.payment_id = payment_id;
	}

	public Orders getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Orders order_id) {
		this.order_id = order_id;
	}

	public LocalDate getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(LocalDate payment_date) {
		this.payment_date = payment_date;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", order_id=" + order_id + ", payment_date=" + payment_date + "]";
	}

	
	

	

}
