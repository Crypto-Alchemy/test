package p000;

/* renamed from: c79 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class c79 implements e59 {

    /* renamed from: a */
    public final k59 f21619a;

    /* renamed from: b */
    public final String f21620b;

    /* renamed from: c */
    public final Object[] f21621c;

    /* renamed from: d */
    public final int f21622d;

    public c79(k59 k59, String str, Object[] objArr) {
        this.f21619a = k59;
        this.f21620b = str;
        this.f21621c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f21622d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f21622d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String mo29882a() {
        return this.f21620b;
    }

    /* renamed from: b */
    public final Object[] mo29883b() {
        return this.f21621c;
    }

    public final int zza() {
        if ((this.f21622d & 1) == 1) {
            return p69.f32586a;
        }
        return p69.f32587b;
    }

    public final boolean zzb() {
        if ((this.f21622d & 2) == 2) {
            return true;
        }
        return false;
    }

    public final k59 zzc() {
        return this.f21619a;
    }
}
