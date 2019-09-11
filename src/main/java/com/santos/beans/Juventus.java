package com.santos.beans;

import org.springframework.stereotype.Component;

import com.santos.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	public String mostrar() {
		return "Juventus";
	}

}
