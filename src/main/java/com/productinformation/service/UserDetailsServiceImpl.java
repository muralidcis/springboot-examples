package com.productinformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.productinformation.model.MyUserDetails;
import com.productinformation.model.User;
import com.productinformation.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
		if(user == null  ) {
			throw new UsernameNotFoundException("Cannot find the user");
		}
		return new MyUserDetails(user);
	}
}
