package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name="specifications")
public class Specifications implements Serializable{
  	@Id // primary key
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne
	@JoinColumn(referencedColumnName ="product_id")
	private Products product_id;
	
	@Column(length = 30)
	private String dimension;
	
	private double weight;
	
	@Column(length = 30 )
	private String controller; // arduino esp32
	
	@Column(length = 30)
	private String sensor; // 
	
	@Column(length = 30)
	private String build_type;
	
	
	@Column(length = 30)
	private String motor_type; // stepper or geared
	
	@Column(length = 30)
	private String wiring_type;
	
	@Column(length = 30)
	private String power_supply_unit; // smps transformer
	
	@Column(length = 30)
	private String bluetooth_enabled; // if yes then type 
	

	private boolean internet_controlled; // yes no only
	
	@Column(length = 30)
	private String camera_equipped; // if yes then specify
	
	@Column(length = 30)
	private String physical_remote; // if yes then specify

	@Column(length = 500)
	private String working;

	public Products getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Products product_id) {
		this.product_id = product_id;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	public String getBuild_type() {
		return build_type;
	}

	public void setBuild_type(String build_type) {
		this.build_type = build_type;
	}

	public String getMotor_type() {
		return motor_type;
	}

	public void setMotor_type(String motor_type) {
		this.motor_type = motor_type;
	}

	public String getWiring_type() {
		return wiring_type;
	}

	public void setWiring_type(String wiring_type) {
		this.wiring_type = wiring_type;
	}

	public String getPower_supply_unit() {
		return power_supply_unit;
	}

	public void setPower_supply_unit(String power_supply_unit) {
		this.power_supply_unit = power_supply_unit;
	}

	public String getBluetooth_enabled() {
		return bluetooth_enabled;
	}

	public void setBluetooth_enabled(String bluetooth_enabled) {
		this.bluetooth_enabled = bluetooth_enabled;
	}

	public boolean isInternet_controlled() {
		return internet_controlled;
	}

	public void setInternet_controlled(boolean internet_controlled) {
		this.internet_controlled = internet_controlled;
	}

	public String getCamera_equipped() {
		return camera_equipped;
	}

	public void setCamera_equipped(String camera_equipped) {
		this.camera_equipped = camera_equipped;
	}

	public String getPhysical_remote() {
		return physical_remote;
	}

	public void setPhysical_remote(String physical_remote) {
		this.physical_remote = physical_remote;
	}

	public String getWorking() {
		return working;
	}

	public void setWorking(String working) {
		this.working = working;
	}

	@Override
	public String toString() {
		return "Specifications [product_id=" + product_id + ", dimension=" + dimension + ", weight=" + weight
				+ ", controller=" + controller + ", sensor=" + sensor + ", build_type=" + build_type + ", motor_type="
				+ motor_type + ", wiring_type=" + wiring_type + ", power_supply_unit=" + power_supply_unit
				+ ", bluetooth_enabled=" + bluetooth_enabled + ", internet_controlled=" + internet_controlled
				+ ", camera_equipped=" + camera_equipped + ", physical_remote=" + physical_remote + ", working="
				+ working + "]";
	}
	
	
	
	 /*@Column(name = "exp_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonProperty(value = "exp-date")
	private LocalDate expDate; */
	
	
	

}
