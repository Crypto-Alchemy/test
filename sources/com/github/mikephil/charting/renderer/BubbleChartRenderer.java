package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class BubbleChartRenderer extends BarLineScatterCandleBubbleRenderer {
    private float[] _hsvBuffer = new float[3];
    public BubbleDataProvider mChart;
    private float[] pointBuffer = new float[2];
    private float[] sizeBuffer = new float[4];

    public BubbleChartRenderer(BubbleDataProvider bubbleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = bubbleDataProvider;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(Utils.convertDpToPixel(1.5f));
    }

    public void drawData(Canvas canvas) {
        for (IBubbleDataSet iBubbleDataSet : this.mChart.getBubbleData().getDataSets()) {
            if (iBubbleDataSet.isVisible()) {
                drawDataSet(canvas, iBubbleDataSet);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IBubbleDataSet iBubbleDataSet) {
        if (iBubbleDataSet.getEntryCount() >= 1) {
            Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
            float phaseY = this.mAnimator.getPhaseY();
            this.mXBounds.set(this.mChart, iBubbleDataSet);
            float[] fArr = this.sizeBuffer;
            fArr[0] = 0.0f;
            fArr[2] = 1.0f;
            transformer.pointValuesToPixel(fArr);
            boolean isNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
            float[] fArr2 = this.sizeBuffer;
            float min = Math.min(Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), Math.abs(fArr2[2] - fArr2[0]));
            int i = this.mXBounds.min;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                if (i <= xBounds.range + xBounds.min) {
                    BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i);
                    this.pointBuffer[0] = bubbleEntry.getX();
                    this.pointBuffer[1] = bubbleEntry.getY() * phaseY;
                    transformer.pointValuesToPixel(this.pointBuffer);
                    float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), min, isNormalizeSizeEnabled) / 2.0f;
                    if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                        if (this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                            this.mRenderPaint.setColor(iBubbleDataSet.getColor((int) bubbleEntry.getX()));
                            float[] fArr3 = this.pointBuffer;
                            canvas.drawCircle(fArr3[0], fArr3[1], shapeSize, this.mRenderPaint);
                        } else {
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void drawExtras(Canvas canvas) {
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        BubbleData bubbleData = this.mChart.getBubbleData();
        float phaseY = this.mAnimator.getPhaseY();
        for (Highlight highlight : highlightArr) {
            IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) bubbleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBubbleDataSet != null && iBubbleDataSet.isHighlightEnabled()) {
                BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (bubbleEntry.getY() == highlight.getY() && isInBoundsX(bubbleEntry, iBubbleDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
                    float[] fArr = this.sizeBuffer;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.pointValuesToPixel(fArr);
                    boolean isNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
                    float[] fArr2 = this.sizeBuffer;
                    float min = Math.min(Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), Math.abs(fArr2[2] - fArr2[0]));
                    this.pointBuffer[0] = bubbleEntry.getX();
                    this.pointBuffer[1] = bubbleEntry.getY() * phaseY;
                    transformer.pointValuesToPixel(this.pointBuffer);
                    float[] fArr3 = this.pointBuffer;
                    highlight.setDraw(fArr3[0], fArr3[1]);
                    float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), min, isNormalizeSizeEnabled) / 2.0f;
                    if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                        if (this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                            int color = iBubbleDataSet.getColor((int) bubbleEntry.getX());
                            Color.RGBToHSV(Color.red(color), Color.green(color), Color.blue(color), this._hsvBuffer);
                            float[] fArr4 = this._hsvBuffer;
                            fArr4[2] = fArr4[2] * 0.5f;
                            this.mHighlightPaint.setColor(Color.HSVToColor(Color.alpha(color), this._hsvBuffer));
                            this.mHighlightPaint.setStrokeWidth(iBubbleDataSet.getHighlightCircleWidth());
                            float[] fArr5 = this.pointBuffer;
                            canvas.drawCircle(fArr5[0], fArr5[1], shapeSize, this.mHighlightPaint);
                        } else {
                            return;
                        }
                    }
                }
            }
            Canvas canvas2 = canvas;
        }
    }

    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    public void drawValues(Canvas canvas) {
        float f;
        int i;
        float f2;
        BubbleEntry bubbleEntry;
        float f3;
        BubbleData bubbleData = this.mChart.getBubbleData();
        if (bubbleData != null && isDrawingValuesAllowed(this.mChart)) {
            List dataSets = bubbleData.getDataSets();
            float calcTextHeight = (float) Utils.calcTextHeight(this.mValuePaint, "1");
            for (int i2 = 0; i2 < dataSets.size(); i2++) {
                IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) dataSets.get(i2);
                if (shouldDrawValues(iBubbleDataSet) && iBubbleDataSet.getEntryCount() >= 1) {
                    applyValueTextStyle(iBubbleDataSet);
                    float max = Math.max(Utils.FLOAT_EPSILON, Math.min(1.0f, this.mAnimator.getPhaseX()));
                    float phaseY = this.mAnimator.getPhaseY();
                    this.mXBounds.set(this.mChart, iBubbleDataSet);
                    Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] generateTransformedValuesBubble = transformer.generateTransformedValuesBubble(iBubbleDataSet, phaseY, xBounds.min, xBounds.max);
                    if (max == 1.0f) {
                        f = phaseY;
                    } else {
                        f = max;
                    }
                    ValueFormatter valueFormatter = iBubbleDataSet.getValueFormatter();
                    MPPointF instance = MPPointF.getInstance(iBubbleDataSet.getIconsOffset());
                    instance.f10199x = Utils.convertDpToPixel(instance.f10199x);
                    instance.f10200y = Utils.convertDpToPixel(instance.f10200y);
                    for (int i3 = 0; i3 < generateTransformedValuesBubble.length; i3 = i + 2) {
                        int i4 = i3 / 2;
                        int valueTextColor = iBubbleDataSet.getValueTextColor(this.mXBounds.min + i4);
                        int argb = Color.argb(Math.round(255.0f * f), Color.red(valueTextColor), Color.green(valueTextColor), Color.blue(valueTextColor));
                        float f4 = generateTransformedValuesBubble[i3];
                        float f5 = generateTransformedValuesBubble[i3 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f4)) {
                            break;
                        }
                        if (!this.mViewPortHandler.isInBoundsLeft(f4) || !this.mViewPortHandler.isInBoundsY(f5)) {
                            i = i3;
                        } else {
                            BubbleEntry bubbleEntry2 = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i4 + this.mXBounds.min);
                            if (iBubbleDataSet.isDrawValuesEnabled()) {
                                float f6 = f5 + (0.5f * calcTextHeight);
                                bubbleEntry = bubbleEntry2;
                                f3 = f5;
                                float f7 = f4;
                                f2 = f4;
                                float f8 = f6;
                                i = i3;
                                drawValue(canvas, valueFormatter.getBubbleLabel(bubbleEntry2), f7, f8, argb);
                            } else {
                                bubbleEntry = bubbleEntry2;
                                f3 = f5;
                                f2 = f4;
                                i = i3;
                            }
                            if (bubbleEntry.getIcon() != null && iBubbleDataSet.isDrawIconsEnabled()) {
                                Drawable icon = bubbleEntry.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f2 + instance.f10199x), (int) (f3 + instance.f10200y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        }
                    }
                    MPPointF.recycleInstance(instance);
                }
            }
        }
    }

    public float getShapeSize(float f, float f2, float f3, boolean z) {
        if (z) {
            if (f2 == Utils.FLOAT_EPSILON) {
                f = 1.0f;
            } else {
                f = (float) Math.sqrt((double) (f / f2));
            }
        }
        return f3 * f;
    }

    public void initBuffers() {
    }
}
