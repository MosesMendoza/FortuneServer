*FortuneServer*

Tooling around with a basic spring application server.

Given a request for a fortune and a person's name, reply with a fortune.

## Dependencies

Java
Gradle

## Build

gradle build

## Run

java -jar build/libs/fortune-service-0.1.0.jar

This will start a local tomcat servlet on 8080.

## Usage

```
$ curl -X GET localhost:8080/fortune
{"id":1,"fortune":"You will have a very wonderful day today, Foo!"}

$curl -X GET localhost:8080/fortune?name=moses
{"id":1,"fortune":"You will have a very wonderful day today, moses!"}
```

## Todo
As far as fortune tellers go, this one's pretty bare, since it actually just
replies with the same string over and over again. We should probably reply with
some dynamically generated or at least randomly retrieved content.
