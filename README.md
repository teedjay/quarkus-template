# quarkus-template
Starting template for experimenting with latest Quarkus features

## Curl to test
```

# To get the txt template
curl -i http://localhost:8080/hello -H "Accept: text/plain"

# To get the html template
curl -i http://localhost:8080/hello -H "Accept: text/html"

# To get the xml version
curl -i http://localhost:8080/hello -H "Accept: application/xml"

```

## URL's to test in browser
```
http://localhost:8080/hello
http://localhost:8080/notfound
http://localhost:8080/metrics
http://localhost:8080/openapi
http://localhost:8080/swagger-ui
```

## Open the JaCoCo code coverage report
```
open target/site/jacoco/index.html
```
