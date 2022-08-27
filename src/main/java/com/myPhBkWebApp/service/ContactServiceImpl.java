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
		boolean existsById = contactRepo.existsById(contactId);
		if (existsById){
			contact.setContactId(contactId);
			Contact updated = contactRepo.save(contact);
			return updated;
		}
		return null;
	}

	@Override
	public Contact getContact(Integer contactid) {
		boolean existsById = contactRepo.existsById(contactid);
		if(existsById) {
		Contact contact = contactRepo.findById(contactid).get();
		
		return contact;
		}
		return null;
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteContact(Integer contactId) {
		boolean existsById = contactRepo.existsById(contactId);
		if(existsById){
			Contact contact = contactRepo.findById(contactId).get();
			contactRepo.delete(contact);
			
		}
		
	}

}
