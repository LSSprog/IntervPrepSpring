package lss.spring.interview.service;

import lombok.RequiredArgsConstructor;
import lss.spring.interview.model.Student;
import lss.spring.interview.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student findStudentById(Long id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    public List<Student> showAllStudent() {
        List<Student> studentList = studentRepository.findAll().stream().collect(Collectors.toList());
        return studentList;
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student saveNewStudent(Student student) {
        Student newStudent = new Student();
        newStudent.setName(student.getName());
        newStudent.setAge(student.getAge());
        studentRepository.save(newStudent);
        return newStudent;
    }

    public Student updateStudent(Student student) {
        Student studentUpdate = studentRepository.findById(student.getId()).get();
        studentUpdate.setAge(student.getAge());
        studentUpdate.setName(student.getName());
        studentRepository.save(studentUpdate);
        return studentUpdate;
    }
}
