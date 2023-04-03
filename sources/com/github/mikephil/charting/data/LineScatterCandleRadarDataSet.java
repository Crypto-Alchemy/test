package com.github.mikephil.charting.data;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

public abstract class LineScatterCandleRadarDataSet<T extends Entry> extends BarLineScatterCandleBubbleDataSet<T> implements ILineScatterCandleRadarDataSet<T> {
    public boolean mDrawHorizontalHighlightIndicator;
    public boolean mDrawVerticalHighlightIndicator;
    public DashPathEffect mHighlightDashPathEffect;
    public float mHighlightLineWidth;

    public LineScatterCandleRadarDataSet(List<T> list, String str) {
        super(list, str);
        this.mDrawVerticalHighlightIndicator = true;
        this.mDrawHorizontalHighlightIndicator = true;
        this.mHighlightLineWidth = 0.5f;
        this.mHighlightDashPathEffect = null;
        this.mHighlightLineWidth = Utils.convertDpToPixel(0.5f);
    }

    public void copy(LineScatterCandleRadarDataSet lineScatterCandleRadarDataSet) {
        super.copy(lineScatterCandleRadarDataSet);
        lineScatterCandleRadarDataSet.mDrawHorizontalHighlightIndicator = this.mDrawHorizontalHighlightIndicator;
        lineScatterCandleRadarDataSet.mDrawVerticalHighlightIndicator = this.mDrawVerticalHighlightIndicator;
        lineScatterCandleRadarDataSet.mHighlightLineWidth = this.mHighlightLineWidth;
        lineScatterCandleRadarDataSet.mHighlightDashPathEffect = this.mHighlightDashPathEffect;
    }

    public void disableDashedHighlightLine() {
        this.mHighlightDashPathEffect = null;
    }

    public void enableDashedHighlightLine(float f, float f2, float f3) {
        this.mHighlightDashPathEffect = new DashPathEffect(new float[]{f, f2}, f3);
    }

    public DashPathEffect getDashPathEffectHighlight() {
        return this.mHighlightDashPathEffect;
    }

    public float getHighlightLineWidth() {
        return this.mHighlightLineWidth;
    }

    public boolean isDashedHighlightLineEnabled() {
        if (this.mHighlightDashPathEffect == null) {
            return false;
        }
        return true;
    }

    public boolean isHorizontalHighlightIndicatorEnabled() {
        return this.mDrawHorizontalHighlightIndicator;
    }

    public boolean isVerticalHighlightIndicatorEnabled() {
        return this.mDrawVerticalHighlightIndicator;
    }

    public void setDrawHighlightIndicators(boolean z) {
        setDrawVerticalHighlightIndicator(z);
        setDrawHorizontalHighlightIndicator(z);
    }

    public void setDrawHorizontalHighlightIndicator(boolean z) {
        this.mDrawHorizontalHighlightIndicator = z;
    }

    public void setDrawVerticalHighlightIndicator(boolean z) {
        this.mDrawVerticalHighlightIndicator = z;
    }

    public void setHighlightLineWidth(float f) {
        this.mHighlightLineWidth = Utils.convertDpToPixel(f);
    }
}
