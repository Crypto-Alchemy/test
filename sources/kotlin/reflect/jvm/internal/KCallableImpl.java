package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\bM\u0010NJ'\u0010\u0007\u001a\u00028\u00002\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000f\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002R.\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u001a*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e0\u001e0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010!0!0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u001a*\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00180\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0018\u0010*\u001a\u0006\u0012\u0002\b\u00030'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010<\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0016\u0010C\u001a\u0004\u0018\u00010@8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\bD\u00103R\u0014\u0010E\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\bE\u00103R\u0014\u0010F\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\bF\u00103R\u0014\u0010H\u001a\u0002018DX\u0004¢\u0006\u0006\u001a\u0004\bG\u00103R\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lo83;", "Lp93;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "Lns0;", "continuationArgument", "o", "(Ljava/util/Map;Lns0;)Ljava/lang/Object;", "n", "Lm93;", "type", "p", "Ljava/lang/reflect/Type;", "s", "Lta5$a;", "", "", "kotlin.jvm.PlatformType", "a", "Lta5$a;", "_annotations", "Ljava/util/ArrayList;", "d", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "e", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "g", "_typeParameters", "Lu90;", "t", "()Lu90;", "caller", "w", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "v", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "z", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lm93;", "returnType", "Lo93;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "y", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KCallableImpl.kt */
public abstract class KCallableImpl<R> implements o83<R>, p93 {

    /* renamed from: a */
    public final ta5.C9335a<List<Annotation>> f38942a;

    /* renamed from: d */
    public final ta5.C9335a<ArrayList<KParameter>> f38943d;

    /* renamed from: e */
    public final ta5.C9335a<KTypeImpl> f38944e;

    /* renamed from: g */
    public final ta5.C9335a<List<KTypeParameterImpl>> f38945g;

    public KCallableImpl() {
        ta5.C9335a<List<Annotation>> c = ta5.m72213c(new KCallableImpl$_annotations$1(this));
        vx2.m53590f(c, "lazySoft { descriptor.computeAnnotations() }");
        this.f38942a = c;
        ta5.C9335a<ArrayList<KParameter>> c2 = ta5.m72213c(new KCallableImpl$_parameters$1(this));
        vx2.m53590f(c2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f38943d = c2;
        ta5.C9335a<KTypeImpl> c3 = ta5.m72213c(new KCallableImpl$_returnType$1(this));
        vx2.m53590f(c3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f38944e = c3;
        ta5.C9335a<List<KTypeParameterImpl>> c4 = ta5.m72213c(new KCallableImpl$_typeParameters$1(this));
        vx2.m53590f(c4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f38945g = c4;
    }

    public R call(Object... objArr) {
        vx2.m53591g(objArr, "args");
        try {
            return mo52981t().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    public R callBy(Map<KParameter, ? extends Object> map) {
        vx2.m53591g(map, "args");
        if (mo52985y()) {
            return mo52977n(map);
        }
        return mo52978o(map, (ns0<?>) null);
    }

    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f38942a.invoke();
        vx2.m53590f(invoke, "_annotations()");
        return invoke;
    }

    public List<KParameter> getParameters() {
        ArrayList<KParameter> invoke = this.f38943d.invoke();
        vx2.m53590f(invoke, "_parameters()");
        return invoke;
    }

    public m93 getReturnType() {
        KTypeImpl invoke = this.f38944e.invoke();
        vx2.m53590f(invoke, "_returnType()");
        return invoke;
    }

    public List<o93> getTypeParameters() {
        List<KTypeParameterImpl> invoke = this.f38945g.invoke();
        vx2.m53590f(invoke, "_typeParameters()");
        return invoke;
    }

    public KVisibility getVisibility() {
        fd1 visibility = mo52984x().getVisibility();
        vx2.m53590f(visibility, "descriptor.visibility");
        return y67.m74287q(visibility);
    }

    public boolean isAbstract() {
        if (mo52984x().mo51326p() == Modality.ABSTRACT) {
            return true;
        }
        return false;
    }

    public boolean isFinal() {
        if (mo52984x().mo51326p() == Modality.FINAL) {
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        if (mo52984x().mo51326p() == Modality.OPEN) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final R mo52977n(Map<KParameter, ? extends Object> map) {
        Object obj;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(dk0.m43495u(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                obj = map.get(kParameter);
                if (obj == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.mo45215m()) {
                obj = null;
            } else if (kParameter.mo45210a()) {
                obj = mo52979p(kParameter.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            arrayList.add(obj);
        }
        u90<?> w = mo52983w();
        if (w != null) {
            try {
                Object[] array = arrayList.toArray(new Object[0]);
                vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return w.call(array);
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        } else {
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + mo52984x());
        }
    }

    /* renamed from: o */
    public final R mo52978o(Map<KParameter, ? extends Object> map, ns0<?> ns0) {
        vx2.m53591g(map, "args");
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<KParameter> it = parameters.iterator();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                KParameter next = it.next();
                if (i != 0 && i % 32 == 0) {
                    arrayList2.add(Integer.valueOf(i2));
                    i2 = 0;
                }
                if (map.containsKey(next)) {
                    arrayList.add(map.get(next));
                } else if (next.mo45215m()) {
                    if (!y67.m74281k(next.getType())) {
                        obj = y67.m74277g(oa5.m23732f(next.getType()));
                    }
                    arrayList.add(obj);
                    i2 = (1 << (i % 32)) | i2;
                    z = true;
                } else if (next.mo45210a()) {
                    arrayList.add(mo52979p(next.getType()));
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                if (next.getKind() == KParameter.Kind.VALUE) {
                    i++;
                }
            } else {
                if (ns0 != null) {
                    arrayList.add(ns0);
                }
                if (!z) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i2));
                u90<?> w = mo52983w();
                if (w != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add((Object) null);
                    try {
                        Object[] array2 = arrayList.toArray(new Object[0]);
                        vx2.m53589e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        return w.call(array2);
                    } catch (IllegalAccessException e) {
                        throw new IllegalCallableAccessException(e);
                    }
                } else {
                    throw new KotlinReflectionInternalError("This callable does not support a default call: " + mo52984x());
                }
            }
        }
    }

    /* renamed from: p */
    public final Object mo52979p(m93 m93) {
        Class<?> b = x73.m54253b(r93.m26137b(m93));
        if (b.isArray()) {
            Object newInstance = Array.newInstance(b.getComponentType(), 0);
            vx2.m53590f(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + b.getSimpleName() + ", because it is not an array type");
    }

    /* renamed from: s */
    public final Type mo52980s() {
        C7425c cVar;
        ParameterizedType parameterizedType;
        Type type;
        WildcardType wildcardType;
        Type[] lowerBounds;
        CallableMemberDescriptor x = mo52984x();
        if (x instanceof C7425c) {
            cVar = (C7425c) x;
        } else {
            cVar = null;
        }
        boolean z = true;
        if (cVar == null || !cVar.isSuspend()) {
            z = false;
        }
        if (!z) {
            return null;
        }
        Object m0 = CollectionsKt___CollectionsKt.m47342m0(mo52981t().mo52786a());
        if (m0 instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) m0;
        } else {
            parameterizedType = null;
        }
        if (parameterizedType != null) {
            type = parameterizedType.getRawType();
        } else {
            type = null;
        }
        if (!vx2.m53586b(type, ns0.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        vx2.m53590f(actualTypeArguments, "continuationType.actualTypeArguments");
        Object d0 = ArraysKt___ArraysKt.m47278d0(actualTypeArguments);
        if (d0 instanceof WildcardType) {
            wildcardType = (WildcardType) d0;
        } else {
            wildcardType = null;
        }
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) ArraysKt___ArraysKt.m47256H(lowerBounds);
    }

    /* renamed from: t */
    public abstract u90<?> mo52981t();

    /* renamed from: v */
    public abstract KDeclarationContainerImpl mo52982v();

    /* renamed from: w */
    public abstract u90<?> mo52983w();

    /* renamed from: x */
    public abstract CallableMemberDescriptor mo52984x();

    /* renamed from: y */
    public final boolean mo52985y() {
        if (!vx2.m53586b(getName(), "<init>") || !mo52982v().mo41920k().isAnnotation()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public abstract boolean mo52986z();
}
