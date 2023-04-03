package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"!\u0010\u000b\u001a\u00020\u0006*\u00020\u00038FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"!\u0010\u000e\u001a\u00020\u0006*\u00020\u00038FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"", "x", "y", "Ltf4;", "a", "(FF)J", "", "b", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "c", "isSpecified-k-4lQ0M$annotations", "isSpecified", "ui-geometry_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: wf4 */
/* compiled from: Offset.kt */
public final class wf4 {
    /* renamed from: a */
    public static final long m29550a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return tf4.m27730g((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: b */
    public static final boolean m29551b(long j) {
        boolean z;
        boolean z2;
        float k = tf4.m27734k(j);
        if (Float.isInfinite(k) || Float.isNaN(k)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float l = tf4.m27735l(j);
            if (Float.isInfinite(l) || Float.isNaN(l)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m29552c(long j) {
        if (j != tf4.f18145b.mo26445b()) {
            return true;
        }
        return false;
    }
}
