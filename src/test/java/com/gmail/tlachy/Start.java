package com.gmail.tlachy;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Start {

    public static void main(String[] args) throws Exception {
        Server server = new Server(9998);

        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        server.setHandler(webapp);
        webapp.setResourceBase("src/main/webapp");

        server.start();
        server.join();


    }
}