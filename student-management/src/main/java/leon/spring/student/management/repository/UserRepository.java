package leon.spring.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import leon.spring.student.management.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUsername(String username);

}
