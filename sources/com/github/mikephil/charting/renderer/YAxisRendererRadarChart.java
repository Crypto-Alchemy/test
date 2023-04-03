package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class YAxisRendererRadarChart extends YAxisRenderer {
    private RadarChart mChart;
    private Path mRenderLimitLinesPathBuffer = new Path();

    public YAxisRendererRadarChart(ViewPortHandler viewPortHandler, YAxis yAxis, RadarChart radarChart) {
        super(viewPortHandler, yAxis, (Transformer) null);
        this.mChart = radarChart;
    }

    public void computeAxisValues(float f, float f2) {
        double d;
        double d2;
        boolean z;
        float f3 = f;
        float f4 = f2;
        int labelCount = this.mAxis.getLabelCount();
        double abs = (double) Math.abs(f4 - f3);
        if (labelCount == 0 || abs <= Utils.DOUBLE_EPSILON || Double.isInfinite(abs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double roundToNextSignificant = (double) Utils.roundToNextSignificant(abs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && roundToNextSignificant < ((double) this.mAxis.getGranularity())) {
            roundToNextSignificant = (double) this.mAxis.getGranularity();
        }
        double roundToNextSignificant2 = (double) Utils.roundToNextSignificant(Math.pow(10.0d, (double) ((int) Math.log10(roundToNextSignificant))));
        if (((int) (roundToNextSignificant / roundToNextSignificant2)) > 5) {
            roundToNextSignificant = Math.floor(roundToNextSignificant2 * 10.0d);
        }
        boolean isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            float f5 = ((float) abs) / ((float) (labelCount - 1));
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i = 0; i < labelCount; i++) {
                this.mAxis.mEntries[i] = f3;
                f3 += f5;
            }
        } else {
            int i2 = (roundToNextSignificant > Utils.DOUBLE_EPSILON ? 1 : (roundToNextSignificant == Utils.DOUBLE_EPSILON ? 0 : -1));
            if (i2 == 0) {
                d = Utils.DOUBLE_EPSILON;
            } else {
                d = Math.ceil(((double) f3) / roundToNextSignificant) * roundToNextSignificant;
            }
            if (isCenterAxisLabelsEnabled) {
                d -= roundToNextSignificant;
            }
            if (i2 == 0) {
                d2 = Utils.DOUBLE_EPSILON;
            } else {
                d2 = Utils.nextUp(Math.floor(((double) f4) / roundToNextSignificant) * roundToNextSignificant);
            }
            if (i2 != 0) {
                z = isCenterAxisLabelsEnabled;
                for (double d3 = d; d3 <= d2; d3 += roundToNextSignificant) {
                    z++;
                }
            } else {
                z = isCenterAxisLabelsEnabled;
            }
            int i3 = ((int) z) + 1;
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = i3;
            if (axisBase3.mEntries.length < i3) {
                axisBase3.mEntries = new float[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (d == Utils.DOUBLE_EPSILON) {
                    d = 0.0d;
                }
                this.mAxis.mEntries[i4] = (float) d;
                d += roundToNextSignificant;
            }
            labelCount = i3;
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (isCenterAxisLabelsEnabled) {
            AxisBase axisBase4 = this.mAxis;
            if (axisBase4.mCenteredEntries.length < labelCount) {
                axisBase4.mCenteredEntries = new float[labelCount];
            }
            float[] fArr = axisBase4.mEntries;
            float f6 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i5 = 0; i5 < labelCount; i5++) {
                AxisBase axisBase5 = this.mAxis;
                axisBase5.mCenteredEntries[i5] = axisBase5.mEntries[i5] + f6;
            }
        }
        AxisBase axisBase6 = this.mAxis;
        float[] fArr2 = axisBase6.mEntries;
        float f7 = fArr2[0];
        axisBase6.mAxisMinimum = f7;
        float f8 = fArr2[labelCount - 1];
        axisBase6.mAxisMaximum = f8;
        axisBase6.mAxisRange = Math.abs(f8 - f7);
    }

    public void renderAxisLabels(Canvas canvas) {
        int i;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            MPPointF centerOffsets = this.mChart.getCenterOffsets();
            MPPointF instance = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            float factor = this.mChart.getFactor();
            if (this.mYAxis.isDrawTopYLabelEntryEnabled()) {
                i = this.mYAxis.mEntryCount;
            } else {
                i = this.mYAxis.mEntryCount - 1;
            }
            for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled(); i2 < i; i2++) {
                YAxis yAxis = this.mYAxis;
                Utils.getPosition(centerOffsets, (yAxis.mEntries[i2] - yAxis.mAxisMinimum) * factor, this.mChart.getRotationAngle(), instance);
                canvas.drawText(this.mYAxis.getFormattedLabel(i2), instance.f10199x + 10.0f, instance.f10200y, this.mAxisLabelPaint);
            }
            MPPointF.recycleInstance(centerOffsets);
            MPPointF.recycleInstance(instance);
        }
    }

    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines != null) {
            float sliceAngle = this.mChart.getSliceAngle();
            float factor = this.mChart.getFactor();
            MPPointF centerOffsets = this.mChart.getCenterOffsets();
            MPPointF instance = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            for (int i = 0; i < limitLines.size(); i++) {
                LimitLine limitLine = limitLines.get(i);
                if (limitLine.isEnabled()) {
                    this.mLimitLinePaint.setColor(limitLine.getLineColor());
                    this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                    this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                    float limit = (limitLine.getLimit() - this.mChart.getYChartMin()) * factor;
                    Path path = this.mRenderLimitLinesPathBuffer;
                    path.reset();
                    for (int i2 = 0; i2 < ((IRadarDataSet) ((RadarData) this.mChart.getData()).getMaxEntryCountSet()).getEntryCount(); i2++) {
                        Utils.getPosition(centerOffsets, limit, (((float) i2) * sliceAngle) + this.mChart.getRotationAngle(), instance);
                        if (i2 == 0) {
                            path.moveTo(instance.f10199x, instance.f10200y);
                        } else {
                            path.lineTo(instance.f10199x, instance.f10200y);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, this.mLimitLinePaint);
                }
            }
            MPPointF.recycleInstance(centerOffsets);
            MPPointF.recycleInstance(instance);
        }
    }
}
