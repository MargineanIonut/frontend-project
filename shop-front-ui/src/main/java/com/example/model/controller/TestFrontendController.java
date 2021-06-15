package com.example.model.controller;

import com.example.model.config.FrontCaruselService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.ProductDto;
import com.example.model.client.DatabaseClient;
import com.example.model.client.StorageClient;
import com.example.model.config.CarouselConfig;
import com.example.model.config.ShopSpecification;
import com.example.model.config.ShopSpecificationConfiguration;
//import com.example.model.resources.MainPageConfigResource;
//import com.example.model.resources.ResourceService;
//import com.example.model.resources.ShopSpecificationResource;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class TestFrontendController {



//    @Autowired
//    DatabaseClient databaseClient;
//
      @Autowired
      StorageClient storageClient;

      @Autowired
    FrontCaruselService frontCaruselService;
//    @Autowired
//    ResourceService resourceService;
//
    @GetMapping("")
    public String test(Model model, HttpServletRequest request) throws IOException {

        frontCaruselService.getResourceByShop("enbl");

//        String shopCode = "";
//        String resourceName = "";
//
//        storageClient.readResource(resourceName, shopCode);
//
//        Gson gson = new Gson();
//        String serverName = request.getServerName();
//        String shopCode = serverName.split("\\.")[0];
//        System.out.println(shopCode);
//        String shopSpecifJson = resourceService.readResource(new ShopSpecificationResource());
//        ShopSpecificationConfiguration configuration = gson.fromJson(shopSpecifJson, ShopSpecificationConfiguration.class);
//        ShopSpecification shop = configuration.findByShopCode(shopCode);
//
//        MainPageConfigResource resource = new MainPageConfigResource();
//        resource.setTheme(shop.getTheme());
//        resource.setLang(shop.getLang());
//
//        String json = resourceService.readResource(resource);
//        model.addAttribute("config", gson.fromJson(json, CarouselConfig.class));
        return "home";
    }
//
//    @GetMapping("/getAllProducts")
//    public String getAllProducts(Model model) {
//        List<ProductDto> productDtoList = Arrays.asList(databaseClient.getProducts());
//        model.addAttribute("productDtoListAtr", productDtoList);
//        return "index";
//    }
//
//    @GetMapping("/saveProduct")
//    public String saveProductForm(Model model) {
//        model.addAttribute("dto", new ProductDto());
//        return "form";
//    }
//
//    @PostMapping("/save")
//    public String saveProductPost(@ModelAttribute("dto") ProductDto productDto) {
//        databaseClient.saveProducts(productDto);
//        return "index";
//    }
}
