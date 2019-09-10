package com.santos.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santos.beans.Barcelona;
import com.santos.beans.Ciudad;
import com.santos.beans.Jugador;
import com.santos.beans.Juventus;
import com.santos.beans.Persona;

public class App {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		//lectura de archivo xml
		//configuracion xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/santos/xml/beans.xml");
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		System.out.println("Elija un equipo:\n\t1.- Barcelona\n\t2.-Juventus");
		int respuesta = reader.nextInt();
		
		switch(respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
		
		
		System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar() + " - " + jug.getCamiseta().getNumero() + " - " + jug.getCamiseta().getMarca().getNombre());
		
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
