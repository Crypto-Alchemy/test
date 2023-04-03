package p000;

import com.google.android.gms.common.Feature;

/* renamed from: wz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class wz7 {

    /* renamed from: a */
    public final C6286nm f35491a;

    /* renamed from: b */
    public final Feature f35492b;

    public /* synthetic */ wz7(C6286nm nmVar, Feature feature, vz7 vz7) {
        this.f35491a = nmVar;
        this.f35492b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof wz7)) {
            wz7 wz7 = (wz7) obj;
            if (!if4.m45709a(this.f35491a, wz7.f35491a) || !if4.m45709a(this.f35492b, wz7.f35492b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return if4.m45710b(this.f35491a, this.f35492b);
    }

    public final String toString() {
        return if4.m45711c(this).mo43587a("key", this.f35491a).mo43587a("feature", this.f35492b).toString();
    }
}
