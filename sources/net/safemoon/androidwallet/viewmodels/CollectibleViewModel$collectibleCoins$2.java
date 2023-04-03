package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "", "Lnet/safemoon/androidwallet/common/TokenType;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$collectibleCoins$2 extends Lambda implements pc2<Map<String, ? extends TokenType>> {
    public final /* synthetic */ CollectibleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$collectibleCoins$2(CollectibleViewModel collectibleViewModel) {
        super(0);
        this.this$0 = collectibleViewModel;
    }

    public final Map<String, TokenType> invoke() {
        Application b = this.this$0.mo27549b();
        vx2.m53590f(b, "getApplication()");
        Map<String, TokenType> map = new bg2(b).get();
        CollectibleViewModel collectibleViewModel = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!collectibleViewModel.f42646g.contains(next.getValue())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }
}
