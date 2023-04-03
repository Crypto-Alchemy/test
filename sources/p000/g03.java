package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* renamed from: g03 */
/* compiled from: ReflectJavaMember.kt */
public final class g03 {

    /* renamed from: a */
    public static final g03 f37934a = new g03();

    /* renamed from: b */
    public static C7111a f37935b;

    /* renamed from: g03$a */
    /* compiled from: ReflectJavaMember.kt */
    public static final class C7111a {

        /* renamed from: a */
        public final Method f37936a;

        /* renamed from: b */
        public final Method f37937b;

        public C7111a(Method method, Method method2) {
            this.f37936a = method;
            this.f37937b = method2;
        }

        /* renamed from: a */
        public final Method mo51830a() {
            return this.f37937b;
        }

        /* renamed from: b */
        public final Method mo51831b() {
            return this.f37936a;
        }
    }

    /* renamed from: a */
    public final C7111a mo51828a(Member member) {
        vx2.m53591g(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C7111a(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.m60598f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C7111a((Method) null, (Method) null);
        }
    }

    /* renamed from: b */
    public final List<String> mo51829b(Member member) {
        Method a;
        vx2.m53591g(member, "member");
        C7111a aVar = f37935b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f37935b;
                if (aVar == null) {
                    aVar = f37934a.mo51828a(member);
                    f37935b = aVar;
                }
            }
        }
        Method b = aVar.mo51831b();
        if (b == null || (a = aVar.mo51830a()) == null) {
            return null;
        }
        Object invoke = b.invoke(member, new Object[0]);
        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object invoke2 : objArr) {
            Object invoke3 = a.invoke(invoke2, new Object[0]);
            vx2.m53589e(invoke3, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke3);
        }
        return arrayList;
    }
}
