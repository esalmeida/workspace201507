package br.fatec.integracao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class CriadorDeSessao {
	private static SessionFactory sessionFactory; 
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) { 
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			 } 
		return sessionFactory;
		}

	
}
