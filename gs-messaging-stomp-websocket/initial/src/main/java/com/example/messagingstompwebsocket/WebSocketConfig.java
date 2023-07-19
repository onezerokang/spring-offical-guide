package com.example.messagingstompwebsocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker // 메시지 브로커에 의해 지원되는 WebSocket 메시지 처리를 활성화
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // 메모리 기반 메시지 브로커
        config.enableSimpleBroker("/topic"); //서버에서 클라이언트로 인사말 메시지를 전달하기 위해 간단한 메모리 기반 메시지 브로커를 활성화한다.
        config.setApplicationDestinationPrefixes("/app"); // @MessageMapping 어노테이션이 달린 메서드에 바인딩 되는 메시지의 prefix e.g /app/greeting
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gs-guide-websocket"); // websocket연결을 위한 엔드포인트 등록
    }
}
