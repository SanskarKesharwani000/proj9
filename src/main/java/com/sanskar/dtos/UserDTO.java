package com.sanskar.dtos;

//  Data Transfer Object class to transfer data from view to controller and controller to service or vice versa.
public class UserDTO {

	private String name;
	private Integer age;
	private String college;
	private Float marks;

	public UserDTO() {
		super();
	}

	public UserDTO(String name, Integer age, String college, Float marks) {
		super();
		this.name = name;
		this.age = age;
		this.college = college;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + ", college=" + college + ", marks=" + marks + "]";
	}

}
