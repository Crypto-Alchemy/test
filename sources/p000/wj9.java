package p000;

import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;

@CheckReturnValue
/* renamed from: wj9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class wj9 {

    /* renamed from: e */
    public static final wj9 f35364e = new wj9(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a */
    public final boolean f35365a;

    /* renamed from: b */
    public final String f35366b;

    /* renamed from: c */
    public final Throwable f35367c;

    /* renamed from: d */
    public final int f35368d;

    public wj9(boolean z, int i, int i2, String str, Throwable th) {
        this.f35365a = z;
        this.f35368d = i;
        this.f35366b = str;
        this.f35367c = th;
    }

    public /* synthetic */ wj9(boolean z, int i, int i2, String str, Throwable th, oj9 oj9) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    /* renamed from: b */
    public static wj9 m53931b() {
        return f35364e;
    }

    /* renamed from: c */
    public static wj9 m53932c(String str) {
        return new wj9(false, 1, 5, str, (Throwable) null);
    }

    /* renamed from: d */
    public static wj9 m53933d(String str, Throwable th) {
        return new wj9(false, 1, 5, str, th);
    }

    /* renamed from: f */
    public static wj9 m53934f(int i) {
        return new wj9(true, i, 1, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    public static wj9 m53935g(int i, int i2, String str, Throwable th) {
        return new wj9(false, i, i2, str, th);
    }

    /* renamed from: a */
    public String mo42904a() {
        return this.f35366b;
    }

    /* renamed from: e */
    public final void mo49216e() {
        if (!this.f35365a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f35367c != null) {
                mo42904a();
            } else {
                mo42904a();
            }
        }
    }
}
