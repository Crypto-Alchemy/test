package p000;

import java.util.List;
import net.safemoon.androidwallet.model.collectible.Assets;
import net.safemoon.androidwallet.model.collectible.Collectible;

/* renamed from: li0 */
/* compiled from: CollectibleAPIInterface */
public interface li0 {
    @le2("/api/v1/assets")
    /* renamed from: a */
    k90<Assets> mo55907a(@sz4("limit") Integer num, @sz4("offset") Integer num2, @sz4("collection") String str, @sz4("owner") String str2);

    @le2("/api/v1/collections")
    /* renamed from: b */
    k90<List<Collectible>> mo55908b(@sz4("limit") Integer num, @sz4("offset") Integer num2, @sz4("asset_owner") String str);
}
