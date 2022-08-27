package com.myPhBkWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myPhBkWebApp.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

	Contact findByContactName(String contactName);
}
