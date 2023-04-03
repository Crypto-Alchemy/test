package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import p000.C2346g9;
import p000.gl5;
import p000.hm6;

public class AppCompatActivity extends FragmentActivity implements C3208rm, hm6.C2494a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private C0149b mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    public class C0121a implements gl5.C2404c {
        public C0121a() {
        }

        /* renamed from: a */
        public Bundle mo1056a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().mo1139x(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    public class C0122b implements eh4 {
        public C0122b() {
        }

        /* renamed from: a */
        public void mo1057a(Context context) {
            C0149b delegate = AppCompatActivity.this.getDelegate();
            delegate.mo1125q();
            delegate.mo1131t(AppCompatActivity.this.getSavedStateRegistry().mo20643b(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().mo20648h(DELEGATE_TAG, new C0121a());
        addOnContextAvailableListener(new C0122b());
    }

    private void initViewTreeOwners() {
        me7.m22275b(getWindow().getDecorView(), this);
        oe7.m23782a(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m9848b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo1103d(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo1108h(context));
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo954g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo964q(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo1112k(i);
    }

    public C0149b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0149b.m872i(this, this);
        }
        return this.mDelegate;
    }

    public C1671c9 getDrawerToggleDelegate() {
        return getDelegate().mo1115m();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo1119o();
    }

    public Resources getResources() {
        if (this.mResources == null && u87.m28120c()) {
            this.mResources = new u87(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo1123p();
    }

    public Intent getSupportParentActivityIntent() {
        return q44.m25386a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo1127r();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo1129s(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(hm6 hm6) {
        hm6.mo21303k(this);
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo1133u();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo957j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo1135v(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo1137w();
    }

    public void onPrepareSupportNavigateUpTaskStack(hm6 hm6) {
    }

    public void onStart() {
        super.onStart();
        getDelegate().mo1141y();
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo1143z();
    }

    public void onSupportActionModeFinished(C2346g9 g9Var) {
    }

    public void onSupportActionModeStarted(C2346g9 g9Var) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            hm6 o = hm6.m19090o(this);
            onCreateSupportNavigateUpTaskStack(o);
            onPrepareSupportNavigateUpTaskStack(o);
            o.mo21307s();
            try {
                C3582x9.m29956n(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo1073J(charSequence);
    }

    public C2346g9 onWindowStartingSupportActionMode(C2346g9.C2347a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo965r()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().mo1062D(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo1069H(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo1071I(i);
    }

    public C2346g9 startSupportActionMode(C2346g9.C2347a aVar) {
        return getDelegate().mo1075K(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo1127r();
    }

    public void supportNavigateUpTo(Intent intent) {
        q44.m25390e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo1060C(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return q44.m25391f(this, intent);
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo1064E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo1066F(view, layoutParams);
    }
}
