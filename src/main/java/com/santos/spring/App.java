package com.santos.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santos.beans.Ciudad;
import com.santos.beans.Jugador;
//import com.santos.beans.AppConfig;
//import com.santos.beans.AppConfig2;
import com.santos.beans.Persona;

public class App {

	public static void main(String[] args) {

		//lectura de archivo xml
		//configuracion xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/santos/xml/beans.xml");
		//AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		//appContext.register(AppConfig.class);
		//appContext.register(AppConfig2.class);
		//reconstruir el archivo de configuración
		//appContext.refresh();
		Jugador jug = (Jugador) appContext.getBean("messi");
		System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar());
		
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
