package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public class LineChartRenderer extends LineRadarRenderer {
    public Path cubicFillPath = new Path();
    public Path cubicPath = new Path();
    public Canvas mBitmapCanvas;
    public Bitmap.Config mBitmapConfig = Bitmap.Config.ARGB_8888;
    public LineDataProvider mChart;
    public Paint mCirclePaintInner;
    private float[] mCirclesBuffer = new float[2];
    public WeakReference<Bitmap> mDrawBitmap;
    public Path mGenerateFilledPathBuffer = new Path();
    private HashMap<IDataSet, DataSetImageCache> mImageCaches = new HashMap<>();
    private float[] mLineBuffer = new float[4];

    /* renamed from: com.github.mikephil.charting.renderer.LineChartRenderer$1 */
    public static /* synthetic */ class C20991 {
        public static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.github.mikephil.charting.data.LineDataSet$Mode[] r0 = com.github.mikephil.charting.data.LineDataSet.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode = r0
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.LineChartRenderer.C20991.<clinit>():void");
        }
    }

    public LineChartRenderer(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = lineDataProvider;
        Paint paint = new Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

    private void generateFilledPath(ILineDataSet iLineDataSet, int i, int i2, Path path) {
        boolean z;
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        float phaseY = this.mAnimator.getPhaseY();
        if (iLineDataSet.getMode() == LineDataSet.Mode.STEPPED) {
            z = true;
        } else {
            z = false;
        }
        path.reset();
        Entry entryForIndex = iLineDataSet.getEntryForIndex(i);
        path.moveTo(entryForIndex.getX(), fillLinePosition);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        Entry entry = null;
        int i3 = i + 1;
        while (i3 <= i2) {
            entry = iLineDataSet.getEntryForIndex(i3);
            if (z) {
                path.lineTo(entry.getX(), entryForIndex.getY() * phaseY);
            }
            path.lineTo(entry.getX(), entry.getY() * phaseY);
            i3++;
            entryForIndex = entry;
        }
        if (entry != null) {
            path.lineTo(entry.getX(), fillLinePosition);
        }
        path.close();
    }

    public void drawCircles(Canvas canvas) {
        boolean z;
        boolean z2;
        DataSetImageCache dataSetImageCache;
        Bitmap bitmap;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.mCirclesBuffer;
        boolean z3 = false;
        float f = Utils.FLOAT_EPSILON;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List dataSets = this.mChart.getLineData().getDataSets();
        int i = 0;
        while (i < dataSets.size()) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                if (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius >= circleRadius || circleHoleRadius <= f) {
                    z = z3;
                } else {
                    z = true;
                }
                if (!z || iLineDataSet.getCircleHoleColor() != 1122867) {
                    z2 = z3;
                } else {
                    z2 = true;
                }
                if (this.mImageCaches.containsKey(iLineDataSet)) {
                    dataSetImageCache = this.mImageCaches.get(iLineDataSet);
                } else {
                    dataSetImageCache = new DataSetImageCache(this, (C20991) null);
                    this.mImageCaches.put(iLineDataSet, dataSetImageCache);
                }
                if (dataSetImageCache.init(iLineDataSet)) {
                    dataSetImageCache.fill(iLineDataSet, z, z2);
                }
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                int i2 = xBounds.range;
                int i3 = xBounds.min;
                int i4 = i2 + i3;
                char c = z3;
                while (i3 <= i4) {
                    Entry entryForIndex = iLineDataSet.getEntryForIndex(i3);
                    if (entryForIndex == null) {
                        break;
                    }
                    this.mCirclesBuffer[c] = entryForIndex.getX();
                    this.mCirclesBuffer[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.mCirclesBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mCirclesBuffer[c])) {
                        break;
                    }
                    if (!this.mViewPortHandler.isInBoundsLeft(this.mCirclesBuffer[c]) || !this.mViewPortHandler.isInBoundsY(this.mCirclesBuffer[1]) || (bitmap = dataSetImageCache.getBitmap(i3)) == null) {
                        Canvas canvas2 = canvas;
                    } else {
                        float[] fArr2 = this.mCirclesBuffer;
                        canvas.drawBitmap(bitmap, fArr2[c] - circleRadius, fArr2[1] - circleRadius, (Paint) null);
                    }
                    i3++;
                    c = 0;
                }
            }
            Canvas canvas3 = canvas;
            i++;
            z3 = false;
            f = Utils.FLOAT_EPSILON;
        }
    }

    public void drawCubicBezier(ILineDataSet iLineDataSet) {
        ILineDataSet iLineDataSet2 = iLineDataSet;
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet2);
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        this.cubicPath.reset();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        if (xBounds.range >= 1) {
            int i = xBounds.min + 1;
            Entry entryForIndex = iLineDataSet2.getEntryForIndex(Math.max(i - 2, 0));
            Entry entryForIndex2 = iLineDataSet2.getEntryForIndex(Math.max(i - 1, 0));
            int i2 = -1;
            if (entryForIndex2 != null) {
                this.cubicPath.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                int i3 = this.mXBounds.min + 1;
                Entry entry = entryForIndex2;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    if (i3 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    if (i2 != i3) {
                        entryForIndex2 = iLineDataSet2.getEntryForIndex(i3);
                    }
                    int i4 = i3 + 1;
                    if (i4 < iLineDataSet.getEntryCount()) {
                        i3 = i4;
                    }
                    Entry entryForIndex3 = iLineDataSet2.getEntryForIndex(i3);
                    this.cubicPath.cubicTo(entry.getX() + ((entryForIndex2.getX() - entryForIndex.getX()) * cubicIntensity), (entry.getY() + ((entryForIndex2.getY() - entryForIndex.getY()) * cubicIntensity)) * phaseY, entryForIndex2.getX() - ((entryForIndex3.getX() - entry.getX()) * cubicIntensity), (entryForIndex2.getY() - ((entryForIndex3.getY() - entry.getY()) * cubicIntensity)) * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                    entryForIndex = entry;
                    entry = entryForIndex2;
                    entryForIndex2 = entryForIndex3;
                    int i5 = i3;
                    i3 = i4;
                    i2 = i5;
                }
            } else {
                return;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect((PathEffect) null);
    }

    public void drawCubicFill(Canvas canvas, ILineDataSet iLineDataSet, Path path, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min + xBounds.range).getX(), fillLinePosition);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min).getX(), fillLinePosition);
        path.close();
        transformer.pathValueToPixel(path);
        Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    public void drawData(Canvas canvas) {
        Bitmap bitmap;
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null) {
            bitmap = null;
        } else {
            bitmap = weakReference.get();
        }
        if (!(bitmap != null && bitmap.getWidth() == chartWidth && bitmap.getHeight() == chartHeight)) {
            if (chartWidth > 0 && chartHeight > 0) {
                bitmap = Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig);
                this.mDrawBitmap = new WeakReference<>(bitmap);
                this.mBitmapCanvas = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (ILineDataSet iLineDataSet : this.mChart.getLineData().getDataSets()) {
            if (iLineDataSet.isVisible()) {
                drawDataSet(canvas, iLineDataSet);
            }
        }
        canvas.drawBitmap(bitmap, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.mRenderPaint);
    }

    public void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        if (iLineDataSet.getEntryCount() >= 1) {
            this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
            this.mRenderPaint.setPathEffect(iLineDataSet.getDashPathEffect());
            int i = C20991.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[iLineDataSet.getMode().ordinal()];
            if (i == 3) {
                drawCubicBezier(iLineDataSet);
            } else if (i != 4) {
                drawLinear(canvas, iLineDataSet);
            } else {
                drawHorizontalBezier(iLineDataSet);
            }
            this.mRenderPaint.setPathEffect((PathEffect) null);
        }
    }

    public void drawExtras(Canvas canvas) {
        drawCircles(canvas);
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        LineData lineData = this.mChart.getLineData();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                Entry entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.f10197x, (float) pixelForValues.f10198y);
                    drawHighlightLines(canvas, (float) pixelForValues.f10197x, (float) pixelForValues.f10198y, iLineDataSet);
                }
            }
        }
    }

    public void drawHorizontalBezier(ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        this.cubicPath.reset();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        if (xBounds.range >= 1) {
            Entry entryForIndex = iLineDataSet.getEntryForIndex(xBounds.min);
            this.cubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i = this.mXBounds.min + 1;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                if (i > xBounds2.range + xBounds2.min) {
                    break;
                }
                Entry entryForIndex2 = iLineDataSet.getEntryForIndex(i);
                float x = entryForIndex.getX() + ((entryForIndex2.getX() - entryForIndex.getX()) / 2.0f);
                this.cubicPath.cubicTo(x, entryForIndex.getY() * phaseY, x, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i++;
                entryForIndex = entryForIndex2;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect((PathEffect) null);
    }

    public void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        boolean z;
        int i;
        Canvas canvas2;
        int i2;
        ILineDataSet iLineDataSet2 = iLineDataSet;
        int entryCount = iLineDataSet.getEntryCount();
        if (iLineDataSet.getMode() == LineDataSet.Mode.STEPPED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 4;
        } else {
            i = 2;
        }
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        if (iLineDataSet.isDashedLineEnabled()) {
            canvas2 = this.mBitmapCanvas;
        } else {
            canvas2 = canvas;
        }
        this.mXBounds.set(this.mChart, iLineDataSet2);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet2, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i3 = i * 2;
            if (this.mLineBuffer.length <= i3) {
                this.mLineBuffer = new float[(i * 4)];
            }
            int i4 = this.mXBounds.min;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                if (i4 > xBounds.range + xBounds.min) {
                    break;
                }
                Entry entryForIndex = iLineDataSet2.getEntryForIndex(i4);
                if (entryForIndex != null) {
                    this.mLineBuffer[0] = entryForIndex.getX();
                    this.mLineBuffer[1] = entryForIndex.getY() * phaseY;
                    if (i4 < this.mXBounds.max) {
                        Entry entryForIndex2 = iLineDataSet2.getEntryForIndex(i4 + 1);
                        if (entryForIndex2 == null) {
                            break;
                        } else if (z) {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            float[] fArr = this.mLineBuffer;
                            float f = fArr[1];
                            fArr[3] = f;
                            fArr[4] = fArr[2];
                            fArr[5] = f;
                            fArr[6] = entryForIndex2.getX();
                            this.mLineBuffer[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            this.mLineBuffer[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.mLineBuffer;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mLineBuffer[0])) {
                        break;
                    } else if (this.mViewPortHandler.isInBoundsLeft(this.mLineBuffer[2]) && (this.mViewPortHandler.isInBoundsTop(this.mLineBuffer[1]) || this.mViewPortHandler.isInBoundsBottom(this.mLineBuffer[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet2.getColor(i4));
                        canvas2.drawLines(this.mLineBuffer, 0, i3, this.mRenderPaint);
                    }
                }
                i4++;
            }
        } else {
            int i5 = entryCount * i;
            if (this.mLineBuffer.length < Math.max(i5, i) * 2) {
                this.mLineBuffer = new float[(Math.max(i5, i) * 4)];
            }
            if (iLineDataSet2.getEntryForIndex(this.mXBounds.min) != null) {
                int i6 = this.mXBounds.min;
                int i7 = 0;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    if (i6 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    if (i6 == 0) {
                        i2 = 0;
                    } else {
                        i2 = i6 - 1;
                    }
                    Entry entryForIndex3 = iLineDataSet2.getEntryForIndex(i2);
                    Entry entryForIndex4 = iLineDataSet2.getEntryForIndex(i6);
                    if (!(entryForIndex3 == null || entryForIndex4 == null)) {
                        int i8 = i7 + 1;
                        this.mLineBuffer[i7] = entryForIndex3.getX();
                        int i9 = i8 + 1;
                        this.mLineBuffer[i8] = entryForIndex3.getY() * phaseY;
                        if (z) {
                            int i10 = i9 + 1;
                            this.mLineBuffer[i9] = entryForIndex4.getX();
                            int i11 = i10 + 1;
                            this.mLineBuffer[i10] = entryForIndex3.getY() * phaseY;
                            int i12 = i11 + 1;
                            this.mLineBuffer[i11] = entryForIndex4.getX();
                            i9 = i12 + 1;
                            this.mLineBuffer[i12] = entryForIndex3.getY() * phaseY;
                        }
                        int i13 = i9 + 1;
                        this.mLineBuffer[i9] = entryForIndex4.getX();
                        this.mLineBuffer[i13] = entryForIndex4.getY() * phaseY;
                        i7 = i13 + 1;
                    }
                    i6++;
                }
                if (i7 > 0) {
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    canvas2.drawLines(this.mLineBuffer, 0, Math.max((this.mXBounds.range + 1) * i, i) * 2, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect((PathEffect) null);
    }

    public void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i;
        int i2;
        Path path = this.mGenerateFilledPathBuffer;
        int i3 = xBounds.min;
        int i4 = xBounds.range + i3;
        int i5 = 0;
        do {
            i = (i5 * 128) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                generateFilledPath(iLineDataSet, i, i2, path);
                transformer.pathValueToPixel(path);
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i5++;
        } while (i <= i2);
    }

    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    public void drawValues(Canvas canvas) {
        int i;
        ILineDataSet iLineDataSet;
        Entry entry;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getLineData().getDataSets();
            for (int i2 = 0; i2 < dataSets.size(); i2++) {
                ILineDataSet iLineDataSet2 = (ILineDataSet) dataSets.get(i2);
                if (shouldDrawValues(iLineDataSet2) && iLineDataSet2.getEntryCount() >= 1) {
                    applyValueTextStyle(iLineDataSet2);
                    Transformer transformer = this.mChart.getTransformer(iLineDataSet2.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet2.getCircleRadius() * 1.75f);
                    if (!iLineDataSet2.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int i3 = circleRadius;
                    this.mXBounds.set(this.mChart, iLineDataSet2);
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] generateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet2, phaseX, phaseY, xBounds.min, xBounds.max);
                    ValueFormatter valueFormatter = iLineDataSet2.getValueFormatter();
                    MPPointF instance = MPPointF.getInstance(iLineDataSet2.getIconsOffset());
                    instance.f10199x = Utils.convertDpToPixel(instance.f10199x);
                    instance.f10200y = Utils.convertDpToPixel(instance.f10200y);
                    int i4 = 0;
                    while (i4 < generateTransformedValuesLine.length) {
                        float f = generateTransformedValuesLine[i4];
                        float f2 = generateTransformedValuesLine[i4 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f)) {
                            break;
                        }
                        if (!this.mViewPortHandler.isInBoundsLeft(f) || !this.mViewPortHandler.isInBoundsY(f2)) {
                            i = i3;
                            iLineDataSet = iLineDataSet2;
                        } else {
                            int i5 = i4 / 2;
                            Entry entryForIndex = iLineDataSet2.getEntryForIndex(this.mXBounds.min + i5);
                            if (iLineDataSet2.isDrawValuesEnabled()) {
                                entry = entryForIndex;
                                i = i3;
                                iLineDataSet = iLineDataSet2;
                                drawValue(canvas, valueFormatter.getPointLabel(entryForIndex), f, f2 - ((float) i3), iLineDataSet2.getValueTextColor(i5));
                            } else {
                                entry = entryForIndex;
                                i = i3;
                                iLineDataSet = iLineDataSet2;
                            }
                            if (entry.getIcon() != null && iLineDataSet.isDrawIconsEnabled()) {
                                Drawable icon = entry.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f + instance.f10199x), (int) (f2 + instance.f10200y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        }
                        i4 += 2;
                        iLineDataSet2 = iLineDataSet;
                        i3 = i;
                    }
                    MPPointF.recycleInstance(instance);
                }
            }
        }
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    public void initBuffers() {
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap((Bitmap) null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }

    public class DataSetImageCache {
        private Bitmap[] circleBitmaps;
        private Path mCirclePathBuffer;

        private DataSetImageCache() {
            this.mCirclePathBuffer = new Path();
        }

        public void fill(ILineDataSet iLineDataSet, boolean z, boolean z2) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i = 0; i < circleColorCount; i++) {
                int i2 = (int) (((double) circleRadius) * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                this.circleBitmaps[i] = createBitmap;
                LineChartRenderer.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i));
                if (z2) {
                    this.mCirclePathBuffer.reset();
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.mCirclePathBuffer, LineChartRenderer.this.mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, LineChartRenderer.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, LineChartRenderer.this.mCirclePaintInner);
                    }
                }
            }
        }

        public Bitmap getBitmap(int i) {
            Bitmap[] bitmapArr = this.circleBitmaps;
            return bitmapArr[i % bitmapArr.length];
        }

        public boolean init(ILineDataSet iLineDataSet) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            Bitmap[] bitmapArr = this.circleBitmaps;
            if (bitmapArr == null) {
                this.circleBitmaps = new Bitmap[circleColorCount];
                return true;
            } else if (bitmapArr.length == circleColorCount) {
                return false;
            } else {
                this.circleBitmaps = new Bitmap[circleColorCount];
                return true;
            }
        }

        public /* synthetic */ DataSetImageCache(LineChartRenderer lineChartRenderer, C20991 r2) {
            this();
        }
    }
}
