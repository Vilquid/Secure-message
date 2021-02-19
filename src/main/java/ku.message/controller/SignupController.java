package ku.message.controller;

import ku.message.model.User;
import ku.message.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignupController
{
	@Autowired
	private UserService userService;

	@GetMapping()
	public String signupView()
	{
		return "signup";
	}

	@PostMapping()
	public String signupUser(@ModelAttribute User user, Model model)
	{
		String signupError = null;

		if (!userService.isUsernameAvailable(user.getUsername()))
		{
			signupError = "The username already exists.";
		}

		if (signupError == null)
		{
			int rowsAdded = userService.createUser(user);

			if (rowsAdded < 0)
			{
				signupError = "There was an error signing you up. Please try again. ";
			}
		}

		if (signupError == null)
		{
			model.addAttribute("signupSuccess", true);
		}

		else
		{
			model.addAttribute("signupError", signupError);
		}

		return "signup";
	}
}