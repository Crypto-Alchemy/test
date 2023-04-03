package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.xm4;

/* renamed from: t87 */
/* compiled from: VectorDrawableCompat */
public class t87 extends s87 {

    /* renamed from: B */
    public static final PorterDuff.Mode f18036B = PorterDuff.Mode.SRC_IN;

    /* renamed from: A */
    public final Rect f18037A;

    /* renamed from: d */
    public C3347h f18038d;

    /* renamed from: e */
    public PorterDuffColorFilter f18039e;

    /* renamed from: g */
    public ColorFilter f18040g;

    /* renamed from: k */
    public boolean f18041k;

    /* renamed from: r */
    public boolean f18042r;

    /* renamed from: s */
    public Drawable.ConstantState f18043s;

    /* renamed from: x */
    public final float[] f18044x;

    /* renamed from: y */
    public final Matrix f18045y;

    /* renamed from: t87$b */
    /* compiled from: VectorDrawableCompat */
    public static class C3341b extends C3345f {
        public C3341b() {
        }

        /* renamed from: c */
        public boolean mo26321c() {
            return true;
        }

        /* renamed from: e */
        public void mo26322e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (e27.m15651j(xmlPullParser, "pathData")) {
                TypedArray k = e27.m15652k(resources, theme, attributeSet, C2474hj.f12897d);
                mo26323f(k, xmlPullParser);
                k.recycle();
            }
        }

        /* renamed from: f */
        public final void mo26323f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f18072b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f18071a = xm4.m30209d(string2);
            }
            this.f18073c = e27.m15648g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public C3341b(C3341b bVar) {
            super(bVar);
        }
    }

    /* renamed from: t87$e */
    /* compiled from: VectorDrawableCompat */
    public static abstract class C3344e {
        public C3344e() {
        }

        /* renamed from: a */
        public boolean mo26324a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo26325b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: t87$h */
    /* compiled from: VectorDrawableCompat */
    public static class C3347h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f18092a;

        /* renamed from: b */
        public C3346g f18093b;

        /* renamed from: c */
        public ColorStateList f18094c;

        /* renamed from: d */
        public PorterDuff.Mode f18095d;

        /* renamed from: e */
        public boolean f18096e;

        /* renamed from: f */
        public Bitmap f18097f;

        /* renamed from: g */
        public ColorStateList f18098g;

        /* renamed from: h */
        public PorterDuff.Mode f18099h;

        /* renamed from: i */
        public int f18100i;

        /* renamed from: j */
        public boolean f18101j;

        /* renamed from: k */
        public boolean f18102k;

        /* renamed from: l */
        public Paint f18103l;

        public C3347h(C3347h hVar) {
            this.f18094c = null;
            this.f18095d = t87.f18036B;
            if (hVar != null) {
                this.f18092a = hVar.f18092a;
                C3346g gVar = new C3346g(hVar.f18093b);
                this.f18093b = gVar;
                if (hVar.f18093b.f18080e != null) {
                    gVar.f18080e = new Paint(hVar.f18093b.f18080e);
                }
                if (hVar.f18093b.f18079d != null) {
                    this.f18093b.f18079d = new Paint(hVar.f18093b.f18079d);
                }
                this.f18094c = hVar.f18094c;
                this.f18095d = hVar.f18095d;
                this.f18096e = hVar.f18096e;
            }
        }

        /* renamed from: a */
        public boolean mo26379a(int i, int i2) {
            if (i == this.f18097f.getWidth() && i2 == this.f18097f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo26380b() {
            if (!this.f18102k && this.f18098g == this.f18094c && this.f18099h == this.f18095d && this.f18101j == this.f18096e && this.f18100i == this.f18093b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void mo26381c(int i, int i2) {
            if (this.f18097f == null || !mo26379a(i, i2)) {
                this.f18097f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f18102k = true;
            }
        }

        /* renamed from: d */
        public void mo26382d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f18097f, (Rect) null, rect, mo26383e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo26383e(ColorFilter colorFilter) {
            if (!mo26384f() && colorFilter == null) {
                return null;
            }
            if (this.f18103l == null) {
                Paint paint = new Paint();
                this.f18103l = paint;
                paint.setFilterBitmap(true);
            }
            this.f18103l.setAlpha(this.f18093b.getRootAlpha());
            this.f18103l.setColorFilter(colorFilter);
            return this.f18103l;
        }

        /* renamed from: f */
        public boolean mo26384f() {
            if (this.f18093b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean mo26385g() {
            return this.f18093b.mo26373f();
        }

        public int getChangingConfigurations() {
            return this.f18092a;
        }

        /* renamed from: h */
        public boolean mo26387h(int[] iArr) {
            boolean g = this.f18093b.mo26374g(iArr);
            this.f18102k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo26388i() {
            this.f18098g = this.f18094c;
            this.f18099h = this.f18095d;
            this.f18100i = this.f18093b.getRootAlpha();
            this.f18101j = this.f18096e;
            this.f18102k = false;
        }

        /* renamed from: j */
        public void mo26389j(int i, int i2) {
            this.f18097f.eraseColor(0);
            this.f18093b.mo26369b(new Canvas(this.f18097f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new t87(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new t87(this);
        }

        public C3347h() {
            this.f18094c = null;
            this.f18095d = t87.f18036B;
            this.f18093b = new C3346g();
        }
    }

    public t87() {
        this.f18042r = true;
        this.f18044x = new float[9];
        this.f18045y = new Matrix();
        this.f18037A = new Rect();
        this.f18038d = new C3347h();
    }

    /* renamed from: a */
    public static int m27601a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.t87 m27602b(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            t87 r0 = new t87
            r0.<init>()
            android.graphics.drawable.Drawable r4 = p000.uf5.m28223f(r4, r5, r6)
            r0.f17528a = r4
            t87$i r4 = new t87$i
            android.graphics.drawable.Drawable r5 = r0.f17528a
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f18043s = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            t87 r4 = m27603c(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0041:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t87.m27602b(android.content.res.Resources, int, android.content.res.Resources$Theme):t87");
    }

    /* renamed from: c */
    public static t87 m27603c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        t87 t87 = new t87();
        t87.inflate(resources, xmlPullParser, attributeSet, theme);
        return t87;
    }

    /* renamed from: g */
    public static PorterDuff.Mode m27604g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f17528a;
        if (drawable == null) {
            return false;
        }
        ij1.m19643b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public Object mo26290d(String str) {
        return this.f18038d.f18093b.f18091p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f18037A);
        if (this.f18037A.width() > 0 && this.f18037A.height() > 0) {
            ColorFilter colorFilter = this.f18040g;
            if (colorFilter == null) {
                colorFilter = this.f18039e;
            }
            canvas.getMatrix(this.f18045y);
            this.f18045y.getValues(this.f18044x);
            float abs = Math.abs(this.f18044x[0]);
            float abs2 = Math.abs(this.f18044x[4]);
            float abs3 = Math.abs(this.f18044x[1]);
            float abs4 = Math.abs(this.f18044x[3]);
            if (!(abs3 == Utils.FLOAT_EPSILON && abs4 == Utils.FLOAT_EPSILON)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f18037A.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f18037A.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f18037A;
                canvas.translate((float) rect.left, (float) rect.top);
                if (mo26293f()) {
                    canvas.translate((float) this.f18037A.width(), Utils.FLOAT_EPSILON);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f18037A.offsetTo(0, 0);
                this.f18038d.mo26381c(min, min2);
                if (!this.f18042r) {
                    this.f18038d.mo26389j(min, min2);
                } else if (!this.f18038d.mo26380b()) {
                    this.f18038d.mo26389j(min, min2);
                    this.f18038d.mo26388i();
                }
                this.f18038d.mo26382d(canvas, colorFilter, this.f18037A);
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: e */
    public final void mo26292e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3347h hVar = this.f18038d;
        C3346g gVar = hVar.f18093b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f18083h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C3343d dVar = (C3343d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C3342c cVar = new C3342c();
                    cVar.mo26328g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f18059b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f18091p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f18092a = cVar.f18074d | hVar.f18092a;
                } else if ("clip-path".equals(name)) {
                    C3341b bVar = new C3341b();
                    bVar.mo26322e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f18059b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f18091p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f18092a = bVar.f18074d | hVar.f18092a;
                } else if ("group".equals(name)) {
                    C3343d dVar2 = new C3343d();
                    dVar2.mo26346c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f18059b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f18091p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f18092a = dVar2.f18068k | hVar.f18092a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    public final boolean mo26293f() {
        if (!isAutoMirrored() || ij1.m19647f(this) != 1) {
            return false;
        }
        return true;
    }

    public int getAlpha() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ij1.m19645d(drawable);
        }
        return this.f18038d.f18093b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f18038d.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ij1.m19646e(drawable);
        }
        return this.f18040g;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f17528a != null && Build.VERSION.SDK_INT >= 24) {
            return new C3348i(this.f17528a.getConstantState());
        }
        this.f18038d.f18092a = getChangingConfigurations();
        return this.f18038d;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f18038d.f18093b.f18085j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f18038d.f18093b.f18084i;
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
        return -3;
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

    /* renamed from: h */
    public void mo26301h(boolean z) {
        this.f18042r = z;
    }

    /* renamed from: i */
    public final void mo26302i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C3347h hVar = this.f18038d;
        C3346g gVar = hVar.f18093b;
        hVar.f18095d = m27604g(e27.m15648g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = e27.m15644c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f18094c = c;
        }
        hVar.f18096e = e27.m15642a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f18096e);
        gVar.f18086k = e27.m15647f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f18086k);
        float f = e27.m15647f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f18087l);
        gVar.f18087l = f;
        if (gVar.f18086k <= Utils.FLOAT_EPSILON) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > Utils.FLOAT_EPSILON) {
            gVar.f18084i = typedArray.getDimension(3, gVar.f18084i);
            float dimension = typedArray.getDimension(2, gVar.f18085j);
            gVar.f18085j = dimension;
            if (gVar.f18084i <= Utils.FLOAT_EPSILON) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > Utils.FLOAT_EPSILON) {
                gVar.setAlpha(e27.m15647f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f18089n = string;
                    gVar.f18091p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return ij1.m19649h(drawable);
        }
        return this.f18038d.f18096e;
    }

    public boolean isStateful() {
        C3347h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful() || ((hVar = this.f18038d) != null && (hVar.mo26385g() || ((colorStateList = this.f18038d.f18094c) != null && colorStateList.isStateful())))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public PorterDuffColorFilter mo26308j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f18041k && super.mutate() == this) {
            this.f18038d = new C3347h(this.f18038d);
            this.f18041k = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C3347h hVar = this.f18038d;
        ColorStateList colorStateList = hVar.f18094c;
        if (!(colorStateList == null || (mode = hVar.f18095d) == null)) {
            this.f18039e = mo26308j(this.f18039e, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo26385g() || !hVar.mo26387h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f18038d.f18093b.getRootAlpha() != i) {
            this.f18038d.f18093b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19651j(drawable, z);
        } else {
            this.f18038d.f18096e = z;
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
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19656o(drawable, colorStateList);
            return;
        }
        C3347h hVar = this.f18038d;
        if (hVar.f18094c != colorStateList) {
            hVar.f18094c = colorStateList;
            this.f18039e = mo26308j(this.f18039e, colorStateList, hVar.f18095d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19657p(drawable, mode);
            return;
        }
        C3347h hVar = this.f18038d;
        if (hVar.f18095d != mode) {
            hVar.f18095d = mode;
            this.f18039e = mo26308j(this.f18039e, hVar.f18094c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: t87$i */
    /* compiled from: VectorDrawableCompat */
    public static class C3348i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f18104a;

        public C3348i(Drawable.ConstantState constantState) {
            this.f18104a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f18104a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f18104a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            t87 t87 = new t87();
            t87.f17528a = (VectorDrawable) this.f18104a.newDrawable();
            return t87;
        }

        public Drawable newDrawable(Resources resources) {
            t87 t87 = new t87();
            t87.f17528a = (VectorDrawable) this.f18104a.newDrawable(resources);
            return t87;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            t87 t87 = new t87();
            t87.f17528a = (VectorDrawable) this.f18104a.newDrawable(resources, theme);
            return t87;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f18040g = colorFilter;
        invalidateSelf();
    }

    /* renamed from: t87$f */
    /* compiled from: VectorDrawableCompat */
    public static abstract class C3345f extends C3344e {

        /* renamed from: a */
        public xm4.C3631b[] f18071a = null;

        /* renamed from: b */
        public String f18072b;

        /* renamed from: c */
        public int f18073c = 0;

        /* renamed from: d */
        public int f18074d;

        public C3345f() {
            super();
        }

        /* renamed from: c */
        public boolean mo26321c() {
            return false;
        }

        /* renamed from: d */
        public void mo26365d(Path path) {
            path.reset();
            xm4.C3631b[] bVarArr = this.f18071a;
            if (bVarArr != null) {
                xm4.C3631b.m30219e(bVarArr, path);
            }
        }

        public xm4.C3631b[] getPathData() {
            return this.f18071a;
        }

        public String getPathName() {
            return this.f18072b;
        }

        public void setPathData(xm4.C3631b[] bVarArr) {
            if (!xm4.m30207b(this.f18071a, bVarArr)) {
                this.f18071a = xm4.m30211f(bVarArr);
            } else {
                xm4.m30215j(this.f18071a, bVarArr);
            }
        }

        public C3345f(C3345f fVar) {
            super();
            this.f18072b = fVar.f18072b;
            this.f18074d = fVar.f18074d;
            this.f18071a = xm4.m30211f(fVar.f18071a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f17528a;
        if (drawable != null) {
            ij1.m19648g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3347h hVar = this.f18038d;
        hVar.f18093b = new C3346g();
        TypedArray k = e27.m15652k(resources, theme, attributeSet, C2474hj.f12894a);
        mo26302i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f18092a = getChangingConfigurations();
        hVar.f18102k = true;
        mo26292e(resources, xmlPullParser, attributeSet, theme);
        this.f18039e = mo26308j(this.f18039e, hVar.f18094c, hVar.f18095d);
    }

    public t87(C3347h hVar) {
        this.f18042r = true;
        this.f18044x = new float[9];
        this.f18045y = new Matrix();
        this.f18037A = new Rect();
        this.f18038d = hVar;
        this.f18039e = mo26308j(this.f18039e, hVar.f18094c, hVar.f18095d);
    }

    /* renamed from: t87$c */
    /* compiled from: VectorDrawableCompat */
    public static class C3342c extends C3345f {

        /* renamed from: e */
        public int[] f18046e;

        /* renamed from: f */
        public pm0 f18047f;

        /* renamed from: g */
        public float f18048g = Utils.FLOAT_EPSILON;

        /* renamed from: h */
        public pm0 f18049h;

        /* renamed from: i */
        public float f18050i = 1.0f;

        /* renamed from: j */
        public float f18051j = 1.0f;

        /* renamed from: k */
        public float f18052k = Utils.FLOAT_EPSILON;

        /* renamed from: l */
        public float f18053l = 1.0f;

        /* renamed from: m */
        public float f18054m = Utils.FLOAT_EPSILON;

        /* renamed from: n */
        public Paint.Cap f18055n = Paint.Cap.BUTT;

        /* renamed from: o */
        public Paint.Join f18056o = Paint.Join.MITER;

        /* renamed from: p */
        public float f18057p = 4.0f;

        public C3342c() {
        }

        /* renamed from: a */
        public boolean mo26324a() {
            if (this.f18049h.mo24648i() || this.f18047f.mo24648i()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo26325b(int[] iArr) {
            return this.f18047f.mo24649j(iArr) | this.f18049h.mo24649j(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap mo26326e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i == 1) {
                return Paint.Cap.ROUND;
            }
            if (i != 2) {
                return cap;
            }
            return Paint.Cap.SQUARE;
        }

        /* renamed from: f */
        public final Paint.Join mo26327f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i == 1) {
                return Paint.Join.ROUND;
            }
            if (i != 2) {
                return join;
            }
            return Paint.Join.BEVEL;
        }

        /* renamed from: g */
        public void mo26328g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = e27.m15652k(resources, theme, attributeSet, C2474hj.f12896c);
            mo26337h(k, xmlPullParser, theme);
            k.recycle();
        }

        public float getFillAlpha() {
            return this.f18051j;
        }

        public int getFillColor() {
            return this.f18049h.mo24645e();
        }

        public float getStrokeAlpha() {
            return this.f18050i;
        }

        public int getStrokeColor() {
            return this.f18047f.mo24645e();
        }

        public float getStrokeWidth() {
            return this.f18048g;
        }

        public float getTrimPathEnd() {
            return this.f18053l;
        }

        public float getTrimPathOffset() {
            return this.f18054m;
        }

        public float getTrimPathStart() {
            return this.f18052k;
        }

        /* renamed from: h */
        public final void mo26337h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f18046e = null;
            if (e27.m15651j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f18072b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f18071a = xm4.m30209d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f18049h = e27.m15646e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f18051j = e27.m15647f(typedArray, xmlPullParser, "fillAlpha", 12, this.f18051j);
                this.f18055n = mo26326e(e27.m15648g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f18055n);
                this.f18056o = mo26327f(e27.m15648g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f18056o);
                this.f18057p = e27.m15647f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f18057p);
                this.f18047f = e27.m15646e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f18050i = e27.m15647f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f18050i);
                this.f18048g = e27.m15647f(typedArray, xmlPullParser, "strokeWidth", 4, this.f18048g);
                this.f18053l = e27.m15647f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f18053l);
                this.f18054m = e27.m15647f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f18054m);
                this.f18052k = e27.m15647f(typedArray, xmlPullParser, "trimPathStart", 5, this.f18052k);
                this.f18073c = e27.m15648g(typedArray, xmlPullParser, "fillType", 13, this.f18073c);
            }
        }

        public void setFillAlpha(float f) {
            this.f18051j = f;
        }

        public void setFillColor(int i) {
            this.f18049h.mo24650k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f18050i = f;
        }

        public void setStrokeColor(int i) {
            this.f18047f.mo24650k(i);
        }

        public void setStrokeWidth(float f) {
            this.f18048g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f18053l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f18054m = f;
        }

        public void setTrimPathStart(float f) {
            this.f18052k = f;
        }

        public C3342c(C3342c cVar) {
            super(cVar);
            this.f18046e = cVar.f18046e;
            this.f18047f = cVar.f18047f;
            this.f18048g = cVar.f18048g;
            this.f18050i = cVar.f18050i;
            this.f18049h = cVar.f18049h;
            this.f18073c = cVar.f18073c;
            this.f18051j = cVar.f18051j;
            this.f18052k = cVar.f18052k;
            this.f18053l = cVar.f18053l;
            this.f18054m = cVar.f18054m;
            this.f18055n = cVar.f18055n;
            this.f18056o = cVar.f18056o;
            this.f18057p = cVar.f18057p;
        }
    }

    /* renamed from: t87$g */
    /* compiled from: VectorDrawableCompat */
    public static class C3346g {

        /* renamed from: q */
        public static final Matrix f18075q = new Matrix();

        /* renamed from: a */
        public final Path f18076a;

        /* renamed from: b */
        public final Path f18077b;

        /* renamed from: c */
        public final Matrix f18078c;

        /* renamed from: d */
        public Paint f18079d;

        /* renamed from: e */
        public Paint f18080e;

        /* renamed from: f */
        public PathMeasure f18081f;

        /* renamed from: g */
        public int f18082g;

        /* renamed from: h */
        public final C3343d f18083h;

        /* renamed from: i */
        public float f18084i;

        /* renamed from: j */
        public float f18085j;

        /* renamed from: k */
        public float f18086k;

        /* renamed from: l */
        public float f18087l;

        /* renamed from: m */
        public int f18088m;

        /* renamed from: n */
        public String f18089n;

        /* renamed from: o */
        public Boolean f18090o;

        /* renamed from: p */
        public final C2781lq<String, Object> f18091p;

        public C3346g() {
            this.f18078c = new Matrix();
            this.f18084i = Utils.FLOAT_EPSILON;
            this.f18085j = Utils.FLOAT_EPSILON;
            this.f18086k = Utils.FLOAT_EPSILON;
            this.f18087l = Utils.FLOAT_EPSILON;
            this.f18088m = 255;
            this.f18089n = null;
            this.f18090o = null;
            this.f18091p = new C2781lq<>();
            this.f18083h = new C3343d();
            this.f18076a = new Path();
            this.f18077b = new Path();
        }

        /* renamed from: a */
        public static float m27629a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: b */
        public void mo26369b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            mo26370c(this.f18083h, f18075q, canvas, i, i2, colorFilter);
        }

        /* renamed from: c */
        public final void mo26370c(C3343d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f18058a.set(matrix);
            dVar.f18058a.preConcat(dVar.f18067j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f18059b.size(); i3++) {
                C3344e eVar = dVar.f18059b.get(i3);
                if (eVar instanceof C3343d) {
                    mo26370c((C3343d) eVar, dVar.f18058a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C3345f) {
                    mo26371d(dVar, (C3345f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void mo26371d(C3343d dVar, C3345f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = ((float) i) / this.f18086k;
            float f2 = ((float) i2) / this.f18087l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f18058a;
            this.f18078c.set(matrix);
            this.f18078c.postScale(f, f2);
            float e = mo26372e(matrix);
            if (e != Utils.FLOAT_EPSILON) {
                fVar.mo26365d(this.f18076a);
                Path path = this.f18076a;
                this.f18077b.reset();
                if (fVar.mo26321c()) {
                    Path path2 = this.f18077b;
                    if (fVar.f18073c == 0) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                    this.f18077b.addPath(path, this.f18078c);
                    canvas.clipPath(this.f18077b);
                    return;
                }
                C3342c cVar = (C3342c) fVar;
                float f3 = cVar.f18052k;
                if (!(f3 == Utils.FLOAT_EPSILON && cVar.f18053l == 1.0f)) {
                    float f4 = cVar.f18054m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f18053l + f4) % 1.0f;
                    if (this.f18081f == null) {
                        this.f18081f = new PathMeasure();
                    }
                    this.f18081f.setPath(this.f18076a, false);
                    float length = this.f18081f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f18081f.getSegment(f7, length, path, true);
                        this.f18081f.getSegment(Utils.FLOAT_EPSILON, f8, path, true);
                    } else {
                        this.f18081f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                this.f18077b.addPath(path, this.f18078c);
                if (cVar.f18049h.mo24651l()) {
                    pm0 pm0 = cVar.f18049h;
                    if (this.f18080e == null) {
                        Paint paint = new Paint(1);
                        this.f18080e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f18080e;
                    if (pm0.mo24647h()) {
                        Shader f9 = pm0.mo24646f();
                        f9.setLocalMatrix(this.f18078c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f18051j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(t87.m27601a(pm0.mo24645e(), cVar.f18051j));
                    }
                    paint2.setColorFilter(colorFilter);
                    Path path3 = this.f18077b;
                    if (cVar.f18073c == 0) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    path3.setFillType(fillType);
                    canvas.drawPath(this.f18077b, paint2);
                }
                if (cVar.f18047f.mo24651l()) {
                    pm0 pm02 = cVar.f18047f;
                    if (this.f18079d == null) {
                        Paint paint3 = new Paint(1);
                        this.f18079d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f18079d;
                    Paint.Join join = cVar.f18056o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f18055n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f18057p);
                    if (pm02.mo24647h()) {
                        Shader f10 = pm02.mo24646f();
                        f10.setLocalMatrix(this.f18078c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f18050i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(t87.m27601a(pm02.mo24645e(), cVar.f18050i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f18048g * min * e);
                    canvas.drawPath(this.f18077b, paint4);
                }
            }
        }

        /* renamed from: e */
        public final float mo26372e(Matrix matrix) {
            float[] fArr = {Utils.FLOAT_EPSILON, 1.0f, 1.0f, Utils.FLOAT_EPSILON};
            matrix.mapVectors(fArr);
            float a = m27629a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > Utils.FLOAT_EPSILON) {
                return Math.abs(a) / max;
            }
            return Utils.FLOAT_EPSILON;
        }

        /* renamed from: f */
        public boolean mo26373f() {
            if (this.f18090o == null) {
                this.f18090o = Boolean.valueOf(this.f18083h.mo26324a());
            }
            return this.f18090o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo26374g(int[] iArr) {
            return this.f18083h.mo26325b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f18088m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f18088m = i;
        }

        public C3346g(C3346g gVar) {
            this.f18078c = new Matrix();
            this.f18084i = Utils.FLOAT_EPSILON;
            this.f18085j = Utils.FLOAT_EPSILON;
            this.f18086k = Utils.FLOAT_EPSILON;
            this.f18087l = Utils.FLOAT_EPSILON;
            this.f18088m = 255;
            this.f18089n = null;
            this.f18090o = null;
            C2781lq<String, Object> lqVar = new C2781lq<>();
            this.f18091p = lqVar;
            this.f18083h = new C3343d(gVar.f18083h, lqVar);
            this.f18076a = new Path(gVar.f18076a);
            this.f18077b = new Path(gVar.f18077b);
            this.f18084i = gVar.f18084i;
            this.f18085j = gVar.f18085j;
            this.f18086k = gVar.f18086k;
            this.f18087l = gVar.f18087l;
            this.f18082g = gVar.f18082g;
            this.f18088m = gVar.f18088m;
            this.f18089n = gVar.f18089n;
            String str = gVar.f18089n;
            if (str != null) {
                lqVar.put(str, this);
            }
            this.f18090o = gVar.f18090o;
        }
    }

    /* renamed from: t87$d */
    /* compiled from: VectorDrawableCompat */
    public static class C3343d extends C3344e {

        /* renamed from: a */
        public final Matrix f18058a;

        /* renamed from: b */
        public final ArrayList<C3344e> f18059b;

        /* renamed from: c */
        public float f18060c;

        /* renamed from: d */
        public float f18061d;

        /* renamed from: e */
        public float f18062e;

        /* renamed from: f */
        public float f18063f;

        /* renamed from: g */
        public float f18064g;

        /* renamed from: h */
        public float f18065h;

        /* renamed from: i */
        public float f18066i;

        /* renamed from: j */
        public final Matrix f18067j;

        /* renamed from: k */
        public int f18068k;

        /* renamed from: l */
        public int[] f18069l;

        /* renamed from: m */
        public String f18070m;

        public C3343d(C3343d dVar, C2781lq<String, Object> lqVar) {
            super();
            C3345f fVar;
            this.f18058a = new Matrix();
            this.f18059b = new ArrayList<>();
            this.f18060c = Utils.FLOAT_EPSILON;
            this.f18061d = Utils.FLOAT_EPSILON;
            this.f18062e = Utils.FLOAT_EPSILON;
            this.f18063f = 1.0f;
            this.f18064g = 1.0f;
            this.f18065h = Utils.FLOAT_EPSILON;
            this.f18066i = Utils.FLOAT_EPSILON;
            Matrix matrix = new Matrix();
            this.f18067j = matrix;
            this.f18070m = null;
            this.f18060c = dVar.f18060c;
            this.f18061d = dVar.f18061d;
            this.f18062e = dVar.f18062e;
            this.f18063f = dVar.f18063f;
            this.f18064g = dVar.f18064g;
            this.f18065h = dVar.f18065h;
            this.f18066i = dVar.f18066i;
            this.f18069l = dVar.f18069l;
            String str = dVar.f18070m;
            this.f18070m = str;
            this.f18068k = dVar.f18068k;
            if (str != null) {
                lqVar.put(str, this);
            }
            matrix.set(dVar.f18067j);
            ArrayList<C3344e> arrayList = dVar.f18059b;
            for (int i = 0; i < arrayList.size(); i++) {
                C3344e eVar = arrayList.get(i);
                if (eVar instanceof C3343d) {
                    this.f18059b.add(new C3343d((C3343d) eVar, lqVar));
                } else {
                    if (eVar instanceof C3342c) {
                        fVar = new C3342c((C3342c) eVar);
                    } else if (eVar instanceof C3341b) {
                        fVar = new C3341b((C3341b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f18059b.add(fVar);
                    String str2 = fVar.f18072b;
                    if (str2 != null) {
                        lqVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo26324a() {
            for (int i = 0; i < this.f18059b.size(); i++) {
                if (this.f18059b.get(i).mo26324a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo26325b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f18059b.size(); i++) {
                z |= this.f18059b.get(i).mo26325b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo26346c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = e27.m15652k(resources, theme, attributeSet, C2474hj.f12895b);
            mo26348e(k, xmlPullParser);
            k.recycle();
        }

        /* renamed from: d */
        public final void mo26347d() {
            this.f18067j.reset();
            this.f18067j.postTranslate(-this.f18061d, -this.f18062e);
            this.f18067j.postScale(this.f18063f, this.f18064g);
            this.f18067j.postRotate(this.f18060c, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            this.f18067j.postTranslate(this.f18065h + this.f18061d, this.f18066i + this.f18062e);
        }

        /* renamed from: e */
        public final void mo26348e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f18069l = null;
            this.f18060c = e27.m15647f(typedArray, xmlPullParser, "rotation", 5, this.f18060c);
            this.f18061d = typedArray.getFloat(1, this.f18061d);
            this.f18062e = typedArray.getFloat(2, this.f18062e);
            this.f18063f = e27.m15647f(typedArray, xmlPullParser, "scaleX", 3, this.f18063f);
            this.f18064g = e27.m15647f(typedArray, xmlPullParser, "scaleY", 4, this.f18064g);
            this.f18065h = e27.m15647f(typedArray, xmlPullParser, "translateX", 6, this.f18065h);
            this.f18066i = e27.m15647f(typedArray, xmlPullParser, "translateY", 7, this.f18066i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f18070m = string;
            }
            mo26347d();
        }

        public String getGroupName() {
            return this.f18070m;
        }

        public Matrix getLocalMatrix() {
            return this.f18067j;
        }

        public float getPivotX() {
            return this.f18061d;
        }

        public float getPivotY() {
            return this.f18062e;
        }

        public float getRotation() {
            return this.f18060c;
        }

        public float getScaleX() {
            return this.f18063f;
        }

        public float getScaleY() {
            return this.f18064g;
        }

        public float getTranslateX() {
            return this.f18065h;
        }

        public float getTranslateY() {
            return this.f18066i;
        }

        public void setPivotX(float f) {
            if (f != this.f18061d) {
                this.f18061d = f;
                mo26347d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f18062e) {
                this.f18062e = f;
                mo26347d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f18060c) {
                this.f18060c = f;
                mo26347d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f18063f) {
                this.f18063f = f;
                mo26347d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f18064g) {
                this.f18064g = f;
                mo26347d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f18065h) {
                this.f18065h = f;
                mo26347d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f18066i) {
                this.f18066i = f;
                mo26347d();
            }
        }

        public C3343d() {
            super();
            this.f18058a = new Matrix();
            this.f18059b = new ArrayList<>();
            this.f18060c = Utils.FLOAT_EPSILON;
            this.f18061d = Utils.FLOAT_EPSILON;
            this.f18062e = Utils.FLOAT_EPSILON;
            this.f18063f = 1.0f;
            this.f18064g = 1.0f;
            this.f18065h = Utils.FLOAT_EPSILON;
            this.f18066i = Utils.FLOAT_EPSILON;
            this.f18067j = new Matrix();
            this.f18070m = null;
        }
    }
}
