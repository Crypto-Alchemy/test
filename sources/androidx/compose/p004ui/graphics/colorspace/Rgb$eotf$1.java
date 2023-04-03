package androidx.compose.p004ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 */
/* compiled from: Rgb.kt */
public final class Rgb$eotf$1 extends Lambda implements rc2<Double, Double> {
    public final /* synthetic */ Rgb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    public final Double invoke(double d) {
        return this.this$0.mo3292m().invoke(Double.valueOf(d75.m43387i(d, (double) this.this$0.f1690f, (double) this.this$0.f1691g)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
