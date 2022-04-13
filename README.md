# Spring Boot web-app

A Sample Example Code for web-app using Spring-Boot,
This guide is meant to give you a quick taste of the integration of Contentstack-Java SDK with Spring Boot web-app. If you want to create your own Spring Boot-based project, visit [Spring Initializr](https://start.spring.io/), fill in your project details, pick your options, and download a bundled up project as a zip file.


## Step: 1 You will build a simple news web application with Spring Boot and contentstack Java SDK.


- A favorite text editor or IDE

- JDK 1.8 or later

- Gradle 4+ or Maven 3.2+


## Step: 2 How to complete this guide

- To start from scratch, move on to Starting with [Spring Initializr](https://start.spring.io/).

- To skip the basics, do the following:

- Download and unzip the source repository for this guide, or clone it using Git: 
     
        git clone https://github.com/ishaileshmishra/spring-boot-web-app.git.git

- cd into contentstack-java-spring-example/initial

- Jump ahead to Create a Simple Web Application.

- When you finish, you can check your results against the code in gs-spring-boot/complete.


## Step: 3 For View Rendering

```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
```

## Step: 4 Run the Application


To run the application, run the following command in a terminal window (in the complete) directory

```
    ./gradlew bootRun
```

If you use Maven, run the following command in a terminal window (in the complete) directory:

```
    ./mvnw spring-boot:run
```


Now run the service with curl (in a separate terminal window), by running the following command (shown with its output):

```
    $ curl localhost:8080
```

Or simply click on the below url hosted on herokuapp

### https://shaileshmishra.herokuapp.com


![Screenshot](https://github.com/ishaileshmishra/example/blob/master/snapshot.png?raw=true)

Configure spring boot for HTTPS
https://medium.com/javarevisited/how-to-enable-https-locally-without-getting-annoying-browser-privacyerrors-in-a-spring-boot-a6137dacbc0a

Creating trusted SSL CA 
https://medium.com/javarevisited/how-to-enable-https-locally-without-getting-annoying-browser-privacyerrors-in-a-spring-boot-a6137dacbc0a
"# WebPageMM" 
