package sumit.springframework.SpringJokesApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sumit.springframework.SpringJokesApp.Services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	@RequestMapping({"/",""})
	public String showJoke(Model model)
	{
		model.addAttribute("joke",jokeService.getJoke());
		
		return "index";
	}
}
