package com.contact.ContactApp.Service;

import java.util.List;
import java.util.Optional;

import com.contact.ContactApp.Model.Admin;
import com.contact.ContactApp.Repository.AdminRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepo adminRepo;

    @Override
    public List<Admin> getAllAdmin() {
        return (List<Admin>)adminRepo.findAll();
    }

    @Override
    public void saveAdmin(Admin admin) {
        adminRepo.save(admin);
    }

    @Override
    public void deteteAdmin(Integer id) {
        adminRepo.deleteById(id);
    }

    @Override
    public Optional<Admin> findAdminById(Integer id) {
        return adminRepo.findById(id);
    }
}
