package istio.mcp.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service where the source is the gRPC client. The source is responsible for
 * initiating connections and opening streams.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: mcp/v1alpha1/mcp.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceSinkGrpc {

  private ResourceSinkGrpc() {}

  public static final String SERVICE_NAME = "istio.mcp.v1alpha1.ResourceSink";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Mcp.Resources,
      Mcp.RequestResources> getEstablishResourceStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstablishResourceStream",
      requestType = Mcp.Resources.class,
      responseType = Mcp.RequestResources.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Mcp.Resources,
      Mcp.RequestResources> getEstablishResourceStreamMethod() {
    io.grpc.MethodDescriptor<Mcp.Resources, Mcp.RequestResources> getEstablishResourceStreamMethod;
    if ((getEstablishResourceStreamMethod = ResourceSinkGrpc.getEstablishResourceStreamMethod) == null) {
      synchronized (ResourceSinkGrpc.class) {
        if ((getEstablishResourceStreamMethod = ResourceSinkGrpc.getEstablishResourceStreamMethod) == null) {
          ResourceSinkGrpc.getEstablishResourceStreamMethod = getEstablishResourceStreamMethod =
              io.grpc.MethodDescriptor.<Mcp.Resources, Mcp.RequestResources>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstablishResourceStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Mcp.Resources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Mcp.RequestResources.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceSinkMethodDescriptorSupplier("EstablishResourceStream"))
              .build();
        }
      }
    }
    return getEstablishResourceStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceSinkStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceSinkStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceSinkStub>() {
        @Override
        public ResourceSinkStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceSinkStub(channel, callOptions);
        }
      };
    return ResourceSinkStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceSinkBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceSinkBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceSinkBlockingStub>() {
        @Override
        public ResourceSinkBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceSinkBlockingStub(channel, callOptions);
        }
      };
    return ResourceSinkBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceSinkFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceSinkFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceSinkFutureStub>() {
        @Override
        public ResourceSinkFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceSinkFutureStub(channel, callOptions);
        }
      };
    return ResourceSinkFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service where the source is the gRPC client. The source is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static abstract class ResourceSinkImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The source, acting as gRPC client, establishes a new resource stream
     * with the sink. The sink sends RequestResources message to and
     * receives Resources messages from the source.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Mcp.Resources> establishResourceStream(
        io.grpc.stub.StreamObserver<Mcp.RequestResources> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEstablishResourceStreamMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEstablishResourceStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                Mcp.Resources,
                Mcp.RequestResources>(
                  this, METHODID_ESTABLISH_RESOURCE_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * Service where the source is the gRPC client. The source is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static final class ResourceSinkStub extends io.grpc.stub.AbstractAsyncStub<ResourceSinkStub> {
    private ResourceSinkStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ResourceSinkStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceSinkStub(channel, callOptions);
    }

    /**
     * <pre>
     * The source, acting as gRPC client, establishes a new resource stream
     * with the sink. The sink sends RequestResources message to and
     * receives Resources messages from the source.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Mcp.Resources> establishResourceStream(
        io.grpc.stub.StreamObserver<Mcp.RequestResources> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEstablishResourceStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service where the source is the gRPC client. The source is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static final class ResourceSinkBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceSinkBlockingStub> {
    private ResourceSinkBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ResourceSinkBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceSinkBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Service where the source is the gRPC client. The source is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static final class ResourceSinkFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceSinkFutureStub> {
    private ResourceSinkFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ResourceSinkFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceSinkFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ESTABLISH_RESOURCE_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceSinkImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceSinkImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ESTABLISH_RESOURCE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.establishResourceStream(
              (io.grpc.stub.StreamObserver<Mcp.RequestResources>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ResourceSinkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceSinkBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Mcp.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceSink");
    }
  }

  private static final class ResourceSinkFileDescriptorSupplier
      extends ResourceSinkBaseDescriptorSupplier {
    ResourceSinkFileDescriptorSupplier() {}
  }

  private static final class ResourceSinkMethodDescriptorSupplier
      extends ResourceSinkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceSinkMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ResourceSinkGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceSinkFileDescriptorSupplier())
              .addMethod(getEstablishResourceStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
