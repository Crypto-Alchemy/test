package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class NetworkRequestHandler extends C5454m {

    /* renamed from: a */
    public final si1 f26772a;

    /* renamed from: b */
    public final m96 f26773b;

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public static final class ResponseException extends IOException {
        public final int code;
        public final int networkPolicy;

        public ResponseException(int i, int i2) {
            super("HTTP " + i);
            this.code = i;
            this.networkPolicy = i2;
        }
    }

    public NetworkRequestHandler(si1 si1, m96 m96) {
        this.f26772a = si1;
        this.f26773b = m96;
    }

    /* renamed from: j */
    public static Request m41712j(C5450k kVar, int i) {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (NetworkPolicy.isOfflineOnly(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(kVar.f26891d.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    /* renamed from: c */
    public boolean mo39454c(C5450k kVar) {
        String scheme = kVar.f26891d.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo39456e() {
        return 2;
    }

    /* renamed from: f */
    public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
        Picasso.LoadedFrom loadedFrom;
        Response a = this.f26772a.mo43591a(m41712j(kVar, i));
        ResponseBody body = a.body();
        if (a.isSuccessful()) {
            if (a.cacheResponse() == null) {
                loadedFrom = Picasso.LoadedFrom.NETWORK;
            } else {
                loadedFrom = Picasso.LoadedFrom.DISK;
            }
            if (loadedFrom == Picasso.LoadedFrom.DISK && body.contentLength() == 0) {
                body.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && body.contentLength() > 0) {
                this.f26773b.mo45712f(body.contentLength());
            }
            return new C5454m.C5455a((z56) body.source(), loadedFrom);
        }
        body.close();
        throw new ResponseException(a.code(), kVar.f26890c);
    }

    /* renamed from: h */
    public boolean mo39457h(boolean z, NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo39458i() {
        return true;
    }
}
