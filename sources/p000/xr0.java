package p000;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: xr0 */
/* compiled from: ContextAwareHelper */
public final class xr0 {

    /* renamed from: a */
    public final Set<eh4> f19957a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f19958b;

    /* renamed from: a */
    public void mo27859a(eh4 eh4) {
        if (this.f19958b != null) {
            eh4.mo1057a(this.f19958b);
        }
        this.f19957a.add(eh4);
    }

    /* renamed from: b */
    public void mo27860b() {
        this.f19958b = null;
    }

    /* renamed from: c */
    public void mo27861c(Context context) {
        this.f19958b = context;
        for (eh4 a : this.f19957a) {
            a.mo1057a(context);
        }
    }

    /* renamed from: d */
    public Context mo27862d() {
        return this.f19958b;
    }

    /* renamed from: e */
    public void mo27863e(eh4 eh4) {
        this.f19957a.remove(eh4);
    }
}
