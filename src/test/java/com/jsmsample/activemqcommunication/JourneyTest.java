package com.jsmsample.activemqcommunication;

import com.jsmsample.activemqcommunication.port.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JourneyTest {

  @Autowired
  private Sender sender;

  @Test
  public void doCompleteJourney() {
//    sender.sendMessage();
  }
}
