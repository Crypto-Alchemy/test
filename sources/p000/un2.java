package p000;

import androidx.recyclerview.widget.C1294g;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lun2;", "Landroidx/recyclerview/widget/g$f;", "Lqx1;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: un2 */
/* compiled from: CMCListCheckable.kt */
public final class un2 extends C1294g.C1300f<qx1> {

    /* renamed from: a */
    public static final un2 f45144a = new un2();

    /* renamed from: a */
    public boolean areContentsTheSame(qx1 qx1, qx1 qx12) {
        vx2.m53591g(qx1, "oldItem");
        vx2.m53591g(qx12, "newItem");
        if (!vx2.m53586b(qx1.mo65538c(), qx12.mo65538c()) || qx1.mo65539d() != qx12.mo65539d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean areItemsTheSame(qx1 qx1, qx1 qx12) {
        vx2.m53591g(qx1, "oldItem");
        vx2.m53591g(qx12, "newItem");
        return vx2.m53586b(qx1, qx12);
    }
}
