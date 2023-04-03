package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.RuntimeTypeMapperKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p000.b83;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0001\u0004\t\n\u000b\f¨\u0006\r"}, mo44877d2 = {"Lh83;", "", "", "a", "<init>", "()V", "b", "c", "d", "Lh83$a;", "Lh83$b;", "Lh83$c;", "Lh83$d;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: h83 */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class h83 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lh83$a;", "Lh83;", "", "a", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: h83$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C7167a extends h83 {

        /* renamed from: a */
        public final Field f38171a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7167a(Field field) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(field, "field");
            this.f38171a = field;
        }

        /* renamed from: a */
        public String mo52144a() {
            StringBuilder sb = new StringBuilder();
            String name = this.f38171a.getName();
            vx2.m53590f(name, "field.name");
            sb.append(r73.m71465b(name));
            sb.append("()");
            Class<?> type = this.f38171a.getType();
            vx2.m53590f(type, "field.type");
            sb.append(ReflectClassUtilKt.m60594b(type));
            return sb.toString();
        }

        /* renamed from: b */
        public final Field mo52145b() {
            return this.f38171a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, mo44877d2 = {"Lh83$b;", "Lh83;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "getterMethod", "c", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: h83$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C7168b extends h83 {

        /* renamed from: a */
        public final Method f38172a;

        /* renamed from: b */
        public final Method f38173b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7168b(Method method, Method method2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(method, "getterMethod");
            this.f38172a = method;
            this.f38173b = method2;
        }

        /* renamed from: a */
        public String mo52144a() {
            return RuntimeTypeMapperKt.m60064b(this.f38172a);
        }

        /* renamed from: b */
        public final Method mo52146b() {
            return this.f38172a;
        }

        /* renamed from: c */
        public final Method mo52147c() {
            return this.f38173b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, mo44877d2 = {"Lh83$c;", "Lh83;", "", "a", "c", "Lfx4;", "Lfx4;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lt24;", "d", "Lt24;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "nameResolver", "Lw17;", "e", "Lw17;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "typeTable", "f", "Ljava/lang/String;", "string", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: h83$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C7169c extends h83 {

        /* renamed from: a */
        public final fx4 f38174a;

        /* renamed from: b */
        public final ProtoBuf$Property f38175b;

        /* renamed from: c */
        public final JvmProtoBuf.JvmPropertySignature f38176c;

        /* renamed from: d */
        public final t24 f38177d;

        /* renamed from: e */
        public final w17 f38178e;

        /* renamed from: f */
        public final String f38179f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7169c(fx4 fx4, ProtoBuf$Property protoBuf$Property, JvmProtoBuf.JvmPropertySignature jvmPropertySignature, t24 t24, w17 w17) {
            super((DefaultConstructorMarker) null);
            String str;
            vx2.m53591g(fx4, "descriptor");
            vx2.m53591g(protoBuf$Property, "proto");
            vx2.m53591g(jvmPropertySignature, "signature");
            vx2.m53591g(t24, "nameResolver");
            vx2.m53591g(w17, "typeTable");
            this.f38174a = fx4;
            this.f38175b = protoBuf$Property;
            this.f38176c = jvmPropertySignature;
            this.f38177d = t24;
            this.f38178e = w17;
            if (jvmPropertySignature.hasGetter()) {
                str = t24.getString(jvmPropertySignature.getGetter().getName()) + t24.getString(jvmPropertySignature.getGetter().getDesc());
            } else {
                b83.C6854a d = i83.m58869d(i83.f38338a, protoBuf$Property, t24, w17, false, 8, (Object) null);
                if (d != null) {
                    String d2 = d.mo50523d();
                    str = r73.m71465b(d2) + mo52149c() + "()" + d.mo50524e();
                } else {
                    throw new KotlinReflectionInternalError("No field signature for property: " + fx4);
                }
            }
            this.f38179f = str;
        }

        /* renamed from: a */
        public String mo52144a() {
            return this.f38179f;
        }

        /* renamed from: b */
        public final fx4 mo52148b() {
            return this.f38174a;
        }

        /* renamed from: c */
        public final String mo52149c() {
            String str;
            d31 b = this.f38174a.mo51119b();
            vx2.m53590f(b, "descriptor.containingDeclaration");
            if (vx2.m53586b(this.f38174a.getVisibility(), ed1.f37509d) && (b instanceof DeserializedClassDescriptor)) {
                ProtoBuf$Class V0 = ((DeserializedClassDescriptor) b).mo55173V0();
                GeneratedMessageLite.C7604e<ProtoBuf$Class, Integer> eVar = JvmProtoBuf.f39872i;
                vx2.m53590f(eVar, "classModuleName");
                Integer num = (Integer) wx4.m73751a(V0, eVar);
                if (num == null || (str = this.f38177d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return DecodedChar.FNC1 + w24.m73413a(str);
            } else if (!vx2.m53586b(this.f38174a.getVisibility(), ed1.f37506a) || !(b instanceof fk4)) {
                return "";
            } else {
                fx4 fx4 = this.f38174a;
                vx2.m53589e(fx4, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                sd1 F = ((xd1) fx4).mo65455F();
                if (!(F instanceof g83)) {
                    return "";
                }
                g83 g83 = (g83) F;
                if (g83.mo51878f() == null) {
                    return "";
                }
                return DecodedChar.FNC1 + g83.mo51880h().mo65594d();
            }
        }

        /* renamed from: d */
        public final t24 mo52150d() {
            return this.f38177d;
        }

        /* renamed from: e */
        public final ProtoBuf$Property mo52151e() {
            return this.f38175b;
        }

        /* renamed from: f */
        public final JvmProtoBuf.JvmPropertySignature mo52152f() {
            return this.f38176c;
        }

        /* renamed from: g */
        public final w17 mo52153g() {
            return this.f38178e;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, mo44877d2 = {"Lh83$d;", "Lh83;", "", "a", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;", "b", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;", "getterSignature", "c", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: h83$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C7170d extends h83 {

        /* renamed from: a */
        public final JvmFunctionSignature.C7355c f38180a;

        /* renamed from: b */
        public final JvmFunctionSignature.C7355c f38181b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7170d(JvmFunctionSignature.C7355c cVar, JvmFunctionSignature.C7355c cVar2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(cVar, "getterSignature");
            this.f38180a = cVar;
            this.f38181b = cVar2;
        }

        /* renamed from: a */
        public String mo52144a() {
            return this.f38180a.mo52967a();
        }

        /* renamed from: b */
        public final JvmFunctionSignature.C7355c mo52154b() {
            return this.f38180a;
        }

        /* renamed from: c */
        public final JvmFunctionSignature.C7355c mo52155c() {
            return this.f38181b;
        }
    }

    public h83() {
    }

    public /* synthetic */ h83(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo52144a();
}
