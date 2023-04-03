package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import p000.ka3;

public class ComponentActivity extends Activity implements ug3, ka3.C2650a {
    private y16<Class<? extends C0549a>, C0549a> mExtraDataMap = new y16<>();
    private C0716f mLifecycleRegistry = new C0716f(this);

    @Deprecated
    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C0549a {
    }

    private static boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                return x40.m29875d();
            case 3:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !ka3.m20607d(decorView, keyEvent)) {
            return ka3.m20608e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !ka3.m20607d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C0549a> T getExtraData(Class<T> cls) {
        return (C0549a) this.mExtraDataMap.get(cls);
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m5059g(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo6391j(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(C0549a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
