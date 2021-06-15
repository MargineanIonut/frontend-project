package com.example.model.config;

import java.util.List;

public class ShopSpecificationConfiguration {
    List<ShopSpecification> shops;

    public ShopSpecification findByShopCode(String shopCode){
        for (ShopSpecification shop : shops) {
            if (shop.getShopCode().equals(shopCode)){
                return shop;
            }
        }
        throw  new IllegalArgumentException("Missing shopcode");
    }
}
