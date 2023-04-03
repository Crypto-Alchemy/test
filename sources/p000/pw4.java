package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u001a \u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002\u001a \u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0001¨\u0006\u0007"}, mo44877d2 = {"", "a", "b", "c", "start", "end", "step", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: pw4 */
/* compiled from: progressionUtil.kt */
public final class pw4 {
    /* renamed from: a */
    public static final int m50171a(int i, int i2, int i3) {
        return m50173c(m50173c(i, i3) - m50173c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m50172b(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m50171a(i2, i, i3);
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            return i2 + m50171a(i, i2, -i3);
        }
    }

    /* renamed from: c */
    public static final int m50173c(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }
}
