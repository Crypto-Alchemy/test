package p000;

import kotlin.Metadata;
import okio.SegmentedByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\t"}, mo44877d2 = {"", "", "value", "fromIndex", "toIndex", "a", "Lokio/SegmentedByteString;", "pos", "b", "okio"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: yp7 */
/* compiled from: -SegmentedByteString.kt */
public final class yp7 {
    /* renamed from: a */
    public static final int m74583a(int[] iArr, int i, int i2, int i3) {
        vx2.m53591g(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m74584b(SegmentedByteString segmentedByteString, int i) {
        vx2.m53591g(segmentedByteString, "<this>");
        int a = m74583a(segmentedByteString.getDirectory$okio(), i + 1, 0, segmentedByteString.getSegments$okio().length);
        if (a >= 0) {
            return a;
        }
        return ~a;
    }
}
