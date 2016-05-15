/**
 * 
 */
package controllerWebApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Gaston Maron
 *
 */
@Controller
public class AutoRepController {



		@Autowired
		private WebApplicationContext webAppContext;
		
		private static int counter = 0;	
		private static final String VIEW_INDEX = "index";
		private final static LocalDateTime startDateTime = LocalDateTime.now();
		private final static DateTimeFormatter DT_FORMATTER =  DateTimeFormatter.ofPattern("EEE, d MMM yyyy h:mm a");
			
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String welcome(ModelMap model) {
			System.out.println("Llegue aca al menos");
			model.addAttribute("message", "Welcome");
			model.addAttribute("counter", ++counter);

			// Spring uses InternalResourceViewResolver and return back index.jsp
			return VIEW_INDEX;

		}
		
		
		
		@RequestMapping("/inicio")
		@ResponseBody
		public String infoTagServer(){
		return new StringJoiner("<br>")
			.add("-------------------------------------")
			.add(" Server: ")
			.add(" Start date: "+ startDateTime.format(DT_FORMATTER))
			.add(" Version: " + webAppContext.getBean("webAppVersion"))
			.add("---------------------------------------------------")
			.toString();
		}
		
		@RequestMapping("/helloHandler")
		@ResponseBody
		public String helloController(){
			return "hello";
		}

}
