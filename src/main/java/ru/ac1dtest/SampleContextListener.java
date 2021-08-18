package ru.ac1dtest;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SampleContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(">>>>>> initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
