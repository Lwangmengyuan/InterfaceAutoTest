package com.springboot.practice;

import com.java.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@RestController
@Api(value = "/",description = "post方法")
public class PostMethod {
    private static Cookie cookie;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String username,
                        @RequestParam(value = "password",required = true) String password){
        if(username.equals("lily") & password.equals("123456")){
            cookie = new Cookie("login","true");
            response.addCookie(cookie);
            return "登录成功";
        }
        return "用户名或密码错误，登录失败";
    }

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User user){
        Cookie[] cookies = request.getCookies();
        User u;
        if(Objects.isNull(cookies)){
            return "cookies信息验证失败";
        }
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("login") && cookie.getValue().equals("true")
            && user.getUserName().equals("lily") && user.getPassword().equals("123456")){
                u = new User();
                u.setName("jack");
                u.setAge(20);
                u.setSex("man");
                return u.toString();
            }
        }
        return "用户名或者密码错误，无法获取用户列表";
    }
}
