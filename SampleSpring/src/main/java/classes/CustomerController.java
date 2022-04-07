package classes;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Validated
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


    @RequestMapping("/showForm")
    public String showForm(Model theModel)
    {
        theModel.addAttribute("customer", new Customer());

        return "customer-form";

    }


    @RequestMapping("/processForm")
    public String processForm(@Valid  @ModelAttribute("customer") Customer theCustomer,BindingResult b)
    {

        System.out.println(b);
        System.out.println("Last name: |" + theCustomer.getLastName() + "|");
        if(b.hasErrors())
            return "customer-form";
        else
            return "customer-confirmation";

    }

}
