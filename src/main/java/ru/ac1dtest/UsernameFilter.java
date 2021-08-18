package ru.ac1dtest;

import javax.servlet.*;
import java.io.IOException;

public class UsernameFilter implements Filter {
    public static final String USER_TO_BAN = "UserToBan";
    private String userToBan;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        userToBan = filterConfig.getInitParameter(USER_TO_BAN);
        System.out.println("usernameFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("USERNAME FILTER!!");

        String name = servletRequest.getParameter("userName");
        if (userToBan.equalsIgnoreCase(name)) {
            servletResponse.getWriter().write("STOP!");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
