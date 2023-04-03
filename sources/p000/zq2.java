package p000;

import android.graphics.ColorSpace;
import android.util.Pair;

/* renamed from: zq2 */
/* compiled from: ImageMetaData */
public class zq2 {

    /* renamed from: a */
    public final Pair<Integer, Integer> f20654a;

    /* renamed from: b */
    public final ColorSpace f20655b;

    public zq2(int i, int i2, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i == -1 || i2 == -1) {
            pair = null;
        } else {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.f20654a = pair;
        this.f20655b = colorSpace;
    }

    /* renamed from: a */
    public ColorSpace mo28560a() {
        return this.f20655b;
    }

    /* renamed from: b */
    public Pair<Integer, Integer> mo28561b() {
        return this.f20654a;
    }
}
