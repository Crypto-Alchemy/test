package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.hb3;

/* renamed from: ue */
/* compiled from: AesSivKeyManager */
public final class C6566ue extends hb3<C6478se> {

    /* renamed from: ue$a */
    /* compiled from: AesSivKeyManager */
    public class C6567a extends av4<ge1, C6478se> {
        public C6567a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public ge1 mo29370a(C6478se seVar) throws GeneralSecurityException {
            return new C6435re(seVar.mo47739F().toByteArray());
        }
    }

    /* renamed from: ue$b */
    /* compiled from: AesSivKeyManager */
    public class C6568b extends hb3.C5887a<C6528te, C6478se> {
        public C6568b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<C6528te>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new hb3.C5887a.C5888a((C6528te) C6528te.m52266F().mo48097t(64).build(), KeyTemplate.OutputPrefixType.TINK));
            hashMap.put("AES256_SIV_RAW", new hb3.C5887a.C5888a((C6528te) C6528te.m52266F().mo48097t(64).build(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C6478se mo29955a(C6528te teVar) throws GeneralSecurityException {
            return (C6478se) C6478se.m51717H().mo47743t(ByteString.copyFrom(y65.m54637c(teVar.mo48095E()))).mo47744u(C6566ue.this.mo48390k()).build();
        }

        /* renamed from: g */
        public C6528te mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return C6528te.m52267G(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(C6528te teVar) throws GeneralSecurityException {
            if (teVar.mo48095E() != 64) {
                throw new InvalidAlgorithmParameterException("invalid key size: " + teVar.mo48095E() + ". Valid keys must have " + 64 + " bytes.");
            }
        }
    }

    public C6566ue() {
        super(C6478se.class, new C6567a(ge1.class));
    }

    /* renamed from: m */
    public static void m52794m(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new C6566ue(), z);
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: f */
    public hb3.C5887a<C6528te, C6478se> mo29946f() {
        return new C6568b(C6528te.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: k */
    public int mo48390k() {
        return 0;
    }

    /* renamed from: l */
    public C6478se mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return C6478se.m51718I(byteString, C4734l.m38174b());
    }

    /* renamed from: n */
    public void mo29949j(C6478se seVar) throws GeneralSecurityException {
        a87.m31751c(seVar.mo47740G(), mo48390k());
        if (seVar.mo47739F().size() != 64) {
            throw new InvalidKeyException("invalid key size: " + seVar.mo47739F().size() + ". Valid keys must have " + 64 + " bytes.");
        }
    }
}
