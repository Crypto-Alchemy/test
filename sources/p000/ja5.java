package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* renamed from: ja5 */
/* compiled from: ReflectJavaRecordComponent.kt */
public final class ja5 extends ea5 implements w13 {

    /* renamed from: a */
    public final Object f38633a;

    public ja5(Object obj) {
        vx2.m53591g(obj, "recordComponent");
        this.f38633a = obj;
    }

    /* renamed from: S */
    public Member mo50848S() {
        Method c = a03.f36333a.mo50020c(this.f38633a);
        if (c != null) {
            return c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    /* renamed from: a */
    public boolean mo52653a() {
        return false;
    }

    public e23 getType() {
        Class<?> d = a03.f36333a.mo50021d(this.f38633a);
        if (d != null) {
            return new y95(d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
