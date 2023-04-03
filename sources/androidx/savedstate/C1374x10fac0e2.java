package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroid/view/View;", "view", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
public final class C1374x10fac0e2 extends Lambda implements rc2<View, View> {
    public static final C1374x10fac0e2 INSTANCE = new C1374x10fac0e2();

    public C1374x10fac0e2() {
        super(1);
    }

    public final View invoke(View view) {
        vx2.m53591g(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
