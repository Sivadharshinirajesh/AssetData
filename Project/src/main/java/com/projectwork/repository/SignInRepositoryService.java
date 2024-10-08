package com.projectwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectwork.model.SignIn;
@Repository
public interface SignInRepositoryService extends JpaRepository<SignIn,Long> {

}
