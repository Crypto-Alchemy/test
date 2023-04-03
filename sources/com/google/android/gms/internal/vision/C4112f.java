package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.f */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4112f extends C4105e0<C4112f, C4113a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4112f zzg;
    private static volatile l69<C4112f> zzh;
    private int zzc;
    private zzfi$zzj zzd;
    private C4118h zze;
    private h29<zzfi$zzf> zzf = C4105e0.m34226w();

    /* renamed from: com.google.android.gms.internal.vision.f$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4113a extends C4105e0.C4107b<C4112f, C4113a> implements r59 {
        public C4113a() {
            super(C4112f.zzg);
        }

        /* renamed from: v */
        public final C4113a mo31203v(zzfi$zzj zzfi_zzj) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((C4112f) this.f22863d).mo31200A(zzfi_zzj);
            return this;
        }

        /* renamed from: w */
        public final C4113a mo31204w(Iterable<? extends zzfi$zzf> iterable) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((C4112f) this.f22863d).mo31201B(iterable);
            return this;
        }

        public /* synthetic */ C4113a(C4130l lVar) {
            this();
        }
    }

    static {
        C4112f fVar = new C4112f();
        zzg = fVar;
        C4105e0.m34223s(C4112f.class, fVar);
    }

    /* renamed from: x */
    public static C4113a m34255x() {
        return (C4113a) zzg.mo31180u();
    }

    /* renamed from: A */
    public final void mo31200A(zzfi$zzj zzfi_zzj) {
        zzfi_zzj.getClass();
        this.zzd = zzfi_zzj;
        this.zzc |= 1;
    }

    /* renamed from: B */
    public final void mo31201B(Iterable<? extends zzfi$zzf> iterable) {
        mo31202D();
        C4143y.m34318b(iterable, this.zzf);
    }

    /* renamed from: D */
    public final void mo31202D() {
        h29<zzfi$zzf> h29 = this.zzf;
        if (!h29.zza()) {
            this.zzf = C4105e0.m34222r(h29);
        }
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.f>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4112f> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4112f();
            case 2:
                return new C4113a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", zzfi$zzf.class});
            case 4:
                return zzg;
            case 5:
                l69<C4112f> l692 = zzh;
                l69<C4112f> l693 = l692;
                if (l692 == null) {
                    synchronized (C4112f.class) {
                        l69<C4112f> l694 = zzh;
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
