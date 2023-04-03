package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p000.tc3;

/* renamed from: n95 */
/* compiled from: ReflectKotlinClass.kt */
public final class n95 {

    /* renamed from: a */
    public static final n95 f41123a = new n95();

    /* renamed from: a */
    public final of0 mo56390a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            vx2.m53590f(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            nf0 a = ReflectClassUtilKt.m60593a(cls);
            c23 c23 = c23.f37039a;
            u82 b = a.mo62673b();
            vx2.m53590f(b, "javaClassId.asSingleFqName()");
            nf0 m = c23.mo50792m(b);
            if (m != null) {
                a = m;
            }
            return new of0(a, i);
        } else if (vx2.m53586b(cls, Void.TYPE)) {
            nf0 m2 = nf0.m69751m(C7395c.C7396a.f39166f.mo66454l());
            vx2.m53590f(m2, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new of0(m2, i);
        } else {
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            vx2.m53590f(primitiveType, "get(currentClass.name).primitiveType");
            if (i > 0) {
                nf0 m3 = nf0.m69751m(primitiveType.getArrayTypeFqName());
                vx2.m53590f(m3, "topLevel(primitiveType.arrayTypeFqName)");
                return new of0(m3, i - 1);
            }
            nf0 m4 = nf0.m69751m(primitiveType.getTypeFqName());
            vx2.m53590f(m4, "topLevel(primitiveType.typeFqName)");
            return new of0(m4, i);
        }
    }

    /* renamed from: b */
    public final void mo56391b(Class<?> cls, tc3.C9343c cVar) {
        vx2.m53591g(cls, "klass");
        vx2.m53591g(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        vx2.m53590f(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            vx2.m53590f(annotation, "annotation");
            mo56395f(cVar, annotation);
        }
        cVar.mo53770a();
    }

    /* renamed from: c */
    public final void mo56392c(Class<?> cls, tc3.C9344d dVar) {
        int i;
        Constructor[] constructorArr;
        boolean z;
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        vx2.m53590f(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = declaredConstructors[i2];
            r24 r24 = n66.f41110i;
            w16 w16 = w16.f45415a;
            vx2.m53590f(constructor, "constructor");
            tc3.C9345e a = dVar.mo53767a(r24, w16.mo66606a(constructor));
            if (a == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                vx2.m53590f(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    vx2.m53590f(annotation, "annotation");
                    mo56395f(a, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                vx2.m53590f(parameterAnnotations, "parameterAnnotations");
                if (parameterAnnotations.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        vx2.m53590f(annotationArr, "annotations");
                        int length4 = annotationArr.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotationArr[i4];
                            Class b = x73.m54253b(x73.m54252a(annotation2));
                            Constructor[] constructorArr2 = declaredConstructors;
                            int i5 = length;
                            nf0 a2 = ReflectClassUtilKt.m60593a(b);
                            int i6 = length2;
                            vx2.m53590f(annotation2, "annotation");
                            tc3.C9341a c = a.mo53769c(i3 + length2, a2, new m95(annotation2));
                            if (c != null) {
                                f41123a.mo56397h(c, annotation2, b);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                            length2 = i6;
                        }
                        Constructor[] constructorArr3 = declaredConstructors;
                        int i7 = length;
                        int i8 = length2;
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                a.mo53770a();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* renamed from: d */
    public final void mo56393d(Class<?> cls, tc3.C9344d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        vx2.m53590f(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            r24 h = r24.m71445h(field.getName());
            vx2.m53590f(h, "identifier(field.name)");
            w16 w16 = w16.f45415a;
            vx2.m53590f(field, "field");
            tc3.C9343c b = dVar.mo53768b(h, w16.mo66607b(field), (Object) null);
            if (b != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                vx2.m53590f(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    vx2.m53590f(annotation, "annotation");
                    mo56395f(b, annotation);
                }
                b.mo53770a();
            }
        }
    }

    /* renamed from: e */
    public final void mo56394e(Class<?> cls, tc3.C9344d dVar) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        vx2.m53590f(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            r24 h = r24.m71445h(method.getName());
            vx2.m53590f(h, "identifier(method.name)");
            w16 w16 = w16.f45415a;
            vx2.m53590f(method, "method");
            tc3.C9345e a = dVar.mo53767a(h, w16.mo66608c(method));
            if (a == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                vx2.m53590f(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    vx2.m53590f(annotation, "annotation");
                    mo56395f(a, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                vx2.m53590f(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    Annotation[] annotationArr2 = annotationArr[i2];
                    vx2.m53590f(annotationArr2, "annotations");
                    int length3 = annotationArr2.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        Annotation annotation2 = annotationArr2[i3];
                        Class b = x73.m54253b(x73.m54252a(annotation2));
                        nf0 a2 = ReflectClassUtilKt.m60593a(b);
                        Method[] methodArr2 = declaredMethods;
                        vx2.m53590f(annotation2, "annotation");
                        tc3.C9341a c = a.mo53769c(i2, a2, new m95(annotation2));
                        if (c != null) {
                            f41123a.mo56397h(c, annotation2, b);
                        }
                        i3++;
                        declaredMethods = methodArr2;
                    }
                    Method[] methodArr3 = declaredMethods;
                }
                methodArr = declaredMethods;
                a.mo53770a();
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: f */
    public final void mo56395f(tc3.C9343c cVar, Annotation annotation) {
        Class b = x73.m54253b(x73.m54252a(annotation));
        tc3.C9341a b2 = cVar.mo53771b(ReflectClassUtilKt.m60593a(b), new m95(annotation));
        if (b2 != null) {
            f41123a.mo56397h(b2, annotation, b);
        }
    }

    /* renamed from: g */
    public final void mo56396g(tc3.C9341a aVar, r24 r24, Object obj) {
        Class<?> cls = obj.getClass();
        if (vx2.m53586b(cls, Class.class)) {
            vx2.m53589e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.mo52583b(r24, mo56390a((Class) obj));
        } else if (sa5.f44546a.contains(cls)) {
            aVar.mo52587f(r24, obj);
        } else if (ReflectClassUtilKt.m60600h(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            vx2.m53590f(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            nf0 a = ReflectClassUtilKt.m60593a(cls);
            vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            r24 h = r24.m71445h(((Enum) obj).name());
            vx2.m53590f(h, "identifier((value as Enum<*>).name)");
            aVar.mo52585d(r24, a, h);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class[] interfaces = cls.getInterfaces();
            vx2.m53590f(interfaces, "clazz.interfaces");
            Class cls2 = (Class) ArraysKt___ArraysKt.m47278d0(interfaces);
            vx2.m53590f(cls2, "annotationClass");
            tc3.C9341a e = aVar.mo52586e(r24, ReflectClassUtilKt.m60593a(cls2));
            if (e != null) {
                vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Annotation");
                mo56397h(e, (Annotation) obj, cls2);
            }
        } else if (cls.isArray()) {
            tc3.C9342b c = aVar.mo52584c(r24);
            if (c != null) {
                Class<?> componentType = cls.getComponentType();
                int i = 0;
                if (componentType.isEnum()) {
                    vx2.m53590f(componentType, "componentType");
                    nf0 a2 = ReflectClassUtilKt.m60593a(componentType);
                    vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i < length) {
                        Object obj2 = objArr[i];
                        vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                        r24 h2 = r24.m71445h(((Enum) obj2).name());
                        vx2.m53590f(h2, "identifier((element as Enum<*>).name)");
                        c.mo52594d(a2, h2);
                        i++;
                    }
                } else if (vx2.m53586b(componentType, Class.class)) {
                    vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr2 = (Object[]) obj;
                    int length2 = objArr2.length;
                    while (i < length2) {
                        Object obj3 = objArr2[i];
                        vx2.m53589e(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                        c.mo52595e(mo56390a((Class) obj3));
                        i++;
                    }
                } else if (Annotation.class.isAssignableFrom(componentType)) {
                    vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr3 = (Object[]) obj;
                    int length3 = objArr3.length;
                    while (i < length3) {
                        Object obj4 = objArr3[i];
                        vx2.m53590f(componentType, "componentType");
                        tc3.C9341a b = c.mo52592b(ReflectClassUtilKt.m60593a(componentType));
                        if (b != null) {
                            vx2.m53589e(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                            mo56397h(b, (Annotation) obj4, componentType);
                        }
                        i++;
                    }
                } else {
                    vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr4 = (Object[]) obj;
                    int length4 = objArr4.length;
                    while (i < length4) {
                        c.mo52593c(objArr4[i]);
                        i++;
                    }
                }
                c.mo52591a();
            }
        } else {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
    }

    /* renamed from: h */
    public final void mo56397h(tc3.C9341a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        vx2.m53590f(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                vx2.m53588d(invoke);
                r24 h = r24.m71445h(method.getName());
                vx2.m53590f(h, "identifier(method.name)");
                mo56396g(aVar, h, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo52590a();
    }

    /* renamed from: i */
    public final void mo56398i(Class<?> cls, tc3.C9344d dVar) {
        vx2.m53591g(cls, "klass");
        vx2.m53591g(dVar, "memberVisitor");
        mo56394e(cls, dVar);
        mo56392c(cls, dVar);
        mo56393d(cls, dVar);
    }
}
