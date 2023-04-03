package p000;

import java.lang.annotation.Annotation;

/* renamed from: em */
/* compiled from: Annotations */
public interface C2236em {
    <A extends Annotation> A get(Class<A> cls);

    boolean has(Class<?> cls);

    boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    int size();
}
