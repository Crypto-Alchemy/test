package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, mo44877d2 = {"", "start", "end", "Lao6;", "b", "(II)J", "index", "a", "(I)J", "minimumValue", "maximumValue", "c", "(JII)J", "", "d", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: bo6 */
/* compiled from: TextRange.kt */
public final class bo6 {
    /* renamed from: a */
    public static final long m11527a(int i) {
        return m11528b(i, i);
    }

    /* renamed from: b */
    public static final long m11528b(int i, int i2) {
        return ao6.m10676c(m11530d(i, i2));
    }

    /* renamed from: c */
    public static final long m11529c(long j, int i, int i2) {
        int k = d75.m43389k(ao6.m10683j(j), i, i2);
        int k2 = d75.m43389k(ao6.m10680g(j), i, i2);
        if (k == ao6.m10683j(j) && k2 == ao6.m10680g(j)) {
            return j;
        }
        return m11528b(k, k2);
    }

    /* renamed from: d */
    public static final long m11530d(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 < 0) {
                z2 = false;
            }
            if (z2) {
                return (((long) i2) & 4294967295L) | (((long) i) << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }
}
