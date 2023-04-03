package p000;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: s58 */
public final class s58 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ l58 f33715a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s58(l58 l58, Handler handler) {
        super((Handler) null);
        this.f33715a = l58;
    }

    public final void onChange(boolean z) {
        this.f33715a.mo45348d();
        this.f33715a.mo45350f();
    }
}
