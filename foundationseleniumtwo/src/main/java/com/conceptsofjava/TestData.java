package com.conceptsofjava;

import com.github.javafaker.Faker;

public class TestData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faker faker = new Faker();
		String name = faker.name().fullName(); 
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String animalname=faker.animal().name();
		System.out.println(name);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(animalname);

	}	

}
