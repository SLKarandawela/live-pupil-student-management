package com.tritonTech.studentManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
    @jakarta.persistence.Id
    private Integer Id;
    private String stdId;
    private String fName;
    private String lName;
    private String dept;
    private Boolean stdStatus;



    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String updatedOn;

    public Student() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    

    public Student(Integer id, String stdId, String fName, String lName, String dept, Boolean stdStatus, String updatedOn) {
        Id = id;
        this.stdId = stdId;
        this.fName = fName;
        this.lName = lName;
        this.dept = dept;
        this.stdStatus = stdStatus;
        this.updatedOn = updatedOn;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Boolean getStdStatus() {
        return stdStatus;
    }

    public void setStdStatus(Boolean stdStatus) {
        this.stdStatus = stdStatus;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", stdId='" + stdId + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", dept='" + dept + '\'' +
                ", stdStatus=" + stdStatus +
                ", updatedOn='" + updatedOn + '\'' +
                '}';
    }
}
