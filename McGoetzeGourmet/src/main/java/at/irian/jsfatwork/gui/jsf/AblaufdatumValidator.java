package at.irian.jsfatwork.gui.jsf;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import at.irian.jsfatwork.gui.util.GuiUtil;

public class AblaufdatumValidator implements Validator {

	public static final String VALIDATOR_ID = "at.irian.Ablaufdatum";
	
	public AblaufdatumValidator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void validate(FacesContext context, UIComponent comp, Object value)
			throws ValidatorException {
		// TODO Auto-generated method stub
		Date date = (Date) value;
		if(date!=null){
			if(date.before(new Date())){
				FacesMessage msg = GuiUtil.getFacesMessage(
                        context, FacesMessage.SEVERITY_ERROR, "validateAblaufdatum.Message");
                throw new ValidatorException(msg);
			}
		}
	}

}
