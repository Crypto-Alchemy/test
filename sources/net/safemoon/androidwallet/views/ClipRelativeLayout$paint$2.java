package net.safemoon.androidwallet.views;

import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ClipRelativeLayout.kt */
public final class ClipRelativeLayout$paint$2 extends Lambda implements pc2<Paint> {
    public final /* synthetic */ ClipRelativeLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipRelativeLayout$paint$2(ClipRelativeLayout clipRelativeLayout) {
        super(0);
        this.this$0 = clipRelativeLayout;
    }

    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setColor(zr0.m31440c(this.this$0.getContext(), R.color.screen_background_color));
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }
}
