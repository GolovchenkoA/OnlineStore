TODO:  Configuration server doesn't update dynamic config
https://www.youtube.com/playlist?list=PLqq-6Pq4lTTaoaVoQVfRJPqvNTCjcTvJB
https://spring.io/guides/gs/centralized-configuration/
Check: http://localhost:8071/product-info/dev

To update the client send a POST request to: http://localhost:8080/actuator/refresh


TODO: Use composite environment in the product-inventory module. See https://cloud.spring.io/spring-cloud-config/reference/html/#composite-environment-repositories
TODO: add description for docker compose
TODO: use Swagger to generate documentation for the endpoints
TODO: 

# Design Observable Services

## Helth check API

## Log Aggregation
TODO ELK (Elasticsearch, Logstash, Kibana)
Fluentd and Apache Flume or AWS CloudWatch

## Exception tracking (deduplicate exception, alert developers)

## Audit Logging (log user action)

## Monitoring

# Distributed tracing pattern
TODO: Add Distributed tracing (Metrics) + Distributed Tracing Server (Open Zipkin)
See: https://github.com/openzipkin/b3-propagation
Context contains : Service name, Trace id (common id), span id (parent call id), true/false (exported or not to distibuted tracing)
SLF4J + AOP (Example: Spring CLoud Sleuth or AWS X-ray)

# Application Metrics patter (counters and gauges)
TODO: Micrometer Metrics to collect metrics (See: MeterRegistry https://www.javadoc.io/doc/io.micrometer/micrometer-core/1.3.3/io/micrometer/core/instrument/MeterRegistry.html)
TODO: Add Metrics delivering (For example: Push model(AWS Cloudwatch) or pull (Prometheus))
Spring BOot's autoconfiguration takes care of configuring the metrics library and exposing the metrics