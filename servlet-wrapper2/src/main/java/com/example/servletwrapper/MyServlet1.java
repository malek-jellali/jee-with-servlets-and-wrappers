package com.example.servletwrapper;
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class MyServlet1 extends GenericServlet
{
    public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        System.out.println ("Servlet is called");
        Locale loc = response.getLocale ();
        out.println ("Locale set for this application is " + loc.toString ());
    }
}