package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB!\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001d"}, mo44877d2 = {"Lpw2;", "", "", "Llw2;", "s", "", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "a", "I", "n", "()I", "first", "d", "q", "last", "e", "r", "step", "start", "endInclusive", "<init>", "(III)V", "g", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pw2 */
/* compiled from: Progressions.kt */
public class pw2 implements Iterable<Integer>, a93 {

    /* renamed from: g */
    public static final C6378a f32851g = new C6378a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f32852a;

    /* renamed from: d */
    public final int f32853d;

    /* renamed from: e */
    public final int f32854e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, mo44877d2 = {"Lpw2$a;", "", "", "rangeStart", "rangeEnd", "step", "Lpw2;", "a", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: pw2$a */
    /* compiled from: Progressions.kt */
    public static final class C6378a {
        public C6378a() {
        }

        public /* synthetic */ C6378a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final pw2 mo46915a(int i, int i2, int i3) {
            return new pw2(i, i2, i3);
        }
    }

    public pw2(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f32852a = i;
            this.f32853d = pw4.m50172b(i, i2, i3);
            this.f32854e = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof pw2) {
            if (!isEmpty() || !((pw2) obj).isEmpty()) {
                pw2 pw2 = (pw2) obj;
                if (!(this.f32852a == pw2.f32852a && this.f32853d == pw2.f32853d && this.f32854e == pw2.f32854e)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f32852a * 31) + this.f32853d) * 31) + this.f32854e;
    }

    public boolean isEmpty() {
        if (this.f32854e > 0) {
            if (this.f32852a > this.f32853d) {
                return true;
            }
        } else if (this.f32852a < this.f32853d) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final int mo46910n() {
        return this.f32852a;
    }

    /* renamed from: q */
    public final int mo46911q() {
        return this.f32853d;
    }

    /* renamed from: r */
    public final int mo46912r() {
        return this.f32854e;
    }

    /* renamed from: s */
    public lw2 iterator() {
        return new qw2(this.f32852a, this.f32853d, this.f32854e);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f32854e > 0) {
            sb = new StringBuilder();
            sb.append(this.f32852a);
            sb.append("..");
            sb.append(this.f32853d);
            sb.append(" step ");
            i = this.f32854e;
        } else {
            sb = new StringBuilder();
            sb.append(this.f32852a);
            sb.append(" downTo ");
            sb.append(this.f32853d);
            sb.append(" step ");
            i = -this.f32854e;
        }
        sb.append(i);
        return sb.toString();
    }
}
