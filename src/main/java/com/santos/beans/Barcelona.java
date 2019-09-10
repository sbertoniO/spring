package com.santos.beans;

import org.springframework.stereotype.Component;

import com.santos.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	public String mostrar() {
		return "Barcelona";
	}

}
