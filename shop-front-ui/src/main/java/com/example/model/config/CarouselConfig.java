package com.example.model.config;

import java.util.List;

public class CarouselConfig {
    String title;
    List<CarouselSlide> slides;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CarouselSlide> getSlides() {
        return slides;
    }

    public void setSlides(List<CarouselSlide> slides)  {
        this.slides = slides;
    }
}
