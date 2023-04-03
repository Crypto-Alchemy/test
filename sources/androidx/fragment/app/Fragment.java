package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.C0714d;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.C0726j;
import androidx.lifecycle.C0729l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ug3, hd7, C0714d, il5 {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C0625j mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public C0729l.C0733b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public C0675e<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C0716f mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<C0627l> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final C0627l mSavedStateAttachListener;
    public hl5 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public jb2 mViewLifecycleOwner;
    public k04<ug3> mViewLifecycleOwnerLiveData;
    public String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0615a();

        /* renamed from: a */
        public final Bundle f3609a;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C0615a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3609a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f3609a);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C0616a extends C3529wa<I> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f3610a;

        /* renamed from: b */
        public final /* synthetic */ C3253sa f3611b;

        public C0616a(AtomicReference atomicReference, C3253sa saVar) {
            this.f3610a = atomicReference;
            this.f3611b = saVar;
        }

        /* renamed from: b */
        public void mo937b(I i, C2945oa oaVar) {
            C3529wa waVar = (C3529wa) this.f3610a.get();
            if (waVar != null) {
                waVar.mo937b(i, oaVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: c */
        public void mo938c() {
            C3529wa waVar = (C3529wa) this.f3610a.getAndSet((Object) null);
            if (waVar != null) {
                waVar.mo938c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class C0617b implements Runnable {
        public C0617b() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C0618c extends C0627l {
        public C0618c() {
            super((C0617b) null);
        }

        /* renamed from: a */
        public void mo5858a() {
            Fragment.this.mSavedStateRegistryController.mo21222c();
            SavedStateHandleSupport.m5075c(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public class C0619d implements Runnable {
        public C0619d() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public class C0620e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SpecialEffectsController f3616a;

        public C0620e(SpecialEffectsController specialEffectsController) {
            this.f3616a = specialEffectsController;
        }

        public void run() {
            this.f3616a.mo6104g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public class C0621f extends k92 {
        public C0621f() {
        }

        /* renamed from: c */
        public View mo5861c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: d */
        public boolean mo5862d() {
            if (Fragment.this.mView != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    public class C0622g implements sd2<Void, ActivityResultRegistry> {
        public C0622g() {
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            Fragment fragment = Fragment.this;
            C0675e<?> eVar = fragment.mHost;
            if (eVar instanceof C3590xa) {
                return ((C3590xa) eVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public class C0623h implements sd2<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f3620a;

        public C0623h(ActivityResultRegistry activityResultRegistry) {
            this.f3620a = activityResultRegistry;
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            return this.f3620a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public class C0624i extends C0627l {

        /* renamed from: a */
        public final /* synthetic */ sd2 f3622a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f3623b;

        /* renamed from: c */
        public final /* synthetic */ C3253sa f3624c;

        /* renamed from: d */
        public final /* synthetic */ C3191ra f3625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0624i(sd2 sd2, AtomicReference atomicReference, C3253sa saVar, C3191ra raVar) {
            super((C0617b) null);
            this.f3622a = sd2;
            this.f3623b = atomicReference;
            this.f3624c = saVar;
            this.f3625d = raVar;
        }

        /* renamed from: a */
        public void mo5858a() {
            this.f3623b.set(((ActivityResultRegistry) this.f3622a.apply(null)).mo934j(Fragment.this.generateActivityResultKey(), Fragment.this, this.f3624c, this.f3625d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public static class C0625j {

        /* renamed from: a */
        public View f3627a;

        /* renamed from: b */
        public boolean f3628b;

        /* renamed from: c */
        public int f3629c;

        /* renamed from: d */
        public int f3630d;

        /* renamed from: e */
        public int f3631e;

        /* renamed from: f */
        public int f3632f;

        /* renamed from: g */
        public int f3633g;

        /* renamed from: h */
        public ArrayList<String> f3634h;

        /* renamed from: i */
        public ArrayList<String> f3635i;

        /* renamed from: j */
        public Object f3636j = null;

        /* renamed from: k */
        public Object f3637k;

        /* renamed from: l */
        public Object f3638l;

        /* renamed from: m */
        public Object f3639m;

        /* renamed from: n */
        public Object f3640n;

        /* renamed from: o */
        public Object f3641o;

        /* renamed from: p */
        public Boolean f3642p;

        /* renamed from: q */
        public Boolean f3643q;

        /* renamed from: r */
        public float f3644r;

        /* renamed from: s */
        public View f3645s;

        /* renamed from: t */
        public boolean f3646t;

        public C0625j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f3637k = obj;
            this.f3638l = null;
            this.f3639m = obj;
            this.f3640n = null;
            this.f3641o = obj;
            this.f3644r = 1.0f;
            this.f3645s = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    public static class C0626k {
        /* renamed from: a */
        public static void m4612a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    public static abstract class C0627l {
        public C0627l() {
        }

        public /* synthetic */ C0627l(C0617b bVar) {
            this();
        }

        /* renamed from: a */
        public abstract void mo5858a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new ea2();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C0617b();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new k04<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C0618c();
        initLifecycle();
    }

    private C0625j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0625j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        if (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return state.ordinal();
        }
        return Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0716f(this);
        this.mSavedStateRegistryController = hl5.m18968a(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private <I, O> C3529wa<I> prepareCallInternal(C3253sa<I, O> saVar, sd2<Void, ActivityResultRegistry> sd2, C3191ra<O> raVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C0624i(sd2, atomicReference, saVar, raVar));
            return new C0616a(atomicReference, saVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(C0627l lVar) {
        if (this.mState >= 0) {
            lVar.mo5858a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0625j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f3646t = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            SpecialEffectsController o = SpecialEffectsController.m4815o(viewGroup, fragmentManager);
            o.mo6111p();
            if (z) {
                this.mHost.mo6185g().post(new C0620e(o));
            } else {
                o.mo6104g();
            }
        }
    }

    public k92 createFragmentContainer() {
        return new C0621f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            dj3.m15131b(this).mo18792a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.mo5957Z(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.mo5987m0(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        C0675e<?> eVar = this.mHost;
        if (eVar == null) {
            return null;
        }
        return (FragmentActivity) eVar.mo6183e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f3643q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f3642p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3627a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        C0675e<?> eVar = this.mHost;
        if (eVar == null) {
            return null;
        }
        return eVar.mo6184f();
    }

    public zv0 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find Application instance from Context ");
            sb.append(requireContext().getApplicationContext());
            sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        j04 j04 = new j04();
        if (application != null) {
            j04.mo21704c(C0729l.C0730a.f3993g, application);
        }
        j04.mo21704c(SavedStateHandleSupport.f3932a, this);
        j04.mo21704c(SavedStateHandleSupport.f3933b, this);
        if (getArguments() != null) {
            j04.mo21704c(SavedStateHandleSupport.f3934c, getArguments());
        }
        return j04;
    }

    public C0729l.C0733b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m4630K0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find Application instance from Context ");
                    sb.append(requireContext().getApplicationContext());
                    sb.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C0726j(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3629c;
    }

    public Object getEnterTransition() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3636j;
    }

    public wz5 getEnterTransitionCallback() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public int getExitAnim() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3630d;
    }

    public Object getExitTransition() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3638l;
    }

    public wz5 getExitTransitionCallback() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public View getFocusedView() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3645s;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C0675e<?> eVar = this.mHost;
        if (eVar == null) {
            return null;
        }
        return eVar.mo5887h();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public dj3 getLoaderManager() {
        return dj3.m15131b(this);
    }

    public int getNextTransition() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3633g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f3628b;
    }

    public int getPopEnterAnim() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3631e;
    }

    public int getPopExitAnim() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3632f;
    }

    public float getPostOnViewCreatedAlpha() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f3644r;
    }

    public Object getReenterTransition() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3639m;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.m5001j(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3637k;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    public final gl5 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo21221b();
    }

    public Object getSharedElementEnterTransition() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3640n;
    }

    public Object getSharedElementReturnTransition() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3641o;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f3634h) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f3635i) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.m5002k(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public ug3 getViewLifecycleOwner() {
        jb2 jb2 = this.mViewLifecycleOwner;
        if (jb2 != null) {
            return jb2;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<ug3> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public gd7 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.mo5924F0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new ea2();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        if (this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.mo5939N0(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (!this.mMenuVisible || ((fragmentManager = this.mFragmentManager) != null && !fragmentManager.mo5941O0(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    public boolean isPostponed() {
        C0625j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f3646t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo5947R0();
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo5962b1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C0675e<?> eVar = this.mHost;
        Activity e = eVar == null ? null : eVar.mo6183e();
        if (e != null) {
            this.mCalled = false;
            onAttach(e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.mo5945Q0(1)) {
            this.mChildFragmentManager.mo5922E();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        C0675e<?> eVar = this.mHost;
        Activity e = eVar == null ? null : eVar.mo6183e();
        if (e != null) {
            this.mCalled = false;
            onInflate(e, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo5962b1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.mo5912A();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<C0627l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo5858a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.mo5991o(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.mo6184f());
        if (this.mCalled) {
            this.mFragmentManager.mo5933K(this);
            this.mChildFragmentManager.mo5915B();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.mo5920D(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo5962b1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo6295a(new C0715e() {
            /* renamed from: f */
            public void mo907f(ug3 ug3, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.mView) != null) {
                    C0626k.m4612a(view);
                }
            }
        });
        this.mSavedStateRegistryController.mo21223d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo6389h(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.mo5923F(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.mo5962b1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new jb2(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo21801b();
            me7.m22275b(this.mView, this.mViewLifecycleOwner);
            oe7.m23782a(this.mView, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.m9848b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo21802c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.mo5925G();
        this.mLifecycleRegistry.mo6389h(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.mo5927H();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo6296b().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.mo21800a(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            dj3.m15131b(this).mo18793c();
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.mo5932J0()) {
            this.mChildFragmentManager.mo5925G();
            this.mChildFragmentManager = new ea2();
        }
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.mo5936M(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo5938N(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.mo5942P();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo21800a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo6389h(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.mo5946R(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean P0 = this.mFragmentManager.mo5943P0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != P0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(P0);
            onPrimaryNavigationFragmentChanged(P0);
            this.mChildFragmentManager.mo5948S();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.mo5962b1();
        this.mChildFragmentManager.mo5965d0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C0716f fVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            fVar.mo6389h(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo21800a(event);
            }
            this.mChildFragmentManager.mo5949T();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo21224e(bundle);
        Bundle s1 = this.mChildFragmentManager.m4631S0();
        if (s1 != null) {
            bundle.putParcelable("android:support:fragments", s1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.mo5962b1();
        this.mChildFragmentManager.mo5965d0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C0716f fVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            fVar.mo6389h(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo21800a(event);
            }
            this.mChildFragmentManager.mo5950U();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.mo5952W();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo21800a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.mo6389h(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.mo5953X();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3646t = true;
    }

    public final <I, O> C3529wa<I> registerForActivityResult(C3253sa<I, O> saVar, C3191ra<O> raVar) {
        return prepareCallInternal(saVar, new C0622g(), raVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().mo5954X0(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.mo5998q1(parcelable);
            this.mChildFragmentManager.mo5922E();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo21803d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo21800a(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3643q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3642p = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            ensureAnimationInfo().f3629c = i;
            ensureAnimationInfo().f3630d = i2;
            ensureAnimationInfo().f3631e = i3;
            ensureAnimationInfo().f3632f = i4;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(wz5 wz5) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f3636j = obj;
    }

    public void setExitSharedElementCallback(wz5 wz5) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f3638l = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f3645s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo5890n();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.f3609a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo5890n();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f3633g = i;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().f3628b = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f3644r = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f3639m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.m5004m(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.mo5986m(this);
        } else {
            fragmentManager.mo5992o1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f3637k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f3640n = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0625j jVar = this.mAnimationInfo;
        jVar.f3634h = arrayList;
        jVar.f3635i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f3641o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            FragmentStrictMode.m5005n(this, fragment, i);
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 == null || fragmentManager == null || fragmentManager2 == fragmentManager) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        FragmentStrictMode.m5006o(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.mo5966d1(fragmentManager.mo6020y(this));
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 5 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C0675e<?> eVar = this.mHost;
        if (eVar != null) {
            return eVar.mo5889k(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i5 = i;
                sb.append(i);
                sb.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
            } else {
                IntentSender intentSender3 = intentSender;
                int i6 = i;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().mo5958Z0(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f3646t) {
            if (this.mHost == null) {
                ensureAnimationInfo().f3646t = false;
            } else if (Looper.myLooper() != this.mHost.mo6185g().getLooper()) {
                this.mHost.mo6185g().postAtFrontOfQueue(new C0619d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode.m5003l(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.mo5975i0(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0674d.m4892d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f3646t = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.mo6018x0().mo6185g();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> C3529wa<I> registerForActivityResult(C3253sa<I, O> saVar, ActivityResultRegistry activityResultRegistry, C3191ra<O> raVar) {
        return prepareCallInternal(saVar, new C0623h(activityResultRegistry), raVar);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0675e<?> eVar = this.mHost;
        if (eVar != null) {
            eVar.mo6187l(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().mo5956Y0(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C0675e<?> eVar = this.mHost;
        if (eVar != null) {
            LayoutInflater i = eVar.mo5888i();
            pe3.m24836a(i, this.mChildFragmentManager.mo6021y0());
            return i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
