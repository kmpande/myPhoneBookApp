package com.myPhBkWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myPhBkWebApp.model.Contact;
import com.myPhBkWebApp.service.ContactServiceI;

@RestController
@RequestMapping("/api/contact/")
public class ContactController {

	@Autowired
	private ContactServiceI contactServiceI;
	
	//api to save a contact
	
	public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
		Contact saveContact = contactServiceI.saveContact(contact);
		
		return new ResponseEntity<>(saveContact,HttpStatus.CREATED);
		
	}
	//edit contact
	
	//get a contact by id
	
	//get all contacts
	
	
}
