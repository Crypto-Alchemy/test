package p000;

import com.google.android.gms.common.api.Status;
import p000.eg5;

/* renamed from: gg5 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class gg5<R extends eg5> implements fg5<R> {
    /* renamed from: a */
    public final void mo42594a(R r) {
        Status e = r.mo30519e();
        if (e.mo30528w1()) {
            mo42891c(r);
            return;
        }
        mo42890b(e);
        if (r instanceof jc5) {
            try {
                ((jc5) r).mo44381a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r));
            }
        }
    }

    /* renamed from: b */
    public abstract void mo42890b(Status status);

    /* renamed from: c */
    public abstract void mo42891c(R r);
}
