package p000;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Locale;

/* renamed from: o20 */
/* compiled from: BitmapMemoryCacheKey */
public class o20 implements f80 {

    /* renamed from: a */
    public final String f15772a;

    /* renamed from: b */
    public final xh5 f15773b;

    /* renamed from: c */
    public final lq2 f15774c;

    /* renamed from: d */
    public final f80 f15775d;

    /* renamed from: e */
    public final String f15776e;

    /* renamed from: f */
    public final int f15777f;

    /* renamed from: g */
    public final Object f15778g;

    /* renamed from: h */
    public final long f15779h = RealtimeSinceBootClock.get().now();

    public o20(String str, te5 te5, xh5 xh5, lq2 lq2, f80 f80, String str2, Object obj) {
        this.f15772a = (String) au4.m10792g(str);
        this.f15773b = xh5;
        this.f15774c = lq2;
        this.f15775d = f80;
        this.f15776e = str2;
        this.f15777f = ll2.m21525d(Integer.valueOf(str.hashCode()), 0, Integer.valueOf(xh5.hashCode()), lq2, f80, str2);
        this.f15778g = obj;
    }

    /* renamed from: a */
    public String mo11960a() {
        return this.f15772a;
    }

    /* renamed from: b */
    public boolean mo11961b() {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o20)) {
            return false;
        }
        o20 o20 = (o20) obj;
        if (this.f15777f != o20.f15777f || !this.f15772a.equals(o20.f15772a) || !hf4.m18860a((Object) null, (Object) null) || !hf4.m18860a(this.f15773b, o20.f15773b) || !hf4.m18860a(this.f15774c, o20.f15774c) || !hf4.m18860a(this.f15775d, o20.f15775d) || !hf4.m18860a(this.f15776e, o20.f15776e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f15777f;
    }

    public String toString() {
        return String.format((Locale) null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f15772a, null, this.f15773b, this.f15774c, this.f15775d, this.f15776e, Integer.valueOf(this.f15777f)});
    }
}
