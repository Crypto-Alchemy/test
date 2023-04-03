package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0006"}, mo44877d2 = {"", "a", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "defaultFiat", "b", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: sz1 */
/* compiled from: FiatData.kt */
public final class sz1 {
    /* renamed from: a */
    public static final double m72124a(double d) {
        rz1.C9291a aVar = rz1.f44501a;
        if (aVar.mo65771a().getRate() == null) {
            return d;
        }
        Double rate = aVar.mo65771a().getRate();
        vx2.m53588d(rate);
        return d * rate.doubleValue();
    }

    /* renamed from: b */
    public static final double m72125b(double d, Fiat fiat) {
        vx2.m53591g(fiat, "defaultFiat");
        if (fiat.getRate() != null) {
            return d * fiat.getRate().doubleValue();
        }
        return d;
    }

    /* renamed from: c */
    public static final double m72126c(double d) {
        rz1.C9291a aVar = rz1.f44501a;
        if (aVar.mo65771a().getRate() == null) {
            return d;
        }
        Double rate = aVar.mo65771a().getRate();
        vx2.m53588d(rate);
        return d / rate.doubleValue();
    }
}
