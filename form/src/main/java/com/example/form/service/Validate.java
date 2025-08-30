package com.example.form.service;

import com.example.form.Controller.UserNotFoundException;
import com.example.form.entity.Form;
import com.example.form.repository.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Validate implements UserDetailsService {
    @Autowired
    Repo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Form form = repo.findByUsername(username);
        if (form == null) {
            throw new UsernameNotFoundException("NOT FOUND " + username);
        }
       return  new UserPrincipal(form);
    }
}
