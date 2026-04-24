package com.example.resume.model;

import java.util.List;

public class Resume {
    private String name;
    private String role;
    private String university;
    private List<String> skills;
    private List<Experience> experience;
    private List<Project> projects;
    private List<String> interests;

    public Resume(String name, String role, String university, List<String> skills, List<Experience> experience, List<Project> projects, List<String> interests) {
        this.name = name;
        this.role = role;
        this.university = university;
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
