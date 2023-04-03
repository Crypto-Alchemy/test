package p000;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.pt0;

/* renamed from: yj2 */
/* compiled from: GsonConverterFactory */
public final class yj2 extends pt0.C9195a {

    /* renamed from: a */
    public final Gson f46217a;

    public yj2(Gson gson) {
        this.f46217a = gson;
    }

    /* renamed from: f */
    public static yj2 m74453f() {
        return m74454g(new Gson());
    }

    /* renamed from: g */
    public static yj2 m74454g(Gson gson) {
        if (gson != null) {
            return new yj2(gson);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: c */
    public pt0<?, RequestBody> mo51276c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, og5 og5) {
        return new zj2(this.f46217a, this.f46217a.getAdapter(TypeToken.get(type)));
    }

    /* renamed from: d */
    public pt0<ResponseBody, ?> mo51277d(Type type, Annotation[] annotationArr, og5 og5) {
        return new ak2(this.f46217a, this.f46217a.getAdapter(TypeToken.get(type)));
    }
}
