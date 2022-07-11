package com.mfpe.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mfpe.model.ProjectManager;
import com.mfpe.model.ProjectManagerDetails;


@Service
public class ProjectManagerDetailsService implements UserDetailsService{
	

	@Autowired
	private ProjectManagerService projectManagerService;
	
	
	@Override
	public ProjectManagerDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		ProjectManagerDetails projectManagerDetails = null;
		ProjectManager projectManager = projectManagerService.getProjectManagerByUserName(username);
		if(projectManager!=null) {
			projectManagerDetails = new ProjectManagerDetails(projectManagerService
											.getProjectManagerByUserName(username));
		}
		
		return projectManagerDetails;
	}
	
}
