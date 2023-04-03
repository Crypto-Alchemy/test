package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer = new RectF();

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        boolean z;
        IBarDataSet iBarDataSet2 = iBarDataSet;
        int i2 = i;
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        int i3 = 0;
        boolean z2 = true;
        if (iBarDataSet.getBarBorderWidth() > Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) iBarDataSet.getEntryCount()) * phaseX)), iBarDataSet.getEntryCount());
            for (int i4 = 0; i4 < min; i4++) {
                float x = ((BarEntry) iBarDataSet2.getEntryForIndex(i4)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.top = x - barWidth;
                rectF.bottom = x + barWidth;
                transformer.rectValueToPixel(rectF);
                if (!this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    Canvas canvas2 = canvas;
                } else if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                    break;
                } else {
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        Canvas canvas3 = canvas;
        BarBuffer barBuffer = this.mBarBuffers[i2];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i2);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer.buffer);
        if (iBarDataSet.getColors().size() != 1) {
            z2 = false;
        }
        if (z2) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        while (i3 < barBuffer.size()) {
            int i5 = i3 + 3;
            if (this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i5])) {
                int i6 = i3 + 1;
                if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i6])) {
                    if (!z2) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i3 / 4));
                    }
                    float[] fArr = barBuffer.buffer;
                    int i7 = i3 + 2;
                    canvas.drawRect(fArr[i3], fArr[i6], fArr[i7], fArr[i5], this.mRenderPaint);
                    if (z) {
                        float[] fArr2 = barBuffer.buffer;
                        canvas.drawRect(fArr2[i3], fArr2[i6], fArr2[i7], fArr2[i5], this.mBarBorderPaint);
                    }
                }
                i3 += 4;
                Canvas canvas4 = canvas;
            } else {
                return;
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawValues(android.graphics.Canvas r41) {
        /*
            r40 = this;
            r6 = r40
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            boolean r0 = r6.isDrawingValuesAllowed(r0)
            if (r0 == 0) goto L_0x03cb
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            java.util.List r7 = r0.getDataSets()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            boolean r9 = r0.isDrawValueAboveBarEnabled()
            r11 = 0
        L_0x0021:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            int r0 = r0.getDataSetCount()
            if (r11 >= r0) goto L_0x03cb
            java.lang.Object r0 = r7.get(r11)
            r12 = r0
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r12 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r12
            boolean r0 = r6.shouldDrawValues(r12)
            if (r0 != 0) goto L_0x0040
            r20 = r7
            r23 = r11
            goto L_0x03c5
        L_0x0040:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.getAxisDependency()
            boolean r13 = r0.isInverted(r1)
            r6.applyValueTextStyle(r12)
            android.graphics.Paint r0 = r6.mValuePaint
            java.lang.String r1 = "10"
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r0, r1)
            float r0 = (float) r0
            r14 = 1073741824(0x40000000, float:2.0)
            float r15 = r0 / r14
            com.github.mikephil.charting.formatter.ValueFormatter r5 = r12.getValueFormatter()
            com.github.mikephil.charting.buffer.BarBuffer[] r0 = r6.mBarBuffers
            r4 = r0[r11]
            com.github.mikephil.charting.animation.ChartAnimator r0 = r6.mAnimator
            float r16 = r0.getPhaseY()
            com.github.mikephil.charting.utils.MPPointF r0 = r12.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r3 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0)
            float r0 = r3.f10199x
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.f10199x = r0
            float r0 = r3.f10200y
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.f10200y = r0
            boolean r0 = r12.isStacked()
            r17 = 0
            if (r0 != 0) goto L_0x0196
            r2 = 0
        L_0x0089:
            float r0 = (float) r2
            float[] r1 = r4.buffer
            int r1 = r1.length
            float r1 = (float) r1
            com.github.mikephil.charting.animation.ChartAnimator r10 = r6.mAnimator
            float r10 = r10.getPhaseX()
            float r1 = r1 * r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x018f
            float[] r0 = r4.buffer
            int r1 = r2 + 1
            r10 = r0[r1]
            int r16 = r2 + 3
            r0 = r0[r16]
            float r0 = r0 + r10
            float r16 = r0 / r14
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            boolean r0 = r0.isInBoundsTop(r10)
            if (r0 != 0) goto L_0x00b0
            goto L_0x018f
        L_0x00b0:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r10 = r4.buffer
            r10 = r10[r2]
            boolean r0 = r0.isInBoundsX(r10)
            if (r0 != 0) goto L_0x00c7
        L_0x00bc:
            r25 = r2
            r14 = r4
            r20 = r7
            r23 = r11
            r7 = r3
            r11 = r5
            goto L_0x0182
        L_0x00c7:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r10 = r4.buffer
            r1 = r10[r1]
            boolean r0 = r0.isInBoundsBottom(r1)
            if (r0 != 0) goto L_0x00d4
            goto L_0x00bc
        L_0x00d4:
            int r0 = r2 / 4
            com.github.mikephil.charting.data.Entry r0 = r12.getEntryForIndex(r0)
            r10 = r0
            com.github.mikephil.charting.data.BarEntry r10 = (com.github.mikephil.charting.data.BarEntry) r10
            float r18 = r10.getY()
            java.lang.String r1 = r5.getBarLabel(r10)
            android.graphics.Paint r0 = r6.mValuePaint
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r0, r1)
            float r0 = (float) r0
            if (r9 == 0) goto L_0x00f0
            r14 = r8
            goto L_0x00f3
        L_0x00f0:
            float r14 = r0 + r8
            float r14 = -r14
        L_0x00f3:
            r20 = r1
            if (r9 == 0) goto L_0x00fb
            float r1 = r0 + r8
            float r1 = -r1
            goto L_0x00fc
        L_0x00fb:
            r1 = r8
        L_0x00fc:
            if (r13 == 0) goto L_0x0102
            float r14 = -r14
            float r14 = r14 - r0
            float r1 = -r1
            float r1 = r1 - r0
        L_0x0102:
            r21 = r14
            r14 = r1
            boolean r0 = r12.isDrawValuesEnabled()
            if (r0 == 0) goto L_0x013e
            float[] r0 = r4.buffer
            int r1 = r2 + 2
            r0 = r0[r1]
            int r1 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x0118
            r1 = r21
            goto L_0x0119
        L_0x0118:
            r1 = r14
        L_0x0119:
            float r22 = r0 + r1
            float r23 = r16 + r15
            int r0 = r2 / 2
            int r24 = r12.getValueTextColor(r0)
            r0 = r40
            r1 = r41
            r25 = r2
            r2 = r20
            r20 = r7
            r7 = r3
            r3 = r22
            r22 = r14
            r14 = r4
            r4 = r23
            r23 = r11
            r11 = r5
            r5 = r24
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L_0x0149
        L_0x013e:
            r25 = r2
            r20 = r7
            r23 = r11
            r22 = r14
            r7 = r3
            r14 = r4
            r11 = r5
        L_0x0149:
            android.graphics.drawable.Drawable r0 = r10.getIcon()
            if (r0 == 0) goto L_0x0182
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x0182
            android.graphics.drawable.Drawable r27 = r10.getIcon()
            float[] r0 = r14.buffer
            int r2 = r25 + 2
            r0 = r0[r2]
            int r1 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r21 = r22
        L_0x0166:
            float r0 = r0 + r21
            float r1 = r7.f10199x
            float r0 = r0 + r1
            float r1 = r7.f10200y
            float r1 = r16 + r1
            int r0 = (int) r0
            int r1 = (int) r1
            int r30 = r27.getIntrinsicWidth()
            int r31 = r27.getIntrinsicHeight()
            r26 = r41
            r28 = r0
            r29 = r1
            com.github.mikephil.charting.utils.Utils.drawImage(r26, r27, r28, r29, r30, r31)
        L_0x0182:
            int r2 = r25 + 4
            r3 = r7
            r5 = r11
            r4 = r14
            r7 = r20
            r11 = r23
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x0089
        L_0x018f:
            r20 = r7
            r23 = r11
            r7 = r3
            goto L_0x03c2
        L_0x0196:
            r14 = r4
            r20 = r7
            r23 = r11
            r7 = r3
            r11 = r5
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r10 = r0.getTransformer(r1)
            r5 = 0
            r18 = 0
        L_0x01aa:
            float r0 = (float) r5
            int r1 = r12.getEntryCount()
            float r1 = (float) r1
            com.github.mikephil.charting.animation.ChartAnimator r2 = r6.mAnimator
            float r2 = r2.getPhaseX()
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c2
            com.github.mikephil.charting.data.Entry r0 = r12.getEntryForIndex(r5)
            r4 = r0
            com.github.mikephil.charting.data.BarEntry r4 = (com.github.mikephil.charting.data.BarEntry) r4
            int r21 = r12.getValueTextColor(r5)
            float[] r3 = r4.getYVals()
            if (r3 != 0) goto L_0x029a
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r1 = r14.buffer
            int r22 = r18 + 1
            r1 = r1[r22]
            boolean r0 = r0.isInBoundsTop(r1)
            if (r0 != 0) goto L_0x01dc
            goto L_0x03c2
        L_0x01dc:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r1 = r14.buffer
            r1 = r1[r18]
            boolean r0 = r0.isInBoundsX(r1)
            if (r0 != 0) goto L_0x01e9
            goto L_0x01aa
        L_0x01e9:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r1 = r14.buffer
            r1 = r1[r22]
            boolean r0 = r0.isInBoundsBottom(r1)
            if (r0 != 0) goto L_0x01f6
            goto L_0x01aa
        L_0x01f6:
            java.lang.String r2 = r11.getBarLabel(r4)
            android.graphics.Paint r0 = r6.mValuePaint
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r0, r2)
            float r0 = (float) r0
            if (r9 == 0) goto L_0x0205
            r1 = r8
            goto L_0x0208
        L_0x0205:
            float r1 = r0 + r8
            float r1 = -r1
        L_0x0208:
            r24 = r3
            if (r9 == 0) goto L_0x0210
            float r3 = r0 + r8
            float r3 = -r3
            goto L_0x0211
        L_0x0210:
            r3 = r8
        L_0x0211:
            if (r13 == 0) goto L_0x0217
            float r1 = -r1
            float r1 = r1 - r0
            float r3 = -r3
            float r3 = r3 - r0
        L_0x0217:
            r25 = r1
            r26 = r3
            boolean r0 = r12.isDrawValuesEnabled()
            if (r0 == 0) goto L_0x0250
            float[] r0 = r14.buffer
            int r1 = r18 + 2
            r0 = r0[r1]
            float r1 = r4.getY()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x0232
            r1 = r25
            goto L_0x0234
        L_0x0232:
            r1 = r26
        L_0x0234:
            float r3 = r0 + r1
            float[] r0 = r14.buffer
            r0 = r0[r22]
            float r27 = r0 + r15
            r0 = r40
            r1 = r41
            r28 = r15
            r15 = r24
            r24 = r4
            r4 = r27
            r27 = r5
            r5 = r21
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L_0x0258
        L_0x0250:
            r27 = r5
            r28 = r15
            r15 = r24
            r24 = r4
        L_0x0258:
            android.graphics.drawable.Drawable r0 = r24.getIcon()
            if (r0 == 0) goto L_0x03b0
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x03b0
            android.graphics.drawable.Drawable r30 = r24.getIcon()
            float[] r0 = r14.buffer
            int r1 = r18 + 2
            r0 = r0[r1]
            float r1 = r24.getY()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x0277
            goto L_0x0279
        L_0x0277:
            r25 = r26
        L_0x0279:
            float r0 = r0 + r25
            float[] r1 = r14.buffer
            r1 = r1[r22]
            float r2 = r7.f10199x
            float r0 = r0 + r2
            float r2 = r7.f10200y
            float r1 = r1 + r2
            int r0 = (int) r0
            int r1 = (int) r1
            int r33 = r30.getIntrinsicWidth()
            int r34 = r30.getIntrinsicHeight()
            r29 = r41
            r31 = r0
            r32 = r1
            com.github.mikephil.charting.utils.Utils.drawImage(r29, r30, r31, r32, r33, r34)
            goto L_0x03b0
        L_0x029a:
            r24 = r4
            r27 = r5
            r28 = r15
            r15 = r3
            int r0 = r15.length
            int r5 = r0 * 2
            float[] r4 = new float[r5]
            float r0 = r24.getNegativeSum()
            float r0 = -r0
            r22 = r0
            r25 = r17
            r0 = 0
            r1 = 0
        L_0x02b1:
            if (r0 >= r5) goto L_0x02de
            r2 = r15[r1]
            int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x02c8
            int r26 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r26 == 0) goto L_0x02c1
            int r26 = (r22 > r17 ? 1 : (r22 == r17 ? 0 : -1))
            if (r26 != 0) goto L_0x02c8
        L_0x02c1:
            r39 = r22
            r22 = r2
            r2 = r39
            goto L_0x02d3
        L_0x02c8:
            if (r3 < 0) goto L_0x02d1
            float r25 = r25 + r2
            r2 = r22
            r22 = r25
            goto L_0x02d3
        L_0x02d1:
            float r2 = r22 - r2
        L_0x02d3:
            float r22 = r22 * r16
            r4[r0] = r22
            int r0 = r0 + 2
            int r1 = r1 + 1
            r22 = r2
            goto L_0x02b1
        L_0x02de:
            r10.pointValuesToPixel(r4)
            r3 = 0
        L_0x02e2:
            if (r3 >= r5) goto L_0x03b0
            int r0 = r3 / 2
            r0 = r15[r0]
            r2 = r24
            java.lang.String r1 = r11.getBarStackedLabel(r0, r2)
            android.graphics.Paint r2 = r6.mValuePaint
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r2, r1)
            float r2 = (float) r2
            r26 = r1
            if (r9 == 0) goto L_0x02fb
            r1 = r8
            goto L_0x02fe
        L_0x02fb:
            float r1 = r2 + r8
            float r1 = -r1
        L_0x02fe:
            r29 = r5
            if (r9 == 0) goto L_0x0306
            float r5 = r2 + r8
            float r5 = -r5
            goto L_0x0307
        L_0x0306:
            r5 = r8
        L_0x0307:
            if (r13 == 0) goto L_0x030d
            float r1 = -r1
            float r1 = r1 - r2
            float r5 = -r5
            float r5 = r5 - r2
        L_0x030d:
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0319
            int r2 = (r22 > r17 ? 1 : (r22 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0319
            int r2 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x031d
        L_0x0319:
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x031f
        L_0x031d:
            r0 = 1
            goto L_0x0320
        L_0x031f:
            r0 = 0
        L_0x0320:
            r2 = r4[r3]
            if (r0 == 0) goto L_0x0325
            r1 = r5
        L_0x0325:
            float r5 = r2 + r1
            float[] r0 = r14.buffer
            int r1 = r18 + 1
            r1 = r0[r1]
            int r2 = r18 + 3
            r0 = r0[r2]
            float r1 = r1 + r0
            r19 = 1073741824(0x40000000, float:2.0)
            float r2 = r1 / r19
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            boolean r0 = r0.isInBoundsTop(r2)
            if (r0 != 0) goto L_0x0340
            goto L_0x03b2
        L_0x0340:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            boolean r0 = r0.isInBoundsX(r5)
            if (r0 != 0) goto L_0x034d
        L_0x0348:
            r26 = r3
            r32 = r4
            goto L_0x03a8
        L_0x034d:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            boolean r0 = r0.isInBoundsBottom(r2)
            if (r0 != 0) goto L_0x0356
            goto L_0x0348
        L_0x0356:
            boolean r0 = r12.isDrawValuesEnabled()
            if (r0 == 0) goto L_0x0375
            float r30 = r2 + r28
            r0 = r40
            r1 = r41
            r31 = r2
            r2 = r26
            r26 = r3
            r3 = r5
            r32 = r4
            r4 = r30
            r30 = r5
            r5 = r21
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L_0x037d
        L_0x0375:
            r31 = r2
            r26 = r3
            r32 = r4
            r30 = r5
        L_0x037d:
            android.graphics.drawable.Drawable r0 = r24.getIcon()
            if (r0 == 0) goto L_0x03a8
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x03a8
            android.graphics.drawable.Drawable r34 = r24.getIcon()
            float r0 = r7.f10199x
            float r5 = r30 + r0
            int r0 = (int) r5
            float r1 = r7.f10200y
            float r2 = r31 + r1
            int r1 = (int) r2
            int r37 = r34.getIntrinsicWidth()
            int r38 = r34.getIntrinsicHeight()
            r33 = r41
            r35 = r0
            r36 = r1
            com.github.mikephil.charting.utils.Utils.drawImage(r33, r34, r35, r36, r37, r38)
        L_0x03a8:
            int r3 = r26 + 2
            r5 = r29
            r4 = r32
            goto L_0x02e2
        L_0x03b0:
            r19 = 1073741824(0x40000000, float:2.0)
        L_0x03b2:
            if (r15 != 0) goto L_0x03b7
            int r18 = r18 + 4
            goto L_0x03bc
        L_0x03b7:
            int r0 = r15.length
            int r0 = r0 * 4
            int r18 = r18 + r0
        L_0x03bc:
            int r5 = r27 + 1
            r15 = r28
            goto L_0x01aa
        L_0x03c2:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r7)
        L_0x03c5:
            int r11 = r23 + 1
            r7 = r20
            goto L_0x0021
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.HorizontalBarChartRenderer.drawValues(android.graphics.Canvas):void");
    }

    public void initBuffers() {
        int i;
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i2 = 0; i2 < this.mBarBuffers.length; i2++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i2);
            BarBuffer[] barBufferArr = this.mBarBuffers;
            int entryCount = iBarDataSet.getEntryCount() * 4;
            if (iBarDataSet.isStacked()) {
                i = iBarDataSet.getStackSize();
            } else {
                i = 1;
            }
            barBufferArr[i2] = new HorizontalBarBuffer(entryCount * i, barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        if (((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY()) {
            return true;
        }
        return false;
    }

    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f2, f - f4, f3, f + f4);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }
}
