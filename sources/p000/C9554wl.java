package p000;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p000.C9460vl;

/* renamed from: wl */
/* compiled from: AnnotationDescriptorImpl */
public class C9554wl implements C9460vl {

    /* renamed from: a */
    public final xc3 f45731a;

    /* renamed from: b */
    public final Map<r24, fq0<?>> f45732b;

    /* renamed from: c */
    public final a66 f45733c;

    public C9554wl(xc3 xc3, Map<r24, fq0<?>> map, a66 a66) {
        if (xc3 == null) {
            m73673a(0);
        }
        if (map == null) {
            m73673a(1);
        }
        if (a66 == null) {
            m73673a(2);
        }
        this.f45731a = xc3;
        this.f45732b = map;
        this.f45733c = a66;
    }

    /* renamed from: a */
    public static /* synthetic */ void m73673a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: e */
    public u82 mo53263e() {
        return C9460vl.C9461a.m73287a(this);
    }

    /* renamed from: f */
    public Map<r24, fq0<?>> mo53264f() {
        Map<r24, fq0<?>> map = this.f45732b;
        if (map == null) {
            m73673a(4);
        }
        return map;
    }

    public a66 getSource() {
        a66 a66 = this.f45733c;
        if (a66 == null) {
            m73673a(5);
        }
        return a66;
    }

    public xc3 getType() {
        xc3 xc3 = this.f45731a;
        if (xc3 == null) {
            m73673a(3);
        }
        return xc3;
    }

    public String toString() {
        return DescriptorRenderer.f39992g.mo54811r(this, (AnnotationUseSiteTarget) null);
    }
}
