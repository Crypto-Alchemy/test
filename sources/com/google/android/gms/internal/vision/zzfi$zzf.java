package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zzfi$zzf extends C4105e0<zzfi$zzf, C4146a> implements r59 {
    /* access modifiers changed from: private */
    public static final zzfi$zzf zzl;
    private static volatile l69<zzfi$zzf> zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private h29<String> zzf = C4105e0.m34226w();
    private int zzg;
    private String zzh = "";
    private long zzi;
    private long zzj;
    private h29<C4124j> zzk = C4105e0.m34226w();

    /* renamed from: com.google.android.gms.internal.vision.zzfi$zzf$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4146a extends C4105e0.C4107b<zzfi$zzf, C4146a> implements r59 {
        public C4146a() {
            super(zzfi$zzf.zzl);
        }

        /* renamed from: v */
        public final C4146a mo31235v(long j) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzf) this.f22863d).mo31234y(j);
            return this;
        }

        /* renamed from: w */
        public final C4146a mo31236w(Iterable<? extends C4124j> iterable) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzf) this.f22863d).mo31231C(iterable);
            return this;
        }

        /* renamed from: x */
        public final C4146a mo31237x(String str) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzf) this.f22863d).mo31232D(str);
            return this;
        }

        /* renamed from: y */
        public final C4146a mo31238y(long j) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzf) this.f22863d).mo31233F(j);
            return this;
        }

        public /* synthetic */ C4146a(C4130l lVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public enum zza implements q19 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);
        

        /* renamed from: k */
        public static final z19<zza> f22925k = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            f22925k = new C4134p();
        }

        /* access modifiers changed from: public */
        zza(int i) {
            this.zzf = i;
        }

        public static w19 zzb() {
            return C4133o.f22885a;
        }

        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }

        public static zza zza(int i) {
            if (i == 0) {
                return RESULT_UNKNOWN;
            }
            if (i == 1) {
                return RESULT_SUCCESS;
            }
            if (i == 2) {
                return RESULT_FAIL;
            }
            if (i != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }
    }

    static {
        zzfi$zzf zzfi_zzf = new zzfi$zzf();
        zzl = zzfi_zzf;
        C4105e0.m34223s(zzfi$zzf.class, zzfi_zzf);
    }

    /* renamed from: x */
    public static C4146a m34346x() {
        return (C4146a) zzl.mo31180u();
    }

    /* renamed from: C */
    public final void mo31231C(Iterable<? extends C4124j> iterable) {
        h29<C4124j> h29 = this.zzk;
        if (!h29.zza()) {
            this.zzk = C4105e0.m34222r(h29);
        }
        C4143y.m34318b(iterable, this.zzk);
    }

    /* renamed from: D */
    public final void mo31232D(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* renamed from: F */
    public final void mo31233F(long j) {
        this.zzc |= 32;
        this.zzj = j;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.zzfi$zzf>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<zzfi$zzf> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new zzfi$zzf();
            case 2:
                return new C4146a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zza.zzb(), "zzh", "zzi", "zzj", "zzk", C4124j.class});
            case 4:
                return zzl;
            case 5:
                l69<zzfi$zzf> l692 = zzm;
                l69<zzfi$zzf> l693 = l692;
                if (l692 == null) {
                    synchronized (zzfi$zzf.class) {
                        l69<zzfi$zzf> l694 = zzm;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zzl);
                            zzm = aVar;
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
    public final void mo31234y(long j) {
        this.zzc |= 16;
        this.zzi = j;
    }
}
