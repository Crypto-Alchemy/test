package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.HorizontalBarHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.HorizontalBarChartRenderer;
import com.github.mikephil.charting.renderer.XAxisRendererHorizontalBarChart;
import com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart;
import com.github.mikephil.charting.utils.HorizontalViewPortHandler;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.TransformerHorizontalBarChart;
import com.github.mikephil.charting.utils.Utils;

public class HorizontalBarChart extends BarChart {
    public float[] mGetPositionBuffer = new float[2];
    private RectF mOffsetsBuffer = new RectF();

    public HorizontalBarChart(Context context) {
        super(context);
    }

    public void calculateOffsets() {
        calculateLegendOffsets(this.mOffsetsBuffer);
        RectF rectF = this.mOffsetsBuffer;
        float f = rectF.left + Utils.FLOAT_EPSILON;
        float f2 = rectF.top + Utils.FLOAT_EPSILON;
        float f3 = rectF.right + Utils.FLOAT_EPSILON;
        float f4 = rectF.bottom + Utils.FLOAT_EPSILON;
        if (this.mAxisLeft.needsOffset()) {
            f2 += this.mAxisLeft.getRequiredHeightSpace(this.mAxisRendererLeft.getPaintAxisLabels());
        }
        if (this.mAxisRight.needsOffset()) {
            f4 += this.mAxisRight.getRequiredHeightSpace(this.mAxisRendererRight.getPaintAxisLabels());
        }
        XAxis xAxis = this.mXAxis;
        float f5 = (float) xAxis.mLabelRotatedWidth;
        if (xAxis.isEnabled()) {
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                f += f5;
            } else {
                if (this.mXAxis.getPosition() != XAxis.XAxisPosition.TOP) {
                    if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                        f += f5;
                    }
                }
                f3 += f5;
            }
        }
        float extraTopOffset = f2 + getExtraTopOffset();
        float extraRightOffset = f3 + getExtraRightOffset();
        float extraBottomOffset = f4 + getExtraBottomOffset();
        float extraLeftOffset = f + getExtraLeftOffset();
        float convertDpToPixel = Utils.convertDpToPixel(this.mMinOffset);
        this.mViewPortHandler.restrainViewPort(Math.max(convertDpToPixel, extraLeftOffset), Math.max(convertDpToPixel, extraTopOffset), Math.max(convertDpToPixel, extraRightOffset), Math.max(convertDpToPixel, extraBottomOffset));
        if (this.mLogEnabled) {
            StringBuilder sb = new StringBuilder();
            sb.append("offsetLeft: ");
            sb.append(extraLeftOffset);
            sb.append(", offsetTop: ");
            sb.append(extraTopOffset);
            sb.append(", offsetRight: ");
            sb.append(extraRightOffset);
            sb.append(", offsetBottom: ");
            sb.append(extraBottomOffset);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Content: ");
            sb2.append(this.mViewPortHandler.getContentRect().toString());
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    public void getBarBounds(BarEntry barEntry, RectF rectF) {
        float f;
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarData) this.mData).getDataSetForEntry(barEntry);
        if (iBarDataSet == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float y = barEntry.getY();
        float x = barEntry.getX();
        float barWidth = ((BarData) this.mData).getBarWidth() / 2.0f;
        float f2 = x - barWidth;
        float f3 = x + barWidth;
        if (y >= Utils.FLOAT_EPSILON) {
            f = y;
        } else {
            f = 0.0f;
        }
        if (y > Utils.FLOAT_EPSILON) {
            y = 0.0f;
        }
        rectF.set(f, f2, y, f3);
        getTransformer(iBarDataSet.getAxisDependency()).rectValueToPixel(rectF);
    }

    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.posForGetHighestVisibleX);
        return (float) Math.min((double) this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.f10198y);
    }

    public Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        return getHighlighter().getHighlight(f2, f);
    }

    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        return (float) Math.max((double) this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.f10198y);
    }

    public float[] getMarkerPosition(Highlight highlight) {
        return new float[]{highlight.getDrawY(), highlight.getDrawX()};
    }

    public MPPointF getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.mGetPositionBuffer;
        fArr[0] = entry.getY();
        fArr[1] = entry.getX();
        getTransformer(axisDependency).pointValuesToPixel(fArr);
        return MPPointF.getInstance(fArr[0], fArr[1]);
    }

    public void init() {
        this.mViewPortHandler = new HorizontalViewPortHandler();
        super.init();
        this.mLeftAxisTransformer = new TransformerHorizontalBarChart(this.mViewPortHandler);
        this.mRightAxisTransformer = new TransformerHorizontalBarChart(this.mViewPortHandler);
        this.mRenderer = new HorizontalBarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new HorizontalBarHighlighter(this));
        this.mAxisRendererLeft = new YAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new YAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new XAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, this);
    }

    public void prepareValuePxMatrix() {
        Transformer transformer = this.mRightAxisTransformer;
        YAxis yAxis = this.mAxisRight;
        float f = yAxis.mAxisMinimum;
        float f2 = yAxis.mAxisRange;
        XAxis xAxis = this.mXAxis;
        transformer.prepareMatrixValuePx(f, f2, xAxis.mAxisRange, xAxis.mAxisMinimum);
        Transformer transformer2 = this.mLeftAxisTransformer;
        YAxis yAxis2 = this.mAxisLeft;
        float f3 = yAxis2.mAxisMinimum;
        float f4 = yAxis2.mAxisRange;
        XAxis xAxis2 = this.mXAxis;
        transformer2.prepareMatrixValuePx(f3, f4, xAxis2.mAxisRange, xAxis2.mAxisMinimum);
    }

    public void setVisibleXRange(float f, float f2) {
        float f3 = this.mXAxis.mAxisRange;
        this.mViewPortHandler.setMinMaxScaleY(f3 / f, f3 / f2);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.mViewPortHandler.setMinimumScaleY(this.mXAxis.mAxisRange / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.mViewPortHandler.setMaximumScaleY(this.mXAxis.mAxisRange / f);
    }

    public void setVisibleYRange(float f, float f2, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinMaxScaleX(getAxisRange(axisDependency) / f, getAxisRange(axisDependency) / f2);
    }

    public void setVisibleYRangeMaximum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinimumScaleX(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRangeMinimum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMaximumScaleX(getAxisRange(axisDependency) / f);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
