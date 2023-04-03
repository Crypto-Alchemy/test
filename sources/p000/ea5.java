package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p000.ga5;
import p000.r95;

/* renamed from: ea5 */
/* compiled from: ReflectJavaMember.kt */
public abstract class ea5 extends aa5 implements r95, ga5, l13 {
    /* renamed from: D */
    public boolean mo51412D() {
        return r95.C9234a.m71487c(this);
    }

    /* renamed from: O */
    public boolean mo51414O() {
        return ga5.C7122a.m58086d(this);
    }

    /* renamed from: P */
    public o95 mo51429x(u82 u82) {
        return r95.C9234a.m71485a(this, u82);
    }

    /* renamed from: Q */
    public List<o95> getAnnotations() {
        return r95.C9234a.m71486b(this);
    }

    /* renamed from: R */
    public ReflectJavaClass mo51413N() {
        Class<?> declaringClass = mo50848S().getDeclaringClass();
        vx2.m53590f(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    /* renamed from: S */
    public abstract Member mo50848S();

    /* renamed from: T */
    public final List<p23> mo51418T(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        int i;
        String str;
        boolean z2;
        vx2.m53591g(typeArr, "parameterTypes");
        vx2.m53591g(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> b = g03.f37934a.mo51829b(mo50848S());
        if (b != null) {
            i = b.size() - typeArr.length;
        } else {
            i = 0;
        }
        int length = typeArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ka5 a = ka5.f38877a.mo52886a(typeArr[i2]);
            if (b != null) {
                str = (String) CollectionsKt___CollectionsKt.m47332c0(b, i2 + i);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + i + " (name=" + getName() + " type=" + a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (!z || i2 != ArraysKt___ArraysKt.m47261M(typeArr)) {
                z2 = false;
            } else {
                z2 = true;
            }
            arrayList.add(new ma5(a, annotationArr[i2], str, z2));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ea5) || !vx2.m53586b(mo50848S(), ((ea5) obj).mo50848S())) {
            return false;
        }
        return true;
    }

    public AnnotatedElement getElement() {
        Member S = mo50848S();
        vx2.m53589e(S, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) S;
    }

    public int getModifiers() {
        return mo50848S().getModifiers();
    }

    public r24 getName() {
        r24 r24;
        String name = mo50848S().getName();
        if (name != null) {
            r24 = r24.m71445h(name);
        } else {
            r24 = null;
        }
        if (r24 == null) {
            return n66.f41103b;
        }
        return r24;
    }

    public if7 getVisibility() {
        return ga5.C7122a.m58083a(this);
    }

    public int hashCode() {
        return mo50848S().hashCode();
    }

    public boolean isAbstract() {
        return ga5.C7122a.m58084b(this);
    }

    public boolean isFinal() {
        return ga5.C7122a.m58085c(this);
    }

    public String toString() {
        return getClass().getName() + ": " + mo50848S();
    }
}
