package com.example.form.service;

import com.example.form.entity.Form;
import com.example.form.repository.JdbcConnection;
import com.example.form.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formservice {

    @Autowired
    JdbcConnection jdbc;
    @Autowired
    Repo repo;

    @Autowired
    PasswordEncoder passwordEncoder;
    public int post(Form form) {
     return    jdbc.post(form);

    }

    public List<Form> get() {
     return    jdbc.get();
    }

    public Form getbyid(String  password) { return jdbc.getbyid(password);
    }

    public List<Form> getall() {
       return  repo.getall();

    }

    public List<Object[]> getjoin(String username) {
       return  repo.getjoin(username);
    }

    public int getcount() {
      return   repo.getcount();
    }

    public int getmarks(String username) {
      return   repo.getmarks(username);
    }

    public List<Form> list() {
      return   repo.list();
    }

    public void submit(Form submit) {
       submit.setPassword(passwordEncoder.encode(submit.getPassword()));
       jdbc.store(submit);
    }
}
