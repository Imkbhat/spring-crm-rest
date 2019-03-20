package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			//Create object mapper
			ObjectMapper mapper = new ObjectMapper();
					
			//read the json file and  convert to json data/sample-lite.json
			
			Student  theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print first and last name
			
			System.out.println("Th student First Name "+theStudent.getFirstName());
			
			System.out.println("Th student Last Name "+theStudent.getLastName());
			
			//print address
			Address add = theStudent.getAddress();
			
			System.out.println("Street" +add.getStreet());
			System.out.println("City" +add.getCity());

			//print languages
			
			
			for (String language : theStudent.getLanguages()) {
				System.out.println(language);
			}
			
		} catch(Exception  ex) {
			ex.printStackTrace();
		}
	}

}
