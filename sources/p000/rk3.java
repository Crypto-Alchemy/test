package p000;

import android.util.Log;

/* renamed from: rk3 */
/* compiled from: Logger */
public class rk3 {

    /* renamed from: c */
    public static final rk3 f33446c = new rk3("FirebaseCrashlytics");

    /* renamed from: a */
    public final String f33447a;

    /* renamed from: b */
    public int f33448b = 4;

    public rk3(String str) {
        this.f33447a = str;
    }

    /* renamed from: f */
    public static rk3 m51112f() {
        return f33446c;
    }

    /* renamed from: a */
    public final boolean mo47422a(int i) {
        if (this.f33448b <= i || Log.isLoggable(this.f33447a, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo47423b(String str) {
        mo47424c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo47424c(String str, Throwable th) {
        mo47422a(3);
    }

    /* renamed from: d */
    public void mo47425d(String str) {
        mo47426e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo47426e(String str, Throwable th) {
        mo47422a(6);
    }

    /* renamed from: g */
    public void mo47427g(String str) {
        mo47428h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo47428h(String str, Throwable th) {
        mo47422a(4);
    }

    /* renamed from: i */
    public void mo47429i(String str) {
        mo47430j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo47430j(String str, Throwable th) {
        mo47422a(2);
    }

    /* renamed from: k */
    public void mo47431k(String str) {
        mo47432l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo47432l(String str, Throwable th) {
        mo47422a(5);
    }
}
