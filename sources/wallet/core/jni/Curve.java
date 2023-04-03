package wallet.core.jni;

public enum Curve {
    SECP256K1(0),
    ED25519(1),
    ED25519BLAKE2BNANO(2),
    CURVE25519(3),
    NIST256P1(4),
    ED25519EXTENDEDCARDANO(5);
    
    private final int value;

    /* renamed from: wallet.core.jni.Curve$1 */
    public static /* synthetic */ class C66491 {
        public static final /* synthetic */ int[] $SwitchMap$wallet$core$jni$Curve = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                wallet.core.jni.Curve[] r0 = wallet.core.jni.Curve.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$wallet$core$jni$Curve = r0
                wallet.core.jni.Curve r1 = wallet.core.jni.Curve.SECP256K1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$wallet$core$jni$Curve     // Catch:{ NoSuchFieldError -> 0x001d }
                wallet.core.jni.Curve r1 = wallet.core.jni.Curve.ED25519     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$wallet$core$jni$Curve     // Catch:{ NoSuchFieldError -> 0x0028 }
                wallet.core.jni.Curve r1 = wallet.core.jni.Curve.ED25519BLAKE2BNANO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$wallet$core$jni$Curve     // Catch:{ NoSuchFieldError -> 0x0033 }
                wallet.core.jni.Curve r1 = wallet.core.jni.Curve.CURVE25519     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$wallet$core$jni$Curve     // Catch:{ NoSuchFieldError -> 0x003e }
                wallet.core.jni.Curve r1 = wallet.core.jni.Curve.NIST256P1     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$wallet$core$jni$Curve     // Catch:{ NoSuchFieldError -> 0x0049 }
                wallet.core.jni.Curve r1 = wallet.core.jni.Curve.ED25519EXTENDEDCARDANO     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.Curve.C66491.<clinit>():void");
        }
    }

    private Curve(int i) {
        this.value = i;
    }

    public static Curve createFromValue(int i) {
        if (i == 0) {
            return SECP256K1;
        }
        if (i == 1) {
            return ED25519;
        }
        if (i == 2) {
            return ED25519BLAKE2BNANO;
        }
        if (i == 3) {
            return CURVE25519;
        }
        if (i == 4) {
            return NIST256P1;
        }
        if (i != 5) {
            return null;
        }
        return ED25519EXTENDEDCARDANO;
    }

    public String toString() {
        switch (C66491.$SwitchMap$wallet$core$jni$Curve[ordinal()]) {
            case 1:
                return "secp256k1";
            case 2:
                return "ed25519";
            case 3:
                return "ed25519-blake2b-nano";
            case 4:
                return "curve25519";
            case 5:
                return "nist256p1";
            case 6:
                return "ed25519-cardano-seed";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
