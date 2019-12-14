package com.example.demo;

import com.github.monkeywie.proxyee.server.HttpProxyServer;
import com.github.monkeywie.proxyee.server.HttpProxyServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    public void start(){
        System.out.println("111");
        HttpProxyServerConfig config =  new HttpProxyServerConfig();
        config.setBossGroupThreads(1);
        config.setWorkerGroupThreads(1);
        config.setProxyGroupThreads(1);
        new HttpProxyServer()
                .serverConfig(config)
                .start(9999);
    }

}
