package com.app.pojos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="quotations")
public class Quotations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer quotation_number;
	
	@ManyToOne
	@JoinColumn(referencedColumnName =  "order_id")
	private Orders order_id; // order id copied from orders table linked with product table
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "user_id")
	private Users service_provider_id;
			
	private double min_price;
	
	private double max_price;
	
	@Column(length = 500)
	private String response;
	
	
	private boolean status; // accept or rejected
	// trigger when status changed to rejected previous quotation should be delted.
	public Quotations() {
		System.out.println("in ctor of "+getClass().getName());
	}




	public Orders getOrder_id() {
		return order_id;
	}




	public void setOrder_id(Orders order_id) {
		this.order_id = order_id;
	}




	public String getResponse() {
		return response;
	}




	public void setResponse(String response) {
		this.response = response;
	}




	public double getMin_price() {
		return min_price;
	}




	public void setMin_price(double min_price) {
		this.min_price = min_price;
	}




	public double getMax_price() {
		return max_price;
	}




	public void setMax_price(double max_price) {
		this.max_price = max_price;
	}




	@Override
	public String toString() {
		return "Quotations [quotation_number=" + quotation_number + ", order_id=" + order_id + ", service_provider_id="
				+ service_provider_id + ", min_price=" + min_price + ", max_price=" + max_price + ", response="
				+ response + ", status=" + status + "]";
	}




	public Integer getQuotation_number() {
		return quotation_number;
	}




	public void setQuotation_number(Integer quotation_number) {
		this.quotation_number = quotation_number;
	}




	public Users getService_provider_id() {
		return service_provider_id;
	}




	public void setService_provider_id(Users service_provider_id) {
		this.service_provider_id = service_provider_id;
	}




	public boolean isStatus() {
		return status;
	}




	public void setStatus(boolean status) {
		this.status = status;
	}
	

	
	
}


/*  This is repsonse form from service providers to the customer */