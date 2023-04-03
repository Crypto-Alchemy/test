package p000;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: iy2 */
/* compiled from: Invocation */
public final class iy2 {

    /* renamed from: a */
    public final Method f38534a;

    /* renamed from: b */
    public final List<?> f38535b;

    public iy2(Method method, List<?> list) {
        this.f38534a = method;
        this.f38535b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo52552a() {
        return this.f38534a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f38534a.getDeclaringClass().getName(), this.f38534a.getName(), this.f38535b});
    }
}
