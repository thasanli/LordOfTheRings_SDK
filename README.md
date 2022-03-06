
This is a simple SDK developed using Java / Maven / Spring Boot integrated already existing "Lord of the Rings" API (https://the-one-api.dev/).


Lord of the Rings SDK consists of total 4 end-points.
* 2 end-points mirroring already existing API 
* and the other 2 use abstraction to return a different data 

## Requirements

For building and running the application you need:

[JDK 1.8](https://www.oracle.com/java/technologies/downloads/#java8)

[Maven 3](https://maven.apache.org/)

[Git CLI](https://help.github.com/articles/set-up-git)

[ECLIPSE STS IDE](https://spring.io/tools) - you can use different IDE 



## Dependencies
There are 2 third-party dependencies used in the project. 
* [jackson-databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
	
* [log4j-core](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core)
	
Browse the Maven [pom.xml](https://github.com/thasanli/LordOfTheRings_SDK/blob/main/pom.xml) file for details of libraries and versions used.


## Steps:


On the command line

	git clone https://github.com/thasanli/LordOfTheRings_SDK.git
	
Build the project and run the tests by running 

	mvn clean package
	
Inside Eclipse or STS

	File -> Import -> Maven -> Existing Maven project

Run the [application main](https://github.com/thasanli/LordOfTheRings_SDK/blob/main/src/main/java/com/lordofrings/sdk/DemoApplication.java) method by right clicking on it and choosing 

	Run As -> Java Application. 
	
Once the application runs you should see something like this
	
	2022-03-06 00:39:12.386  INFO 2089 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
	2022-03-06 00:39:12.398  INFO 2089 --- [  restartedMain] com.lordofrings.sdk.DemoApplication      : Started DemoApplication in 2.7 seconds (JVM running for 4.06)


# Here are some endpoints you can call:

	* GET:  http://localhost:8080/movie/
	* GET:  http://localhost:8080/movie/{id}
	* GET:  http://localhost:8080/movie/longest
	* POST: http://localhost:8080/movie/search
	
If you are sending POST: http://localhost:8080/movie/search request, you should pass an HTTP request body containing the movie name you want to search. 
	
	HTTP request body : 
	
	{
    "name" : "The Lord of the Rings Series"
	}
	
	

Thank you. 

-Tural (tural.hasanli90@gmail.com) 







