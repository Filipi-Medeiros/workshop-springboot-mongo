package com.filipimedeiros.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filipimedeiros.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User bob = new User("1", "Bob Brown", "bob@gmail.com");
		User alex = new User("2", "Alex Green", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(bob, alex));
		return ResponseEntity.ok().body(list);
	}
}
