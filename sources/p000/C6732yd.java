package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.hb3;

/* renamed from: yd */
/* compiled from: AesCtrHmacAeadKeyManager */
public final class C6732yd extends hb3<C6657wd> {

    /* renamed from: yd$a */
    /* compiled from: AesCtrHmacAeadKeyManager */
    public class C6733a extends av4<C5954id, C6657wd> {
        public C6733a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(C6657wd wdVar) throws GeneralSecurityException {
            return new sp1((pt2) new C3934ce().mo43122e(wdVar.mo49170G(), pt2.class), (lm3) new im2().mo43122e(wdVar.mo49171H(), lm3.class), wdVar.mo49171H().mo42912I().mo44509H());
        }
    }

    /* renamed from: yd$b */
    /* compiled from: AesCtrHmacAeadKeyManager */
    public class C6734b extends hb3.C5887a<C6696xd, C6657wd> {
        public C6734b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<C6696xd>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            HashType hashType = HashType.SHA256;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            HashType hashType2 = hashType;
            hashMap.put("AES128_CTR_HMAC_SHA256", C6732yd.m54700m(16, 16, 32, 16, hashType2, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C6732yd.m54700m(16, 16, 32, 16, hashType2, outputPrefixType2));
            hashMap.put("AES256_CTR_HMAC_SHA256", C6732yd.m54700m(32, 16, 32, 32, hashType2, outputPrefixType));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C6732yd.m54700m(32, 16, 32, 32, hashType2, outputPrefixType2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C6657wd mo29955a(C6696xd xdVar) throws GeneralSecurityException {
            return (C6657wd) C6657wd.m53840J().mo49176t(new C3934ce().mo29946f().mo29955a(xdVar.mo49465F())).mo49177u(new im2().mo29946f().mo29955a(xdVar.mo49466G())).mo49178v(C6732yd.this.mo49631n()).build();
        }

        /* renamed from: g */
        public C6696xd mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return C6696xd.m54359I(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(C6696xd xdVar) throws GeneralSecurityException {
            new C3934ce().mo29946f().mo29957e(xdVar.mo49465F());
            new im2().mo29946f().mo29957e(xdVar.mo49466G());
            a87.m31749a(xdVar.mo49465F().mo29553G());
        }
    }

    public C6732yd() {
        super(C6657wd.class, new C6733a(C5954id.class));
    }

    /* renamed from: l */
    public static C6696xd m54699l(int i, int i2, int i3, int i4, HashType hashType) {
        return (C6696xd) C6696xd.m54358H().mo49469t((C3890be) C3890be.m32489I().mo29558u((C5733de) C5733de.m43463G().mo41909t(i2).build()).mo29557t(i).build()).mo49470u((hm2) hm2.m45293I().mo43314u((jm2) jm2.m46607I().mo44512t(hashType).mo44513u(i4).build()).mo43313t(i3).build()).build();
    }

    /* renamed from: m */
    public static hb3.C5887a.C5888a<C6696xd> m54700m(int i, int i2, int i3, int i4, HashType hashType, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new hb3.C5887a.C5888a<>(m54699l(i, i2, i3, i4, hashType), outputPrefixType);
    }

    /* renamed from: p */
    public static void m54701p(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new C6732yd(), z);
    }

    /* renamed from: a */
    public TinkFipsUtil.AlgorithmFipsCompatibility mo43119a() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: f */
    public hb3.C5887a<C6696xd, C6657wd> mo29946f() {
        return new C6734b(C6696xd.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: n */
    public int mo49631n() {
        return 0;
    }

    /* renamed from: o */
    public C6657wd mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return C6657wd.m53841K(byteString, C4734l.m38174b());
    }

    /* renamed from: q */
    public void mo29949j(C6657wd wdVar) throws GeneralSecurityException {
        a87.m31751c(wdVar.mo49172I(), mo49631n());
        new C3934ce().mo29949j(wdVar.mo49170G());
        new im2().mo29949j(wdVar.mo49171H());
    }
}
