package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.StringsKt__StringsKt;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00012\u00020\u0005:\u0001SB\u0015\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0016\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR9\u0010&\u001a$\u0012 \u0012\u001e \"*\u000e\u0018\u00010!R\b\u0012\u0004\u0012\u00028\u00000\u00000!R\b\u0012\u0004\u0012\u00028\u00000\u00000 8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u00010\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000030\n8VX\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0014\u0010>\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010:R\u001a\u0010B\u001a\u00020\u00138VX\u0004¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010:R\u0014\u0010F\u001a\u00020C8BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8@X\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020K8@X\u0004¢\u0006\u0006\u001a\u0004\bO\u0010M¨\u0006T"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", "T", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lq83;", "Lp93;", "", "Q", "Lr24;", "name", "", "Lfx4;", "B", "Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "x", "", "index", "y", "value", "", "h", "other", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "g", "Ljava/lang/Class;", "k", "()Ljava/lang/Class;", "jClass", "Lta5$b;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "Lta5$b;", "M", "()Lta5$b;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "w", "()Ljava/util/Collection;", "constructorDescriptors", "l", "()Ljava/lang/String;", "qualifiedName", "Lz83;", "L", "constructors", "f", "()Ljava/lang/Object;", "objectInstance", "isAbstract", "()Z", "c", "isSealed", "i", "isInner", "q", "isValue$annotations", "()V", "isValue", "Lnf0;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lif0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "Data", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KClassImpl.kt */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements q83<T>, p93 {

    /* renamed from: g */
    public final Class<T> f38947g;

    /* renamed from: k */
    public final ta5.C9336b<KClassImpl<T>.Data> f38948k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\bE\u0010FJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002R\u001b\u0010\f\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00058FX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00058FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0014R-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198FX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00198FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\"\u0010\u001dR#\u0010(\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010$\u0012\u0004\b'\u0010\u001f\u001a\u0004\b%\u0010&R!\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\r8FX\u0002¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u0011R!\u00100\u001a\b\u0012\u0004\u0012\u00020-0\r8FX\u0002¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u0011R)\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0\r8FX\u0002¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u0011R%\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0002¢\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b*\u0010\u001dR%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198BX\u0002¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b.\u0010\u001dR%\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198BX\u0002¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b5\u0010\u001dR%\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b7\u0010\u001dR%\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b\u0016\u0010\u001dR%\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0002¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b\u001b\u0010\u001dR%\u0010A\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0002¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b@\u0010\u001dR%\u0010D\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0002¢\u0006\f\n\u0004\bB\u0010\t\u001a\u0004\bC\u0010\u001d¨\u0006G"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/Class;", "jClass", "", "f", "Lif0;", "d", "Lta5$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "i", "()Ljava/util/List;", "annotations", "getSimpleName", "()Ljava/lang/String;", "simpleName", "g", "q", "qualifiedName", "", "Lz83;", "h", "j", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lq83;", "getNestedClasses", "nestedClasses", "Lta5$b;", "p", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lo93;", "k", "getTypeParameters", "typeParameters", "Lm93;", "l", "getSupertypes", "supertypes", "m", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "n", "declaredNonStaticMembers", "o", "declaredStaticMembers", "inheritedNonStaticMembers", "inheritedStaticMembers", "r", "allNonStaticMembers", "s", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: KClassImpl.kt */
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: w */
        public static final /* synthetic */ i93<Object>[] f38949w;

        /* renamed from: d */
        public final ta5.C9335a f38950d;

        /* renamed from: e */
        public final ta5.C9335a f38951e = ta5.m72213c(new KClassImpl$Data$annotations$2(this));

        /* renamed from: f */
        public final ta5.C9335a f38952f;

        /* renamed from: g */
        public final ta5.C9335a f38953g;

        /* renamed from: h */
        public final ta5.C9335a f38954h;

        /* renamed from: i */
        public final ta5.C9335a f38955i;

        /* renamed from: j */
        public final ta5.C9336b f38956j;

        /* renamed from: k */
        public final ta5.C9335a f38957k;

        /* renamed from: l */
        public final ta5.C9335a f38958l;

        /* renamed from: m */
        public final ta5.C9335a f38959m;

        /* renamed from: n */
        public final ta5.C9335a f38960n;

        /* renamed from: o */
        public final ta5.C9335a f38961o;

        /* renamed from: p */
        public final ta5.C9335a f38962p;

        /* renamed from: q */
        public final ta5.C9335a f38963q;

        /* renamed from: r */
        public final ta5.C9335a f38964r;

        /* renamed from: s */
        public final ta5.C9335a f38965s;

        /* renamed from: t */
        public final ta5.C9335a f38966t;

        /* renamed from: u */
        public final ta5.C9335a f38967u;

        static {
            Class<Data> cls = Data.class;
            f38949w = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "annotations", "getAnnotations()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "simpleName", "getSimpleName()Ljava/lang/String;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "constructors", "getConstructors()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "typeParameters", "getTypeParameters()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "supertypes", "getSupertypes()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            super();
            this.f38950d = ta5.m72213c(new KClassImpl$Data$descriptor$2(KClassImpl.this));
            this.f38952f = ta5.m72213c(new KClassImpl$Data$simpleName$2(KClassImpl.this, this));
            this.f38953g = ta5.m72213c(new KClassImpl$Data$qualifiedName$2(KClassImpl.this));
            this.f38954h = ta5.m72213c(new KClassImpl$Data$constructors$2(KClassImpl.this));
            this.f38955i = ta5.m72213c(new KClassImpl$Data$nestedClasses$2(this));
            this.f38956j = ta5.m72212b(new KClassImpl$Data$objectInstance$2(this, KClassImpl.this));
            this.f38957k = ta5.m72213c(new KClassImpl$Data$typeParameters$2(this, KClassImpl.this));
            this.f38958l = ta5.m72213c(new KClassImpl$Data$supertypes$2(this, KClassImpl.this));
            this.f38959m = ta5.m72213c(new KClassImpl$Data$sealedSubclasses$2(this));
            this.f38960n = ta5.m72213c(new KClassImpl$Data$declaredNonStaticMembers$2(KClassImpl.this));
            this.f38961o = ta5.m72213c(new KClassImpl$Data$declaredStaticMembers$2(KClassImpl.this));
            this.f38962p = ta5.m72213c(new KClassImpl$Data$inheritedNonStaticMembers$2(KClassImpl.this));
            this.f38963q = ta5.m72213c(new KClassImpl$Data$inheritedStaticMembers$2(KClassImpl.this));
            this.f38964r = ta5.m72213c(new KClassImpl$Data$allNonStaticMembers$2(this));
            this.f38965s = ta5.m72213c(new KClassImpl$Data$allStaticMembers$2(this));
            this.f38966t = ta5.m72213c(new KClassImpl$Data$declaredMembers$2(this));
            this.f38967u = ta5.m72213c(new KClassImpl$Data$allMembers$2(this));
        }

        /* renamed from: f */
        public final String mo53002f(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                vx2.m53590f(simpleName, PublicResolver.FUNC_NAME);
                return StringsKt__StringsKt.m63072M0(simpleName, enclosingMethod.getName() + DecodedChar.FNC1, (String) null, 2, (Object) null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                vx2.m53590f(simpleName, PublicResolver.FUNC_NAME);
                return StringsKt__StringsKt.m63072M0(simpleName, enclosingConstructor.getName() + DecodedChar.FNC1, (String) null, 2, (Object) null);
            }
            vx2.m53590f(simpleName, PublicResolver.FUNC_NAME);
            return StringsKt__StringsKt.m63071L0(simpleName, DecodedChar.FNC1, (String) null, 2, (Object) null);
        }

        /* renamed from: g */
        public final Collection<KCallableImpl<?>> mo53003g() {
            Object b = this.f38964r.mo66008b(this, f38949w[14]);
            vx2.m53590f(b, "<get-allNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: h */
        public final Collection<KCallableImpl<?>> mo53004h() {
            Object b = this.f38965s.mo66008b(this, f38949w[15]);
            vx2.m53590f(b, "<get-allStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: i */
        public final List<Annotation> mo53005i() {
            Object b = this.f38951e.mo66008b(this, f38949w[1]);
            vx2.m53590f(b, "<get-annotations>(...)");
            return (List) b;
        }

        /* renamed from: j */
        public final Collection<z83<T>> mo53006j() {
            Object b = this.f38954h.mo66008b(this, f38949w[4]);
            vx2.m53590f(b, "<get-constructors>(...)");
            return (Collection) b;
        }

        /* renamed from: k */
        public final Collection<KCallableImpl<?>> mo53007k() {
            Object b = this.f38960n.mo66008b(this, f38949w[10]);
            vx2.m53590f(b, "<get-declaredNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: l */
        public final Collection<KCallableImpl<?>> mo53008l() {
            Object b = this.f38961o.mo66008b(this, f38949w[11]);
            vx2.m53590f(b, "<get-declaredStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: m */
        public final if0 mo53009m() {
            Object b = this.f38950d.mo66008b(this, f38949w[0]);
            vx2.m53590f(b, "<get-descriptor>(...)");
            return (if0) b;
        }

        /* renamed from: n */
        public final Collection<KCallableImpl<?>> mo53010n() {
            Object b = this.f38962p.mo66008b(this, f38949w[12]);
            vx2.m53590f(b, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: o */
        public final Collection<KCallableImpl<?>> mo53011o() {
            Object b = this.f38963q.mo66008b(this, f38949w[13]);
            vx2.m53590f(b, "<get-inheritedStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: p */
        public final T mo53012p() {
            return this.f38956j.mo66008b(this, f38949w[6]);
        }

        /* renamed from: q */
        public final String mo53013q() {
            return (String) this.f38953g.mo66008b(this, f38949w[3]);
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KClassImpl$a */
    /* compiled from: KClassImpl.kt */
    public /* synthetic */ class C7361a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38969a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            f38969a = iArr;
        }
    }

    public KClassImpl(Class<T> cls) {
        vx2.m53591g(cls, "jClass");
        this.f38947g = cls;
        ta5.C9336b<KClassImpl<T>.Data> b = ta5.m72212b(new KClassImpl$data$1(this));
        vx2.m53590f(b, "lazy { Data() }");
        this.f38948k = b;
    }

    /* renamed from: B */
    public Collection<fx4> mo52988B(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        MemberScope O = mo52993O();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.m47350u0(O.mo50861b(r24, noLookupLocation), mo52994P().mo50861b(r24, noLookupLocation));
    }

    /* renamed from: K */
    public final nf0 mo52989K() {
        return si5.f44568a.mo65858c(mo41920k());
    }

    /* renamed from: L */
    public Collection<z83<T>> mo52990L() {
        return this.f38948k.invoke().mo53006j();
    }

    /* renamed from: M */
    public final ta5.C9336b<KClassImpl<T>.Data> mo52991M() {
        return this.f38948k;
    }

    /* renamed from: N */
    public if0 mo52992N() {
        return this.f38948k.invoke().mo53009m();
    }

    /* renamed from: O */
    public final MemberScope mo52993O() {
        return mo52992N().mo51464n().mo51146m();
    }

    /* renamed from: P */
    public final MemberScope mo52994P() {
        MemberScope g0 = mo52992N().mo52347g0();
        vx2.m53590f(g0, "descriptor.staticScope");
        return g0;
    }

    /* renamed from: Q */
    public final Void mo52995Q() {
        KotlinClassHeader.Kind kind;
        int i;
        KotlinClassHeader a;
        pa5 a2 = pa5.f44018c.mo65270a(mo41920k());
        if (a2 == null || (a = a2.mo65261a()) == null) {
            kind = null;
        } else {
            kind = a.mo53822c();
        }
        if (kind == null) {
            i = -1;
        } else {
            i = C7361a.f38969a[kind.ordinal()];
        }
        switch (i) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + mo41920k());
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + mo41920k());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + mo41920k());
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + mo41920k() + " (kind = " + kind + ')');
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public boolean mo46997c() {
        if (mo52992N().mo51326p() == Modality.SEALED) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KClassImpl) || !vx2.m53586b(x73.m54254c(this), x73.m54254c((q83) obj))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public T mo46998f() {
        return this.f38948k.invoke().mo53012p();
    }

    public List<Annotation> getAnnotations() {
        return this.f38948k.invoke().mo53005i();
    }

    /* renamed from: h */
    public boolean mo46999h(Object obj) {
        Integer c = ReflectClassUtilKt.m60595c(mo41920k());
        if (c != null) {
            return t07.m52034m(obj, c.intValue());
        }
        Class<?> g = ReflectClassUtilKt.m60599g(mo41920k());
        if (g == null) {
            g = mo41920k();
        }
        return g.isInstance(obj);
    }

    public int hashCode() {
        return x73.m54254c(this).hashCode();
    }

    /* renamed from: i */
    public boolean mo47000i() {
        return mo52992N().mo51669i();
    }

    public boolean isAbstract() {
        if (mo52992N().mo51326p() == Modality.ABSTRACT) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public Class<T> mo41920k() {
        return this.f38947g;
    }

    /* renamed from: l */
    public String mo47002l() {
        return this.f38948k.invoke().mo53013q();
    }

    /* renamed from: q */
    public boolean mo47003q() {
        return mo52992N().mo52352q();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        nf0 K = mo52989K();
        u82 h = K.mo62678h();
        vx2.m53590f(h, "classId.packageFqName");
        if (h.mo66197d()) {
            str = "";
        } else {
            str = h.mo66195b() + '.';
        }
        String b = K.mo62680i().mo66195b();
        vx2.m53590f(b, "classId.relativeClassName.asString()");
        sb.append(str + yb6.m74331H(b, '.', DecodedChar.FNC1, false, 4, (Object) null));
        return sb.toString();
    }

    /* renamed from: w */
    public Collection<C7424b> mo52999w() {
        if0 N = mo52992N();
        if (N.getKind() == ClassKind.INTERFACE || N.getKind() == ClassKind.OBJECT) {
            return ck0.m33062j();
        }
        Collection<ef0> h = N.mo52349h();
        vx2.m53590f(h, "descriptor.constructors");
        return h;
    }

    /* renamed from: x */
    public Collection<C7425c> mo53000x(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        MemberScope O = mo52993O();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.m47350u0(O.mo50862c(r24, noLookupLocation), mo52994P().mo50862c(r24, noLookupLocation));
    }

    /* renamed from: y */
    public fx4 mo53001y(int i) {
        DeserializedClassDescriptor deserializedClassDescriptor;
        Class<?> declaringClass;
        if (!vx2.m53586b(mo41920k().getSimpleName(), "DefaultImpls") || (declaringClass = mo41920k().getDeclaringClass()) == null || !declaringClass.isInterface()) {
            if0 N = mo52992N();
            if (N instanceof DeserializedClassDescriptor) {
                deserializedClassDescriptor = (DeserializedClassDescriptor) N;
            } else {
                deserializedClassDescriptor = null;
            }
            if (deserializedClassDescriptor == null) {
                return null;
            }
            ProtoBuf$Class V0 = deserializedClassDescriptor.mo55173V0();
            GeneratedMessageLite.C7604e<ProtoBuf$Class, List<ProtoBuf$Property>> eVar = JvmProtoBuf.f39873j;
            vx2.m53590f(eVar, "classLocalVariable");
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) wx4.m73752b(V0, eVar, i);
            if (protoBuf$Property != null) {
                return (fx4) y67.m74278h(mo41920k(), protoBuf$Property, deserializedClassDescriptor.mo55172U0().mo56230g(), deserializedClassDescriptor.mo55172U0().mo56233j(), deserializedClassDescriptor.mo55175X0(), KClassImpl$getLocalProperty$2$1$1.INSTANCE);
            }
            return null;
        }
        q83<?> e = x73.m54256e(declaringClass);
        vx2.m53589e(e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        return ((KClassImpl) e).mo53001y(i);
    }
}
