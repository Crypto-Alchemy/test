package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.fragment.app.h */
/* compiled from: FragmentStateManager */
public class C0680h {

    /* renamed from: a */
    public final C0678g f3844a;

    /* renamed from: b */
    public final C0683i f3845b;

    /* renamed from: c */
    public final Fragment f3846c;

    /* renamed from: d */
    public boolean f3847d = false;

    /* renamed from: e */
    public int f3848e = -1;

    /* renamed from: androidx.fragment.app.h$a */
    /* compiled from: FragmentStateManager */
    public class C0681a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f3849a;

        public C0681a(View view) {
            this.f3849a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3849a.removeOnAttachStateChangeListener(this);
            ga7.m17779m0(this.f3849a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.h$b */
    /* compiled from: FragmentStateManager */
    public static /* synthetic */ class C0682b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3851a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3851a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3851a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3851a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3851a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0680h.C0682b.<clinit>():void");
        }
    }

    public C0680h(C0678g gVar, C0683i iVar, Fragment fragment) {
        this.f3844a = gVar;
        this.f3845b = iVar;
        this.f3846c = fragment;
    }

    /* renamed from: a */
    public void mo6209a() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f3846c);
        }
        Fragment fragment = this.f3846c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0678g gVar = this.f3844a;
        Fragment fragment2 = this.f3846c;
        gVar.mo6193a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void mo6210b() {
        int j = this.f3845b.mo6244j(this.f3846c);
        Fragment fragment = this.f3846c;
        fragment.mContainer.addView(fragment.mView, j);
    }

    /* renamed from: c */
    public void mo6211c() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f3846c);
        }
        Fragment fragment = this.f3846c;
        Fragment fragment2 = fragment.mTarget;
        C0680h hVar = null;
        if (fragment2 != null) {
            C0680h n = this.f3845b.mo6248n(fragment2.mWho);
            if (n != null) {
                Fragment fragment3 = this.f3846c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                hVar = n;
            } else {
                throw new IllegalStateException("Fragment " + this.f3846c + " declared target fragment " + this.f3846c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (hVar = this.f3845b.mo6248n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3846c + " declared target fragment " + this.f3846c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (hVar != null) {
            hVar.mo6221m();
        }
        Fragment fragment4 = this.f3846c;
        fragment4.mHost = fragment4.mFragmentManager.mo6018x0();
        Fragment fragment5 = this.f3846c;
        fragment5.mParentFragment = fragment5.mFragmentManager.mo5913A0();
        this.f3844a.mo6199g(this.f3846c, false);
        this.f3846c.performAttach();
        this.f3844a.mo6194b(this.f3846c, false);
    }

    /* renamed from: d */
    public int mo6212d() {
        Fragment fragment = this.f3846c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f3848e;
        int i2 = C0682b.f3851a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment2 = this.f3846c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.f3848e, 2);
                View view = this.f3846c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3848e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.f3846c.mAdded) {
            i = Math.min(i, 1);
        }
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        Fragment fragment3 = this.f3846c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            lifecycleImpact = SpecialEffectsController.m4815o(viewGroup, fragment3.getParentFragmentManager()).mo6109l(this);
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f3846c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f3846c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.f3846c);
        }
        return i;
    }

    /* renamed from: e */
    public void mo6213e() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f3846c);
        }
        Fragment fragment = this.f3846c;
        if (!fragment.mIsCreated) {
            this.f3844a.mo6200h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f3846c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C0678g gVar = this.f3844a;
            Fragment fragment3 = this.f3846c;
            gVar.mo6195c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f3846c.mState = 1;
    }

    /* renamed from: f */
    public void mo6214f() {
        String str;
        if (!this.f3846c.mFromLayout) {
            if (FragmentManager.m4630K0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f3846c);
            }
            Fragment fragment = this.f3846c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3846c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.mo6005t0().mo5861c(this.f3846c.mContainerId);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3846c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f3846c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3846c.mContainerId) + " (" + str + ") for fragment " + this.f3846c);
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            FragmentStrictMode.m5007p(this.f3846c, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3846c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3846c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.f3846c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3846c;
                fragment5.mView.setTag(s35.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    mo6210b();
                }
                Fragment fragment6 = this.f3846c;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                if (ga7.m17746S(this.f3846c.mView)) {
                    ga7.m17779m0(this.f3846c.mView);
                } else {
                    View view2 = this.f3846c.mView;
                    view2.addOnAttachStateChangeListener(new C0681a(view2));
                }
                this.f3846c.performViewCreated();
                C0678g gVar = this.f3844a;
                Fragment fragment7 = this.f3846c;
                gVar.mo6205m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.f3846c.mView.getVisibility();
                this.f3846c.setPostOnViewCreatedAlpha(this.f3846c.mView.getAlpha());
                Fragment fragment8 = this.f3846c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.f3846c.setFocusedView(findFocus);
                        if (FragmentManager.m4630K0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("requestFocus: Saved focused view ");
                            sb2.append(findFocus);
                            sb2.append(" for Fragment ");
                            sb2.append(this.f3846c);
                        }
                    }
                    this.f3846c.mView.setAlpha(Utils.FLOAT_EPSILON);
                }
            }
            this.f3846c.mState = 2;
        }
    }

    /* renamed from: g */
    public void mo6215g() {
        boolean z;
        boolean z2;
        Fragment f;
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f3846c);
        }
        Fragment fragment = this.f3846c;
        boolean z3 = true;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Fragment fragment2 = this.f3846c;
            if (!fragment2.mBeingSaved) {
                this.f3845b.mo6234B(fragment2.mWho, (FragmentState) null);
            }
        }
        if (z || this.f3845b.mo6250p().mo19839n(this.f3846c)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C0675e<?> eVar = this.f3846c.mHost;
            if (eVar instanceof hd7) {
                z3 = this.f3845b.mo6250p().mo19836k();
            } else if (eVar.mo6184f() instanceof Activity) {
                z3 = true ^ ((Activity) eVar.mo6184f()).isChangingConfigurations();
            }
            if ((z && !this.f3846c.mBeingSaved) || z3) {
                this.f3845b.mo6250p().mo19827c(this.f3846c);
            }
            this.f3846c.performDestroy();
            this.f3844a.mo6196d(this.f3846c, false);
            for (C0680h next : this.f3845b.mo6245k()) {
                if (next != null) {
                    Fragment k = next.mo6219k();
                    if (this.f3846c.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.f3846c;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f3846c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f3845b.mo6240f(str);
            }
            this.f3845b.mo6253s(this);
            return;
        }
        String str2 = this.f3846c.mTargetWho;
        if (!(str2 == null || (f = this.f3845b.mo6240f(str2)) == null || !f.mRetainInstance)) {
            this.f3846c.mTarget = f;
        }
        this.f3846c.mState = 0;
    }

    /* renamed from: h */
    public void mo6216h() {
        View view;
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f3846c);
        }
        Fragment fragment = this.f3846c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f3846c.performDestroyView();
        this.f3844a.mo6206n(this.f3846c, false);
        Fragment fragment2 = this.f3846c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f3846c.mInLayout = false;
    }

    /* renamed from: i */
    public void mo6217i() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f3846c);
        }
        this.f3846c.performDetach();
        boolean z = false;
        this.f3844a.mo6197e(this.f3846c, false);
        Fragment fragment = this.f3846c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f3845b.mo6250p().mo19839n(this.f3846c)) {
            if (FragmentManager.m4630K0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f3846c);
            }
            this.f3846c.initState();
        }
    }

    /* renamed from: j */
    public void mo6218j() {
        Fragment fragment = this.f3846c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m4630K0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f3846c);
            }
            Fragment fragment2 = this.f3846c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f3846c.mSavedFragmentState);
            View view = this.f3846c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3846c;
                fragment3.mView.setTag(s35.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f3846c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3846c.performViewCreated();
                C0678g gVar = this.f3844a;
                Fragment fragment5 = this.f3846c;
                gVar.mo6205m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3846c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment mo6219k() {
        return this.f3846c;
    }

    /* renamed from: l */
    public final boolean mo6220l(View view) {
        if (view == this.f3846c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3846c.mView) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public void mo6221m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3847d) {
            try {
                this.f3847d = true;
                boolean z = false;
                while (true) {
                    int d = mo6212d();
                    Fragment fragment = this.f3846c;
                    int i = fragment.mState;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo6217i();
                                    break;
                                case 0:
                                    if (fragment.mBeingSaved && this.f3845b.mo6251q(fragment.mWho) == null) {
                                        mo6226r();
                                    }
                                    mo6215g();
                                    break;
                                case 1:
                                    mo6216h();
                                    this.f3846c.mState = 1;
                                    break;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m4630K0(3)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("movefrom ACTIVITY_CREATED: ");
                                        sb.append(this.f3846c);
                                    }
                                    Fragment fragment2 = this.f3846c;
                                    if (fragment2.mBeingSaved) {
                                        mo6226r();
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        mo6227s();
                                    }
                                    Fragment fragment3 = this.f3846c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController.m4815o(viewGroup2, fragment3.getParentFragmentManager()).mo6101d(this);
                                    }
                                    this.f3846c.mState = 3;
                                    break;
                                case 4:
                                    mo6230v();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    mo6222n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo6211c();
                                    break;
                                case 1:
                                    mo6213e();
                                    break;
                                case 2:
                                    mo6218j();
                                    mo6214f();
                                    break;
                                case 3:
                                    mo6209a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController.m4815o(viewGroup3, fragment.getParentFragmentManager()).mo6099b(SpecialEffectsController.Operation.State.from(this.f3846c.mView.getVisibility()), this);
                                    }
                                    this.f3846c.mState = 4;
                                    break;
                                case 5:
                                    mo6229u();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    mo6224p();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f3846c.mBeingSaved) {
                            if (FragmentManager.m4630K0(3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Cleaning up state of never attached fragment: ");
                                sb2.append(this.f3846c);
                            }
                            this.f3845b.mo6250p().mo19827c(this.f3846c);
                            this.f3845b.mo6253s(this);
                            if (FragmentManager.m4630K0(3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("initState called for fragment: ");
                                sb3.append(this.f3846c);
                            }
                            this.f3846c.initState();
                        }
                        Fragment fragment4 = this.f3846c;
                        if (fragment4.mHiddenChanged) {
                            if (!(fragment4.mView == null || (viewGroup = fragment4.mContainer) == null)) {
                                SpecialEffectsController o = SpecialEffectsController.m4815o(viewGroup, fragment4.getParentFragmentManager());
                                if (this.f3846c.mHidden) {
                                    o.mo6100c(this);
                                } else {
                                    o.mo6102e(this);
                                }
                            }
                            Fragment fragment5 = this.f3846c;
                            FragmentManager fragmentManager = fragment5.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.mo5930I0(fragment5);
                            }
                            Fragment fragment6 = this.f3846c;
                            fragment6.mHiddenChanged = false;
                            fragment6.onHiddenChanged(fragment6.mHidden);
                            this.f3846c.mChildFragmentManager.mo5934L();
                        }
                        this.f3847d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f3847d = false;
                throw th;
            }
        } else if (FragmentManager.m4630K0(2)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Ignoring re-entrant call to moveToExpectedState() for ");
            sb4.append(mo6219k());
        }
    }

    /* renamed from: n */
    public void mo6222n() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f3846c);
        }
        this.f3846c.performPause();
        this.f3844a.mo6198f(this.f3846c, false);
    }

    /* renamed from: o */
    public void mo6223o(ClassLoader classLoader) {
        Bundle bundle = this.f3846c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3846c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3846c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3846c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f3846c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3846c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f3846c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3846c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* renamed from: p */
    public void mo6224p() {
        String str;
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f3846c);
        }
        View focusedView = this.f3846c.getFocusedView();
        if (focusedView != null && mo6220l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f3846c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3846c.mView.findFocus());
            }
        }
        this.f3846c.setFocusedView((View) null);
        this.f3846c.performResume();
        this.f3844a.mo6201i(this.f3846c, false);
        Fragment fragment = this.f3846c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public final Bundle mo6225q() {
        Bundle bundle = new Bundle();
        this.f3846c.performSaveInstanceState(bundle);
        this.f3844a.mo6202j(this.f3846c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3846c.mView != null) {
            mo6227s();
        }
        if (this.f3846c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3846c.mSavedViewState);
        }
        if (this.f3846c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3846c.mSavedViewRegistryState);
        }
        if (!this.f3846c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3846c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: r */
    public void mo6226r() {
        FragmentState fragmentState = new FragmentState(this.f3846c);
        Fragment fragment = this.f3846c;
        if (fragment.mState <= -1 || fragmentState.f3729H != null) {
            fragmentState.f3729H = fragment.mSavedFragmentState;
        } else {
            Bundle q = mo6225q();
            fragmentState.f3729H = q;
            if (this.f3846c.mTargetWho != null) {
                if (q == null) {
                    fragmentState.f3729H = new Bundle();
                }
                fragmentState.f3729H.putString("android:target_state", this.f3846c.mTargetWho);
                int i = this.f3846c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f3729H.putInt("android:target_req_state", i);
                }
            }
        }
        this.f3845b.mo6234B(this.f3846c.mWho, fragmentState);
    }

    /* renamed from: s */
    public void mo6227s() {
        if (this.f3846c.mView != null) {
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Saving view state for fragment ");
                sb.append(this.f3846c);
                sb.append(" with view ");
                sb.append(this.f3846c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3846c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3846c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3846c.mViewLifecycleOwner.mo21804e(bundle);
            if (!bundle.isEmpty()) {
                this.f3846c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* renamed from: t */
    public void mo6228t(int i) {
        this.f3848e = i;
    }

    /* renamed from: u */
    public void mo6229u() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f3846c);
        }
        this.f3846c.performStart();
        this.f3844a.mo6203k(this.f3846c, false);
    }

    /* renamed from: v */
    public void mo6230v() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f3846c);
        }
        this.f3846c.performStop();
        this.f3844a.mo6204l(this.f3846c, false);
    }

    public C0680h(C0678g gVar, C0683i iVar, ClassLoader classLoader, C0674d dVar, FragmentState fragmentState) {
        this.f3844a = gVar;
        this.f3845b = iVar;
        Fragment a = fragmentState.mo6070a(dVar, classLoader);
        this.f3846c = a;
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a);
        }
    }

    public C0680h(C0678g gVar, C0683i iVar, Fragment fragment, FragmentState fragmentState) {
        this.f3844a = gVar;
        this.f3845b = iVar;
        this.f3846c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f3729H;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
