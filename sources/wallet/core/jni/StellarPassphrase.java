package wallet.core.jni;

public enum StellarPassphrase {
    STELLAR(0),
    KIN(1);
    
    private final int value;

    /* renamed from: wallet.core.jni.StellarPassphrase$1 */
    public static /* synthetic */ class C66511 {
        public static final /* synthetic */ int[] $SwitchMap$wallet$core$jni$StellarPassphrase = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                wallet.core.jni.StellarPassphrase[] r0 = wallet.core.jni.StellarPassphrase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$wallet$core$jni$StellarPassphrase = r0
                wallet.core.jni.StellarPassphrase r1 = wallet.core.jni.StellarPassphrase.STELLAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$wallet$core$jni$StellarPassphrase     // Catch:{ NoSuchFieldError -> 0x001d }
                wallet.core.jni.StellarPassphrase r1 = wallet.core.jni.StellarPassphrase.KIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.StellarPassphrase.C66511.<clinit>():void");
        }
    }

    private StellarPassphrase(int i) {
        this.value = i;
    }

    public static StellarPassphrase createFromValue(int i) {
        if (i == 0) {
            return STELLAR;
        }
        if (i != 1) {
            return null;
        }
        return KIN;
    }

    public String toString() {
        int i = C66511.$SwitchMap$wallet$core$jni$StellarPassphrase[ordinal()];
        if (i == 1) {
            return "Public Global Stellar Network ; September 2015";
        }
        if (i != 2) {
            return "";
        }
        return "Kin Mainnet ; December 2018";
    }

    public int value() {
        return this.value;
    }
}
