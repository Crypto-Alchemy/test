package net.safemoon.androidwallet.views.marker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\n \u000e*\u0004\u0018\u00010\u00120\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/marker/ReflectionLineGraphMarkerView;", "Lnet/safemoon/androidwallet/views/marker/BaseGraphMarkerView;", "", "getMarkerColor", "Lcom/github/mikephil/charting/data/Entry;", "e", "Lcom/github/mikephil/charting/highlight/Highlight;", "highlight", "Lr37;", "refreshContent", "", "Ljava/lang/String;", "currencySymbol", "Landroid/view/View;", "kotlin.jvm.PlatformType", "g", "Landroid/view/View;", "wrapContent", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "tvContent", "Landroid/content/Context;", "context", "layoutResource", "<init>", "(Landroid/content/Context;ILjava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ViewConstructor"})
/* compiled from: ReflectionLineGraphMarkerView.kt */
public final class ReflectionLineGraphMarkerView extends BaseGraphMarkerView {

    /* renamed from: e */
    public final String f43354e;

    /* renamed from: g */
    public final View f43355g;

    /* renamed from: k */
    public final TextView f43356k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionLineGraphMarkerView(Context context, int i, String str) {
        super(context, i);
        vx2.m53591g(str, "currencySymbol");
        this.f43354e = str;
        View findViewById = findViewById(R.id.wrapContent);
        findViewById.setBackgroundResource(R.color.white);
        this.f43355g = findViewById;
        TextView textView = (TextView) findViewById(R.id.tvMarkerContent);
        textView.setTextColor(zr0.m31440c(textView.getContext(), R.color.curve_green));
        this.f43356k = textView;
    }

    public int getMarkerColor() {
        return R.color.white;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
        long j;
        String str;
        TextView textView = this.f43356k;
        Context context = getContext();
        Object[] objArr = new Object[3];
        Common common = Common.f42577a;
        if (entry != null) {
            j = (long) entry.getX();
        } else {
            j = 0;
        }
        Date date = new Date(j * ((long) 1000));
        Context context2 = getContext();
        vx2.m53590f(context2, "context");
        objArr[0] = common.mo60900f(date, context2);
        objArr[1] = this.f43354e;
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
