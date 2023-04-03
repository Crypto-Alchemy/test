package androidx.core.view;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: View.kt */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements rc2<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final ViewParent invoke(ViewParent viewParent) {
        vx2.m53591g(viewParent, "p0");
        return viewParent.getParent();
    }
}
