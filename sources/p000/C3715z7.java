package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p000.C3335t8;

/* renamed from: z7 */
/* compiled from: AccessibilityDelegateCompat */
public class C3715z7 {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f20475c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f20476a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f20477b;

    /* renamed from: z7$a */
    /* compiled from: AccessibilityDelegateCompat */
    public static final class C3716a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C3715z7 f20478a;

        public C3716a(C3715z7 z7Var) {
            this.f20478a = z7Var;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f20478a.mo5574a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3523w8 b = this.f20478a.mo3837b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo27464e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f20478a.mo5478f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3335t8 S0 = C3335t8.m27495S0(accessibilityNodeInfo);
            S0.mo26197F0(ga7.m17750W(view));
            S0.mo26262r0(ga7.m17745R(view));
            S0.mo26279z0(ga7.m17784p(view));
            S0.mo26209L0(ga7.m17731J(view));
            this.f20478a.mo5479g(view, S0);
            S0.mo26238f(accessibilityNodeInfo.getText(), view);
            List<C3335t8.C3336a> c = C3715z7.m30999c(view);
            for (int i = 0; i < c.size(); i++) {
                S0.mo26229b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f20478a.mo9957h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f20478a.mo5575i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f20478a.mo5480j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f20478a.mo9958l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f20478a.mo9959m(view, accessibilityEvent);
        }
    }

    /* renamed from: z7$b */
    /* compiled from: AccessibilityDelegateCompat */
    public static class C3717b {
        /* renamed from: a */
        public static AccessibilityNodeProvider m31012a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        public static boolean m31013b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C3715z7() {
        this(f20475c);
    }

    /* renamed from: c */
    public static List<C3335t8.C3336a> m30999c(View view) {
        List<C3335t8.C3336a> list = (List) view.getTag(q35.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: a */
    public boolean mo5574a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f20476a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C3523w8 mo3837b(View view) {
        AccessibilityNodeProvider a = C3717b.m31012a(this.f20476a, view);
        if (a != null) {
            return new C3523w8(a);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate mo28331d() {
        return this.f20477b;
    }

    /* renamed from: e */
    public final boolean mo28332e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = C3335t8.m27498q(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (q != null && i < q.length) {
                if (clickableSpan.equals(q[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
        this.f20476a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo5479g(View view, C3335t8 t8Var) {
        this.f20476a.onInitializeAccessibilityNodeInfo(view, t8Var.mo26220R0());
    }

    /* renamed from: h */
    public void mo9957h(View view, AccessibilityEvent accessibilityEvent) {
        this.f20476a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo5575i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f20476a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo5480j(View view, int i, Bundle bundle) {
        List<C3335t8.C3336a> c = m30999c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C3335t8.C3336a aVar = c.get(i2);
            if (aVar.mo26281b() == i) {
                z = aVar.mo26283d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C3717b.m31013b(this.f20476a, view, i, bundle);
        }
        if (z || i != q35.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        return mo28333k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: k */
    public final boolean mo28333k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(q35.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!mo28332e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: l */
    public void mo9958l(View view, int i) {
        this.f20476a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo9959m(View view, AccessibilityEvent accessibilityEvent) {
        this.f20476a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C3715z7(View.AccessibilityDelegate accessibilityDelegate) {
        this.f20476a = accessibilityDelegate;
        this.f20477b = new C3716a(this);
    }
}
