package p000;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;

/* renamed from: wa5 */
/* compiled from: ReflectionFactory */
public class wa5 {
    /* renamed from: a */
    public z83 mo48931a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: b */
    public q83 mo48932b(Class cls) {
        return new sf0(cls);
    }

    /* renamed from: c */
    public y83 mo48933c(Class cls, String str) {
        return new pk4(cls, str);
    }

    /* renamed from: d */
    public g93 mo48934d(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: e */
    public j93 mo48935e(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: f */
    public k93 mo48936f(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* renamed from: g */
    public String mo48937g(td2 td2) {
        String obj = td2.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: h */
    public String mo48938h(Lambda lambda) {
        return mo48937g(lambda);
    }
}
