package p000;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: bb8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class bb8 implements Comparator<r88> {

    /* renamed from: a */
    public final /* synthetic */ j78 f21233a;

    /* renamed from: d */
    public final /* synthetic */ ps8 f21234d;

    public bb8(j78 j78, ps8 ps8) {
        this.f21233a = j78;
        this.f21234d = ps8;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        r88 r88 = (r88) obj;
        r88 r882 = (r88) obj2;
        j78 j78 = this.f21233a;
        ps8 ps8 = this.f21234d;
        if (r88 instanceof f98) {
            if (!(r882 instanceof f98)) {
                return 1;
            }
            return 0;
        } else if (r882 instanceof f98) {
            return -1;
        } else {
            if (j78 == null) {
                return r88.zzc().compareTo(r882.zzc());
            }
            return (int) gv8.m44954i(j78.mo29623a(ps8, Arrays.asList(new r88[]{r88, r882})).mo29499b().doubleValue());
        }
    }
}
