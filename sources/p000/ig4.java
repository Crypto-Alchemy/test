package p000;

import android.content.Context;
import com.squareup.picasso.C5459q;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: ig4 */
/* compiled from: OkHttp3Downloader */
public final class ig4 implements si1 {

    /* renamed from: a */
    public final Call.Factory f29926a;

    /* renamed from: b */
    public final Cache f29927b;

    /* renamed from: c */
    public boolean f29928c;

    public ig4(Context context) {
        this(C5459q.m41877e(context));
    }

    /* renamed from: a */
    public Response mo43591a(Request request) throws IOException {
        return this.f29926a.newCall(request).execute();
    }

    public ig4(File file) {
        this(file, C5459q.m41873a(file));
    }

    public ig4(File file, long j) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
        this.f29928c = false;
    }

    public ig4(OkHttpClient okHttpClient) {
        this.f29928c = true;
        this.f29926a = okHttpClient;
        this.f29927b = okHttpClient.cache();
    }
}
