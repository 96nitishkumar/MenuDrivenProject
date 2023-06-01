package com.students.manage;

public class Student {
	private int id ;
	private String name;
	private String mobno;
	private int age;
	
	public Student(int id, String name, String mobno, int age) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.age = age;
	}
	
	public Student(String name, String mobno, int age) {
		super();
		this.name = name;
		this.mobno = mobno;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobno=" + mobno + ", age=" + age + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getMobno()=" + getMobno() + ", getAge()=" + getAge() + "]";
	}

}
