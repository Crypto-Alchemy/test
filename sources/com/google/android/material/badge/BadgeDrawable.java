package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;
import p000.jn6;

public class BadgeDrawable extends Drawable implements jn6.C6117b {

    /* renamed from: P */
    public static final int f23341P = e55.Widget_MaterialComponents_Badge;

    /* renamed from: Q */
    public static final int f23342Q = j15.badgeStyle;

    /* renamed from: A */
    public float f23343A;

    /* renamed from: B */
    public int f23344B;

    /* renamed from: C */
    public float f23345C;

    /* renamed from: H */
    public float f23346H;

    /* renamed from: I */
    public float f23347I;

    /* renamed from: L */
    public WeakReference<View> f23348L;

    /* renamed from: M */
    public WeakReference<FrameLayout> f23349M;

    /* renamed from: a */
    public final WeakReference<Context> f23350a;

    /* renamed from: d */
    public final uo3 f23351d = new uo3();

    /* renamed from: e */
    public final jn6 f23352e;

    /* renamed from: g */
    public final Rect f23353g = new Rect();

    /* renamed from: k */
    public final float f23354k;

    /* renamed from: r */
    public final float f23355r;

    /* renamed from: s */
    public final float f23356s;

    /* renamed from: x */
    public final SavedState f23357x;

    /* renamed from: y */
    public float f23358y;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    public class C4183a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f23373a;

        /* renamed from: d */
        public final /* synthetic */ FrameLayout f23374d;

        public C4183a(View view, FrameLayout frameLayout) {
            this.f23373a = view;
            this.f23374d = frameLayout;
        }

        public void run() {
            BadgeDrawable.this.mo31721F(this.f23373a, this.f23374d);
        }
    }

    public BadgeDrawable(Context context) {
        this.f23350a = new WeakReference<>(context);
        wo6.m53999c(context);
        Resources resources = context.getResources();
        this.f23354k = (float) resources.getDimensionPixelSize(k25.mtrl_badge_radius);
        this.f23356s = (float) resources.getDimensionPixelSize(k25.mtrl_badge_long_text_horizontal_padding);
        this.f23355r = (float) resources.getDimensionPixelSize(k25.mtrl_badge_with_text_radius);
        jn6 jn6 = new jn6(this);
        this.f23352e = jn6;
        jn6.mo44537e().setTextAlign(Paint.Align.CENTER);
        this.f23357x = new SavedState(context);
        mo31717A(e55.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: E */
    public static void m34634E(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: c */
    public static BadgeDrawable m34635c(Context context) {
        return m34636d(context, (AttributeSet) null, f23342Q, f23341P);
    }

    /* renamed from: d */
    public static BadgeDrawable m34636d(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.mo31740o(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    /* renamed from: e */
    public static BadgeDrawable m34637e(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.mo31741q(savedState);
        return badgeDrawable;
    }

    /* renamed from: p */
    public static int m34638p(Context context, TypedArray typedArray, int i) {
        return to3.m52391b(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: A */
    public final void mo31717A(int i) {
        Context context = this.f23350a.get();
        if (context != null) {
            mo31752z(new bn6(context, i));
        }
    }

    /* renamed from: B */
    public void mo31718B(int i) {
        int unused = this.f23357x.f23361C = i;
        mo31722G();
    }

    /* renamed from: C */
    public void mo31719C(boolean z) {
        setVisible(z, false);
        boolean unused = this.f23357x.f23359A = z;
        if (C4184a.f23376a && mo31733i() != null && !z) {
            ((ViewGroup) mo31733i().getParent()).invalidate();
        }
    }

    /* renamed from: D */
    public final void mo31720D(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != g35.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f23349M;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m34634E(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(g35.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f23349M = new WeakReference<>(frameLayout);
                frameLayout.post(new C4183a(view, frameLayout));
            }
        }
    }

    /* renamed from: F */
    public void mo31721F(View view, FrameLayout frameLayout) {
        this.f23348L = new WeakReference<>(view);
        boolean z = C4184a.f23376a;
        if (!z || frameLayout != null) {
            this.f23349M = new WeakReference<>(frameLayout);
        } else {
            mo31720D(view);
        }
        if (!z) {
            m34634E(view);
        }
        mo31722G();
        invalidateSelf();
    }

    /* renamed from: G */
    public final void mo31722G() {
        View view;
        Context context = this.f23350a.get();
        WeakReference<View> weakReference = this.f23348L;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f23353g);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f23349M;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || C4184a.f23376a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            mo31724b(context, rect2, view);
            C4184a.m34700f(this.f23353g, this.f23358y, this.f23343A, this.f23346H, this.f23347I);
            this.f23351d.mo48437X(this.f23345C);
            if (!rect.equals(this.f23353g)) {
                this.f23351d.setBounds(this.f23353g);
            }
        }
    }

    /* renamed from: H */
    public final void mo31723H() {
        this.f23344B = ((int) Math.pow(10.0d, ((double) mo31736k()) - 1.0d)) - 1;
    }

    /* renamed from: a */
    public void mo29713a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo31724b(Context context, Rect rect, View view) {
        int i;
        float f;
        float f2;
        float f3;
        int t = this.f23357x.f23361C + this.f23357x.f23363I;
        int p = this.f23357x.f23372y;
        if (p == 8388691 || p == 8388693) {
            this.f23343A = (float) (rect.bottom - t);
        } else {
            this.f23343A = (float) (rect.top + t);
        }
        if (mo31737l() <= 9) {
            if (!mo31739n()) {
                f3 = this.f23354k;
            } else {
                f3 = this.f23355r;
            }
            this.f23345C = f3;
            this.f23347I = f3;
            this.f23346H = f3;
        } else {
            float f4 = this.f23355r;
            this.f23345C = f4;
            this.f23347I = f4;
            this.f23346H = (this.f23352e.mo44538f(mo31727g()) / 2.0f) + this.f23356s;
        }
        Resources resources = context.getResources();
        if (mo31739n()) {
            i = k25.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = k25.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int r = this.f23357x.f23360B + this.f23357x.f23362H;
        int p2 = this.f23357x.f23372y;
        if (p2 == 8388659 || p2 == 8388691) {
            if (ga7.m17715B(view) == 0) {
                f = (((float) rect.left) - this.f23346H) + ((float) dimensionPixelSize) + ((float) r);
            } else {
                f = ((((float) rect.right) + this.f23346H) - ((float) dimensionPixelSize)) - ((float) r);
            }
            this.f23358y = f;
            return;
        }
        if (ga7.m17715B(view) == 0) {
            f2 = ((((float) rect.right) + this.f23346H) - ((float) dimensionPixelSize)) - ((float) r);
        } else {
            f2 = (((float) rect.left) - this.f23346H) + ((float) dimensionPixelSize) + ((float) r);
        }
        this.f23358y = f2;
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f23351d.draw(canvas);
            if (mo31739n()) {
                mo31726f(canvas);
            }
        }
    }

    /* renamed from: f */
    public final void mo31726f(Canvas canvas) {
        Rect rect = new Rect();
        String g = mo31727g();
        this.f23352e.mo44537e().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.f23358y, this.f23343A + ((float) (rect.height() / 2)), this.f23352e.mo44537e());
    }

    /* renamed from: g */
    public final String mo31727g() {
        if (mo31737l() <= this.f23344B) {
            return NumberFormat.getInstance().format((long) mo31737l());
        }
        Context context = this.f23350a.get();
        if (context == null) {
            return "";
        }
        return context.getString(y45.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f23344B), Marker.ANY_NON_NULL_MARKER});
    }

    public int getAlpha() {
        return this.f23357x.f23366e;
    }

    public int getIntrinsicHeight() {
        return this.f23353g.height();
    }

    public int getIntrinsicWidth() {
        return this.f23353g.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public CharSequence mo31732h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo31739n()) {
            return this.f23357x.f23369r;
        }
        if (this.f23357x.f23370s <= 0 || (context = this.f23350a.get()) == null) {
            return null;
        }
        if (mo31737l() <= this.f23344B) {
            return context.getResources().getQuantityString(this.f23357x.f23370s, mo31737l(), new Object[]{Integer.valueOf(mo31737l())});
        }
        return context.getString(this.f23357x.f23371x, new Object[]{Integer.valueOf(this.f23344B)});
    }

    /* renamed from: i */
    public FrameLayout mo31733i() {
        WeakReference<FrameLayout> weakReference = this.f23349M;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int mo31735j() {
        return this.f23357x.f23360B;
    }

    /* renamed from: k */
    public int mo31736k() {
        return this.f23357x.f23368k;
    }

    /* renamed from: l */
    public int mo31737l() {
        if (!mo31739n()) {
            return 0;
        }
        return this.f23357x.f23367g;
    }

    /* renamed from: m */
    public SavedState mo31738m() {
        return this.f23357x;
    }

    /* renamed from: n */
    public boolean mo31739n() {
        if (this.f23357x.f23367g != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo31740o(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray h = wo6.m54004h(context, attributeSet, u55.Badge, i, i2, new int[0]);
        mo31750x(h.getInt(u55.Badge_maxCharacterCount, 4));
        int i3 = u55.Badge_number;
        if (h.hasValue(i3)) {
            mo31751y(h.getInt(i3, 0));
        }
        mo31746t(m34638p(context, h, u55.Badge_backgroundColor));
        int i4 = u55.Badge_badgeTextColor;
        if (h.hasValue(i4)) {
            mo31748v(m34638p(context, h, i4));
        }
        mo31747u(h.getInt(u55.Badge_badgeGravity, 8388661));
        mo31749w(h.getDimensionPixelOffset(u55.Badge_horizontalOffset, 0));
        mo31718B(h.getDimensionPixelOffset(u55.Badge_verticalOffset, 0));
        h.recycle();
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: q */
    public final void mo31741q(SavedState savedState) {
        mo31750x(savedState.f23368k);
        if (savedState.f23367g != -1) {
            mo31751y(savedState.f23367g);
        }
        mo31746t(savedState.f23364a);
        mo31748v(savedState.f23365d);
        mo31747u(savedState.f23372y);
        mo31749w(savedState.f23360B);
        mo31718B(savedState.f23361C);
        mo31742r(savedState.f23362H);
        mo31743s(savedState.f23363I);
        mo31719C(savedState.f23359A);
    }

    /* renamed from: r */
    public void mo31742r(int i) {
        int unused = this.f23357x.f23362H = i;
        mo31722G();
    }

    /* renamed from: s */
    public void mo31743s(int i) {
        int unused = this.f23357x.f23363I = i;
        mo31722G();
    }

    public void setAlpha(int i) {
        int unused = this.f23357x.f23366e = i;
        this.f23352e.mo44537e().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void mo31746t(int i) {
        int unused = this.f23357x.f23364a = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f23351d.mo48478x() != valueOf) {
            this.f23351d.mo48440a0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void mo31747u(int i) {
        FrameLayout frameLayout;
        if (this.f23357x.f23372y != i) {
            int unused = this.f23357x.f23372y = i;
            WeakReference<View> weakReference = this.f23348L;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.f23348L.get();
                WeakReference<FrameLayout> weakReference2 = this.f23349M;
                if (weakReference2 != null) {
                    frameLayout = weakReference2.get();
                } else {
                    frameLayout = null;
                }
                mo31721F(view, frameLayout);
            }
        }
    }

    /* renamed from: v */
    public void mo31748v(int i) {
        int unused = this.f23357x.f23365d = i;
        if (this.f23352e.mo44537e().getColor() != i) {
            this.f23352e.mo44537e().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public void mo31749w(int i) {
        int unused = this.f23357x.f23360B = i;
        mo31722G();
    }

    /* renamed from: x */
    public void mo31750x(int i) {
        if (this.f23357x.f23368k != i) {
            int unused = this.f23357x.f23368k = i;
            mo31723H();
            this.f23352e.mo44541i(true);
            mo31722G();
            invalidateSelf();
        }
    }

    /* renamed from: y */
    public void mo31751y(int i) {
        int max = Math.max(0, i);
        if (this.f23357x.f23367g != max) {
            int unused = this.f23357x.f23367g = max;
            this.f23352e.mo44541i(true);
            mo31722G();
            invalidateSelf();
        }
    }

    /* renamed from: z */
    public final void mo31752z(bn6 bn6) {
        Context context;
        if (this.f23352e.mo44536d() != bn6 && (context = this.f23350a.get()) != null) {
            this.f23352e.mo44540h(bn6, context);
            mo31722G();
        }
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4182a();

        /* renamed from: A */
        public boolean f23359A;

        /* renamed from: B */
        public int f23360B;

        /* renamed from: C */
        public int f23361C;

        /* renamed from: H */
        public int f23362H;

        /* renamed from: I */
        public int f23363I;

        /* renamed from: a */
        public int f23364a;

        /* renamed from: d */
        public int f23365d;

        /* renamed from: e */
        public int f23366e = 255;

        /* renamed from: g */
        public int f23367g = -1;

        /* renamed from: k */
        public int f23368k;

        /* renamed from: r */
        public CharSequence f23369r;

        /* renamed from: s */
        public int f23370s;

        /* renamed from: x */
        public int f23371x;

        /* renamed from: y */
        public int f23372y;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        public static class C4182a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            this.f23365d = new bn6(context, e55.TextAppearance_MaterialComponents_Badge).f21403a.getDefaultColor();
            this.f23369r = context.getString(y45.mtrl_badge_numberless_content_description);
            this.f23370s = l45.mtrl_badge_content_description;
            this.f23371x = y45.mtrl_exceed_max_badge_number_content_description;
            this.f23359A = true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f23364a);
            parcel.writeInt(this.f23365d);
            parcel.writeInt(this.f23366e);
            parcel.writeInt(this.f23367g);
            parcel.writeInt(this.f23368k);
            parcel.writeString(this.f23369r.toString());
            parcel.writeInt(this.f23370s);
            parcel.writeInt(this.f23372y);
            parcel.writeInt(this.f23360B);
            parcel.writeInt(this.f23361C);
            parcel.writeInt(this.f23362H);
            parcel.writeInt(this.f23363I);
            parcel.writeInt(this.f23359A ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f23364a = parcel.readInt();
            this.f23365d = parcel.readInt();
            this.f23366e = parcel.readInt();
            this.f23367g = parcel.readInt();
            this.f23368k = parcel.readInt();
            this.f23369r = parcel.readString();
            this.f23370s = parcel.readInt();
            this.f23372y = parcel.readInt();
            this.f23360B = parcel.readInt();
            this.f23361C = parcel.readInt();
            this.f23362H = parcel.readInt();
            this.f23363I = parcel.readInt();
            this.f23359A = parcel.readInt() != 0;
        }
    }
}
