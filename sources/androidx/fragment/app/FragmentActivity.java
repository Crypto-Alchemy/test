package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.C3582x9;

public class FragmentActivity extends ComponentActivity implements C3582x9.C3588f {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final C0716f mFragmentLifecycleRegistry = new C0716f(this);
    public final l92 mFragments = l92.m21322b(new C0628a());
    public boolean mResumed;
    public boolean mStopped = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C0628a extends C0675e<FragmentActivity> implements ch4, vh4, kh4, mh4, hd7, zg4, C3590xa, il5, ia2, it3 {
        public C0628a() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public void mo5886a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        public void addMenuProvider(eu3 eu3) {
            FragmentActivity.this.addMenuProvider(eu3);
        }

        public void addOnConfigurationChangedListener(yq0<Configuration> yq0) {
            FragmentActivity.this.addOnConfigurationChangedListener(yq0);
        }

        public void addOnMultiWindowModeChangedListener(yq0<b04> yq0) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(yq0);
        }

        public void addOnPictureInPictureModeChangedListener(yq0<po4> yq0) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(yq0);
        }

        public void addOnTrimMemoryListener(yq0<Integer> yq0) {
            FragmentActivity.this.addOnTrimMemoryListener(yq0);
        }

        /* renamed from: c */
        public View mo5861c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: d */
        public boolean mo5862d() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        public gl5 getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        public gd7 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        /* renamed from: i */
        public LayoutInflater mo5888i() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: k */
        public boolean mo5889k(String str) {
            return C3582x9.m29965w(FragmentActivity.this, str);
        }

        /* renamed from: n */
        public void mo5890n() {
            mo5891o();
        }

        /* renamed from: o */
        public void mo5891o() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        /* renamed from: p */
        public FragmentActivity mo5887h() {
            return FragmentActivity.this;
        }

        public void removeMenuProvider(eu3 eu3) {
            FragmentActivity.this.removeMenuProvider(eu3);
        }

        public void removeOnConfigurationChangedListener(yq0<Configuration> yq0) {
            FragmentActivity.this.removeOnConfigurationChangedListener(yq0);
        }

        public void removeOnMultiWindowModeChangedListener(yq0<b04> yq0) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(yq0);
        }

        public void removeOnPictureInPictureModeChangedListener(yq0<po4> yq0) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(yq0);
        }

        public void removeOnTrimMemoryListener(yq0<Integer> yq0) {
            FragmentActivity.this.removeOnTrimMemoryListener(yq0);
        }
    }

    public FragmentActivity() {
        init();
    }

    private void init() {
        getSavedStateRegistry().mo20648h(LIFECYCLE_TAG, new w82(this));
        addOnConfigurationChangedListener(new x82(this));
        addOnNewIntentListener(new y82(this));
        addOnContextAvailableListener(new z82(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo6389h(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.mo22705m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.mo22705m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.mo22694a((Fragment) null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment next : fragmentManager.mo6015w0()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), state);
                }
                jb2 jb2 = next.mViewLifecycleOwner;
                if (jb2 != null && jb2.getLifecycle().mo6296b().isAtLeast(Lifecycle.State.STARTED)) {
                    next.mViewLifecycleOwner.mo21805f(state);
                    z = true;
                }
                if (next.mLifecycleRegistry.mo6296b().isAtLeast(Lifecycle.State.STARTED)) {
                    next.mLifecycleRegistry.mo6395o(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo22706n(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                dj3.m15131b(this).mo18792a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.mo22704l().mo5957Z(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.mo22704l();
    }

    @Deprecated
    public dj3 getSupportLoaderManager() {
        return dj3.m15131b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo22705m();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo6389h(Lifecycle.Event.ON_CREATE);
        this.mFragments.mo22697e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo22698f();
        this.mFragmentLifecycleRegistry.mo6389h(Lifecycle.Event.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.mo22696d(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo22699g();
        this.mFragmentLifecycleRegistry.mo6389h(Lifecycle.Event.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo22705m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.mFragments.mo22705m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo22703k();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo6389h(Lifecycle.Event.ON_RESUME);
        this.mFragments.mo22700h();
    }

    public void onStart() {
        this.mFragments.mo22705m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo22695c();
        }
        this.mFragments.mo22703k();
        this.mFragmentLifecycleRegistry.mo6389h(Lifecycle.Event.ON_START);
        this.mFragments.mo22701i();
    }

    public void onStateNotSaved() {
        this.mFragments.mo22705m();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo22702j();
        this.mFragmentLifecycleRegistry.mo6389h(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(wz5 wz5) {
        C3582x9.m29963u(this, wz5);
    }

    public void setExitSharedElementCallback(wz5 wz5) {
        C3582x9.m29964v(this, wz5);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C3582x9.m29967y(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C3582x9.m29957o(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C3582x9.m29959q(this);
    }

    public void supportStartPostponedEnterTransition() {
        C3582x9.m29968z(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C3582x9.m29966x(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        init();
    }
}
