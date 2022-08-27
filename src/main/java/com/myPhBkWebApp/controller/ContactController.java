package com.myPhBkWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myPhBkWebApp.model.Contact;
import com.myPhBkWebApp.service.ContactServiceI;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

	@Autowired
	private ContactServiceI contactServiceI;
	
	//api to save a contact
	@PostMapping("/")
	public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
		Contact saveContact = contactServiceI.saveContact(contact);
		
		return new ResponseEntity<>(saveContact,HttpStatus.CREATED);
		
	}
	//edit contact
	public ResponseEntity<Contact> editContact(@RequestBody Contact contact, @PathVariable Integer contactId){
		Contact editContact = contactServiceI.editContact(contact, contactId);
		
		return new ResponseEntity<Contact>(editContact, HttpStatus.OK);
		
	}
	//get a contact by id
	
	//get all contacts
	
	
}
