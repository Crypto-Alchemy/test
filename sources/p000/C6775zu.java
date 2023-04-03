package p000;

import android.content.Context;

/* renamed from: zu */
/* compiled from: AutoValue_CreationContext */
public final class C6775zu extends wv0 {

    /* renamed from: a */
    public final Context f36264a;

    /* renamed from: b */
    public final ah0 f36265b;

    /* renamed from: c */
    public final ah0 f36266c;

    /* renamed from: d */
    public final String f36267d;

    public C6775zu(Context context, ah0 ah0, ah0 ah02, String str) {
        if (context != null) {
            this.f36264a = context;
            if (ah0 != null) {
                this.f36265b = ah0;
                if (ah02 != null) {
                    this.f36266c = ah02;
                    if (str != null) {
                        this.f36267d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: b */
    public Context mo49280b() {
        return this.f36264a;
    }

    /* renamed from: c */
    public String mo49281c() {
        return this.f36267d;
    }

    /* renamed from: d */
    public ah0 mo49282d() {
        return this.f36266c;
    }

    /* renamed from: e */
    public ah0 mo49283e() {
        return this.f36265b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wv0)) {
            return false;
        }
        wv0 wv0 = (wv0) obj;
        if (!this.f36264a.equals(wv0.mo49280b()) || !this.f36265b.equals(wv0.mo49283e()) || !this.f36266c.equals(wv0.mo49282d()) || !this.f36267d.equals(wv0.mo49281c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f36264a.hashCode() ^ 1000003) * 1000003) ^ this.f36265b.hashCode()) * 1000003) ^ this.f36266c.hashCode()) * 1000003) ^ this.f36267d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f36264a + ", wallClock=" + this.f36265b + ", monotonicClock=" + this.f36266c + ", backendName=" + this.f36267d + "}";
    }
}
