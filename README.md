# CNB [![Version Project: 0.0.1-SNAPSHOT](https://img.shields.io/badge/Version_Project-0.0.1--SNAPSHOT-green.svg)](#)

[![JDK compatibility: 17](https://img.shields.io/badge/JDK_compatibility-17-blue.svg)](#)
[![Mysql: 17](https://img.shields.io/badge/Mysql-latest-blue.svg)](#)

# Object

xxxxxxxxxxxx

# Configuration
In order to build docker image local:
### Windows
1. Start docker
2. Open command and pull image of mysql: `docker pull mysql`
3. Start instance of mysql: `docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=<PASSWORD> -d mysql:latest`
4. Verify container active: `docker exe -it mysql bash`

> Help: https://plus.diolinux.com.br/t/dica-como-instalar-o-mysql-no-docker-e-conectar-no-dbeaver-windows-e-linux/31212

# Swagger

http://localhost:8080/swagger-ui/#/Employee/getEmployeesUsingGET
