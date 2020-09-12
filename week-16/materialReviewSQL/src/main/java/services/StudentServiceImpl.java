package services;

import model.Student;
import org.springframework.stereotype.Service;
import repositories.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studenRepository){
        this.studentRepository = studenRepository;

        studenRepository.save(new Student("Mike", "Llu", "m.l@Gmail.com"));
        studenRepository.save(new Student("Kim", "Lul", "k.kl@Gmail.com"));
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = this.studentRepository.findAll();
        return students;
    }

    public void changeEmail(Integer id){
        Student foundStudent = this.studentRepository.findById(id).get();
        foundStudent.setEmail("Your email is invalid");
    }
}
