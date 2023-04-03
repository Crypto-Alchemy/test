package p000;

import android.os.PersistableBundle;

/* renamed from: w50 */
/* compiled from: BundleCompat */
public class w50 implements t50<PersistableBundle> {

    /* renamed from: a */
    public PersistableBundle f35235a = new PersistableBundle();

    /* renamed from: a */
    public Long mo47984a(String str) {
        return Long.valueOf(this.f35235a.getLong(str));
    }

    /* renamed from: b */
    public Integer mo47985b(String str) {
        return Integer.valueOf(this.f35235a.getInt(str));
    }

    /* renamed from: c */
    public String mo47986c(String str) {
        return this.f35235a.getString(str);
    }

    /* renamed from: d */
    public void mo47987d(String str, Long l) {
        this.f35235a.putLong(str, l.longValue());
    }

    /* renamed from: f */
    public boolean mo47989f(String str) {
        return this.f35235a.containsKey(str);
    }

    /* renamed from: g */
    public PersistableBundle mo47988e() {
        return this.f35235a;
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f35235a.getBoolean(str, z);
    }

    public void putString(String str, String str2) {
        this.f35235a.putString(str, str2);
    }
}
