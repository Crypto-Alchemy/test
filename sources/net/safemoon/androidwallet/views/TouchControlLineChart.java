package net.safemoon.androidwallet.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.charts.LineChart;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014J\u001c\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R&\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/TouchControlLineChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lr37;", "callBack", "a", "event", "", "onTouchEvent", "Lrc2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TouchControlLineChart.kt */
public final class TouchControlLineChart extends LineChart {

    /* renamed from: a */
    public rc2<? super MotionEvent, r37> f43264a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchControlLineChart(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }

    /* renamed from: a */
    public final void mo62138a(rc2<? super MotionEvent, r37> rc2) {
        vx2.m53591g(rc2, "callBack");
        this.f43264a = rc2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        rc2<? super MotionEvent, r37> rc2 = this.f43264a;
        if (rc2 != null) {
            rc2.invoke(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchControlLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchControlLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
    }
}
