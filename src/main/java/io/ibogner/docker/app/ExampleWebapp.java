package io.ibogner.docker.app;

import static spark.Spark.get;

public class ExampleWebapp {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
