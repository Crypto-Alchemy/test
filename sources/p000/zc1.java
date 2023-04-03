package p000;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;

/* renamed from: zc1 */
/* compiled from: DescriptorRenderer.kt */
public interface zc1 {

    /* renamed from: zc1$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class C9673a {
        /* renamed from: a */
        public static boolean m74853a(zc1 zc1) {
            return zc1.mo54929k().getIncludeAnnotationArguments();
        }

        /* renamed from: b */
        public static boolean m74854b(zc1 zc1) {
            return zc1.mo54929k().getIncludeEmptyAnnotationArguments();
        }
    }

    /* renamed from: a */
    void mo54898a(boolean z);

    /* renamed from: b */
    void mo54902b(ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    /* renamed from: c */
    void mo54905c(boolean z);

    /* renamed from: d */
    boolean mo54908d();

    /* renamed from: e */
    void mo54911e(gg0 gg0);

    /* renamed from: f */
    void mo54914f(boolean z);

    /* renamed from: g */
    void mo54917g(boolean z);

    /* renamed from: h */
    void mo54920h(RenderingFormat renderingFormat);

    /* renamed from: i */
    Set<u82> mo54923i();

    /* renamed from: j */
    boolean mo54926j();

    /* renamed from: k */
    AnnotationArgumentsRenderingPolicy mo54929k();

    /* renamed from: l */
    void mo54932l(Set<u82> set);

    /* renamed from: m */
    void mo54935m(Set<? extends DescriptorRendererModifier> set);

    /* renamed from: n */
    void mo54938n(boolean z);

    /* renamed from: o */
    void mo54941o(boolean z);

    /* renamed from: p */
    void mo54944p(boolean z);
}
