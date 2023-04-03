package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C4056e;

public final class zzge$zzs extends C4056e<zzge$zzs, C4083a> implements yj8 {
    /* access modifiers changed from: private */
    public static final zzge$zzs zzbfc;
    private static volatile vk8<zzge$zzs> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    /* renamed from: com.google.android.gms.internal.clearcut.zzge$zzs$a */
    public static final class C4083a extends C4056e.C4057a<zzge$zzs, C4083a> implements yj8 {
        public C4083a() {
            super(zzge$zzs.zzbfc);
        }

        public /* synthetic */ C4083a(C4070m mVar) {
            this();
        }
    }

    public enum zzb implements yf8 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: Z */
        public static final bg8<zzb> f22561Z = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            f22561Z = new C4071n();
        }

        /* access modifiers changed from: public */
        zzb(int i) {
            this.value = i;
        }

        public static zzb zzaz(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static bg8<zzb> zzd() {
            return f22561Z;
        }

        public final int zzc() {
            return this.value;
        }
    }

    public enum zzc implements yf8 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        

        /* renamed from: X */
        public static final bg8<zzc> f22582X = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            f22582X = new C4072o();
        }

        /* access modifiers changed from: public */
        zzc(int i) {
            this.value = i;
        }

        public static zzc zzba(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static bg8<zzc> zzd() {
            return f22582X;
        }

        public final int zzc() {
            return this.value;
        }
    }

    static {
        zzge$zzs zzge_zzs = new zzge$zzs();
        zzbfc = zzge_zzs;
        C4056e.m33856h(zzge$zzs.class, zzge_zzs);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.e$b, vk8<com.google.android.gms.internal.clearcut.zzge$zzs>] */
    /* renamed from: e */
    public final Object mo30767e(int i, Object obj, Object obj2) {
        vk8<zzge$zzs> vk8;
        switch (C4070m.f22469a[i - 1]) {
            case 1:
                return new zzge$zzs();
            case 2:
                return new C4083a((C4070m) null);
            case 3:
                return C4056e.m33855g(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", zzc.zzd(), "zzbfb", zzb.zzd()});
            case 4:
                return zzbfc;
            case 5:
                vk8<zzge$zzs> vk82 = zzbg;
                vk8<zzge$zzs> vk83 = vk82;
                if (vk82 == null) {
                    synchronized (zzge$zzs.class) {
                        vk8<zzge$zzs> vk84 = zzbg;
                        vk8 = vk84;
                        if (vk84 == null) {
                            ? bVar = new C4056e.C4058b(zzbfc);
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
