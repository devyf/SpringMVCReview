package com.fengye.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/11 16:08
 */
@Controller
@RequestMapping("/restful")
public class RestfulController {
    @RequestMapping("/insert/{id}")
    public String insertUserById(@PathVariable(value = "id") int idVal, Model model){
        model.addAttribute("msg", "插入的id值是：" + idVal);
        return "insert";
    }

    @PostMapping("/insert")
    public void insert(@RequestParam(value = "username") String username, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(username);
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(username);
    }
}
