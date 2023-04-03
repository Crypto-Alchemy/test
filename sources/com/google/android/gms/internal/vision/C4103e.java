package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.e */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4103e extends C4105e0<C4103e, C4104a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4103e zzj;
    private static volatile l69<C4103e> zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.e$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4104a extends C4105e0.C4107b<C4103e, C4104a> implements r59 {
        public C4104a() {
            super(C4103e.zzj);
        }

        public /* synthetic */ C4104a(C4130l lVar) {
            this();
        }
    }

    static {
        C4103e eVar = new C4103e();
        zzj = eVar;
        C4105e0.m34223s(C4103e.class, eVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [l69<com.google.android.gms.internal.vision.e>, com.google.android.gms.internal.vision.e0$a] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4103e> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4103e();
            case 2:
                return new C4104a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                l69<C4103e> l692 = zzk;
                l69<C4103e> l693 = l692;
                if (l692 == null) {
                    synchronized (C4103e.class) {
                        l69<C4103e> l694 = zzk;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zzj);
                            zzk = aVar;
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
