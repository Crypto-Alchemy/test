package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C0507a;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.c */
/* compiled from: ViewTransition */
public class C0514c {

    /* renamed from: a */
    public int f2890a;

    /* renamed from: b */
    public int f2891b = -1;

    /* renamed from: c */
    public boolean f2892c = false;

    /* renamed from: d */
    public int f2893d = 0;

    /* renamed from: e */
    public int f2894e;

    /* renamed from: f */
    public na3 f2895f;

    /* renamed from: g */
    public C0532a.C0533a f2896g;

    /* renamed from: h */
    public int f2897h = -1;

    /* renamed from: i */
    public int f2898i = -1;

    /* renamed from: j */
    public int f2899j;

    /* renamed from: k */
    public String f2900k;

    /* renamed from: l */
    public int f2901l = 0;

    /* renamed from: m */
    public String f2902m = null;

    /* renamed from: n */
    public int f2903n = -1;

    /* renamed from: o */
    public Context f2904o;

    /* renamed from: p */
    public int f2905p = -1;

    /* renamed from: q */
    public int f2906q = -1;

    /* renamed from: r */
    public int f2907r = -1;

    /* renamed from: s */
    public int f2908s = -1;

    /* renamed from: t */
    public int f2909t = -1;

    /* renamed from: u */
    public int f2910u = -1;

    /* renamed from: v */
    public int f2911v = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.c$a */
    /* compiled from: ViewTransition */
    public class C0515a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ ym1 f2912a;

        public C0515a(ym1 ym1) {
            this.f2912a = ym1;
        }

        public float getInterpolation(float f) {
            return (float) this.f2912a.mo21311a((double) f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.c$b */
    /* compiled from: ViewTransition */
    public static class C0516b {

        /* renamed from: a */
        public final int f2914a;

        /* renamed from: b */
        public final int f2915b;

        /* renamed from: c */
        public long f2916c;

        /* renamed from: d */
        public jy3 f2917d;

        /* renamed from: e */
        public int f2918e;

        /* renamed from: f */
        public int f2919f;

        /* renamed from: g */
        public da3 f2920g = new da3();

        /* renamed from: h */
        public C0517d f2921h;

        /* renamed from: i */
        public Interpolator f2922i;

        /* renamed from: j */
        public boolean f2923j = false;

        /* renamed from: k */
        public float f2924k;

        /* renamed from: l */
        public float f2925l;

        /* renamed from: m */
        public long f2926m;

        /* renamed from: n */
        public Rect f2927n = new Rect();

        /* renamed from: o */
        public boolean f2928o = false;

        public C0516b(C0517d dVar, jy3 jy3, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.f2921h = dVar;
            this.f2917d = jy3;
            this.f2918e = i;
            this.f2919f = i2;
            long nanoTime = System.nanoTime();
            this.f2916c = nanoTime;
            this.f2926m = nanoTime;
            this.f2921h.mo4898b(this);
            this.f2922i = interpolator;
            this.f2914a = i4;
            this.f2915b = i5;
            if (i3 == 3) {
                this.f2928o = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / ((float) i);
            }
            this.f2925l = f;
            mo4892a();
        }

        /* renamed from: a */
        public void mo4892a() {
            if (this.f2923j) {
                mo4894c();
            } else {
                mo4893b();
            }
        }

        /* renamed from: b */
        public void mo4893b() {
            float f;
            long nanoTime = System.nanoTime();
            this.f2926m = nanoTime;
            float f2 = this.f2924k + (((float) (((double) (nanoTime - this.f2926m)) * 1.0E-6d)) * this.f2925l);
            this.f2924k = f2;
            if (f2 >= 1.0f) {
                this.f2924k = 1.0f;
            }
            Interpolator interpolator = this.f2922i;
            if (interpolator == null) {
                f = this.f2924k;
            } else {
                f = interpolator.getInterpolation(this.f2924k);
            }
            float f3 = f;
            jy3 jy3 = this.f2917d;
            boolean x = jy3.mo22135x(jy3.f13914b, f3, nanoTime, this.f2920g);
            if (this.f2924k >= 1.0f) {
                if (this.f2914a != -1) {
                    this.f2917d.mo22133v().setTag(this.f2914a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2915b != -1) {
                    this.f2917d.mo22133v().setTag(this.f2915b, (Object) null);
                }
                if (!this.f2928o) {
                    this.f2921h.mo4903g(this);
                }
            }
            if (this.f2924k < 1.0f || x) {
                this.f2921h.mo4901e();
            }
        }

        /* renamed from: c */
        public void mo4894c() {
            float f;
            long nanoTime = System.nanoTime();
            this.f2926m = nanoTime;
            float f2 = this.f2924k - (((float) (((double) (nanoTime - this.f2926m)) * 1.0E-6d)) * this.f2925l);
            this.f2924k = f2;
            if (f2 < Utils.FLOAT_EPSILON) {
                this.f2924k = Utils.FLOAT_EPSILON;
            }
            Interpolator interpolator = this.f2922i;
            if (interpolator == null) {
                f = this.f2924k;
            } else {
                f = interpolator.getInterpolation(this.f2924k);
            }
            float f3 = f;
            jy3 jy3 = this.f2917d;
            boolean x = jy3.mo22135x(jy3.f13914b, f3, nanoTime, this.f2920g);
            if (this.f2924k <= Utils.FLOAT_EPSILON) {
                if (this.f2914a != -1) {
                    this.f2917d.mo22133v().setTag(this.f2914a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2915b != -1) {
                    this.f2917d.mo22133v().setTag(this.f2915b, (Object) null);
                }
                this.f2921h.mo4903g(this);
            }
            if (this.f2924k > Utils.FLOAT_EPSILON || x) {
                this.f2921h.mo4901e();
            }
        }

        /* renamed from: d */
        public void mo4895d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.f2917d.mo22133v().getHitRect(this.f2927n);
                    if (!this.f2927n.contains((int) f, (int) f2) && !this.f2923j) {
                        mo4896e(true);
                    }
                }
            } else if (!this.f2923j) {
                mo4896e(true);
            }
        }

        /* renamed from: e */
        public void mo4896e(boolean z) {
            int i;
            float f;
            this.f2923j = z;
            if (z && (i = this.f2919f) != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / ((float) i);
                }
                this.f2925l = f;
            }
            this.f2921h.mo4901e();
            this.f2926m = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0514c(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f2891b = r0
            r1 = 0
            r9.f2892c = r1
            r9.f2893d = r1
            r9.f2897h = r0
            r9.f2898i = r0
            r9.f2901l = r1
            r2 = 0
            r9.f2902m = r2
            r9.f2903n = r0
            r9.f2905p = r0
            r9.f2906q = r0
            r9.f2907r = r0
            r9.f2908s = r0
            r9.f2909t = r0
            r9.f2910u = r0
            r9.f2911v = r0
            r9.f2904o = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
        L_0x002a:
            r3 = 1
            if (r2 == r3) goto L_0x00d9
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L_0x0042
            if (r2 == r5) goto L_0x0037
            goto L_0x00ca
        L_0x0037:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            boolean r2 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r2 == 0) goto L_0x00ca
            return
        L_0x0042:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0075;
                case -1239391468: goto L_0x006b;
                case 61998586: goto L_0x0063;
                case 366511058: goto L_0x0059;
                case 1791837707: goto L_0x004f;
                default: goto L_0x004e;
            }     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
        L_0x004e:
            goto L_0x007f
        L_0x004f:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r5
            goto L_0x0080
        L_0x0059:
            java.lang.String r4 = "CustomMethod"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r8
            goto L_0x0080
        L_0x0063:
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r1
            goto L_0x0080
        L_0x006b:
            java.lang.String r4 = "KeyFrameSet"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r3
            goto L_0x0080
        L_0x0075:
            java.lang.String r4 = "ConstraintOverride"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r6
            goto L_0x0080
        L_0x007f:
            r4 = r0
        L_0x0080:
            if (r4 == 0) goto L_0x00c7
            if (r4 == r3) goto L_0x00bf
            if (r4 == r6) goto L_0x00b8
            if (r4 == r5) goto L_0x00b0
            if (r4 == r8) goto L_0x00b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.String r4 = p000.t21.m27243a()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            int r3 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00b0:
            androidx.constraintlayout.widget.a$a r2 = r9.f2896g     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f3226g     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            androidx.constraintlayout.widget.ConstraintAttribute.m4120i(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00b8:
            androidx.constraintlayout.widget.a$a r2 = androidx.constraintlayout.widget.C0532a.m4203m(r10, r11)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r9.f2896g = r2     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00bf:
            na3 r2 = new na3     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r9.f2895f = r2     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00c7:
            r9.mo4887l(r10, r11)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
        L_0x00ca:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x002a
        L_0x00d0:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00d9
        L_0x00d5:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0514c.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m4055j(View[] viewArr) {
        if (this.f2905p != -1) {
            for (View tag : viewArr) {
                tag.setTag(this.f2905p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f2906q != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(this.f2906q, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public void mo4878b(C0517d dVar, MotionLayout motionLayout, View view) {
        jy3 jy3 = new jy3(view);
        jy3.mo22103A(view);
        this.f2895f.mo23634a(jy3);
        jy3.mo22110H(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.f2897h, System.nanoTime());
        C0517d dVar2 = dVar;
        jy3 jy32 = jy3;
        new C0516b(dVar2, jy32, this.f2897h, this.f2898i, this.f2891b, mo4882f(motionLayout.getContext()), this.f2905p, this.f2906q);
    }

    /* renamed from: c */
    public void mo4879c(C0517d dVar, MotionLayout motionLayout, int i, C0532a aVar, View... viewArr) {
        if (!this.f2892c) {
            int i2 = this.f2894e;
            if (i2 == 2) {
                mo4878b(dVar, motionLayout, viewArr[0]);
                return;
            }
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i3 : constraintSetIds) {
                    if (i3 != i) {
                        C0532a f0 = motionLayout.mo4673f0(i3);
                        for (View id : viewArr) {
                            C0532a.C0533a w = f0.mo5168w(id.getId());
                            C0532a.C0533a aVar2 = this.f2896g;
                            if (aVar2 != null) {
                                aVar2.mo5173d(w);
                                w.f3226g.putAll(this.f2896g.f3226g);
                            }
                        }
                    }
                }
            }
            C0532a aVar3 = new C0532a();
            aVar3.mo5162q(aVar);
            for (View id2 : viewArr) {
                C0532a.C0533a w2 = aVar3.mo5168w(id2.getId());
                C0532a.C0533a aVar4 = this.f2896g;
                if (aVar4 != null) {
                    aVar4.mo5173d(w2);
                    w2.f3226g.putAll(this.f2896g.f3226g);
                }
            }
            motionLayout.mo4656B0(i, aVar3);
            int i4 = p35.view_transition;
            motionLayout.mo4656B0(i4, aVar);
            motionLayout.setState(i4, -1, -1);
            C0507a.C0509b bVar = new C0507a.C0509b(-1, motionLayout.f2738o1, i4, i);
            for (View n : viewArr) {
                mo4889n(bVar, n);
            }
            motionLayout.setTransition(bVar);
            motionLayout.mo4733u0(new le7(this, viewArr));
        }
    }

    /* renamed from: d */
    public boolean mo4880d(View view) {
        boolean z;
        boolean z2;
        int i = this.f2907r;
        if (i != -1 && view.getTag(i) == null) {
            z = false;
        } else {
            z = true;
        }
        int i2 = this.f2908s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public int mo4881e() {
        return this.f2890a;
    }

    /* renamed from: f */
    public Interpolator mo4882f(Context context) {
        int i = this.f2901l;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.f2903n);
        }
        if (i == -1) {
            return new C0515a(ym1.m30704c(this.f2902m));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: g */
    public int mo4883g() {
        return this.f2909t;
    }

    /* renamed from: h */
    public int mo4884h() {
        return this.f2910u;
    }

    /* renamed from: i */
    public int mo4885i() {
        return this.f2891b;
    }

    /* renamed from: k */
    public boolean mo4886k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f2899j == -1 && this.f2900k == null) || !mo4880d(view)) {
            return false;
        }
        if (view.getId() == this.f2899j) {
            return true;
        }
        if (this.f2900k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f3132b0) != null && str.matches(this.f2900k)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo4887l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == c65.ViewTransition_android_id) {
                this.f2890a = obtainStyledAttributes.getResourceId(index, this.f2890a);
            } else if (index == c65.ViewTransition_motionTarget) {
                if (MotionLayout.f2682P2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f2899j);
                    this.f2899j = resourceId;
                    if (resourceId == -1) {
                        this.f2900k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f2900k = obtainStyledAttributes.getString(index);
                } else {
                    this.f2899j = obtainStyledAttributes.getResourceId(index, this.f2899j);
                }
            } else if (index == c65.ViewTransition_onStateTransition) {
                this.f2891b = obtainStyledAttributes.getInt(index, this.f2891b);
            } else if (index == c65.ViewTransition_transitionDisable) {
                this.f2892c = obtainStyledAttributes.getBoolean(index, this.f2892c);
            } else if (index == c65.ViewTransition_pathMotionArc) {
                this.f2893d = obtainStyledAttributes.getInt(index, this.f2893d);
            } else if (index == c65.ViewTransition_duration) {
                this.f2897h = obtainStyledAttributes.getInt(index, this.f2897h);
            } else if (index == c65.ViewTransition_upDuration) {
                this.f2898i = obtainStyledAttributes.getInt(index, this.f2898i);
            } else if (index == c65.ViewTransition_viewTransitionMode) {
                this.f2894e = obtainStyledAttributes.getInt(index, this.f2894e);
            } else if (index == c65.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f2903n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f2901l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2902m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f2901l = -1;
                    } else {
                        this.f2903n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f2901l = -2;
                    }
                } else {
                    this.f2901l = obtainStyledAttributes.getInteger(index, this.f2901l);
                }
            } else if (index == c65.ViewTransition_setsTag) {
                this.f2905p = obtainStyledAttributes.getResourceId(index, this.f2905p);
            } else if (index == c65.ViewTransition_clearsTag) {
                this.f2906q = obtainStyledAttributes.getResourceId(index, this.f2906q);
            } else if (index == c65.ViewTransition_ifTagSet) {
                this.f2907r = obtainStyledAttributes.getResourceId(index, this.f2907r);
            } else if (index == c65.ViewTransition_ifTagNotSet) {
                this.f2908s = obtainStyledAttributes.getResourceId(index, this.f2908s);
            } else if (index == c65.ViewTransition_SharedValueId) {
                this.f2910u = obtainStyledAttributes.getResourceId(index, this.f2910u);
            } else if (index == c65.ViewTransition_SharedValue) {
                this.f2909t = obtainStyledAttributes.getInteger(index, this.f2909t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public boolean mo4888m(int i) {
        int i2 = this.f2891b;
        if (i2 == 1) {
            if (i == 0) {
                return true;
            }
            return false;
        } else if (i2 == 2) {
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 3 && i == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    public final void mo4889n(C0507a.C0509b bVar, View view) {
        int i = this.f2897h;
        if (i != -1) {
            bVar.mo4833E(i);
        }
        bVar.mo4837I(this.f2893d);
        bVar.mo4835G(this.f2901l, this.f2902m, this.f2903n);
        int id = view.getId();
        na3 na3 = this.f2895f;
        if (na3 != null) {
            ArrayList<y93> d = na3.mo23637d(-1);
            na3 na32 = new na3();
            Iterator<y93> it = d.iterator();
            while (it.hasNext()) {
                na32.mo23636c(it.next().clone().mo28003i(id));
            }
            bVar.mo4838t(na32);
        }
    }

    public String toString() {
        return "ViewTransition(" + t21.m27245c(this.f2904o, this.f2890a) + ")";
    }
}
