package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zzfi$zzg extends C4105e0<zzfi$zzg, C4147a> implements r59 {
    /* access modifiers changed from: private */
    public static final zzfi$zzg zzj;
    private static volatile l69<zzfi$zzg> zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.zzfi$zzg$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4147a extends C4105e0.C4107b<zzfi$zzg, C4147a> implements r59 {
        public C4147a() {
            super(zzfi$zzg.zzj);
        }

        public /* synthetic */ C4147a(C4130l lVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public enum zzb implements q19 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);
        

        /* renamed from: d */
        public static final z19<zzb> f22928d = null;
        private final int zze;

        /* access modifiers changed from: public */
        static {
            f22928d = new C4135q();
        }

        /* access modifiers changed from: public */
        zzb(int i) {
            this.zze = i;
        }

        public static w19 zzb() {
            return C4136r.f22886a;
        }

        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zze;
        }

        public static zzb zza(int i) {
            if (i == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public enum zzc implements q19 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);
        

        /* renamed from: d */
        public static final z19<zzc> f22931d = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            f22931d = new C4138t();
        }

        /* access modifiers changed from: public */
        zzc(int i) {
            this.zzf = i;
        }

        public static w19 zzb() {
            return C4137s.f22887a;
        }

        public final String toString() {
            return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }

        public static zzc zza(int i) {
            if (i == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i == 1) {
                return LANDMARK_NONE;
            }
            if (i == 2) {
                return LANDMARK_ALL;
            }
            if (i != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public enum zzd implements q19 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);
        

        /* renamed from: d */
        public static final z19<zzd> f22934d = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            f22934d = new C4139u();
        }

        /* access modifiers changed from: public */
        zzd(int i) {
            this.zzf = i;
        }

        public static w19 zzb() {
            return C4140v.f22888a;
        }

        public final String toString() {
            return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }

        public static zzd zza(int i) {
            if (i == 0) {
                return MODE_UNKNOWN;
            }
            if (i == 1) {
                return MODE_ACCURATE;
            }
            if (i == 2) {
                return MODE_FAST;
            }
            if (i != 3) {
                return null;
            }
            return MODE_SELFIE;
        }
    }

    static {
        zzfi$zzg zzfi_zzg = new zzfi$zzg();
        zzj = zzfi_zzg;
        C4105e0.m34223s(zzfi$zzg.class, zzfi_zzg);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.zzfi$zzg>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<zzfi$zzg> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new zzfi$zzg();
            case 2:
                return new C4147a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", zzd.zzb(), "zze", zzc.zzb(), "zzf", zzb.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                l69<zzfi$zzg> l692 = zzk;
                l69<zzfi$zzg> l693 = l692;
                if (l692 == null) {
                    synchronized (zzfi$zzg.class) {
                        l69<zzfi$zzg> l694 = zzk;
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
