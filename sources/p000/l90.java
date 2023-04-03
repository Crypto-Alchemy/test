package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: l90 */
/* compiled from: CallAdapter */
public interface l90<R, T> {

    /* renamed from: l90$a */
    /* compiled from: CallAdapter */
    public static abstract class C7825a {
        /* renamed from: b */
        public static Type m63731b(int i, ParameterizedType parameterizedType) {
            return t77.m72176g(i, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m63732c(Type type) {
            return t77.m72177h(type);
        }

        /* renamed from: a */
        public abstract l90<?, ?> mo50508a(Type type, Annotation[] annotationArr, og5 og5);
    }

    /* renamed from: a */
    Type mo50509a();

    /* renamed from: b */
    T mo50510b(k90<R> k90);
}
