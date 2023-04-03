package p000;

import android.os.Bundle;

/* renamed from: u50 */
/* compiled from: BundleCompat */
public class u50 implements t50<Bundle> {

    /* renamed from: a */
    public Bundle f34462a = new Bundle();

    /* renamed from: a */
    public Long mo47984a(String str) {
        return Long.valueOf(this.f34462a.getLong(str));
    }

    /* renamed from: b */
    public Integer mo47985b(String str) {
        return Integer.valueOf(this.f34462a.getInt(str));
    }

    /* renamed from: c */
    public String mo47986c(String str) {
        return this.f34462a.getString(str);
    }

    /* renamed from: d */
    public void mo47987d(String str, Long l) {
        this.f34462a.putLong(str, l.longValue());
    }

    /* renamed from: f */
    public boolean mo47989f(String str) {
        return this.f34462a.containsKey(str);
    }

    /* renamed from: g */
    public Bundle mo47988e() {
        return this.f34462a;
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f34462a.getBoolean(str, z);
    }

    public void putString(String str, String str2) {
        this.f34462a.putString(str, str2);
    }
}
