package Controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Model.Student;
import Service.StudentService;
import Service.StudentServiceImpl;

@Controller
public class StudentController {


	private StudentService studentService = new StudentServiceImpl();


	/**
	 * Controll to save student
	 * 
	 * @param student
	 * @param result
	 * @return Model
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(
			@ModelAttribute("student") Student student, BindingResult result) {

		studentService.addStudent(student);

		return new ModelAndView("redirect:/add.html");
	}

	/**
	 * Control to list Students
	 * 
	 * @return Model
	 */
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ModelAndView listStudents() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students", studentService.listStudents());
		return new ModelAndView("studentsList", model);
	}


	/**
	 * Control to index / home
	 * 
	 * @return Model
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}

	/**
	 * control to delete an Student entry
	 * 
	 * @param id
	 * @param student
	 * @param result
	 * @return Model
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET,
			params = "id")
	public ModelAndView deleteStudent(@RequestParam("id") String id,
			@ModelAttribute("student") Student student, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		int studentId = Integer.parseInt(id);
		studentService.deleteStudent(studentId);
		model.put("students", studentService.listStudents());
		return new ModelAndView("addStudent", model);
	}

	/**
	 * control to add an Student entry
	 * 
	 * @param student
	 * @param result
	 * @return Model
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addStudent(@ModelAttribute("student") Student student,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students", studentService.listStudents());
		return new ModelAndView("addStudent", model);
	}

	/**
	 * control to edit Student Entry
	 * 
	 * @param id
	 * @param student
	 * @param result
	 * @return Model
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET, params = "id")
	public ModelAndView editStudent(@RequestParam("id") String id,
			@ModelAttribute("student") Student student, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		int studentId = Integer.parseInt(id);

		model.put("student", studentService.getStudent(studentId));
		return new ModelAndView("updateStudent", model);
	}

	/**
	 * Controll to update student
	 * 
	 * @param student
	 * @param result
	 * @return Model
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateStudent(
			@ModelAttribute("student") Student student, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		studentService.updateStudent(student);
		model.put("students", studentService.listStudents());
		return new ModelAndView("studentsList", model);
	}
}
