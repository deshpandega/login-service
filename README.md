# Login Service

Login service is a [Maven](https://maven.apache.org/ "maven") project. 
I used [Jersey](https://jersey.github.io/ "jersey") to expose REST endpoints, Google [Guice](https://github.com/google/guice/wiki/Injections, "Guice") module for dependency injection.

------------------


### Setup
Maven and Java is required to package and run this service.

Use the following maven command to compile and package the service:

`mvn clean package`

-----------

### Running Cassandra Instance
In order to install Cassandra instance locally, run following commands:

`curl -L http://apache.claz.org/cassandra/2.1.20/apache-cassandra-2.1.20-bin.tar.gz | tar -xz`

`./apache-cassandra-2.1.20/bin/cqlsh`

Once cql shell is up, run the commands from following file to create keyspace and tables in cassandra:

`src/main/java/com/gd/app/dao/login-table.cql`

Once Cassandra instance is up, restart the application.

-------------

### Running the Project
I have created a local profile to run the application locally. It will use tomcat server to run the application.
Run following command to run the application locally:

`mvn -P local tomcat7:run`

> **Note**
> 
> Please run Cassandra before running backend application as Cassandra instance is being injected at application start time

------------

### Check Status
In order to check the status of backend services, please try to access the following link either from browser, Postman or Paw:

`http://localhost:8999/loginservice/v1/hello`  

------------

### Run UTs
To run unit tests, please use following command:

`mvn clean test`

------------

### Sample Curls

##### Details from Google Login

```
## Request_Google
curl -X "POST" "http://localhost:8999/loginservice/v1/google" \
     -H 'Content-Type: application/json' \
     -H 'Accept: application/json' \
     -d $'{
  "email": "email@gmail.com",
  "id": "12345678",
  "imageUrl": "https://imageUrl",
  "name": "Name"
}'
```

##### Details from Facebook Login

```
## Request_Facebook
curl -X "POST" "http://localhost:8999/loginservice/v1/facebook" \
     -H 'Content-Type: application/json' \
     -H 'Accept: application/json' \
     -d $'{
  "email": "email@tfbnw.net",
  "id": "12345678",
  "imageUrl": "https://imageUrl",
  "name": "Name"
}'
```

------------

