package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: pt0 */
/* compiled from: Converter */
public interface pt0<F, T> {

    /* renamed from: pt0$a */
    /* compiled from: Converter */
    public static abstract class C9195a {
        /* renamed from: a */
        public static Type m71109a(int i, ParameterizedType parameterizedType) {
            return t77.m72176g(i, parameterizedType);
        }

        /* renamed from: b */
        public static Class<?> m71110b(Type type) {
            return t77.m72177h(type);
        }

        /* renamed from: c */
        public pt0<?, RequestBody> mo51276c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, og5 og5) {
            return null;
        }

        /* renamed from: d */
        public pt0<ResponseBody, ?> mo51277d(Type type, Annotation[] annotationArr, og5 og5) {
            return null;
        }

        /* renamed from: e */
        public pt0<?, String> mo65359e(Type type, Annotation[] annotationArr, og5 og5) {
            return null;
        }
    }

    /* renamed from: a */
    T mo50216a(F f) throws IOException;
}
