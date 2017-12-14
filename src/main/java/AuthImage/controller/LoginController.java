package AuthImage.controller;

import AuthImage.domain.Sys_user;
import AuthImage.service.SysUserService;
import AuthImage.util.Assert;
import AuthImage.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @Autowired
    private SysUserService sysUserService;


    @GetMapping("/login.html")
    private ModelAndView login(ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;

    }

    @PostMapping("/loginsubmit")
    private R loginsubmit(ModelMap modelMap,@RequestParam String username,
                          @RequestParam String password){

        Assert.isBlank(username,"登录名不能为空");
        Assert.isBlank(password,"登录密码不能为空");

        Sys_user sys_user = sysUserService.findByUsername("admin");
        System.out.println(sys_user.getPassword());

        System.out.println("username:"+username);
        System.out.println("password:"+password);
        R r = R.ok();
        return r;
    }
}
