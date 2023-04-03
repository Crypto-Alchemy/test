package p000;

/* renamed from: n34 */
public abstract class n34 {
    /* renamed from: a */
    public static void m64511a(int[] iArr, int[] iArr2, int[] iArr3) {
        j34.m59240y(iArr, iArr2, iArr3);
        j34.m59239x(iArr, 8, iArr2, 8, iArr3, 16);
        int e = j34.m59220e(iArr3, 8, iArr3, 16);
        int c = e + j34.m59218c(iArr3, 24, iArr3, 16, j34.m59218c(iArr3, 0, iArr3, 8, 0) + e);
        int[] i = j34.m59224i();
        int[] i2 = j34.m59224i();
        boolean z = j34.m59228m(iArr, 8, iArr, 0, i, 0) != j34.m59228m(iArr2, 8, iArr2, 0, i2, 0);
        int[] k = j34.m59226k();
        j34.m59240y(i, i2, k);
        p34.m70882f(32, c + (z ? p34.m70880d(16, k, 0, iArr3, 8) : p34.m70871O(16, k, 0, iArr3, 8)), iArr3, 24);
    }

    /* renamed from: b */
    public static void m64512b(int[] iArr, int[] iArr2) {
        j34.m59210F(iArr, iArr2);
        j34.m59209E(iArr, 8, iArr2, 16);
        int e = j34.m59220e(iArr2, 8, iArr2, 16);
        int c = e + j34.m59218c(iArr2, 24, iArr2, 16, j34.m59218c(iArr2, 0, iArr2, 8, 0) + e);
        int[] i = j34.m59224i();
        j34.m59228m(iArr, 8, iArr, 0, i, 0);
        int[] k = j34.m59226k();
        j34.m59210F(i, k);
        p34.m70882f(32, c + p34.m70871O(16, k, 0, iArr2, 8), iArr2, 24);
    }
}
