package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzaq;
import java.util.Iterator;

/* renamed from: j88 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class j88 {

    /* renamed from: a */
    public final String f30240a;

    /* renamed from: b */
    public final String f30241b;

    /* renamed from: c */
    public final String f30242c;

    /* renamed from: d */
    public final long f30243d;

    /* renamed from: e */
    public final long f30244e;

    /* renamed from: f */
    public final zzaq f30245f;

    public j88(kr8 kr8, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzaq zzaq;
        cu4.m43217g(str2);
        cu4.m43217g(str3);
        this.f30240a = str2;
        this.f30241b = str3;
        this.f30242c = true == TextUtils.isEmpty(str) ? null : str;
        this.f30243d = j;
        this.f30244e = j2;
        if (j2 != 0 && j2 > j) {
            kr8.mo45237A().mo29673o().mo48770b("Event created with reverse previous/current timestamps. appId", bn8.m32664w(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzaq = new zzaq(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    kr8.mo45237A().mo29670l().mo48769a("Param name can't be null");
                    it.remove();
                } else {
                    Object p = kr8.mo45243G().mo42823p(next, bundle2.get(next));
                    if (p == null) {
                        kr8.mo45237A().mo29673o().mo48770b("Param value can't be null", kr8.mo45244H().mo45822n(next));
                        it.remove();
                    } else {
                        kr8.mo45243G().mo42837y(bundle2, next, p);
                    }
                }
            }
            zzaq = new zzaq(bundle2);
        }
        this.f30245f = zzaq;
    }

    /* renamed from: a */
    public final j88 mo44063a(kr8 kr8, long j) {
        return new j88(kr8, this.f30242c, this.f30240a, this.f30241b, this.f30243d, j, this.f30245f);
    }

    public final String toString() {
        String str = this.f30240a;
        String str2 = this.f30241b;
        String valueOf = String.valueOf(this.f30245f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + valueOf.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public j88(kr8 kr8, String str, String str2, String str3, long j, long j2, zzaq zzaq) {
        cu4.m43217g(str2);
        cu4.m43217g(str3);
        cu4.m43221k(zzaq);
        this.f30240a = str2;
        this.f30241b = str3;
        this.f30242c = true == TextUtils.isEmpty(str) ? null : str;
        this.f30243d = j;
        this.f30244e = j2;
        if (j2 != 0 && j2 > j) {
            kr8.mo45237A().mo29673o().mo48771c("Event created with reverse previous/current timestamps. appId, name", bn8.m32664w(str2), bn8.m32664w(str3));
        }
        this.f30245f = zzaq;
    }
}
