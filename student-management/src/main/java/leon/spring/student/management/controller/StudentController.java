package leon.spring.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import leon.spring.student.management.entity.Student;
import leon.spring.student.management.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.findAll());
		return "student-list";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("mode", "Add");
		return "student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(Model model, @RequestParam("studentId") int id) {
		model.addAttribute("student", studentService.findById(id));
		model.addAttribute("mode", "Update");
		return "student-form";
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestParam("id") int id, @RequestParam("first_name") String firstName,
			@RequestParam("last_name") String lastName, @RequestParam("course") String course, @RequestParam("country") String country) {
		Student student = null;
		if (id == 0) {
			student = new Student(firstName, lastName, course, country);
		} else {
			student = studentService.findById(id);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setCourse(course);
			student.setCountry(country);
		}
		studentService.save(student);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int id) {
		studentService.deleteById(id);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/403")
	public String showErrorPage() {
		return "403";
	}
}
