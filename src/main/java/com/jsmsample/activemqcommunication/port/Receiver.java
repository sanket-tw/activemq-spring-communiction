package com.jsmsample.activemqcommunication.port;

import com.jsmsample.activemqcommunication.model.Payload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class Receiver {

  @JmsListener(destination = "test-topic", containerFactory = "myFactory")
  public void receive(Payload payload, @Headers Map<String, String> headers) {
    log.info("Received message from test-topic with payload {} and headers {}",
        payload,
        headers);
  }
}
