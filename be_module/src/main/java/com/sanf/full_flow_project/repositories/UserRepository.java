package com.sanf.full_flow_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanf.full_flow_project.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
