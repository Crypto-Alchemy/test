package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p000.hb3;

/* renamed from: qe */
/* compiled from: AesGcmSivKeyManager */
public final class C6406qe extends hb3<C6313oe> {

    /* renamed from: qe$a */
    /* compiled from: AesGcmSivKeyManager */
    public class C6407a extends av4<C5954id, C6313oe> {
        public C6407a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(C6313oe oeVar) throws GeneralSecurityException {
            return new C6281ne(oeVar.mo46384F().toByteArray());
        }
    }

    /* renamed from: qe$b */
    /* compiled from: AesGcmSivKeyManager */
    public class C6408b extends hb3.C5887a<C6347pe, C6313oe> {
        public C6408b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<C6347pe>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            hashMap.put("AES128_GCM_SIV", C6406qe.m50530m(16, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", C6406qe.m50530m(16, outputPrefixType2));
            hashMap.put("AES256_GCM_SIV", C6406qe.m50530m(32, outputPrefixType));
            hashMap.put("AES256_GCM_SIV_RAW", C6406qe.m50530m(32, outputPrefixType2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C6313oe mo29955a(C6347pe peVar) {
            return (C6313oe) C6313oe.m49279H().mo46388t(ByteString.copyFrom(y65.m54637c(peVar.mo46707E()))).mo46389u(C6406qe.this.mo47071n()).build();
        }

        /* renamed from: g */
        public C6347pe mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return C6347pe.m49879G(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(C6347pe peVar) throws GeneralSecurityException {
            a87.m31749a(peVar.mo46707E());
        }
    }

    public C6406qe() {
        super(C6313oe.class, new C6407a(C5954id.class));
    }

    /* renamed from: l */
    public static boolean m50529l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static hb3.C5887a.C5888a<C6347pe> m50530m(int i, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new hb3.C5887a.C5888a<>((C6347pe) C6347pe.m49878F().mo46709t(i).build(), outputPrefixType);
    }

    /* renamed from: p */
    public static void m50531p(boolean z) throws GeneralSecurityException {
        if (m50529l()) {
            C4650d.m37115k(new C6406qe(), z);
        }
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: f */
    public hb3.C5887a<C6347pe, C6313oe> mo29946f() {
        return new C6408b(C6347pe.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: n */
    public int mo47071n() {
        return 0;
    }

    /* renamed from: o */
    public C6313oe mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return C6313oe.m49280I(byteString, C4734l.m38174b());
    }

    /* renamed from: q */
    public void mo29949j(C6313oe oeVar) throws GeneralSecurityException {
        a87.m31751c(oeVar.mo46385G(), mo47071n());
        a87.m31749a(oeVar.mo46384F().size());
    }
}
