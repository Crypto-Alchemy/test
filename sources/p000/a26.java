package p000;

import java.math.BigInteger;

/* renamed from: a26 */
public class a26 {

    /* renamed from: a */
    public final BigInteger f36354a;

    /* renamed from: b */
    public final int f36355b;

    public a26(BigInteger bigInteger, int i) {
        if (i >= 0) {
            this.f36354a = bigInteger;
            this.f36355b = i;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    /* renamed from: a */
    public a26 mo50054a(a26 a26) {
        mo50056c(a26);
        return new a26(this.f36354a.add(a26.f36354a), this.f36355b);
    }

    /* renamed from: b */
    public a26 mo50055b(int i) {
        if (i >= 0) {
            int i2 = this.f36355b;
            return i == i2 ? this : new a26(this.f36354a.shiftLeft(i - i2), i);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    /* renamed from: c */
    public final void mo50056c(a26 a26) {
        if (this.f36355b != a26.f36355b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    /* renamed from: d */
    public int mo50057d(BigInteger bigInteger) {
        return this.f36354a.compareTo(bigInteger.shiftLeft(this.f36355b));
    }

    /* renamed from: e */
    public BigInteger mo50058e() {
        return this.f36354a.shiftRight(this.f36355b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a26)) {
            return false;
        }
        a26 a26 = (a26) obj;
        return this.f36354a.equals(a26.f36354a) && this.f36355b == a26.f36355b;
    }

    /* renamed from: f */
    public int mo50060f() {
        return this.f36355b;
    }

    /* renamed from: g */
    public a26 mo50061g() {
        return new a26(this.f36354a.negate(), this.f36355b);
    }

    /* renamed from: h */
    public BigInteger mo50062h() {
        return mo50054a(new a26(tl1.f44772b, 1).mo50055b(this.f36355b)).mo50058e();
    }

    public int hashCode() {
        return this.f36354a.hashCode() ^ this.f36355b;
    }

    /* renamed from: i */
    public a26 mo50064i(a26 a26) {
        return mo50054a(a26.mo50061g());
    }

    /* renamed from: j */
    public a26 mo50065j(BigInteger bigInteger) {
        return new a26(this.f36354a.subtract(bigInteger.shiftLeft(this.f36355b)), this.f36355b);
    }

    public String toString() {
        if (this.f36355b == 0) {
            return this.f36354a.toString();
        }
        BigInteger e = mo50058e();
        BigInteger subtract = this.f36354a.subtract(e.shiftLeft(this.f36355b));
        if (this.f36354a.signum() == -1) {
            subtract = tl1.f44772b.shiftLeft(this.f36355b).subtract(subtract);
        }
        if (e.signum() == -1 && !subtract.equals(tl1.f44771a)) {
            e = e.add(tl1.f44772b);
        }
        String bigInteger = e.toString();
        char[] cArr = new char[this.f36355b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i = this.f36355b - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = bigInteger2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
