package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import p000.eg5;

/* renamed from: j18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class j18<R extends eg5> extends sw6<R> implements fg5<R> {

    /* renamed from: a */
    public jg5 f30202a;

    /* renamed from: b */
    public j18 f30203b;

    /* renamed from: c */
    public volatile gg5 f30204c;

    /* renamed from: d */
    public final Object f30205d;

    /* renamed from: e */
    public Status f30206e;

    /* renamed from: f */
    public final WeakReference f30207f;

    /* renamed from: j */
    public static final void m46097j(eg5 eg5) {
        if (eg5 instanceof jc5) {
            try {
                ((jc5) eg5).mo44381a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(eg5));
            }
        }
    }

    /* renamed from: a */
    public final void mo42594a(eg5 eg5) {
        synchronized (this.f30205d) {
            if (!eg5.mo30519e().mo30528w1()) {
                mo43996g(eg5.mo30519e());
                m46097j(eg5);
            } else if (this.f30202a != null) {
                s08.m51512a().submit(new z08(this, eg5));
            } else if (mo43998i()) {
                ((gg5) cu4.m43221k(this.f30204c)).mo42891c(eg5);
            }
        }
    }

    /* renamed from: f */
    public final void mo43995f() {
        this.f30204c = null;
    }

    /* renamed from: g */
    public final void mo43996g(Status status) {
        synchronized (this.f30205d) {
            this.f30206e = status;
            mo43997h(status);
        }
    }

    /* renamed from: h */
    public final void mo43997h(Status status) {
        synchronized (this.f30205d) {
            jg5 jg5 = this.f30202a;
            if (jg5 != null) {
                ((j18) cu4.m43221k(this.f30203b)).mo43996g((Status) cu4.m43222l(jg5.mo44461a(status), "onFailure must not return null"));
            } else if (mo43998i()) {
                ((gg5) cu4.m43221k(this.f30204c)).mo42890b(status);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo43998i() {
        GoogleApiClient googleApiClient = (GoogleApiClient) this.f30207f.get();
        if (this.f30204c == null || googleApiClient == null) {
            return false;
        }
        return true;
    }
}
