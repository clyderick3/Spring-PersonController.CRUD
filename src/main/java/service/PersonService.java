package service;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PersonService {
    @Autowired //Adds all the functionality of the person repo to this class. Wires the two; one way.
    PersonRepository personRepository;

    //Create a person
    public void createPerson(Person person) {
        Person p = personRepository.save(person);
    }

    //Update a person
    public void updatePerson(Long id) {
        if (!personRepository.exists(id)) {
            throw new NoSuchElementException();
        } else {
            Person p = personRepository.findOne(id);
            personRepository.save(p);
        }
    }

    //Get a person
    public Person getPerson(Long id) {
        Person p = personRepository.findOne(id);
        return p;
    }

    //Get all people
    public List<Person> getPersonList() {
        List<Person> people = personRepository.findAll();
        return people;
    }

    //Delete a person
    public void deletePerson(Long id) {
        if (!personRepository.exists(id)) {
            throw new NoSuchElementException();
        } else {
            Person p = personRepository.findOne(id);
            personRepository.delete(p);
        }
    }
}
