package p000;

import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p000.de0;

/* renamed from: oy2 */
/* compiled from: modifierChecks.kt */
public final class oy2 implements de0 {

    /* renamed from: a */
    public static final oy2 f43961a = new oy2();

    /* renamed from: b */
    public static final String f43962b = "second parameter must be of type KProperty<*> or its supertype";

    /* renamed from: a */
    public String mo51175a(C7425c cVar) {
        return de0.C6971a.m56837a(this, cVar);
    }

    /* renamed from: b */
    public boolean mo51176b(C7425c cVar) {
        vx2.m53591g(cVar, "functionDescriptor");
        n87 n87 = cVar.mo51763f().get(1);
        ReflectionTypes.C7386b bVar = ReflectionTypes.f39064k;
        vx2.m53590f(n87, "secondParameter");
        xc3 a = bVar.mo53137a(DescriptorUtilsKt.m62451l(n87));
        if (a == null) {
            return false;
        }
        xc3 type = n87.getType();
        vx2.m53590f(type, "secondParameter.type");
        return TypeUtilsKt.m62959o(a, TypeUtilsKt.m62963s(type));
    }

    public String getDescription() {
        return f43962b;
    }
}
