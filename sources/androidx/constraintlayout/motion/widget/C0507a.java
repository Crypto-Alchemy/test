package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0532a;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* compiled from: MotionScene */
public class C0507a {

    /* renamed from: a */
    public final MotionLayout f2810a;

    /* renamed from: b */
    public b96 f2811b = null;

    /* renamed from: c */
    public C0509b f2812c = null;

    /* renamed from: d */
    public boolean f2813d = false;

    /* renamed from: e */
    public ArrayList<C0509b> f2814e = new ArrayList<>();

    /* renamed from: f */
    public C0509b f2815f = null;

    /* renamed from: g */
    public ArrayList<C0509b> f2816g = new ArrayList<>();

    /* renamed from: h */
    public SparseArray<C0532a> f2817h = new SparseArray<>();

    /* renamed from: i */
    public HashMap<String, Integer> f2818i = new HashMap<>();

    /* renamed from: j */
    public SparseIntArray f2819j = new SparseIntArray();

    /* renamed from: k */
    public boolean f2820k = false;

    /* renamed from: l */
    public int f2821l = 400;

    /* renamed from: m */
    public int f2822m = 0;

    /* renamed from: n */
    public MotionEvent f2823n;

    /* renamed from: o */
    public boolean f2824o = false;

    /* renamed from: p */
    public boolean f2825p = false;

    /* renamed from: q */
    public MotionLayout.C0503g f2826q;

    /* renamed from: r */
    public boolean f2827r;

    /* renamed from: s */
    public final C0517d f2828s;

    /* renamed from: t */
    public float f2829t;

    /* renamed from: u */
    public float f2830u;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a */
    /* compiled from: MotionScene */
    public class C0508a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ ym1 f2831a;

        public C0508a(ym1 ym1) {
            this.f2831a = ym1;
        }

        public float getInterpolation(float f) {
            return (float) this.f2831a.mo21311a((double) f);
        }
    }

    public C0507a(Context context, MotionLayout motionLayout, int i) {
        this.f2810a = motionLayout;
        this.f2828s = new C0517d(motionLayout);
        mo4789K(context, i);
        SparseArray<C0532a> sparseArray = this.f2817h;
        int i2 = p35.motion_base;
        sparseArray.put(i2, new C0532a());
        this.f2818i.put("motion_base", Integer.valueOf(i2));
    }

    /* renamed from: a0 */
    public static String m3935a0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: A */
    public float mo4779A() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f2812c.f2844l.mo4860l();
    }

    /* renamed from: B */
    public float mo4780B() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f2812c.f2844l.mo4861m();
    }

    /* renamed from: C */
    public float mo4781C() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f2812c.f2844l.mo4862n();
    }

    /* renamed from: D */
    public float mo4782D() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f2812c.f2844l.mo4863o();
    }

    /* renamed from: E */
    public float mo4783E() {
        C0509b bVar = this.f2812c;
        if (bVar != null) {
            return bVar.f2841i;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: F */
    public int mo4784F() {
        C0509b bVar = this.f2812c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2836d;
    }

    /* renamed from: G */
    public C0509b mo4785G(int i) {
        Iterator<C0509b> it = this.f2814e.iterator();
        while (it.hasNext()) {
            C0509b next = it.next();
            if (next.f2833a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: H */
    public List<C0509b> mo4786H(int i) {
        int y = mo4826y(i);
        ArrayList arrayList = new ArrayList();
        Iterator<C0509b> it = this.f2814e.iterator();
        while (it.hasNext()) {
            C0509b next = it.next();
            if (next.f2836d == y || next.f2835c == y) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public final boolean mo4787I(int i) {
        int i2 = this.f2819j.get(i);
        int size = this.f2819j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f2819j.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo4788J() {
        if (this.f2826q != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4789K(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x016d
            if (r2 == 0) goto L_0x015b
            r4 = 2
            if (r2 == r4) goto L_0x0017
            goto L_0x015e
        L_0x0017:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            boolean r5 = r8.f2820k     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r5 == 0) goto L_0x0035
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x0035:
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r6 = -1
            switch(r5) {
                case -1349929691: goto L_0x009a;
                case -1239391468: goto L_0x008f;
                case -687739768: goto L_0x0085;
                case 61998586: goto L_0x007a;
                case 269306229: goto L_0x0071;
                case 312750793: goto L_0x0067;
                case 327855227: goto L_0x005d;
                case 793277014: goto L_0x0053;
                case 1382829617: goto L_0x0049;
                case 1942574248: goto L_0x003f;
                default: goto L_0x003d;
            }     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x003d:
            goto L_0x00a4
        L_0x003f:
            java.lang.String r3 = "include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 6
            goto L_0x00a5
        L_0x0049:
            java.lang.String r3 = "StateSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 4
            goto L_0x00a5
        L_0x0053:
            java.lang.String r3 = "MotionScene"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 0
            goto L_0x00a5
        L_0x005d:
            java.lang.String r3 = "OnSwipe"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = r4
            goto L_0x00a5
        L_0x0067:
            java.lang.String r3 = "OnClick"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 3
            goto L_0x00a5
        L_0x0071:
            java.lang.String r4 = "Transition"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x007a:
            java.lang.String r3 = "ViewTransition"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 9
            goto L_0x00a5
        L_0x0085:
            java.lang.String r3 = "Include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 7
            goto L_0x00a5
        L_0x008f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 8
            goto L_0x00a5
        L_0x009a:
            java.lang.String r3 = "ConstraintSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r2 == 0) goto L_0x00a4
            r3 = 5
            goto L_0x00a5
        L_0x00a4:
            r3 = r6
        L_0x00a5:
            switch(r3) {
                case 0: goto L_0x0157;
                case 1: goto L_0x0115;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00aa;
                default: goto L_0x00a8;
            }     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x00a8:
            goto L_0x015e
        L_0x00aa:
            androidx.constraintlayout.motion.widget.c r2 = new androidx.constraintlayout.motion.widget.c     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            androidx.constraintlayout.motion.widget.d r3 = r8.f2828s     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r3.mo4897a(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x00b6:
            na3 r2 = new na3     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r1 == 0) goto L_0x015e
            java.util.ArrayList r3 = r1.f2843k     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x00c6:
            r8.mo4792N(r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x00cb:
            r8.mo4790L(r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x00d0:
            b96 r2 = new b96     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r8.f2811b = r2     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x00d9:
            if (r1 == 0) goto L_0x015e
            r1.mo4839u(r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x00e0:
            if (r1 != 0) goto L_0x0108
            android.content.res.Resources r2 = r9.getResources()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.String r2 = r2.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x0108:
            if (r1 == 0) goto L_0x015e
            androidx.constraintlayout.motion.widget.b r2 = new androidx.constraintlayout.motion.widget.b     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f2810a     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r2.<init>(r9, r3, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            androidx.constraintlayout.motion.widget.C0511b unused = r1.f2844l = r2     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x0115:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r1 = r8.f2814e     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            androidx.constraintlayout.motion.widget.a$b r2 = new androidx.constraintlayout.motion.widget.a$b     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r2.<init>(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            androidx.constraintlayout.motion.widget.a$b r1 = r8.f2812c     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r1 != 0) goto L_0x013c
            boolean r1 = r2.f2834b     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r1 != 0) goto L_0x013c
            r8.f2812c = r2     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            androidx.constraintlayout.motion.widget.b r1 = r2.f2844l     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r1 == 0) goto L_0x013c
            androidx.constraintlayout.motion.widget.a$b r1 = r8.f2812c     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            androidx.constraintlayout.motion.widget.b r1 = r1.f2844l     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            boolean r3 = r8.f2827r     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r1.mo4872w(r3)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x013c:
            boolean r1 = r2.f2834b     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r1 == 0) goto L_0x0155
            int r1 = r2.f2835c     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            if (r1 != r6) goto L_0x014b
            r8.f2815f = r2     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x0150
        L_0x014b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r1 = r8.f2816g     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x0150:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r1 = r8.f2814e     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x0155:
            r1 = r2
            goto L_0x015e
        L_0x0157:
            r8.mo4793O(r9, r0)     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x015e
        L_0x015b:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
        L_0x015e:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x0169, IOException -> 0x0164 }
            goto L_0x000d
        L_0x0164:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x016d
        L_0x0169:
            r9 = move-exception
            r9.printStackTrace()
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0507a.mo4789K(android.content.Context, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r8.equals("constraintRotate") == false) goto L_0x0040;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4790L(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.a r0 = new androidx.constraintlayout.widget.a
            r0.<init>()
            r1 = 0
            r0.mo5151R(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = r1
            r5 = r3
            r6 = r5
        L_0x0011:
            r7 = 1
            if (r4 >= r2) goto L_0x008a
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.f2820k
            if (r10 == 0) goto L_0x0036
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L_0x0036:
            r8.hashCode()
            int r10 = r8.hashCode()
            switch(r10) {
                case -1496482599: goto L_0x0056;
                case -1153153640: goto L_0x004d;
                case 3355: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r7 = r3
            goto L_0x0060
        L_0x0042:
            java.lang.String r7 = "id"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r7 = 2
            goto L_0x0060
        L_0x004d:
            java.lang.String r10 = "constraintRotate"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0060
            goto L_0x0040
        L_0x0056:
            java.lang.String r7 = "deriveConstraintsFrom"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r7 = r1
        L_0x0060:
            switch(r7) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007c;
                case 2: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0087
        L_0x0064:
            int r5 = r13.mo4819r(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.f2818i
            java.lang.String r8 = m3935a0(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = p000.t21.m27245c(r14, r5)
            r0.f3214b = r7
            goto L_0x0087
        L_0x007c:
            int r7 = java.lang.Integer.parseInt(r9)
            r0.f3216d = r7
            goto L_0x0087
        L_0x0083:
            int r6 = r13.mo4819r(r14, r9)
        L_0x0087:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x008a:
            if (r5 == r3) goto L_0x00a4
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f2810a
            int r1 = r1.f2705L1
            if (r1 == 0) goto L_0x0095
            r0.mo5152S(r7)
        L_0x0095:
            r0.mo5147E(r14, r15)
            if (r6 == r3) goto L_0x009f
            android.util.SparseIntArray r14 = r13.f2819j
            r14.put(r5, r6)
        L_0x009f:
            android.util.SparseArray<androidx.constraintlayout.widget.a> r14 = r13.f2817h
            r14.put(r5, r0)
        L_0x00a4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0507a.mo4790L(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: M */
    public final int mo4791M(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return mo4790L(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: N */
    public final void mo4792N(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == c65.include_constraintSet) {
                mo4791M(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    public final void mo4793O(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == c65.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.f2821l);
                this.f2821l = i2;
                if (i2 < 8) {
                    this.f2821l = 8;
                }
            } else if (index == c65.MotionScene_layoutDuringTransition) {
                this.f2822m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: P */
    public void mo4794P(float f, float f2) {
        C0509b bVar = this.f2812c;
        if (bVar != null && bVar.f2844l != null) {
            this.f2812c.f2844l.mo4868t(f, f2);
        }
    }

    /* renamed from: Q */
    public void mo4795Q(float f, float f2) {
        C0509b bVar = this.f2812c;
        if (bVar != null && bVar.f2844l != null) {
            this.f2812c.f2844l.mo4870u(f, f2);
        }
    }

    /* renamed from: R */
    public void mo4796R(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.C0503g gVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f2826q == null) {
            this.f2826q = this.f2810a.mo4694m0();
        }
        this.f2826q.mo4767b(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f2829t = motionEvent.getRawX();
                this.f2830u = motionEvent.getRawY();
                this.f2823n = motionEvent;
                this.f2824o = false;
                if (this.f2812c.f2844l != null) {
                    RectF f = this.f2812c.f2844l.mo4854f(this.f2810a, rectF);
                    if (f == null || f.contains(this.f2823n.getX(), this.f2823n.getY())) {
                        RectF p = this.f2812c.f2844l.mo4864p(this.f2810a, rectF);
                        if (p == null || p.contains(this.f2823n.getX(), this.f2823n.getY())) {
                            this.f2825p = false;
                        } else {
                            this.f2825p = true;
                        }
                        this.f2812c.f2844l.mo4871v(this.f2829t, this.f2830u);
                        return;
                    }
                    this.f2823n = null;
                    this.f2824o = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f2824o) {
                float rawY = motionEvent.getRawY() - this.f2830u;
                float rawX = motionEvent.getRawX() - this.f2829t;
                if ((((double) rawX) != Utils.DOUBLE_EPSILON || ((double) rawY) != Utils.DOUBLE_EPSILON) && (motionEvent2 = this.f2823n) != null) {
                    C0509b i2 = mo4810i(i, rawX, rawY, motionEvent2);
                    if (i2 != null) {
                        motionLayout.setTransition(i2);
                        RectF p2 = this.f2812c.f2844l.mo4864p(this.f2810a, rectF);
                        if (p2 != null && !p2.contains(this.f2823n.getX(), this.f2823n.getY())) {
                            z = true;
                        }
                        this.f2825p = z;
                        this.f2812c.f2844l.mo4874y(this.f2829t, this.f2830u);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f2824o) {
            C0509b bVar = this.f2812c;
            if (!(bVar == null || bVar.f2844l == null || this.f2825p)) {
                this.f2812c.f2844l.mo4866r(motionEvent, this.f2826q, i, this);
            }
            this.f2829t = motionEvent.getRawX();
            this.f2830u = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (gVar = this.f2826q) != null) {
                gVar.mo4766a();
                this.f2826q = null;
                int i3 = motionLayout.f2748t1;
                if (i3 != -1) {
                    mo4809h(motionLayout, i3);
                }
            }
        }
    }

    /* renamed from: S */
    public final void mo4797S(int i, MotionLayout motionLayout) {
        C0532a aVar = this.f2817h.get(i);
        aVar.f3215c = aVar.f3214b;
        int i2 = this.f2819j.get(i);
        if (i2 > 0) {
            mo4797S(i2, motionLayout);
            C0532a aVar2 = this.f2817h.get(i2);
            if (aVar2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb.append(t21.m27245c(this.f2810a.getContext(), i2));
                return;
            }
            aVar.f3215c += "/" + aVar2.f3215c;
            aVar.mo5150M(aVar2);
        } else {
            aVar.f3215c += "  layout";
            aVar.mo5149L(motionLayout);
        }
        aVar.mo5154h(aVar);
    }

    /* renamed from: T */
    public void mo4798T(MotionLayout motionLayout) {
        int i = 0;
        while (i < this.f2817h.size()) {
            int keyAt = this.f2817h.keyAt(i);
            if (!mo4787I(keyAt)) {
                mo4797S(keyAt, motionLayout);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: U */
    public void mo4799U(int i, C0532a aVar) {
        this.f2817h.put(i, aVar);
    }

    /* renamed from: V */
    public void mo4800V(int i) {
        C0509b bVar = this.f2812c;
        if (bVar != null) {
            bVar.mo4833E(i);
        } else {
            this.f2821l = i;
        }
    }

    /* renamed from: W */
    public void mo4801W(boolean z) {
        this.f2827r = z;
        C0509b bVar = this.f2812c;
        if (bVar != null && bVar.f2844l != null) {
            this.f2812c.f2844l.mo4872w(this.f2827r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4802X(int r7, int r8) {
        /*
            r6 = this;
            b96 r0 = r6.f2811b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.mo11455c(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            b96 r2 = r6.f2811b
            int r2 = r2.mo11455c(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            androidx.constraintlayout.motion.widget.a$b r3 = r6.f2812c
            if (r3 == 0) goto L_0x002b
            int r3 = r3.f2835c
            if (r3 != r8) goto L_0x002b
            androidx.constraintlayout.motion.widget.a$b r3 = r6.f2812c
            int r3 = r3.f2836d
            if (r3 != r7) goto L_0x002b
            return
        L_0x002b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r6.f2814e
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.C0507a.C0509b) r4
            int r5 = r4.f2835c
            if (r5 != r2) goto L_0x0049
            int r5 = r4.f2836d
            if (r5 == r0) goto L_0x0055
        L_0x0049:
            int r5 = r4.f2835c
            if (r5 != r8) goto L_0x0031
            int r5 = r4.f2836d
            if (r5 != r7) goto L_0x0031
        L_0x0055:
            r6.f2812c = r4
            if (r4 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.b r7 = r4.f2844l
            if (r7 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.a$b r7 = r6.f2812c
            androidx.constraintlayout.motion.widget.b r7 = r7.f2844l
            boolean r8 = r6.f2827r
            r7.mo4872w(r8)
        L_0x006a:
            return
        L_0x006b:
            androidx.constraintlayout.motion.widget.a$b r7 = r6.f2815f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r6.f2816g
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.C0507a.C0509b) r4
            int r5 = r4.f2835c
            if (r5 != r8) goto L_0x0073
            r7 = r4
            goto L_0x0073
        L_0x0087:
            androidx.constraintlayout.motion.widget.a$b r8 = new androidx.constraintlayout.motion.widget.a$b
            r8.<init>(r6, r7)
            int unused = r8.f2836d = r0
            int unused = r8.f2835c = r2
            if (r0 == r1) goto L_0x0099
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r7 = r6.f2814e
            r7.add(r8)
        L_0x0099:
            r6.f2812c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0507a.mo4802X(int, int):void");
    }

    /* renamed from: Y */
    public void mo4803Y(C0509b bVar) {
        this.f2812c = bVar;
        if (bVar != null && bVar.f2844l != null) {
            this.f2812c.f2844l.mo4872w(this.f2827r);
        }
    }

    /* renamed from: Z */
    public void mo4804Z() {
        C0509b bVar = this.f2812c;
        if (bVar != null && bVar.f2844l != null) {
            this.f2812c.f2844l.mo4875z();
        }
    }

    /* renamed from: b0 */
    public boolean mo4805b0() {
        Iterator<C0509b> it = this.f2814e.iterator();
        while (it.hasNext()) {
            if (it.next().f2844l != null) {
                return true;
            }
        }
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    public void mo4806c0(int i, View... viewArr) {
        this.f2828s.mo4905i(i, viewArr);
    }

    /* renamed from: f */
    public void mo4807f(MotionLayout motionLayout, int i) {
        Iterator<C0509b> it = this.f2814e.iterator();
        while (it.hasNext()) {
            C0509b next = it.next();
            if (next.f2845m.size() > 0) {
                Iterator it2 = next.f2845m.iterator();
                while (it2.hasNext()) {
                    ((C0509b.C0510a) it2.next()).mo4847c(motionLayout);
                }
            }
        }
        Iterator<C0509b> it3 = this.f2816g.iterator();
        while (it3.hasNext()) {
            C0509b next2 = it3.next();
            if (next2.f2845m.size() > 0) {
                Iterator it4 = next2.f2845m.iterator();
                while (it4.hasNext()) {
                    ((C0509b.C0510a) it4.next()).mo4847c(motionLayout);
                }
            }
        }
        Iterator<C0509b> it5 = this.f2814e.iterator();
        while (it5.hasNext()) {
            C0509b next3 = it5.next();
            if (next3.f2845m.size() > 0) {
                Iterator it6 = next3.f2845m.iterator();
                while (it6.hasNext()) {
                    ((C0509b.C0510a) it6.next()).mo4845a(motionLayout, i, next3);
                }
            }
        }
        Iterator<C0509b> it7 = this.f2816g.iterator();
        while (it7.hasNext()) {
            C0509b next4 = it7.next();
            if (next4.f2845m.size() > 0) {
                Iterator it8 = next4.f2845m.iterator();
                while (it8.hasNext()) {
                    ((C0509b.C0510a) it8.next()).mo4845a(motionLayout, i, next4);
                }
            }
        }
    }

    /* renamed from: g */
    public boolean mo4808g(int i, jy3 jy3) {
        return this.f2828s.mo4900d(i, jy3);
    }

    /* renamed from: h */
    public boolean mo4809h(MotionLayout motionLayout, int i) {
        C0509b bVar;
        if (mo4788J() || this.f2813d) {
            return false;
        }
        Iterator<C0509b> it = this.f2814e.iterator();
        while (it.hasNext()) {
            C0509b next = it.next();
            if (next.f2846n != 0 && ((bVar = this.f2812c) != next || !bVar.mo4832D(2))) {
                if (i == next.f2836d && (next.f2846n == 4 || next.f2846n == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.f2846n == 4) {
                        motionLayout.mo4731t0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mo4666Z(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.mo4696n0();
                    }
                    return true;
                } else if (i == next.f2835c && (next.f2846n == 3 || next.f2846n == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.f2846n == 3) {
                        motionLayout.mo4734v0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(Utils.FLOAT_EPSILON);
                        motionLayout.mo4666Z(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.mo4696n0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public C0509b mo4810i(int i, float f, float f2, MotionEvent motionEvent) {
        RectF f3;
        float f4;
        int i2 = i;
        float f5 = f;
        float f6 = f2;
        if (i2 == -1) {
            return this.f2812c;
        }
        List<C0509b> H = mo4786H(i);
        float f7 = Utils.FLOAT_EPSILON;
        C0509b bVar = null;
        RectF rectF = new RectF();
        for (C0509b next : H) {
            if (!next.f2847o && next.f2844l != null) {
                next.f2844l.mo4872w(this.f2827r);
                RectF p = next.f2844l.mo4864p(this.f2810a, rectF);
                if ((p == null || motionEvent == null || p.contains(motionEvent.getX(), motionEvent.getY())) && ((f3 = next.f2844l.mo4854f(this.f2810a, rectF)) == null || motionEvent == null || f3.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a = next.f2844l.mo4849a(f5, f6);
                    if (next.f2844l.f2873l && motionEvent != null) {
                        float x = motionEvent.getX() - next.f2844l.f2870i;
                        float y = motionEvent.getY() - next.f2844l.f2871j;
                        a = ((float) (Math.atan2((double) (f6 + y), (double) (f5 + x)) - Math.atan2((double) x, (double) y))) * 10.0f;
                    }
                    if (next.f2835c == i2) {
                        f4 = -1.0f;
                    } else {
                        f4 = 1.1f;
                    }
                    float f8 = a * f4;
                    if (f8 > f7) {
                        bVar = next;
                        f7 = f8;
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: j */
    public int mo4811j() {
        C0509b bVar = this.f2812c;
        if (bVar != null) {
            return bVar.f2848p;
        }
        return -1;
    }

    /* renamed from: k */
    public int mo4812k() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return 0;
        }
        return this.f2812c.f2844l.mo4852d();
    }

    /* renamed from: l */
    public C0532a mo4813l(int i) {
        return mo4814m(i, -1, -1);
    }

    /* renamed from: m */
    public C0532a mo4814m(int i, int i2, int i3) {
        int c;
        if (this.f2820k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f2817h.size());
        }
        b96 b96 = this.f2811b;
        if (!(b96 == null || (c = b96.mo11455c(i, i2, i3)) == -1)) {
            i = c;
        }
        if (this.f2817h.get(i) != null) {
            return this.f2817h.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Warning could not find ConstraintSet id/");
        sb.append(t21.m27245c(this.f2810a.getContext(), i));
        sb.append(" In MotionScene");
        SparseArray<C0532a> sparseArray = this.f2817h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: n */
    public int[] mo4815n() {
        int size = this.f2817h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f2817h.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: o */
    public ArrayList<C0509b> mo4816o() {
        return this.f2814e;
    }

    /* renamed from: p */
    public int mo4817p() {
        C0509b bVar = this.f2812c;
        if (bVar != null) {
            return bVar.f2840h;
        }
        return this.f2821l;
    }

    /* renamed from: q */
    public int mo4818q() {
        C0509b bVar = this.f2812c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2835c;
    }

    /* renamed from: r */
    public final int mo4819r(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f2820k) {
                System.out.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i != -1 || str.length() <= 1) {
            return i;
        }
        return Integer.parseInt(str.substring(1));
    }

    /* renamed from: s */
    public Interpolator mo4820s() {
        int g = this.f2812c.f2837e;
        if (g == -2) {
            return AnimationUtils.loadInterpolator(this.f2810a.getContext(), this.f2812c.f2839g);
        }
        if (g == -1) {
            return new C0508a(ym1.m30704c(this.f2812c.f2838f));
        }
        if (g == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g == 1) {
            return new AccelerateInterpolator();
        }
        if (g == 2) {
            return new DecelerateInterpolator();
        }
        if (g == 4) {
            return new BounceInterpolator();
        }
        if (g == 5) {
            return new OvershootInterpolator();
        }
        if (g != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: t */
    public void mo4821t(jy3 jy3) {
        C0509b bVar = this.f2812c;
        if (bVar == null) {
            C0509b bVar2 = this.f2815f;
            if (bVar2 != null) {
                Iterator it = bVar2.f2843k.iterator();
                while (it.hasNext()) {
                    ((na3) it.next()).mo23635b(jy3);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f2843k.iterator();
        while (it2.hasNext()) {
            ((na3) it2.next()).mo23635b(jy3);
        }
    }

    /* renamed from: u */
    public float mo4822u() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f2812c.f2844l.mo4855g();
    }

    /* renamed from: v */
    public float mo4823v() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f2812c.f2844l.mo4856h();
    }

    /* renamed from: w */
    public boolean mo4824w() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return false;
        }
        return this.f2812c.f2844l.mo4857i();
    }

    /* renamed from: x */
    public float mo4825x(float f, float f2) {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f2812c.f2844l.mo4858j(f, f2);
    }

    /* renamed from: y */
    public final int mo4826y(int i) {
        int c;
        b96 b96 = this.f2811b;
        if (b96 == null || (c = b96.mo11455c(i, -1, -1)) == -1) {
            return i;
        }
        return c;
    }

    /* renamed from: z */
    public int mo4827z() {
        C0509b bVar = this.f2812c;
        if (bVar == null || bVar.f2844l == null) {
            return 0;
        }
        return this.f2812c.f2844l.mo4859k();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.a$b */
    /* compiled from: MotionScene */
    public static class C0509b {

        /* renamed from: a */
        public int f2833a = -1;

        /* renamed from: b */
        public boolean f2834b = false;

        /* renamed from: c */
        public int f2835c = -1;

        /* renamed from: d */
        public int f2836d = -1;

        /* renamed from: e */
        public int f2837e = 0;

        /* renamed from: f */
        public String f2838f = null;

        /* renamed from: g */
        public int f2839g = -1;

        /* renamed from: h */
        public int f2840h = 400;

        /* renamed from: i */
        public float f2841i = Utils.FLOAT_EPSILON;

        /* renamed from: j */
        public final C0507a f2842j;

        /* renamed from: k */
        public ArrayList<na3> f2843k = new ArrayList<>();

        /* renamed from: l */
        public C0511b f2844l = null;

        /* renamed from: m */
        public ArrayList<C0510a> f2845m = new ArrayList<>();

        /* renamed from: n */
        public int f2846n = 0;

        /* renamed from: o */
        public boolean f2847o = false;

        /* renamed from: p */
        public int f2848p = -1;

        /* renamed from: q */
        public int f2849q = 0;

        /* renamed from: r */
        public int f2850r = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a */
        /* compiled from: MotionScene */
        public static class C0510a implements View.OnClickListener {

            /* renamed from: a */
            public final C0509b f2851a;

            /* renamed from: d */
            public int f2852d = -1;

            /* renamed from: e */
            public int f2853e = 17;

            public C0510a(Context context, C0509b bVar, XmlPullParser xmlPullParser) {
                this.f2851a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == c65.OnClick_targetId) {
                        this.f2852d = obtainStyledAttributes.getResourceId(index, this.f2852d);
                    } else if (index == c65.OnClick_clickAction) {
                        this.f2853e = obtainStyledAttributes.getInt(index, this.f2853e);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public void mo4845a(MotionLayout motionLayout, int i, C0509b bVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.f2852d;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnClick could not find id ");
                    sb.append(this.f2852d);
                    return;
                }
                int c = bVar.f2836d;
                int a = bVar.f2835c;
                if (c == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i3 = this.f2853e;
                boolean z5 = false;
                if ((i3 & 1) == 0 || i != c) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i3 & 256) == 0 || i != c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean z6 = z | z2;
                if ((i3 & 1) == 0 || i != c) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean z7 = z3 | z6;
                if ((i3 & 16) == 0 || i != a) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z8 = z7 | z4;
                if ((i3 & 4096) != 0 && i == a) {
                    z5 = true;
                }
                if (z8 || z5) {
                    view.setOnClickListener(this);
                }
            }

            /* renamed from: b */
            public boolean mo4846b(C0509b bVar, MotionLayout motionLayout) {
                C0509b bVar2 = this.f2851a;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = bVar2.f2835c;
                int c = this.f2851a.f2836d;
                if (c != -1) {
                    int i = motionLayout.f2748t1;
                    if (i == c || i == a) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.f2748t1 != a) {
                    return true;
                } else {
                    return false;
                }
            }

            /* renamed from: c */
            public void mo4847c(MotionLayout motionLayout) {
                int i = this.f2852d;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(" (*)  could not find id ");
                        sb.append(this.f2852d);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    androidx.constraintlayout.motion.widget.a$b r8 = r7.f2851a
                    androidx.constraintlayout.motion.widget.a r8 = r8.f2842j
                    androidx.constraintlayout.motion.widget.MotionLayout r8 = r8.f2810a
                    boolean r0 = r8.mo4693l0()
                    if (r0 != 0) goto L_0x0011
                    return
                L_0x0011:
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    int r0 = r0.f2836d
                    r1 = -1
                    if (r0 != r1) goto L_0x004a
                    int r0 = r8.getCurrentState()
                    if (r0 != r1) goto L_0x002a
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    int r0 = r0.f2835c
                    r8.mo4735w0(r0)
                    return
                L_0x002a:
                    androidx.constraintlayout.motion.widget.a$b r1 = new androidx.constraintlayout.motion.widget.a$b
                    androidx.constraintlayout.motion.widget.a$b r2 = r7.f2851a
                    androidx.constraintlayout.motion.widget.a r2 = r2.f2842j
                    androidx.constraintlayout.motion.widget.a$b r3 = r7.f2851a
                    r1.<init>(r2, r3)
                    int unused = r1.f2836d = r0
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    int r0 = r0.f2835c
                    int unused = r1.f2835c = r0
                    r8.setTransition((androidx.constraintlayout.motion.widget.C0507a.C0509b) r1)
                    r8.mo4731t0()
                    return
                L_0x004a:
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    androidx.constraintlayout.motion.widget.a r0 = r0.f2842j
                    androidx.constraintlayout.motion.widget.a$b r0 = r0.f2812c
                    int r1 = r7.f2853e
                    r2 = r1 & 1
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L_0x0061
                    r2 = r1 & 256(0x100, float:3.59E-43)
                    if (r2 == 0) goto L_0x005f
                    goto L_0x0061
                L_0x005f:
                    r2 = r3
                    goto L_0x0062
                L_0x0061:
                    r2 = r4
                L_0x0062:
                    r5 = r1 & 16
                    if (r5 != 0) goto L_0x006d
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x006b
                    goto L_0x006d
                L_0x006b:
                    r1 = r3
                    goto L_0x006e
                L_0x006d:
                    r1 = r4
                L_0x006e:
                    if (r2 == 0) goto L_0x0074
                    if (r1 == 0) goto L_0x0074
                    r5 = r4
                    goto L_0x0075
                L_0x0074:
                    r5 = r3
                L_0x0075:
                    if (r5 == 0) goto L_0x009c
                    androidx.constraintlayout.motion.widget.a$b r5 = r7.f2851a
                    androidx.constraintlayout.motion.widget.a r5 = r5.f2842j
                    androidx.constraintlayout.motion.widget.a$b r5 = r5.f2812c
                    androidx.constraintlayout.motion.widget.a$b r6 = r7.f2851a
                    if (r5 == r6) goto L_0x0086
                    r8.setTransition((androidx.constraintlayout.motion.widget.C0507a.C0509b) r6)
                L_0x0086:
                    int r5 = r8.getCurrentState()
                    int r6 = r8.getEndState()
                    if (r5 == r6) goto L_0x009d
                    float r5 = r8.getProgress()
                    r6 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                    if (r5 <= 0) goto L_0x009b
                    goto L_0x009d
                L_0x009b:
                    r1 = r3
                L_0x009c:
                    r3 = r2
                L_0x009d:
                    boolean r0 = r7.mo4846b(r0, r8)
                    if (r0 == 0) goto L_0x00e8
                    if (r3 == 0) goto L_0x00b3
                    int r0 = r7.f2853e
                    r0 = r0 & r4
                    if (r0 == 0) goto L_0x00b3
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C0507a.C0509b) r0)
                    r8.mo4731t0()
                    goto L_0x00e8
                L_0x00b3:
                    if (r1 == 0) goto L_0x00c4
                    int r0 = r7.f2853e
                    r0 = r0 & 16
                    if (r0 == 0) goto L_0x00c4
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C0507a.C0509b) r0)
                    r8.mo4734v0()
                    goto L_0x00e8
                L_0x00c4:
                    if (r3 == 0) goto L_0x00d7
                    int r0 = r7.f2853e
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto L_0x00d7
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C0507a.C0509b) r0)
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r8.setProgress(r0)
                    goto L_0x00e8
                L_0x00d7:
                    if (r1 == 0) goto L_0x00e8
                    int r0 = r7.f2853e
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L_0x00e8
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.f2851a
                    r8.setTransition((androidx.constraintlayout.motion.widget.C0507a.C0509b) r0)
                    r0 = 0
                    r8.setProgress(r0)
                L_0x00e8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0507a.C0509b.C0510a.onClick(android.view.View):void");
            }
        }

        public C0509b(C0507a aVar, C0509b bVar) {
            this.f2842j = aVar;
            this.f2840h = aVar.f2821l;
            if (bVar != null) {
                this.f2848p = bVar.f2848p;
                this.f2837e = bVar.f2837e;
                this.f2838f = bVar.f2838f;
                this.f2839g = bVar.f2839g;
                this.f2840h = bVar.f2840h;
                this.f2843k = bVar.f2843k;
                this.f2841i = bVar.f2841i;
                this.f2849q = bVar.f2849q;
            }
        }

        /* renamed from: A */
        public int mo4829A() {
            return this.f2836d;
        }

        /* renamed from: B */
        public C0511b mo4830B() {
            return this.f2844l;
        }

        /* renamed from: C */
        public boolean mo4831C() {
            return !this.f2847o;
        }

        /* renamed from: D */
        public boolean mo4832D(int i) {
            if ((i & this.f2850r) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: E */
        public void mo4833E(int i) {
            this.f2840h = Math.max(i, 8);
        }

        /* renamed from: F */
        public void mo4834F(boolean z) {
            this.f2847o = !z;
        }

        /* renamed from: G */
        public void mo4835G(int i, String str, int i2) {
            this.f2837e = i;
            this.f2838f = str;
            this.f2839g = i2;
        }

        /* renamed from: H */
        public void mo4836H(int i) {
            C0511b B = mo4830B();
            if (B != null) {
                B.mo4873x(i);
            }
        }

        /* renamed from: I */
        public void mo4837I(int i) {
            this.f2848p = i;
        }

        /* renamed from: t */
        public void mo4838t(na3 na3) {
            this.f2843k.add(na3);
        }

        /* renamed from: u */
        public void mo4839u(Context context, XmlPullParser xmlPullParser) {
            this.f2845m.add(new C0510a(context, this, xmlPullParser));
        }

        /* renamed from: v */
        public final void mo4840v(C0507a aVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == c65.Transition_constraintSetEnd) {
                    this.f2835c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2835c);
                    if ("layout".equals(resourceTypeName)) {
                        C0532a aVar2 = new C0532a();
                        aVar2.mo5146D(context, this.f2835c);
                        aVar.f2817h.append(this.f2835c, aVar2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f2835c = aVar.mo4791M(context, this.f2835c);
                    }
                } else if (index == c65.Transition_constraintSetStart) {
                    this.f2836d = typedArray.getResourceId(index, this.f2836d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f2836d);
                    if ("layout".equals(resourceTypeName2)) {
                        C0532a aVar3 = new C0532a();
                        aVar3.mo5146D(context, this.f2836d);
                        aVar.f2817h.append(this.f2836d, aVar3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f2836d = aVar.mo4791M(context, this.f2836d);
                    }
                } else if (index == c65.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f2839g = resourceId;
                        if (resourceId != -1) {
                            this.f2837e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f2838f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f2839g = typedArray.getResourceId(index, -1);
                                this.f2837e = -2;
                            } else {
                                this.f2837e = -1;
                            }
                        }
                    } else {
                        this.f2837e = typedArray.getInteger(index, this.f2837e);
                    }
                } else if (index == c65.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.f2840h);
                    this.f2840h = i3;
                    if (i3 < 8) {
                        this.f2840h = 8;
                    }
                } else if (index == c65.Transition_staggered) {
                    this.f2841i = typedArray.getFloat(index, this.f2841i);
                } else if (index == c65.Transition_autoTransition) {
                    this.f2846n = typedArray.getInteger(index, this.f2846n);
                } else if (index == c65.Transition_android_id) {
                    this.f2833a = typedArray.getResourceId(index, this.f2833a);
                } else if (index == c65.Transition_transitionDisable) {
                    this.f2847o = typedArray.getBoolean(index, this.f2847o);
                } else if (index == c65.Transition_pathMotionArc) {
                    this.f2848p = typedArray.getInteger(index, -1);
                } else if (index == c65.Transition_layoutDuringTransition) {
                    this.f2849q = typedArray.getInteger(index, 0);
                } else if (index == c65.Transition_transitionFlags) {
                    this.f2850r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f2836d == -1) {
                this.f2834b = true;
            }
        }

        /* renamed from: w */
        public final void mo4841w(C0507a aVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.Transition);
            mo4840v(aVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: x */
        public int mo4842x() {
            return this.f2846n;
        }

        /* renamed from: y */
        public int mo4843y() {
            return this.f2835c;
        }

        /* renamed from: z */
        public int mo4844z() {
            return this.f2849q;
        }

        public C0509b(int i, C0507a aVar, int i2, int i3) {
            this.f2833a = i;
            this.f2842j = aVar;
            this.f2836d = i2;
            this.f2835c = i3;
            this.f2840h = aVar.f2821l;
            this.f2849q = aVar.f2822m;
        }

        public C0509b(C0507a aVar, Context context, XmlPullParser xmlPullParser) {
            this.f2840h = aVar.f2821l;
            this.f2849q = aVar.f2822m;
            this.f2842j = aVar;
            mo4841w(aVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
