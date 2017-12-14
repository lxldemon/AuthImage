package AuthImage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class PageController {

    @RequestMapping(value = "page",method = RequestMethod.GET)
    public String page(ModelMap modelMap){
        System.out.print("66666");
        modelMap.put("message","555");
        modelMap.put("time",new Date());
        modelMap.put("name","张三");
        return "index";
    }
}
