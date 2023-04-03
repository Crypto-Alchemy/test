package p000;

import kotlin.Metadata;
import okhttp3.OkHttpClient;
import p000.pg4;
import p000.yj7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, mo44877d2 = {"Lokhttp3/OkHttpClient;", "Lge5;", "requestFactory", "Lyj7$b;", "a", "", "url", "b", "scarlet-websocket-okhttp"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: kg4 */
/* compiled from: OkHttpClientUtils.kt */
public final class kg4 {
    /* renamed from: a */
    public static final yj7.C6745b m47064a(OkHttpClient okHttpClient, ge5 ge5) {
        vx2.m53591g(okHttpClient, "<this>");
        vx2.m53591g(ge5, "requestFactory");
        return new pg4.C6358b(new lg4(okHttpClient, ge5));
    }

    /* renamed from: b */
    public static final yj7.C6745b m47065b(OkHttpClient okHttpClient, String str) {
        vx2.m53591g(okHttpClient, "<this>");
        vx2.m53591g(str, "url");
        return m47064a(okHttpClient, new j96(str));
    }
}
