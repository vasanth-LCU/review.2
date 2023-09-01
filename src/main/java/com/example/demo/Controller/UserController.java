package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserDetails;
import com.example.demo.Service.UserService;
 
@RestController
public class UserController {
@Autowired
UserService uss;
@PostMapping("addDetails")
public UserDetails addDetail(@RequestBody UserDetails ud) {
	return uss.saveInfo(ud);
}
@GetMapping("showDetails")
public List<UserDetails> showDetail(){
	return uss.showInfo();
}
} 