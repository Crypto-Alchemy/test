package androidx.navigation;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u0012"}, mo44877d2 = {"Landroidx/navigation/Navigation;", "", "Landroid/app/Activity;", "activity", "", "viewId", "Landroidx/navigation/NavController;", "b", "Landroid/view/View;", "view", "c", "controller", "Lr37;", "f", "d", "e", "<init>", "()V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Navigation.kt */
public final class Navigation {

    /* renamed from: a */
    public static final Navigation f6075a = new Navigation();

    /* renamed from: b */
    public static final NavController m8327b(Activity activity, int i) {
        vx2.m53591g(activity, "activity");
        View t = C3582x9.m29962t(activity, i);
        vx2.m53590f(t, "requireViewById<View>(activity, viewId)");
        NavController d = f6075a.mo8592d(t);
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    /* renamed from: c */
    public static final NavController m8328c(View view) {
        vx2.m53591g(view, "view");
        NavController d = f6075a.mo8592d(view);
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: f */
    public static final void m8329f(View view, NavController navController) {
        vx2.m53591g(view, "view");
        view.setTag(a35.nav_controller_view_tag, navController);
    }

    /* renamed from: d */
    public final NavController mo8592d(View view) {
        return (NavController) SequencesKt___SequencesKt.m63028r(SequencesKt___SequencesKt.m63035y(SequencesKt__SequencesKt.m63015j(view, Navigation$findViewNavController$1.INSTANCE), Navigation$findViewNavController$2.INSTANCE));
    }

    /* renamed from: e */
    public final NavController mo8593e(View view) {
        Object tag = view.getTag(a35.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }
}
