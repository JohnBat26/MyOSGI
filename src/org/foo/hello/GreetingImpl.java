package org.foo.hello;


public class GreetingImpl implements Greeting{
    static GreetingImpl instance;
    final String m_name;

    GreetingImpl(String name) {
        m_name = name;
    }

    public static GreetingImpl get() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello, " + m_name + "!");
    }
}
