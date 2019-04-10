package com.pqszl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 彭青松
 * @project xtone-framework
 * @company 成都信通信息技术有限公司
 * @date 2019/4/10 22:59
 * @description 描述当前类的用途
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public  String  testget(){
       return  "index00000";
    }
}
