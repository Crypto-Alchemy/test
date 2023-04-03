package p000;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"(\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"\u0018\u0010\u0016\u001a\u00020\u0014*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, mo44877d2 = {"Landroid/view/View;", "Lws4;", "listener", "Lr37;", "a", "e", "", "I", "PoolingContainerListenerHolderTag", "b", "IsPoolingContainerTag", "", "value", "c", "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isPoolingContainer", "d", "isWithinPoolingContainer", "Lxs4;", "(Landroid/view/View;)Lxs4;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: vs4 */
/* compiled from: PoolingContainer.kt */
public final class vs4 {

    /* renamed from: a */
    public static final int f18891a = r35.pooling_container_listener_holder_tag;

    /* renamed from: b */
    public static final int f18892b = r35.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    /* renamed from: a */
    public static final void m29090a(View view, ws4 ws4) {
        vx2.m53591g(view, "<this>");
        vx2.m53591g(ws4, "listener");
        m29091b(view).mo27873a(ws4);
    }

    /* renamed from: b */
    public static final xs4 m29091b(View view) {
        int i = f18891a;
        xs4 xs4 = (xs4) view.getTag(i);
        if (xs4 != null) {
            return xs4;
        }
        xs4 xs42 = new xs4();
        view.setTag(i, xs42);
        return xs42;
    }

    /* renamed from: c */
    public static final boolean m29092c(View view) {
        Boolean bool;
        vx2.m53591g(view, "<this>");
        Object tag = view.getTag(f18892b);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m29093d(View view) {
        vx2.m53591g(view, "<this>");
        for (ViewParent next : ViewKt.m4350a(view)) {
            if ((next instanceof View) && m29092c((View) next)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    /* renamed from: e */
    public static final void m29094e(View view, ws4 ws4) {
        vx2.m53591g(view, "<this>");
        vx2.m53591g(ws4, "listener");
        m29091b(view).mo27874b(ws4);
    }
}
