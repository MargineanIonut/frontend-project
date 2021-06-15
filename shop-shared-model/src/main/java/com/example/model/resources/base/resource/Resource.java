package com.example.model.resources.base.resource;

public class Resource {

    public enum Type{
        GLOBAL, SHOP_SPECIFIC, SHOP_CASCADE_THEME, SHOP_CASCADE_LANG
    }

    String name;
    String fileName;
    Type type;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
