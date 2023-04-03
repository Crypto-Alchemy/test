package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.i */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4121i extends C4105e0<C4121i, C4122a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4121i zzf;
    private static volatile l69<C4121i> zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.vision.i$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4122a extends C4105e0.C4107b<C4121i, C4122a> implements r59 {
        public C4122a() {
            super(C4121i.zzf);
        }

        public /* synthetic */ C4122a(C4130l lVar) {
            this();
        }
    }

    static {
        C4121i iVar = new C4121i();
        zzf = iVar;
        C4105e0.m34223s(C4121i.class, iVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.e0$a, l69<com.google.android.gms.internal.vision.i>] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4121i> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4121i();
            case 2:
                return new C4122a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                l69<C4121i> l692 = zzg;
                l69<C4121i> l693 = l692;
                if (l692 == null) {
                    synchronized (C4121i.class) {
                        l69<C4121i> l694 = zzg;
                        l69 = l694;
                        if (l694 == null) {
                            ? aVar = new C4105e0.C4106a(zzf);
                            zzg = aVar;
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
