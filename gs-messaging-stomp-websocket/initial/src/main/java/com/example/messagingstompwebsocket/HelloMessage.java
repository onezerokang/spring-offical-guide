package com.example.messagingstompwebsocket;

// 서비스는 {"name": "Fred"} 형식의 메시지를 받는다.
public class HelloMessage {
    private String name;

    public HelloMessage() {}

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
