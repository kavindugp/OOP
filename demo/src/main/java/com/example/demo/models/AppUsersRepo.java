package com.example.demo.models;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

public interface AppUsersRepo extends CrudRepository<AppUsers, Integer>{
	

}
