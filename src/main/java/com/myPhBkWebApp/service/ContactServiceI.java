package com.myPhBkWebApp.service;

import java.util.List;

import com.myPhBkWebApp.model.Contact;



public  interface ContactServiceI {
	//create contact
	Contact saveContact(Contact contact);
	
	//edit contact
	Contact editContact(Contact contact, Integer contactId);
	
	// get a contact
	Contact getContact(Integer contactid);
	
	//get all contacts
	List<Contact> getAllContact();
	
	//delete contact
	
	void deleteContact(Integer contactId);
	
	//search a contact by name
	Contact searchContactbyName(String contactName);
	
	boolean softdeleteContact(Integer contactId);
	
	
}
