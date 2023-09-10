package com.ecomapp.ecomapp.controller.admincontroller.inventory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/inventory")
public class InventoryController {

    @GetMapping
    public String showHome(){
        return "admin/inventory/inventory";
    }
}
