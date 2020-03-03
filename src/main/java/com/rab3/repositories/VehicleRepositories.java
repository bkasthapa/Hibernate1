package com.rab3.repositories;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.rab3.entities.VehicleEntity;

public class VehicleRepositories {

	private SessionFactory sessionFactory;

	public void lessVehicles(VehicleEntity vehicleEntity) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(vehicleEntity);
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
