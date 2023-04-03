package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.pe7;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0543b {

    /* renamed from: c2 */
    public static final int f23399c2 = e55.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: H1 */
    public final int f23400H1;

    /* renamed from: I1 */
    public final uo3 f23401I1;

    /* renamed from: J1 */
    public Animator f23402J1;

    /* renamed from: K1 */
    public Animator f23403K1;

    /* renamed from: L1 */
    public int f23404L1;

    /* renamed from: M1 */
    public int f23405M1;

    /* renamed from: N1 */
    public boolean f23406N1;

    /* renamed from: O1 */
    public final boolean f23407O1;

    /* renamed from: P1 */
    public final boolean f23408P1;

    /* renamed from: Q1 */
    public final boolean f23409Q1;

    /* renamed from: R1 */
    public int f23410R1;

    /* renamed from: S1 */
    public ArrayList<C4202j> f23411S1;

    /* renamed from: T1 */
    public int f23412T1;

    /* renamed from: U1 */
    public boolean f23413U1;

    /* renamed from: V1 */
    public boolean f23414V1;

    /* renamed from: W1 */
    public Behavior f23415W1;

    /* renamed from: X1 */
    public int f23416X1;

    /* renamed from: Y1 */
    public int f23417Y1;

    /* renamed from: Z1 */
    public int f23418Z1;

    /* renamed from: a2 */
    public AnimatorListenerAdapter f23419a2;

    /* renamed from: b2 */
    public nw6<FloatingActionButton> f23420b2;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4191a();

        /* renamed from: e */
        public int f23426e;

        /* renamed from: g */
        public boolean f23427g;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public static class C4191a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23426e);
            parcel.writeInt(this.f23427g ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23426e = parcel.readInt();
            this.f23427g = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C4192a extends AnimatorListenerAdapter {
        public C4192a() {
        }

        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f23413U1) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo31781F0(bottomAppBar.f23404L1, BottomAppBar.this.f23414V1);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C4193b implements nw6<FloatingActionButton> {
        public C4193b() {
        }

        /* renamed from: c */
        public void mo31824a(FloatingActionButton floatingActionButton) {
            float f;
            uo3 m0 = BottomAppBar.this.f23401I1;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            } else {
                f = Utils.FLOAT_EPSILON;
            }
            m0.mo48441b0(f);
        }

        /* renamed from: d */
        public void mo31825b(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().mo48294j() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().mo48300t(translationX);
                BottomAppBar.this.f23401I1.invalidateSelf();
            }
            float f = Utils.FLOAT_EPSILON;
            float max = Math.max(Utils.FLOAT_EPSILON, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().mo48289d() != max) {
                BottomAppBar.this.getTopEdgeTreatment().mo48295l(max);
                BottomAppBar.this.f23401I1.invalidateSelf();
            }
            uo3 m0 = BottomAppBar.this.f23401I1;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            m0.mo48441b0(f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C4194c implements pe7.C6355e {
        public C4194c() {
        }

        /* renamed from: a */
        public hl7 mo31828a(View view, hl7 hl7, pe7.C6356f fVar) {
            boolean z;
            if (BottomAppBar.this.f23407O1) {
                int unused = BottomAppBar.this.f23416X1 = hl7.mo21237j();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.f23408P1) {
                if (BottomAppBar.this.f23418Z1 != hl7.mo21238k()) {
                    z = true;
                } else {
                    z = false;
                }
                int unused2 = BottomAppBar.this.f23418Z1 = hl7.mo21238k();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f23409Q1) {
                if (BottomAppBar.this.f23417Y1 == hl7.mo21239l()) {
                    z2 = false;
                }
                int unused3 = BottomAppBar.this.f23417Y1 = hl7.mo21239l();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.mo31808u0();
                BottomAppBar.this.mo31785J0();
                BottomAppBar.this.mo31784I0();
            }
            return hl7;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C4195d extends AnimatorListenerAdapter {
        public C4195d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.mo31812y0();
            Animator unused = BottomAppBar.this.f23402J1 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.mo31813z0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C4196e extends FloatingActionButton.C4307b {

        /* renamed from: a */
        public final /* synthetic */ int f23432a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        public class C4197a extends FloatingActionButton.C4307b {
            public C4197a() {
            }

            /* renamed from: b */
            public void mo31832b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.mo31812y0();
            }
        }

        public C4196e(int i) {
            this.f23432a = i;
        }

        /* renamed from: a */
        public void mo31831a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.mo31779D0(this.f23432a));
            floatingActionButton.mo32796u(new C4197a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public class C4198f extends AnimatorListenerAdapter {
        public C4198f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.mo31812y0();
            boolean unused = BottomAppBar.this.f23413U1 = false;
            Animator unused2 = BottomAppBar.this.f23403K1 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.mo31813z0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public class C4199g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f23436a;

        /* renamed from: d */
        public final /* synthetic */ ActionMenuView f23437d;

        /* renamed from: e */
        public final /* synthetic */ int f23438e;

        /* renamed from: g */
        public final /* synthetic */ boolean f23439g;

        public C4199g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f23437d = actionMenuView;
            this.f23438e = i;
            this.f23439g = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f23436a = true;
        }

        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.f23436a) {
                if (BottomAppBar.this.f23412T1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo31783H0(bottomAppBar.f23412T1);
                BottomAppBar.this.mo31788M0(this.f23437d, this.f23438e, this.f23439g, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    public class C4200h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f23441a;

        /* renamed from: d */
        public final /* synthetic */ int f23442d;

        /* renamed from: e */
        public final /* synthetic */ boolean f23443e;

        public C4200h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f23441a = actionMenuView;
            this.f23442d = i;
            this.f23443e = z;
        }

        public void run() {
            ActionMenuView actionMenuView = this.f23441a;
            actionMenuView.setTranslationX((float) BottomAppBar.this.mo31778C0(actionMenuView, this.f23442d, this.f23443e));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    public class C4201i extends AnimatorListenerAdapter {
        public C4201i() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f23419a2.onAnimationStart(animator);
            FloatingActionButton d0 = BottomAppBar.this.mo31776A0();
            if (d0 != null) {
                d0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    public interface C4202j {
        /* renamed from: a */
        void mo31839a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo31840b(BottomAppBar bottomAppBar);
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f23416X1;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return mo31779D0(this.f23404L1);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo48289d();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f23418Z1;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f23417Y1;
    }

    /* access modifiers changed from: private */
    public u30 getTopEdgeTreatment() {
        return (u30) this.f23401I1.mo48418D().mo47579p();
    }

    /* renamed from: A0 */
    public final FloatingActionButton mo31776A0() {
        View B0 = mo31777B0();
        if (B0 instanceof FloatingActionButton) {
            return (FloatingActionButton) B0;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo31777B0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.getDependents(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo31777B0():android.view.View");
    }

    /* renamed from: C0 */
    public int mo31778C0(ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        if (i != 1 || !z) {
            return 0;
        }
        boolean h = pe7.m49902h(this);
        if (h) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getLayoutParams() instanceof Toolbar.LayoutParams) || (((Toolbar.LayoutParams) childAt.getLayoutParams()).f400a & 8388615) != 8388611) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (h) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (h) {
            i3 = actionMenuView.getRight();
        } else {
            i3 = actionMenuView.getLeft();
        }
        if (h) {
            i4 = this.f23417Y1;
        } else {
            i4 = -this.f23418Z1;
        }
        return i2 - (i3 + i4);
    }

    /* renamed from: D0 */
    public final float mo31779D0(int i) {
        int i2;
        boolean h = pe7.m49902h(this);
        int i3 = 1;
        if (i != 1) {
            return Utils.FLOAT_EPSILON;
        }
        if (h) {
            i2 = this.f23418Z1;
        } else {
            i2 = this.f23417Y1;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f23400H1 + i2);
        if (h) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    /* renamed from: E0 */
    public final boolean mo31780E0() {
        FloatingActionButton A0 = mo31776A0();
        if (A0 == null || !A0.mo32756p()) {
            return false;
        }
        return true;
    }

    /* renamed from: F0 */
    public final void mo31781F0(int i, boolean z) {
        if (!ga7.m17747T(this)) {
            this.f23413U1 = false;
            mo31783H0(this.f23412T1);
            return;
        }
        Animator animator = this.f23403K1;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!mo31780E0()) {
            i = 0;
            z = false;
        }
        mo31811x0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f23403K1 = animatorSet;
        animatorSet.addListener(new C4198f());
        this.f23403K1.start();
    }

    /* renamed from: G0 */
    public final void mo31782G0(int i) {
        if (this.f23404L1 != i && ga7.m17747T(this)) {
            Animator animator = this.f23402J1;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f23405M1 == 1) {
                mo31810w0(i, arrayList);
            } else {
                mo31809v0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f23402J1 = animatorSet;
            animatorSet.addListener(new C4195d());
            this.f23402J1.start();
        }
    }

    /* renamed from: H0 */
    public void mo31783H0(int i) {
        if (i != 0) {
            this.f23412T1 = 0;
            getMenu().clear();
            mo2554x(i);
        }
    }

    /* renamed from: I0 */
    public final void mo31784I0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f23403K1 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo31780E0()) {
                mo31787L0(actionMenuView, 0, false);
            } else {
                mo31787L0(actionMenuView, this.f23404L1, this.f23414V1);
            }
        }
    }

    /* renamed from: J0 */
    public final void mo31785J0() {
        float f;
        getTopEdgeTreatment().mo48300t(getFabTranslationX());
        View B0 = mo31777B0();
        uo3 uo3 = this.f23401I1;
        if (!this.f23414V1 || !mo31780E0()) {
            f = Utils.FLOAT_EPSILON;
        } else {
            f = 1.0f;
        }
        uo3.mo48441b0(f);
        if (B0 != null) {
            B0.setTranslationY(getFabTranslationY());
            B0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: K0 */
    public boolean mo31786K0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo48293i()) {
            return false;
        }
        getTopEdgeTreatment().mo48299r(f);
        this.f23401I1.invalidateSelf();
        return true;
    }

    /* renamed from: L0 */
    public final void mo31787L0(ActionMenuView actionMenuView, int i, boolean z) {
        mo31788M0(actionMenuView, i, z, false);
    }

    /* renamed from: M0 */
    public final void mo31788M0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C4200h hVar = new C4200h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f23401I1.mo48422H();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo48289d();
    }

    public int getFabAlignmentMode() {
        return this.f23404L1;
    }

    public int getFabAnimationMode() {
        return this.f23405M1;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo48291g();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo48292h();
    }

    public boolean getHideOnScroll() {
        return this.f23406N1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53444f(this, this.f23401I1);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo31808u0();
            mo31785J0();
        }
        mo31784I0();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        this.f23404L1 = savedState.f23426e;
        this.f23414V1 = savedState.f23427g;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23426e = this.f23404L1;
        savedState.f23427g = this.f23414V1;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        ij1.m19656o(this.f23401I1, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo48295l(f);
            this.f23401I1.invalidateSelf();
            mo31785J0();
        }
    }

    public void setElevation(float f) {
        this.f23401I1.mo48439Z(f);
        getBehavior().mo31761c(this, this.f23401I1.mo48417C() - this.f23401I1.mo48416B());
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.f23412T1 = i2;
        this.f23413U1 = true;
        mo31781F0(i, this.f23414V1);
        mo31782G0(i);
        this.f23404L1 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f23405M1 = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().mo48290f()) {
            getTopEdgeTreatment().mo48296m(f);
            this.f23401I1.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo48297o(f);
            this.f23401I1.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo48298p(f);
            this.f23401I1.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f23406N1 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t0 */
    public final void mo31807t0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo32718e(this.f23419a2);
        floatingActionButton.mo32719f(new C4201i());
        floatingActionButton.mo32720g(this.f23420b2);
    }

    /* renamed from: u0 */
    public final void mo31808u0() {
        Animator animator = this.f23403K1;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f23402J1;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: v0 */
    public void mo31809v0(int i, List<Animator> list) {
        FloatingActionButton A0 = mo31776A0();
        if (A0 != null && !A0.mo32749o()) {
            mo31813z0();
            A0.mo32747m(new C4196e(i));
        }
    }

    /* renamed from: w0 */
    public final void mo31810w0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo31776A0(), "translationX", new float[]{mo31779D0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: x0 */
    public final void mo31811x0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo31778C0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C4199g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: y0 */
    public final void mo31812y0() {
        ArrayList<C4202j> arrayList;
        int i = this.f23410R1 - 1;
        this.f23410R1 = i;
        if (i == 0 && (arrayList = this.f23411S1) != null) {
            Iterator<C4202j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo31839a(this);
            }
        }
    }

    /* renamed from: z0 */
    public final void mo31813z0() {
        ArrayList<C4202j> arrayList;
        int i = this.f23410R1;
        this.f23410R1 = i + 1;
        if (i == 0 && (arrayList = this.f23411S1) != null) {
            Iterator<C4202j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo31840b(this);
            }
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.bottomAppBarStyle);
    }

    public Behavior getBehavior() {
        if (this.f23415W1 == null) {
            this.f23415W1 = new Behavior();
        }
        return this.f23415W1;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f23421e = new Rect();

        /* renamed from: f */
        public WeakReference<BottomAppBar> f23422f;

        /* renamed from: g */
        public int f23423g;

        /* renamed from: h */
        public final View.OnLayoutChangeListener f23424h = new C4190a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C4190a implements View.OnLayoutChangeListener {
            public C4190a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f23422f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo32743j(Behavior.this.f23421e);
                int height = Behavior.this.f23421e.height();
                bottomAppBar.mo31786K0(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().mo47581r().mo29529a(new RectF(Behavior.this.f23421e)));
                CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) view.getLayoutParams();
                if (Behavior.this.f23423g == 0) {
                    eVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(k25.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    eVar.leftMargin = bottomAppBar.getLeftInset();
                    eVar.rightMargin = bottomAppBar.getRightInset();
                    if (pe7.m49902h(floatingActionButton)) {
                        eVar.leftMargin += bottomAppBar.f23400H1;
                    } else {
                        eVar.rightMargin += bottomAppBar.f23400H1;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: i */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f23422f = new WeakReference<>(bottomAppBar);
            View k0 = bottomAppBar.mo31777B0();
            if (k0 != null && !ga7.m17747T(k0)) {
                CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) k0.getLayoutParams();
                eVar.f3352d = 49;
                this.f23423g = eVar.bottomMargin;
                if (k0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) k0;
                    floatingActionButton.addOnLayoutChangeListener(this.f23424h);
                    bottomAppBar.mo31807t0(floatingActionButton);
                }
                bottomAppBar.mo31785J0();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: j */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            if (!bottomAppBar.getHideOnScroll() || !super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return false;
            }
            return true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f23399c2
            android.content.Context r11 = p000.xo3.m54461c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            uo3 r11 = new uo3
            r11.<init>()
            r10.f23401I1 = r11
            r7 = 0
            r10.f23410R1 = r7
            r10.f23412T1 = r7
            r10.f23413U1 = r7
            r0 = 1
            r10.f23414V1 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f23419a2 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f23420b2 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = p000.u55.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r1 = p000.u55.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = p000.to3.m52391b(r8, r0, r1)
            int r2 = p000.u55.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = p000.u55.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = p000.u55.BottomAppBar_fabCradleRoundedCornerRadius
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = p000.u55.BottomAppBar_fabCradleVerticalOffset
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = p000.u55.BottomAppBar_fabAlignmentMode
            int r9 = r0.getInt(r9, r7)
            r10.f23404L1 = r9
            int r9 = p000.u55.BottomAppBar_fabAnimationMode
            int r9 = r0.getInt(r9, r7)
            r10.f23405M1 = r9
            int r9 = p000.u55.BottomAppBar_hideOnScroll
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f23406N1 = r9
            int r9 = p000.u55.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f23407O1 = r9
            int r9 = p000.u55.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f23408P1 = r9
            int r9 = p000.u55.BottomAppBar_paddingRightSystemWindowInsets
            boolean r7 = r0.getBoolean(r9, r7)
            r10.f23409Q1 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = p000.k25.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.f23400H1 = r0
            u30 r0 = new u30
            r0.<init>(r3, r4, r5)
            rz5$b r3 = p000.rz5.m51446a()
            rz5$b r0 = r3.mo47590B(r0)
            rz5 r0 = r0.mo47599m()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.mo48453h0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.mo48443d0(r0)
            r11.mo48430P(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            p000.ij1.m19656o(r11, r1)
            p000.ga7.m17793t0(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            p000.pe7.m49896b(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
