package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

/* renamed from: r95 */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public interface r95 extends l03 {

    /* renamed from: r95$a */
    /* compiled from: ReflectJavaAnnotationOwner.kt */
    public static final class C9234a {
        /* renamed from: a */
        public static o95 m71485a(r95 r95, u82 u82) {
            Annotation[] declaredAnnotations;
            vx2.m53591g(u82, "fqName");
            AnnotatedElement element = r95.getElement();
            if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
                return null;
            }
            return s95.m71899a(declaredAnnotations, u82);
        }

        /* renamed from: b */
        public static List<o95> m71486b(r95 r95) {
            Annotation[] declaredAnnotations;
            List<o95> b;
            AnnotatedElement element = r95.getElement();
            if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (b = s95.m71900b(declaredAnnotations)) == null) {
                return ck0.m33062j();
            }
            return b;
        }

        /* renamed from: c */
        public static boolean m71487c(r95 r95) {
            return false;
        }
    }

    AnnotatedElement getElement();
}
