package p000;

import android.text.TextUtils;

/* renamed from: ur3 */
/* compiled from: MediaSessionManagerImplBase */
public class ur3 implements sr3 {

    /* renamed from: a */
    public String f18558a;

    /* renamed from: b */
    public int f18559b;

    /* renamed from: c */
    public int f18560c;

    public ur3(String str, int i, int i2) {
        this.f18558a = str;
        this.f18559b = i;
        this.f18560c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur3)) {
            return false;
        }
        ur3 ur3 = (ur3) obj;
        if (this.f18559b < 0 || ur3.f18559b < 0) {
            if (!TextUtils.equals(this.f18558a, ur3.f18558a) || this.f18560c != ur3.f18560c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f18558a, ur3.f18558a) && this.f18559b == ur3.f18559b && this.f18560c == ur3.f18560c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return mf4.m22284b(this.f18558a, Integer.valueOf(this.f18560c));
    }
}
