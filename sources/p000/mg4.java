package p000;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000.r11;

/* renamed from: mg4 */
/* compiled from: OkHttpStreamFetcher */
public class mg4 implements r11<InputStream>, Callback {

    /* renamed from: a */
    public final Call.Factory f14970a;

    /* renamed from: d */
    public final dh2 f14971d;

    /* renamed from: e */
    public InputStream f14972e;

    /* renamed from: g */
    public ResponseBody f14973g;

    /* renamed from: k */
    public r11.C3179a<? super InputStream> f14974k;

    /* renamed from: r */
    public volatile Call f14975r;

    public mg4(Call.Factory factory, dh2 dh2) {
        this.f14970a = factory;
        this.f14971d = dh2;
    }

    /* renamed from: a */
    public Class<InputStream> mo11939a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo11940b() {
        try {
            InputStream inputStream = this.f14972e;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f14973g;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f14974k = null;
    }

    public void cancel() {
        Call call = this.f14975r;
        if (call != null) {
            call.cancel();
        }
    }

    /* renamed from: d */
    public void mo11943d(Priority priority, r11.C3179a<? super InputStream> aVar) {
        Request.Builder url = new Request.Builder().url(this.f14971d.mo18780h());
        for (Map.Entry next : this.f14971d.mo18777e().entrySet()) {
            url.addHeader((String) next.getKey(), (String) next.getValue());
        }
        Request build = url.build();
        this.f14974k = aVar;
        this.f14975r = this.f14970a.newCall(build);
        this.f14975r.enqueue(this);
    }

    /* renamed from: e */
    public DataSource mo11944e() {
        return DataSource.REMOTE;
    }

    public void onFailure(Call call, IOException iOException) {
        this.f14974k.mo12485c(iOException);
    }

    public void onResponse(Call call, Response response) {
        this.f14973g = response.body();
        if (response.isSuccessful()) {
            InputStream b = sr0.m27081b(this.f14973g.byteStream(), ((ResponseBody) zt4.m31500d(this.f14973g)).contentLength());
            this.f14972e = b;
            this.f14974k.mo12487f(b);
            return;
        }
        this.f14974k.mo12485c(new HttpException(response.message(), response.code()));
    }
}
