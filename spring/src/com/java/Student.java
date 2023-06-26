package com.java;

public class Student {

  private String name;

  private int enrollment_no;

  public String getName() {

    return this.name;
  }

  public void setName(String Name) {

    this.name = this.name;
  }

  public int enrollment_no() {

    return this.enrollment_no;

  }

  public void setEnrollment_no() {

    this.enrollment_no = this.enrollment_no;

  }

  @Override
  public String toString() {

    return "Student[name=" + this.name + ",enrollment_no=" + this.enrollment_no + "]";

  }

}
