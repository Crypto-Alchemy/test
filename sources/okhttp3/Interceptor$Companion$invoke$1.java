package okhttp3;

import kotlin.Metadata;
import okhttp3.Interceptor;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "Lokhttp3/Response;", "it", "Lokhttp3/Interceptor$Chain;", "intercept"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 176)
/* compiled from: Interceptor.kt */
public final class Interceptor$Companion$invoke$1 implements Interceptor {
    public final /* synthetic */ rc2<Interceptor.Chain, Response> $block;

    public Interceptor$Companion$invoke$1(rc2<? super Interceptor.Chain, Response> rc2) {
        this.$block = rc2;
    }

    public final Response intercept(Interceptor.Chain chain) {
        vx2.m53591g(chain, "it");
        return this.$block.invoke(chain);
    }
}
