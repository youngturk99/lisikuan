package com.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.sql.BatchUpdateException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by lisk on 2018/6/21.
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class ServiceApplication implements CommandLineRunner {
    public static void main(String[] args){
        SpringApplication.run(ServiceApplication.class,args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run(String... strings) throws Exception {

        System.out.println("项目启动成功...");
    }
}
