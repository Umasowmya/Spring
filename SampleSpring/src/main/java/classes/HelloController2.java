package classes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HelloController2 {

    @RequestMapping("/")
    public String showPage() {
        return "main_menu";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "query_form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "query_form_process";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersion(@RequestParam("studentName") String name, Model model) {
        name=name.toUpperCase(Locale.ROOT);
        name= "Hey  "+name;
        model.addAttribute("message",name);
        return "query_form_process";
    }

}
