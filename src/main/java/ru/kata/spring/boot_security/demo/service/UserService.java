package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;


import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface UserService {
    User userById(long id);
    List<User> usersAll();
    User userAdd(User user);
    void userDelete(long id);
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    Set<Role> getRoles(String[] roles);
    User findByUserEmail(String email);
}