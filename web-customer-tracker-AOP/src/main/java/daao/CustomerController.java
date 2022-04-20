package daao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springdemo.entity.Customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;
    @RequestMapping("/list")

    public String customerList(Model theModel){
        List<Customer> customers = customerService.getCustomers();
        theModel.addAttribute("customers",customers);
        return "customer-list";
    }

    @RequestMapping("/ShowFormForAdd")
    public String showFormForAdd(Model theModel){
        Customer customer = new Customer();
        theModel.addAttribute("customer",customer);
        return "customer-add";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @RequestMapping("/CustomerFormForUpdate")
    public String customerFormForUpdate(@RequestParam("customerId") int theId, Model theModel){
        Customer customer = customerService.updateCustomer(theId);
        theModel.addAttribute("customer",customer);
        return "customer-add";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("customerId") int id){
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }

}
