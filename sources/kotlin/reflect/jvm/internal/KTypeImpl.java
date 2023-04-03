package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010)¢\u0006\u0004\b*\u0010+J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\f8VX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u001aR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\"R\u0014\u0010%\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010 ¨\u0006-²\u0006\u0012\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\nX\u0002"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Ln93;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lxc3;", "type", "Lx83;", "k", "a", "Lxc3;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lta5$a;", "Ljava/lang/reflect/Type;", "d", "Lta5$a;", "getComputeJavaType$annotations", "()V", "computeJavaType", "e", "()Lx83;", "classifier", "", "Lq93;", "g", "b", "()Ljava/util/List;", "arguments", "()Ljava/lang/reflect/Type;", "javaType", "()Z", "isMarkedNullable", "", "getAnnotations", "annotations", "Lkotlin/Function0;", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lpc2;)V", "parameterizedTypeArguments", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KTypeImpl.kt */
public final class KTypeImpl implements n93 {

    /* renamed from: k */
    public static final /* synthetic */ i93<Object>[] f39025k;

    /* renamed from: a */
    public final xc3 f39026a;

    /* renamed from: d */
    public final ta5.C9335a<Type> f39027d;

    /* renamed from: e */
    public final ta5.C9335a f39028e;

    /* renamed from: g */
    public final ta5.C9335a f39029g;

    static {
        Class<KTypeImpl> cls = KTypeImpl.class;
        f39025k = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public KTypeImpl(xc3 xc3, pc2<? extends Type> pc2) {
        vx2.m53591g(xc3, "type");
        this.f39026a = xc3;
        ta5.C9335a<Type> aVar = null;
        ta5.C9335a<Type> aVar2 = pc2 instanceof ta5.C9335a ? pc2 : null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (pc2 != null) {
            aVar = ta5.m72213c(pc2);
        }
        this.f39027d = aVar;
        this.f39028e = ta5.m72213c(new KTypeImpl$classifier$2(this));
        this.f39029g = ta5.m72213c(new KTypeImpl$arguments$2(this, pc2));
    }

    /* renamed from: b */
    public List<q93> mo45704b() {
        Object b = this.f39029g.mo66008b(this, f39025k[1]);
        vx2.m53590f(b, "<get-arguments>(...)");
        return (List) b;
    }

    /* renamed from: d */
    public x83 mo45705d() {
        return (x83) this.f39028e.mo66008b(this, f39025k[0]);
    }

    /* renamed from: e */
    public boolean mo45706e() {
        return this.f39026a.mo51135I0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KTypeImpl) || !vx2.m53586b(this.f39026a, ((KTypeImpl) obj).f39026a)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public Type mo46045g() {
        ta5.C9335a<Type> aVar = this.f39027d;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public List<Annotation> getAnnotations() {
        return y67.m74275e(this.f39026a);
    }

    public int hashCode() {
        return this.f39026a.hashCode();
    }

    /* renamed from: k */
    public final x83 mo53095k(xc3 xc3) {
        xc3 type;
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d instanceof if0) {
            Class<?> p = y67.m74286p((if0) d);
            if (p == null) {
                return null;
            }
            if (p.isArray()) {
                f17 f17 = (f17) CollectionsKt___CollectionsKt.m47302B0(xc3.mo51132F0());
                if (f17 == null || (type = f17.getType()) == null) {
                    return new KClassImpl(p);
                }
                x83 k = mo53095k(type);
                if (k != null) {
                    return new KClassImpl(y67.m74276f(x73.m54253b(r93.m26136a(k))));
                }
                throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
            } else if (x17.m73828l(xc3)) {
                return new KClassImpl(p);
            } else {
                Class<?> e = ReflectClassUtilKt.m60597e(p);
                if (e != null) {
                    p = e;
                }
                return new KClassImpl(p);
            }
        } else if (d instanceof a17) {
            return new KTypeParameterImpl((p93) null, (a17) d);
        } else {
            if (!(d instanceof hz6)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: " + "Type alias classifiers are not yet supported");
        }
    }

    /* renamed from: n */
    public final xc3 mo53096n() {
        return this.f39026a;
    }

    public String toString() {
        return ReflectionObjectRenderer.f39037a.mo53111h(this.f39026a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KTypeImpl(xc3 xc3, pc2 pc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xc3, (i & 2) != 0 ? null : pc2);
    }
}
