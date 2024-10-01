package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    private final static List<Course> courses = new ArrayList<>();

    static {
        Course java = new Course("Java Programming", "Java");
        Course python = new Course("Python Programming", "Python");
        Course php = new Course("PHP Programming", "PHP");
        Course html = new Course("HTML Programming", "HTML");
        courses.add(java);
        courses.add(python);
        courses.add(php);
        courses.add(html);
    }


    public static void main(String[] args) {
        Student ngVanA = new Student("Nguyen Van Nam", 18, courses);
        Course java = new Course("Hoc Java", "Java");
        Course jsp = new Course("JSP Programming", "JSP");
        registerCourse(ngVanA, java);
        registerCourse(ngVanA, jsp);
        // Tạo method đăng ký thêm khóa học cho đối tượng ngVanA
        // Yêu cầu nếu khóa học trùng mã (code) với các khóa học đã sẵn trong đối tượng in ra : Course is exist
        // Nếu mã khóa học chưa tồn tại cho phép add thêm vào List<Course> và in ra: Add success
    }

    public static void registerCourse(Student student,Course course) {
        List<Course> lstCourseExist = student.getCourses();
        boolean isExist = false;
        for (Course c : lstCourseExist) {
            if (c.getCode().equals(course.getCode())) {
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            lstCourseExist.add(course);
            System.out.println("Add success");
        } else {
            System.out.println("Course is exist");
        }
    }

}