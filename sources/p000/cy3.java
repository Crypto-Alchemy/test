package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.collectible.MoralisNFTs;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\u000b"}, mo44877d2 = {"Lcy3;", "", "", "address", "chain", "format", "", "limit", "Lk90;", "Lnet/safemoon/androidwallet/model/collectible/MoralisNFTs;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cy3 */
/* compiled from: MoralisAPIInterface.kt */
public interface cy3 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: cy3$a */
    /* compiled from: MoralisAPIInterface.kt */
    public static final class C6955a {
        /* renamed from: a */
        public static /* synthetic */ k90 m56595a(cy3 cy3, String str, String str2, String str3, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = "decimal";
                }
                return cy3.mo51018a(str, str2, str3, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCollections");
        }
    }

    @le2("api/v2/{address}/nft")
    /* renamed from: a */
    k90<MoralisNFTs> mo51018a(@sm4("address") String str, @sz4("chain") String str2, @sz4("format") String str3, @sz4("limit") int i);
}
