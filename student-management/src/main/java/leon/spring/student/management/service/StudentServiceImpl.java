package leon.spring.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leon.spring.student.management.entity.Student;
import leon.spring.student.management.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);

	}

}
