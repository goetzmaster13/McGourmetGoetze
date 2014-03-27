package at.irian.jsfatwork.validation;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ValidationException;

import at.irian.jsfatwork.gui.util.GuiUtil;

public class AblaufdatumValidator implements ConstraintValidator<Ablaufdatum, Date> {
	
	public static final String VALIDATOR_ID = "at.irian.Ablaufdatum";
	
	@Override
	public void initialize(Ablaufdatum ablaufdatum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value.before(new Date())){

			context.buildConstraintViolationWithTemplate("validateAblaufdatum.Message").addConstraintViolation();
			return false;
		} else
		{
			return true;
		}
		
	}

	
	

}
