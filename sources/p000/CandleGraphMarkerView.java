package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStatsDataQuoteList;
import net.safemoon.androidwallet.views.marker.BaseGraphMarkerView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, mo44877d2 = {"LCandleGraphMarkerView;", "Lnet/safemoon/androidwallet/views/marker/BaseGraphMarkerView;", "", "getMarkerColor", "Lcom/github/mikephil/charting/data/Entry;", "e", "Lcom/github/mikephil/charting/highlight/Highlight;", "highlight", "Lr37;", "refreshContent", "", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuoteList;", "Ljava/util/List;", "data", "", "g", "Ljava/lang/String;", "currencySymbol", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "tvContent", "Landroid/content/Context;", "context", "layoutResource", "<init>", "(Landroid/content/Context;ILjava/util/List;Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ViewConstructor"})
/* renamed from: CandleGraphMarkerView */
/* compiled from: CandleGraphMarkerView.kt */
public final class CandleGraphMarkerView extends BaseGraphMarkerView {

    /* renamed from: e */
    public final List<CoinPriceStatsDataQuoteList> f0e;

    /* renamed from: g */
    public final String f1g;

    /* renamed from: k */
    public final TextView f2k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CandleGraphMarkerView(Context context, int i, List<CoinPriceStatsDataQuoteList> list, String str) {
        super(context, i);
        vx2.m53591g(list, "data");
        vx2.m53591g(str, "currencySymbol");
        this.f0e = list;
        this.f1g = str;
        View findViewById = findViewById(R.id.tvMarkerContent);
        vx2.m53590f(findViewById, "findViewById(R.id.tvMarkerContent)");
        this.f2k = (TextView) findViewById;
    }

    public int getMarkerColor() {
        return R.color.p5;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
        if (entry instanceof CandleEntry) {
            TextView textView = this.f2k;
            Context context = getContext();
            n21 n21 = n21.f41027a;
            CandleEntry candleEntry = (CandleEntry) entry;
            textView.setText(context.getString(R.string.chart_text_new_line, new Object[]{n21.mo56349a(n21.mo56350b(this.f0e.get((int) candleEntry.getX()).getOpenTimestamp())), this.f1g, ol0.m70374p((double) candleEntry.getClose(), 0, (RoundingMode) null, false, 7, (Object) null)}));
        }
        super.refreshContent(entry, highlight);
    }
}
