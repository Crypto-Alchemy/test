package p000;

import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, mo44877d2 = {"Lry3;", "", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "Ltf4;", "a", "(Landroid/view/MotionEvent;I)J", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ry3 */
/* compiled from: MotionEventAdapter.android.kt */
public final class ry3 {

    /* renamed from: a */
    public static final ry3 f17390a = new ry3();

    /* renamed from: a */
    public final long mo25562a(MotionEvent motionEvent, int i) {
        vx2.m53591g(motionEvent, "motionEvent");
        return wf4.m29550a(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
