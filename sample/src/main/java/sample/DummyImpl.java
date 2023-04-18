package sample;

import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import sample.grpc.dummy.Dummy;
import sample.grpc.dummy.DummyRequest;
import sample.grpc.dummy.DummyResponse;
import sample.grpc.dummy.DummyServiceGrpc;

@GrpcService
public class DummyImpl extends DummyServiceGrpc.DummyServiceImplBase {
    @Override
    public void dummy(DummyRequest request, StreamObserver<DummyResponse> responseObserver) {
        responseObserver.onNext(dummy(request));
        responseObserver.onCompleted();
    }

    private DummyResponse dummy(DummyRequest request) {
        return DummyResponse.newBuilder().build();
    }
}
