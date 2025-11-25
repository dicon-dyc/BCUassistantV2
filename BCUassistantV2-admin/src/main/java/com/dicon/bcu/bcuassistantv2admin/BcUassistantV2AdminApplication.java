package com.dicon.bcu.bcuassistantv2admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class BcUassistantV2AdminApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BcUassistantV2AdminApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  BCUassistantV2启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
