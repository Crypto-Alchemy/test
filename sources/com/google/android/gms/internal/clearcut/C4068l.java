package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C4056e;

/* renamed from: com.google.android.gms.internal.clearcut.l */
public final class C4068l extends C4056e<C4068l, C4069a> implements yj8 {
    private static volatile vk8<C4068l> zzbg;
    /* access modifiers changed from: private */
    public static final C4068l zztx;
    private int zzbb;
    private int zztu;
    private String zztv = "";
    private String zztw = "";

    /* renamed from: com.google.android.gms.internal.clearcut.l$a */
    public static final class C4069a extends C4056e.C4057a<C4068l, C4069a> implements yj8 {
        public C4069a() {
            super(C4068l.zztx);
        }

        public /* synthetic */ C4069a(C4070m mVar) {
            this();
        }
    }

    static {
        C4068l lVar = new C4068l();
        zztx = lVar;
        C4056e.m33856h(C4068l.class, lVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [vk8<com.google.android.gms.internal.clearcut.l>, com.google.android.gms.internal.clearcut.e$b] */
    /* renamed from: e */
    public final Object mo30767e(int i, Object obj, Object obj2) {
        vk8<C4068l> vk8;
        switch (C4070m.f22469a[i - 1]) {
            case 1:
                return new C4068l();
            case 2:
                return new C4069a((C4070m) null);
            case 3:
                return C4056e.m33855g(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                vk8<C4068l> vk82 = zzbg;
                vk8<C4068l> vk83 = vk82;
                if (vk82 == null) {
                    synchronized (C4068l.class) {
                        vk8<C4068l> vk84 = zzbg;
                        vk8 = vk84;
                        if (vk84 == null) {
                            ? bVar = new C4056e.C4058b(zztx);
                            zzbg = bVar;
                            vk8 = bVar;
                        }
                    }
                    vk83 = vk8;
                }
                return vk83;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
