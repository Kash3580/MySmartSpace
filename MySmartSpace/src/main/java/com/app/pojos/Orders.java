package com.app.pojos;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer order_id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users customer_id; // email_id
	
	@ManyToOne
	@JoinColumn(referencedColumnName="product_id")
	private Products product_id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="user_id") // this is from user table
	//@Column(insertable = false, updatable = false)
	private Users service_provider_id;
	
	private Integer quantity;
	
	private double total_amount;
	
	@Column(length = 5)
	private String status;   //C-up - rej - new
		
	
	// @Column(length = 15)
	private boolean payment_status; // yes or no
	
	
	 @Column(name = "order_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonProperty(value = "order_date")
	private LocalDate order_date; 
	
	 
	@Column( length= 500)
	private String note;
	
	public Orders() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Users getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Users customer_id) {
		this.customer_id = customer_id;
	}

	public Products getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Products product_id) {
		this.product_id = product_id;
	}

	public Users getService_provider_id() {
		return service_provider_id;
	}

	public void setService_provider_id(Users service_provider_id) {
		this.service_provider_id = service_provider_id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isPayment_status() {
		return payment_status;
	}

	public void setPayment_status(boolean payment_status) {
		this.payment_status = payment_status;
	}

	public LocalDate getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", product_id=" + product_id + ", quantity=" + quantity
				+ ", total_amount=" + total_amount + ", status=" + status + ", payment_status=" + payment_status
				+ ", order_date=" + order_date + ", note=" + note + "]";
	}
	
	
	

	

}
