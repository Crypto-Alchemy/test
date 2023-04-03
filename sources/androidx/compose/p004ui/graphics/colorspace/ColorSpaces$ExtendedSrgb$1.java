package androidx.compose.p004ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaces$ExtendedSrgb$1 */
/* compiled from: ColorSpaces.kt */
public final class ColorSpaces$ExtendedSrgb$1 extends Lambda implements rc2<Double, Double> {
    public static final ColorSpaces$ExtendedSrgb$1 INSTANCE = new ColorSpaces$ExtendedSrgb$1();

    public ColorSpaces$ExtendedSrgb$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final Double invoke(double d) {
        return Double.valueOf(dl0.m15150a(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
    }
}
