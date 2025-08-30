package com.example.form.repository;

import com.example.form.Controller.UserNotFoundException;
import com.example.form.entity.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcConnection {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
   @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int post(Form form) {
        String query = "INSERT INTO form (username, password,physics,maths,chemistry) VALUES (?, ?,?,?,?)";

        return   jdbcTemplate.update(query,form.getUsername(),form.getPassword(),form.getPhysics(),form.getMaths(),form.getChemistry());
    }

    public List<Form>  get() {
        String query="select * from form";
      return   jdbcTemplate.query(query,new BeanPropertyRowMapper<>(Form.class));
    }

    public Form  getbyid(String password) {
        try {
            String query = "select * from form where password = ? ";
            return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Form.class), password);
        } catch (DataAccessException e) {
            throw new UserNotFoundException("not found "+e);
        }

    }

    public void store(Form form) {
        String query="insert into form(username, password,physics,maths,chemistry) values (?, ? ,? ,?,?) ";
        jdbcTemplate.update(query,form.getUsername(),form.getPassword(),form.getPhysics(),form.getMaths(),form.getChemistry());
    }
}
