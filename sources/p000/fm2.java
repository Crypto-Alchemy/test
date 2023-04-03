package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"", "distance", "", "isInLayer", "Lfi1;", "a", "(FZ)J", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: fm2 */
/* compiled from: HitTestResult.kt */
public final class fm2 {
    /* renamed from: a */
    public static final long m17080a(float f, boolean z) {
        long j;
        long floatToIntBits = (long) Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return fi1.m17004b((j & 4294967295L) | (floatToIntBits << 32));
    }
}
