package com.student.management.model;



import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private String email;
    private String phone;
    private String roll;
    private String course;
    private String section;
    private Integer grade;
    private String status;
    

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(Long id, String name, String department,
                   String email, String phone, String roll,String course,String section,
                   int grade,String status) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.roll=roll;
        this.course=course;
        this.section=section;
        this.grade=grade;
        this.status=status;
    }

    // Getters and Setters

    public String getRoll() {
		return roll;
	}

	public String getCourse() {
		return course;
	}

	public String getSection() {
		return section;
	}

	public Integer getGrade() {
		return grade;
	}

	public String getStatus() {
		return status;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
}