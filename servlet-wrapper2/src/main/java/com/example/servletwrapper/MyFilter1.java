package com.example.servletwrapper;
import java.io.*;
import javax.servlet.*;
public class MyFilter1 implements Filter
{
    public void init (FilterConfig filterConfig)
    {
    }

    public void destroy ()
    {
    }

    //This method is called each time a client requests for a web resource i.e. preprocessing request
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        out.println("<b> <i>Filter is filtering the response and passing it to Wrapper class</i> </b> <br/>");

        //Calling the constructor of response wrapper class 
        ResponseWrapper1 responseWrapper = new ResponseWrapper1 (response);

        //This method calls the next filter in the chain
        chain.doFilter (request, responseWrapper);
    }
}