package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserDetails;
import com.example.demo.Repository.UserDetailsRepo;

@Service
public class UserService {
UserDetailsRepo ur;
public UserDetails saveInfo(UserDetails ud) {
	return ur.save(ud);
}
public List<UserDetails> showInfo(){
	return ur.findAll();
}
} 