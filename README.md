# Expectation

This should work:

```shell
curl --location --request POST 'http://localhost:8080/hello' \
--header 'Content-Type: application/vnd.api+json' \
--data-raw '{
    "test": "quarkus"
}'
```

# Result

415: Unsupported Media Type
