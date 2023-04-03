package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.C0149b;
import p000.C2346g9;
import p000.ka3;

/* renamed from: xm */
/* compiled from: AppCompatDialog */
public class C3629xm extends zm0 implements C3208rm {
    private C0149b mDelegate;
    private final ka3.C2650a mKeyDispatcher;

    public C3629xm(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(m15.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo1103d(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        getDelegate().mo1133u();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ka3.m20608e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo1112k(i);
    }

    public C0149b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0149b.m873j(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo1123p();
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo1127r();
    }

    public void onCreate(Bundle bundle) {
        getDelegate().mo1125q();
        super.onCreate(bundle);
        getDelegate().mo1131t(bundle);
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo1143z();
    }

    public void onSupportActionModeFinished(C2346g9 g9Var) {
    }

    public void onSupportActionModeStarted(C2346g9 g9Var) {
    }

    public C2346g9 onWindowStartingSupportActionMode(C2346g9.C2347a aVar) {
        return null;
    }

    public void setContentView(int i) {
        getDelegate().mo1062D(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo1073J(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo1060C(i);
    }

    public C3629xm(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C3556wm(this);
        C0149b delegate = getDelegate();
        delegate.mo1071I(getThemeResId(context, i));
        delegate.mo1131t((Bundle) null);
    }

    public void setContentView(View view) {
        getDelegate().mo1064E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo1066F(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo1073J(getContext().getString(i));
    }

    public C3629xm(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new C3556wm(this);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
