package com.example.servlets;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
@WebServlet("/MyServlet1")
public class MyServlet1 extends GenericServlet
{
    public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        String name = request.getParameter ("username");
        PrintWriter out = response.getWriter ();
        out.println (name);
    }
}