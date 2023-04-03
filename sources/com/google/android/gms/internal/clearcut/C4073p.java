package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C4056e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.p */
public final class C4073p extends C4056e<C4073p, C4074a> implements yj8 {
    private static volatile vk8<C4073p> zzbg;
    /* access modifiers changed from: private */
    public static final C4073p zzbir;
    private hg8<C4075b> zzbiq = C4056e.m33858p();

    /* renamed from: com.google.android.gms.internal.clearcut.p$a */
    public static final class C4074a extends C4056e.C4057a<C4073p, C4074a> implements yj8 {
        public C4074a() {
            super(C4073p.zzbir);
        }

        public /* synthetic */ C4074a(C4077q qVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.p$b */
    public static final class C4075b extends C4056e<C4075b, C4076a> implements yj8 {
        private static volatile vk8<C4075b> zzbg;
        /* access modifiers changed from: private */
        public static final C4075b zzbiv;
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        /* renamed from: com.google.android.gms.internal.clearcut.p$b$a */
        public static final class C4076a extends C4056e.C4057a<C4075b, C4076a> implements yj8 {
            public C4076a() {
                super(C4075b.zzbiv);
            }

            public /* synthetic */ C4076a(C4077q qVar) {
                this();
            }

            /* renamed from: r */
            public final C4076a mo30799r(String str) {
                mo30779g();
                ((C4075b) this.f22449d).mo30791C(str);
                return this;
            }

            /* renamed from: t */
            public final C4076a mo30800t(long j) {
                mo30779g();
                ((C4075b) this.f22449d).mo30792D(j);
                return this;
            }

            /* renamed from: u */
            public final C4076a mo30801u(long j) {
                mo30779g();
                ((C4075b) this.f22449d).mo30793E(j);
                return this;
            }
        }

        static {
            C4075b bVar = new C4075b();
            zzbiv = bVar;
            C4056e.m33856h(C4075b.class, bVar);
        }

        /* renamed from: A */
        public static C4076a m33923A() {
            return (C4076a) ((C4056e.C4057a) zzbiv.mo30767e(C4056e.C4061e.f22458e, (Object) null, (Object) null));
        }

        /* renamed from: C */
        public final void mo30791C(String str) {
            str.getClass();
            this.zzbb |= 2;
            this.zzbis = str;
        }

        /* renamed from: D */
        public final void mo30792D(long j) {
            this.zzbb |= 4;
            this.zzbit = j;
        }

        /* renamed from: E */
        public final void mo30793E(long j) {
            this.zzbb |= 8;
            this.zzbiu = j;
        }

        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.e$b, vk8<com.google.android.gms.internal.clearcut.p$b>] */
        /* renamed from: e */
        public final Object mo30767e(int i, Object obj, Object obj2) {
            vk8<C4075b> vk8;
            switch (C4077q.f22470a[i - 1]) {
                case 1:
                    return new C4075b();
                case 2:
                    return new C4076a((C4077q) null);
                case 3:
                    return C4056e.m33855g(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    vk8<C4075b> vk82 = zzbg;
                    vk8<C4075b> vk83 = vk82;
                    if (vk82 == null) {
                        synchronized (C4075b.class) {
                            vk8<C4075b> vk84 = zzbg;
                            vk8 = vk84;
                            if (vk84 == null) {
                                ? bVar = new C4056e.C4058b(zzbiv);
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

        /* renamed from: r */
        public final int mo30794r() {
            return this.zzya;
        }

        /* renamed from: w */
        public final boolean mo30795w() {
            return (this.zzbb & 1) == 1;
        }

        /* renamed from: x */
        public final String mo30796x() {
            return this.zzbis;
        }

        /* renamed from: y */
        public final long mo30797y() {
            return this.zzbit;
        }

        /* renamed from: z */
        public final long mo30798z() {
            return this.zzbiu;
        }
    }

    static {
        C4073p pVar = new C4073p();
        zzbir = pVar;
        C4056e.m33856h(C4073p.class, pVar);
    }

    /* renamed from: t */
    public static C4073p m33918t() {
        return zzbir;
    }

    /* renamed from: v */
    public static C4073p m33920v(byte[] bArr) throws zzco {
        return (C4073p) C4056e.m33857n(zzbir, bArr);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.e$b, vk8<com.google.android.gms.internal.clearcut.p>] */
    /* renamed from: e */
    public final Object mo30767e(int i, Object obj, Object obj2) {
        vk8<C4073p> vk8;
        switch (C4077q.f22470a[i - 1]) {
            case 1:
                return new C4073p();
            case 2:
                return new C4074a((C4077q) null);
            case 3:
                return C4056e.m33855g(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", C4075b.class});
            case 4:
                return zzbir;
            case 5:
                vk8<C4073p> vk82 = zzbg;
                vk8<C4073p> vk83 = vk82;
                if (vk82 == null) {
                    synchronized (C4073p.class) {
                        vk8<C4073p> vk84 = zzbg;
                        vk8 = vk84;
                        if (vk84 == null) {
                            ? bVar = new C4056e.C4058b(zzbir);
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

    /* renamed from: r */
    public final List<C4075b> mo30790r() {
        return this.zzbiq;
    }
}
