package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.hb3;

/* renamed from: yb3 */
/* compiled from: KmsAeadKeyManager */
public class yb3 extends hb3<wb3> {

    /* renamed from: yb3$a */
    /* compiled from: KmsAeadKeyManager */
    public class C6730a extends av4<C5954id, wb3> {
        public C6730a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C5954id mo29370a(wb3 wb3) throws GeneralSecurityException {
            String E = wb3.mo49142F().mo49442E();
            return ac3.m31774a(E).mo47797b(E);
        }
    }

    /* renamed from: yb3$b */
    /* compiled from: KmsAeadKeyManager */
    public class C6731b extends hb3.C5887a<xb3, wb3> {
        public C6731b(Class cls) {
            super(cls);
        }

        /* renamed from: f */
        public wb3 mo29955a(xb3 xb3) throws GeneralSecurityException {
            return (wb3) wb3.m53800H().mo49146t(xb3).mo49147u(yb3.this.mo49622k()).build();
        }

        /* renamed from: g */
        public xb3 mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return xb3.m54337F(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(xb3 xb3) throws GeneralSecurityException {
        }
    }

    public yb3() {
        super(wb3.class, new C6730a(C5954id.class));
    }

    /* renamed from: m */
    public static void m54675m(boolean z) throws GeneralSecurityException {
        C4650d.m37115k(new yb3(), z);
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    /* renamed from: f */
    public hb3.C5887a<xb3, wb3> mo29946f() {
        return new C6731b(xb3.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    /* renamed from: k */
    public int mo49622k() {
        return 0;
    }

    /* renamed from: l */
    public wb3 mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return wb3.m53801I(byteString, C4734l.m38174b());
    }

    /* renamed from: n */
    public void mo29949j(wb3 wb3) throws GeneralSecurityException {
        a87.m31751c(wb3.mo49143G(), mo49622k());
    }
}
