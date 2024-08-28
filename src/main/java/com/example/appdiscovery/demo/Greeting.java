package com.example.appdiscovery.demo;

/**
 * @author Manoj Ramakrishnan (rmanoj@vmware.com).
 * @since 8/28/24 1:59 PM
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
