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
import javax.crypto.spec.SecretKeySpec;
import p000.hb3;

/* renamed from: im2 */
/* compiled from: HmacKeyManager */
public final class im2 extends hb3<gm2> {

    /* renamed from: im2$a */
    /* compiled from: HmacKeyManager */
    public class C5969a extends av4<lm3, gm2> {
        public C5969a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public lm3 mo29370a(gm2 gm2) throws GeneralSecurityException {
            HashType G = gm2.mo42912I().mo44508G();
            SecretKeySpec secretKeySpec = new SecretKeySpec(gm2.mo42911H().toByteArray(), "HMAC");
            int H = gm2.mo42912I().mo44509H();
            int i = C5971c.f29958a[G.ordinal()];
            if (i == 1) {
                return new wu4(new vu4("HMACSHA1", secretKeySpec), H);
            }
            if (i == 2) {
                return new wu4(new vu4("HMACSHA224", secretKeySpec), H);
            }
            if (i == 3) {
                return new wu4(new vu4("HMACSHA256", secretKeySpec), H);
            }
            if (i == 4) {
                return new wu4(new vu4("HMACSHA384", secretKeySpec), H);
            }
            if (i == 5) {
                return new wu4(new vu4("HMACSHA512", secretKeySpec), H);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: im2$b */
    /* compiled from: HmacKeyManager */
    public class C5970b extends hb3.C5887a<hm2, gm2> {
        public C5970b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<hm2>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            HashType hashType = HashType.SHA256;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", im2.m45775m(32, 16, hashType, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", im2.m45775m(32, 16, hashType, outputPrefixType2));
            hashMap.put("HMAC_SHA256_256BITTAG", im2.m45775m(32, 32, hashType, outputPrefixType));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", im2.m45775m(32, 32, hashType, outputPrefixType2));
            HashType hashType2 = HashType.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", im2.m45775m(64, 16, hashType2, outputPrefixType));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", im2.m45775m(64, 16, hashType2, outputPrefixType2));
            hashMap.put("HMAC_SHA512_256BITTAG", im2.m45775m(64, 32, hashType2, outputPrefixType));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", im2.m45775m(64, 32, hashType2, outputPrefixType2));
            hashMap.put("HMAC_SHA512_512BITTAG", im2.m45775m(64, 64, hashType2, outputPrefixType));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", im2.m45775m(64, 64, hashType2, outputPrefixType2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public gm2 mo29955a(hm2 hm2) throws GeneralSecurityException {
            return (gm2) gm2.m44778K().mo42919v(im2.this.mo43647n()).mo42918u(hm2.mo43310H()).mo42917t(ByteString.copyFrom(y65.m54637c(hm2.mo43309G()))).build();
        }

        /* renamed from: g */
        public hm2 mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return hm2.m45294J(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(hm2 hm2) throws GeneralSecurityException {
            if (hm2.mo43309G() >= 16) {
                im2.m45777r(hm2.mo43310H());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* renamed from: im2$c */
    /* compiled from: HmacKeyManager */
    public static /* synthetic */ class C5971c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29958a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29958a = r0
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29958a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA224     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29958a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29958a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29958a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.im2.C5971c.<clinit>():void");
        }
    }

    public im2() {
        super(gm2.class, new C5969a(lm3.class));
    }

    /* renamed from: m */
    public static hb3.C5887a.C5888a<hm2> m45775m(int i, int i2, HashType hashType, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new hb3.C5887a.C5888a<>((hm2) hm2.m45293I().mo43314u((jm2) jm2.m46607I().mo44512t(hashType).mo44513u(i2).build()).mo43313t(i).build(), outputPrefixType);
    }

    /* renamed from: p */
    public static void m45776p(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new im2(), z);
    }

    /* renamed from: r */
    public static void m45777r(jm2 jm2) throws GeneralSecurityException {
        if (jm2.mo44509H() >= 10) {
            int i = C5971c.f29958a[jm2.mo44508G().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (jm2.mo44509H() > 64) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (jm2.mo44509H() > 48) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (jm2.mo44509H() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (jm2.mo44509H() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (jm2.mo44509H() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public TinkFipsUtil.AlgorithmFipsCompatibility mo43119a() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: f */
    public hb3.C5887a<hm2, gm2> mo29946f() {
        return new C5970b(hm2.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: n */
    public int mo43647n() {
        return 0;
    }

    /* renamed from: o */
    public gm2 mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return gm2.m44779L(byteString, C4734l.m38174b());
    }

    /* renamed from: q */
    public void mo29949j(gm2 gm2) throws GeneralSecurityException {
        a87.m31751c(gm2.mo42913J(), mo43647n());
        if (gm2.mo42911H().size() >= 16) {
            m45777r(gm2.mo42912I());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
