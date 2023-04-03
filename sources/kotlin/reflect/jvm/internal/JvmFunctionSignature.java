package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.b83;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\u0003\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "", "a", "<init>", "()V", "FakeJavaAnnotationConstructor", "JavaConstructor", "b", "c", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$a;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$b;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RuntimeTypeMapper.kt */
public abstract class JvmFunctionSignature {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "a", "Ljava/lang/Class;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "()Ljava/util/List;", "methods", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* renamed from: a */
        public final Class<?> f38934a;

        /* renamed from: b */
        public final List<Method> f38935b;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$a */
        /* compiled from: Comparisons.kt */
        public static final class C7352a<T> implements Comparator {
            public final int compare(T t, T t2) {
                return xl0.m54426a(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(Class<?> cls) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(cls, "jClass");
            this.f38934a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            vx2.m53590f(declaredMethods, "jClass.declaredMethods");
            this.f38935b = ArraysKt___ArraysKt.m47282h0(declaredMethods, new C7352a());
        }

        /* renamed from: a */
        public String mo52967a() {
            return CollectionsKt___CollectionsKt.m47338i0(this.f38935b, "", "<init>(", ")V", 0, (CharSequence) null, JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1.INSTANCE, 24, (Object) null);
        }

        /* renamed from: b */
        public final List<Method> mo52968b() {
            return this.f38935b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "a", "Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* renamed from: a */
        public final Constructor<?> f38936a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public JavaConstructor(Constructor<?> constructor) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(constructor, "constructor");
            this.f38936a = constructor;
        }

        /* renamed from: a */
        public String mo52967a() {
            Class[] parameterTypes = this.f38936a.getParameterTypes();
            vx2.m53590f(parameterTypes, "constructor.parameterTypes");
            return ArraysKt___ArraysKt.m47269U(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, JvmFunctionSignature$JavaConstructor$asString$1.INSTANCE, 24, (Object) null);
        }

        /* renamed from: b */
        public final Constructor<?> mo52970b() {
            return this.f38936a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$a;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C7353a extends JvmFunctionSignature {

        /* renamed from: a */
        public final Method f38937a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7353a(Method method) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(method, "method");
            this.f38937a = method;
        }

        /* renamed from: a */
        public String mo52967a() {
            return RuntimeTypeMapperKt.m60064b(this.f38937a);
        }

        /* renamed from: b */
        public final Method mo52971b() {
            return this.f38937a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$b;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "a", "Lb83$b;", "Lb83$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "()Ljava/lang/String;", "constructorDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C7354b extends JvmFunctionSignature {

        /* renamed from: a */
        public final b83.C6855b f38938a;

        /* renamed from: b */
        public final String f38939b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7354b(b83.C6855b bVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(bVar, "signature");
            this.f38938a = bVar;
            this.f38939b = bVar.mo50519a();
        }

        /* renamed from: a */
        public String mo52967a() {
            return this.f38939b;
        }

        /* renamed from: b */
        public final String mo52972b() {
            return this.f38938a.mo50520b();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\r¨\u0006\u0012"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "a", "Lb83$b;", "Lb83$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "c", "()Ljava/lang/String;", "methodName", "methodDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C7355c extends JvmFunctionSignature {

        /* renamed from: a */
        public final b83.C6855b f38940a;

        /* renamed from: b */
        public final String f38941b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7355c(b83.C6855b bVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(bVar, "signature");
            this.f38940a = bVar;
            this.f38941b = bVar.mo50519a();
        }

        /* renamed from: a */
        public String mo52967a() {
            return this.f38941b;
        }

        /* renamed from: b */
        public final String mo52973b() {
            return this.f38940a.mo50520b();
        }

        /* renamed from: c */
        public final String mo52974c() {
            return this.f38940a.mo50521c();
        }
    }

    public JvmFunctionSignature() {
    }

    public /* synthetic */ JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo52967a();
}
