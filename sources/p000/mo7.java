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

/* renamed from: mo7 */
/* compiled from: XChaCha20Poly1305KeyManager */
public class mo7 extends hb3<ko7> {

    /* renamed from: mo7$a */
    /* compiled from: XChaCha20Poly1305KeyManager */
    public class C6255a extends av4<C5954id, ko7> {
        public C6255a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(ko7 ko7) throws GeneralSecurityException {
            return new jo7(ko7.mo44862F().toByteArray());
        }
    }

    /* renamed from: mo7$b */
    /* compiled from: XChaCha20Poly1305KeyManager */
    public class C6256b extends hb3.C5887a<lo7, ko7> {
        public C6256b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<lo7>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new hb3.C5887a.C5888a(lo7.m47884D(), KeyTemplate.OutputPrefixType.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new hb3.C5887a.C5888a(lo7.m47884D(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public ko7 mo29955a(lo7 lo7) throws GeneralSecurityException {
            return (ko7) ko7.m47208H().mo44867u(mo7.this.mo45835k()).mo44866t(ByteString.copyFrom(y65.m54637c(32))).build();
        }

        /* renamed from: g */
        public lo7 mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return lo7.m47885E(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(lo7 lo7) throws GeneralSecurityException {
        }
    }

    public mo7() {
        super(ko7.class, new C6255a(C5954id.class));
    }

    /* renamed from: m */
    public static void m48390m(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new mo7(), z);
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: f */
    public hb3.C5887a<lo7, ko7> mo29946f() {
        return new C6256b(lo7.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: k */
    public int mo45835k() {
        return 0;
    }

    /* renamed from: l */
    public ko7 mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return ko7.m47209I(byteString, C4734l.m38174b());
    }

    /* renamed from: n */
    public void mo29949j(ko7 ko7) throws GeneralSecurityException {
        a87.m31751c(ko7.mo44863G(), mo45835k());
        if (ko7.mo44862F().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
