package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w8 */
/* compiled from: AccessibilityNodeProviderCompat */
public class C3523w8 {

    /* renamed from: a */
    public final Object f19041a;

    /* renamed from: w8$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    public static class C3524a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C3523w8 f19042a;

        public C3524a(C3523w8 w8Var) {
            this.f19042a = w8Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C3335t8 b = this.f19042a.mo24263b(i);
            if (b == null) {
                return null;
            }
            return b.mo26220R0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C3335t8> c = this.f19042a.mo27463c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo26220R0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f19042a.mo24265f(i, i2, bundle);
        }
    }

    /* renamed from: w8$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    public static class C3525b extends C3524a {
        public C3525b(C3523w8 w8Var) {
            super(w8Var);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C3335t8 d = this.f19042a.mo24264d(i);
            if (d == null) {
                return null;
            }
            return d.mo26220R0();
        }
    }

    /* renamed from: w8$c */
    /* compiled from: AccessibilityNodeProviderCompat */
    public static class C3526c extends C3525b {
        public C3526c(C3523w8 w8Var) {
            super(w8Var);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f19042a.mo27462a(i, C3335t8.m27495S0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C3523w8() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19041a = new C3526c(this);
        } else {
            this.f19041a = new C3525b(this);
        }
    }

    /* renamed from: a */
    public void mo27462a(int i, C3335t8 t8Var, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C3335t8 mo24263b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C3335t8> mo27463c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C3335t8 mo24264d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo27464e() {
        return this.f19041a;
    }

    /* renamed from: f */
    public boolean mo24265f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C3523w8(Object obj) {
        this.f19041a = obj;
    }
}
