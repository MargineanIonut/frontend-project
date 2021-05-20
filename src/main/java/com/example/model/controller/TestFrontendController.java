package com.example.model.controller;

import com.example.model.ProductDto;
import com.example.model.client.DatabaseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class TestFrontendController {

    @Autowired
    DatabaseClient databaseClient;

//    @GetMapping("/getAllProducts")
//    @ResponseBody
//    public ProductDto[] getAllProducts(){
//        return databaseClient.getProducts();
//    }



    @GetMapping("/getAllProducts")
    public String getAllProducts(Model model){
        model.addAttribute("listProducts", databaseClient.getProducts());
        return "form";
    }

    @GetMapping("/saveBook")
    public String saveBookForm(Model model){
        model.addAttribute("whatever", new ProductDto());
        return "form";
    }


}
