package com.example.model.controller;

import com.example.model.ProductDto;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class ProductTag extends SimpleTagSupport {
    private ProductDto productDto;

    public void setMessage(ProductDto msg){
        this.productDto =   msg;
    }

    StringWriter sw = new StringWriter();

    public void doTag()
            throws JspException, IOException{
        if (productDto != null){
            JspWriter out = getJspContext().getOut();
            out.println( String.format( "<div><h1>%s</h1><p>%s</p><hr/></div>", productDto.getName(), productDto.getPrice()));
        }else {
            getJspBody().invoke(sw);
            getJspContext().getOut().println(sw.toString());
        }
    }
}
