package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.ga5;
import p000.r95;

/* compiled from: ReflectJavaClass.kt */
public final class ReflectJavaClass extends aa5 implements r95, ga5, p03 {

    /* renamed from: a */
    public final Class<?> f39384a;

    public ReflectJavaClass(Class<?> cls) {
        vx2.m53591g(cls, "klass");
        this.f39384a = cls;
    }

    /* renamed from: C */
    public Collection<x03> mo53370C() {
        Class[] c = b03.f36620a.mo50432c(this.f39384a);
        if (c == null) {
            return ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList(c.length);
        for (Class y95 : c) {
            arrayList.add(new y95(y95));
        }
        return arrayList;
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return r95.C9234a.m71487c(this);
    }

    /* renamed from: I */
    public boolean mo53371I() {
        return this.f39384a.isInterface();
    }

    /* renamed from: J */
    public LightClassOriginKind mo53372J() {
        return null;
    }

    /* renamed from: O */
    public boolean mo51414O() {
        return ga5.C7122a.m58086d(this);
    }

    /* renamed from: Q */
    public o95 mo51429x(u82 u82) {
        return r95.C9234a.m71485a(this, u82);
    }

    /* renamed from: R */
    public List<o95> getAnnotations() {
        return r95.C9234a.m71486b(this);
    }

    /* renamed from: S */
    public List<z95> mo53386h() {
        Constructor[] declaredConstructors = this.f39384a.getDeclaredConstructors();
        vx2.m53590f(declaredConstructors, "klass.declaredConstructors");
        return SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63034x(SequencesKt___SequencesKt.m63026p(ArraysKt___ArraysKt.m47245B(declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    /* renamed from: T */
    public Class<?> getElement() {
        return this.f39384a;
    }

    /* renamed from: U */
    public List<ca5> mo53395y() {
        Field[] declaredFields = this.f39384a.getDeclaredFields();
        vx2.m53590f(declaredFields, "klass.declaredFields");
        return SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63034x(SequencesKt___SequencesKt.m63026p(ArraysKt___ArraysKt.m47245B(declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    /* renamed from: V */
    public List<r24> mo53368A() {
        Class[] declaredClasses = this.f39384a.getDeclaredClasses();
        vx2.m53590f(declaredClasses, "klass.declaredClasses");
        return SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63035y(SequencesKt___SequencesKt.m63026p(ArraysKt___ArraysKt.m47245B(declaredClasses), ReflectJavaClass$innerClassNames$1.INSTANCE), ReflectJavaClass$innerClassNames$2.INSTANCE));
    }

    /* renamed from: W */
    public List<fa5> mo53369B() {
        Method[] declaredMethods = this.f39384a.getDeclaredMethods();
        vx2.m53590f(declaredMethods, "klass.declaredMethods");
        return SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63034x(SequencesKt___SequencesKt.m63025o(ArraysKt___ArraysKt.m47245B(declaredMethods), new ReflectJavaClass$methods$1(this)), ReflectJavaClass$methods$2.INSTANCE));
    }

    /* renamed from: X */
    public ReflectJavaClass mo53388k() {
        Class<?> declaringClass = this.f39384a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    /* renamed from: Y */
    public final boolean mo53381Y(Method method) {
        String name = method.getName();
        if (vx2.m53586b(name, "values")) {
            Class[] parameterTypes = method.getParameterTypes();
            vx2.m53590f(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (vx2.m53586b(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo53382c() {
        Boolean f = b03.f36620a.mo50435f(this.f39384a);
        if (f != null) {
            return f.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public u82 mo53383e() {
        u82 b = ReflectClassUtilKt.m60593a(this.f39384a).mo62673b();
        vx2.m53590f(b, "klass.classId.asSingleFqName()");
        return b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReflectJavaClass) || !vx2.m53586b(this.f39384a, ((ReflectJavaClass) obj).f39384a)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public Collection<x03> mo53385g() {
        Type type = Object.class;
        if (vx2.m53586b(this.f39384a, type)) {
            return ck0.m33062j();
        }
        g76 g76 = new g76(2);
        Type genericSuperclass = this.f39384a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        g76.mo42841a(type);
        Type[] genericInterfaces = this.f39384a.getGenericInterfaces();
        vx2.m53590f(genericInterfaces, "klass.genericInterfaces");
        g76.mo42842b(genericInterfaces);
        List<Type> m = ck0.m33065m(g76.mo42844d(new Type[g76.mo42843c()]));
        ArrayList arrayList = new ArrayList(dk0.m43495u(m, 10));
        for (Type y95 : m) {
            arrayList.add(new y95(y95));
        }
        return arrayList;
    }

    public int getModifiers() {
        return this.f39384a.getModifiers();
    }

    public r24 getName() {
        r24 h = r24.m71445h(this.f39384a.getSimpleName());
        vx2.m53590f(h, "identifier(klass.simpleName)");
        return h;
    }

    public List<la5> getTypeParameters() {
        TypeVariable[] typeParameters = this.f39384a.getTypeParameters();
        vx2.m53590f(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable la5 : typeParameters) {
            arrayList.add(new la5(la5));
        }
        return arrayList;
    }

    public if7 getVisibility() {
        return ga5.C7122a.m58083a(this);
    }

    public int hashCode() {
        return this.f39384a.hashCode();
    }

    public boolean isAbstract() {
        return ga5.C7122a.m58084b(this);
    }

    public boolean isFinal() {
        return ga5.C7122a.m58085c(this);
    }

    /* renamed from: l */
    public Collection<w13> mo53389l() {
        Object[] d = b03.f36620a.mo50433d(this.f39384a);
        if (d == null) {
            d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d.length);
        for (Object ja5 : d) {
            arrayList.add(new ja5(ja5));
        }
        return arrayList;
    }

    /* renamed from: n */
    public boolean mo53390n() {
        return this.f39384a.isAnnotation();
    }

    /* renamed from: p */
    public boolean mo53391p() {
        Boolean e = b03.f36620a.mo50434e(this.f39384a);
        if (e != null) {
            return e.booleanValue();
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo53392q() {
        return false;
    }

    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f39384a;
    }

    /* renamed from: v */
    public boolean mo53394v() {
        return this.f39384a.isEnum();
    }
}
