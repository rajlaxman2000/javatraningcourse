package jsp.custom.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;



public class Sample extends SimpleTagSupport {

	private Integer num;
	
	public void doTag() throws JspException, IOException {
		
		JspWriter out = getJspContext().getOut();
		String value = "";
		//Integer x =  new Integer(num);
		switch(num.intValue()){
		case 1: 
			value = "One";
			break;
		case 2: 
			value = "Two";
			break;
		case 3: 
			value = "Three";
			break;
		case 4: 
			value = "Four";
			break;
		case 5: 
			value = "Five";
			break;
		default:
			value ="cant accomidate more as now";
		}
		out.println(num+" value is ::"+value);
	}

	/**
	 * @return the num
	 */
	public Integer getNum() {
		return num;
	}


	/**
	 * @param num the num to set
	 */
	public void setNum(Integer num) {
		this.num = num;
	}


	

}
