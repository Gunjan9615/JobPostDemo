package com.example.jobPosting.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jobPosting.Entity.User;
import com.example.jobPosting.Service.JobPostingService;

@Controller
@RequestMapping("/save")
public class JobPostingController {

    @Autowired
    private JobPostingService jpService;

    @GetMapping("/job_post")
    public String showJobPostForm(Model model) {
        model.addAttribute("user", new User());
        return "job_post";
    }

    @PostMapping("/job_post")
    public String handleJobPost(@Validated User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("message", "Please fill all required fields correctly.");
            return "job_post";
        }

        jpService.saveUser(user);
        model.addAttribute("message", "Job posted successfully!");
        return "job_post";
    }
}