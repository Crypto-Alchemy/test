package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
/* compiled from: MessageLite */
public interface C7628h extends ru3 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$a */
    /* compiled from: MessageLite */
    public interface C7629a extends Cloneable, ru3 {
        C7628h build();

        /* renamed from: n */
        C7629a mo53900n(C7614c cVar, C7616d dVar) throws IOException;
    }

    jm4<? extends C7628h> getParserForType();

    int getSerializedSize();

    C7629a newBuilderForType();

    C7629a toBuilder();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
