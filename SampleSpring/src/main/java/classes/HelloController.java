package classes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "query_form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "query_form_process";
    }


    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request,Model model){
        String st = request.getParameter("studentName");
        st=st.toUpperCase(Locale.ROOT);
        st="Hi  "+st;
        model.addAttribute("message",st);
        return "query_form_process";

    }


    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
        name=name.toUpperCase(Locale.ROOT);
        name= "Hey  "+name;
        model.addAttribute("message",name);
        return "query_form_process";
    }

}
