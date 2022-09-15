package art.holovchenko.onlinestore.productinfo.controller;

import art.holovchenko.onlinestore.productinfo.config.DynamicConfiguration;
import java.lang.reflect.Field;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class PropertiesController {

//  TODO: use WebClient instead of restTemplate
//  See how to configure the client with registry service (see Discovery First Bootstrap Using Eureka And WebClient)
//  https://docs.spring.io/spring-cloud-config/docs/3.1.4/reference/html/#_spring_cloud_config_client
//  Example:
//  https://www.baeldung.com/spring-webclient-resttemplate

  @Autowired
  private DynamicConfiguration dynamicConfiguration;

  @Value("${example.property:not implemented}")
  String propValue = "Unknown property";

  @RequestMapping("/")
  public String home() {
    return "'Environment is:  " + propValue;
  }

  @RequestMapping("/property/{property}")
  public String getProperty(@PathVariable String property) {
    String value = "Unknown property " + property;
    return dynamicConfiguration.getProp1();
//    if (dynamicPropertyValid(dynamicConfiguration, property)) {
//      try {
//        Field privateField = dynamicConfiguration.getClass().getDeclaredField(property);
//        privateField.setAccessible(true);
//        value = (String)privateField.get(dynamicConfiguration);
//      } catch (NoSuchFieldException e) {
//        value =  e.getMessage();
//      } catch (IllegalAccessException e) {
//        value = e.getMessage();
//      }
//      return value;
//    }
//    return value;
  }

  private boolean dynamicPropertyValid(DynamicConfiguration dynamicConfiguration,
                                       String property) {
    Field[] fields = dynamicConfiguration.getClass().getDeclaredFields();
    return Arrays.asList(fields).contains(property);
  }
}
