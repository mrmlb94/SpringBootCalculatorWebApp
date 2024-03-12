package com.mrmlb.SpringBootWeb001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; // Import this
import jakarta.servlet.http.HttpSession;   

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

    @RequestMapping("add")
    public String calculate(
           @RequestParam("num1") int num1,
           @RequestParam("num2") int num2,
           @RequestParam("operator") String operator,
           HttpSession session
    ) {
        int result = 0; 

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default: 
                return "result.jsp"; // Handle invalid operator directly 
        }

        session.setAttribute("result", result);
        return "result.jsp";
    }
}
