package com.example.RegisterUser.service;

import com.example.RegisterUser.model.RgUser;
import com.example.RegisterUser.repository.RgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RgService {

    @Autowired
    private RgRepository repo;

    public List<RgUser> listAll() {
        return repo.findAll();
    }

    public void save(RgUser user) {
    	user.setDateCreated(LocalDate.now());
        repo.save(user);
    }

    public RgUser get(int id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
