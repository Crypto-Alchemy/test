package p000;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p000.b83;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0013H\u0002R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lsi5;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "g", "Lfx4;", "possiblyOverriddenProperty", "Lh83;", "f", "Ljava/lang/Class;", "klass", "Lnf0;", "c", "descriptor", "", "b", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$c;", "d", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "e", "Lnf0;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: si5 */
/* compiled from: RuntimeTypeMapper.kt */
public final class si5 {

    /* renamed from: a */
    public static final si5 f44568a = new si5();

    /* renamed from: b */
    public static final nf0 f44569b;

    static {
        nf0 m = nf0.m69751m(new u82("java.lang.Void"));
        vx2.m53590f(m, "topLevel(FqName(\"java.lang.Void\"))");
        f44569b = m;
    }

    /* renamed from: a */
    public final PrimitiveType mo65856a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo65857b(C7425c cVar) {
        if (wc1.m73555o(cVar) || wc1.m73556p(cVar)) {
            return true;
        }
        if (!vx2.m53586b(cVar.getName(), eh0.f37543e.mo51468a()) || !cVar.mo51763f().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final nf0 mo65858c(Class<?> cls) {
        vx2.m53591g(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            vx2.m53590f(componentType, "klass.componentType");
            PrimitiveType a = mo65856a(componentType);
            if (a != null) {
                return new nf0(C7395c.f39113r, a.getArrayTypeName());
            }
            nf0 m = nf0.m69751m(C7395c.C7396a.f39172i.mo66454l());
            vx2.m53590f(m, "topLevel(StandardNames.FqNames.array.toSafe())");
            return m;
        } else if (vx2.m53586b(cls, Void.TYPE)) {
            return f44569b;
        } else {
            PrimitiveType a2 = mo65856a(cls);
            if (a2 != null) {
                return new nf0(C7395c.f39113r, a2.getTypeName());
            }
            nf0 a3 = ReflectClassUtilKt.m60593a(cls);
            if (!a3.mo62682k()) {
                c23 c23 = c23.f37039a;
                u82 b = a3.mo62673b();
                vx2.m53590f(b, "classId.asSingleFqName()");
                nf0 m2 = c23.mo50792m(b);
                if (m2 != null) {
                    return m2;
                }
            }
            return a3;
        }
    }

    /* renamed from: d */
    public final JvmFunctionSignature.C7355c mo65859d(C7425c cVar) {
        return new JvmFunctionSignature.C7355c(new b83.C6855b(mo65860e(cVar), ov3.m70793c(cVar, false, false, 1, (Object) null)));
    }

    /* renamed from: e */
    public final String mo65860e(CallableMemberDescriptor callableMemberDescriptor) {
        String b = SpecialBuiltinMembers.m60679b(callableMemberDescriptor);
        if (b != null) {
            return b;
        }
        if (callableMemberDescriptor instanceof ix4) {
            String d = DescriptorUtilsKt.m62454o(callableMemberDescriptor).getName().mo65594d();
            vx2.m53590f(d, "descriptor.propertyIfAccessor.name.asString()");
            return r73.m71465b(d);
        } else if (callableMemberDescriptor instanceof lx4) {
            String d2 = DescriptorUtilsKt.m62454o(callableMemberDescriptor).getName().mo65594d();
            vx2.m53590f(d2, "descriptor.propertyIfAccessor.name.asString()");
            return r73.m71468e(d2);
        } else {
            String d3 = callableMemberDescriptor.getName().mo65594d();
            vx2.m53590f(d3, "descriptor.name.asString()");
            return d3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.reflect.jvm.internal.JvmFunctionSignature$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.h83 mo65861f(p000.fx4 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblyOverriddenProperty"
            p000.vx2.m53591g(r8, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r8 = p000.dd1.m56807L(r8)
            fx4 r8 = (p000.fx4) r8
            fx4 r1 = r8.mo50045a()
            java.lang.String r8 = "unwrapFakeOverride(possi…rriddenProperty).original"
            p000.vx2.m53590f(r1, r8)
            boolean r8 = r1 instanceof p000.xd1
            r0 = 0
            if (r8 == 0) goto L_0x003e
            r8 = r1
            xd1 r8 = (p000.xd1) r8
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = r8.mo65456Z()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f39867d
            java.lang.String r4 = "propertySignature"
            p000.vx2.m53590f(r3, r4)
            java.lang.Object r3 = p000.wx4.m73751a(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3
            if (r3 == 0) goto L_0x00c8
            h83$c r6 = new h83$c
            t24 r4 = r8.mo65454E()
            w17 r5 = r8.mo65453A()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x003e:
            boolean r8 = r1 instanceof p000.u13
            if (r8 == 0) goto L_0x00c8
            r8 = r1
            u13 r8 = (p000.u13) r8
            a66 r8 = r8.getSource()
            boolean r2 = r8 instanceof p000.a23
            if (r2 == 0) goto L_0x0050
            a23 r8 = (p000.a23) r8
            goto L_0x0051
        L_0x0050:
            r8 = r0
        L_0x0051:
            if (r8 == 0) goto L_0x0058
            d13 r8 = r8.mo50052c()
            goto L_0x0059
        L_0x0058:
            r8 = r0
        L_0x0059:
            boolean r2 = r8 instanceof p000.ca5
            if (r2 == 0) goto L_0x0069
            h83$a r0 = new h83$a
            ca5 r8 = (p000.ca5) r8
            java.lang.reflect.Field r8 = r8.mo50848S()
            r0.<init>(r8)
            goto L_0x00a3
        L_0x0069:
            boolean r2 = r8 instanceof p000.fa5
            if (r2 == 0) goto L_0x00a4
            h83$b r2 = new h83$b
            fa5 r8 = (p000.fa5) r8
            java.lang.reflect.Method r8 = r8.mo50848S()
            lx4 r1 = r1.getSetter()
            if (r1 == 0) goto L_0x0080
            a66 r1 = r1.getSource()
            goto L_0x0081
        L_0x0080:
            r1 = r0
        L_0x0081:
            boolean r3 = r1 instanceof p000.a23
            if (r3 == 0) goto L_0x0088
            a23 r1 = (p000.a23) r1
            goto L_0x0089
        L_0x0088:
            r1 = r0
        L_0x0089:
            if (r1 == 0) goto L_0x0090
            d13 r1 = r1.mo50052c()
            goto L_0x0091
        L_0x0090:
            r1 = r0
        L_0x0091:
            boolean r3 = r1 instanceof p000.fa5
            if (r3 == 0) goto L_0x0098
            fa5 r1 = (p000.fa5) r1
            goto L_0x0099
        L_0x0098:
            r1 = r0
        L_0x0099:
            if (r1 == 0) goto L_0x009f
            java.lang.reflect.Method r0 = r1.mo50848S()
        L_0x009f:
            r2.<init>(r8, r0)
            r0 = r2
        L_0x00a3:
            return r0
        L_0x00a4:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r8)
            r8 = 41
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        L_0x00c8:
            ix4 r8 = r1.getGetter()
            p000.vx2.m53588d(r8)
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r8 = r7.mo65859d(r8)
            lx4 r1 = r1.getSetter()
            if (r1 == 0) goto L_0x00dd
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r0 = r7.mo65859d(r1)
        L_0x00dd:
            h83$d r1 = new h83$d
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.si5.mo65861f(fx4):h83");
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [d13] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.JvmFunctionSignature mo65862g(kotlin.reflect.jvm.internal.impl.descriptors.C7425c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblySubstitutedFunction"
            p000.vx2.m53591g(r8, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = p000.dd1.m56807L(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C7425c) r0
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r0.mo50045a()
            java.lang.String r1 = "unwrapFakeOverride(possi…titutedFunction).original"
            p000.vx2.m53590f(r0, r1)
            boolean r1 = r0 instanceof p000.pd1
            if (r1 == 0) goto L_0x0072
            r1 = r0
            pd1 r1 = (p000.pd1) r1
            kotlin.reflect.jvm.internal.impl.protobuf.h r2 = r1.mo65456Z()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function
            if (r3 == 0) goto L_0x003c
            i83 r3 = p000.i83.f38338a
            r4 = r2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r4
            t24 r5 = r1.mo65454E()
            w17 r6 = r1.mo65453A()
            b83$b r3 = r3.mo52420e(r4, r5, r6)
            if (r3 == 0) goto L_0x003c
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r8 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$c
            r8.<init>(r3)
            return r8
        L_0x003c:
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor
            if (r3 == 0) goto L_0x006d
            i83 r3 = p000.i83.f38338a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) r2
            t24 r4 = r1.mo65454E()
            w17 r1 = r1.mo65453A()
            b83$b r1 = r3.mo52418b(r2, r4, r1)
            if (r1 == 0) goto L_0x006d
            d31 r8 = r8.mo51119b()
            java.lang.String r0 = "possiblySubstitutedFunction.containingDeclaration"
            p000.vx2.m53590f(r8, r0)
            boolean r8 = p000.nu2.m70090b(r8)
            if (r8 == 0) goto L_0x0067
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r8 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$c
            r8.<init>(r1)
            goto L_0x006c
        L_0x0067:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$b r8 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$b
            r8.<init>(r1)
        L_0x006c:
            return r8
        L_0x006d:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r8 = r7.mo65859d(r0)
            return r8
        L_0x0072:
            boolean r8 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            r1 = 0
            if (r8 == 0) goto L_0x00ba
            r8 = r0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r8 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r8
            a66 r8 = r8.getSource()
            boolean r2 = r8 instanceof p000.a23
            if (r2 == 0) goto L_0x0085
            a23 r8 = (p000.a23) r8
            goto L_0x0086
        L_0x0085:
            r8 = r1
        L_0x0086:
            if (r8 == 0) goto L_0x008d
            d13 r8 = r8.mo50052c()
            goto L_0x008e
        L_0x008d:
            r8 = r1
        L_0x008e:
            boolean r2 = r8 instanceof p000.fa5
            if (r2 == 0) goto L_0x0095
            r1 = r8
            fa5 r1 = (p000.fa5) r1
        L_0x0095:
            if (r1 == 0) goto L_0x00a3
            java.lang.reflect.Method r8 = r1.mo50848S()
            if (r8 == 0) goto L_0x00a3
            kotlin.reflect.jvm.internal.JvmFunctionSignature$a r0 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$a
            r0.<init>(r8)
            return r0
        L_0x00a3:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x00ba:
            boolean r8 = r0 instanceof p000.q03
            r2 = 41
            java.lang.String r3 = " ("
            if (r8 == 0) goto L_0x011f
            r8 = r0
            q03 r8 = (p000.q03) r8
            a66 r8 = r8.getSource()
            boolean r4 = r8 instanceof p000.a23
            if (r4 == 0) goto L_0x00d0
            a23 r8 = (p000.a23) r8
            goto L_0x00d1
        L_0x00d0:
            r8 = r1
        L_0x00d1:
            if (r8 == 0) goto L_0x00d7
            d13 r1 = r8.mo50052c()
        L_0x00d7:
            boolean r8 = r1 instanceof p000.z95
            if (r8 == 0) goto L_0x00e7
            kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor r8 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor
            z95 r1 = (p000.z95) r1
            java.lang.reflect.Constructor r0 = r1.mo50848S()
            r8.<init>(r0)
            goto L_0x00fe
        L_0x00e7:
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass
            if (r8 == 0) goto L_0x00ff
            r8 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass r8 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass) r8
            boolean r4 = r8.mo53390n()
            if (r4 == 0) goto L_0x00ff
            kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor r0 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor
            java.lang.Class r8 = r8.getElement()
            r0.<init>(r8)
            r8 = r0
        L_0x00fe:
            return r8
        L_0x00ff:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r8.<init>(r0)
            throw r8
        L_0x011f:
            boolean r8 = r7.mo65857b(r0)
            if (r8 == 0) goto L_0x012a
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r8 = r7.mo65859d(r0)
            return r8
        L_0x012a:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown origin of "
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.si5.mo65862g(kotlin.reflect.jvm.internal.impl.descriptors.c):kotlin.reflect.jvm.internal.JvmFunctionSignature");
    }
}
