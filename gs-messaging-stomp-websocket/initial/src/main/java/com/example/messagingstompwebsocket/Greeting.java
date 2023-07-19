package com.example.messagingstompwebsocket;

// HelloMessage를 수신하고 이름을 축출하면 서비스는 인삿말을 만들고 해당 인삿말을 클라이언트가 구독하는 별도의 대기열에 게시하여 메시지를 처리한다.
public class Greeting {
    private String content;

    public Greeting() {}

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
