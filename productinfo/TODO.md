
# Bugs

1. Configuration bug
Container in docker-compose is trying to get configuration from localhost:8071
Right after the configuration was gotten from configserver:8071 (variable SPRING_CONFIG_IMPORT)
The SPRING_CONFIG_IMPORT variable was added into the docker-compose file because
of Spring boot doesn't "see" spring.config.import variable in application.properties
But probably see it (and get its value localhost:8071) later.
TODO: get configuration only from configserver:8071