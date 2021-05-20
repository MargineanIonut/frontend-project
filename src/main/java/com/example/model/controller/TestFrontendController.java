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


    @GetMapping("/getAllProducts")
    public String getAllProducts(Model model){
        List<ProductDto> productDtoList= Arrays.asList(databaseClient.getProducts());
        model.addAttribute("productDtoListAtr", productDtoList);
        return "index";
     }

    @GetMapping("/saveProduct")
    public String saveProductForm(Model model){
        model.addAttribute("dto", new ProductDto());
        return "form";
    }

    @PostMapping("/save")
    public String saveProductPost(@ModelAttribute("dto") ProductDto productDto ){
        databaseClient.saveProducts(productDto);
        return "index";
    }

}
