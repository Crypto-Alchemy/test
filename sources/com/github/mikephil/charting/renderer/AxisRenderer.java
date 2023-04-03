package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class AxisRenderer extends Renderer {
    public AxisBase mAxis;
    public Paint mAxisLabelPaint;
    public Paint mAxisLinePaint;
    public Paint mGridPaint;
    public Paint mLimitLinePaint;
    public Transformer mTrans;

    public AxisRenderer(ViewPortHandler viewPortHandler, Transformer transformer, AxisBase axisBase) {
        super(viewPortHandler);
        this.mTrans = transformer;
        this.mAxis = axisBase;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint = new Paint(1);
            Paint paint = new Paint();
            this.mGridPaint = paint;
            paint.setColor(-7829368);
            this.mGridPaint.setStrokeWidth(1.0f);
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setAlpha(90);
            Paint paint2 = new Paint();
            this.mAxisLinePaint = paint2;
            paint2.setColor(-16777216);
            this.mAxisLinePaint.setStrokeWidth(1.0f);
            this.mAxisLinePaint.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.mLimitLinePaint = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        if (viewPortHandler != null && viewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            if (!z) {
                f3 = (float) valuesByTouchPoint2.f10198y;
                d = valuesByTouchPoint.f10198y;
            } else {
                f3 = (float) valuesByTouchPoint.f10198y;
                d = valuesByTouchPoint2.f10198y;
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
    }

    public void computeAxisValues(float f, float f2) {
        double d;
        double d2;
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
        int isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            roundToNextSignificant = (double) (((float) abs) / ((float) (labelCount - 1)));
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i = 0; i < labelCount; i++) {
                this.mAxis.mEntries[i] = f3;
                f3 = (float) (((double) f3) + roundToNextSignificant);
            }
        } else {
            int i2 = (roundToNextSignificant > Utils.DOUBLE_EPSILON ? 1 : (roundToNextSignificant == Utils.DOUBLE_EPSILON ? 0 : -1));
            if (i2 == 0) {
                d = Utils.DOUBLE_EPSILON;
            } else {
                d = Math.ceil(((double) f3) / roundToNextSignificant) * roundToNextSignificant;
            }
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                d -= roundToNextSignificant;
            }
            if (i2 == 0) {
                d2 = Utils.DOUBLE_EPSILON;
            } else {
                d2 = Utils.nextUp(Math.floor(((double) f4) / roundToNextSignificant) * roundToNextSignificant);
            }
            if (i2 != 0) {
                for (double d3 = d; d3 <= d2; d3 += roundToNextSignificant) {
                    isCenterAxisLabelsEnabled++;
                }
            }
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = isCenterAxisLabelsEnabled;
            if (axisBase3.mEntries.length < isCenterAxisLabelsEnabled) {
                axisBase3.mEntries = new float[isCenterAxisLabelsEnabled];
            }
            for (int i3 = 0; i3 < isCenterAxisLabelsEnabled; i3++) {
                if (d == Utils.DOUBLE_EPSILON) {
                    d = 0.0d;
                }
                this.mAxis.mEntries[i3] = (float) d;
                d += roundToNextSignificant;
            }
            labelCount = isCenterAxisLabelsEnabled;
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            AxisBase axisBase4 = this.mAxis;
            if (axisBase4.mCenteredEntries.length < labelCount) {
                axisBase4.mCenteredEntries = new float[labelCount];
            }
            float f5 = ((float) roundToNextSignificant) / 2.0f;
            for (int i4 = 0; i4 < labelCount; i4++) {
                AxisBase axisBase5 = this.mAxis;
                axisBase5.mCenteredEntries[i4] = axisBase5.mEntries[i4] + f5;
            }
        }
    }

    public Paint getPaintAxisLabels() {
        return this.mAxisLabelPaint;
    }

    public Paint getPaintAxisLine() {
        return this.mAxisLinePaint;
    }

    public Paint getPaintGrid() {
        return this.mGridPaint;
    }

    public Transformer getTransformer() {
        return this.mTrans;
    }

    public abstract void renderAxisLabels(Canvas canvas);

    public abstract void renderAxisLine(Canvas canvas);

    public abstract void renderGridLines(Canvas canvas);

    public abstract void renderLimitLines(Canvas canvas);
}
