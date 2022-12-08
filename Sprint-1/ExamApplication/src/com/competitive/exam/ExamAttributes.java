package com.competitive.exam;

public class ExamAttributes {
	private Integer course_id;
	private String course_name;
	private String course_teacher;
	private Integer course_duration;
	private Integer total_fees;

	public ExamAttributes(Integer course_id, String course_name, String course_teacher, Integer course_duration,
			Integer total_fees) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_teacher = course_teacher;
		this.course_duration = course_duration;
		this.total_fees = total_fees;
	}

	public Integer getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_teacher() {
		return course_teacher;
	}

	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}

	public Integer getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(Integer course_duration) {
		this.course_duration = course_duration;
	}

	public Integer getTotal_fees() {
		return total_fees;
	}

	public void setTotal_fees(Integer total_fees) {
		this.total_fees = total_fees;
	}

	@Override
	public String toString() {
		return course_id + "\t" + course_name + "\t" + course_teacher + "\t" + course_duration + "\t" + total_fees
				+ "\n";
	}

}
