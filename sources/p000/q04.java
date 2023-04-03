package p000;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import p000.sw5;

/* renamed from: q04 */
/* compiled from: MutableSerializationRegistry */
public final class q04 {

    /* renamed from: b */
    public static final q04 f32897b = new q04();

    /* renamed from: a */
    public final AtomicReference<sw5> f32898a = new AtomicReference<>(new sw5.C6503b().mo47880e());

    /* renamed from: a */
    public static q04 m50211a() {
        return f32897b;
    }

    /* renamed from: b */
    public <SerializationT extends rw5> aa3 mo46928b(SerializationT serializationt, ur5 ur5) throws GeneralSecurityException {
        return this.f32898a.get().mo47879e(serializationt, ur5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        return new p000.dg3(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.crypto.tink.internal.TinkBugException("Creating a LegacyProtoKey failed", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.aa3 mo46929c(p000.ay4 r2, p000.ur5 r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0016
            aa3 r2 = r1.mo46928b(r2, r3)     // Catch:{ GeneralSecurityException -> 0x0007 }
            return r2
        L_0x0007:
            dg3 r0 = new dg3     // Catch:{ GeneralSecurityException -> 0x000d }
            r0.<init>(r2, r3)     // Catch:{ GeneralSecurityException -> 0x000d }
            return r0
        L_0x000d:
            r2 = move-exception
            com.google.crypto.tink.internal.TinkBugException r3 = new com.google.crypto.tink.internal.TinkBugException
            java.lang.String r0 = "Creating a LegacyProtoKey failed"
            r3.<init>(r0, r2)
            throw r3
        L_0x0016:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "access cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q04.mo46929c(ay4, ur5):aa3");
    }

    /* renamed from: d */
    public synchronized <SerializationT extends rw5> void mo46930d(wa3<SerializationT> wa3) throws GeneralSecurityException {
        this.f32898a.set(new sw5.C6503b(this.f32898a.get()).mo47881f(wa3).mo47880e());
    }

    /* renamed from: e */
    public synchronized <KeyT extends aa3, SerializationT extends rw5> void mo46931e(za3<KeyT, SerializationT> za3) throws GeneralSecurityException {
        this.f32898a.set(new sw5.C6503b(this.f32898a.get()).mo47882g(za3).mo47880e());
    }

    /* renamed from: f */
    public synchronized <SerializationT extends rw5> void mo46932f(wl4<SerializationT> wl4) throws GeneralSecurityException {
        this.f32898a.set(new sw5.C6503b(this.f32898a.get()).mo47883h(wl4).mo47880e());
    }

    /* renamed from: g */
    public synchronized <ParametersT extends tl4, SerializationT extends rw5> void mo46933g(xl4<ParametersT, SerializationT> xl4) throws GeneralSecurityException {
        this.f32898a.set(new sw5.C6503b(this.f32898a.get()).mo47884i(xl4).mo47880e());
    }
}
