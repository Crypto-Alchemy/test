package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Utils;

public class DefaultFillFormatter implements IFillFormatter {
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        float yChartMax = lineDataProvider.getYChartMax();
        float yChartMin = lineDataProvider.getYChartMin();
        LineData lineData = lineDataProvider.getLineData();
        if (iLineDataSet.getYMax() > Utils.FLOAT_EPSILON && iLineDataSet.getYMin() < Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        if (lineData.getYMax() > Utils.FLOAT_EPSILON) {
            yChartMax = 0.0f;
        }
        if (lineData.getYMin() < Utils.FLOAT_EPSILON) {
            yChartMin = 0.0f;
        }
        if (iLineDataSet.getYMin() >= Utils.FLOAT_EPSILON) {
            return yChartMin;
        }
        return yChartMax;
    }
}
