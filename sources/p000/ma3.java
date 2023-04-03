package p000;

import android.view.KeyEvent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\t*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lja3;", "Lx93;", "a", "(Landroid/view/KeyEvent;)J", "key", "Lla3;", "b", "(Landroid/view/KeyEvent;)I", "type", "", "c", "(Landroid/view/KeyEvent;)Z", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ma3 */
/* compiled from: KeyEvent.android.kt */
public final class ma3 {
    /* renamed from: a */
    public static final long m22107a(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "$this$key");
        return lb3.m21355a(keyEvent.getKeyCode());
    }

    /* renamed from: b */
    public static final int m22108b(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action == 0) {
            return la3.f14459a.mo22710a();
        }
        if (action != 1) {
            return la3.f14459a.mo22712c();
        }
        return la3.f14459a.mo22711b();
    }

    /* renamed from: c */
    public static final boolean m22109c(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
