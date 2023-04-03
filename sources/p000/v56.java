package p000;

import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft;
import net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¨\u0006\u000b"}, mo44877d2 = {"Lv56;", "", "", "address", "Lk90;", "", "Lnet/safemoon/androidwallet/model/rpc2/solana/collections/SolanaNfts;", "b", "mintAddress", "Lnet/safemoon/androidwallet/model/rpc2/solana/collections/SolanaNft;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: v56 */
/* compiled from: SolanaMoralisApiInterface.kt */
public interface v56 {
    @le2("nft/mainnet/{mintAddress}/metadata")
    /* renamed from: a */
    k90<SolanaNft> mo66421a(@sm4("mintAddress") String str);

    @le2("account/mainnet/{address}/nft")
    /* renamed from: b */
    k90<List<SolanaNfts>> mo66422b(@sm4("address") String str);
}
