package com.example.model.resources.base;

import com.example.model.resources.base.info.SiteInfo;
import com.example.model.resources.base.resource.Resource;

public class ShopResource  {
    Resource resource;
    SiteInfo siteInfo;

    public ShopResource(Resource resource, SiteInfo siteInfo) {
        this.resource = resource;
        this.siteInfo = siteInfo;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public SiteInfo getSiteInfo() {
        return siteInfo;
    }

    public void setSiteInfo(SiteInfo siteInfo) {
        this.siteInfo = siteInfo;
    }

    @Override
    public String toString() {
        return "ShopResource{" +
                "resource=" + resource +
                ", siteInfo=" + siteInfo +
                '}';
    }
}
