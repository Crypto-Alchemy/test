package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zzfi$zzj extends C4105e0<zzfi$zzj, C4148a> implements r59 {
    /* access modifiers changed from: private */
    public static final zzfi$zzj zzi;
    private static volatile l69<zzfi$zzj> zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* renamed from: com.google.android.gms.internal.vision.zzfi$zzj$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4148a extends C4105e0.C4107b<zzfi$zzj, C4148a> implements r59 {
        public C4148a() {
            super(zzfi$zzj.zzi);
        }

        /* renamed from: v */
        public final C4148a mo31247v(long j) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzj) this.f22863d).mo31246y(j);
            return this;
        }

        /* renamed from: w */
        public final C4148a mo31248w(long j) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzj) this.f22863d).mo31243B(j);
            return this;
        }

        /* renamed from: x */
        public final C4148a mo31249x(long j) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzj) this.f22863d).mo31244D(j);
            return this;
        }

        /* renamed from: y */
        public final C4148a mo31250y(long j) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((zzfi$zzj) this.f22863d).mo31245F(j);
            return this;
        }

        public /* synthetic */ C4148a(C4130l lVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public enum zza implements q19 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);
        

        /* renamed from: k */
        public static final z19<zza> f22940k = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            f22940k = new C4142x();
        }

        /* access modifiers changed from: public */
        zza(int i) {
            this.zzf = i;
        }

        public static w19 zzb() {
            return C4141w.f22889a;
        }

        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }

        public static zza zza(int i) {
            if (i == 0) {
                return FORMAT_UNKNOWN;
            }
            if (i == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i == 2) {
                return FORMAT_RGB8;
            }
            if (i != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }
    }

    static {
        zzfi$zzj zzfi_zzj = new zzfi$zzj();
        zzi = zzfi_zzj;
        C4105e0.m34223s(zzfi$zzj.class, zzfi_zzj);
    }

    /* renamed from: x */
    public static C4148a m34363x() {
        return (C4148a) zzi.mo31180u();
    }

    /* renamed from: B */
    public final void mo31243B(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* renamed from: D */
    public final void mo31244D(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* renamed from: F */
    public final void mo31245F(long j) {
        this.zzc |= 16;
        this.zzh = j;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.zzfi$zzj>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<zzfi$zzj> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new zzfi$zzj();
            case 2:
                return new C4148a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", zza.zzb(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                l69<zzfi$zzj> l692 = zzj;
                l69<zzfi$zzj> l693 = l692;
                if (l692 == null) {
                    synchronized (zzfi$zzj.class) {
                        l69<zzfi$zzj> l694 = zzj;
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
    public final void mo31246y(long j) {
        this.zzc |= 2;
        this.zze = j;
    }
}
