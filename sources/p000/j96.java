package p000;

import kotlin.Metadata;
import okhttp3.Request;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Lj96;", "Lge5;", "Lokhttp3/Request;", "a", "", "Ljava/lang/String;", "url", "<init>", "(Ljava/lang/String;)V", "scarlet-websocket-okhttp"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: j96 */
/* compiled from: StaticUrlRequestFactory.kt */
public final class j96 implements ge5 {

    /* renamed from: a */
    public final String f30270a;

    public j96(String str) {
        vx2.m53591g(str, "url");
        this.f30270a = str;
    }

    /* renamed from: a */
    public Request mo42885a() {
        return new Request.Builder().url(this.f30270a).build();
    }
}
