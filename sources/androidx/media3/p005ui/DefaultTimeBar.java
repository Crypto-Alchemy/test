package androidx.media3.p005ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.p005ui.C1103b;
import com.github.mikephil.charting.utils.Utils;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.media3.ui.DefaultTimeBar */
public class DefaultTimeBar extends View implements C1103b {

    /* renamed from: A */
    public final Paint f5690A;

    /* renamed from: A1 */
    public long f5691A1;

    /* renamed from: B */
    public final Drawable f5692B;

    /* renamed from: B1 */
    public long f5693B1;

    /* renamed from: C */
    public final int f5694C;

    /* renamed from: C1 */
    public int f5695C1;

    /* renamed from: D1 */
    public long[] f5696D1;

    /* renamed from: E1 */
    public boolean[] f5697E1;

    /* renamed from: H */
    public final int f5698H;

    /* renamed from: I */
    public final int f5699I;

    /* renamed from: L */
    public final int f5700L;

    /* renamed from: M */
    public final int f5701M;

    /* renamed from: P */
    public final int f5702P;

    /* renamed from: Q */
    public final int f5703Q;

    /* renamed from: U */
    public final int f5704U;

    /* renamed from: a */
    public final Rect f5705a;

    /* renamed from: b1 */
    public final Runnable f5706b1;

    /* renamed from: d */
    public final Rect f5707d;

    /* renamed from: e */
    public final Rect f5708e;

    /* renamed from: e0 */
    public final int f5709e0;

    /* renamed from: e1 */
    public final CopyOnWriteArraySet<C1103b.C1104a> f5710e1;

    /* renamed from: g */
    public final Rect f5711g;

    /* renamed from: k */
    public final Paint f5712k;

    /* renamed from: k0 */
    public final StringBuilder f5713k0;

    /* renamed from: o1 */
    public final Point f5714o1;

    /* renamed from: p1 */
    public final float f5715p1;

    /* renamed from: q1 */
    public int f5716q1;

    /* renamed from: r */
    public final Paint f5717r;

    /* renamed from: r1 */
    public long f5718r1;

    /* renamed from: s */
    public final Paint f5719s;

    /* renamed from: s1 */
    public int f5720s1;

    /* renamed from: t1 */
    public Rect f5721t1;

    /* renamed from: u1 */
    public ValueAnimator f5722u1;

    /* renamed from: v0 */
    public final Formatter f5723v0;

    /* renamed from: v1 */
    public float f5724v1;

    /* renamed from: w1 */
    public boolean f5725w1;

    /* renamed from: x */
    public final Paint f5726x;

    /* renamed from: x1 */
    public boolean f5727x1;

    /* renamed from: y */
    public final Paint f5728y;

    /* renamed from: y1 */
    public long f5729y1;

    /* renamed from: z1 */
    public long f5730z1;

    public DefaultTimeBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public static int m7736d(float f, int i) {
        return (int) ((((float) i) * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f5718r1;
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return j;
        }
        long j2 = this.f5730z1;
        if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return 0;
        }
        return j2 / ((long) this.f5716q1);
    }

    private String getProgressText() {
        return w67.m29349d0(this.f5713k0, this.f5723v0, this.f5691A1);
    }

    private long getScrubberPosition() {
        if (this.f5707d.width() <= 0 || this.f5730z1 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return 0;
        }
        return (((long) this.f5711g.width()) * this.f5730z1) / ((long) this.f5707d.width());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m7737j() {
        mo8142v(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m7738k(ValueAnimator valueAnimator) {
        this.f5724v1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f5705a);
    }

    /* renamed from: m */
    public static int m7739m(float f, int i) {
        return (int) (((float) i) / f);
    }

    /* renamed from: q */
    public static boolean m7740q(Drawable drawable, int i) {
        if (w67.f19021a < 23 || !drawable.setLayoutDirection(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo8102a(C1103b.C1104a aVar) {
        C2725kr.m20985e(aVar);
        this.f5710e1.add(aVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        mo8144x();
    }

    /* renamed from: e */
    public final void mo8104e(Canvas canvas) {
        int i;
        if (this.f5730z1 > 0) {
            Rect rect = this.f5711g;
            int q = w67.m29374q(rect.right, rect.left, this.f5707d.right);
            int centerY = this.f5711g.centerY();
            Drawable drawable = this.f5692B;
            if (drawable == null) {
                if (this.f5727x1 || isFocused()) {
                    i = this.f5703Q;
                } else if (isEnabled()) {
                    i = this.f5701M;
                } else {
                    i = this.f5702P;
                }
                canvas.drawCircle((float) q, (float) centerY, (float) ((int) ((((float) i) * this.f5724v1) / 2.0f)), this.f5690A);
                return;
            }
            int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f5724v1)) / 2;
            int intrinsicHeight = ((int) (((float) this.f5692B.getIntrinsicHeight()) * this.f5724v1)) / 2;
            this.f5692B.setBounds(q - intrinsicWidth, centerY - intrinsicHeight, q + intrinsicWidth, centerY + intrinsicHeight);
            this.f5692B.draw(canvas);
        }
    }

    /* renamed from: f */
    public final void mo8105f(Canvas canvas) {
        Paint paint;
        int height = this.f5707d.height();
        int centerY = this.f5707d.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f5730z1 <= 0) {
            Rect rect = this.f5707d;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i, this.f5719s);
            return;
        }
        Rect rect2 = this.f5708e;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f5707d.left, i3), this.f5711g.right);
        int i4 = this.f5707d.right;
        if (max < i4) {
            canvas.drawRect((float) max, (float) centerY, (float) i4, (float) i, this.f5719s);
        }
        int max2 = Math.max(i2, this.f5711g.right);
        if (i3 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i3, (float) i, this.f5717r);
        }
        if (this.f5711g.width() > 0) {
            Rect rect3 = this.f5711g;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i, this.f5712k);
        }
        if (this.f5695C1 != 0) {
            long[] jArr = (long[]) C2725kr.m20985e(this.f5696D1);
            boolean[] zArr = (boolean[]) C2725kr.m20985e(this.f5697E1);
            int i5 = this.f5700L / 2;
            for (int i6 = 0; i6 < this.f5695C1; i6++) {
                long r = w67.m29376r(jArr[i6], 0, this.f5730z1);
                Rect rect4 = this.f5707d;
                int min = rect4.left + Math.min(rect4.width() - this.f5700L, Math.max(0, ((int) ((((long) this.f5707d.width()) * r) / this.f5730z1)) - i5));
                if (zArr[i6]) {
                    paint = this.f5728y;
                } else {
                    paint = this.f5726x;
                }
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f5700L), (float) i, paint);
            }
        }
    }

    /* renamed from: g */
    public void mo8106g(long j) {
        if (this.f5722u1.isStarted()) {
            this.f5722u1.cancel();
        }
        this.f5722u1.setFloatValues(new float[]{this.f5724v1, 0.0f});
        this.f5722u1.setDuration(j);
        this.f5722u1.start();
    }

    public long getPreferredUpdateDelay() {
        int m = m7739m(this.f5715p1, this.f5707d.width());
        if (m != 0) {
            long j = this.f5730z1;
            if (!(j == 0 || j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED)) {
                return j / ((long) m);
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: h */
    public void mo8108h(boolean z) {
        if (this.f5722u1.isStarted()) {
            this.f5722u1.cancel();
        }
        this.f5725w1 = z;
        this.f5724v1 = Utils.FLOAT_EPSILON;
        invalidate(this.f5705a);
    }

    /* renamed from: i */
    public final boolean mo8109i(float f, float f2) {
        return this.f5705a.contains((int) f, (int) f2);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5692B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: l */
    public final void mo8111l(float f) {
        Rect rect = this.f5711g;
        Rect rect2 = this.f5707d;
        rect.right = w67.m29374q((int) f, rect2.left, rect2.right);
    }

    /* renamed from: n */
    public final Point mo8112n(MotionEvent motionEvent) {
        this.f5714o1.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f5714o1;
    }

    /* renamed from: o */
    public final boolean mo8113o(long j) {
        long j2;
        long j3 = this.f5730z1;
        if (j3 <= 0) {
            return false;
        }
        if (this.f5727x1) {
            j2 = this.f5729y1;
        } else {
            j2 = this.f5691A1;
        }
        long j4 = j2;
        long r = w67.m29376r(j4 + j, 0, j3);
        if (r == j4) {
            return false;
        }
        if (!this.f5727x1) {
            mo8141u(r);
        } else {
            mo8145y(r);
        }
        mo8143w();
        return true;
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        mo8105f(canvas);
        mo8104e(canvas);
        canvas.restore();
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f5727x1 && !z) {
            mo8142v(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f5730z1 > 0) {
            if (w67.f19021a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (mo8113o(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f5706b1);
        postDelayed(r4.f5706b1, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.mo8113o(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f5706b1
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f5706b1
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f5727x1
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.mo8142v(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p005ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.f5725w1) {
            i5 = 0;
        } else {
            i5 = this.f5704U;
        }
        if (this.f5699I == 1) {
            i7 = (i9 - getPaddingBottom()) - this.f5698H;
            int i10 = this.f5694C;
            i6 = ((i9 - getPaddingBottom()) - i10) - Math.max(i5 - (i10 / 2), 0);
        } else {
            i7 = (i9 - this.f5698H) / 2;
            i6 = (i9 - this.f5694C) / 2;
        }
        this.f5705a.set(paddingLeft, i7, paddingRight, this.f5698H + i7);
        Rect rect = this.f5707d;
        Rect rect2 = this.f5705a;
        rect.set(rect2.left + i5, i6, rect2.right - i5, this.f5694C + i6);
        if (w67.f19021a >= 29) {
            mo8125r(i8, i9);
        }
        mo8143w();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f5698H;
        } else if (mode != 1073741824) {
            size = Math.min(this.f5698H, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        mo8144x();
    }

    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f5692B;
        if (drawable != null && m7740q(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            long r2 = r7.f5730z1
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x0076
        L_0x0010:
            android.graphics.Point r0 = r7.mo8112n(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r5 = 3
            if (r3 == r4) goto L_0x004e
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004e
            goto L_0x0076
        L_0x0028:
            boolean r8 = r7.f5727x1
            if (r8 == 0) goto L_0x0076
            int r8 = r7.f5709e0
            if (r0 >= r8) goto L_0x003a
            int r8 = r7.f5720s1
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.mo8111l(r8)
            goto L_0x0040
        L_0x003a:
            r7.f5720s1 = r2
            float r8 = (float) r2
            r7.mo8111l(r8)
        L_0x0040:
            long r0 = r7.getScrubberPosition()
            r7.mo8145y(r0)
            r7.mo8143w()
            r7.invalidate()
            return r4
        L_0x004e:
            boolean r0 = r7.f5727x1
            if (r0 == 0) goto L_0x0076
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0059
            r1 = r4
        L_0x0059:
            r7.mo8142v(r1)
            return r4
        L_0x005d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.mo8109i(r8, r0)
            if (r0 == 0) goto L_0x0076
            r7.mo8111l(r8)
            long r0 = r7.getScrubberPosition()
            r7.mo8141u(r0)
            r7.mo8143w()
            r7.invalidate()
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p005ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean mo8123p(Drawable drawable) {
        if (w67.f19021a < 23 || !m7740q(drawable, getLayoutDirection())) {
            return false;
        }
        return true;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f5730z1 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (mo8113o(-getPositionIncrement())) {
                mo8142v(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (mo8113o(getPositionIncrement())) {
                mo8142v(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* renamed from: r */
    public final void mo8125r(int i, int i2) {
        Rect rect = this.f5721t1;
        if (rect == null || rect.width() != i || this.f5721t1.height() != i2) {
            Rect rect2 = new Rect(0, 0, i, i2);
            this.f5721t1 = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    /* renamed from: s */
    public void mo8126s() {
        if (this.f5722u1.isStarted()) {
            this.f5722u1.cancel();
        }
        this.f5725w1 = false;
        this.f5724v1 = 1.0f;
        invalidate(this.f5705a);
    }

    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
        boolean z;
        if (i == 0 || !(jArr == null || zArr == null)) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f5695C1 = i;
        this.f5696D1 = jArr;
        this.f5697E1 = zArr;
        mo8143w();
    }

    public void setAdMarkerColor(int i) {
        this.f5726x.setColor(i);
        invalidate(this.f5705a);
    }

    public void setBufferedColor(int i) {
        this.f5717r.setColor(i);
        invalidate(this.f5705a);
    }

    public void setBufferedPosition(long j) {
        if (this.f5693B1 != j) {
            this.f5693B1 = j;
            mo8143w();
        }
    }

    public void setDuration(long j) {
        if (this.f5730z1 != j) {
            this.f5730z1 = j;
            if (this.f5727x1 && j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                mo8142v(true);
            }
            mo8143w();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f5727x1 && !z) {
            mo8142v(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f5716q1 = i;
        this.f5718r1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f5716q1 = -1;
        this.f5718r1 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f5728y.setColor(i);
        invalidate(this.f5705a);
    }

    public void setPlayedColor(int i) {
        this.f5712k.setColor(i);
        invalidate(this.f5705a);
    }

    public void setPosition(long j) {
        if (this.f5691A1 != j) {
            this.f5691A1 = j;
            setContentDescription(getProgressText());
            mo8143w();
        }
    }

    public void setScrubberColor(int i) {
        this.f5690A.setColor(i);
        invalidate(this.f5705a);
    }

    public void setUnplayedColor(int i) {
        this.f5719s.setColor(i);
        invalidate(this.f5705a);
    }

    /* renamed from: t */
    public void mo8140t(long j) {
        if (this.f5722u1.isStarted()) {
            this.f5722u1.cancel();
        }
        this.f5725w1 = false;
        this.f5722u1.setFloatValues(new float[]{this.f5724v1, 1.0f});
        this.f5722u1.setDuration(j);
        this.f5722u1.start();
    }

    /* renamed from: u */
    public final void mo8141u(long j) {
        this.f5729y1 = j;
        this.f5727x1 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<C1103b.C1104a> it = this.f5710e1.iterator();
        while (it.hasNext()) {
            it.next().mo8192p(this, j);
        }
    }

    /* renamed from: v */
    public final void mo8142v(boolean z) {
        removeCallbacks(this.f5706b1);
        this.f5727x1 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<C1103b.C1104a> it = this.f5710e1.iterator();
        while (it.hasNext()) {
            it.next().mo8190K(this, this.f5729y1, z);
        }
    }

    /* renamed from: w */
    public final void mo8143w() {
        long j;
        this.f5708e.set(this.f5707d);
        this.f5711g.set(this.f5707d);
        if (this.f5727x1) {
            j = this.f5729y1;
        } else {
            j = this.f5691A1;
        }
        if (this.f5730z1 > 0) {
            Rect rect = this.f5708e;
            Rect rect2 = this.f5707d;
            rect.right = Math.min(rect2.left + ((int) ((((long) this.f5707d.width()) * this.f5693B1) / this.f5730z1)), rect2.right);
            int width = (int) ((((long) this.f5707d.width()) * j) / this.f5730z1);
            Rect rect3 = this.f5711g;
            Rect rect4 = this.f5707d;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f5708e;
            int i = this.f5707d.left;
            rect5.right = i;
            this.f5711g.right = i;
        }
        invalidate(this.f5705a);
    }

    /* renamed from: x */
    public final void mo8144x() {
        Drawable drawable = this.f5692B;
        if (drawable != null && drawable.isStateful() && this.f5692B.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: y */
    public final void mo8145y(long j) {
        if (this.f5729y1 != j) {
            this.f5729y1 = j;
            Iterator<C1103b.C1104a> it = this.f5710e1.iterator();
            while (it.hasNext()) {
                it.next().mo8189I(this, j);
            }
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        AttributeSet attributeSet3 = attributeSet2;
        this.f5705a = new Rect();
        this.f5707d = new Rect();
        this.f5708e = new Rect();
        this.f5711g = new Rect();
        Paint paint = new Paint();
        this.f5712k = paint;
        Paint paint2 = new Paint();
        this.f5717r = paint2;
        Paint paint3 = new Paint();
        this.f5719s = paint3;
        Paint paint4 = new Paint();
        this.f5726x = paint4;
        Paint paint5 = new Paint();
        this.f5728y = paint5;
        Paint paint6 = new Paint();
        this.f5690A = paint6;
        paint6.setAntiAlias(true);
        this.f5710e1 = new CopyOnWriteArraySet<>();
        this.f5714o1 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f5715p1 = f;
        this.f5709e0 = m7736d(f, -50);
        int d = m7736d(f, 4);
        int d2 = m7736d(f, 26);
        int d3 = m7736d(f, 4);
        int d4 = m7736d(f, 12);
        int d5 = m7736d(f, 0);
        int d6 = m7736d(f, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint4;
            Paint paint8 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, h65.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(h65.DefaultTimeBar_scrubber_drawable);
                this.f5692B = drawable;
                if (drawable != null) {
                    mo8123p(drawable);
                    d2 = Math.max(drawable.getMinimumHeight(), d2);
                }
                this.f5694C = obtainStyledAttributes.getDimensionPixelSize(h65.DefaultTimeBar_bar_height, d);
                this.f5698H = obtainStyledAttributes.getDimensionPixelSize(h65.DefaultTimeBar_touch_target_height, d2);
                this.f5699I = obtainStyledAttributes.getInt(h65.DefaultTimeBar_bar_gravity, 0);
                this.f5700L = obtainStyledAttributes.getDimensionPixelSize(h65.DefaultTimeBar_ad_marker_width, d3);
                this.f5701M = obtainStyledAttributes.getDimensionPixelSize(h65.DefaultTimeBar_scrubber_enabled_size, d4);
                this.f5702P = obtainStyledAttributes.getDimensionPixelSize(h65.DefaultTimeBar_scrubber_disabled_size, d5);
                this.f5703Q = obtainStyledAttributes.getDimensionPixelSize(h65.DefaultTimeBar_scrubber_dragged_size, d6);
                int i3 = obtainStyledAttributes.getInt(h65.DefaultTimeBar_played_color, -1);
                int i4 = obtainStyledAttributes.getInt(h65.DefaultTimeBar_scrubber_color, -1);
                int i5 = obtainStyledAttributes.getInt(h65.DefaultTimeBar_buffered_color, -855638017);
                int i6 = obtainStyledAttributes.getInt(h65.DefaultTimeBar_unplayed_color, 872415231);
                int i7 = obtainStyledAttributes.getInt(h65.DefaultTimeBar_ad_marker_color, -1291845888);
                int i8 = obtainStyledAttributes.getInt(h65.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint7.setColor(i7);
                paint8.setColor(i8);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f5694C = d;
            this.f5698H = d2;
            this.f5699I = 0;
            this.f5700L = d3;
            this.f5701M = d4;
            this.f5702P = d5;
            this.f5703Q = d6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f5692B = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f5713k0 = sb;
        this.f5723v0 = new Formatter(sb, Locale.getDefault());
        this.f5706b1 = new ba1(this);
        Drawable drawable2 = this.f5692B;
        if (drawable2 != null) {
            this.f5704U = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f5704U = (Math.max(this.f5702P, Math.max(this.f5701M, this.f5703Q)) + 1) / 2;
        }
        this.f5724v1 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f5722u1 = valueAnimator;
        valueAnimator.addUpdateListener(new ca1(this));
        this.f5730z1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5718r1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5716q1 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
