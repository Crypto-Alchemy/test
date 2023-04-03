package p000;

import kotlin.Metadata;
import okhttp3.internal.p023ws.WebSocketProtocol;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¨\u0006\u0007"}, mo44877d2 = {"", "bits", "", "c", "", "value", "b", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: d56 */
/* compiled from: SnapshotIdSet.kt */
public final class d56 {
    /* renamed from: b */
    public static final int m14800b(int[] iArr, int i) {
        vx2.m53591g(iArr, "<this>");
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i >= i4) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public static final int m14801c(long j) {
        int i = 32;
        if ((4294967295L & j) == 0) {
            j >>= 32;
        } else {
            i = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }
}
