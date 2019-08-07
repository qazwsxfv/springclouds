package version2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Version2Application {

    public static void main(String[] args) {
        SpringApplication.run(Version2Application.class, args);
    }

}
