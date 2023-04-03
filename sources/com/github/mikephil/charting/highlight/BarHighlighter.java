package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointD;

public class BarHighlighter extends ChartHighlighter<BarDataProvider> {
    public BarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    public int getClosestStackIndex(Range[] rangeArr, float f) {
        if (rangeArr == null || rangeArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (Range contains : rangeArr) {
            if (contains.contains(f)) {
                return i;
            }
            i++;
        }
        int max = Math.max(rangeArr.length - 1, 0);
        if (f > rangeArr[max].f10188to) {
            return max;
        }
        return 0;
    }

    public BarLineScatterCandleBubbleData getData() {
        return ((BarDataProvider) this.mChart).getBarData();
    }

    public float getDistance(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    public Highlight getHighlight(float f, float f2) {
        Highlight highlight = super.getHighlight(f, f2);
        if (highlight == null) {
            return null;
        }
        MPPointD valsForTouch = getValsForTouch(f, f2);
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarDataProvider) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlight, iBarDataSet, (float) valsForTouch.f10197x, (float) valsForTouch.f10198y);
        }
        MPPointD.recycleInstance(valsForTouch);
        return highlight;
    }

    public Highlight getStackedHighlight(Highlight highlight, IBarDataSet iBarDataSet, float f, float f2) {
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.getYVals() == null) {
            return highlight;
        }
        Range[] ranges = barEntry.getRanges();
        if (ranges.length <= 0) {
            return null;
        }
        int closestStackIndex = getClosestStackIndex(ranges, f2);
        MPPointD pixelForValues = ((BarDataProvider) this.mChart).getTransformer(iBarDataSet.getAxisDependency()).getPixelForValues(highlight.getX(), ranges[closestStackIndex].f10188to);
        Highlight highlight2 = new Highlight(barEntry.getX(), barEntry.getY(), (float) pixelForValues.f10197x, (float) pixelForValues.f10198y, highlight.getDataSetIndex(), closestStackIndex, highlight.getAxis());
        MPPointD.recycleInstance(pixelForValues);
        return highlight2;
    }
}
