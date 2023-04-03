package p000;

import java.lang.reflect.Modifier;
import p000.hf7;

/* renamed from: ga5 */
/* compiled from: ReflectJavaModifierListOwner.kt */
public interface ga5 extends n13 {

    /* renamed from: ga5$a */
    /* compiled from: ReflectJavaModifierListOwner.kt */
    public static final class C7122a {
        /* renamed from: a */
        public static if7 m58083a(ga5 ga5) {
            int modifiers = ga5.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                return hf7.C7180h.f38215c;
            }
            if (Modifier.isPrivate(modifiers)) {
                return hf7.C7177e.f38212c;
            }
            if (!Modifier.isProtected(modifiers)) {
                return q23.f44148c;
            }
            if (Modifier.isStatic(modifiers)) {
                return s23.f44522c;
            }
            return r23.f44280c;
        }

        /* renamed from: b */
        public static boolean m58084b(ga5 ga5) {
            return Modifier.isAbstract(ga5.getModifiers());
        }

        /* renamed from: c */
        public static boolean m58085c(ga5 ga5) {
            return Modifier.isFinal(ga5.getModifiers());
        }

        /* renamed from: d */
        public static boolean m58086d(ga5 ga5) {
            return Modifier.isStatic(ga5.getModifiers());
        }
    }

    int getModifiers();
}
