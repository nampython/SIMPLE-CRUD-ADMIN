package com.contact.ContactApp.Service;

import java.util.List;
import java.util.Optional;

import com.contact.ContactApp.Model.Admin;

public interface AdminService {
    List<Admin> getAllAdmin();
    void saveAdmin(Admin admin);
    void deteteAdmin(Integer id);
    Optional<Admin> findAdminById(Integer id);

}
