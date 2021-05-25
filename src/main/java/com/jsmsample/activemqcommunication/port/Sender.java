package com.jsmsample.activemqcommunication.port;

import com.jsmsample.activemqcommunication.model.Payload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Sender {

  private final JmsTemplate jmsTemplate;

  public void sendMessage() {
    log.info("sending a test message from sender to receiver");
    jmsTemplate.convertAndSend("test-topic",
        Payload.builder().age(20).name("sanket").type(Payload.Type.NEW).build());
  }
}
