package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.hb3;

/* renamed from: rc0 */
/* compiled from: ChaCha20Poly1305KeyManager */
public class rc0 extends hb3<pc0> {

    /* renamed from: rc0$a */
    /* compiled from: ChaCha20Poly1305KeyManager */
    public class C6432a extends av4<C5954id, pc0> {
        public C6432a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(pc0 pc0) throws GeneralSecurityException {
            return new oc0(pc0.mo46687F().toByteArray());
        }
    }

    /* renamed from: rc0$b */
    /* compiled from: ChaCha20Poly1305KeyManager */
    public class C6433b extends hb3.C5887a<qc0, pc0> {
        public C6433b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<qc0>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new hb3.C5887a.C5888a(qc0.m50494D(), KeyTemplate.OutputPrefixType.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new hb3.C5887a.C5888a(qc0.m50494D(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public pc0 mo29955a(qc0 qc0) throws GeneralSecurityException {
            return (pc0) pc0.m49844H().mo46692u(rc0.this.mo47374k()).mo46691t(ByteString.copyFrom(y65.m54637c(32))).build();
        }

        /* renamed from: g */
        public qc0 mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return qc0.m50495E(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(qc0 qc0) throws GeneralSecurityException {
        }
    }

    public rc0() {
        super(pc0.class, new C6432a(C5954id.class));
    }

    /* renamed from: m */
    public static void m51041m(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new rc0(), z);
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: f */
    public hb3.C5887a<qc0, pc0> mo29946f() {
        return new C6433b(qc0.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: k */
    public int mo47374k() {
        return 0;
    }

    /* renamed from: l */
    public pc0 mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return pc0.m49845I(byteString, C4734l.m38174b());
    }

    /* renamed from: n */
    public void mo29949j(pc0 pc0) throws GeneralSecurityException {
        a87.m31751c(pc0.mo46688G(), mo47374k());
        if (pc0.mo46687F().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
