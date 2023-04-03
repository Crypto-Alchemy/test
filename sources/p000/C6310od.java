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

/* renamed from: od */
/* compiled from: AesCmacKeyManager */
public final class C6310od extends hb3<C6214ld> {

    /* renamed from: od$a */
    /* compiled from: AesCmacKeyManager */
    public class C6311a extends av4<lm3, C6214ld> {
        public C6311a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public lm3 mo29370a(C6214ld ldVar) throws GeneralSecurityException {
            return new wu4(new uu4(ldVar.mo45412G().toByteArray()), ldVar.mo45413H().mo47063F());
        }
    }

    /* renamed from: od$b */
    /* compiled from: AesCmacKeyManager */
    public class C6312b extends hb3.C5887a<C6278nd, C6214ld> {
        public C6312b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<C6278nd>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            hashMap.put("AES_CMAC", new hb3.C5887a.C5888a((C6278nd) C6278nd.m48726H().mo46054t(32).mo46055u((C6403qd) C6403qd.m50517G().mo47065t(16).build()).build(), outputPrefixType));
            hashMap.put("AES256_CMAC", new hb3.C5887a.C5888a((C6278nd) C6278nd.m48726H().mo46054t(32).mo46055u((C6403qd) C6403qd.m50517G().mo47065t(16).build()).build(), outputPrefixType));
            hashMap.put("AES256_CMAC_RAW", new hb3.C5887a.C5888a((C6278nd) C6278nd.m48726H().mo46054t(32).mo46055u((C6403qd) C6403qd.m50517G().mo47065t(16).build()).build(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C6214ld mo29955a(C6278nd ndVar) throws GeneralSecurityException {
            return (C6214ld) C6214ld.m47762J().mo45420v(0).mo45418t(ByteString.copyFrom(y65.m54637c(ndVar.mo46050F()))).mo45419u(ndVar.mo46051G()).build();
        }

        /* renamed from: g */
        public C6278nd mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return C6278nd.m48727I(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(C6278nd ndVar) throws GeneralSecurityException {
            C6310od.m49250q(ndVar.mo46051G());
            C6310od.m49251r(ndVar.mo46050F());
        }
    }

    public C6310od() {
        super(C6214ld.class, new C6311a(lm3.class));
    }

    /* renamed from: o */
    public static void m49249o(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new C6310od(), z);
        C6599vd.m53352d();
    }

    /* renamed from: q */
    public static void m49250q(C6403qd qdVar) throws GeneralSecurityException {
        if (qdVar.mo47063F() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (qdVar.mo47063F() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: r */
    public static void m49251r(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: f */
    public hb3.C5887a<C6278nd, C6214ld> mo29946f() {
        return new C6312b(C6278nd.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: m */
    public int mo46375m() {
        return 0;
    }

    /* renamed from: n */
    public C6214ld mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return C6214ld.m47763K(byteString, C4734l.m38174b());
    }

    /* renamed from: p */
    public void mo29949j(C6214ld ldVar) throws GeneralSecurityException {
        a87.m31751c(ldVar.mo45414I(), mo46375m());
        m49251r(ldVar.mo45412G().size());
        m49250q(ldVar.mo45413H());
    }
}
