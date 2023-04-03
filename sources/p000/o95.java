package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p000.h03;
import p000.p95;

/* renamed from: o95 */
/* compiled from: ReflectJavaAnnotation.kt */
public final class o95 extends aa5 implements h03 {

    /* renamed from: a */
    public final Annotation f43592a;

    public o95(Annotation annotation) {
        vx2.m53591g(annotation, "annotation");
        this.f43592a = annotation;
    }

    /* renamed from: F */
    public boolean mo52087F() {
        return h03.C7154a.m58377a(this);
    }

    /* renamed from: P */
    public final Annotation mo62852P() {
        return this.f43592a;
    }

    /* renamed from: Q */
    public ReflectJavaClass mo52091t() {
        return new ReflectJavaClass(x73.m54253b(x73.m54252a(this.f43592a)));
    }

    /* renamed from: b */
    public Collection<i03> mo52088b() {
        Method[] declaredMethods = x73.m54253b(x73.m54252a(this.f43592a)).getDeclaredMethods();
        vx2.m53590f(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            p95.C9173a aVar = p95.f44016b;
            Object invoke = method.invoke(this.f43592a, new Object[0]);
            vx2.m53590f(invoke, "method.invoke(annotation)");
            arrayList.add(aVar.mo65260a(invoke, r24.m71445h(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o95) || this.f43592a != ((o95) obj).f43592a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f43592a);
    }

    /* renamed from: i */
    public nf0 mo52089i() {
        return ReflectClassUtilKt.m60593a(x73.m54253b(x73.m54252a(this.f43592a)));
    }

    /* renamed from: j */
    public boolean mo52090j() {
        return h03.C7154a.m58378b(this);
    }

    public String toString() {
        return o95.class.getName() + ": " + this.f43592a;
    }
}
