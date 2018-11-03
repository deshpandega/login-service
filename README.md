# Login Service

Login service is a [Maven](https://maven.apache.org/ "maven") project. 
I used [Jersey](https://jersey.github.io/ "jersey") to expose REST endpoints, Google [Guice](https://github.com/google/guice/wiki/Injections, "Guice") module for dependency injection.
------------------


### Setup
Maven and Java is required to package and run this service.

Use the following maven command to compile and package the service:

`mvn clean package`

-----------

### Running the Project
I have created a local profile to run the application locally. It will use tomcat server to run the application.
Run following command to run the application locally:

`mvn -P local tomcat7:run`

