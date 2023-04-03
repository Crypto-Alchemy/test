package p000;

import java.lang.annotation.Annotation;

/* renamed from: z36 */
/* compiled from: SkipCallbackExecutorImpl */
public final class z36 implements y36 {

    /* renamed from: a */
    public static final y36 f46330a = new z36();

    /* renamed from: a */
    public static Annotation[] m74744a(Annotation[] annotationArr) {
        if (t77.m72181l(annotationArr, y36.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f46330a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return y36.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof y36;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + y36.class.getName() + "()";
    }
}
