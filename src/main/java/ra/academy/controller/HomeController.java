package ra.academy.controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.academy.modal.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/change")
    public String change(@RequestParam("money") double money, Model model) {
        double result = money * 24290.5;
        model.addAttribute("out", result);
        return "chyendoi";
    }

    @GetMapping("/dictionary")
    public String dic(){
        return "dictionary";
    }

    @GetMapping("/dic")
    public String dictionary(@RequestParam("TA") String TA, Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("pen", "bút");
        map.put("table", "bàn");
        map.put("chair", "ghế");
        map.put("shirt", "áo");
        map.put("nocturnal", "về đêm");
        map.put("champion", "vô địch");
        model.addAttribute("output", map.getOrDefault(TA, "Không tồn tạo từ vựng"));
        return "dictionary";
    }

    @PostMapping("/add")
    public String profile(@RequestParam("name") String name,
                          @RequestParam("gender") boolean gender,
                          @RequestParam("age") int age,
                          @RequestParam("birthday") String birthday
            , Model model) {
        Person p = new Person();
        p.setAge(age);
        p.setName(name);
        p.setGender(gender);
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = dateFormat.parse(birthday);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            p.setBirthday(date);
        }
        model.addAttribute("birthday", birthday);
        model.addAttribute("p", p);
        return "profile";
    }

    @GetMapping("/about")
    public String about(
            Model model
    ) {
        return "about";
    }
}

