package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.b */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4093b extends C4105e0<C4093b, C4094a> implements r59 {
    private static final d29<Integer, zzgz> zzd = new pq8();
    /* access modifiers changed from: private */
    public static final C4093b zze;
    private static volatile l69<C4093b> zzf;
    private f29 zzc = C4105e0.m34225v();

    /* renamed from: com.google.android.gms.internal.vision.b$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4094a extends C4105e0.C4107b<C4093b, C4094a> implements r59 {
        public C4094a() {
            super(C4093b.zze);
        }

        public /* synthetic */ C4094a(C4130l lVar) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [d29<java.lang.Integer, com.google.android.gms.internal.vision.zzgz>, pq8] */
    static {
        C4093b bVar = new C4093b();
        zze = bVar;
        C4105e0.m34223s(C4093b.class, bVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.b>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4093b> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4093b();
            case 2:
                return new C4094a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", zzgz.zzb()});
            case 4:
                return zze;
            case 5:
                l69<C4093b> l692 = zzf;
                l69<C4093b> l693 = l692;
                if (l692 == null) {
                    synchronized (C4093b.class) {
                        l69<C4093b> l694 = zzf;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zze);
                            zzf = aVar;
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
