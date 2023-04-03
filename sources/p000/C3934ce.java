package p000;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.hb3;

/* renamed from: ce */
/* compiled from: AesCtrKeyManager */
public class C3934ce extends hb3<C3807ae> {

    /* renamed from: ce$a */
    /* compiled from: AesCtrKeyManager */
    public class C3935a extends av4<pt2, C3807ae> {
        public C3935a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public pt2 mo29370a(C3807ae aeVar) throws GeneralSecurityException {
            return new C6763zd(aeVar.mo28921H().toByteArray(), aeVar.mo28922I().mo41907F());
        }
    }

    /* renamed from: ce$b */
    /* compiled from: AesCtrKeyManager */
    public class C3936b extends hb3.C5887a<C3890be, C3807ae> {
        public C3936b(Class cls) {
            super(cls);
        }

        /* renamed from: f */
        public C3807ae mo29955a(C3890be beVar) throws GeneralSecurityException {
            return (C3807ae) C3807ae.m31785K().mo28929u(beVar.mo29554H()).mo28928t(ByteString.copyFrom(y65.m54637c(beVar.mo29553G()))).mo28930v(C3934ce.this.mo29950l()).build();
        }

        /* renamed from: g */
        public C3890be mo29956d(ByteString byteString) throws InvalidProtocolBufferException {
            return C3890be.m32490J(byteString, C4734l.m38174b());
        }

        /* renamed from: h */
        public void mo29957e(C3890be beVar) throws GeneralSecurityException {
            a87.m31749a(beVar.mo29553G());
            C3934ce.this.mo29953o(beVar.mo29554H());
        }
    }

    public C3934ce() {
        super(C3807ae.class, new C3935a(pt2.class));
    }

    /* renamed from: d */
    public String mo29945d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: f */
    public hb3.C5887a<C3890be, C3807ae> mo29946f() {
        return new C3936b(C3890be.class);
    }

    /* renamed from: g */
    public KeyData.KeyMaterialType mo29947g() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: l */
    public int mo29950l() {
        return 0;
    }

    /* renamed from: m */
    public C3807ae mo29948h(ByteString byteString) throws InvalidProtocolBufferException {
        return C3807ae.m31786L(byteString, C4734l.m38174b());
    }

    /* renamed from: n */
    public void mo29949j(C3807ae aeVar) throws GeneralSecurityException {
        a87.m31751c(aeVar.mo28923J(), mo29950l());
        a87.m31749a(aeVar.mo28921H().size());
        mo29953o(aeVar.mo28922I());
    }

    /* renamed from: o */
    public final void mo29953o(C5733de deVar) throws GeneralSecurityException {
        if (deVar.mo41907F() < 12 || deVar.mo41907F() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
