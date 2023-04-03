package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;

/* renamed from: com.google.android.gms.internal.vision.a */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4090a extends C4105e0<C4090a, C4091a> implements r59 {
    /* access modifiers changed from: private */
    public static final C4090a zzf;
    private static volatile l69<C4090a> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.vision.a$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4091a extends C4105e0.C4107b<C4090a, C4091a> implements r59 {
        public C4091a() {
            super(C4090a.zzf);
        }

        /* renamed from: v */
        public final C4091a mo31155v(String str) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((C4090a) this.f22863d).mo31154z(str);
            return this;
        }

        /* renamed from: w */
        public final C4091a mo31156w(String str) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            ((C4090a) this.f22863d).mo31152C(str);
            return this;
        }

        public /* synthetic */ C4091a(C4130l lVar) {
            this();
        }
    }

    static {
        C4090a aVar = new C4090a();
        zzf = aVar;
        C4105e0.m34223s(C4090a.class, aVar);
    }

    /* renamed from: x */
    public static C4091a m34192x() {
        return (C4091a) zzf.mo31180u();
    }

    /* renamed from: C */
    public final void mo31152C(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [l69<com.google.android.gms.internal.vision.a>, com.google.android.gms.internal.vision.e0$a] */
    /* renamed from: o */
    public final Object mo31153o(int i, Object obj, Object obj2) {
        l69<C4090a> l69;
        switch (C4130l.f22883a[i - 1]) {
            case 1:
                return new C4090a();
            case 2:
                return new C4091a((C4130l) null);
            case 3:
                return C4105e0.m34221q(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                l69<C4090a> l692 = zzg;
                l69<C4090a> l693 = l692;
                if (l692 == null) {
                    synchronized (C4090a.class) {
                        l69<C4090a> l694 = zzg;
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

    /* renamed from: z */
    public final void mo31154z(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }
}
