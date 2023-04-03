package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0004\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013\u0001\u001c\u0001\u00020\u001bø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo44877d2 = {"Lz46;", "", "Luw2;", "diagonals", "Lr37;", "a", "([ILuw2;)V", "", "h", "([I)I", "startX", "i", "startY", "d", "endX", "e", "endY", "", "g", "([I)Z", "reverse", "c", "diagonalSize", "f", "hasAdditionOrRemoval", "j", "isAddition", "", "data", "b", "([I)[I", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: z46 */
/* compiled from: MyersDiff.kt */
public final class z46 {
    /* renamed from: a */
    public static final void m30962a(int[] iArr, uw2 uw2) {
        vx2.m53591g(uw2, "diagonals");
        if (!m30967f(iArr)) {
            uw2.mo26879e(m30969h(iArr), m30970i(iArr), m30965d(iArr) - m30969h(iArr));
        } else if (m30968g(iArr)) {
            uw2.mo26879e(m30969h(iArr), m30970i(iArr), m30964c(iArr));
        } else if (m30971j(iArr)) {
            uw2.mo26879e(m30969h(iArr), m30970i(iArr) + 1, m30964c(iArr));
        } else {
            uw2.mo26879e(m30969h(iArr) + 1, m30970i(iArr), m30964c(iArr));
        }
    }

    /* renamed from: b */
    public static int[] m30963b(int[] iArr) {
        vx2.m53591g(iArr, "data");
        return iArr;
    }

    /* renamed from: c */
    public static final int m30964c(int[] iArr) {
        return Math.min(m30965d(iArr) - m30969h(iArr), m30966e(iArr) - m30970i(iArr));
    }

    /* renamed from: d */
    public static final int m30965d(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: e */
    public static final int m30966e(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: f */
    public static final boolean m30967f(int[] iArr) {
        if (m30966e(iArr) - m30970i(iArr) != m30965d(iArr) - m30969h(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m30968g(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final int m30969h(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: i */
    public static final int m30970i(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: j */
    public static final boolean m30971j(int[] iArr) {
        if (m30966e(iArr) - m30970i(iArr) > m30965d(iArr) - m30969h(iArr)) {
            return true;
        }
        return false;
    }
}
