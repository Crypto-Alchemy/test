package p000;

import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.graph.TradingViewSymbol;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\b"}, mo44877d2 = {"Llt6;", "", "", "text", "Lk90;", "", "Lnet/safemoon/androidwallet/model/graph/TradingViewSymbol;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lt6 */
/* compiled from: TradingViewInterface.kt */
public interface lt6 {
    @le2("/symbol_search/?hl=1&exchange=&lang=en&type=crypto&domain=production")
    /* renamed from: a */
    k90<List<TradingViewSymbol>> mo55980a(@sz4("text") String str);
}
