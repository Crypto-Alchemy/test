package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.c0 */
/* compiled from: MessageLite */
public interface C4956c0 extends qu3 {

    /* renamed from: com.google.protobuf.c0$a */
    /* compiled from: MessageLite */
    public interface C4957a extends qu3, Cloneable {
        C4956c0 build();

        C4956c0 buildPartial();

        C4957a mergeFrom(C4956c0 c0Var);
    }

    im4<? extends C4956c0> getParserForType();

    int getSerializedSize();

    C4957a newBuilderForType();

    C4957a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
