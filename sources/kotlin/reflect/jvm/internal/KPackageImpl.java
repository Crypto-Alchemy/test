package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u001f\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0013\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b-\u0010.J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001e\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR*\u0010\"\u001a\u0018\u0012\u0014\u0012\u0012 \u001f*\b\u0018\u00010\u001eR\u00020\u00000\u001eR\u00020\u00000\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00138TX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lr24;", "name", "", "Lfx4;", "B", "Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "x", "", "index", "y", "", "other", "", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "g", "Ljava/lang/Class;", "k", "()Ljava/lang/Class;", "jClass", "Ljava/lang/String;", "getUsageModuleName", "()Ljava/lang/String;", "usageModuleName", "Lta5$b;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "r", "Lta5$b;", "data", "A", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "w", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "Data", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KPackageImpl.kt */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: g */
    public final Class<?> f38989g;

    /* renamed from: k */
    public final String f38990k;

    /* renamed from: r */
    public final ta5.C9336b<Data> f38991r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR!\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R/\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0004\u0010\u0018R%\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lpa5;", "d", "Lta5$a;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lta5$b;", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/Triple;", "Ld83;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lc83;", "g", "()Lkotlin/Triple;", "metadata", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "h", "getMembers", "()Ljava/util/Collection;", "members", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: KPackageImpl.kt */
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: j */
        public static final /* synthetic */ i93<Object>[] f38992j;

        /* renamed from: d */
        public final ta5.C9335a f38993d;

        /* renamed from: e */
        public final ta5.C9335a f38994e = ta5.m72213c(new KPackageImpl$Data$scope$2(this));

        /* renamed from: f */
        public final ta5.C9336b f38995f;

        /* renamed from: g */
        public final ta5.C9336b f38996g;

        /* renamed from: h */
        public final ta5.C9335a f38997h;

        static {
            Class<Data> cls = Data.class;
            f38992j = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "metadata", "getMetadata()Lkotlin/Triple;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            super();
            this.f38993d = ta5.m72213c(new KPackageImpl$Data$kotlinClass$2(KPackageImpl.this));
            this.f38995f = ta5.m72212b(new KPackageImpl$Data$multifileFacade$2(this, KPackageImpl.this));
            this.f38996g = ta5.m72212b(new KPackageImpl$Data$metadata$2(this));
            this.f38997h = ta5.m72213c(new KPackageImpl$Data$members$2(KPackageImpl.this, this));
        }

        /* renamed from: c */
        public final pa5 mo53059c() {
            return (pa5) this.f38993d.mo66008b(this, f38992j[0]);
        }

        /* renamed from: d */
        public final Triple<d83, ProtoBuf$Package, c83> mo53060d() {
            return (Triple) this.f38996g.mo66008b(this, f38992j[3]);
        }

        /* renamed from: e */
        public final Class<?> mo53061e() {
            return (Class) this.f38995f.mo66008b(this, f38992j[2]);
        }

        /* renamed from: f */
        public final MemberScope mo53062f() {
            Object b = this.f38994e.mo66008b(this, f38992j[1]);
            vx2.m53590f(b, "<get-scope>(...)");
            return (MemberScope) b;
        }
    }

    public KPackageImpl(Class<?> cls, String str) {
        vx2.m53591g(cls, "jClass");
        this.f38989g = cls;
        this.f38990k = str;
        ta5.C9336b<Data> b = ta5.m72212b(new KPackageImpl$data$1(this));
        vx2.m53590f(b, "lazy { Data() }");
        this.f38991r = b;
    }

    /* renamed from: A */
    public Class<?> mo53015A() {
        Class<?> e = this.f38991r.invoke().mo53061e();
        if (e == null) {
            return mo41920k();
        }
        return e;
    }

    /* renamed from: B */
    public Collection<fx4> mo52988B(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return mo53055I().mo50861b(r24, NoLookupLocation.FROM_REFLECTION);
    }

    /* renamed from: I */
    public final MemberScope mo53055I() {
        return this.f38991r.invoke().mo53062f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KPackageImpl) || !vx2.m53586b(mo41920k(), ((KPackageImpl) obj).mo41920k())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo41920k().hashCode();
    }

    /* renamed from: k */
    public Class<?> mo41920k() {
        return this.f38989g;
    }

    public String toString() {
        return "file class " + ReflectClassUtilKt.m60593a(mo41920k()).mo62673b();
    }

    /* renamed from: w */
    public Collection<C7424b> mo52999w() {
        return ck0.m33062j();
    }

    /* renamed from: x */
    public Collection<C7425c> mo53000x(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return mo53055I().mo50862c(r24, NoLookupLocation.FROM_REFLECTION);
    }

    /* renamed from: y */
    public fx4 mo53001y(int i) {
        Triple<d83, ProtoBuf$Package, c83> d = this.f38991r.invoke().mo53060d();
        if (d == null) {
            return null;
        }
        d83 component1 = d.component1();
        ProtoBuf$Package component2 = d.component2();
        c83 component3 = d.component3();
        GeneratedMessageLite.C7604e<ProtoBuf$Package, List<ProtoBuf$Property>> eVar = JvmProtoBuf.f39877n;
        vx2.m53590f(eVar, "packageLocalVariable");
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) wx4.m73752b(component2, eVar, i);
        if (protoBuf$Property == null) {
            return null;
        }
        Class<?> k = mo41920k();
        ProtoBuf$TypeTable typeTable = component2.getTypeTable();
        vx2.m53590f(typeTable, "packageProto.typeTable");
        return (fx4) y67.m74278h(k, protoBuf$Property, component1, new w17(typeTable), component3, KPackageImpl$getLocalProperty$1$1$1.INSTANCE);
    }
}
