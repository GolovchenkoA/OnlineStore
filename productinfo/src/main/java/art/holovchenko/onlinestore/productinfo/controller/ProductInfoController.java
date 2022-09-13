package art.holovchenko.onlinestore.productinfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductInfoController {

//  TODO: use WebClient instead of restTemplate
//  See how to configure the client with registry service (see Discovery First Bootstrap Using Eureka And WebClient)
//  https://docs.spring.io/spring-cloud-config/docs/3.1.4/reference/html/#_spring_cloud_config_client
//  Example:
//  https://www.baeldung.com/spring-webclient-resttemplate

  @Value("${example.property:not implemented}")
  String propValue = "Unknown property";

  @RequestMapping("/")
  public String home() {
    return "'Environment is:  " + propValue;
  }
}
