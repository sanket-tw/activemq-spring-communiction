package com.jsmsample.activemqcommunication;

import com.jsmsample.activemqcommunication.port.Sender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqCommunicationApplication {

  public static void main(String[] args) {
    var context = SpringApplication.run(ActivemqCommunicationApplication.class, args);

    Sender bean = context.getBean(Sender.class);
    bean.sendMessage();
  }

}
