package p000;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4705c0;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.hb3;

/* renamed from: ta3 */
/* compiled from: KeyManagerImpl */
public class ta3<PrimitiveT, KeyProtoT extends C4705c0> implements sa3<PrimitiveT> {

    /* renamed from: a */
    public final hb3<KeyProtoT> f34204a;

    /* renamed from: b */
    public final Class<PrimitiveT> f34205b;

    /* renamed from: ta3$a */
    /* compiled from: KeyManagerImpl */
    public static class C6519a<KeyFormatProtoT extends C4705c0, KeyProtoT extends C4705c0> {

        /* renamed from: a */
        public final hb3.C5887a<KeyFormatProtoT, KeyProtoT> f34206a;

        public C6519a(hb3.C5887a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f34206a = aVar;
        }

        /* renamed from: a */
        public KeyProtoT mo48040a(ByteString byteString) throws GeneralSecurityException, InvalidProtocolBufferException {
            return mo48041b(this.f34206a.mo29956d(byteString));
        }

        /* renamed from: b */
        public final KeyProtoT mo48041b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException {
            this.f34206a.mo29957e(keyformatprotot);
            return this.f34206a.mo29955a(keyformatprotot);
        }
    }

    public ta3(hb3<KeyProtoT> hb3, Class<PrimitiveT> cls) {
        if (hb3.mo43123i().contains(cls) || Void.class.equals(cls)) {
            this.f34204a = hb3;
            this.f34205b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{hb3.toString(), cls.getName()}));
    }

    /* renamed from: a */
    public final KeyData mo47710a(ByteString byteString) throws GeneralSecurityException {
        try {
            return (KeyData) KeyData.m37125K().mo35296u(getKeyType()).mo35297v(mo48038d().mo48040a(byteString).toByteString()).mo35295t(this.f34204a.mo29947g()).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: b */
    public final PrimitiveT mo47711b(ByteString byteString) throws GeneralSecurityException {
        try {
            return mo48039e(this.f34204a.mo29948h(byteString));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f34204a.mo43121c().getName(), e);
        }
    }

    /* renamed from: c */
    public final C4705c0 mo47712c(ByteString byteString) throws GeneralSecurityException {
        try {
            return mo48038d().mo48040a(byteString);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f34204a.mo29946f().mo43124b().getName(), e);
        }
    }

    /* renamed from: d */
    public final C6519a<?, KeyProtoT> mo48038d() {
        return new C6519a<>(this.f34204a.mo29946f());
    }

    /* renamed from: e */
    public final PrimitiveT mo48039e(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f34205b)) {
            this.f34204a.mo29949j(keyprotot);
            return this.f34204a.mo43122e(keyprotot, this.f34205b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final String getKeyType() {
        return this.f34204a.mo29945d();
    }
}
