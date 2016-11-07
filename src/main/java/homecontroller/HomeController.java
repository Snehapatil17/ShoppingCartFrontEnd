package homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	
	public String gotoHome()
	{
		return "index1";
	}
	
	@RequestMapping("/login")
	public ModelAndView login()
	
	{
		ModelAndView mv=new ModelAndView ("index1");
		mv.addObject("isuserClickedlogin","true");
		
		return mv;
	}  
	@RequestMapping(value="/signin")
	public String sigin(Model model)
	
	{
		model.addAttribute("isuserClickedsignin","true");
		
		return"index1";
	}  
}

	
	
	

