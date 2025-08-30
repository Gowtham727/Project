package com.example.form.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Form {
    @Id
    private String username;
    private String password;
    private int physics;
    private int maths;
    private int chemistry;

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public Form(String username, String password, int physics, int maths, int chemistry) {
        this.username = username;
        this.password=password;
        this.physics=physics;
        this.maths=maths;
        this.chemistry=chemistry;
    }
    Form(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public Object setPassword(String password) {
        this.password = password;
        return null;
    }
}
