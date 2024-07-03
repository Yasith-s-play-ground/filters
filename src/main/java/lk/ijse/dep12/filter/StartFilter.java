package lk.ijse.dep12.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/* all requests are sent through this filter */
//@WebFilter(filterName = "start-filter", urlPatterns = "/*")
public class StartFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Start Filter : Incoming request");
        chain.doFilter(req, res);
        System.out.println("Start Filter : Outgoing request");
    }
}
