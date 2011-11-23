package org.foo.hello;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    public void start(BundleContext ctx) {
        ctx.registerService(Greeting.class.getName(),
                new GreetingImpl("service"), null);
    }

    public void stop(BundleContext ctx) {
        GreetingImpl.instance = null;
    }
}

