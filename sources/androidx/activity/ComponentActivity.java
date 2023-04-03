package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.C0714d;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.C0726j;
import androidx.lifecycle.C0729l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C3253sa;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements hd7, C0714d, il5, zg4, C3590xa, ch4, vh4, kh4, mh4, it3 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final xr0 mContextAwareHelper;
    private C0729l.C0733b mDefaultFactory;
    private final C0716f mLifecycleRegistry;
    private final lt3 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<yq0<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<yq0<b04>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<yq0<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<yq0<po4>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<yq0<Integer>> mOnTrimMemoryListeners;
    public final hl5 mSavedStateRegistryController;
    private gd7 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0095a implements Runnable {
        public C0095a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0096b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        public class C0097a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f347a;

            /* renamed from: d */
            public final /* synthetic */ C3253sa.C3254a f348d;

            public C0097a(int i, C3253sa.C3254a aVar) {
                this.f347a = i;
                this.f348d = aVar;
            }

            public void run() {
                C0096b.this.mo928c(this.f347a, this.f348d.mo25691a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        public class C0098b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f350a;

            /* renamed from: d */
            public final /* synthetic */ IntentSender.SendIntentException f351d;

            public C0098b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f350a = i;
                this.f351d = sendIntentException;
            }

            public void run() {
                C0096b.this.mo927b(this.f350a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f351d));
            }
        }

        public C0096b() {
        }

        /* renamed from: f */
        public <I, O> void mo909f(int i, C3253sa<I, O> saVar, I i2, C2945oa oaVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            C3253sa.C3254a<O> b = saVar.mo25690b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0097a(i, b));
                return;
            }
            Intent a = saVar.mo6044a(componentActivity, i2);
            Bundle bundle = null;
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C3582x9.m29961s(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C3582x9.m29967y(componentActivity, intentSenderRequest.mo944d(), i, intentSenderRequest.mo941a(), intentSenderRequest.mo942b(), intentSenderRequest.mo943c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0098b(i, e));
                }
            } else {
                C3582x9.m29966x(componentActivity, a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public static class C0099c {
        /* renamed from: a */
        public static void m622a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    public static final class C0100d {

        /* renamed from: a */
        public Object f353a;

        /* renamed from: b */
        public gd7 f354b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new xr0();
        this.mMenuHostHelper = new lt3(new tm0(this));
        this.mLifecycleRegistry = new C0716f(this);
        hl5 a = hl5.m18968a(this);
        this.mSavedStateRegistryController = a;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0095a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0096b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().mo6295a(new C0715e() {
                /* renamed from: f */
                public void mo907f(ug3 ug3, Lifecycle.Event event) {
                    View view;
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            C0099c.m622a(view);
                        }
                    }
                }
            });
            getLifecycle().mo6295a(new C0715e() {
                /* renamed from: f */
                public void mo907f(ug3 ug3, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.mo27860b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo20539a();
                        }
                    }
                }
            });
            getLifecycle().mo6295a(new C0715e() {
                /* renamed from: f */
                public void mo907f(ug3 ug3, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo6297c(this);
                }
            });
            a.mo21222c();
            SavedStateHandleSupport.m5075c(this);
            if (i <= 23) {
                getLifecycle().mo6295a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().mo20648h(ACTIVITY_RESULT_TAG, new um0(this));
            addOnContextAvailableListener(new vm0(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        me7.m22275b(getWindow().getDecorView(), this);
        oe7.m23782a(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m9848b(getWindow().getDecorView(), this);
        ne7.m23133a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.mo932h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Context context) {
        Bundle b = getSavedStateRegistry().mo20643b(ACTIVITY_RESULT_TAG);
        if (b != null) {
            this.mActivityResultRegistry.mo931g(b);
        }
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(eu3 eu3) {
        this.mMenuHostHelper.mo22967c(eu3);
    }

    public final void addOnConfigurationChangedListener(yq0<Configuration> yq0) {
        this.mOnConfigurationChangedListeners.add(yq0);
    }

    public final void addOnContextAvailableListener(eh4 eh4) {
        this.mContextAwareHelper.mo27859a(eh4);
    }

    public final void addOnMultiWindowModeChangedListener(yq0<b04> yq0) {
        this.mOnMultiWindowModeChangedListeners.add(yq0);
    }

    public final void addOnNewIntentListener(yq0<Intent> yq0) {
        this.mOnNewIntentListeners.add(yq0);
    }

    public final void addOnPictureInPictureModeChangedListener(yq0<po4> yq0) {
        this.mOnPictureInPictureModeChangedListeners.add(yq0);
    }

    public final void addOnTrimMemoryListener(yq0<Integer> yq0) {
        this.mOnTrimMemoryListeners.add(yq0);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0100d dVar = (C0100d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f354b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new gd7();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public zv0 getDefaultViewModelCreationExtras() {
        j04 j04 = new j04();
        if (getApplication() != null) {
            j04.mo21704c(C0729l.C0730a.f3993g, getApplication());
        }
        j04.mo21704c(SavedStateHandleSupport.f3932a, this);
        j04.mo21704c(SavedStateHandleSupport.f3933b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            j04.mo21704c(SavedStateHandleSupport.f3934c, getIntent().getExtras());
        }
        return j04;
    }

    public C0729l.C0733b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new C0726j(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0100d dVar = (C0100d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f353a;
        }
        return null;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final gl5 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo21221b();
    }

    public gd7 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.mo927b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo915d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<yq0<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.mo21223d(bundle);
        this.mContextAwareHelper.mo27861c(this);
        super.onCreate(bundle);
        ReportFragment.m5059g(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.mo22970h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.mo22972j(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        Iterator<yq0<b04>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new b04(z));
        }
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<yq0<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        this.mMenuHostHelper.mo22971i(menu);
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<yq0<po4>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new po4(z));
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.mo22973k(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.mo927b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        C0100d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        gd7 gd7 = this.mViewModelStore;
        if (gd7 == null && (dVar = (C0100d) getLastNonConfigurationInstance()) != null) {
            gd7 = dVar.f354b;
        }
        if (gd7 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0100d dVar2 = new C0100d();
        dVar2.f353a = onRetainCustomNonConfigurationInstance;
        dVar2.f354b = gd7;
        return dVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C0716f) {
            ((C0716f) lifecycle).mo6395o(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo21224e(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<yq0<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.mo27862d();
    }

    public final <I, O> C3529wa<I> registerForActivityResult(C3253sa<I, O> saVar, ActivityResultRegistry activityResultRegistry, C3191ra<O> raVar) {
        return activityResultRegistry.mo934j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, saVar, raVar);
    }

    public void removeMenuProvider(eu3 eu3) {
        this.mMenuHostHelper.mo22974l(eu3);
    }

    public final void removeOnConfigurationChangedListener(yq0<Configuration> yq0) {
        this.mOnConfigurationChangedListeners.remove(yq0);
    }

    public final void removeOnContextAvailableListener(eh4 eh4) {
        this.mContextAwareHelper.mo27863e(eh4);
    }

    public final void removeOnMultiWindowModeChangedListener(yq0<b04> yq0) {
        this.mOnMultiWindowModeChangedListeners.remove(yq0);
    }

    public final void removeOnNewIntentListener(yq0<Intent> yq0) {
        this.mOnNewIntentListeners.remove(yq0);
    }

    public final void removeOnPictureInPictureModeChangedListener(yq0<po4> yq0) {
        this.mOnPictureInPictureModeChangedListeners.remove(yq0);
    }

    public final void removeOnTrimMemoryListener(yq0<Integer> yq0) {
        this.mOnTrimMemoryListeners.remove(yq0);
    }

    public void reportFullyDrawn() {
        try {
            if (ls6.m21844d()) {
                ls6.m21841a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            ls6.m21842b();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(eu3 eu3, ug3 ug3) {
        this.mMenuHostHelper.mo22968d(eu3, ug3);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(eu3 eu3, ug3 ug3, Lifecycle.State state) {
        this.mMenuHostHelper.mo22969e(eu3, ug3, state);
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<yq0<b04>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new b04(z, configuration));
        }
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<yq0<po4>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new po4(z, configuration));
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> C3529wa<I> registerForActivityResult(C3253sa<I, O> saVar, C3191ra<O> raVar) {
        return registerForActivityResult(saVar, this.mActivityResultRegistry, raVar);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
