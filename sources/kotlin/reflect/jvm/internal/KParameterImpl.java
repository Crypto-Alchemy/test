package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b01¢\u0006\u0004\b3\u00104J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8VX\u0002¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010.¨\u00065"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "a", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "k", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "callable", "d", "I", "getIndex", "()I", "index", "Lkotlin/reflect/KParameter$Kind;", "e", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "kind", "Lql4;", "g", "Lta5$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "()Ljava/lang/String;", "name", "Lm93;", "getType", "()Lm93;", "type", "m", "()Z", "isOptional", "isVararg", "Lkotlin/Function0;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lpc2;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KParameterImpl.kt */
public final class KParameterImpl implements KParameter {

    /* renamed from: r */
    public static final /* synthetic */ i93<Object>[] f38999r;

    /* renamed from: a */
    public final KCallableImpl<?> f39000a;

    /* renamed from: d */
    public final int f39001d;

    /* renamed from: e */
    public final KParameter.Kind f39002e;

    /* renamed from: g */
    public final ta5.C9335a f39003g;

    /* renamed from: k */
    public final ta5.C9335a f39004k = ta5.m72213c(new KParameterImpl$annotations$2(this));

    static {
        Class<KParameterImpl> cls = KParameterImpl.class;
        f38999r = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public KParameterImpl(KCallableImpl<?> kCallableImpl, int i, KParameter.Kind kind, pc2<? extends ql4> pc2) {
        vx2.m53591g(kCallableImpl, "callable");
        vx2.m53591g(kind, "kind");
        vx2.m53591g(pc2, "computeDescriptor");
        this.f39000a = kCallableImpl;
        this.f39001d = i;
        this.f39002e = kind;
        this.f39003g = ta5.m72213c(pc2);
    }

    /* renamed from: a */
    public boolean mo45210a() {
        ql4 n = mo53067n();
        if (!(n instanceof n87) || ((n87) n).mo53317q0() == null) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            if (!vx2.m53586b(this.f39000a, kParameterImpl.f39000a) || getIndex() != kParameterImpl.getIndex()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public List<Annotation> getAnnotations() {
        Object b = this.f39004k.mo66008b(this, f38999r[1]);
        vx2.m53590f(b, "<get-annotations>(...)");
        return (List) b;
    }

    public int getIndex() {
        return this.f39001d;
    }

    public KParameter.Kind getKind() {
        return this.f39002e;
    }

    public String getName() {
        n87 n87;
        ql4 n = mo53067n();
        if (n instanceof n87) {
            n87 = (n87) n;
        } else {
            n87 = null;
        }
        if (n87 == null || n87.mo51119b().mo51318a0()) {
            return null;
        }
        r24 name = n87.getName();
        vx2.m53590f(name, "valueParameter.name");
        if (name.mo65599i()) {
            return null;
        }
        return name.mo65594d();
    }

    public m93 getType() {
        xc3 type = mo53067n().getType();
        vx2.m53590f(type, "descriptor.type");
        return new KTypeImpl(type, new KParameterImpl$type$1(this));
    }

    public int hashCode() {
        return (this.f39000a.hashCode() * 31) + Integer.valueOf(getIndex()).hashCode();
    }

    /* renamed from: k */
    public final KCallableImpl<?> mo53066k() {
        return this.f39000a;
    }

    /* renamed from: m */
    public boolean mo45215m() {
        n87 n87;
        ql4 n = mo53067n();
        if (n instanceof n87) {
            n87 = (n87) n;
        } else {
            n87 = null;
        }
        if (n87 != null) {
            return DescriptorUtilsKt.m62440a(n87);
        }
        return false;
    }

    /* renamed from: n */
    public final ql4 mo53067n() {
        Object b = this.f39003g.mo66008b(this, f38999r[0]);
        vx2.m53590f(b, "<get-descriptor>(...)");
        return (ql4) b;
    }

    public String toString() {
        return ReflectionObjectRenderer.f39037a.mo53109f(this);
    }
}
