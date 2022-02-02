package com.contact.ContactApp.Service;

import java.util.List;
import com.contact.ContactApp.Model.Contact;

import org.springframework.stereotype.Service;

@Service
public interface ContactService {
    Iterable<Contact> findAll();
    List<Contact> search(String term);
    Contact findOne(Integer id);
    void save(Contact contact);
    void delete(Integer id);
}
