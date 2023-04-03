package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c0 */
/* compiled from: MessageLite */
public interface C4705c0 extends su3 {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.c0$a */
    /* compiled from: MessageLite */
    public interface C4706a extends su3, Cloneable {
        /* renamed from: b0 */
        C4706a mo35606b0(C4705c0 c0Var);

        C4705c0 build();

        C4705c0 buildPartial();
    }

    /* renamed from: a */
    void mo35441a(CodedOutputStream codedOutputStream) throws IOException;

    km4<? extends C4705c0> getParserForType();

    int getSerializedSize();

    C4706a newBuilderForType();

    C4706a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();
}
