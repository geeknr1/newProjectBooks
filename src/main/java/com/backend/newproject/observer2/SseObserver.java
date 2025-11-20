package com.backend.newproject.observer2;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

public class SseObserver implements Observer {


    private final SseEmitter emitter;
    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(NewBookRequest newBookRequest) {
        try {
            emitter.send(SseEvent.builder()
                    .data(newBookRequest)
                    .event("newBook")
                    .build());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SseEmitter getEmitter() {
        return emitter;
    }

}
