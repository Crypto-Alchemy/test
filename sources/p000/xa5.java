package p000;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.jvm.ReflectLambdaKt;
import kotlin.reflect.jvm.internal.C7375a;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;

/* renamed from: xa5 */
/* compiled from: ReflectionFactoryImpl */
public class xa5 extends wa5 {
    /* renamed from: i */
    public static KDeclarationContainerImpl m73898i(CallableReference callableReference) {
        y83 owner = callableReference.getOwner();
        if (owner instanceof KDeclarationContainerImpl) {
            return (KDeclarationContainerImpl) owner;
        }
        return C7375a.f39040g;
    }

    /* renamed from: a */
    public z83 mo48931a(FunctionReference functionReference) {
        return new KFunctionImpl(m73898i(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    /* renamed from: b */
    public q83 mo48932b(Class cls) {
        return r83.m71481a(cls);
    }

    /* renamed from: c */
    public y83 mo48933c(Class cls, String str) {
        return new KPackageImpl(cls, str);
    }

    /* renamed from: d */
    public g93 mo48934d(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m73898i(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    /* renamed from: e */
    public j93 mo48935e(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m73898i(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    /* renamed from: f */
    public k93 mo48936f(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m73898i(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    /* renamed from: g */
    public String mo48937g(td2 td2) {
        KFunctionImpl c;
        z83 a = ReflectLambdaKt.m20957a(td2);
        if (a == null || (c = y67.m74273c(a)) == null) {
            return super.mo48937g(td2);
        }
        return ReflectionObjectRenderer.f39037a.mo53108e(c.mo52984x());
    }

    /* renamed from: h */
    public String mo48938h(Lambda lambda) {
        return mo48937g(lambda);
    }
}
