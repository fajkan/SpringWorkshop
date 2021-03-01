package se.lexicon.service;

import org.springframework.beans.factory.annotation.Autowired;
import se.lexicon.data_access.StudentDao;
import se.lexicon.models.Student;
import se.lexicon.util.UserInputService;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {

    UserInputService scannerService;

    StudentDao studentDao;

    @Autowired
    public void setScannerService(UserInputService scannerService) {
        this.scannerService = scannerService;
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        Student student = new Student();
        return student;
    }

    @Override
    public Student save(Student student) {

        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {


        return studentDao.find(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
