package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;

/* renamed from: c88 */
public final class c88 extends i68 {

    /* renamed from: m */
    public final Object f21623m = new Object();

    /* renamed from: n */
    public String f21624n;

    /* renamed from: o */
    public Object f21625o;

    /* renamed from: p */
    public final /* synthetic */ k88 f21626p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c88(n88 n88, String str, Object obj, k88 k88) {
        super(n88, str, obj, (i78) null);
        this.f21626p = k88;
    }

    /* renamed from: c */
    public final Object mo29887c(SharedPreferences sharedPreferences) {
        try {
            return mo29888j(sharedPreferences.getString(this.f29835b, ""));
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.f29835b);
            if (valueOf.length() == 0) {
                return null;
            }
            "Invalid byte[] value in SharedPreferences for ".concat(valueOf);
            return null;
        }
    }

    /* renamed from: j */
    public final Object mo29888j(String str) {
        Object obj;
        try {
            synchronized (this.f21623m) {
                if (!str.equals(this.f21624n)) {
                    Object a = this.f21626p.mo44702a(Base64.decode(str, 3));
                    this.f21624n = str;
                    this.f21625o = a;
                }
                obj = this.f21625o;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f29835b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            return null;
        }
    }
}
