package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
import java.util.List;

public class RadarDataSet extends LineRadarDataSet<RadarEntry> implements IRadarDataSet {
    public boolean mDrawHighlightCircleEnabled = false;
    public int mHighlightCircleFillColor = -1;
    public float mHighlightCircleInnerRadius = 3.0f;
    public float mHighlightCircleOuterRadius = 4.0f;
    public int mHighlightCircleStrokeAlpha = 76;
    public int mHighlightCircleStrokeColor = ColorTemplate.COLOR_NONE;
    public float mHighlightCircleStrokeWidth = 2.0f;

    public RadarDataSet(List<RadarEntry> list, String str) {
        super(list, str);
    }

    public DataSet<RadarEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((RadarEntry) this.mValues.get(i)).copy());
        }
        RadarDataSet radarDataSet = new RadarDataSet(arrayList, getLabel());
        copy(radarDataSet);
        return radarDataSet;
    }

    public int getHighlightCircleFillColor() {
        return this.mHighlightCircleFillColor;
    }

    public float getHighlightCircleInnerRadius() {
        return this.mHighlightCircleInnerRadius;
    }

    public float getHighlightCircleOuterRadius() {
        return this.mHighlightCircleOuterRadius;
    }

    public int getHighlightCircleStrokeAlpha() {
        return this.mHighlightCircleStrokeAlpha;
    }

    public int getHighlightCircleStrokeColor() {
        return this.mHighlightCircleStrokeColor;
    }

    public float getHighlightCircleStrokeWidth() {
        return this.mHighlightCircleStrokeWidth;
    }

    public boolean isDrawHighlightCircleEnabled() {
        return this.mDrawHighlightCircleEnabled;
    }

    public void setDrawHighlightCircleEnabled(boolean z) {
        this.mDrawHighlightCircleEnabled = z;
    }

    public void setHighlightCircleFillColor(int i) {
        this.mHighlightCircleFillColor = i;
    }

    public void setHighlightCircleInnerRadius(float f) {
        this.mHighlightCircleInnerRadius = f;
    }

    public void setHighlightCircleOuterRadius(float f) {
        this.mHighlightCircleOuterRadius = f;
    }

    public void setHighlightCircleStrokeAlpha(int i) {
        this.mHighlightCircleStrokeAlpha = i;
    }

    public void setHighlightCircleStrokeColor(int i) {
        this.mHighlightCircleStrokeColor = i;
    }

    public void setHighlightCircleStrokeWidth(float f) {
        this.mHighlightCircleStrokeWidth = f;
    }

    public void copy(RadarDataSet radarDataSet) {
        super.copy(radarDataSet);
        radarDataSet.mDrawHighlightCircleEnabled = this.mDrawHighlightCircleEnabled;
        radarDataSet.mHighlightCircleFillColor = this.mHighlightCircleFillColor;
        radarDataSet.mHighlightCircleInnerRadius = this.mHighlightCircleInnerRadius;
        radarDataSet.mHighlightCircleStrokeAlpha = this.mHighlightCircleStrokeAlpha;
        radarDataSet.mHighlightCircleStrokeColor = this.mHighlightCircleStrokeColor;
        radarDataSet.mHighlightCircleStrokeWidth = this.mHighlightCircleStrokeWidth;
    }
}
