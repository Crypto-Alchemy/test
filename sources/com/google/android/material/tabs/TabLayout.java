package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C4184a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C3335t8;

@ViewPager.C1477e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: G1 */
    public static final int f24352G1 = e55.Widget_Design_TabLayout;

    /* renamed from: H1 */
    public static final ys4<C4399g> f24353H1 = new ct4(16);

    /* renamed from: A */
    public ColorStateList f24354A;

    /* renamed from: A1 */
    public al4 f24355A1;

    /* renamed from: B */
    public ColorStateList f24356B;

    /* renamed from: B1 */
    public DataSetObserver f24357B1;

    /* renamed from: C */
    public Drawable f24358C;

    /* renamed from: C1 */
    public C4400h f24359C1;

    /* renamed from: D1 */
    public C4392b f24360D1;

    /* renamed from: E1 */
    public boolean f24361E1;

    /* renamed from: F1 */
    public final ys4<TabView> f24362F1;

    /* renamed from: H */
    public int f24363H;

    /* renamed from: I */
    public PorterDuff.Mode f24364I;

    /* renamed from: L */
    public float f24365L;

    /* renamed from: M */
    public float f24366M;

    /* renamed from: P */
    public final int f24367P;

    /* renamed from: Q */
    public int f24368Q;

    /* renamed from: U */
    public final int f24369U;

    /* renamed from: a */
    public final ArrayList<C4399g> f24370a;

    /* renamed from: b1 */
    public int f24371b1;

    /* renamed from: d */
    public C4399g f24372d;

    /* renamed from: e */
    public final C4396f f24373e;

    /* renamed from: e0 */
    public final int f24374e0;

    /* renamed from: e1 */
    public int f24375e1;

    /* renamed from: g */
    public int f24376g;

    /* renamed from: k */
    public int f24377k;

    /* renamed from: k0 */
    public final int f24378k0;

    /* renamed from: o1 */
    public int f24379o1;

    /* renamed from: p1 */
    public int f24380p1;

    /* renamed from: q1 */
    public boolean f24381q1;

    /* renamed from: r */
    public int f24382r;

    /* renamed from: r1 */
    public boolean f24383r1;

    /* renamed from: s */
    public int f24384s;

    /* renamed from: s1 */
    public int f24385s1;

    /* renamed from: t1 */
    public boolean f24386t1;

    /* renamed from: u1 */
    public C4402a f24387u1;

    /* renamed from: v0 */
    public int f24388v0;

    /* renamed from: v1 */
    public C4393c f24389v1;

    /* renamed from: w1 */
    public final ArrayList<C4393c> f24390w1;

    /* renamed from: x */
    public int f24391x;

    /* renamed from: x1 */
    public C4393c f24392x1;

    /* renamed from: y */
    public ColorStateList f24393y;

    /* renamed from: y1 */
    public ValueAnimator f24394y1;

    /* renamed from: z1 */
    public ViewPager f24395z1;

    public final class TabView extends LinearLayout {

        /* renamed from: A */
        public int f24396A = 2;

        /* renamed from: a */
        public C4399g f24398a;

        /* renamed from: d */
        public TextView f24399d;

        /* renamed from: e */
        public ImageView f24400e;

        /* renamed from: g */
        public View f24401g;

        /* renamed from: k */
        public BadgeDrawable f24402k;

        /* renamed from: r */
        public View f24403r;

        /* renamed from: s */
        public TextView f24404s;

        /* renamed from: x */
        public ImageView f24405x;

        /* renamed from: y */
        public Drawable f24406y;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        public class C4390a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            public final /* synthetic */ View f24407a;

            public C4390a(View view) {
                this.f24407a = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f24407a.getVisibility() == 0) {
                    TabView.this.mo33695s(this.f24407a);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            mo33699u(context);
            ga7.m17722E0(this, TabLayout.this.f24376g, TabLayout.this.f24377k, TabLayout.this.f24382r, TabLayout.this.f24384s);
            setGravity(17);
            setOrientation(TabLayout.this.f24381q1 ^ true ? 1 : 0);
            setClickable(true);
            ga7.m17724F0(this, kr4.m21020b(getContext(), PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW));
        }

        private BadgeDrawable getBadge() {
            return this.f24402k;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f24402k == null) {
                this.f24402k = BadgeDrawable.m34635c(getContext());
            }
            mo33694r();
            BadgeDrawable badgeDrawable = this.f24402k;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f24406y;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f24406y.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* renamed from: f */
        public final void mo33676f(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C4390a(view));
            }
        }

        /* renamed from: g */
        public final float mo33677g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        public int getContentHeight() {
            View[] viewArr = {this.f24399d, this.f24400e, this.f24403r};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f24399d, this.f24400e, this.f24403r};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public C4399g getTab() {
            return this.f24398a;
        }

        /* renamed from: h */
        public final void mo33681h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        public final FrameLayout mo33682i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: j */
        public final void mo33683j(Canvas canvas) {
            Drawable drawable = this.f24406y;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f24406y.draw(canvas);
            }
        }

        /* renamed from: k */
        public final FrameLayout mo33684k(View view) {
            if ((view == this.f24400e || view == this.f24399d) && C4184a.f23376a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* renamed from: l */
        public final boolean mo33685l() {
            if (this.f24402k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public final void mo33686m() {
            ViewGroup viewGroup;
            if (C4184a.f23376a) {
                viewGroup = mo33682i();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(c45.design_layout_tab_icon, viewGroup, false);
            this.f24400e = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: n */
        public final void mo33687n() {
            ViewGroup viewGroup;
            if (C4184a.f23376a) {
                viewGroup = mo33682i();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(c45.design_layout_tab_text, viewGroup, false);
            this.f24399d = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: o */
        public void mo33688o() {
            setTab((C4399g) null);
            setSelected(false);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f24402k;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f24402k.mo31732h());
            }
            C3335t8 S0 = C3335t8.m27495S0(accessibilityNodeInfo);
            S0.mo26246i0(C3335t8.C3338c.m27596a(0, 1, this.f24398a.mo33726g(), 1, false, isSelected()));
            if (isSelected()) {
                S0.mo26241g0(false);
                S0.mo26223W(C3335t8.C3336a.f18008i);
            }
            S0.mo26195E0(getResources().getString(y45.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f24368Q, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f24399d != null) {
                float f = TabLayout.this.f24365L;
                int i3 = this.f24396A;
                ImageView imageView = this.f24400e;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f24399d;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f24366M;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f24399d.getTextSize();
                int lineCount = this.f24399d.getLineCount();
                int d = lo6.m21650d(this.f24399d);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f24380p1 == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f24399d.getLayout()) == null || mo33677g(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f24399d.setTextSize(0, f);
                        this.f24399d.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: p */
        public final void mo33691p(View view) {
            if (mo33685l() && view != null) {
                mo33681h(false);
                C4184a.m34695a(this.f24402k, view, mo33684k(view));
                this.f24401g = view;
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f24398a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f24398a.mo33731l();
            return true;
        }

        /* renamed from: q */
        public final void mo33693q() {
            if (mo33685l()) {
                mo33681h(true);
                View view = this.f24401g;
                if (view != null) {
                    C4184a.m34698d(this.f24402k, view);
                    this.f24401g = null;
                }
            }
        }

        /* renamed from: r */
        public final void mo33694r() {
            C4399g gVar;
            C4399g gVar2;
            if (mo33685l()) {
                if (this.f24403r != null) {
                    mo33693q();
                } else if (this.f24400e != null && (gVar2 = this.f24398a) != null && gVar2.mo33725f() != null) {
                    View view = this.f24401g;
                    ImageView imageView = this.f24400e;
                    if (view != imageView) {
                        mo33693q();
                        mo33691p(this.f24400e);
                        return;
                    }
                    mo33695s(imageView);
                } else if (this.f24399d == null || (gVar = this.f24398a) == null || gVar.mo33727h() != 1) {
                    mo33693q();
                } else {
                    View view2 = this.f24401g;
                    TextView textView = this.f24399d;
                    if (view2 != textView) {
                        mo33693q();
                        mo33691p(this.f24399d);
                        return;
                    }
                    mo33695s(textView);
                }
            }
        }

        /* renamed from: s */
        public final void mo33695s(View view) {
            if (mo33685l() && view == this.f24401g) {
                C4184a.m34699e(this.f24402k, view, mo33684k(view));
            }
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f24399d;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f24400e;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f24403r;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C4399g gVar) {
            if (gVar != this.f24398a) {
                this.f24398a = gVar;
                mo33698t();
            }
        }

        /* renamed from: t */
        public final void mo33698t() {
            View view;
            boolean z;
            C4399g gVar = this.f24398a;
            Drawable drawable = null;
            if (gVar != null) {
                view = gVar.mo33724e();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f24403r = view;
                TextView textView = this.f24399d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f24400e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f24400e.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f24404s = textView2;
                if (textView2 != null) {
                    this.f24396A = lo6.m21650d(textView2);
                }
                this.f24405x = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f24403r;
                if (view2 != null) {
                    removeView(view2);
                    this.f24403r = null;
                }
                this.f24404s = null;
                this.f24405x = null;
            }
            if (this.f24403r == null) {
                if (this.f24400e == null) {
                    mo33686m();
                }
                if (!(gVar == null || gVar.mo33725f() == null)) {
                    drawable = ij1.m19659r(gVar.mo33725f()).mutate();
                }
                if (drawable != null) {
                    ij1.m19656o(drawable, TabLayout.this.f24354A);
                    PorterDuff.Mode mode = TabLayout.this.f24364I;
                    if (mode != null) {
                        ij1.m19657p(drawable, mode);
                    }
                }
                if (this.f24399d == null) {
                    mo33687n();
                    this.f24396A = lo6.m21650d(this.f24399d);
                }
                lo6.m21661o(this.f24399d, TabLayout.this.f24391x);
                ColorStateList colorStateList = TabLayout.this.f24393y;
                if (colorStateList != null) {
                    this.f24399d.setTextColor(colorStateList);
                }
                mo33701w(this.f24399d, this.f24400e);
                mo33694r();
                mo33676f(this.f24400e);
                mo33676f(this.f24399d);
            } else {
                TextView textView3 = this.f24404s;
                if (!(textView3 == null && this.f24405x == null)) {
                    mo33701w(textView3, this.f24405x);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f24426d)) {
                setContentDescription(gVar.f24426d);
            }
            if (gVar == null || !gVar.mo33729j()) {
                z = false;
            } else {
                z = true;
            }
            setSelected(z);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33699u(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f24367P
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = p000.C2554in.m19714b(r6, r0)
                r5.f24406y = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f24406y
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f24406y = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f24356B
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f24356B
                android.content.res.ColorStateList r2 = p000.bh5.m32530a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f24386t1
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                p000.ga7.m17793t0(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.mo33699u(android.content.Context):void");
        }

        /* renamed from: v */
        public final void mo33700v() {
            setOrientation(TabLayout.this.f24381q1 ^ true ? 1 : 0);
            TextView textView = this.f24404s;
            if (textView == null && this.f24405x == null) {
                mo33701w(this.f24399d, this.f24400e);
            } else {
                mo33701w(textView, this.f24405x);
            }
        }

        /* renamed from: w */
        public final void mo33701w(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            C4399g gVar = this.f24398a;
            CharSequence charSequence2 = null;
            if (gVar == null || gVar.mo33725f() == null) {
                drawable = null;
            } else {
                drawable = ij1.m19659r(this.f24398a.mo33725f()).mutate();
            }
            C4399g gVar2 = this.f24398a;
            if (gVar2 != null) {
                charSequence = gVar2.mo33728i();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f24398a.f24429g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = (int) pe7.m49897c(getContext(), 8);
                }
                if (TabLayout.this.f24381q1) {
                    if (i != do3.m15247a(marginLayoutParams)) {
                        do3.m15249c(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    do3.m15249c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C4399g gVar3 = this.f24398a;
            if (gVar3 != null) {
                charSequence2 = gVar3.f24426d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    charSequence = charSequence2;
                }
                xr6.m30294a(this, charSequence);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C4391a implements ValueAnimator.AnimatorUpdateListener {
        public C4391a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C4392b implements ViewPager.C1480h {

        /* renamed from: a */
        public boolean f24410a;

        public C4392b() {
        }

        /* renamed from: a */
        public void mo10639a(ViewPager viewPager, al4 al4, al4 al42) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f24395z1 == viewPager) {
                tabLayout.mo33597G(al42, this.f24410a);
            }
        }

        /* renamed from: b */
        public void mo33704b(boolean z) {
            this.f24410a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C4393c<T extends C4399g> {
        /* renamed from: a */
        void mo33705a(T t);

        /* renamed from: b */
        void mo33706b(T t);

        /* renamed from: c */
        void mo33707c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C4394d extends C4393c<C4399g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C4395e extends DataSetObserver {
        public C4395e() {
        }

        public void onChanged() {
            TabLayout.this.mo33674z();
        }

        public void onInvalidated() {
            TabLayout.this.mo33674z();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public class C4396f extends LinearLayout {

        /* renamed from: a */
        public ValueAnimator f24413a;

        /* renamed from: d */
        public int f24414d = -1;

        /* renamed from: e */
        public float f24415e;

        /* renamed from: g */
        public int f24416g = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        public class C4397a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ View f24418a;

            /* renamed from: d */
            public final /* synthetic */ View f24419d;

            public C4397a(View view, View view2) {
                this.f24418a = view;
                this.f24419d = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4396f.this.mo33716g(this.f24418a, this.f24419d, valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        public class C4398b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ int f24421a;

            public C4398b(int i) {
                this.f24421a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C4396f.this.f24414d = this.f24421a;
            }

            public void onAnimationStart(Animator animator) {
                C4396f.this.f24414d = this.f24421a;
            }
        }

        public C4396f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: b */
        public void mo33710b(int i, int i2) {
            ValueAnimator valueAnimator = this.f24413a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24413a.cancel();
            }
            mo33717h(true, i, i2);
        }

        /* renamed from: c */
        public boolean mo33711c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final void mo33712d() {
            View childAt = getChildAt(this.f24414d);
            C4402a a = TabLayout.this.f24387u1;
            TabLayout tabLayout = TabLayout.this;
            a.mo33741d(tabLayout, childAt, tabLayout.f24358C);
        }

        public void draw(Canvas canvas) {
            int height = TabLayout.this.f24358C.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f24358C.getIntrinsicHeight();
            }
            int i = TabLayout.this.f24379o1;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f24358C.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f24358C.getBounds();
                TabLayout.this.f24358C.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f24358C;
                if (tabLayout.f24363H != 0) {
                    drawable = ij1.m19659r(drawable);
                    ij1.m19655n(drawable, TabLayout.this.f24363H);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        public void mo33714e(int i, float f) {
            ValueAnimator valueAnimator = this.f24413a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24413a.cancel();
            }
            this.f24414d = i;
            this.f24415e = f;
            mo33716g(getChildAt(i), getChildAt(this.f24414d + 1), this.f24415e);
        }

        /* renamed from: f */
        public void mo33715f(int i) {
            Rect bounds = TabLayout.this.f24358C.getBounds();
            TabLayout.this.f24358C.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: g */
        public final void mo33716g(View view, View view2, float f) {
            boolean z;
            if (view == null || view.getWidth() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C4402a a = TabLayout.this.f24387u1;
                TabLayout tabLayout = TabLayout.this;
                a.mo33740c(tabLayout, view, view2, f, tabLayout.f24358C);
            } else {
                Drawable drawable = TabLayout.this.f24358C;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f24358C.getBounds().bottom);
            }
            ga7.m17767g0(this);
        }

        /* renamed from: h */
        public final void mo33717h(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f24414d);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                mo33712d();
                return;
            }
            C4397a aVar = new C4397a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f24413a = valueAnimator;
                valueAnimator.setInterpolator(C5807el.f28629b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{Utils.FLOAT_EPSILON, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new C4398b(i));
                valueAnimator.start();
                return;
            }
            this.f24413a.removeAllUpdateListeners();
            this.f24413a.addUpdateListener(aVar);
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f24413a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo33712d();
            } else {
                mo33717h(false, this.f24414d, -1);
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f24371b1 == 1 || tabLayout.f24380p1 == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) pe7.m49897c(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != Utils.FLOAT_EPSILON) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = Utils.FLOAT_EPSILON;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f24371b1 = 0;
                            tabLayout2.mo33601K(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C4399g {

        /* renamed from: a */
        public Object f24423a;

        /* renamed from: b */
        public Drawable f24424b;

        /* renamed from: c */
        public CharSequence f24425c;

        /* renamed from: d */
        public CharSequence f24426d;

        /* renamed from: e */
        public int f24427e = -1;

        /* renamed from: f */
        public View f24428f;

        /* renamed from: g */
        public int f24429g = 1;

        /* renamed from: h */
        public TabLayout f24430h;

        /* renamed from: i */
        public TabView f24431i;

        /* renamed from: j */
        public int f24432j = -1;

        /* renamed from: e */
        public View mo33724e() {
            return this.f24428f;
        }

        /* renamed from: f */
        public Drawable mo33725f() {
            return this.f24424b;
        }

        /* renamed from: g */
        public int mo33726g() {
            return this.f24427e;
        }

        /* renamed from: h */
        public int mo33727h() {
            return this.f24429g;
        }

        /* renamed from: i */
        public CharSequence mo33728i() {
            return this.f24425c;
        }

        /* renamed from: j */
        public boolean mo33729j() {
            TabLayout tabLayout = this.f24430h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout.getSelectedTabPosition() == this.f24427e) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: k */
        public void mo33730k() {
            this.f24430h = null;
            this.f24431i = null;
            this.f24423a = null;
            this.f24424b = null;
            this.f24432j = -1;
            this.f24425c = null;
            this.f24426d = null;
            this.f24427e = -1;
            this.f24428f = null;
        }

        /* renamed from: l */
        public void mo33731l() {
            TabLayout tabLayout = this.f24430h;
            if (tabLayout != null) {
                tabLayout.mo33595E(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C4399g mo33732m(CharSequence charSequence) {
            this.f24426d = charSequence;
            mo33738s();
            return this;
        }

        /* renamed from: n */
        public C4399g mo33733n(int i) {
            return mo33734o(LayoutInflater.from(this.f24431i.getContext()).inflate(i, this.f24431i, false));
        }

        /* renamed from: o */
        public C4399g mo33734o(View view) {
            this.f24428f = view;
            mo33738s();
            return this;
        }

        /* renamed from: p */
        public C4399g mo33735p(Drawable drawable) {
            this.f24424b = drawable;
            TabLayout tabLayout = this.f24430h;
            if (tabLayout.f24371b1 == 1 || tabLayout.f24380p1 == 2) {
                tabLayout.mo33601K(true);
            }
            mo33738s();
            if (C4184a.f23376a && this.f24431i.mo33685l() && this.f24431i.f24402k.isVisible()) {
                this.f24431i.invalidate();
            }
            return this;
        }

        /* renamed from: q */
        public void mo33736q(int i) {
            this.f24427e = i;
        }

        /* renamed from: r */
        public C4399g mo33737r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f24426d) && !TextUtils.isEmpty(charSequence)) {
                this.f24431i.setContentDescription(charSequence);
            }
            this.f24425c = charSequence;
            mo33738s();
            return this;
        }

        /* renamed from: s */
        public void mo33738s() {
            TabView tabView = this.f24431i;
            if (tabView != null) {
                tabView.mo33698t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C4400h implements ViewPager.C1481i {

        /* renamed from: a */
        public final WeakReference<TabLayout> f24433a;

        /* renamed from: d */
        public int f24434d;

        /* renamed from: e */
        public int f24435e;

        public C4400h(TabLayout tabLayout) {
            this.f24433a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo33739a() {
            this.f24435e = 0;
            this.f24434d = 0;
        }

        /* renamed from: c */
        public void mo10640c(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f24433a.get();
            if (tabLayout != null) {
                int i3 = this.f24435e;
                boolean z2 = false;
                if (i3 != 2 || this.f24434d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f24434d == 0)) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        /* renamed from: d */
        public void mo10641d(int i) {
            this.f24434d = this.f24435e;
            this.f24435e = i;
        }

        /* renamed from: e */
        public void mo10642e(int i) {
            boolean z;
            TabLayout tabLayout = this.f24433a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f24435e;
                if (i2 == 0 || (i2 == 2 && this.f24434d == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo33596F(tabLayout.mo33671w(i), z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C4401i implements C4394d {

        /* renamed from: a */
        public final ViewPager f24436a;

        public C4401i(ViewPager viewPager) {
            this.f24436a = viewPager;
        }

        /* renamed from: a */
        public void mo33705a(C4399g gVar) {
            this.f24436a.setCurrentItem(gVar.mo33726g());
        }

        /* renamed from: b */
        public void mo33706b(C4399g gVar) {
        }

        /* renamed from: c */
        public void mo33707c(C4399g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getDefaultHeight() {
        int size = this.f24370a.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C4399g gVar = this.f24370a.get(i);
                if (gVar != null && gVar.mo33725f() != null && !TextUtils.isEmpty(gVar.mo33728i())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (!z || this.f24381q1) {
            return 48;
        }
        return 72;
    }

    private int getTabMinWidth() {
        int i = this.f24369U;
        if (i != -1) {
            return i;
        }
        int i2 = this.f24380p1;
        if (i2 == 0 || i2 == 2) {
            return this.f24378k0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f24373e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: o */
    public static ColorStateList m35989o(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f24373e.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f24373e.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* renamed from: A */
    public boolean mo33591A(C4399g gVar) {
        return f24353H1.mo11138a(gVar);
    }

    /* renamed from: B */
    public void mo33592B() {
        for (int childCount = this.f24373e.getChildCount() - 1; childCount >= 0; childCount--) {
            mo33594D(childCount);
        }
        Iterator<C4399g> it = this.f24370a.iterator();
        while (it.hasNext()) {
            C4399g next = it.next();
            it.remove();
            next.mo33730k();
            mo33591A(next);
        }
        this.f24372d = null;
    }

    @Deprecated
    /* renamed from: C */
    public void mo33593C(C4393c cVar) {
        this.f24390w1.remove(cVar);
    }

    /* renamed from: D */
    public final void mo33594D(int i) {
        TabView tabView = (TabView) this.f24373e.getChildAt(i);
        this.f24373e.removeViewAt(i);
        if (tabView != null) {
            tabView.mo33688o();
            this.f24362F1.mo11138a(tabView);
        }
        requestLayout();
    }

    /* renamed from: E */
    public void mo33595E(C4399g gVar) {
        mo33596F(gVar, true);
    }

    /* renamed from: F */
    public void mo33596F(C4399g gVar, boolean z) {
        int i;
        C4399g gVar2 = this.f24372d;
        if (gVar2 != gVar) {
            if (gVar != null) {
                i = gVar.mo33726g();
            } else {
                i = -1;
            }
            if (z) {
                if ((gVar2 == null || gVar2.mo33726g() == -1) && i != -1) {
                    setScrollPosition(i, Utils.FLOAT_EPSILON, true);
                } else {
                    mo33625j(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.f24372d = gVar;
            if (gVar2 != null) {
                mo33669u(gVar2);
            }
            if (gVar != null) {
                mo33668t(gVar);
            }
        } else if (gVar2 != null) {
            mo33638s(gVar);
            mo33625j(gVar.mo33726g());
        }
    }

    /* renamed from: G */
    public void mo33597G(al4 al4, boolean z) {
        DataSetObserver dataSetObserver;
        al4 al42 = this.f24355A1;
        if (!(al42 == null || (dataSetObserver = this.f24357B1) == null)) {
            al42.mo385t(dataSetObserver);
        }
        this.f24355A1 = al4;
        if (z && al4 != null) {
            if (this.f24357B1 == null) {
                this.f24357B1 = new C4395e();
            }
            al4.mo377l(this.f24357B1);
        }
        mo33674z();
    }

    /* renamed from: H */
    public final void mo33598H(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f24395z1;
        if (viewPager2 != null) {
            C4400h hVar = this.f24359C1;
            if (hVar != null) {
                viewPager2.mo10657M(hVar);
            }
            C4392b bVar = this.f24360D1;
            if (bVar != null) {
                this.f24395z1.mo10656L(bVar);
            }
        }
        C4393c cVar = this.f24392x1;
        if (cVar != null) {
            mo33593C(cVar);
            this.f24392x1 = null;
        }
        if (viewPager != null) {
            this.f24395z1 = viewPager;
            if (this.f24359C1 == null) {
                this.f24359C1 = new C4400h(this);
            }
            this.f24359C1.mo33739a();
            viewPager.mo10671c(this.f24359C1);
            C4401i iVar = new C4401i(viewPager);
            this.f24392x1 = iVar;
            mo33606c(iVar);
            al4 adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo33597G(adapter, z);
            }
            if (this.f24360D1 == null) {
                this.f24360D1 = new C4392b();
            }
            this.f24360D1.mo33704b(z);
            viewPager.mo10670b(this.f24360D1);
            setScrollPosition(viewPager.getCurrentItem(), Utils.FLOAT_EPSILON, true);
        } else {
            this.f24395z1 = null;
            mo33597G((al4) null, false);
        }
        this.f24361E1 = z2;
    }

    /* renamed from: I */
    public final void mo33599I() {
        int size = this.f24370a.size();
        for (int i = 0; i < size; i++) {
            this.f24370a.get(i).mo33738s();
        }
    }

    /* renamed from: J */
    public final void mo33600J(LinearLayout.LayoutParams layoutParams) {
        if (this.f24380p1 == 1 && this.f24371b1 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = Utils.FLOAT_EPSILON;
    }

    /* renamed from: K */
    public void mo33601K(boolean z) {
        for (int i = 0; i < this.f24373e.getChildCount(); i++) {
            View childAt = this.f24373e.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            mo33600J((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        mo33624i(view);
    }

    @Deprecated
    /* renamed from: c */
    public void mo33606c(C4393c cVar) {
        if (!this.f24390w1.contains(cVar)) {
            this.f24390w1.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo33607d(C4399g gVar) {
        mo33609f(gVar, this.f24370a.isEmpty());
    }

    /* renamed from: e */
    public void mo33608e(C4399g gVar, int i, boolean z) {
        if (gVar.f24430h == this) {
            mo33629n(gVar, i);
            mo33623h(gVar);
            if (z) {
                gVar.mo33731l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: f */
    public void mo33609f(C4399g gVar, boolean z) {
        mo33608e(gVar, this.f24370a.size(), z);
    }

    /* renamed from: g */
    public final void mo33610g(TabItem tabItem) {
        C4399g y = mo33673y();
        CharSequence charSequence = tabItem.f24349a;
        if (charSequence != null) {
            y.mo33737r(charSequence);
        }
        Drawable drawable = tabItem.f24350d;
        if (drawable != null) {
            y.mo33735p(drawable);
        }
        int i = tabItem.f24351e;
        if (i != 0) {
            y.mo33733n(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            y.mo33732m(tabItem.getContentDescription());
        }
        mo33607d(y);
    }

    public int getSelectedTabPosition() {
        C4399g gVar = this.f24372d;
        if (gVar != null) {
            return gVar.mo33726g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f24370a.size();
    }

    public int getTabGravity() {
        return this.f24371b1;
    }

    public ColorStateList getTabIconTint() {
        return this.f24354A;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f24385s1;
    }

    public int getTabIndicatorGravity() {
        return this.f24379o1;
    }

    public int getTabMaxWidth() {
        return this.f24368Q;
    }

    public int getTabMode() {
        return this.f24380p1;
    }

    public ColorStateList getTabRippleColor() {
        return this.f24356B;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f24358C;
    }

    public ColorStateList getTabTextColors() {
        return this.f24393y;
    }

    /* renamed from: h */
    public final void mo33623h(C4399g gVar) {
        TabView tabView = gVar.f24431i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f24373e.addView(tabView, gVar.mo33726g(), mo33635p());
    }

    /* renamed from: i */
    public final void mo33624i(View view) {
        if (view instanceof TabItem) {
            mo33610g((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: j */
    public final void mo33625j(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ga7.m17747T(this) || this.f24373e.mo33711c()) {
                setScrollPosition(i, Utils.FLOAT_EPSILON, true);
                return;
            }
            int scrollX = getScrollX();
            int m = mo33628m(i, Utils.FLOAT_EPSILON);
            if (scrollX != m) {
                mo33670v();
                this.f24394y1.setIntValues(new int[]{scrollX, m});
                this.f24394y1.start();
            }
            this.f24373e.mo33710b(i, this.f24375e1);
        }
    }

    /* renamed from: k */
    public final void mo33626k(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f24373e.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.f24373e.setGravity(8388611);
    }

    /* renamed from: l */
    public final void mo33627l() {
        int i;
        int i2 = this.f24380p1;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f24388v0 - this.f24376g);
        } else {
            i = 0;
        }
        ga7.m17722E0(this.f24373e, i, 0, 0, 0);
        int i3 = this.f24380p1;
        if (i3 == 0) {
            mo33626k(this.f24371b1);
        } else if (i3 == 1 || i3 == 2) {
            this.f24373e.setGravity(1);
        }
        mo33601K(true);
    }

    /* renamed from: m */
    public final int mo33628m(int i, float f) {
        View view;
        int i2;
        int i3 = this.f24380p1;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.f24373e.getChildAt(i);
        int i5 = i + 1;
        if (i5 < this.f24373e.getChildCount()) {
            view = this.f24373e.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (i2 + i4)) * 0.5f * f);
        if (ga7.m17715B(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    /* renamed from: n */
    public final void mo33629n(C4399g gVar, int i) {
        gVar.mo33736q(i);
        this.f24370a.add(i, gVar);
        int size = this.f24370a.size();
        while (true) {
            i++;
            if (i < size) {
                this.f24370a.get(i).mo33736q(i);
            } else {
                return;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53443e(this);
        if (this.f24395z1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                mo33598H((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24361E1) {
            setupWithViewPager((ViewPager) null);
            this.f24361E1 = false;
        }
    }

    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f24373e.getChildCount(); i++) {
            View childAt = this.f24373e.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).mo33683j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3335t8.m27495S0(accessibilityNodeInfo).mo26243h0(C3335t8.C3337b.m27595b(1, getTabCount(), false, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = p000.pe7.m49897c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f24374e0
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = p000.pe7.m49897c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f24368Q = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f24380p1
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public final LinearLayout.LayoutParams mo33635p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        mo33600J(layoutParams);
        return layoutParams;
    }

    /* renamed from: q */
    public C4399g mo33636q() {
        C4399g b = f24353H1.mo11139b();
        if (b == null) {
            return new C4399g();
        }
        return b;
    }

    /* renamed from: r */
    public final TabView mo33637r(C4399g gVar) {
        TabView tabView;
        ys4<TabView> ys4 = this.f24362F1;
        if (ys4 != null) {
            tabView = ys4.mo11139b();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(gVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f24426d)) {
            tabView.setContentDescription(gVar.f24425c);
        } else {
            tabView.setContentDescription(gVar.f24426d);
        }
        return tabView;
    }

    /* renamed from: s */
    public final void mo33638s(C4399g gVar) {
        for (int size = this.f24390w1.size() - 1; size >= 0; size--) {
            this.f24390w1.get(size).mo33707c(gVar);
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        vo3.m53442d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f24381q1 != z) {
            this.f24381q1 = z;
            for (int i = 0; i < this.f24373e.getChildCount(); i++) {
                View childAt = this.f24373e.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo33700v();
                }
            }
            mo33627l();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C4394d dVar) {
        setOnTabSelectedListener((C4393c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        mo33670v();
        this.f24394y1.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f24358C != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f24358C = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f24363H = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f24379o1 != i) {
            this.f24379o1 = i;
            ga7.m17767g0(this.f24373e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f24373e.mo33715f(i);
    }

    public void setTabGravity(int i) {
        if (this.f24371b1 != i) {
            this.f24371b1 = i;
            mo33627l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f24354A != colorStateList) {
            this.f24354A = colorStateList;
            mo33599I();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C2554in.m19713a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f24385s1 = i;
        if (i == 0) {
            this.f24387u1 = new C4402a();
        } else if (i == 1) {
            this.f24387u1 = new wn1();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f24383r1 = z;
        ga7.m17767g0(this.f24373e);
    }

    public void setTabMode(int i) {
        if (i != this.f24380p1) {
            this.f24380p1 = i;
            mo33627l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f24356B != colorStateList) {
            this.f24356B = colorStateList;
            for (int i = 0; i < this.f24373e.getChildCount(); i++) {
                View childAt = this.f24373e.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo33699u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C2554in.m19713a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f24393y != colorStateList) {
            this.f24393y = colorStateList;
            mo33599I();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(al4 al4) {
        mo33597G(al4, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f24386t1 != z) {
            this.f24386t1 = z;
            for (int i = 0; i < this.f24373e.getChildCount(); i++) {
                View childAt = this.f24373e.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo33699u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void mo33668t(C4399g gVar) {
        for (int size = this.f24390w1.size() - 1; size >= 0; size--) {
            this.f24390w1.get(size).mo33705a(gVar);
        }
    }

    /* renamed from: u */
    public final void mo33669u(C4399g gVar) {
        for (int size = this.f24390w1.size() - 1; size >= 0; size--) {
            this.f24390w1.get(size).mo33706b(gVar);
        }
    }

    /* renamed from: v */
    public final void mo33670v() {
        if (this.f24394y1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f24394y1 = valueAnimator;
            valueAnimator.setInterpolator(C5807el.f28629b);
            this.f24394y1.setDuration((long) this.f24375e1);
            this.f24394y1.addUpdateListener(new C4391a());
        }
    }

    /* renamed from: w */
    public C4399g mo33671w(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f24370a.get(i);
    }

    /* renamed from: x */
    public boolean mo33672x() {
        return this.f24383r1;
    }

    /* renamed from: y */
    public C4399g mo33673y() {
        C4399g q = mo33636q();
        q.f24430h = this;
        q.f24431i = mo33637r(q);
        if (q.f24432j != -1) {
            q.f24431i.setId(q.f24432j);
        }
        return q;
    }

    /* renamed from: z */
    public void mo33674z() {
        int currentItem;
        mo33592B();
        al4 al4 = this.f24355A1;
        if (al4 != null) {
            int e = al4.mo370e();
            for (int i = 0; i < e; i++) {
                mo33609f(mo33673y().mo33737r(this.f24355A1.mo372g(i)), false);
            }
            ViewPager viewPager = this.f24395z1;
            if (viewPager != null && e > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo33595E(mo33671w(currentItem));
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.tabStyle);
    }

    public void addView(View view, int i) {
        mo33624i(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C4393c cVar) {
        C4393c cVar2 = this.f24389v1;
        if (cVar2 != null) {
            mo33593C(cVar2);
        }
        this.f24389v1 = cVar;
        if (cVar != null) {
            mo33606c(cVar);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f24373e.getChildCount()) {
            if (z2) {
                this.f24373e.mo33714e(i, f);
            }
            ValueAnimator valueAnimator = this.f24394y1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24394y1.cancel();
            }
            scrollTo(mo33628m(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        mo33598H(viewPager, z, false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f24352G1
            android.content.Context r12 = p000.xo3.m54461c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f24370a = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.f24358C = r12
            r12 = 0
            r11.f24363H = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f24368Q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f24390w1 = r0
            at4 r0 = new at4
            r1 = 12
            r0.<init>(r1)
            r11.f24362F1 = r0
            android.content.Context r6 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$f r7 = new com.google.android.material.tabs.TabLayout$f
            r7.<init>(r6)
            r11.f24373e = r7
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r8 = -1
            r0.<init>(r1, r8)
            super.addView(r7, r12, r0)
            int[] r2 = p000.u55.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = p000.u55.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r6
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0082
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            uo3 r0 = new uo3
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo48440a0(r14)
            r0.mo48430P(r6)
            float r14 = p000.ga7.m17798w(r11)
            r0.mo48439Z(r14)
            p000.ga7.m17793t0(r11, r0)
        L_0x0082:
            int r14 = p000.u55.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = p000.to3.m52393d(r6, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = p000.u55.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = p000.u55.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r7.mo33715f(r14)
            int r14 = p000.u55.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = p000.u55.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = p000.u55.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = p000.u55.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f24384s = r14
            r11.f24382r = r14
            r11.f24377k = r14
            r11.f24376g = r14
            int r0 = p000.u55.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f24376g = r14
            int r14 = p000.u55.TabLayout_tabPaddingTop
            int r0 = r11.f24377k
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f24377k = r14
            int r14 = p000.u55.TabLayout_tabPaddingEnd
            int r0 = r11.f24382r
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f24382r = r14
            int r14 = p000.u55.TabLayout_tabPaddingBottom
            int r0 = r11.f24384s
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f24384s = r14
            int r14 = p000.e55.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f24391x = r14
            int[] r0 = p000.j65.TextAppearance
            android.content.res.TypedArray r14 = r6.obtainStyledAttributes(r14, r0)
            int r0 = p000.j65.TextAppearance_android_textSize     // Catch:{ all -> 0x01b7 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b7 }
            r11.f24365L = r0     // Catch:{ all -> 0x01b7 }
            int r0 = p000.j65.TextAppearance_android_textColor     // Catch:{ all -> 0x01b7 }
            android.content.res.ColorStateList r0 = p000.to3.m52391b(r6, r14, r0)     // Catch:{ all -> 0x01b7 }
            r11.f24393y = r0     // Catch:{ all -> 0x01b7 }
            r14.recycle()
            int r14 = p000.u55.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x011c
            android.content.res.ColorStateList r14 = p000.to3.m52391b(r6, r13, r14)
            r11.f24393y = r14
        L_0x011c:
            int r14 = p000.u55.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0134
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.f24393y
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = m35989o(r0, r14)
            r11.f24393y = r14
        L_0x0134:
            int r14 = p000.u55.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = p000.to3.m52391b(r6, r13, r14)
            r11.f24354A = r14
            int r14 = p000.u55.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r8)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = p000.pe7.m49903i(r14, r0)
            r11.f24364I = r14
            int r14 = p000.u55.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = p000.to3.m52391b(r6, r13, r14)
            r11.f24356B = r14
            int r14 = p000.u55.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f24375e1 = r14
            int r14 = p000.u55.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f24369U = r14
            int r14 = p000.u55.TabLayout_tabMaxWidth
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f24374e0 = r14
            int r14 = p000.u55.TabLayout_tabBackground
            int r14 = r13.getResourceId(r14, r12)
            r11.f24367P = r14
            int r14 = p000.u55.TabLayout_tabContentStart
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f24388v0 = r14
            int r14 = p000.u55.TabLayout_tabMode
            int r14 = r13.getInt(r14, r9)
            r11.f24380p1 = r14
            int r14 = p000.u55.TabLayout_tabGravity
            int r14 = r13.getInt(r14, r12)
            r11.f24371b1 = r14
            int r14 = p000.u55.TabLayout_tabInlineLabel
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f24381q1 = r14
            int r14 = p000.u55.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f24386t1 = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = p000.k25.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f24366M = r13
            int r13 = p000.k25.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f24378k0 = r12
            r11.mo33627l()
            return
        L_0x01b7:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo33624i(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C2554in.m19714b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo33624i(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m35989o(i, i2));
    }
}
