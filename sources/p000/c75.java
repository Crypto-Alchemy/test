package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, mo44877d2 = {"", "that", "Luh0;", "b", "", "isPositive", "", "step", "Lr37;", "a", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/ranges/RangesKt")
/* renamed from: c75 */
/* compiled from: Ranges.kt */
public class c75 {
    /* renamed from: a */
    public static final void m32860a(boolean z, Number number) {
        vx2.m53591g(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    /* renamed from: b */
    public static final uh0<Float> m32861b(float f, float f2) {
        return new th0(f, f2);
    }
}
