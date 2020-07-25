package com;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: ProducerApplication
 * @Description:
 * @Author: xiedong
 * @Date: 2020/7/25 20:48
 */
@SpringBootApplication
@Slf4j
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
