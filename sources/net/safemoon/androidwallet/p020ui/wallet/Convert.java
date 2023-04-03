package net.safemoon.androidwallet.p020ui.wallet;

import java.math.BigDecimal;

/* renamed from: net.safemoon.androidwallet.ui.wallet.Convert */
public final class Convert {

    /* renamed from: net.safemoon.androidwallet.ui.wallet.Convert$Unit */
    public enum Unit {
        WEI("wei", 0),
        KWEI("kwei", 3),
        MWEI("mwei", 6),
        GWEI("gwei", 9),
        SZABO("szabo", 12),
        FINNEY("finney", 15),
        ETHER("ether", 18),
        KETHER("kether", 21),
        METHER("mether", 24),
        GETHER("gether", 27),
        CUSTOM("custom", 8);
        
        private int factor;
        private String name;
        private BigDecimal weiFactor;

        /* access modifiers changed from: public */
        Unit(String str, int i) {
            this.name = str;
            this.factor = i;
            this.weiFactor = BigDecimal.TEN.pow(i);
        }

        public static Unit fromDecmal(int i) {
            for (Unit unit : values()) {
                if (i == unit.factor) {
                    return unit;
                }
            }
            Unit unit2 = CUSTOM;
            unit2.factor = i;
            unit2.name = "custom_" + i;
            unit2.weiFactor = BigDecimal.TEN.pow(i);
            return unit2;
        }

        public static Unit fromString(String str) {
            if (str != null) {
                for (Unit unit : values()) {
                    if (str.equalsIgnoreCase(unit.name)) {
                        return unit;
                    }
                }
            }
            return valueOf(str);
        }

        public int getFactor() {
            return this.factor;
        }

        public BigDecimal getWeiFactor() {
            return this.weiFactor;
        }

        public String toString() {
            return this.name;
        }
    }

    /* renamed from: a */
    public static BigDecimal m68279a(String str, Unit unit) {
        return m68280b(new BigDecimal(str), unit);
    }

    /* renamed from: b */
    public static BigDecimal m68280b(BigDecimal bigDecimal, Unit unit) {
        return bigDecimal.divide(unit.getWeiFactor());
    }

    /* renamed from: c */
    public static BigDecimal m68281c(String str, Unit unit) {
        return m68282d(new BigDecimal(str), unit);
    }

    /* renamed from: d */
    public static BigDecimal m68282d(BigDecimal bigDecimal, Unit unit) {
        return bigDecimal.multiply(unit.getWeiFactor());
    }
}
