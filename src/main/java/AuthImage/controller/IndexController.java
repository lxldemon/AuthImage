package AuthImage.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {


    @RequestMapping("/index.html")
    private ModelAndView index(ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView("index");
        modelMap.put("name","lily");
        return modelAndView;
    }
}
