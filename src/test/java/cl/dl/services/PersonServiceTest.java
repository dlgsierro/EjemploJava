package cl.dl.services;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.dl.domain.Person;

public class PersonServiceTest {

	private Person person;
	private PersonService service = new PersonService();  
	
	@Test
	public void testBuildPerson() {
		person = service.buildPerson("Gonzalo", "Sierro", 41, Person.Gender.MALE);
		assertNotNull(person);
	}

}
