package com.rab3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicles")

public class VehicleEntity {

	@Id
	@Column(name = "vehicle_id")
	private Integer vehicle_id;

	@Column(name = "make")
	private String make;

	@Column(name = "model")
	private String model;

	@Column(name = "color")
	private String color;

	@Column(name = "transmision")
	private String transmision;

	@Column(name = "year")
	private String year;

	@Column(name = "price")
	private String price;

	public Integer getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Integer vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VehicleEntity [vehicle_id=" + vehicle_id + ", make=" + make + ", model=" + model + ", color=" + color
				+ ", transmision=" + transmision + ", year=" + year + ", price=" + price + "]";
	}

}
