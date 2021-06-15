package com.example.model.controller;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class HelloTag extends SimpleTagSupport {
    private String message;

    public void setMessage(String msg){
        this.message = msg;
    }

    StringWriter sw = new StringWriter();

    public void doTag()
        throws JspException, IOException{
        if (message != null){
            JspWriter out = getJspContext().getOut();
            out.println( "Hello from custom tag: " + message );
        }else {
            getJspBody().invoke(sw);
            getJspContext().getOut().println(sw.toString());
        }
    }
}
