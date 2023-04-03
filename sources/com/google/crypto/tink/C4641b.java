package com.google.crypto.tink;

import com.google.crypto.tink.proto.C4663a;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.b */
/* compiled from: KeysetManager */
public final class C4641b {

    /* renamed from: a */
    public final C4663a.C4665b f25031a;

    public C4641b(C4663a.C4665b bVar) {
        this.f25031a = bVar;
    }

    /* renamed from: i */
    public static C4641b m37069i() {
        return new C4641b(C4663a.m37142L());
    }

    /* renamed from: j */
    public static C4641b m37070j(C4640a aVar) {
        return new C4641b((C4663a.C4665b) aVar.mo35244f().toBuilder());
    }

    /* renamed from: a */
    public synchronized C4641b mo35251a(KeyTemplate keyTemplate) throws GeneralSecurityException {
        mo35252b(keyTemplate.mo35243b(), false);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public synchronized int mo35252b(cb3 cb3, boolean z) throws GeneralSecurityException {
        C4663a.C4666c f;
        f = mo35256f(cb3);
        this.f25031a.mo35307t(f);
        if (z) {
            this.f25031a.mo35311x(f.mo35313I());
        }
        return f.mo35313I();
    }

    /* renamed from: c */
    public final synchronized C4663a.C4666c mo35253c(KeyData keyData, OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int g;
        g = mo35257g();
        if (outputPrefixType != OutputPrefixType.UNKNOWN_PREFIX) {
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C4663a.C4666c) C4663a.C4666c.m37162M().mo35321t(keyData).mo35322u(g).mo35324w(KeyStatusType.ENABLED).mo35323v(outputPrefixType).build();
    }

    /* renamed from: d */
    public synchronized C4640a mo35254d() throws GeneralSecurityException {
        return C4640a.m37060e((C4663a) this.f25031a.build());
    }

    /* renamed from: e */
    public final synchronized boolean mo35255e(int i) {
        for (C4663a.C4666c I : this.f25031a.mo35310w()) {
            if (I.mo35313I() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final synchronized C4663a.C4666c mo35256f(cb3 cb3) throws GeneralSecurityException {
        return mo35253c(C4650d.m37114j(cb3), cb3.mo29914H());
    }

    /* renamed from: g */
    public final synchronized int mo35257g() {
        int b;
        b = r67.m50955b();
        while (mo35255e(b)) {
            b = r67.m50955b();
        }
        return b;
    }

    /* renamed from: h */
    public synchronized C4641b mo35258h(int i) throws GeneralSecurityException {
        int i2 = 0;
        while (i2 < this.f25031a.mo35309v()) {
            C4663a.C4666c u = this.f25031a.mo35308u(i2);
            if (u.mo35313I() != i) {
                i2++;
            } else if (u.mo35315K().equals(KeyStatusType.ENABLED)) {
                this.f25031a.mo35311x(i);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
