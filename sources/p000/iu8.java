package p000;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: iu8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class iu8 extends ContentObserver {
    public iu8(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        ku8.f31087e.set(true);
    }
}
