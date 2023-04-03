package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: sk */
/* compiled from: AnimatedVectorDrawableCompat */
public class C3273sk extends s87 implements Animatable {

    /* renamed from: d */
    public C3276c f17683d;

    /* renamed from: e */
    public Context f17684e;

    /* renamed from: g */
    public ArgbEvaluator f17685g;

    /* renamed from: k */
    public Animator.AnimatorListener f17686k;

    /* renamed from: r */
    public ArrayList<C3681yj> f17687r;

    /* renamed from: s */
    public final Drawable.Callback f17688s;

    /* renamed from: sk$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    public class C3274a implements Drawable.Callback {
        public C3274a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C3273sk.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C3273sk.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C3273sk.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: sk$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    public class C3275b extends AnimatorListenerAdapter {
        public C3275b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C3273sk.this.f17687r);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C3681yj) arrayList.get(i)).onAnimationEnd(C3273sk.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C3273sk.this.f17687r);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C3681yj) arrayList.get(i)).onAnimationStart(C3273sk.this);
            }
        }
    }

    /* renamed from: sk$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    public static class C3276c extends Drawable.ConstantState {

        /* renamed from: a */
        public int f17691a;

        /* renamed from: b */
        public t87 f17692b;

        /* renamed from: c */
        public AnimatorSet f17693c;

        /* renamed from: d */
        public ArrayList<Animator> f17694d;

        /* renamed from: e */
        public C2781lq<Animator, String> f17695e;

        public C3276c(Context context, C3276c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f17691a = cVar.f17691a;
                t87 t87 = cVar.f17692b;
                if (t87 != null) {
                    Drawable.ConstantState constantState = t87.getConstantState();
                    if (resources != null) {
                        this.f17692b = (t87) constantState.newDrawable(resources);
                    } else {
                        this.f17692b = (t87) constantState.newDrawable();
                    }
                    t87 t872 = (t87) this.f17692b.mutate();
                    this.f17692b = t872;
                    t872.setCallback(callback);
                    this.f17692b.setBounds(cVar.f17692b.getBounds());
                    this.f17692b.mo26301h(false);
                }
                ArrayList<Animator> arrayList = cVar.f17694d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f17694d = new ArrayList<>(size);
                    this.f17695e = new C2781lq<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.f17694d.get(i);
                        Animator clone = animator.clone();
                        String str = cVar.f17695e.get(animator);
                        clone.setTarget(this.f17692b.mo26290d(str));
                        this.f17694d.add(clone);
                        this.f17695e.put(clone, str);
                    }
                    mo25844a();
                }
            }
        }

        /* renamed from: a */
        public void mo25844a() {
            if (this.f17693c == null) {
                this.f17693c = new AnimatorSet();
            }
            this.f17693c.playTogether(this.f17694d);
        }

        public int getChangingConfigurations() {
            return this.f17691a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C3273sk() {
        this((Context) null, (C3276c) null, (Resources) null);
    }

    /* renamed from: a */
    public static C3273sk m26936a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3273sk skVar = new C3273sk(context);
        skVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return skVar;
    }

    /* renamed from: c */
    public static void m26937c(Drawable drawable, C3681yj yjVar) {
        if (drawable != null && yjVar != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                m26938d((AnimatedVectorDrawable) drawable, yjVar);
            } else {
                ((C3273sk) drawable).mo25811b(yjVar);
            }
        }
    }

    /* renamed from: d */
    public static void m26938d(AnimatedVectorDrawable animatedVectorDrawable, C3681yj yjVar) {
        animatedVectorDrawable.registerAnimationCallback(yjVar.getPlatformCallback());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19642a(drawable, theme);
        }
    }

    /* renamed from: b */
    public void mo25811b(C3681yj yjVar) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            m26938d((AnimatedVectorDrawable) drawable, yjVar);
        } else if (yjVar != null) {
            if (this.f17687r == null) {
                this.f17687r = new ArrayList<>();
            }
            if (!this.f17687r.contains(yjVar)) {
                this.f17687r.add(yjVar);
                if (this.f17686k == null) {
                    this.f17686k = new C3275b();
                }
                this.f17683d.f17693c.addListener(this.f17686k);
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ij1.m19643b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f17683d.f17692b.draw(canvas);
        if (this.f17683d.f17693c.isStarted()) {
            invalidateSelf();
        }
    }

    /* renamed from: e */
    public final void mo25814e(String str, Animator animator) {
        animator.setTarget(this.f17683d.f17692b.mo26290d(str));
        C3276c cVar = this.f17683d;
        if (cVar.f17694d == null) {
            cVar.f17694d = new ArrayList<>();
            this.f17683d.f17695e = new C2781lq<>();
        }
        this.f17683d.f17694d.add(animator);
        this.f17683d.f17695e.put(animator, str);
    }

    public int getAlpha() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ij1.m19645d(drawable);
        }
        return this.f17683d.f17692b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f17683d.f17691a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ij1.m19646e(drawable);
        }
        return this.f17683d.f17692b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f17528a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C3277d(this.f17528a.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f17683d.f17692b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f17683d.f17692b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f17683d.f17692b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19648g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k = e27.m15652k(resources, theme, attributeSet, C2474hj.f12898e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        t87 b = t87.m27602b(resources, resourceId, theme);
                        b.mo26301h(false);
                        b.setCallback(this.f17688s);
                        t87 t87 = this.f17683d.f17692b;
                        if (t87 != null) {
                            t87.setCallback((Drawable.Callback) null);
                        }
                        this.f17683d.f17692b = b;
                    }
                    k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C2474hj.f12899f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f17684e;
                        if (context != null) {
                            mo25814e(string, C2476hl.m18934i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f17683d.mo25844a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ij1.m19649h(drawable);
        }
        return this.f17683d.f17692b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f17683d.f17693c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f17683d.f17692b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f17683d.f17692b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f17683d.f17692b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f17683d.f17692b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f17683d.f17692b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19651j(drawable, z);
        } else {
            this.f17683d.f17692b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19655n(drawable, i);
        } else {
            this.f17683d.f17692b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19656o(drawable, colorStateList);
        } else {
            this.f17683d.f17692b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19657p(drawable, mode);
        } else {
            this.f17683d.f17692b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f17683d.f17692b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f17683d.f17693c.isStarted()) {
            this.f17683d.f17693c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f17683d.f17693c.end();
        }
    }

    public C3273sk(Context context) {
        this(context, (C3276c) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f17683d.f17692b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: sk$d */
    /* compiled from: AnimatedVectorDrawableCompat */
    public static class C3277d extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f17696a;

        public C3277d(Drawable.ConstantState constantState) {
            this.f17696a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f17696a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f17696a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C3273sk skVar = new C3273sk();
            Drawable newDrawable = this.f17696a.newDrawable();
            skVar.f17528a = newDrawable;
            newDrawable.setCallback(skVar.f17688s);
            return skVar;
        }

        public Drawable newDrawable(Resources resources) {
            C3273sk skVar = new C3273sk();
            Drawable newDrawable = this.f17696a.newDrawable(resources);
            skVar.f17528a = newDrawable;
            newDrawable.setCallback(skVar.f17688s);
            return skVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C3273sk skVar = new C3273sk();
            Drawable newDrawable = this.f17696a.newDrawable(resources, theme);
            skVar.f17528a = newDrawable;
            newDrawable.setCallback(skVar.f17688s);
            return skVar;
        }
    }

    public C3273sk(Context context, C3276c cVar, Resources resources) {
        this.f17685g = null;
        this.f17686k = null;
        this.f17687r = null;
        C3274a aVar = new C3274a();
        this.f17688s = aVar;
        this.f17684e = context;
        if (cVar != null) {
            this.f17683d = cVar;
        } else {
            this.f17683d = new C3276c(context, cVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
