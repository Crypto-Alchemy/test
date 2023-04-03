package p000;

/* renamed from: l34 */
public abstract class l34 {
    /* renamed from: a */
    public static void m63687a(int[] iArr, int[] iArr2, int[] iArr3) {
        h34.m58449x(iArr, iArr2, iArr3);
        h34.m58448w(iArr, 6, iArr2, 6, iArr3, 12);
        int d = h34.m58429d(iArr3, 6, iArr3, 12);
        int c = d + h34.m58428c(iArr3, 18, iArr3, 12, h34.m58428c(iArr3, 0, iArr3, 6, 0) + d);
        int[] h = h34.m58433h();
        int[] h2 = h34.m58433h();
        boolean z = h34.m58437l(iArr, 6, iArr, 0, h, 0) != h34.m58437l(iArr2, 6, iArr2, 0, h2, 0);
        int[] j = h34.m58435j();
        h34.m58449x(h, h2, j);
        p34.m70882f(24, c + (z ? p34.m70880d(12, j, 0, iArr3, 6) : p34.m70871O(12, j, 0, iArr3, 6)), iArr3, 18);
    }

    /* renamed from: b */
    public static void m63688b(int[] iArr, int[] iArr2) {
        h34.m58420D(iArr, iArr2);
        h34.m58419C(iArr, 6, iArr2, 12);
        int d = h34.m58429d(iArr2, 6, iArr2, 12);
        int c = d + h34.m58428c(iArr2, 18, iArr2, 12, h34.m58428c(iArr2, 0, iArr2, 6, 0) + d);
        int[] h = h34.m58433h();
        h34.m58437l(iArr, 6, iArr, 0, h, 0);
        int[] j = h34.m58435j();
        h34.m58420D(h, j);
        p34.m70882f(24, c + p34.m70871O(12, j, 0, iArr2, 6), iArr2, 18);
    }
}
