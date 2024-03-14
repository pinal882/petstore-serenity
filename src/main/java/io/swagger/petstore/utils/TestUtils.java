package io.swagger.petstore.utils;

import java.util.Random;

public class TestUtils {


	public static String getRandomValue(){
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}
	//public static generateFirstName(){
		//Faker faker = new Faker();
		//return faker.name().firstName();

	//}

	public static void main(String[] args) {
		//Faker faker = new Faker();
		//System.out.println(generateFirstName);
		//System.out.println(faker.address().country());
	}
}
