package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public boolean removeStudent(int id) {

        Student student = getStudentById(id);

        if (student == null) {
            return false;
        }

        students.remove(student);
        return true;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}