package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014R\u0014\u0010\u0010\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f¨\u0006\""}, mo44877d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "Lr37;", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "a", "I", "MaxRippleHosts", "", "Landroidx/compose/material/ripple/RippleHostView;", "d", "Ljava/util/List;", "rippleHosts", "e", "unusedRippleHosts", "Lzg5;", "g", "Lzg5;", "rippleHostMap", "k", "nextHostIndex", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RippleContainer.android.kt */
public final class RippleContainer extends ViewGroup {

    /* renamed from: a */
    public final int f1423a = 5;

    /* renamed from: d */
    public final List<RippleHostView> f1424d;

    /* renamed from: e */
    public final List<RippleHostView> f1425e;

    /* renamed from: g */
    public final zg5 f1426g;

    /* renamed from: k */
    public int f1427k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleContainer(Context context) {
        super(context);
        vx2.m53591g(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f1424d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1425e = arrayList2;
        this.f1426g = new zg5();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f1427k = 1;
        setTag(o35.hide_in_inspector_tag, Boolean.TRUE);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
