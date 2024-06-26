package br.com.magno.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.magno.model.Person;

@Service
public class PersonServices {

	private static final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public List<Person> findAll() {
		logger.info("Finding all people!");

		List<Person> persons = new ArrayList<>();

		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}

		return persons;

	}

	

	public Person findById(String id) {

		logger.info("Finding one person!");

		Person person = new Person();

		person.setId(counter.incrementAndGet());
		person.setFirstName("Gregorio");
		person.setLastName("Magno");
		person.setAddress("Parnaiba - Piaui");
		person.setGender("Male");
		return person;
	}
	
	public Person create(Person person) {
		logger.info("creating one person!");

		return person;
	}
	public Person update(Person person) {
		logger.info("updating one person!");

		return person;
	}
	
	public void delete(String id) {
		logger.info("Deleting one person!");
	}
	
	private Person mockPerson(int i) {
		
		Person person = new Person();

		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("LastName " + i);
		person.setAddress("some adress Brasil " + i);
		person.setGender("Male");
		
		return person;
	}
	

}
