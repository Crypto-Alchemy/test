package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.pt0;

@IgnoreJRERequirement
/* renamed from: ri4 */
/* compiled from: OptionalConverterFactory */
public final class ri4 extends pt0.C9195a {

    /* renamed from: a */
    public static final pt0.C9195a f44373a = new ri4();

    @IgnoreJRERequirement
    /* renamed from: ri4$a */
    /* compiled from: OptionalConverterFactory */
    public static final class C9252a<T> implements pt0<ResponseBody, Optional<T>> {

        /* renamed from: a */
        public final pt0<ResponseBody, T> f44374a;

        public C9252a(pt0<ResponseBody, T> pt0) {
            this.f44374a = pt0;
        }

        /* renamed from: b */
        public Optional<T> mo50216a(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f44374a.mo50216a(responseBody));
        }
    }

    /* renamed from: d */
    public pt0<ResponseBody, ?> mo51277d(Type type, Annotation[] annotationArr, og5 og5) {
        if (pt0.C9195a.m71110b(type) != Optional.class) {
            return null;
        }
        return new C9252a(og5.mo62916i(pt0.C9195a.m71109a(0, (ParameterizedType) type), annotationArr));
    }
}
