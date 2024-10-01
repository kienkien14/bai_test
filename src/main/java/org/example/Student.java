package org.example;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Course> courses;

    public Student(String name, int age, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void registerCourse(Course course) {
        boolean exists = courses.stream()
                .anyMatch(c -> c.getCode().equals(course.getCode()));

        if (exists) {
            System.out.println("Course is exist");
        } else {
            courses.add(course);
            System.out.println("Add success");
        }
    }
}
