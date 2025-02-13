package utilities;

import com.github.javafaker.Faker;

public class RandomUtility {
	public String fakerFullName()
	{
		Faker faker = new Faker();
		return  faker.name().fullName();
		

	}
	public String fakerPassword()
	{
		Faker faker = new Faker();
		return faker.internet().password();
	}
	public String fakerFirstName()
	{
		Faker faker=new Faker();
		 return faker.name().fullName();
	}
	public String fakerLastName()
	{
		Faker faker=new Faker();
		return faker.name().lastName();
	}
	public String fakerDiseaseName()
	{
		Faker faker=new Faker();
		return faker.medical().diseaseName();

	}
	public String fakerPhoneNumber()
	{
		Faker faker=new Faker();
		return faker.phoneNumber().cellPhone();
	}
	
	public String fakerAddress()
	{
		Faker faker=new Faker();
		return faker.address().fullAddress();
	}
	public String fakerEmail()
	{
		Faker faker=new Faker();
		return faker.internet().emailAddress();
	}
	public int fakerNumber() 
	{
		Faker faker=new Faker();
		return faker.number().numberBetween(0, 100);
	}
	public String fakerNews()
	{
		Faker faker=new Faker();
		return faker.lorem().sentence();
	}
	public int fakerTime() {
	    Faker faker = new Faker();
	    int hour = faker.number().numberBetween(0, 23);
	    int min = faker.number().numberBetween(0, 59);
	    return (hour * 100) + min; 
	}	

}
