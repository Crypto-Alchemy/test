package androidx.navigation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "Landroidx/navigation/NavController;", "it", "Landroid/view/View;", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Navigation.kt */
public final class Navigation$findViewNavController$2 extends Lambda implements rc2<View, NavController> {
    public static final Navigation$findViewNavController$2 INSTANCE = new Navigation$findViewNavController$2();

    public Navigation$findViewNavController$2() {
        super(1);
    }

    public final NavController invoke(View view) {
        vx2.m53591g(view, "it");
        return Navigation.f6075a.mo8593e(view);
    }
}
