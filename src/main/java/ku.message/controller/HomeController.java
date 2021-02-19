package ku.message.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String getHomePage(Model model, @AuthenticationPrincipal OAuth2User principal)
	{
		if (principal == null)
		{
			model.addAttribute("authenticated", false);
		}
		else
		{
			model.addAttribute("authenticated", true);
			model.addAttribute("user", principal.getAttribute("name"));
		}

		model.addAttribute("greeting", "Hello");

		return "home";
	}
}
