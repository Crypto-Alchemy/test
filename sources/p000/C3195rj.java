package p000;

import android.os.Looper;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0002"}, mo44877d2 = {"", "b", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: rj */
/* compiled from: AndroidUiDispatcher.android.kt */
public final class C3195rj {
    /* renamed from: b */
    public static final boolean m26215b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
