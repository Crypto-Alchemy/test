package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.hb3;

/* renamed from: me */
/* compiled from: AesGcmKeyManager */
public final class C6242me extends hb3<C6144ke> {

    /* renamed from: me$a */
    /* compiled from: AesGcmKeyManager */
    public class C6243a extends av4<C5954id, C6144ke> {
        public C6243a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(C6144ke keVar) throws GeneralSecurityException {
            return new C6099je(keVar.mo44769F().toByteArray());
        }
    }

    /* renamed from: me$b */
    /* compiled from: AesGcmKeyManager */
    public class C6244b extends hb3.C5887a<C6217le, C6144ke> {
        public C6244b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public Map<String, hb3.C5887a.C5888a<C6217le>> mo43125c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            hashMap.put("AES128_GCM", C6242me.m48249l(16, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            hashMap.put("AES128_GCM_RAW", C6242me.m48249l(16, outputPrefixType2));
            hashMap.put("AES256_GCM", C6242me.m48249l(32, outputPrefixType));
            hashMap.put("AES256_GCM_RAW", C6242me.m48249l(32, outputPrefixType2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C6144ke mo29955a(C6217le leVar) throws GeneralSecurityException {
            return (C6144ke) C6144ke.m47024H().mo44773t(ByteString.copyFrom(y65.m54637c(leVar.mo45424E()))).mo44774u(C6242me.this.mo45770m()).build();
        }

        /* renamed from: g */
        public C6217le mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return C6217le.m47783G(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(C6217le leVar) throws GeneralSecurityException {
            a87.m31749a(leVar.mo45424E());
        }
    }

    public C6242me() {
        super(C6144ke.class, new C6243a(C5954id.class));
    }

    /* renamed from: l */
    public static hb3.C5887a.C5888a<C6217le> m48249l(int i, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new hb3.C5887a.C5888a<>((C6217le) C6217le.m47782F().mo45426t(i).build(), outputPrefixType);
    }

    /* renamed from: o */
    public static void m48250o(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new C6242me(), z);
    }

    /* renamed from: a */
    public TinkFipsUtil.AlgorithmFipsCompatibility mo43119a() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: f */
    public hb3.C5887a<C6217le, C6144ke> mo29946f() {
        return new C6244b(C6217le.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: m */
    public int mo45770m() {
        return 0;
    }

    /* renamed from: n */
    public C6144ke mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return C6144ke.m47025I(byteString, C4734l.m38174b());
    }

    /* renamed from: p */
    public void mo29949j(C6144ke keVar) throws GeneralSecurityException {
        a87.m31751c(keVar.mo44770G(), mo45770m());
        a87.m31749a(keVar.mo44769F().size());
    }
}
