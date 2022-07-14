package org.dog.thor;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/10/8:59 PM
 */

@Slf4j
@SpringBootApplication
@MapperScan("org.dog.thor.mapper")
@ServletComponentScan()
@EnableTransactionManagement
public class ThorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThorApplication.class);
        log.info("===============启动成功===============");
    }
}
