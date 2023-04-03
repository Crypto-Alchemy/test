package p000;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: rr3 */
/* compiled from: MediaSessionManager */
public final class rr3 {

    /* renamed from: a */
    public sr3 f17351a;

    public rr3(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f17351a = new tr3(str, i, i2);
        } else {
            this.f17351a = new ur3(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr3)) {
            return false;
        }
        return this.f17351a.equals(((rr3) obj).f17351a);
    }

    public int hashCode() {
        return this.f17351a.hashCode();
    }
}
