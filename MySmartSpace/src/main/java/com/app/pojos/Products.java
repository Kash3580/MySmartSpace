package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="products")
public class Products {
	@Id
	private String product_id;
	
	@Column(length = 30,unique = true)
	private String product_name;
	

	
	@Column(length = 500)
	private String description;
	
	
	private double approximate_price;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="user_id")
	private Users service_provider_id;
	
	private Integer quantity_sold;
	
	private double rating;
	
	@Column(length = 100)
	private String image_url;
	
	 /*@Column(name = "exp_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonProperty(value = "exp-date")
	private LocalDate expDate; */
	
	
	public Products() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getApproximate_price() {
		return approximate_price;
	}

	public void setApproximate_price(double approximate_price) {
		this.approximate_price = approximate_price;
	}

	public Users getService_provider_id() {
		return service_provider_id;
	}

	public void setService_provider_id(Users service_provider_id) {
		this.service_provider_id = service_provider_id;
	}

	public Integer getQuantity_sold() {
		return quantity_sold;
	}

	public void setQuantity_sold(Integer quantity_sold) {
		this.quantity_sold = quantity_sold;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
				+ ", approximate_price=" + approximate_price + ", service_provider_id=" + service_provider_id
				+ ", quantity_sold=" + quantity_sold + ", rating=" + rating + ", image_url=" + image_url + "]";
	}
	

	
	

}
