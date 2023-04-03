package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zzfi$zze extends C4105e0<zzfi$zze, C4145a> implements r59 {
    /* access modifiers changed from: private */
    public static final zzfi$zze zzl;
    private static volatile l69<zzfi$zze> zzm;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj = "";
    private boolean zzk;

    /* renamed from: com.google.android.gms.internal.vision.zzfi$zze$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4145a extends C4105e0.C4107b<zzfi$zze, C4145a> implements r59 {
        public C4145a() {
            super(zzfi$zze.zzl);
        }

        public /* synthetic */ C4145a(C4130l lVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public enum zzb implements q19 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);
        

        /* renamed from: k */
        public static final z19<zzb> f22919k = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            f22919k = new C4131m();
        }

        /* access modifiers changed from: public */
        zzb(int i) {
            this.zzf = i;
        }

        public static w19 zzb() {
            return C4132n.f22884a;
        }

        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }

        public static zzb zza(int i) {
            if (i == 0) {
                return REASON_UNKNOWN;
            }
            if (i == 1) {
                return REASON_MISSING;
            }
            if (i == 2) {
                return REASON_UPGRADE;
            }
            if (i != 3) {
                return null;
            }
            return REASON_INVALID;
        }
    }

    static {
        zzfi$zze zzfi_zze = new zzfi$zze();
        zzl = zzfi_zze;
        C4105e0.m34223s(zzfi$zze.class, zzfi_zze);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.zzfi$zze>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<zzfi$zze> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new zzfi$zze();
            case 2:
                return new C4145a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                l69<zzfi$zze> l692 = zzm;
                l69<zzfi$zze> l693 = l692;
                if (l692 == null) {
                    synchronized (zzfi$zze.class) {
                        l69<zzfi$zze> l694 = zzm;
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
}
