package p000;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* renamed from: gg0 */
/* compiled from: ClassifierNamePolicy.kt */
public interface gg0 {

    /* renamed from: gg0$a */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C7128a implements gg0 {

        /* renamed from: a */
        public static final C7128a f38020a = new C7128a();

        /* renamed from: a */
        public String mo51918a(eg0 eg0, DescriptorRenderer descriptorRenderer) {
            vx2.m53591g(eg0, "classifier");
            vx2.m53591g(descriptorRenderer, "renderer");
            if (eg0 instanceof a17) {
                r24 name = ((a17) eg0).getName();
                vx2.m53590f(name, "classifier.name");
                return descriptorRenderer.mo54814v(name, false);
            }
            v82 m = dd1.m56821m(eg0);
            vx2.m53590f(m, "getFqName(classifier)");
            return descriptorRenderer.mo54813u(m);
        }
    }

    /* renamed from: gg0$b */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C7129b implements gg0 {

        /* renamed from: a */
        public static final C7129b f38021a = new C7129b();

        /* renamed from: a */
        public String mo51918a(eg0 eg0, DescriptorRenderer descriptorRenderer) {
            boolean z;
            vx2.m53591g(eg0, "classifier");
            vx2.m53591g(descriptorRenderer, "renderer");
            if (eg0 instanceof a17) {
                r24 name = ((a17) eg0).getName();
                vx2.m53590f(name, "classifier.name");
                return descriptorRenderer.mo54814v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            d31 d31 = eg0;
            do {
                arrayList.add(d31.getName());
                d31 b = d31.mo51119b();
                z = b instanceof if0;
                d31 = b;
            } while (z);
            return rd5.m71513c(ik0.m45742L(arrayList));
        }
    }

    /* renamed from: gg0$c */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C7130c implements gg0 {

        /* renamed from: a */
        public static final C7130c f38022a = new C7130c();

        /* renamed from: a */
        public String mo51918a(eg0 eg0, DescriptorRenderer descriptorRenderer) {
            vx2.m53591g(eg0, "classifier");
            vx2.m53591g(descriptorRenderer, "renderer");
            return mo51919b(eg0);
        }

        /* renamed from: b */
        public final String mo51919b(eg0 eg0) {
            r24 name = eg0.getName();
            vx2.m53590f(name, "descriptor.name");
            String b = rd5.m71512b(name);
            if (eg0 instanceof a17) {
                return b;
            }
            d31 b2 = eg0.mo51119b();
            vx2.m53590f(b2, "descriptor.containingDeclaration");
            String c = mo51920c(b2);
            if (c == null || vx2.m53586b(c, "")) {
                return b;
            }
            return c + '.' + b;
        }

        /* renamed from: c */
        public final String mo51920c(d31 d31) {
            if (d31 instanceof if0) {
                return mo51919b((eg0) d31);
            }
            if (!(d31 instanceof fk4)) {
                return null;
            }
            v82 j = ((fk4) d31).mo51711e().mo66205j();
            vx2.m53590f(j, "descriptor.fqName.toUnsafe()");
            return rd5.m71511a(j);
        }
    }

    /* renamed from: a */
    String mo51918a(eg0 eg0, DescriptorRenderer descriptorRenderer);
}
