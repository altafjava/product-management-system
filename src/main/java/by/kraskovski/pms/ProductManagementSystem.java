package by.kraskovski.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings({"finalclass", "HideUtilityClassConstructor"})
@SpringBootApplication
public class ProductManagementSystem {

    public static void main(final String[] args) {
        SpringApplication.run(ProductManagementSystem.class, args);
        log.info("---------- APPLICATION STARTED SUCCESSFULLY ----------");
    }
}
