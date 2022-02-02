package com.contact.ContactApp.Repository;

import java.util.List;

import com.contact.ContactApp.Model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer>{

}
