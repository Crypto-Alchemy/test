package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.j */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4124j extends C4105e0<C4124j, C4125a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4124j zzh;
    private static volatile l69<C4124j> zzi;
    private int zzc;
    private C4100d zzd;
    private int zze;
    private C4103e zzf;
    private C4097c zzg;

    /* renamed from: com.google.android.gms.internal.vision.j$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4125a extends C4105e0.C4107b<C4124j, C4125a> implements r59 {
        public C4125a() {
            super(C4124j.zzh);
        }

        public /* synthetic */ C4125a(C4130l lVar) {
            this();
        }
    }

    static {
        C4124j jVar = new C4124j();
        zzh = jVar;
        C4105e0.m34223s(C4124j.class, jVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.j>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4124j> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4124j();
            case 2:
                return new C4125a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                l69<C4124j> l692 = zzi;
                l69<C4124j> l693 = l692;
                if (l692 == null) {
                    synchronized (C4124j.class) {
                        l69<C4124j> l694 = zzi;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zzh);
                            zzi = aVar;
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
