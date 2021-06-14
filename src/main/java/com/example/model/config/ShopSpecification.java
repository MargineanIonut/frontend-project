package com.example.model.config;

import com.example.model.resources.base.Lang;
import com.example.model.resources.base.Theme;

public class ShopSpecification {
    Theme theme;
    Lang lang;
    String shopcode;

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getShopCode() {
        return shopcode;
    }

    public void setShopCode(String shopCode) {
        this.shopcode = shopCode;
    }
}
