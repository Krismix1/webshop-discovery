package dk.cristi.app.webshop.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebShopDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebShopDiscoveryServerApplication.class, args);
    }
}
