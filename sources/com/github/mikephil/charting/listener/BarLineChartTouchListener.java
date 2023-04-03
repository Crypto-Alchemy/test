package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class BarLineChartTouchListener extends ChartTouchListener<BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>>> {
    private IDataSet mClosestDataSetToTouch;
    private MPPointF mDecelerationCurrentPoint = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    private long mDecelerationLastTime = 0;
    private MPPointF mDecelerationVelocity = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    private float mDragTriggerDist;
    private Matrix mMatrix = new Matrix();
    private float mMinScalePointerDistance;
    private float mSavedDist = 1.0f;
    private Matrix mSavedMatrix = new Matrix();
    private float mSavedXDist = 1.0f;
    private float mSavedYDist = 1.0f;
    private MPPointF mTouchPointCenter = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    private MPPointF mTouchStartPoint = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    private VelocityTracker mVelocityTracker;

    public BarLineChartTouchListener(BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> barLineChartBase, Matrix matrix, float f) {
        super(barLineChartBase);
        this.mMatrix = matrix;
        this.mDragTriggerDist = Utils.convertDpToPixel(f);
        this.mMinScalePointerDistance = Utils.convertDpToPixel(3.5f);
    }

    private static float getXDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float getYDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    private boolean inverted() {
        IDataSet iDataSet;
        if ((this.mClosestDataSetToTouch != null || !((BarLineChartBase) this.mChart).isAnyAxisInverted()) && ((iDataSet = this.mClosestDataSetToTouch) == null || !((BarLineChartBase) this.mChart).isInverted(iDataSet.getAxisDependency()))) {
            return false;
        }
        return true;
    }

    private static void midPoint(MPPointF mPPointF, MotionEvent motionEvent) {
        mPPointF.f10199x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
        mPPointF.f10200y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
    }

    private void performDrag(MotionEvent motionEvent, float f, float f2) {
        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
        this.mMatrix.set(this.mSavedMatrix);
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (inverted()) {
            if (this.mChart instanceof HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.mMatrix.postTranslate(f, f2);
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartTranslate(motionEvent, f, f2);
        }
    }

    private void performHighlightDrag(MotionEvent motionEvent) {
        Highlight highlightByTouchPoint = ((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        if (highlightByTouchPoint != null && !highlightByTouchPoint.equalTo(this.mLastHighlighted)) {
            this.mLastHighlighted = highlightByTouchPoint;
            ((BarLineChartBase) this.mChart).highlightValue(highlightByTouchPoint, true);
        }
    }

    private void performZoom(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        if (motionEvent.getPointerCount() >= 2) {
            OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
            float spacing = spacing(motionEvent);
            if (spacing > this.mMinScalePointerDistance) {
                MPPointF mPPointF = this.mTouchPointCenter;
                MPPointF trans = getTrans(mPPointF.f10199x, mPPointF.f10200y);
                ViewPortHandler viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
                int i = this.mTouchMode;
                boolean z5 = true;
                float f2 = 1.0f;
                if (i == 4) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f3 = spacing / this.mSavedDist;
                    if (f3 >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z3 = viewPortHandler.canZoomOutMoreX();
                    } else {
                        z3 = viewPortHandler.canZoomInMoreX();
                    }
                    if (z5) {
                        z4 = viewPortHandler.canZoomOutMoreY();
                    } else {
                        z4 = viewPortHandler.canZoomInMoreY();
                    }
                    if (((BarLineChartBase) this.mChart).isScaleXEnabled()) {
                        f = f3;
                    } else {
                        f = 1.0f;
                    }
                    if (((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                        f2 = f3;
                    }
                    if (z4 || z3) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(f, f2, trans.f10199x, trans.f10200y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, f, f2);
                        }
                    }
                } else if (i == 2 && ((BarLineChartBase) this.mChart).isScaleXEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.X_ZOOM;
                    float xDist = getXDist(motionEvent) / this.mSavedXDist;
                    if (xDist >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z2 = viewPortHandler.canZoomOutMoreX();
                    } else {
                        z2 = viewPortHandler.canZoomInMoreX();
                    }
                    if (z2) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(xDist, 1.0f, trans.f10199x, trans.f10200y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, xDist, 1.0f);
                        }
                    }
                } else if (this.mTouchMode == 3 && ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float yDist = getYDist(motionEvent) / this.mSavedYDist;
                    if (yDist >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z = viewPortHandler.canZoomOutMoreY();
                    } else {
                        z = viewPortHandler.canZoomInMoreY();
                    }
                    if (z) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(1.0f, yDist, trans.f10199x, trans.f10200y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, 1.0f, yDist);
                        }
                    }
                }
                MPPointF.recycleInstance(trans);
            }
        }
    }

    private void saveTouchStart(MotionEvent motionEvent) {
        this.mSavedMatrix.set(this.mMatrix);
        this.mTouchStartPoint.f10199x = motionEvent.getX();
        this.mTouchStartPoint.f10200y = motionEvent.getY();
        this.mClosestDataSetToTouch = ((BarLineChartBase) this.mChart).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    private static float spacing(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    public void computeScroll() {
        float f;
        MPPointF mPPointF = this.mDecelerationVelocity;
        float f2 = mPPointF.f10199x;
        float f3 = Utils.FLOAT_EPSILON;
        if (f2 != Utils.FLOAT_EPSILON || mPPointF.f10200y != Utils.FLOAT_EPSILON) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mDecelerationVelocity.f10199x *= ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
            this.mDecelerationVelocity.f10200y *= ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
            float f4 = ((float) (currentAnimationTimeMillis - this.mDecelerationLastTime)) / 1000.0f;
            MPPointF mPPointF2 = this.mDecelerationVelocity;
            float f5 = mPPointF2.f10199x * f4;
            float f6 = mPPointF2.f10200y * f4;
            MPPointF mPPointF3 = this.mDecelerationCurrentPoint;
            float f7 = mPPointF3.f10199x + f5;
            mPPointF3.f10199x = f7;
            float f8 = mPPointF3.f10200y + f6;
            mPPointF3.f10200y = f8;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f7, f8, 0);
            if (((BarLineChartBase) this.mChart).isDragXEnabled()) {
                f = this.mDecelerationCurrentPoint.f10199x - this.mTouchStartPoint.f10199x;
            } else {
                f = 0.0f;
            }
            if (((BarLineChartBase) this.mChart).isDragYEnabled()) {
                f3 = this.mDecelerationCurrentPoint.f10200y - this.mTouchStartPoint.f10200y;
            }
            performDrag(obtain, f, f3);
            obtain.recycle();
            this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, false);
            this.mDecelerationLastTime = currentAnimationTimeMillis;
            if (((double) Math.abs(this.mDecelerationVelocity.f10199x)) >= 0.01d || ((double) Math.abs(this.mDecelerationVelocity.f10200y)) >= 0.01d) {
                Utils.postInvalidateOnAnimation(this.mChart);
                return;
            }
            ((BarLineChartBase) this.mChart).calculateOffsets();
            ((BarLineChartBase) this.mChart).postInvalidate();
            stopDeceleration();
        }
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    public MPPointF getTrans(float f, float f2) {
        float f3;
        ViewPortHandler viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
        float offsetLeft = f - viewPortHandler.offsetLeft();
        if (inverted()) {
            f3 = -(f2 - viewPortHandler.offsetTop());
        } else {
            f3 = -((((float) ((BarLineChartBase) this.mChart).getMeasuredHeight()) - f2) - viewPortHandler.offsetBottom());
        }
        return MPPointF.getInstance(offsetLeft, f3);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        this.mLastGesture = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartDoubleTapped(motionEvent);
        }
        if (((BarLineChartBase) this.mChart).isDoubleTapToZoomEnabled() && ((BarLineScatterCandleBubbleData) ((BarLineChartBase) this.mChart).getData()).getEntryCount() > 0) {
            MPPointF trans = getTrans(motionEvent.getX(), motionEvent.getY());
            T t = this.mChart;
            BarLineChartBase barLineChartBase = (BarLineChartBase) t;
            float f2 = 1.4f;
            if (((BarLineChartBase) t).isScaleXEnabled()) {
                f = 1.4f;
            } else {
                f = 1.0f;
            }
            if (!((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                f2 = 1.0f;
            }
            barLineChartBase.zoom(f, f2, trans.f10199x, trans.f10200y);
            if (((BarLineChartBase) this.mChart).isLogEnabled()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Double-Tap, Zooming In, x: ");
                sb.append(trans.f10199x);
                sb.append(", y: ");
                sb.append(trans.f10200y);
            }
            MPPointF.recycleInstance(trans);
        }
        return super.onDoubleTap(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.mLastGesture = ChartTouchListener.ChartGesture.FLING;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartFling(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((BarLineChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        VelocityTracker velocityTracker;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        if (this.mTouchMode == 0) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.mChart).isDragEnabled() && !((BarLineChartBase) this.mChart).isScaleXEnabled() && !((BarLineChartBase) this.mChart).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            boolean z = false;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, (float) Utils.getMaximumFlingVelocity());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > ((float) Utils.getMinimumFlingVelocity()) || Math.abs(yVelocity) > ((float) Utils.getMinimumFlingVelocity())) && this.mTouchMode == 1 && ((BarLineChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                    this.mDecelerationCurrentPoint.f10199x = motionEvent.getX();
                    this.mDecelerationCurrentPoint.f10200y = motionEvent.getY();
                    MPPointF mPPointF = this.mDecelerationVelocity;
                    mPPointF.f10199x = xVelocity;
                    mPPointF.f10200y = yVelocity;
                    Utils.postInvalidateOnAnimation(this.mChart);
                }
                int i2 = this.mTouchMode;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    ((BarLineChartBase) this.mChart).calculateOffsets();
                    ((BarLineChartBase) this.mChart).postInvalidate();
                }
                this.mTouchMode = 0;
                ((BarLineChartBase) this.mChart).enableScroll();
                VelocityTracker velocityTracker3 = this.mVelocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.mVelocityTracker = null;
                }
                endAction(motionEvent);
            } else if (action == 2) {
                int i3 = this.mTouchMode;
                if (i3 == 1) {
                    ((BarLineChartBase) this.mChart).disableScroll();
                    boolean isDragXEnabled = ((BarLineChartBase) this.mChart).isDragXEnabled();
                    float f2 = Utils.FLOAT_EPSILON;
                    if (isDragXEnabled) {
                        f = motionEvent.getX() - this.mTouchStartPoint.f10199x;
                    } else {
                        f = 0.0f;
                    }
                    if (((BarLineChartBase) this.mChart).isDragYEnabled()) {
                        f2 = motionEvent.getY() - this.mTouchStartPoint.f10200y;
                    }
                    performDrag(motionEvent, f, f2);
                } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                    ((BarLineChartBase) this.mChart).disableScroll();
                    if (((BarLineChartBase) this.mChart).isScaleXEnabled() || ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                        performZoom(motionEvent);
                    }
                } else if (i3 == 0 && Math.abs(ChartTouchListener.distance(motionEvent.getX(), this.mTouchStartPoint.f10199x, motionEvent.getY(), this.mTouchStartPoint.f10200y)) > this.mDragTriggerDist && ((BarLineChartBase) this.mChart).isDragEnabled()) {
                    if (!((BarLineChartBase) this.mChart).isFullyZoomedOut() || !((BarLineChartBase) this.mChart).hasNoDragOffset()) {
                        z = true;
                    }
                    if (z) {
                        float abs = Math.abs(motionEvent.getX() - this.mTouchStartPoint.f10199x);
                        float abs2 = Math.abs(motionEvent.getY() - this.mTouchStartPoint.f10200y);
                        if ((((BarLineChartBase) this.mChart).isDragXEnabled() || abs2 >= abs) && (((BarLineChartBase) this.mChart).isDragYEnabled() || abs2 <= abs)) {
                            this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                            this.mTouchMode = 1;
                        }
                    } else if (((BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                        if (((BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                            performHighlightDrag(motionEvent);
                        }
                    }
                }
            } else if (action == 3) {
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action != 5) {
                if (action == 6) {
                    Utils.velocityTrackerPointerUpCleanUpIfNecessary(motionEvent, this.mVelocityTracker);
                    this.mTouchMode = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ((BarLineChartBase) this.mChart).disableScroll();
                saveTouchStart(motionEvent);
                this.mSavedXDist = getXDist(motionEvent);
                this.mSavedYDist = getYDist(motionEvent);
                float spacing = spacing(motionEvent);
                this.mSavedDist = spacing;
                if (spacing > 10.0f) {
                    if (((BarLineChartBase) this.mChart).isPinchZoomEnabled()) {
                        this.mTouchMode = 4;
                    } else if (((BarLineChartBase) this.mChart).isScaleXEnabled() != ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                        if (((BarLineChartBase) this.mChart).isScaleXEnabled()) {
                            i = 2;
                        }
                        this.mTouchMode = i;
                    } else {
                        if (this.mSavedXDist > this.mSavedYDist) {
                            i = 2;
                        }
                        this.mTouchMode = i;
                    }
                }
                midPoint(this.mTouchPointCenter, motionEvent);
            }
        } else {
            startAction(motionEvent);
            stopDeceleration();
            saveTouchStart(motionEvent);
        }
        this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, true);
        return true;
    }

    public void setDragTriggerDist(float f) {
        this.mDragTriggerDist = Utils.convertDpToPixel(f);
    }

    public void stopDeceleration() {
        MPPointF mPPointF = this.mDecelerationVelocity;
        mPPointF.f10199x = Utils.FLOAT_EPSILON;
        mPPointF.f10200y = Utils.FLOAT_EPSILON;
    }
}
