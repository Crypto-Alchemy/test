package okhttp3.internal.http;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo44877d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: HttpMethod.kt */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        vx2.m53591g(str, "method");
        if (vx2.m53586b(str, "GET") || vx2.m53586b(str, "HEAD")) {
            return false;
        }
        return true;
    }

    public static final boolean requiresRequestBody(String str) {
        vx2.m53591g(str, "method");
        if (vx2.m53586b(str, "POST") || vx2.m53586b(str, "PUT") || vx2.m53586b(str, "PATCH") || vx2.m53586b(str, "PROPPATCH") || vx2.m53586b(str, "REPORT")) {
            return true;
        }
        return false;
    }

    public final boolean invalidatesCache(String str) {
        vx2.m53591g(str, "method");
        if (vx2.m53586b(str, "POST") || vx2.m53586b(str, "PATCH") || vx2.m53586b(str, "PUT") || vx2.m53586b(str, "DELETE") || vx2.m53586b(str, "MOVE")) {
            return true;
        }
        return false;
    }

    public final boolean redirectsToGet(String str) {
        vx2.m53591g(str, "method");
        return !vx2.m53586b(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        vx2.m53591g(str, "method");
        return vx2.m53586b(str, "PROPFIND");
    }
}
