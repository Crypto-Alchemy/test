package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.k */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4127k extends C4105e0<C4127k, C4128a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4127k zzi;
    private static volatile l69<C4127k> zzj;
    private int zzc;
    private zzfi$zze zzd;
    private C4115g zze;
    private C4112f zzf;
    private int zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.vision.k$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4128a extends C4105e0.C4107b<C4127k, C4128a> implements r59 {
        public C4128a() {
            super(C4127k.zzi);
        }

        /* renamed from: v */
        public final C4128a mo31219v(C4112f fVar) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((C4127k) this.f22863d).mo31218y(fVar);
            return this;
        }

        public /* synthetic */ C4128a(C4130l lVar) {
            this();
        }
    }

    static {
        C4127k kVar = new C4127k();
        zzi = kVar;
        C4105e0.m34223s(C4127k.class, kVar);
    }

    /* renamed from: x */
    public static C4128a m34303x() {
        return (C4128a) zzi.mo31180u();
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.k>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4127k> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4127k();
            case 2:
                return new C4128a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                l69<C4127k> l692 = zzj;
                l69<C4127k> l693 = l692;
                if (l692 == null) {
                    synchronized (C4127k.class) {
                        l69<C4127k> l694 = zzj;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zzi);
                            zzj = aVar;
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

    /* renamed from: y */
    public final void mo31218y(C4112f fVar) {
        fVar.getClass();
        this.zzf = fVar;
        this.zzc |= 4;
    }
}
