package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1330o;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lwh0;", "Landroidx/recyclerview/widget/o;", "Lqx1;", "Lsx1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "holder", "position", "Lr37;", "a", "Lpn2;", "Lpn2;", "iCallBack", "<init>", "(Lpn2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wh0 */
/* compiled from: CMCListCheckable.kt */
public final class wh0 extends C1330o<qx1, sx1> {

    /* renamed from: a */
    public final pn2 f45520a;

    public wh0(pn2 pn2) {
        super(un2.f45144a);
        this.f45520a = pn2;
    }

    /* renamed from: a */
    public void onBindViewHolder(sx1 sx1, int i) {
        vx2.m53591g(sx1, "holder");
        Object item = getItem(i);
        vx2.m53590f(item, "getItem(position)");
        sx1.mo65947b((qx1) item);
    }

    /* renamed from: b */
    public sx1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        yy2 c = yy2.m54894c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        vx2.m53590f(c, "inflate(LayoutInflater.f…t.context),parent, false)");
        return new sx1(c, this.f45520a);
    }
}
