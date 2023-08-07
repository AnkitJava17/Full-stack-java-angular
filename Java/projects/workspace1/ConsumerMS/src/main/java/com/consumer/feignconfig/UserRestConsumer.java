package com.consumer.feignconfig;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.consumer.model.User;

@FeignClient(name="user-service")
public interface UserRestConsumer {
	
	@GetMapping("/user/v1/getAllUsers")
	public List<User> getAllUsers();
	
	@GetMapping("/user/v1/getUserbyid/{uid}")
	public List<User> getUserByIdHandler(@PathVariable int uid);
		
}
