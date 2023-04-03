package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: kl2 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class kl2 {

    /* renamed from: b */
    public static int f30915b = 31;

    /* renamed from: a */
    public int f30916a = 1;

    @CanIgnoreReturnValue
    /* renamed from: a */
    public kl2 mo44823a(Object obj) {
        int i;
        int i2 = f30915b * this.f30916a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        this.f30916a = i2 + i;
        return this;
    }

    /* renamed from: b */
    public int mo44824b() {
        return this.f30916a;
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public final kl2 mo44825c(boolean z) {
        this.f30916a = (f30915b * this.f30916a) + (z ? 1 : 0);
        return this;
    }
}
