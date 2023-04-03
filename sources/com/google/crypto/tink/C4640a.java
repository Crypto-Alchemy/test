package com.google.crypto.tink;

import com.google.crypto.tink.C4642c;
import com.google.crypto.tink.proto.C4663a;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.a */
/* compiled from: KeysetHandle */
public final class C4640a {

    /* renamed from: a */
    public final C4663a f25029a;

    /* renamed from: b */
    public final rx3 f25030b = rx3.f33629b;

    public C4640a(C4663a aVar) {
        this.f25029a = aVar;
    }

    /* renamed from: a */
    public static void m37056a(tp1 tp1) throws GeneralSecurityException {
        if (tp1 == null || tp1.mo48149F().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    public static void m37057b(C4663a aVar) throws GeneralSecurityException {
        if (aVar == null || aVar.mo35303I() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: c */
    public static C4663a m37058c(tp1 tp1, C5954id idVar, byte[] bArr) throws GeneralSecurityException {
        try {
            C4663a M = C4663a.m37143M(idVar.mo29527b(tp1.mo48149F().toByteArray(), bArr), C4734l.m38174b());
            m37057b(M);
            return M;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: d */
    public static tp1 m37059d(C4663a aVar, C5954id idVar, byte[] bArr) throws GeneralSecurityException {
        byte[] a = idVar.mo29526a(aVar.toByteArray(), bArr);
        try {
            if (C4663a.m37143M(idVar.mo29527b(a, bArr), C4734l.m38174b()).equals(aVar)) {
                return (tp1) tp1.m52402G().mo48152t(ByteString.copyFrom(a)).mo48153u(q67.m50354b(aVar)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: e */
    public static final C4640a m37060e(C4663a aVar) throws GeneralSecurityException {
        m37057b(aVar);
        return new C4640a(aVar);
    }

    /* renamed from: j */
    public static final C4640a m37061j(tb3 tb3, C5954id idVar) throws GeneralSecurityException, IOException {
        return m37062k(tb3, idVar, new byte[0]);
    }

    /* renamed from: k */
    public static final C4640a m37062k(tb3 tb3, C5954id idVar, byte[] bArr) throws GeneralSecurityException, IOException {
        tp1 a = tb3.mo28685a();
        m37056a(a);
        return new C4640a(m37058c(a, idVar, bArr));
    }

    /* renamed from: f */
    public C4663a mo35244f() {
        return this.f25029a;
    }

    /* renamed from: g */
    public sb3 mo35245g() {
        return q67.m50354b(this.f25029a);
    }

    /* renamed from: h */
    public <P> P mo35246h(Class<P> cls) throws GeneralSecurityException {
        Class<?> c = C4650d.m37107c(cls);
        if (c != null) {
            return mo35247i(cls, c);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* renamed from: i */
    public final <B, P> P mo35247i(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        q67.m50356d(this.f25029a);
        C4642c.C4644b<P> j = C4642c.m37081j(cls2);
        j.mo35270e(this.f25030b);
        for (C4663a.C4666c next : this.f25029a.mo35304J()) {
            if (next.mo35315K() == KeyStatusType.ENABLED) {
                Object d = C4650d.m37108d(next.mo35312H(), cls2);
                if (next.mo35313I() == this.f25029a.mo35305K()) {
                    j.mo35266a(d, next);
                } else {
                    j.mo35267b(d, next);
                }
            }
        }
        return C4650d.m37118n(j.mo35269d(), cls);
    }

    /* renamed from: l */
    public void mo35248l(ub3 ub3, C5954id idVar) throws GeneralSecurityException, IOException {
        mo35249m(ub3, idVar, new byte[0]);
    }

    /* renamed from: m */
    public void mo35249m(ub3 ub3, C5954id idVar, byte[] bArr) throws GeneralSecurityException, IOException {
        ub3.mo29408b(m37059d(this.f25029a, idVar, bArr));
    }

    public String toString() {
        return mo35245g().toString();
    }
}
