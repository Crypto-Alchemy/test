package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.hb3;

/* renamed from: ec3 */
/* compiled from: KmsEnvelopeAeadKeyManager */
public class ec3 extends hb3<cc3> {

    /* renamed from: ec3$a */
    /* compiled from: KmsEnvelopeAeadKeyManager */
    public class C5762a extends av4<C5954id, cc3> {
        public C5762a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(cc3 cc3) throws GeneralSecurityException {
            String F = cc3.mo29928F().mo41889F();
            return new bc3(cc3.mo29928F().mo41888E(), ac3.m31774a(F).mo47797b(F));
        }
    }

    /* renamed from: ec3$b */
    /* compiled from: KmsEnvelopeAeadKeyManager */
    public class C5763b extends hb3.C5887a<dc3, cc3> {
        public C5763b(Class cls) {
            super(cls);
        }

        /* renamed from: f */
        public cc3 mo29955a(dc3 dc3) throws GeneralSecurityException {
            return (cc3) cc3.m32929H().mo29932t(dc3).mo29933u(ec3.this.mo42202k()).build();
        }

        /* renamed from: g */
        public dc3 mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return dc3.m43442H(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(dc3 dc3) throws GeneralSecurityException {
            if (dc3.mo41889F().isEmpty() || !dc3.mo41890G()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public ec3() {
        super(cc3.class, new C5762a(C5954id.class));
    }

    /* renamed from: m */
    public static void m43891m(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new ec3(), z);
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* renamed from: f */
    public hb3.C5887a<dc3, cc3> mo29946f() {
        return new C5763b(dc3.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    /* renamed from: k */
    public int mo42202k() {
        return 0;
    }

    /* renamed from: l */
    public cc3 mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return cc3.m32930I(byteString, C4734l.m38174b());
    }

    /* renamed from: n */
    public void mo29949j(cc3 cc3) throws GeneralSecurityException {
        a87.m31751c(cc3.mo29929G(), mo42202k());
    }
}
