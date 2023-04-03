package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"", "x", "y", "Lbu0;", "a", "(FF)J", "ui-geometry_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: cu0 */
/* compiled from: CornerRadius.kt */
public final class cu0 {
    /* renamed from: a */
    public static final long m14496a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return bu0.m11574b((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: b */
    public static /* synthetic */ long m14497b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return m14496a(f, f2);
    }
}
