package com.deepak.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud_details")
public class Student
{
	@Id
	private Integer id;
	private String name;
	private Double hindi;
	private Double telugu;
	private Double english;
	private Double maths;
	private Double science;
	private Double social;
	private Double total_marks;
	private Double average;
	private String grade;
	public Student() {
		super();
	}
	public Student(Integer id, String name, Double hindi, Double telugu, Double english, Double maths, Double science,
			Double social, Double total_marks, Double average, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.hindi = hindi;
		this.telugu = telugu;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.total_marks = total_marks;
		this.average = average;
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHindi() {
		return hindi;
	}
	public void setHindi(Double hindi) {
		this.hindi = hindi;
	}
	public Double getTelugu() {
		return telugu;
	}
	public void setTelugu(Double telugu) {
		this.telugu = telugu;
	}
	public Double getEnglish() {
		return english;
	}
	public void setEnglish(Double english) {
		this.english = english;
	}
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getScience() {
		return science;
	}
	public void setScience(Double science) {
		this.science = science;
	}
	public Double getSocial() {
		return social;
	}
	public void setSocial(Double social) {
		this.social = social;
	}
	public Double getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(Double total_marks) {
		this.total_marks = total_marks;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hindi=" + hindi + ", telugu=" + telugu + ", english="
				+ english + ", maths=" + maths + ", science=" + science + ", social=" + social + ", total_marks="
				+ total_marks + ", average=" + average + ", grade=" + grade + "]";
	}
	
	

}
