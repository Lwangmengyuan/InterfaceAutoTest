package com.springboot.practice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/",description = "get方法")
public class GetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        //HttpServletRequest：装请求信息的类
        //HttpServletResponse：装响应信息的类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "成功获取cookies";
    }

    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "必须携带cookies才能成功访问",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "必须携带cookies才能访问成功";
        }
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "cookies验证通过，访问成功";
            }
        }
        return "cookies验证不通过，访问成失败";
    }

    @RequestMapping(value = "get/with/param/method1",method = RequestMethod.GET)
    @ApiOperation(value = "通过方法1可以获取商品列表",httpMethod = "GET")
    public Map<String,Integer> getWithParamMethod1(@RequestParam Integer start,@RequestParam Integer end){
        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("毛呢大衣",1000);
        mylist.put("小浣熊",1);
        mylist.put("臭豆腐",10);
        return mylist;
    }

    @RequestMapping(value = "get/with/param/method1/{start}/{end}",method = RequestMethod.GET)
    @ApiOperation(value = "通过方法2可以获取商品列表",httpMethod = "GET")
    public Map<String,Integer> getWithParamMethod2(@PathVariable Integer start,@PathVariable Integer end){
        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("毛呢大衣",1000);
        mylist.put("小浣熊",1);
        mylist.put("臭豆腐",10);
        return mylist;
    }
}
