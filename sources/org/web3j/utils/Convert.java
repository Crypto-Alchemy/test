package org.web3j.utils;

import java.math.BigDecimal;

public final class Convert {

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
        GETHER("gether", 27);
        
        private String name;
        private BigDecimal weiFactor;

        private Unit(String str, int i) {
            this.name = str;
            this.weiFactor = BigDecimal.TEN.pow(i);
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

        public BigDecimal getWeiFactor() {
            return this.weiFactor;
        }

        public String toString() {
            return this.name;
        }
    }

    private Convert() {
    }

    public static BigDecimal fromWei(String str, Unit unit) {
        return fromWei(new BigDecimal(str), unit);
    }

    public static BigDecimal toWei(String str, Unit unit) {
        return toWei(new BigDecimal(str), unit);
    }

    public static BigDecimal fromWei(BigDecimal bigDecimal, Unit unit) {
        return bigDecimal.divide(unit.getWeiFactor());
    }

    public static BigDecimal toWei(BigDecimal bigDecimal, Unit unit) {
        return bigDecimal.multiply(unit.getWeiFactor());
    }
}
