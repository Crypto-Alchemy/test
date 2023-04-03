package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\"!\u0010\u0011\u001a\u00020\u0004*\u00020\f8FX\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"", "value", "Lio6;", "type", "Lgo6;", "a", "(FJ)J", "", "unitType", "v", "c", "(JF)J", "", "b", "(I)J", "getSp$annotations", "(I)V", "sp", "ui-unit_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ho6 */
/* compiled from: TextUnit.kt */
public final class ho6 {
    /* renamed from: a */
    public static final long m19130a(float f, long j) {
        return m19132c(j, f);
    }

    /* renamed from: b */
    public static final long m19131b(int i) {
        return m19132c(4294967296L, (float) i);
    }

    /* renamed from: c */
    public static final long m19132c(long j, float f) {
        return go6.m18273c(j | (((long) Float.floatToIntBits(f)) & 4294967295L));
    }
}
