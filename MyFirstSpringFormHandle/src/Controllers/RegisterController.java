package Controllers;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Model.Student;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		Student studentForm = new Student();
		model.put("studentForm", studentForm);



		return "register";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(
			@ModelAttribute("studentForm") Student student,
			Map<String, Object> model) {

		// implement your own registration logic here...

		// for testing purpose:
		System.out.println("studentname: " + student.getStudentName());

		System.out.println("email: " + student.getEmail());
		System.out.println("age: " + student.getAge());

		return "RegistrationSuccess";
	}
}
