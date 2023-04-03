package p000;

import android.graphics.Canvas;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Lgb0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Lr37;", "a", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gb0 */
/* compiled from: CanvasUtils.android.kt */
public final class gb0 {

    /* renamed from: a */
    public static final gb0 f12260a = new gb0();

    /* renamed from: a */
    public final void mo20492a(Canvas canvas, boolean z) {
        vx2.m53591g(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
