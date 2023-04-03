package p000;

import androidx.paging.multicast.ChannelManager;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\bb\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, mo44877d2 = {"Ln40;", "T", "", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "item", "Lr37;", "a", "", "isEmpty", "", "b", "()Ljava/util/Collection;", "items", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: n40 */
/* compiled from: ChannelManager.kt */
public interface n40<T> {

    @Metadata(mo44875bv = {1, 0, 3}, mo44878k = 3, mo44879mv = {1, 4, 2})
    /* renamed from: n40$a */
    /* compiled from: ChannelManager.kt */
    public static final class C2864a {
        /* renamed from: a */
        public static <T> boolean m22784a(n40<T> n40) {
            return n40.mo22206b().isEmpty();
        }
    }

    /* renamed from: a */
    void mo22205a(ChannelManager.C1194b.C1196b.C1199c<T> cVar);

    /* renamed from: b */
    Collection<ChannelManager.C1194b.C1196b.C1199c<T>> mo22206b();

    boolean isEmpty();
}
