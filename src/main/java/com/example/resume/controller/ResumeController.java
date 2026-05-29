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
                new Experience("IT Networking Intern", "Urja Global Limited", "Completed a 2-month internship focusing on network infrastructure optimization, diagnostic troubleshooting, and systems administration."),
                new Experience("Head of Advocacy Cohort", "CSA", "Leading a dedicated team of students to drive community impact through advocacy and structured outreach.")
        );
        List<Project> projects = Arrays.asList(
                new Project("Resume Website", "A modern, responsive resume portfolio application engineered with Thymeleaf and Spring Boot.", "https://github.com/nityaaag/Resume_Java"),
                new Project("NCC Companion", "A dedicated utility application designed to help streamline tracking, resources, and organization for NCC Cadets.", "https://github.com/nityaaag/NCC_COMPANION"),
                new Project("Smart Energy Monitor", "An intelligent platform tailored to track, log, and analyze real-time energy consumption profiles.", "https://github.com/tanishq-sa/SmartEnergyMonitor")
        );
        List<String> interests = Arrays.asList("Coding", "Acting", "Dancing", "Debate");

        Resume resume = new Resume(
                "Nitya Gupta",
                "BCA Student | Developer | NCC Cadet",
                "Christ University, Pune",
                "nityaaguptaa11@gmail.com",
                "9829766348",
                skills,
                experiences,
                projects,
                interests
        );

        model.addAttribute("resume", resume);
        return "index";
    }
}
