package demo.RegistrationForm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@GetMapping("/form")
	public String showForm() {
		return "form";
	}

	@PostMapping("/submit")
	public String submitForm(@RequestParam("name") String name, @RequestParam("email") String email, Model model) {
		// Here you can process the form data as you like. In this example we'll just
		// add it to a list and display it on a new page.

		List<List<String>> formData = new ArrayList<>();
		List<String> data = new ArrayList<>();
		data.add(name);
		data.add(email);
		formData.add(data);

		model.addAttribute("formData", formData);

		return "results";

	}
}
