package com.luv2code.jacksondemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON from file and map/convert to Java POJO
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// also print individual items
			System.out.println("First name = " + theStudent.getFirstName());
			System.out.println("Last name = " + theStudent.getLastName());		

			// get nested object: array
			Address tempAddress = theStudent.getAddress();
			System.out.println("Street = " + tempAddress.getStreet());		
			System.out.println("City = " + tempAddress.getCity());	
			
			// Print Languages
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);	
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
