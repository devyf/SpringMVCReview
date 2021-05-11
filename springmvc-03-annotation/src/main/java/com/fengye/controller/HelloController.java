package com.fengye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:  springmvc注解方式实现步骤：
 * 1.新建一个web项目，
 * 2.导入相关jar包依赖
 * 3.编写web.xml，注册DispatcherServlet
 * 4.编写springmvc配置文件
 * 5.创建对应controller控制类
 * 6.完善前端视图和controller之间的对应关系
 * 7.测试运行调试
 * @Author: huang
 * @Date: 2021/5/11 14:19
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        //向模型中添加属性msg与值，可以在jsp页面中取出来并渲染
        model.addAttribute("msg", "hello springmvc annotation!");
        return "hello";  //会被视图解析器解析处理
    }
}
