package net.safemoon.androidwallet.views.marker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.math.RoundingMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/marker/LineGraphMarkerView;", "Lnet/safemoon/androidwallet/views/marker/BaseGraphMarkerView;", "", "getMarkerColor", "Lcom/github/mikephil/charting/data/Entry;", "e", "Lcom/github/mikephil/charting/highlight/Highlight;", "highlight", "Lr37;", "refreshContent", "", "Ljava/lang/String;", "currencySymbol", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "tvContent", "Landroid/content/Context;", "context", "layoutResource", "<init>", "(Landroid/content/Context;ILjava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ViewConstructor"})
/* compiled from: LineGraphMarkerView.kt */
public final class LineGraphMarkerView extends BaseGraphMarkerView {

    /* renamed from: e */
    public final String f43352e;

    /* renamed from: g */
    public final TextView f43353g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LineGraphMarkerView(Context context, int i, String str) {
        super(context, i);
        vx2.m53591g(str, "currencySymbol");
        this.f43352e = str;
        View findViewById = findViewById(R.id.tvMarkerContent);
        vx2.m53590f(findViewById, "findViewById(R.id.tvMarkerContent)");
        this.f43353g = (TextView) findViewById;
    }

    public int getMarkerColor() {
        return R.color.p5;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
        long j;
        String str;
        TextView textView = this.f43353g;
        Context context = getContext();
        Object[] objArr = new Object[3];
        n21 n21 = n21.f41027a;
        if (entry != null) {
            j = (long) entry.getX();
        } else {
            j = 0;
        }
        objArr[0] = n21.mo56349a(j);
        objArr[1] = this.f43352e;
        if (entry != null) {
            str = ol0.m70374p((double) entry.getY(), 0, (RoundingMode) null, false, 7, (Object) null);
        } else {
            str = null;
        }
        objArr[2] = str;
        textView.setText(context.getString(R.string.chart_text_new_line, objArr));
        super.refreshContent(entry, highlight);
    }
}
