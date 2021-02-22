package se.lexicon.data_access;

import se.lexicon.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoListImpl implements StudentDao{
    List<Student> students = new ArrayList<Student>();

    @Override
    public Student save(Student student) {
        Student original = find(student.getId());
        original.setId(student.getId());
        original.setName(student.getName());
        return student;
    }

    @Override
    public Student find(int id) {

        return students.stream().filter(Student -> Student.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {
        students.removeIf(student -> student.getId()==id);
    }
}
