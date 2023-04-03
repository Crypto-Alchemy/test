package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.c */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4097c extends C4105e0<C4097c, C4098a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4097c zzg;
    private static volatile l69<C4097c> zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    /* renamed from: com.google.android.gms.internal.vision.c$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4098a extends C4105e0.C4107b<C4097c, C4098a> implements r59 {
        public C4098a() {
            super(C4097c.zzg);
        }

        public /* synthetic */ C4098a(C4130l lVar) {
            this();
        }
    }

    static {
        C4097c cVar = new C4097c();
        zzg = cVar;
        C4105e0.m34223s(C4097c.class, cVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [l69<com.google.android.gms.internal.vision.c>, com.google.android.gms.internal.vision.e0$a] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4097c> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4097c();
            case 2:
                return new C4098a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", zzgz.zzb(), "zze", zzha.zzb(), "zzf"});
            case 4:
                return zzg;
            case 5:
                l69<C4097c> l692 = zzh;
                l69<C4097c> l693 = l692;
                if (l692 == null) {
                    synchronized (C4097c.class) {
                        l69<C4097c> l694 = zzh;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zzg);
                            zzh = aVar;
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
