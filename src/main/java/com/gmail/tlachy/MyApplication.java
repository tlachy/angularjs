package com.gmail.tlachy;

import com.gmail.tlachy.HelloWorld;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.TracingConfig;


public class MyApplication extends ResourceConfig {

    public MyApplication() {

        packages(HelloWorld.class.getPackage().getName());

        // Logging.
        register(LoggingFilter.class);

        // Tracing support.
        property(ServerProperties.TRACING, TracingConfig.ON_DEMAND.name());
    }
}
