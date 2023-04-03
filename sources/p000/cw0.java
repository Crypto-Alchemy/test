package p000;

/* renamed from: cw0 */
/* compiled from: Credentials */
public class cw0 {
    private final String address;
    private final cm1 ecKeyPair;

    private cw0(cm1 cm1, String str) {
        this.ecKeyPair = cm1;
        this.address = str;
    }

    public static cw0 create(cm1 cm1) {
        return new cw0(cm1, pc4.prependHexPrefix(qb3.getAddress(cm1)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cw0 cw0 = (cw0) obj;
        cm1 cm1 = this.ecKeyPair;
        if (cm1 == null ? cw0.ecKeyPair != null : !cm1.equals(cw0.ecKeyPair)) {
            return false;
        }
        String str = this.address;
        String str2 = cw0.address;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getAddress() {
        return this.address;
    }

    public cm1 getEcKeyPair() {
        return this.ecKeyPair;
    }

    public int hashCode() {
        int i;
        cm1 cm1 = this.ecKeyPair;
        int i2 = 0;
        if (cm1 != null) {
            i = cm1.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.address;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public static cw0 create(String str, String str2) {
        return create(new cm1(pc4.toBigInt(str), pc4.toBigInt(str2)));
    }

    public static cw0 create(String str) {
        return create(cm1.create(pc4.toBigInt(str)));
    }
}
