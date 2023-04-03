package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;

/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class BuiltInAnnotationDescriptor implements C9460vl {

    /* renamed from: a */
    public final C7389b f39266a;

    /* renamed from: b */
    public final u82 f39267b;

    /* renamed from: c */
    public final Map<r24, fq0<?>> f39268c;

    /* renamed from: d */
    public final ef3 f39269d = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new BuiltInAnnotationDescriptor$type$2(this));

    public BuiltInAnnotationDescriptor(C7389b bVar, u82 u82, Map<r24, ? extends fq0<?>> map) {
        vx2.m53591g(bVar, "builtIns");
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(map, "allValueArguments");
        this.f39266a = bVar;
        this.f39267b = u82;
        this.f39268c = map;
    }

    /* renamed from: e */
    public u82 mo53263e() {
        return this.f39267b;
    }

    /* renamed from: f */
    public Map<r24, fq0<?>> mo53264f() {
        return this.f39268c;
    }

    public a66 getSource() {
        a66 a66 = a66.f36360a;
        vx2.m53590f(a66, "NO_SOURCE");
        return a66;
    }

    public xc3 getType() {
        Object value = this.f39269d.getValue();
        vx2.m53590f(value, "<get-type>(...)");
        return (xc3) value;
    }
}
