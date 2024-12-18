package com.example.jobPosting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobPosting.Entity.User;

public interface JobPostingRepository extends JpaRepository<User,Long> {

}
