package com.hcling.gr.hackathon.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcling.gr.hackathon.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
 
	public Optional<User>  findByLoginName(String login_name);
}
