package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: bi9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class bi9 {

    /* renamed from: a */
    public final kr8 f21347a;

    public bi9(kr8 kr8) {
        this.f21347a = kr8;
    }

    /* renamed from: a */
    public final void mo29611a() {
        this.f21347a.mo45272s().mo29006e();
        if (mo29615e()) {
            if (mo29614d()) {
                this.f21347a.mo45275z().f31372u.mo43885b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f21347a.mo45242F().mo47916X("auto", "_cmpx", bundle);
            } else {
                String a = this.f21347a.mo45275z().f31372u.mo43884a();
                if (TextUtils.isEmpty(a)) {
                    this.f21347a.mo45237A().mo29671m().mo48769a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f21347a.mo45275z().f31373v.mo43882a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    this.f21347a.mo45242F().mo47916X((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f21347a.mo45275z().f31372u.mo43885b((String) null);
            }
            this.f21347a.mo45275z().f31373v.mo43883b(0);
        }
    }

    /* renamed from: b */
    public final void mo29612b(String str, Bundle bundle) {
        String str2;
        this.f21347a.mo45272s().mo29006e();
        if (!this.f21347a.mo45262h()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f21347a.mo45275z().f31372u.mo43885b(str2);
                this.f21347a.mo45275z().f31373v.mo43883b(this.f21347a.mo45256a().mo29580a());
            }
        }
    }

    /* renamed from: c */
    public final void mo29613c() {
        if (mo29615e() && mo29614d()) {
            this.f21347a.mo45275z().f31372u.mo43885b((String) null);
        }
    }

    /* renamed from: d */
    public final boolean mo29614d() {
        if (mo29615e() && this.f21347a.mo45256a().mo29580a() - this.f21347a.mo45275z().f31373v.mo43882a() > this.f21347a.mo45274y().mo45993p((String) null, rl8.f33476S)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo29615e() {
        if (this.f21347a.mo45275z().f31373v.mo43882a() > 0) {
            return true;
        }
        return false;
    }
}
