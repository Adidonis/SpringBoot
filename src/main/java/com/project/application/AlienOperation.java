package com.project.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class AlienOperation {
	private List<Information> aliens= new ArrayList<>( Arrays.asList(  
			new Information("101","Aditya","80"),
			new Information("102","Akshay","90"),
			new Information("103","Abhay","60"),
			new Information("104","Aditi","70")));


	
	public List<Information> getaliens(){
		return aliens;
	}

	public void addInformation(Information information) {
		aliens.add(information);
		
	}
}
