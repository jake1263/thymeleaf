package com.moreas.demo.controller;

import com.moreas.demo.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {


    @RequestMapping("/base")
    public String base(Model model) {
        model.addAttribute("name", "张学友");

        String htmlContent = "<p style='color:red'> 红色文字</p>";
        model.addAttribute("htmlContent", htmlContent);

        Product currentProduct =new Product(5,"product e", 200);
        model.addAttribute("currentProduct", currentProduct);

        model.addAttribute("testBoolean", true);

        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a", 50));
        ps.add(new Product(4,"product d", 200));
        ps.add(currentProduct);
        ps.add(new Product(6,"product f", 200));
        model.addAttribute("ps", ps);

        Date now = new Date();
        model.addAttribute("now", now);
        return "base";
    }



}