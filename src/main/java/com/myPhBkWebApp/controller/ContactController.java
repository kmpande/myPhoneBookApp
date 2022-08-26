package com.myPhBkWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myPhBkWebApp.service.ContactServiceI;

@RestController
@RequestMapping("/api/contact/")
public class ContactController {

	@Autowired
	private ContactServiceI contactServiceI;
	
	//api to save a contact
	
	//edit contact
	
	//get a contact by id
	
	//get all contacts
	
	
}
