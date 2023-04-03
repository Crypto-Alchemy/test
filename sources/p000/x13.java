package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;

/* renamed from: x13 */
/* compiled from: JavaResolverCache */
public interface x13 {

    /* renamed from: a */
    public static final x13 f45832a = new C9581a();

    /* renamed from: x13$a */
    /* compiled from: JavaResolverCache */
    public static class C9581a implements x13 {
        /* renamed from: f */
        public static /* synthetic */ void m73811f(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo66817a(l13 l13, C7428e eVar) {
            if (l13 == null) {
                m73811f(1);
            }
            if (eVar == null) {
                m73811f(2);
            }
        }

        /* renamed from: b */
        public if0 mo66818b(u82 u82) {
            if (u82 != null) {
                return null;
            }
            m73811f(0);
            return null;
        }

        /* renamed from: c */
        public void mo66819c(d13 d13, C7424b bVar) {
            if (d13 == null) {
                m73811f(3);
            }
            if (bVar == null) {
                m73811f(4);
            }
        }

        /* renamed from: d */
        public void mo66820d(p03 p03, if0 if0) {
            if (p03 == null) {
                m73811f(7);
            }
            if (if0 == null) {
                m73811f(8);
            }
        }

        /* renamed from: e */
        public void mo66821e(f13 f13, fx4 fx4) {
            if (f13 == null) {
                m73811f(5);
            }
            if (fx4 == null) {
                m73811f(6);
            }
        }
    }

    /* renamed from: a */
    void mo66817a(l13 l13, C7428e eVar);

    /* renamed from: b */
    if0 mo66818b(u82 u82);

    /* renamed from: c */
    void mo66819c(d13 d13, C7424b bVar);

    /* renamed from: d */
    void mo66820d(p03 p03, if0 if0);

    /* renamed from: e */
    void mo66821e(f13 f13, fx4 fx4);
}
