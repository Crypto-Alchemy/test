package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import java.util.ArrayList;
import java.util.List;

public class ChartHighlighter<T extends BarLineScatterCandleBubbleDataProvider> implements IHighlighter {
    public T mChart;
    public List<Highlight> mHighlightBuffer = new ArrayList();

    public ChartHighlighter(T t) {
        this.mChart = t;
    }

    public List<Highlight> buildHighlights(IDataSet iDataSet, int i, float f, DataSet.Rounding rounding) {
        Entry entryForXValue;
        ArrayList arrayList = new ArrayList();
        List<Entry> entriesForXValue = iDataSet.getEntriesForXValue(f);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.getX());
        }
        if (entriesForXValue.size() == 0) {
            return arrayList;
        }
        for (Entry entry : entriesForXValue) {
            MPPointD pixelForValues = this.mChart.getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
            arrayList.add(new Highlight(entry.getX(), entry.getY(), (float) pixelForValues.f10197x, (float) pixelForValues.f10198y, i, iDataSet.getAxisDependency()));
        }
        return arrayList;
    }

    public Highlight getClosestHighlightByPixel(List<Highlight> list, float f, float f2, YAxis.AxisDependency axisDependency, float f3) {
        Highlight highlight = null;
        for (int i = 0; i < list.size(); i++) {
            Highlight highlight2 = list.get(i);
            if (axisDependency == null || highlight2.getAxis() == axisDependency) {
                float distance = getDistance(f, f2, highlight2.getXPx(), highlight2.getYPx());
                if (distance < f3) {
                    highlight = highlight2;
                    f3 = distance;
                }
            }
        }
        return highlight;
    }

    public BarLineScatterCandleBubbleData getData() {
        return this.mChart.getData();
    }

    public float getDistance(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f - f3), (double) (f2 - f4));
    }

    public Highlight getHighlight(float f, float f2) {
        MPPointD valsForTouch = getValsForTouch(f, f2);
        MPPointD.recycleInstance(valsForTouch);
        return getHighlightForX((float) valsForTouch.f10197x, f, f2);
    }

    public Highlight getHighlightForX(float f, float f2, float f3) {
        YAxis.AxisDependency axisDependency;
        List<Highlight> highlightsAtXValue = getHighlightsAtXValue(f, f2, f3);
        if (highlightsAtXValue.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.LEFT;
        float minimumDistance = getMinimumDistance(highlightsAtXValue, f3, axisDependency2);
        YAxis.AxisDependency axisDependency3 = YAxis.AxisDependency.RIGHT;
        if (minimumDistance < getMinimumDistance(highlightsAtXValue, f3, axisDependency3)) {
            axisDependency = axisDependency2;
        } else {
            axisDependency = axisDependency3;
        }
        return getClosestHighlightByPixel(highlightsAtXValue, f2, f3, axisDependency, this.mChart.getMaxHighlightDistance());
    }

    public float getHighlightPos(Highlight highlight) {
        return highlight.getYPx();
    }

    public List<Highlight> getHighlightsAtXValue(float f, float f2, float f3) {
        this.mHighlightBuffer.clear();
        BarLineScatterCandleBubbleData data = getData();
        if (data == null) {
            return this.mHighlightBuffer;
        }
        int dataSetCount = data.getDataSetCount();
        for (int i = 0; i < dataSetCount; i++) {
            IDataSet dataSetByIndex = data.getDataSetByIndex(i);
            if (dataSetByIndex.isHighlightEnabled()) {
                this.mHighlightBuffer.addAll(buildHighlights(dataSetByIndex, i, f, DataSet.Rounding.CLOSEST));
            }
        }
        return this.mHighlightBuffer;
    }

    public float getMinimumDistance(List<Highlight> list, float f, YAxis.AxisDependency axisDependency) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            Highlight highlight = list.get(i);
            if (highlight.getAxis() == axisDependency) {
                float abs = Math.abs(getHighlightPos(highlight) - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    public MPPointD getValsForTouch(float f, float f2) {
        return this.mChart.getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(f, f2);
    }
}
