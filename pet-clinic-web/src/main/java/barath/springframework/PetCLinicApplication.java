package barath.springframework;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootConfiguration
@SpringBootApplication
public class PetCLinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetCLinicApplication.class, args);
    }

}
