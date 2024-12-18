package com.example.jobPosting.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jobPosting.Entity.User;
import com.example.jobPosting.Repository.JobPostingRepository;

@Service
public class JobPostingService {

    @Autowired
    private JobPostingRepository jobRepository;

    public User saveUser(User user) {
    	
    	 if (user.getTitle() == null || user.getTitle().isEmpty()) {
 	        user.setTitle("Not Specified"); // Default value
 	    }
    	 if (user.getLocation() == null || user.getLocation().isEmpty()) {
 	        user.setLocation("Not Specified"); // Default value
 	    }
    	  
    	if (user.getCategory() == null || user.getCategory().isEmpty()) {
            user.setCategory("General"); // Default category
        }
        if (user.getEmploymentType() == null || user.getEmploymentType().isEmpty()) {
            user.setEmploymentType("Full-Time"); // Default employment type
        }
        if (user.getWorkModel() == null || user.getWorkModel().isEmpty()) {
	        user.setWorkModel("Not Specified"); // Default value
	    }
        if (user.getExperience() == null || user.getExperience().isEmpty()) {
	        user.setExperience("Not Specified"); // Default value
	    }
        if (user.getSalary() == null || user.getSalary().isEmpty()) {
	        user.setSalary("Not Specified"); // Default value
	    }
        return jobRepository.save(user);
    }
}