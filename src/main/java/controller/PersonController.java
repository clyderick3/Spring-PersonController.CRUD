package controller;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import repository.PersonRepository;

import java.util.List;
import java.util.NoSuchElementException;

@RestController

public class PersonController{
    POST /people - create a new person
    Response: 201 Created
    GET /people - get the list of all people
    Response: 200 OK
    GET /people/{id} - Get the person with id number {id}
    Response: 200 OK if found, else 404 Not Found
    PUT /people/{id} - Update the person with id number {id}
    Response: 200 OK if updated, 201 Created if a new entity was created
    DELETE /people/{id} - delete the person with id number {id}
    Response: 204 No Content
    }

