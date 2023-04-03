package p000;

import com.google.crypto.tink.C4642c;
import com.google.crypto.tink.proto.KeyStatusType;
import java.security.GeneralSecurityException;
import java.util.List;
import p000.sx3;
import p000.tx3;

/* renamed from: ux3 */
/* compiled from: MonitoringUtil */
public final class ux3 {

    /* renamed from: a */
    public static final sx3.C6506a f34747a = new C6587b((C6586a) null);

    /* renamed from: ux3$a */
    /* compiled from: MonitoringUtil */
    public static /* synthetic */ class C6586a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34748a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.crypto.tink.proto.KeyStatusType[] r0 = com.google.crypto.tink.proto.KeyStatusType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34748a = r0
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34748a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34748a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ux3.C6586a.<clinit>():void");
        }
    }

    /* renamed from: ux3$b */
    /* compiled from: MonitoringUtil */
    public static class C6587b implements sx3.C6506a {
        public C6587b() {
        }

        public /* synthetic */ C6587b(C6586a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo47892a(int i, long j) {
        }

        /* renamed from: b */
        public void mo47893b() {
        }
    }

    /* renamed from: a */
    public static <P> tx3 m53032a(C4642c<P> cVar) {
        tx3.C6555b a = tx3.m52539a();
        a.mo48252d(cVar.mo35260d());
        for (List<C4642c.C4645c<P>> it : cVar.mo35259c()) {
            for (C4642c.C4645c cVar2 : it) {
                a.mo48249a(m53033b(cVar2.mo35277g()), cVar2.mo35273c(), cVar2.mo35275e());
            }
        }
        if (cVar.mo35261e() != null) {
            a.mo48253e(cVar.mo35261e().mo35273c());
        }
        try {
            return a.mo48250b();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static ab3 m53033b(KeyStatusType keyStatusType) {
        int i = C6586a.f34748a[keyStatusType.ordinal()];
        if (i == 1) {
            return ab3.f20883b;
        }
        if (i == 2) {
            return ab3.f20884c;
        }
        if (i == 3) {
            return ab3.f20885d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
