package com.example.model.resources;

import com.example.model.resources.base.Lang;
import com.example.model.resources.base.ShopResource;
import com.example.model.resources.base.Theme;

public class MainPageConfigResource extends ShopResource {

    public MainPageConfigResource() {
        this.setFileName("main-page-config.json");
        this.setLang(Lang.EN);
        this.setTheme(Theme.BLUE);
    }
}
