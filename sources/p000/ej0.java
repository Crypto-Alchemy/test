package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo44877d2 = {"Lej0;", "", "", "chain", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/collectible/RoomCollectionAndNft;", "f", "Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "b", "(ILns0;)Ljava/lang/Object;", "collection", "", "e", "(Lnet/safemoon/androidwallet/model/collectible/RoomCollection;Lns0;)Ljava/lang/Object;", "id", "order", "Lr37;", "a", "(JILns0;)Ljava/lang/Object;", "typeDeleteNft", "d", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ej0 */
/* compiled from: CollectionDao.kt */
public interface ej0 {
    /* renamed from: a */
    Object mo51484a(long j, int i, ns0<? super r37> ns0);

    /* renamed from: b */
    Object mo51485b(int i, ns0<? super List<RoomCollection>> ns0);

    /* renamed from: c */
    Object mo51486c(RoomCollection roomCollection, ns0<? super r37> ns0);

    /* renamed from: d */
    Object mo51487d(long j, int i, ns0<? super r37> ns0);

    /* renamed from: e */
    Object mo51488e(RoomCollection roomCollection, ns0<? super Long> ns0);

    /* renamed from: f */
    LiveData<List<RoomCollectionAndNft>> mo51489f(int i);
}
