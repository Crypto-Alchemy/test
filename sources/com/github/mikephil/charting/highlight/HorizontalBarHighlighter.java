package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import java.util.ArrayList;
import java.util.List;

public class HorizontalBarHighlighter extends BarHighlighter {
    public HorizontalBarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
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
            MPPointD pixelForValues = ((BarDataProvider) this.mChart).getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getY(), entry.getX());
            arrayList.add(new Highlight(entry.getX(), entry.getY(), (float) pixelForValues.f10197x, (float) pixelForValues.f10198y, i, iDataSet.getAxisDependency()));
        }
        return arrayList;
    }

    public float getDistance(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }

    public Highlight getHighlight(float f, float f2) {
        BarData barData = ((BarDataProvider) this.mChart).getBarData();
        MPPointD valsForTouch = getValsForTouch(f2, f);
        Highlight highlightForX = getHighlightForX((float) valsForTouch.f10198y, f2, f);
        if (highlightForX == null) {
            return null;
        }
        IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlightForX.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlightForX, iBarDataSet, (float) valsForTouch.f10198y, (float) valsForTouch.f10197x);
        }
        MPPointD.recycleInstance(valsForTouch);
        return highlightForX;
    }
}
