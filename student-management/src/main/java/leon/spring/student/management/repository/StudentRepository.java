package leon.spring.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import leon.spring.student.management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
