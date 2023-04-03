package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0007¢\u0006\u0004\b;\u0010<J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH&J\"\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0004J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012J \u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019J\u0014\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u0012J\u0014\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u0012JG\u0010$\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\u0003\u001a\u00020\u00122\u0010\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0 2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J?\u0010&\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\u0003\u001a\u00020\u00122\u0010\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0 2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0002¢\u0006\u0004\b&\u0010'J(\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\u001f2\u0010\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0(H\u0002J*\u0010.\u001a\u00020-2\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0*2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0019H\u0002J\u001a\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0(2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J$\u00102\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0002J\u0014\u00103\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002R\u0018\u00106\u001a\u0006\u0012\u0002\b\u00030\u001f8TX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006@"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ldf0;", "Lr24;", "name", "", "Lfx4;", "B", "Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "x", "", "index", "y", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "z", "", "signature", "v", "t", "desc", "Ljava/lang/reflect/Method;", "u", "", "isMember", "s", "Ljava/lang/reflect/Constructor;", "p", "r", "Ljava/lang/Class;", "", "parameterTypes", "returnType", "isStaticDefault", "E", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "H", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "G", "", "result", "isConstructor", "Lr37;", "o", "C", "begin", "end", "F", "D", "A", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "w", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "a", "Data", "MemberBelonginess", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KDeclarationContainerImpl.kt */
public abstract class KDeclarationContainerImpl implements df0 {

    /* renamed from: a */
    public static final C7363a f38970a = new C7363a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final Class<?> f38971d = DefaultConstructorMarker.class;

    /* renamed from: e */
    public static final Regex f38972e = new Regex("<v#(\\d+)>");

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "Loi5;", "a", "Lta5$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class Data {

        /* renamed from: c */
        public static final /* synthetic */ i93<Object>[] f38973c = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        public final ta5.C9335a f38974a;

        public Data() {
            this.f38974a = ta5.m72213c(new KDeclarationContainerImpl$Data$moduleData$2(KDeclarationContainerImpl.this));
        }

        /* renamed from: a */
        public final oi5 mo53030a() {
            Object b = this.f38974a.mo66008b(this, f38973c[0]);
            vx2.m53590f(b, "<get-moduleData>(...)");
            return (oi5) b;
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: KDeclarationContainerImpl.kt */
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z;
            vx2.m53591g(callableMemberDescriptor, "member");
            boolean isReal = callableMemberDescriptor.getKind().isReal();
            if (this == DECLARED) {
                z = true;
            } else {
                z = false;
            }
            if (isReal == z) {
                return true;
            }
            return false;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "a", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C7363a {
        public C7363a() {
        }

        public /* synthetic */ C7363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Regex mo53032a() {
            return KDeclarationContainerImpl.f38972e;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lfd1;", "kotlin.jvm.PlatformType", "first", "second", "", "a", "(Lfd1;Lfd1;)I"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$b */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C7364b<T> implements Comparator {

        /* renamed from: a */
        public static final C7364b<T> f38977a = new C7364b<>();

        /* renamed from: a */
        public final int compare(fd1 fd1, fd1 fd12) {
            Integer d = ed1.m57279d(fd1, fd12);
            if (d == null) {
                return 0;
            }
            return d.intValue();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo44877d2 = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$c", "Lsv0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "Lr37;", "data", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lr37;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C7365c extends sv0 {
        public C7365c(KDeclarationContainerImpl kDeclarationContainerImpl) {
            super(kDeclarationContainerImpl);
        }

        /* renamed from: r */
        public KCallableImpl<?> mo52112j(C7424b bVar, r37 r37) {
            vx2.m53591g(bVar, "descriptor");
            vx2.m53591g(r37, "data");
            throw new IllegalStateException("No constructors should appear here: " + bVar);
        }
    }

    /* renamed from: A */
    public Class<?> mo53015A() {
        Class<?> g = ReflectClassUtilKt.m60599g(mo41920k());
        if (g == null) {
            return mo41920k();
        }
        return g;
    }

    /* renamed from: B */
    public abstract Collection<fx4> mo52988B(r24 r24);

    /* renamed from: C */
    public final List<Class<?>> mo53016C(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (StringsKt__StringsKt.m63079Q("VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = StringsKt__StringsKt.m63099d0(str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(mo53019F(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: D */
    public final Class<?> mo53017D(String str) {
        return mo53019F(str, StringsKt__StringsKt.m63099d0(str, ')', 0, false, 6, (Object) null) + 1, str.length());
    }

    /* renamed from: E */
    public final Method mo53018E(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method E;
        if (z) {
            clsArr[0] = cls;
        }
        Method H = mo53021H(cls, str, clsArr, cls2);
        if (H != null) {
            return H;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (E = mo53018E(superclass, str, clsArr, cls2, z)) != null) {
            return E;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        vx2.m53590f(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            vx2.m53590f(cls3, "superInterface");
            Method E2 = mo53018E(cls3, str, clsArr, cls2, z);
            if (E2 != null) {
                return E2;
            }
            if (z) {
                Class<?> a = w95.m73523a(ReflectClassUtilKt.m60598f(cls3), cls3.getName() + "$DefaultImpls");
                if (a != null) {
                    clsArr[0] = cls3;
                    Method H2 = mo53021H(a, str, clsArr, cls2);
                    if (H2 != null) {
                        return H2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: F */
    public final Class<?> mo53019F(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader f = ReflectClassUtilKt.m60598f(mo41920k());
            String substring = str.substring(i + 1, i2 - 1);
            vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = f.loadClass(yb6.m74331H(substring, '/', '.', false, 4, (Object) null));
            vx2.m53590f(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            return y67.m74276f(mo53019F(str, i + 1, i2));
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                vx2.m53590f(cls, "TYPE");
                return cls;
            } else if (charAt == 'Z') {
                return Boolean.TYPE;
            } else {
                if (charAt == 'C') {
                    return Character.TYPE;
                }
                if (charAt == 'B') {
                    return Byte.TYPE;
                }
                if (charAt == 'S') {
                    return Short.TYPE;
                }
                if (charAt == 'I') {
                    return Integer.TYPE;
                }
                if (charAt == 'F') {
                    return Float.TYPE;
                }
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'D') {
                    return Double.TYPE;
                }
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
            }
        }
    }

    /* renamed from: G */
    public final Constructor<?> mo53020G(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Class[] clsArr = (Class[]) array;
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: H */
    public final Method mo53021H(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        boolean z;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (vx2.m53586b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            vx2.m53590f(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (!vx2.m53586b(method.getName(), str) || !vx2.m53586b(method.getReturnType(), cls2) || !Arrays.equals(method.getParameterTypes(), clsArr)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public final void mo53022o(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> C = mo53016C(str);
        list.addAll(C);
        int size = ((C.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            vx2.m53590f(cls, "TYPE");
            list.add(cls);
        }
        if (z) {
            Class<?> cls2 = f38971d;
            list.remove(cls2);
            vx2.m53590f(cls2, "DEFAULT_CONSTRUCTOR_MARKER");
            list.add(cls2);
            return;
        }
        list.add(Object.class);
    }

    /* renamed from: p */
    public final Constructor<?> mo53023p(String str) {
        vx2.m53591g(str, "desc");
        return mo53020G(mo41920k(), mo53016C(str));
    }

    /* renamed from: r */
    public final Constructor<?> mo53024r(String str) {
        vx2.m53591g(str, "desc");
        Class<?> k = mo41920k();
        ArrayList arrayList = new ArrayList();
        mo53022o(arrayList, str, true);
        r37 r37 = r37.f33317a;
        return mo53020G(k, arrayList);
    }

    /* renamed from: s */
    public final Method mo53025s(String str, String str2, boolean z) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "desc");
        if (vx2.m53586b(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo41920k());
        }
        mo53022o(arrayList, str2, false);
        Class<?> A = mo53015A();
        String str3 = str + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return mo53018E(A, str3, (Class[]) array, mo53017D(str2), z);
    }

    /* renamed from: t */
    public final C7425c mo53026t(String str, String str2) {
        Iterable iterable;
        String str3;
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "signature");
        if (vx2.m53586b(str, "<init>")) {
            iterable = CollectionsKt___CollectionsKt.m47311K0(mo52999w());
        } else {
            r24 h = r24.m71445h(str);
            vx2.m53590f(h, "identifier(name)");
            iterable = mo53000x(h);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable2) {
            if (vx2.m53586b(si5.f44568a.mo65862g((C7425c) next).mo52967a(), str2)) {
                arrayList.add(next);
            }
        }
        boolean z = true;
        if (arrayList.size() == 1) {
            return (C7425c) CollectionsKt___CollectionsKt.m47355z0(arrayList);
        }
        String i0 = CollectionsKt___CollectionsKt.m47338i0(iterable2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.INSTANCE, 30, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (i0.length() != 0) {
            z = false;
        }
        if (z) {
            str3 = " no members found";
        } else {
            str3 = 10 + i0;
        }
        sb.append(str3);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    /* renamed from: u */
    public final Method mo53027u(String str, String str2) {
        Method E;
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "desc");
        if (vx2.m53586b(str, "<init>")) {
            return null;
        }
        Object[] array = mo53016C(str2).toArray(new Class[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class[] clsArr = (Class[]) array;
        Class<?> D = mo53017D(str2);
        Method E2 = mo53018E(mo53015A(), str, clsArr, D, false);
        if (E2 != null) {
            return E2;
        }
        if (!mo53015A().isInterface() || (E = mo53018E(Object.class, str, clsArr, D, false)) == null) {
            return null;
        }
        return E;
    }

    /* renamed from: v */
    public final fx4 mo53028v(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        vx2.m53591g(str4, PublicResolver.FUNC_NAME);
        vx2.m53591g(str5, "signature");
        no3 matchEntire = f38972e.matchEntire(str5);
        boolean z = true;
        if (matchEntire != null) {
            String str6 = matchEntire.mo55415a().mo62769a().mo55416b().get(1);
            fx4 y = mo53001y(Integer.parseInt(str6));
            if (y != null) {
                return y;
            }
            throw new KotlinReflectionInternalError("Local property #" + str6 + " not found in " + mo41920k());
        }
        r24 h = r24.m71445h(str);
        vx2.m53590f(h, "identifier(name)");
        Collection<fx4> B = mo52988B(h);
        ArrayList arrayList = new ArrayList();
        for (T next : B) {
            if (vx2.m53586b(si5.f44568a.mo65861f((fx4) next).mo52144a(), str5)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + str4 + "' (JVM signature: " + str5 + ") not resolved in " + this);
        } else if (arrayList.size() == 1) {
            return (fx4) CollectionsKt___CollectionsKt.m47355z0(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                fd1 visibility = ((fx4) next2).getVisibility();
                Object obj = linkedHashMap.get(visibility);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(visibility, obj);
                }
                ((List) obj).add(next2);
            }
            Collection<V> values = ao3.m31896h(linkedHashMap, C7364b.f38977a).values();
            vx2.m53590f(values, "properties\n             …\n                }.values");
            List list = (List) CollectionsKt___CollectionsKt.m47339j0(values);
            if (list.size() == 1) {
                vx2.m53590f(list, "mostVisibleProperties");
                return (fx4) CollectionsKt___CollectionsKt.m47329Z(list);
            }
            r24 h2 = r24.m71445h(str);
            vx2.m53590f(h2, "identifier(name)");
            String i0 = CollectionsKt___CollectionsKt.m47338i0(mo52988B(h2), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.INSTANCE, 30, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append("Property '");
            sb.append(str4);
            sb.append("' (JVM signature: ");
            sb.append(str5);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            if (i0.length() != 0) {
                z = false;
            }
            if (z) {
                str3 = " no members found";
            } else {
                str3 = 10 + i0;
            }
            sb.append(str3);
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    /* renamed from: w */
    public abstract Collection<C7424b> mo52999w();

    /* renamed from: x */
    public abstract Collection<C7425c> mo53000x(r24 r24);

    /* renamed from: y */
    public abstract fx4 mo53001y(int i);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> mo53029z(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "belonginess"
            p000.vx2.m53591g(r9, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = p000.we5.C9516a.m73584a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0053
            java.lang.Object r3 = r8.next()
            d31 r3 = (p000.d31) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L_0x004c
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            fd1 r5 = r4.getVisibility()
            fd1 r6 = p000.ed1.f37513h
            boolean r5 = p000.vx2.m53586b(r5, r6)
            if (r5 != 0) goto L_0x004c
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L_0x004c
            r37 r4 = p000.r37.f33317a
            java.lang.Object r3 = r3.mo51120j0(r0, r4)
            kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            if (r3 == 0) goto L_0x001e
            r2.add(r3)
            goto L_0x001e
        L_0x0053:
            java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.mo53029z(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }
}
