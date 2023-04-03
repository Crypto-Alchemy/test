package p000;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: tu8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class tu8 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ kv8 f34392a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tu8(kv8 kv8, Handler handler) {
        super((Handler) null);
        this.f34392a = kv8;
    }

    public final void onChange(boolean z) {
        this.f34392a.mo45304d();
    }
}
