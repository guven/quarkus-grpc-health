# About

Sample repository to demonstrate how one can initialize a gRPC service which does not have a Jandex index with Quarkus.

This is in relation to this issue [32622 - gRPC Health is not exposed for services from external dependency](https://github.com/quarkusio/quarkus/issues/32622).

# How to run

```

[1] compile and install the "external" project

$ mvn -f external install

[2] run the "sample" project

$ mvn -f sample quarkus:dev

[3] list the exposed services

$ grpcurl -plaintext localhost:8080 list
sample.grpc.dummy.DummyService

[4] uncomment `jandex-maven-plugin` on external/pom.xml, repeat step [1] and [2], then:

$ grpcurl -plaintext localhost:8080 list
grpc.health.v1.Health
sample.grpc.dummy.DummyService

```
