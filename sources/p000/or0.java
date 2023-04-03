package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0000X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, mo44877d2 = {"", "", "size", "value", "a", "[I", "EMPTY_INTS", "", "", "b", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: or0 */
/* compiled from: ContainerHelpers.kt */
public final class or0 {

    /* renamed from: a */
    public static final int[] f15973a = new int[0];

    /* renamed from: b */
    public static final Object[] f15974b = new Object[0];

    /* renamed from: a */
    public static final int m23962a(int[] iArr, int i, int i2) {
        vx2.m53591g(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
