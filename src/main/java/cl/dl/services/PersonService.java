package cl.dl.services;

import cl.dl.domain.Person;

public class PersonService {

	public Person buildPerson(String firstName, String lastName, int age, Person.Gender gender) {
		Person person = new Person();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAge(age);
		person.setGender(gender);
		
		return person;
	}
	
	public boolean areEquals(Person person1, Person person2) {
		boolean result = false;
		if(person1 != null && 
				person2 != null &&
				person1.getFirstName() == person2.getFirstName() &&
				person1.getLastName() == person2.getLastName() &&
				person1.getAge() == person2.getAge() &&
				person1.getGender() == person2.getGender()) {
			result = true;
		}
		return result;
	}
	
}
