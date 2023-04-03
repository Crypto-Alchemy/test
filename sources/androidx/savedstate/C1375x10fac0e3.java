package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/view/View;", "view", "Lil5;", "invoke", "(Landroid/view/View;)Lil5;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
public final class C1375x10fac0e3 extends Lambda implements rc2<View, il5> {
    public static final C1375x10fac0e3 INSTANCE = new C1375x10fac0e3();

    public C1375x10fac0e3() {
        super(1);
    }

    public final il5 invoke(View view) {
        vx2.m53591g(view, "view");
        Object tag = view.getTag(d35.view_tree_saved_state_registry_owner);
        if (tag instanceof il5) {
            return (il5) tag;
        }
        return null;
    }
}
