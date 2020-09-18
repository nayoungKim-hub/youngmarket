package nyoung.youngmarket.controller;

import nyoung.youngmarket.domain.User;
import nyoung.youngmarket.model.UserModel;
import nyoung.youngmarket.service.CategoryService;
import nyoung.youngmarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping({"/","user/index"})
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "user/signup", method = RequestMethod.GET)
    public String signup(UserModel userModel, Model model) throws Exception{
        model.addAttribute("category", categoryService.findAll());
        return "user/signup";
    }
}
