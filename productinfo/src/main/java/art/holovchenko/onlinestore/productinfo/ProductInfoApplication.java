package art.holovchenko.onlinestore.productinfo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
public class ProductInfoApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProductInfoApplication.class, args);
  }

//  TODO: rmeove
  @Bean
  ApplicationRunner applicationRunner(Environment environment) {
    return args -> {
      log.info("message from application.properties " +
          environment.getProperty("example.property"));
    };
  }
}
