package p000;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: nk9 */
public final class nk9 extends ContentObserver {
    public nk9(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        gk9.f29252e.set(true);
    }
}
