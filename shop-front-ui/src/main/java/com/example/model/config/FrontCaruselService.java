package com.example.model.config;

import com.example.model.client.StorageClient;
import com.example.model.resources.base.resource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrontCaruselService {

    String RESOURCE_NAME = "config-resources";

    @Autowired
    StorageClient storageClient;

    public void getResourceByShop(String shopCode){
        storageClient.findResourceByNameAndShopCode(RESOURCE_NAME,shopCode);
    }
    }

