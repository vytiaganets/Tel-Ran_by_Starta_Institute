package de.telran.bank.account;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/accounts")
//@Controller
public class AccountController {
    @GetMapping()
    //@RequestMapping(value = "/account", method = RequestMethod.GET)
    //@ResponseBody
    public String accountInfo()

    {
        //AccountController.class
        return "I'm some account";
    }
}