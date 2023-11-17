package ra.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String calculate(Model model){
        model.addAttribute("result");
        return "calculate";
    }
    @GetMapping("/calculatting")
    public String calculatting(Model model,
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2,
            @RequestParam("op") String op)
    {
        double result = 0;
        switch(op){
            case "plus":
                 result = num1+num2;
                 break;
            case "minus":
                result = num1-num2;
                break;
            case "multiply":
                result = num1*num2;
                break;
            case "divison":
                result = (double) num1 /num2;
                break;
        }
        model.addAttribute("result",result);
        model.addAttribute("num1",num1);model.addAttribute("num2",num2);
        return "calculate";
    }

}
