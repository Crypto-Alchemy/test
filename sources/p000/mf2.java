package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, mo44877d2 = {"", "", "digits", "", "a", "ui-geometry_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: mf2 */
/* compiled from: GeometryUtils.kt */
public final class mf2 {
    /* renamed from: a */
    public static final String m22276a(float f, int i) {
        int max = Math.max(i, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f2 = f * pow;
        int i2 = (int) f2;
        if (f2 - ((float) i2) >= 0.5f) {
            i2++;
        }
        float f3 = ((float) i2) / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }
}
