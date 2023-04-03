package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: c32 */
/* compiled from: FirebaseOptions */
public final class c32 {

    /* renamed from: a */
    public final String f21577a;

    /* renamed from: b */
    public final String f21578b;

    /* renamed from: c */
    public final String f21579c;

    /* renamed from: d */
    public final String f21580d;

    /* renamed from: e */
    public final String f21581e;

    /* renamed from: f */
    public final String f21582f;

    /* renamed from: g */
    public final String f21583g;

    /* renamed from: c32$b */
    /* compiled from: FirebaseOptions */
    public static final class C3924b {

        /* renamed from: a */
        public String f21584a;

        /* renamed from: b */
        public String f21585b;

        /* renamed from: c */
        public String f21586c;

        /* renamed from: d */
        public String f21587d;

        /* renamed from: e */
        public String f21588e;

        /* renamed from: f */
        public String f21589f;

        /* renamed from: g */
        public String f21590g;

        /* renamed from: a */
        public c32 mo29858a() {
            return new c32(this.f21585b, this.f21584a, this.f21586c, this.f21587d, this.f21588e, this.f21589f, this.f21590g);
        }

        /* renamed from: b */
        public C3924b mo29859b(String str) {
            this.f21584a = cu4.m43218h(str, "ApiKey must be set.");
            return this;
        }

        /* renamed from: c */
        public C3924b mo29860c(String str) {
            this.f21585b = cu4.m43218h(str, "ApplicationId must be set.");
            return this;
        }

        /* renamed from: d */
        public C3924b mo29861d(String str) {
            this.f21588e = str;
            return this;
        }

        /* renamed from: e */
        public C3924b mo29862e(String str) {
            this.f21590g = str;
            return this;
        }
    }

    /* renamed from: a */
    public static c32 m32834a(Context context) {
        hb6 hb6 = new hb6(context);
        String a = hb6.mo43126a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new c32(a, hb6.mo43126a("google_api_key"), hb6.mo43126a("firebase_database_url"), hb6.mo43126a("ga_trackingId"), hb6.mo43126a("gcm_defaultSenderId"), hb6.mo43126a("google_storage_bucket"), hb6.mo43126a("project_id"));
    }

    /* renamed from: b */
    public String mo29851b() {
        return this.f21577a;
    }

    /* renamed from: c */
    public String mo29852c() {
        return this.f21578b;
    }

    /* renamed from: d */
    public String mo29853d() {
        return this.f21581e;
    }

    /* renamed from: e */
    public String mo29854e() {
        return this.f21583g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c32)) {
            return false;
        }
        c32 c32 = (c32) obj;
        if (!if4.m45709a(this.f21578b, c32.f21578b) || !if4.m45709a(this.f21577a, c32.f21577a) || !if4.m45709a(this.f21579c, c32.f21579c) || !if4.m45709a(this.f21580d, c32.f21580d) || !if4.m45709a(this.f21581e, c32.f21581e) || !if4.m45709a(this.f21582f, c32.f21582f) || !if4.m45709a(this.f21583g, c32.f21583g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return if4.m45710b(this.f21578b, this.f21577a, this.f21579c, this.f21580d, this.f21581e, this.f21582f, this.f21583g);
    }

    public String toString() {
        return if4.m45711c(this).mo43587a("applicationId", this.f21578b).mo43587a("apiKey", this.f21577a).mo43587a("databaseUrl", this.f21579c).mo43587a("gcmSenderId", this.f21581e).mo43587a("storageBucket", this.f21582f).mo43587a("projectId", this.f21583g).toString();
    }

    public c32(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        cu4.m43226p(!qb6.m50490a(str), "ApplicationId must be set.");
        this.f21578b = str;
        this.f21577a = str2;
        this.f21579c = str3;
        this.f21580d = str4;
        this.f21581e = str5;
        this.f21582f = str6;
        this.f21583g = str7;
    }
}
