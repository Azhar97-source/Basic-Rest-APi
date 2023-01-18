package com.zensar.careersolutionswebservice.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 

@Entity
public class Job {

 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jobId;

 

    private String compName;
    private String description;
    private String designation;
    private int experiance;
    private String location;
    private String salary;

 

    
    
    public Job() {
        super();
    }
    public Job(int jobId, String compName, String description, String designation, int experiance, String location,
            String salary) {
        super();
        this.jobId = jobId;
        this.compName = compName;
        this.description = description;
        this.designation = designation;
        this.experiance = experiance;
        this.location = location;
        this.salary = salary;
    }
    public int getJobId() {
        return jobId;
    }
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
    public String getCompName() {
        return compName;
    }
    public void setCompName(String compName) {
        this.compName = compName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getExperiance() {
        return experiance;
    }
    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Job [jobId=" + jobId + ", compName=" + compName + ", description=" + description + ", designation="
                + designation + ", experiance=" + experiance + ", location=" + location + ", salary=" + salary + "]";
    }

 

    
    
    
    
    
    
    
    
    
    
    
}