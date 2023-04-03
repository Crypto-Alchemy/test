package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.d */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4100d extends C4105e0<C4100d, C4101a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4100d zzd;
    private static volatile l69<C4100d> zze;
    private h29<C4121i> zzc = C4105e0.m34226w();

    /* renamed from: com.google.android.gms.internal.vision.d$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4101a extends C4105e0.C4107b<C4100d, C4101a> implements r59 {
        public C4101a() {
            super(C4100d.zzd);
        }

        public /* synthetic */ C4101a(C4130l lVar) {
            this();
        }
    }

    static {
        C4100d dVar = new C4100d();
        zzd = dVar;
        C4105e0.m34223s(C4100d.class, dVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [l69<com.google.android.gms.internal.vision.d>, com.google.android.gms.internal.vision.e0$a] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4100d> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4100d();
            case 2:
                return new C4101a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C4121i.class});
            case 4:
                return zzd;
            case 5:
                l69<C4100d> l692 = zze;
                l69<C4100d> l693 = l692;
                if (l692 == null) {
                    synchronized (C4100d.class) {
                        l69<C4100d> l694 = zze;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zzd);
                            zze = aVar;
                            l69 = aVar;
                        }
                    }
                    l693 = l69;
                }
                return l693;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
