package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.C4803a;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new vc5();

    /* renamed from: a */
    public Bundle f25419a;

    /* renamed from: d */
    public Map<String, String> f25420d;

    /* renamed from: e */
    public C4802b f25421e;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$b */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class C4802b {

        /* renamed from: a */
        public final String f25422a;

        /* renamed from: b */
        public final String f25423b;

        /* renamed from: c */
        public final String[] f25424c;

        /* renamed from: d */
        public final String f25425d;

        /* renamed from: e */
        public final String f25426e;

        /* renamed from: f */
        public final String[] f25427f;

        /* renamed from: g */
        public final String f25428g;

        /* renamed from: h */
        public final String f25429h;

        /* renamed from: i */
        public final String f25430i;

        /* renamed from: j */
        public final String f25431j;

        /* renamed from: k */
        public final String f25432k;

        /* renamed from: l */
        public final String f25433l;

        /* renamed from: m */
        public final String f25434m;

        /* renamed from: n */
        public final Uri f25435n;

        /* renamed from: o */
        public final String f25436o;

        /* renamed from: p */
        public final Integer f25437p;

        /* renamed from: q */
        public final Integer f25438q;

        /* renamed from: r */
        public final Integer f25439r;

        /* renamed from: s */
        public final int[] f25440s;

        /* renamed from: t */
        public final Long f25441t;

        /* renamed from: u */
        public final boolean f25442u;

        /* renamed from: v */
        public final boolean f25443v;

        /* renamed from: w */
        public final boolean f25444w;

        /* renamed from: x */
        public final boolean f25445x;

        /* renamed from: y */
        public final boolean f25446y;

        /* renamed from: z */
        public final long[] f25447z;

        public C4802b(C4806c cVar) {
            this.f25422a = cVar.mo36266p("gcm.n.title");
            this.f25423b = cVar.mo36258h("gcm.n.title");
            this.f25424c = m38625b(cVar, "gcm.n.title");
            this.f25425d = cVar.mo36266p("gcm.n.body");
            this.f25426e = cVar.mo36258h("gcm.n.body");
            this.f25427f = m38625b(cVar, "gcm.n.body");
            this.f25428g = cVar.mo36266p("gcm.n.icon");
            this.f25430i = cVar.mo36265o();
            this.f25431j = cVar.mo36266p("gcm.n.tag");
            this.f25432k = cVar.mo36266p("gcm.n.color");
            this.f25433l = cVar.mo36266p("gcm.n.click_action");
            this.f25434m = cVar.mo36266p("gcm.n.android_channel_id");
            this.f25435n = cVar.mo36256f();
            this.f25429h = cVar.mo36266p("gcm.n.image");
            this.f25436o = cVar.mo36266p("gcm.n.ticker");
            this.f25437p = cVar.mo36253b("gcm.n.notification_priority");
            this.f25438q = cVar.mo36253b("gcm.n.visibility");
            this.f25439r = cVar.mo36253b("gcm.n.notification_count");
            this.f25442u = cVar.mo36252a("gcm.n.sticky");
            this.f25443v = cVar.mo36252a("gcm.n.local_only");
            this.f25444w = cVar.mo36252a("gcm.n.default_sound");
            this.f25445x = cVar.mo36252a("gcm.n.default_vibrate_timings");
            this.f25446y = cVar.mo36252a("gcm.n.default_light_settings");
            this.f25441t = cVar.mo36260j("gcm.n.event_time");
            this.f25440s = cVar.mo36255e();
            this.f25447z = cVar.mo36267q();
        }

        /* renamed from: b */
        public static String[] m38625b(C4806c cVar, String str) {
            Object[] g = cVar.mo36257g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String mo36248a() {
            return this.f25425d;
        }

        /* renamed from: c */
        public String mo36249c() {
            return this.f25422a;
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f25419a = bundle;
    }

    /* renamed from: r1 */
    public Map<String, String> mo36245r1() {
        if (this.f25420d == null) {
            this.f25420d = C4803a.C4804a.m38629a(this.f25419a);
        }
        return this.f25420d;
    }

    /* renamed from: s1 */
    public C4802b mo36246s1() {
        if (this.f25421e == null && C4806c.m38660t(this.f25419a)) {
            this.f25421e = new C4802b(new C4806c(this.f25419a));
        }
        return this.f25421e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        vc5.m53335c(this, parcel, i);
    }
}
