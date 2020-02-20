package com.hcling.gr.hackathon.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcling.gr.hackathon.model.User;

/**
 * The interface User repository.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    /**
     * Find by login name optional.
     *
     * @param login_name the login name
     * @return the optional
     */
    public Optional<User>  findByLoginName(String login_name);
}
