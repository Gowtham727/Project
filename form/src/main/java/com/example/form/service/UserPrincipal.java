package com.example.form.service;

import com.example.form.entity.Form;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserPrincipal implements UserDetails {
    private final Form forms;
    public UserPrincipal(Form form){
        this.forms=form;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_STUDENT"));
    }

    @Override
    public String getPassword() {
        return forms.getPassword();
    }

    @Override
    public String getUsername() {
        return forms.getUsername();
    }
}
