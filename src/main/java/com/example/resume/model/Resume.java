package com.example.resume.model;

import java.util.List;

public class Resume {
    private String name;
    private String role;
    private String university;
    private String email;
    private String phone;
    private List<String> skills;
    private List<Experience> experience;
    private List<Project> projects;
    private List<String> interests;

    public Resume(String name, String role, String university, String email, String phone, List<String> skills, List<Experience> experience, List<Project> projects, List<String> interests) {
        this.name = name;
        this.role = role;
        this.university = university;
        this.email = email;
        this.phone = phone;
        this.skills = skills;
        this.experience = experience;
        this.projects = projects;
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
