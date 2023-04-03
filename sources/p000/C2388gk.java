package p000;

/* renamed from: gk */
/* compiled from: AnimatedDrawableUtil */
public class C2388gk {
    /* renamed from: a */
    public void mo20613a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 11) {
                iArr[i] = 100;
            }
        }
    }

    /* renamed from: b */
    public int[] mo20614b(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = i;
            i += iArr[i2];
        }
        return iArr2;
    }

    /* renamed from: c */
    public int mo20615c(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
