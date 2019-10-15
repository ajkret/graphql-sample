# Spring Boot and GraphQL integration

Here is a small application to demonstrate the integration of GraphQL and Spring Boot

## Building

Type:

    ./gradlew clean build
    
## Running

Type

    java -jar .\build\libs\graphql-0.0.1-SNAPSHOT.jar
    
Then, open a browser and type [http://localhost:8098/graphiql]()

In the panel opened, insert a few records:

```
mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
  {
    id
  }
}
```

Then you can proceed running queries:


```
{
  vehicles(count: 1) {
    id
    type
    modelCode
    launchDate
  }
}
```

