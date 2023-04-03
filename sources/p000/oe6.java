package p000;

import android.graphics.drawable.PictureDrawable;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, mo44877d2 = {"Loe6;", "Lsf5;", "Lcom/caverock/androidsvg/SVG;", "Landroid/graphics/drawable/PictureDrawable;", "Lbf5;", "toTranscode", "Lxi4;", "options", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: oe6 */
/* compiled from: SvgDrawableTranscoder.kt */
public final class oe6 implements sf5<SVG, PictureDrawable> {
    /* renamed from: a */
    public bf5<PictureDrawable> mo18396a(bf5<SVG> bf5, xi4 xi4) {
        vx2.m53591g(bf5, "toTranscode");
        vx2.m53591g(xi4, "options");
        SVG svg = bf5.get();
        vx2.m53590f(svg, "toTranscode.get()");
        return new x26(new PictureDrawable(svg.mo12754n()));
    }
}
