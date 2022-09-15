package art.holovchenko.onlinestore.productinfo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


//!!!  it's necessary to note that /refresh won't work for beans with an explicit singleton scope.
@Component
@ConfigurationProperties(prefix = "dynamo.property")
@Data
public class DynamicConfiguration {
  private String prop1;
  private String prop2;
}
