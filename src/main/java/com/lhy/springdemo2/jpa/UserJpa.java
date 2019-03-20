package com.lhy.springdemo2.jpa;

import com.lhy.springdemo2.entiy.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface UserJpa extends JpaRepository<User,Long> ,JpaSpecificationExecutor<User>,Serializable{
}
