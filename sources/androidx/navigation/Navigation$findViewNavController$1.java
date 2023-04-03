package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroid/view/View;", "it", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Navigation.kt */
public final class Navigation$findViewNavController$1 extends Lambda implements rc2<View, View> {
    public static final Navigation$findViewNavController$1 INSTANCE = new Navigation$findViewNavController$1();

    public Navigation$findViewNavController$1() {
        super(1);
    }

    public final View invoke(View view) {
        vx2.m53591g(view, "it");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
