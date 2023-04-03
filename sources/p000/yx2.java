package p000;

/* renamed from: yx2 */
/* compiled from: Ints */
public class yx2 {
    /* renamed from: a */
    public static int m30850a(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }
}
