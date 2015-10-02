package signup.web;




import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import signup.domain.Users;
import signup.services.AboutService;
import signup.services.UserValidator;


@Controller
@RequestMapping("/users")

public class UserRegistrationController {

	@Autowired
	private AboutService registrationService;
	@Autowired
	private UserValidator userValidator;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveNewUser ( @ModelAttribute("users") Users users, BindingResult result ) {

try{
		userValidator.validate(users, result);
		 if (result.hasErrors()) { 
			 return  new ModelAndView( "userAdd"); 
			 
		 } 
		registrationService.addUser(users);
		ModelAndView successModel = new ModelAndView("redirect:/");
		Map parameters = new HashMap();
		parameters.put("saveSuccessful", new Boolean(true));
		parameters.put("uName", users.getuName());
		parameters.put("uPWord", users.getuPWord());
		parameters.put("uConPWord", users.getuConPWord());
		parameters.put("uEMail", users.getuEMail());
		successModel.addAllObjects(parameters);
		return successModel;
}catch (Exception ex){}

	return null;	
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView viewEvents() {
		
		return new ModelAndView ( "userAdd");
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addUser() {
		return new ModelAndView ( "userAdd" );
	}
	@ModelAttribute("users")

	public Users formBackingObject() {

	    return new Users();

	}

}
