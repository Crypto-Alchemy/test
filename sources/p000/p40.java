package p000;

import androidx.paging.multicast.ChannelManager;
import java.util.ArrayDeque;
import kotlin.Metadata;
import p000.n40;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lp40;", "T", "Ln40;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "item", "Lr37;", "a", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "c", "()Ljava/util/ArrayDeque;", "items", "", "b", "I", "limit", "<init>", "(I)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: p40 */
/* compiled from: ChannelManager.kt */
public final class p40<T> implements n40<T> {

    /* renamed from: a */
    public final ArrayDeque<ChannelManager.C1194b.C1196b.C1199c<T>> f16275a;

    /* renamed from: b */
    public final int f16276b;

    public p40(int i) {
        this.f16276b = i;
        this.f16275a = new ArrayDeque<>(d75.m43385g(i, 10));
    }

    /* renamed from: a */
    public void mo22205a(ChannelManager.C1194b.C1196b.C1199c<T> cVar) {
        vx2.m53591g(cVar, "item");
        while (mo22206b().size() >= this.f16276b) {
            mo22206b().pollFirst();
        }
        mo22206b().offerLast(cVar);
    }

    /* renamed from: c */
    public ArrayDeque<ChannelManager.C1194b.C1196b.C1199c<T>> mo22206b() {
        return this.f16275a;
    }

    public boolean isEmpty() {
        return n40.C2864a.m22784a(this);
    }
}
