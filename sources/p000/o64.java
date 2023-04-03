package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.collectible.RoomNFT;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0016J\u001b\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo44877d2 = {"Lo64;", "", "", "collectionId", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "d", "f", "(JLns0;)Ljava/lang/Object;", "", "chainId", "j", "(ILns0;)Ljava/lang/Object;", "", "token_id", "i", "(Ljava/lang/String;JLns0;)Ljava/lang/Object;", "id", "c", "nft", "b", "(Lnet/safemoon/androidwallet/model/collectible/RoomNFT;Lns0;)Ljava/lang/Object;", "", "e", "order", "Lr37;", "a", "(JILns0;)Ljava/lang/Object;", "h", "g", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: o64 */
/* compiled from: NftDao.kt */
public interface o64 {
    /* renamed from: a */
    Object mo62837a(long j, int i, ns0<? super r37> ns0);

    /* renamed from: b */
    Object mo62838b(RoomNFT roomNFT, ns0<? super Long> ns0);

    /* renamed from: c */
    Object mo62839c(long j, ns0<? super RoomNFT> ns0);

    /* renamed from: d */
    LiveData<List<RoomNFT>> mo62840d(long j);

    /* renamed from: e */
    Object mo62841e(String str, long j, ns0<? super Boolean> ns0);

    /* renamed from: f */
    Object mo62842f(long j, ns0<? super List<RoomNFT>> ns0);

    /* renamed from: g */
    Object mo62843g(long j, ns0<? super r37> ns0);

    /* renamed from: h */
    Object mo62844h(RoomNFT roomNFT, ns0<? super r37> ns0);

    /* renamed from: i */
    Object mo62845i(String str, long j, ns0<? super RoomNFT> ns0);

    /* renamed from: j */
    Object mo62846j(int i, ns0<? super List<RoomNFT>> ns0);
}
