package signup.services;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import signup.domain.Users;

@RequestMapping("/users")
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class clazz) {
		//just validate the Customer instances
		return Users.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "uName",
				"required.username", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "uPWord",
			"required.password", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "uConPWord",
				"required.confirmPassword", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "uEMail",
				"required.username", "Field name is required.");
		
		Users users = (Users)target;
		
		if(!(users.getuPWord().equals(users.getuConPWord()))){
			errors.rejectValue("password", "notmatch.password");
		}
		
		
		
	}
	
}
