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

/* renamed from: he */
/* compiled from: AesEaxKeyManager */
public final class C5894he extends hb3<C5838fe> {

    /* renamed from: he$a */
    /* compiled from: AesEaxKeyManager */
    public class C5895a extends av4<C5954id, C5838fe> {
        public C5895a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(C5838fe feVar) throws GeneralSecurityException {
            return new C5786ee(feVar.mo42549G().toByteArray(), feVar.mo42550H().mo43574F());
        }
    }

    /* renamed from: he$b */
    /* compiled from: AesEaxKeyManager */
    public class C5896b extends hb3.C5887a<C5862ge, C5838fe> {
        public C5896b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<C5862ge>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            hashMap.put("AES128_EAX", C5894he.m45165l(16, 16, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            hashMap.put("AES128_EAX_RAW", C5894he.m45165l(16, 16, outputPrefixType2));
            hashMap.put("AES256_EAX", C5894he.m45165l(32, 16, outputPrefixType));
            hashMap.put("AES256_EAX_RAW", C5894he.m45165l(32, 16, outputPrefixType2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C5838fe mo29955a(C5862ge geVar) throws GeneralSecurityException {
            return (C5838fe) C5838fe.m44268J().mo42555t(ByteString.copyFrom(y65.m54637c(geVar.mo42875F()))).mo42556u(geVar.mo42876G()).mo42557v(C5894he.this.mo43162m()).build();
        }

        /* renamed from: g */
        public C5862ge mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return C5862ge.m44698I(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(C5862ge geVar) throws GeneralSecurityException {
            a87.m31749a(geVar.mo42875F());
            if (geVar.mo42876G().mo43574F() != 12 && geVar.mo42876G().mo43574F() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public C5894he() {
        super(C5838fe.class, new C5895a(C5954id.class));
    }

    /* renamed from: l */
    public static hb3.C5887a.C5888a<C5862ge> m45165l(int i, int i2, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new hb3.C5887a.C5888a<>((C5862ge) C5862ge.m44697H().mo42879t(i).mo42880u((C5955ie) C5955ie.m45686G().mo43576t(i2).build()).build(), outputPrefixType);
    }

    /* renamed from: o */
    public static void m45166o(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new C5894he(), z);
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: f */
    public hb3.C5887a<C5862ge, C5838fe> mo29946f() {
        return new C5896b(C5862ge.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: m */
    public int mo43162m() {
        return 0;
    }

    /* renamed from: n */
    public C5838fe mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return C5838fe.m44269K(byteString, C4734l.m38174b());
    }

    /* renamed from: p */
    public void mo29949j(C5838fe feVar) throws GeneralSecurityException {
        a87.m31751c(feVar.mo42551I(), mo43162m());
        a87.m31749a(feVar.mo42549G().size());
        if (feVar.mo42550H().mo43574F() != 12 && feVar.mo42550H().mo43574F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
