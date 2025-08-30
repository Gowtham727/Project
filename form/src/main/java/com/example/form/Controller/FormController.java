package com.example.form.Controller;

import com.example.form.entity.Form;
import com.example.form.entity.FormSubmit;
import com.example.form.service.Formservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://127.0.0.1:5500","http://localhost:8080"})
@RestController

public class FormController {
    @Autowired
    Formservice formservice;
    @PostMapping("/formsubmit")
    public void posts(@RequestBody  Form submit){
        formservice.submit(submit);            //to submit the form
    }











































    














    @PostMapping("/post")
    public ResponseEntity<Integer> post(@RequestBody Form form){
       Integer user= formservice.post(form);
       return  new ResponseEntity<>(user, HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public List<Form> get(){
      return  formservice.get();
    }
    @GetMapping("/get/{password}")
    public ResponseEntity<Form> getbyid(@PathVariable String password){
        Form user= formservice.getbyid(password);
        return ResponseEntity.ok(user);

    }
    @GetMapping("/getall")
    public List<Form> getall(){
       return  formservice.getall();
    }
    @GetMapping("/getjoin")
    public List<Object[]> getjoin(@Param("username") String username){
      return   formservice.getjoin(username);

    }
    @GetMapping("/getcount")
    public int getcount(){
       return  formservice.getcount();
    }
    @GetMapping("/getmarks")
    public int getmarks(@Param("username") String username){
       return  formservice.getmarks(username);
    }
    @GetMapping("list")
    public List<Form> list(){
       return formservice.list();
    }
}
