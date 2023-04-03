package p000;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: py1 */
/* compiled from: FLogDefaultLoggingDelegate */
public class py1 implements yk3 {

    /* renamed from: c */
    public static final py1 f16666c = new py1();

    /* renamed from: a */
    public String f16667a = "unknown";

    /* renamed from: b */
    public int f16668b = 5;

    /* renamed from: k */
    public static py1 m25208k() {
        return f16666c;
    }

    /* renamed from: l */
    public static String m25209l(String str, Throwable th) {
        return str + 10 + m25210m(th);
    }

    /* renamed from: m */
    public static String m25210m(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo24797a(String str, String str2) {
        mo24808o(5, str, str2);
    }

    /* renamed from: b */
    public void mo24798b(String str, String str2) {
        mo24808o(6, str, str2);
    }

    /* renamed from: c */
    public void mo24799c(String str, String str2) {
        mo24808o(3, str, str2);
    }

    /* renamed from: d */
    public void mo24800d(String str, String str2, Throwable th) {
        mo24809p(6, str, str2, th);
    }

    /* renamed from: e */
    public void mo24801e(String str, String str2) {
        mo24808o(2, str, str2);
    }

    /* renamed from: f */
    public void mo24802f(String str, String str2) {
        mo24808o(6, str, str2);
    }

    /* renamed from: g */
    public void mo24803g(String str, String str2, Throwable th) {
        mo24809p(3, str, str2, th);
    }

    /* renamed from: h */
    public void mo24804h(String str, String str2, Throwable th) {
        mo24809p(6, str, str2, th);
    }

    /* renamed from: i */
    public void mo24805i(String str, String str2, Throwable th) {
        mo24809p(5, str, str2, th);
    }

    /* renamed from: j */
    public boolean mo24806j(int i) {
        if (this.f16668b <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final String mo24807n(String str) {
        if (this.f16667a == null) {
            return str;
        }
        return this.f16667a + ":" + str;
    }

    /* renamed from: o */
    public final void mo24808o(int i, String str, String str2) {
        Log.println(i, mo24807n(str), str2);
    }

    /* renamed from: p */
    public final void mo24809p(int i, String str, String str2, Throwable th) {
        Log.println(i, mo24807n(str), m25209l(str2, th));
    }
}
