# Manual

## Notes
The project is developing on Windows.
It should be important in case when the modules run not in docker.
For example the application.properties in the 'configserver' module has a path.
Windows and Linux use different ways to declare a path to a file and the module
will fail if it will be run on Linux.

## How to prepare project
The configserver module and productinfo modules support dynamic updating for properties.
That's why all configurations were moved outside the config server.
Before run docker compose with all modules it's required copy configserver's conf folder.
To do that perform
```
cd setup
run copy_configserver_repository.bat
```


folder
from the root of the project
In case when the project (its modules) is run not in docker