package com.peacecwz.springsample.models;

public class GreetingModel {

    private final long id;
    private final String content;

    public GreetingModel(long id, String content) {
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