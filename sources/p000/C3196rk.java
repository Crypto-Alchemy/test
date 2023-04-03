package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.jj1;
import p000.x86;

/* renamed from: rk */
/* compiled from: AnimatedStateListDrawableCompat */
public class C3196rk extends x86 {

    /* renamed from: X */
    public static final String f17264X = C3196rk.class.getSimpleName();

    /* renamed from: L */
    public C3199c f17265L;

    /* renamed from: M */
    public C3203g f17266M;

    /* renamed from: P */
    public int f17267P;

    /* renamed from: Q */
    public int f17268Q;

    /* renamed from: U */
    public boolean f17269U;

    /* renamed from: rk$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class C3198b extends C3203g {

        /* renamed from: a */
        public final Animatable f17270a;

        public C3198b(Animatable animatable) {
            super();
            this.f17270a = animatable;
        }

        /* renamed from: c */
        public void mo25407c() {
            this.f17270a.start();
        }

        /* renamed from: d */
        public void mo25408d() {
            this.f17270a.stop();
        }
    }

    /* renamed from: rk$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class C3199c extends x86.C3581a {

        /* renamed from: K */
        public hl3<Long> f17271K;

        /* renamed from: L */
        public j66<Integer> f17272L;

        public C3199c(C3199c cVar, C3196rk rkVar, Resources resources) {
            super(cVar, rkVar, resources);
            if (cVar != null) {
                this.f17271K = cVar.f17271K;
                this.f17272L = cVar.f17272L;
                return;
            }
            this.f17271K = new hl3<>();
            this.f17272L = new j66<>();
        }

        /* renamed from: D */
        public static long m26244D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* renamed from: B */
        public int mo25409B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo27700z(iArr, drawable);
            this.f17272L.mo21762r(z, Integer.valueOf(i));
            return z;
        }

        /* renamed from: C */
        public int mo25410C(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int a = super.mo21909a(drawable);
            long D = m26244D(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = (long) a;
            this.f17271K.mo21203a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f17271K.mo21203a(m26244D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* renamed from: E */
        public int mo25411E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f17272L.mo21757j(i, 0).intValue();
        }

        /* renamed from: F */
        public int mo25412F(int[] iArr) {
            int A = super.mo27699A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.mo27699A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        public int mo25413G(int i, int i2) {
            return (int) this.f17271K.mo21210i(m26244D(i, i2), -1L).longValue();
        }

        /* renamed from: H */
        public boolean mo25414H(int i, int i2) {
            if ((this.f17271K.mo21210i(m26244D(i, i2), -1L).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: I */
        public boolean mo25415I(int i, int i2) {
            if ((this.f17271K.mo21210i(m26244D(i, i2), -1L).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        public Drawable newDrawable() {
            return new C3196rk(this, (Resources) null);
        }

        /* renamed from: r */
        public void mo21928r() {
            this.f17271K = this.f17271K.clone();
            this.f17272L = this.f17272L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new C3196rk(this, resources);
        }
    }

    /* renamed from: rk$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class C3200d extends C3203g {

        /* renamed from: a */
        public final C3273sk f17273a;

        public C3200d(C3273sk skVar) {
            super();
            this.f17273a = skVar;
        }

        /* renamed from: c */
        public void mo25407c() {
            this.f17273a.start();
        }

        /* renamed from: d */
        public void mo25408d() {
            this.f17273a.stop();
        }
    }

    /* renamed from: rk$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class C3201e extends C3203g {

        /* renamed from: a */
        public final ObjectAnimator f17274a;

        /* renamed from: b */
        public final boolean f17275b;

        public C3201e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C3202f fVar = new C3202f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            am0.m394a(ofInt, true);
            ofInt.setDuration((long) fVar.mo25420a());
            ofInt.setInterpolator(fVar);
            this.f17275b = z2;
            this.f17274a = ofInt;
        }

        /* renamed from: a */
        public boolean mo25418a() {
            return this.f17275b;
        }

        /* renamed from: b */
        public void mo25419b() {
            this.f17274a.reverse();
        }

        /* renamed from: c */
        public void mo25407c() {
            this.f17274a.start();
        }

        /* renamed from: d */
        public void mo25408d() {
            this.f17274a.cancel();
        }
    }

    /* renamed from: rk$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class C3202f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f17276a;

        /* renamed from: b */
        public int f17277b;

        /* renamed from: c */
        public int f17278c;

        public C3202f(AnimationDrawable animationDrawable, boolean z) {
            mo25421b(animationDrawable, z);
        }

        /* renamed from: a */
        public int mo25420a() {
            return this.f17278c;
        }

        /* renamed from: b */
        public int mo25421b(AnimationDrawable animationDrawable, boolean z) {
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f17277b = numberOfFrames;
            int[] iArr = this.f17276a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f17276a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f17276a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                if (z) {
                    i = (numberOfFrames - i3) - 1;
                } else {
                    i = i3;
                }
                int duration = animationDrawable.getDuration(i);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f17278c = i2;
            return i2;
        }

        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f17278c)) + 0.5f);
            int i2 = this.f17277b;
            int[] iArr = this.f17276a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f17278c);
            } else {
                f2 = Utils.FLOAT_EPSILON;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }
    }

    /* renamed from: rk$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static abstract class C3203g {
        public C3203g() {
        }

        /* renamed from: a */
        public boolean mo25418a() {
            return false;
        }

        /* renamed from: b */
        public void mo25419b() {
        }

        /* renamed from: c */
        public abstract void mo25407c();

        /* renamed from: d */
        public abstract void mo25408d();
    }

    public C3196rk() {
        this((C3199c) null, (Resources) null);
    }

    /* renamed from: m */
    public static C3196rk m26230m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3196rk rkVar = new C3196rk();
            rkVar.mo25400n(context, resources, xmlPullParser, attributeSet, theme);
            return rkVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* renamed from: h */
    public void mo21881h(jj1.C2607d dVar) {
        super.mo21881h(dVar);
        if (dVar instanceof C3199c) {
            this.f17265L = (C3199c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C3203g gVar = this.f17266M;
        if (gVar != null) {
            gVar.mo25408d();
            this.f17266M = null;
            mo21868g(this.f17267P);
            this.f17267P = -1;
            this.f17268Q = -1;
        }
    }

    /* renamed from: l */
    public C3199c mo25398j() {
        return new C3199c(this.f17265L, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f17269U && super.mutate() == this) {
            this.f17265L.mo21928r();
            this.f17269U = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo25400n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k = e27.m15652k(resources, theme, attributeSet, s55.AnimatedStateListDrawableCompat);
        setVisible(k.getBoolean(s55.AnimatedStateListDrawableCompat_android_visible, true), true);
        mo25406t(k);
        mo21882i(resources);
        k.recycle();
        mo25401o(context, resources, xmlPullParser, attributeSet, theme);
        mo25402p();
    }

    /* renamed from: o */
    public final void mo25401o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        mo25403q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        mo25404r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        int F = this.f17265L.mo25412F(iArr);
        if (F == mo21863c() || (!mo25405s(F) && !mo21868g(F))) {
            z = false;
        } else {
            z = true;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    /* renamed from: p */
    public final void mo25402p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    public final int mo25403q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray k = e27.m15652k(resources, theme, attributeSet, s55.AnimatedStateListDrawableItem);
        int resourceId = k.getResourceId(s55.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = k.getResourceId(s55.AnimatedStateListDrawableItem_android_drawable, -1);
        if (resourceId2 > 0) {
            drawable = pf5.m24867h().mo24559j(context, resourceId2);
        } else {
            drawable = null;
        }
        k.recycle();
        int[] k2 = mo27698k(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = t87.m27603c(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = bm0.m11446a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            return this.f17265L.mo25409B(k2, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    public final int mo25404r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray k = e27.m15652k(resources, theme, attributeSet, s55.AnimatedStateListDrawableTransition);
        int resourceId = k.getResourceId(s55.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = k.getResourceId(s55.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = k.getResourceId(s55.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (resourceId3 > 0) {
            drawable = pf5.m24867h().mo24559j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = k.getBoolean(s55.AnimatedStateListDrawableTransition_android_reversible, false);
        k.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = C3273sk.m26936a(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = bm0.m11446a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f17265L.mo25410C(resourceId, resourceId2, drawable, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    public final boolean mo25405s(int i) {
        int i2;
        int G;
        C3203g gVar;
        C3203g gVar2 = this.f17266M;
        if (gVar2 == null) {
            i2 = mo21863c();
        } else if (i == this.f17267P) {
            return true;
        } else {
            if (i != this.f17268Q || !gVar2.mo25418a()) {
                i2 = this.f17267P;
                gVar2.mo25408d();
            } else {
                gVar2.mo25419b();
                this.f17267P = this.f17268Q;
                this.f17268Q = i;
                return true;
            }
        }
        this.f17266M = null;
        this.f17268Q = -1;
        this.f17267P = -1;
        C3199c cVar = this.f17265L;
        int E = cVar.mo25411E(i2);
        int E2 = cVar.mo25411E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo25413G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo25415I(E, E2);
        mo21868g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C3201e((AnimationDrawable) current, cVar.mo25414H(E, E2), I);
        } else if (current instanceof C3273sk) {
            gVar = new C3200d((C3273sk) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C3198b((Animatable) current);
            }
            return false;
        }
        gVar.mo25407c();
        this.f17266M = gVar;
        this.f17268Q = i2;
        this.f17267P = i;
        return true;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C3203g gVar = this.f17266M;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo25407c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: t */
    public final void mo25406t(TypedArray typedArray) {
        C3199c cVar = this.f17265L;
        cVar.f13646d |= bm0.m11447b(typedArray);
        cVar.mo21934x(typedArray.getBoolean(s55.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f13651i));
        cVar.mo21930t(typedArray.getBoolean(s55.AnimatedStateListDrawableCompat_android_constantSize, cVar.f13654l));
        cVar.mo21931u(typedArray.getInt(s55.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f13634A));
        cVar.mo21932v(typedArray.getInt(s55.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f13635B));
        setDither(typedArray.getBoolean(s55.AnimatedStateListDrawableCompat_android_dither, cVar.f13666x));
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C3196rk(C3199c cVar, Resources resources) {
        super((x86.C3581a) null);
        this.f17267P = -1;
        this.f17268Q = -1;
        mo21881h(new C3199c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
