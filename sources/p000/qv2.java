package p000;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: qv2 */
/* compiled from: Insets */
public final class qv2 {

    /* renamed from: e */
    public static final qv2 f17073e = new qv2(0, 0, 0, 0);

    /* renamed from: a */
    public final int f17074a;

    /* renamed from: b */
    public final int f17075b;

    /* renamed from: c */
    public final int f17076c;

    /* renamed from: d */
    public final int f17077d;

    /* renamed from: qv2$a */
    /* compiled from: Insets */
    public static class C3173a {
        /* renamed from: a */
        public static Insets m25935a(int i, int i2, int i3, int i4) {
            return Insets.m422of(i, i2, i3, i4);
        }
    }

    public qv2(int i, int i2, int i3, int i4) {
        this.f17074a = i;
        this.f17075b = i2;
        this.f17076c = i3;
        this.f17077d = i4;
    }

    /* renamed from: a */
    public static qv2 m25930a(qv2 qv2, qv2 qv22) {
        return m25931b(Math.max(qv2.f17074a, qv22.f17074a), Math.max(qv2.f17075b, qv22.f17075b), Math.max(qv2.f17076c, qv22.f17076c), Math.max(qv2.f17077d, qv22.f17077d));
    }

    /* renamed from: b */
    public static qv2 m25931b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f17073e;
        }
        return new qv2(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static qv2 m25932c(Rect rect) {
        return m25931b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static qv2 m25933d(Insets insets) {
        return m25931b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo25273e() {
        return C3173a.m25935a(this.f17074a, this.f17075b, this.f17076c, this.f17077d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qv2.class != obj.getClass()) {
            return false;
        }
        qv2 qv2 = (qv2) obj;
        if (this.f17077d == qv2.f17077d && this.f17074a == qv2.f17074a && this.f17076c == qv2.f17076c && this.f17075b == qv2.f17075b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f17074a * 31) + this.f17075b) * 31) + this.f17076c) * 31) + this.f17077d;
    }

    public String toString() {
        return "Insets{left=" + this.f17074a + ", top=" + this.f17075b + ", right=" + this.f17076c + ", bottom=" + this.f17077d + '}';
    }
}
