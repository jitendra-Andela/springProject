package com.susmitha.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.susmitha.model.User;
import com.susmitha.repository.UserRepository;

@Service
@Transactional
public class UserService 
{
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository)
	{
		this.userRepository = userRepository;
		
	}
	
 public void saveMyUser(User user) {
	userRepository.save(user);
 }
}
