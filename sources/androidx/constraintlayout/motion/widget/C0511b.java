package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.b */
/* compiled from: TouchResponse */
public class C0511b {

    /* renamed from: G */
    public static final float[][] f2854G = {new float[]{0.5f, Utils.FLOAT_EPSILON}, new float[]{Utils.FLOAT_EPSILON, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{Utils.FLOAT_EPSILON, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H */
    public static final float[][] f2855H = {new float[]{Utils.FLOAT_EPSILON, -1.0f}, new float[]{Utils.FLOAT_EPSILON, 1.0f}, new float[]{-1.0f, Utils.FLOAT_EPSILON}, new float[]{1.0f, Utils.FLOAT_EPSILON}, new float[]{-1.0f, Utils.FLOAT_EPSILON}, new float[]{1.0f, Utils.FLOAT_EPSILON}};

    /* renamed from: A */
    public float f2856A = 10.0f;

    /* renamed from: B */
    public float f2857B = 1.0f;

    /* renamed from: C */
    public float f2858C = Float.NaN;

    /* renamed from: D */
    public float f2859D = Float.NaN;

    /* renamed from: E */
    public int f2860E = 0;

    /* renamed from: F */
    public int f2861F = 0;

    /* renamed from: a */
    public int f2862a = 0;

    /* renamed from: b */
    public int f2863b = 0;

    /* renamed from: c */
    public int f2864c = 0;

    /* renamed from: d */
    public int f2865d = -1;

    /* renamed from: e */
    public int f2866e = -1;

    /* renamed from: f */
    public int f2867f = -1;

    /* renamed from: g */
    public float f2868g = 0.5f;

    /* renamed from: h */
    public float f2869h = 0.5f;

    /* renamed from: i */
    public float f2870i = 0.5f;

    /* renamed from: j */
    public float f2871j = 0.5f;

    /* renamed from: k */
    public int f2872k = -1;

    /* renamed from: l */
    public boolean f2873l = false;

    /* renamed from: m */
    public float f2874m = Utils.FLOAT_EPSILON;

    /* renamed from: n */
    public float f2875n = 1.0f;

    /* renamed from: o */
    public boolean f2876o = false;

    /* renamed from: p */
    public float[] f2877p = new float[2];

    /* renamed from: q */
    public int[] f2878q = new int[2];

    /* renamed from: r */
    public float f2879r;

    /* renamed from: s */
    public float f2880s;

    /* renamed from: t */
    public final MotionLayout f2881t;

    /* renamed from: u */
    public float f2882u = 4.0f;

    /* renamed from: v */
    public float f2883v = 1.2f;

    /* renamed from: w */
    public boolean f2884w = true;

    /* renamed from: x */
    public float f2885x = 1.0f;

    /* renamed from: y */
    public int f2886y = 0;

    /* renamed from: z */
    public float f2887z = 10.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.b$a */
    /* compiled from: TouchResponse */
    public class C0512a implements View.OnTouchListener {
        public C0512a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.b$b */
    /* compiled from: TouchResponse */
    public class C0513b implements NestedScrollView.C0571c {
        public C0513b() {
        }

        /* renamed from: a */
        public void mo4877a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C0511b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2881t = motionLayout;
        mo4851c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: a */
    public float mo4849a(float f, float f2) {
        return (f * this.f2874m) + (f2 * this.f2875n);
    }

    /* renamed from: b */
    public final void mo4850b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == c65.OnSwipe_touchAnchorId) {
                this.f2865d = typedArray.getResourceId(index, this.f2865d);
            } else if (index == c65.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f2862a);
                this.f2862a = i2;
                float[] fArr = f2854G[i2];
                this.f2869h = fArr[0];
                this.f2868g = fArr[1];
            } else if (index == c65.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f2863b);
                this.f2863b = i3;
                float[][] fArr2 = f2855H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.f2874m = fArr3[0];
                    this.f2875n = fArr3[1];
                } else {
                    this.f2875n = Float.NaN;
                    this.f2874m = Float.NaN;
                    this.f2873l = true;
                }
            } else if (index == c65.OnSwipe_maxVelocity) {
                this.f2882u = typedArray.getFloat(index, this.f2882u);
            } else if (index == c65.OnSwipe_maxAcceleration) {
                this.f2883v = typedArray.getFloat(index, this.f2883v);
            } else if (index == c65.OnSwipe_moveWhenScrollAtTop) {
                this.f2884w = typedArray.getBoolean(index, this.f2884w);
            } else if (index == c65.OnSwipe_dragScale) {
                this.f2885x = typedArray.getFloat(index, this.f2885x);
            } else if (index == c65.OnSwipe_dragThreshold) {
                this.f2887z = typedArray.getFloat(index, this.f2887z);
            } else if (index == c65.OnSwipe_touchRegionId) {
                this.f2866e = typedArray.getResourceId(index, this.f2866e);
            } else if (index == c65.OnSwipe_onTouchUp) {
                this.f2864c = typedArray.getInt(index, this.f2864c);
            } else if (index == c65.OnSwipe_nestedScrollFlags) {
                this.f2886y = typedArray.getInteger(index, 0);
            } else if (index == c65.OnSwipe_limitBoundsTo) {
                this.f2867f = typedArray.getResourceId(index, 0);
            } else if (index == c65.OnSwipe_rotationCenterId) {
                this.f2872k = typedArray.getResourceId(index, this.f2872k);
            } else if (index == c65.OnSwipe_springDamping) {
                this.f2856A = typedArray.getFloat(index, this.f2856A);
            } else if (index == c65.OnSwipe_springMass) {
                this.f2857B = typedArray.getFloat(index, this.f2857B);
            } else if (index == c65.OnSwipe_springStiffness) {
                this.f2858C = typedArray.getFloat(index, this.f2858C);
            } else if (index == c65.OnSwipe_springStopThreshold) {
                this.f2859D = typedArray.getFloat(index, this.f2859D);
            } else if (index == c65.OnSwipe_springBoundary) {
                this.f2860E = typedArray.getInt(index, this.f2860E);
            } else if (index == c65.OnSwipe_autoCompleteMode) {
                this.f2861F = typedArray.getInt(index, this.f2861F);
            }
        }
    }

    /* renamed from: c */
    public final void mo4851c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.OnSwipe);
        mo4850b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public int mo4852d() {
        return this.f2861F;
    }

    /* renamed from: e */
    public int mo4853e() {
        return this.f2886y;
    }

    /* renamed from: f */
    public RectF mo4854f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2867f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: g */
    public float mo4855g() {
        return this.f2883v;
    }

    /* renamed from: h */
    public float mo4856h() {
        return this.f2882u;
    }

    /* renamed from: i */
    public boolean mo4857i() {
        return this.f2884w;
    }

    /* renamed from: j */
    public float mo4858j(float f, float f2) {
        this.f2881t.mo4672e0(this.f2865d, this.f2881t.getProgress(), this.f2869h, this.f2868g, this.f2877p);
        float f3 = this.f2874m;
        if (f3 != Utils.FLOAT_EPSILON) {
            float[] fArr = this.f2877p;
            if (fArr[0] == Utils.FLOAT_EPSILON) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f2877p;
        if (fArr2[1] == Utils.FLOAT_EPSILON) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f2875n) / fArr2[1];
    }

    /* renamed from: k */
    public int mo4859k() {
        return this.f2860E;
    }

    /* renamed from: l */
    public float mo4860l() {
        return this.f2856A;
    }

    /* renamed from: m */
    public float mo4861m() {
        return this.f2857B;
    }

    /* renamed from: n */
    public float mo4862n() {
        return this.f2858C;
    }

    /* renamed from: o */
    public float mo4863o() {
        return this.f2859D;
    }

    /* renamed from: p */
    public RectF mo4864p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2866e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: q */
    public int mo4865q() {
        return this.f2866e;
    }

    /* renamed from: r */
    public void mo4866r(MotionEvent motionEvent, MotionLayout.C0503g gVar, int i, C0507a aVar) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        boolean z;
        MotionLayout.C0503g gVar2 = gVar;
        if (this.f2873l) {
            mo4867s(motionEvent, gVar, i, aVar);
            return;
        }
        gVar2.mo4767b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2879r = motionEvent.getRawX();
            this.f2880s = motionEvent.getRawY();
            this.f2876o = false;
        } else if (action == 1) {
            this.f2876o = false;
            gVar2.mo4770e(1000);
            float d = gVar.mo4769d();
            float c = gVar.mo4768c();
            float progress = this.f2881t.getProgress();
            int i3 = this.f2865d;
            if (i3 != -1) {
                this.f2881t.mo4672e0(i3, progress, this.f2869h, this.f2868g, this.f2877p);
            } else {
                float min = (float) Math.min(this.f2881t.getWidth(), this.f2881t.getHeight());
                float[] fArr = this.f2877p;
                fArr[1] = this.f2875n * min;
                fArr[0] = min * this.f2874m;
            }
            float f6 = this.f2874m;
            float[] fArr2 = this.f2877p;
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            if (f6 != Utils.FLOAT_EPSILON) {
                f = d / f7;
            } else {
                f = c / f8;
            }
            if (!Float.isNaN(f)) {
                f2 = (f / 3.0f) + progress;
            } else {
                f2 = progress;
            }
            if (f2 != Utils.FLOAT_EPSILON && f2 != 1.0f && (i2 = this.f2864c) != 3) {
                if (((double) f2) < 0.5d) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                if (i2 == 6) {
                    if (progress + f < Utils.FLOAT_EPSILON) {
                        f = Math.abs(f);
                    }
                    f3 = 1.0f;
                }
                if (this.f2864c == 7) {
                    if (progress + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f3 = 0.0f;
                }
                this.f2881t.mo4712s0(this.f2864c, f3, f);
                if (Utils.FLOAT_EPSILON >= progress || 1.0f <= progress) {
                    this.f2881t.setState(MotionLayout.TransitionState.FINISHED);
                }
            } else if (Utils.FLOAT_EPSILON >= f2 || 1.0f <= f2) {
                this.f2881t.setState(MotionLayout.TransitionState.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f2880s;
            float rawX = motionEvent.getRawX() - this.f2879r;
            if (Math.abs((this.f2874m * rawX) + (this.f2875n * rawY)) > this.f2887z || this.f2876o) {
                float progress2 = this.f2881t.getProgress();
                if (!this.f2876o) {
                    this.f2876o = true;
                    this.f2881t.setProgress(progress2);
                }
                int i4 = this.f2865d;
                if (i4 != -1) {
                    this.f2881t.mo4672e0(i4, progress2, this.f2869h, this.f2868g, this.f2877p);
                } else {
                    float min2 = (float) Math.min(this.f2881t.getWidth(), this.f2881t.getHeight());
                    float[] fArr3 = this.f2877p;
                    fArr3[1] = this.f2875n * min2;
                    fArr3[0] = min2 * this.f2874m;
                }
                float f9 = this.f2874m;
                float[] fArr4 = this.f2877p;
                if (((double) Math.abs(((f9 * fArr4[0]) + (this.f2875n * fArr4[1])) * this.f2885x)) < 0.01d) {
                    float[] fArr5 = this.f2877p;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f2874m != Utils.FLOAT_EPSILON) {
                    f4 = rawX / this.f2877p[0];
                } else {
                    f4 = rawY / this.f2877p[1];
                }
                float max = Math.max(Math.min(progress2 + f4, 1.0f), Utils.FLOAT_EPSILON);
                if (this.f2864c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f2864c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.f2881t.getProgress();
                if (max != progress3) {
                    int i5 = (progress3 > Utils.FLOAT_EPSILON ? 1 : (progress3 == Utils.FLOAT_EPSILON ? 0 : -1));
                    if (i5 == 0 || progress3 == 1.0f) {
                        MotionLayout motionLayout = this.f2881t;
                        if (i5 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        motionLayout.mo4665Y(z);
                    }
                    this.f2881t.setProgress(max);
                    gVar2.mo4770e(1000);
                    float d2 = gVar.mo4769d();
                    float c2 = gVar.mo4768c();
                    if (this.f2874m != Utils.FLOAT_EPSILON) {
                        f5 = d2 / this.f2877p[0];
                    } else {
                        f5 = c2 / this.f2877p[1];
                    }
                    this.f2881t.f2744r1 = f5;
                } else {
                    this.f2881t.f2744r1 = Utils.FLOAT_EPSILON;
                }
                this.f2879r = motionEvent.getRawX();
                this.f2880s = motionEvent.getRawY();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0318  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4867s(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.C0503g r25, int r26, androidx.constraintlayout.motion.widget.C0507a r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.mo4767b(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x032b
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L_0x01ba
            r11 = 2
            if (r3 == r11) goto L_0x001d
            goto L_0x0339
        L_0x001d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2881t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f2872k
            if (r12 == r6) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2881t
            int[] r12 = r0.f2878q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f2878q
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.f2878q
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto L_0x00ac
        L_0x006c:
            int r12 = r0.f2865d
            if (r12 == r6) goto L_0x00ac
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f2881t
            jy3 r12 = r13.mo4674g0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f2881t
            int r12 = r12.mo22119h()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L_0x0083
            goto L_0x00ac
        L_0x0083:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            int[] r11 = r0.f2878q
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.f2878q
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.f2878q
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        L_0x00ac:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.f2880s
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.f2879r
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00eb
            float r6 = r6 - r5
            goto L_0x00f2
        L_0x00eb:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f2
            float r6 = r6 + r5
        L_0x00f2:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x0104
            boolean r7 = r0.f2876o
            if (r7 == 0) goto L_0x0339
        L_0x0104:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f2881t
            float r7 = r7.getProgress()
            boolean r11 = r0.f2876o
            if (r11 != 0) goto L_0x0115
            r0.f2876o = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2881t
            r11.setProgress(r7)
        L_0x0115:
            int r11 = r0.f2865d
            r3 = -1
            if (r11 == r3) goto L_0x013e
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            float r5 = r0.f2869h
            float r13 = r0.f2868g
            float[] r14 = r0.f2877p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.mo4672e0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f2877p
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L_0x0142
        L_0x013e:
            float[] r3 = r0.f2877p
            r3[r10] = r5
        L_0x0142:
            float r3 = r0.f2885x
            float r6 = r6 * r3
            float[] r3 = r0.f2877p
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f2881t
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x01a7
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0168
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0170
        L_0x0168:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            if (r6 != 0) goto L_0x016d
            r4 = r10
        L_0x016d:
            r3.mo4665Y(r4)
        L_0x0170:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.mo4770e(r3)
            float r3 = r25.mo4769d()
            float r1 = r25.mo4768c()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.f2744r1 = r1
            goto L_0x01ac
        L_0x01a7:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f2881t
            r3 = 0
            r1.f2744r1 = r3
        L_0x01ac:
            float r1 = r24.getRawX()
            r0.f2879r = r1
            float r1 = r24.getRawY()
            r0.f2880s = r1
            goto L_0x0339
        L_0x01ba:
            r0.f2876o = r4
            r6 = 16
            r1.mo4770e(r6)
            float r6 = r25.mo4769d()
            float r1 = r25.mo4768c()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f2881t
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f2881t
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2881t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f2872k
            r3 = -1
            if (r12 == r3) goto L_0x0215
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f2881t
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2881t
            int[] r12 = r0.f2878q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f2878q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f2878q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
        L_0x020f:
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L_0x0250
        L_0x0215:
            int r12 = r0.f2865d
            r3 = -1
            if (r12 == r3) goto L_0x0250
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f2881t
            jy3 r8 = r8.mo4674g0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2881t
            int r8 = r8.mo22119h()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2881t
            int[] r12 = r0.f2878q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f2878q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f2878q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            goto L_0x020f
        L_0x0250:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.f2865d
            r3 = -1
            if (r11 == r3) goto L_0x028d
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2881t
            float r5 = r0.f2869h
            float r12 = r0.f2868g
            float[] r13 = r0.f2877p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.mo4672e0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f2877p
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L_0x0291
        L_0x028d:
            float[] r3 = r0.f2877p
            r3[r10] = r5
        L_0x0291:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x02b6
            float r2 = r1 * r3
            float r4 = r0.f2885x
            float r2 = r2 * r4
            float[] r4 = r0.f2877p
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
            goto L_0x02b7
        L_0x02b6:
            r2 = r7
        L_0x02b7:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0318
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0318
            int r4 = r0.f2864c
            r5 = 3
            if (r4 == r5) goto L_0x0318
            float r5 = r0.f2885x
            float r1 = r1 * r5
            float[] r5 = r0.f2877p
            r5 = r5[r10]
            float r1 = r1 / r5
            double r5 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02d8
            r2 = 0
            goto L_0x02da
        L_0x02d8:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02da:
            r5 = 6
            if (r4 != r5) goto L_0x02ea
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02e8
            float r1 = java.lang.Math.abs(r1)
        L_0x02e8:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02ea:
            int r4 = r0.f2864c
            r5 = 7
            if (r4 != r5) goto L_0x02fd
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x02fc
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L_0x02fc:
            r2 = 0
        L_0x02fd:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f2881t
            int r5 = r0.f2864c
            float r1 = r1 * r3
            r4.mo4712s0(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0310
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0339
        L_0x0310:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f2881t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0339
        L_0x0318:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0323
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0339
        L_0x0323:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f2881t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0339
        L_0x032b:
            float r1 = r24.getRawX()
            r0.f2879r = r1
            float r1 = r24.getRawY()
            r0.f2880s = r1
            r0.f2876o = r4
        L_0x0339:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0511b.mo4867s(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$g, int, androidx.constraintlayout.motion.widget.a):void");
    }

    /* renamed from: t */
    public void mo4868t(float f, float f2) {
        float f3;
        float progress = this.f2881t.getProgress();
        if (!this.f2876o) {
            this.f2876o = true;
            this.f2881t.setProgress(progress);
        }
        this.f2881t.mo4672e0(this.f2865d, progress, this.f2869h, this.f2868g, this.f2877p);
        float f4 = this.f2874m;
        float[] fArr = this.f2877p;
        if (((double) Math.abs((f4 * fArr[0]) + (this.f2875n * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f2877p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f2874m;
        if (f5 != Utils.FLOAT_EPSILON) {
            f3 = (f * f5) / this.f2877p[0];
        } else {
            f3 = (f2 * this.f2875n) / this.f2877p[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), Utils.FLOAT_EPSILON);
        if (max != this.f2881t.getProgress()) {
            this.f2881t.setProgress(max);
        }
    }

    public String toString() {
        if (Float.isNaN(this.f2874m)) {
            return "rotation";
        }
        return this.f2874m + " , " + this.f2875n;
    }

    /* renamed from: u */
    public void mo4870u(float f, float f2) {
        float f3;
        boolean z;
        boolean z2 = false;
        this.f2876o = false;
        float progress = this.f2881t.getProgress();
        this.f2881t.mo4672e0(this.f2865d, progress, this.f2869h, this.f2868g, this.f2877p);
        float f4 = this.f2874m;
        float[] fArr = this.f2877p;
        float f5 = fArr[0];
        float f6 = this.f2875n;
        float f7 = fArr[1];
        float f8 = Utils.FLOAT_EPSILON;
        if (f4 != Utils.FLOAT_EPSILON) {
            f3 = (f * f4) / f5;
        } else {
            f3 = (f2 * f6) / f7;
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != Utils.FLOAT_EPSILON) {
            if (progress != 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f2864c;
            if (i != 3) {
                z2 = true;
            }
            if (z2 && z) {
                MotionLayout motionLayout = this.f2881t;
                if (((double) progress) >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.mo4712s0(i, f8, f3);
            }
        }
    }

    /* renamed from: v */
    public void mo4871v(float f, float f2) {
        this.f2879r = f;
        this.f2880s = f2;
    }

    /* renamed from: w */
    public void mo4872w(boolean z) {
        if (z) {
            float[][] fArr = f2855H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f2854G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f2855H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f2854G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f2854G[this.f2862a];
        this.f2869h = fArr5[0];
        this.f2868g = fArr5[1];
        int i = this.f2863b;
        float[][] fArr6 = f2855H;
        if (i < fArr6.length) {
            float[] fArr7 = fArr6[i];
            this.f2874m = fArr7[0];
            this.f2875n = fArr7[1];
        }
    }

    /* renamed from: x */
    public void mo4873x(int i) {
        this.f2864c = i;
    }

    /* renamed from: y */
    public void mo4874y(float f, float f2) {
        this.f2879r = f;
        this.f2880s = f2;
        this.f2876o = false;
    }

    /* renamed from: z */
    public void mo4875z() {
        View view;
        int i = this.f2865d;
        if (i != -1) {
            view = this.f2881t.findViewById(i);
            if (view == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot find TouchAnchorId @id/");
                sb.append(t21.m27245c(this.f2881t.getContext(), this.f2865d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new C0512a());
            nestedScrollView.setOnScrollChangeListener(new C0513b());
        }
    }
}
