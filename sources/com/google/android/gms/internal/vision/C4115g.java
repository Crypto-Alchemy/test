package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.g */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4115g extends C4105e0<C4115g, C4116a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4115g zzj;
    private static volatile l69<C4115g> zzk;
    private int zzc;
    private String zzd = "";
    private long zze;
    private C4090a zzf;
    private String zzg = "";
    private zzfi$zzg zzh;
    private C4093b zzi;

    /* renamed from: com.google.android.gms.internal.vision.g$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4116a extends C4105e0.C4107b<C4115g, C4116a> implements r59 {
        public C4116a() {
            super(C4115g.zzj);
        }

        public /* synthetic */ C4116a(C4130l lVar) {
            this();
        }
    }

    static {
        C4115g gVar = new C4115g();
        zzj = gVar;
        C4105e0.m34223s(C4115g.class, gVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.g>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4115g> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4115g();
            case 2:
                return new C4116a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                l69<C4115g> l692 = zzk;
                l69<C4115g> l693 = l692;
                if (l692 == null) {
                    synchronized (C4115g.class) {
                        l69<C4115g> l694 = zzk;
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
