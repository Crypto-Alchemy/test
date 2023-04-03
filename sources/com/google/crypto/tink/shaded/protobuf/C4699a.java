package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4699a;
import com.google.crypto.tink.shaded.protobuf.C4699a.C4700a;
import com.google.crypto.tink.shaded.protobuf.C4705c0;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* compiled from: AbstractMessageLite */
public abstract class C4699a<MessageType extends C4699a<MessageType, BuilderType>, BuilderType extends C4700a<MessageType, BuilderType>> implements C4705c0 {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C4700a<MessageType extends C4699a<MessageType, BuilderType>, BuilderType extends C4700a<MessageType, BuilderType>> implements C4705c0.C4706a {
        /* renamed from: f */
        public static UninitializedMessageException m37508f(C4705c0 c0Var) {
            return new UninitializedMessageException(c0Var);
        }

        /* renamed from: b */
        public abstract BuilderType mo35460b(MessageType messagetype);

        /* renamed from: d */
        public BuilderType mo35606b0(C4705c0 c0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(c0Var)) {
                return mo35460b((C4699a) c0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo35442b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public int mo35601c(C4731j0 j0Var) {
        int b = mo35442b();
        if (b != -1) {
            return b;
        }
        int g = j0Var.mo35724g(this);
        mo35444f(g);
        return g;
    }

    /* renamed from: d */
    public final String mo35602d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: e */
    public UninitializedMessageException mo35603e() {
        return new UninitializedMessageException((C4705c0) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo35444f(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream e0 = CodedOutputStream.m37221e0(bArr);
            mo35441a(e0);
            e0.mo35401d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(mo35602d("byte array"), e);
        }
    }

    public ByteString toByteString() {
        try {
            ByteString.C4674g newCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            mo35441a(newCodedBuilder.mo35375b());
            return newCodedBuilder.mo35374a();
        } catch (IOException e) {
            throw new RuntimeException(mo35602d("ByteString"), e);
        }
    }
}
