package edu.ssafy.controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
* Handles requests for the application home page.
*/
@Controller
public class HomeController {
    @RequestMapping(value= {"/test","/test2"})
    public String test(Model m) {
        m.addAttribute("res","Hello Test");
        return "test";
    }
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @RequestMapping("testmv")
    public ModelAndView testModel(ModelAndView mv) {
    	mv.addObject("res", "6번누르기");
    	mv.setViewName("test");
    	return mv;
    }
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model,HttpServletRequest req,HttpServletResponse res) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        
        String formattedDate = dateFormat.format(date);
        
        model.addAttribute("serverTime", formattedDate );
        
        return "home";
    }
    
}