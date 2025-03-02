package com.itzyh.pojo;

public class Staffs {
    private String JobID;
    private String Name;
    private String sex;
    private String birthday;
    private String department;
    private String role;
    private String password;
    @Override
    public String toString() {
        return "Staffs{" +
                "JobID=" + JobID +
                ", Name='" + Name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getJobID() {
        return JobID;
    }

    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
