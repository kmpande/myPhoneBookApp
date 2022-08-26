package com.myPhBkWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myPhBkWebApp.model.Contact;
import com.myPhBkWebApp.repository.ContactRepo;
@Service
public class ContactServiceImpl implements ContactServiceI{

	@Autowired
	private ContactRepo contactRepo;
	
	
	@Override
	public Contact saveContact(Contact contact) {
	Contact save = contactRepo.save(contact);
	
		return save;
	}

	@Override
	public Contact editContact(Contact contact, Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(Integer contactid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteContact(Integer contactId) {
		// TODO Auto-generated method stub
		
	}

}
