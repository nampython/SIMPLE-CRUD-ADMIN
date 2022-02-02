package com.contact.ContactApp.Repository;

import java.util.List;

import com.contact.ContactApp.Model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
    List<Contact> findByNameContaining(String term);
}
