package com.rab3.mainmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab3.entities.VehicleEntity;
import com.rab3.repositories.VehicleRepositories;

public class MainMethod {

	public static void main(String[] args) {

		ApplicationContext ct = new ClassPathXmlApplicationContext("application-context.xml");

		VehicleRepositories vr = (VehicleRepositories) ct.getBean("vehicleRepository");

		VehicleEntity ven = new VehicleEntity();
		ven.setVehicle_id(4534);
		ven.setMake("Toyota");
		ven.setModel("Camry");
		ven.setColor("Black");
		ven.setPrice("23334");
		ven.setTransmision("Manual");
		ven.setYear("2022");

		vr.lessVehicles(ven);

	}

}
