package com.ecomapp.ecomapp.controller.admincontroller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class ProductController {

    @GetMapping
    public String showHome(){
        return "admin/product/product";
    }
}
