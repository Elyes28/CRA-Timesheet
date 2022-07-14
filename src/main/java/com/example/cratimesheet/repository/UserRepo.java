package com.example.cratimesheet.repository;

import com.example.cratimesheet.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}
