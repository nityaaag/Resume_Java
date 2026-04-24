package com.example.resume.controller;

import com.example.resume.model.Experience;
import com.example.resume.model.Project;
import com.example.resume.model.Resume;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ResumeController {

    @GetMapping("/")
    public String getResume(Model model) {
        List<String> skills = Arrays.asList("Java", "Spring Boot", "C++", "JavaScript", "HTML/CSS", "Next.js");
        List<Experience> experiences = Arrays.asList(
                new Experience("Intern", "Urja Global"),
                new Experience("Head of Advocacy Cohort", "CSA")
        );
        List<Project> projects = Arrays.asList(
                new Project("MeraMoney", "Expense Tracker"),
                new Project("Library Management System", ""),
                new Project("Resume Website", "")
        );
        List<String> interests = Arrays.asList("Coding", "Acting", "Dancing", "Debate");

        Resume resume = new Resume(
                "Nitya Gupta",
                "BCA Student | Developer | NCC Cadet",
                "Christ University, Pune",
                skills,
                experiences,
                projects,
                interests
        );

        model.addAttribute("resume", resume);
        return "index";
    }
}
