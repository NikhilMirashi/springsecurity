package com.productapp.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.productapp.model.AppUser;
import com.productapp.repository.IAppUserRepository;

@Service
public class AppUserServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		AppUser appUser = appUserRepository.findByUsername(username);
		System.out.println(appUser);
		GrantedAuthority aauthority = new SimpleGrantedAuthority("ADMIN");
		GrantedAuthority uathority = new SimpleGrantedAuthority("USER");
		Set<GrantedAuthority> authorities = new HashSet<>(Arrays.asList(aauthority, uathority));
		UserDetails userDetails = new User(appUser.getUsername(), appUser.getPassword(), authorities);
		System.out.println(userDetails);
		return userDetails;
	}

	// connecting to repository
	IAppUserRepository appUserRepository;

	@Autowired
	public void setAppUserRepository(IAppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}

	public void addUser(AppUser user) {
		appUserRepository.save(user);
	}
}
