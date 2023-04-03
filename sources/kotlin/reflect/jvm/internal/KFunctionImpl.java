package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.de2;
import p000.ta5;
import p000.w90;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bC\u0010DB7\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u0010E\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010FB+\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010GJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010\u000e\u001a\u00020\r8VX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010.\u001a\u0006\u0012\u0002\b\u00030)8VX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R!\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8VX\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010?\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b?\u00106R\u0014\u0010@\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u00106R\u0014\u0010A\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u00106R\u0014\u0010B\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bB\u00106¨\u0006H"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lz83;", "Ltd2;", "Lde2;", "Ljava/lang/reflect/Method;", "member", "Lw90$h;", "I", "H", "G", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "descriptor", "", "isDefault", "Lw90;", "F", "other", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "k", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "v", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "r", "Ljava/lang/String;", "signature", "s", "Ljava/lang/Object;", "rawBoundReceiver", "x", "Lta5$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Lu90;", "y", "Lta5$b;", "t", "()Lu90;", "caller", "A", "w", "defaultCaller", "J", "()Ljava/lang/Object;", "boundReceiver", "z", "()Z", "isBound", "getName", "()Ljava/lang/String;", "name", "getArity", "()I", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KFunctionImpl.kt */
public final class KFunctionImpl extends KCallableImpl<Object> implements td2<Object>, z83<Object>, de2 {

    /* renamed from: B */
    public static final /* synthetic */ i93<Object>[] f38978B;

    /* renamed from: A */
    public final ta5.C9336b f38979A;

    /* renamed from: k */
    public final KDeclarationContainerImpl f38980k;

    /* renamed from: r */
    public final String f38981r;

    /* renamed from: s */
    public final Object f38982s;

    /* renamed from: x */
    public final ta5.C9335a f38983x;

    /* renamed from: y */
    public final ta5.C9336b f38984y;

    static {
        Class<KFunctionImpl> cls = KFunctionImpl.class;
        f38978B = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, C7425c cVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kDeclarationContainerImpl, str, str2, cVar, (i & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    /* renamed from: F */
    public final w90<Constructor<?>> mo53038F(Constructor<?> constructor, C7425c cVar, boolean z) {
        if (z || !lu2.m64011f(cVar)) {
            if (mo52986z()) {
                return new w90.C9489c(constructor, mo53042J());
            }
            return new w90.C9491e(constructor);
        } else if (mo52986z()) {
            return new w90.C9487a(constructor, mo53042J());
        } else {
            return new w90.C9488b(constructor);
        }
    }

    /* renamed from: G */
    public final w90.C9504h mo53039G(Method method) {
        if (mo52986z()) {
            return new w90.C9504h.C9505a(method, mo53042J());
        }
        return new w90.C9504h.C9508d(method);
    }

    /* renamed from: H */
    public final w90.C9504h mo53040H(Method method) {
        if (mo52986z()) {
            return new w90.C9504h.C9506b(method);
        }
        return new w90.C9504h.C9509e(method);
    }

    /* renamed from: I */
    public final w90.C9504h mo53041I(Method method) {
        if (mo52986z()) {
            return new w90.C9504h.C9507c(method, mo53042J());
        }
        return new w90.C9504h.C9510f(method);
    }

    /* renamed from: J */
    public final Object mo53042J() {
        return ku2.m63613a(this.f38982s, mo52984x());
    }

    /* renamed from: K */
    public C7425c mo52984x() {
        Object b = this.f38983x.mo66008b(this, f38978B[0]);
        vx2.m53590f(b, "<get-descriptor>(...)");
        return (C7425c) b;
    }

    public boolean equals(Object obj) {
        KFunctionImpl c = y67.m74273c(obj);
        if (c != null && vx2.m53586b(mo52982v(), c.mo52982v()) && vx2.m53586b(getName(), c.getName()) && vx2.m53586b(this.f38981r, c.f38981r) && vx2.m53586b(this.f38982s, c.f38982s)) {
            return true;
        }
        return false;
    }

    public int getArity() {
        return x90.m73892a(mo52981t());
    }

    public String getName() {
        String d = mo52984x().getName().mo65594d();
        vx2.m53590f(d, "descriptor.name.asString()");
        return d;
    }

    public int hashCode() {
        return (((mo52982v().hashCode() * 31) + getName().hashCode()) * 31) + this.f38981r.hashCode();
    }

    public Object invoke() {
        return de2.C6972a.m56838a(this);
    }

    public boolean isExternal() {
        return mo52984x().isExternal();
    }

    public boolean isInfix() {
        return mo52984x().isInfix();
    }

    public boolean isInline() {
        return mo52984x().isInline();
    }

    public boolean isOperator() {
        return mo52984x().isOperator();
    }

    public boolean isSuspend() {
        return mo52984x().isSuspend();
    }

    /* renamed from: t */
    public u90<?> mo52981t() {
        Object b = this.f38984y.mo66008b(this, f38978B[1]);
        vx2.m53590f(b, "<get-caller>(...)");
        return (u90) b;
    }

    public String toString() {
        return ReflectionObjectRenderer.f39037a.mo53107d(mo52984x());
    }

    /* renamed from: v */
    public KDeclarationContainerImpl mo52982v() {
        return this.f38980k;
    }

    /* renamed from: w */
    public u90<?> mo52983w() {
        return (u90) this.f38979A.mo66008b(this, f38978B[2]);
    }

    /* renamed from: z */
    public boolean mo52986z() {
        return !vx2.m53586b(this.f38982s, CallableReference.NO_RECEIVER);
    }

    public Object invoke(Object obj) {
        return de2.C6972a.m56839b(this, obj);
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, C7425c cVar, Object obj) {
        this.f38980k = kDeclarationContainerImpl;
        this.f38981r = str2;
        this.f38982s = obj;
        this.f38983x = ta5.m72214d(cVar, new KFunctionImpl$descriptor$2(this, str));
        this.f38984y = ta5.m72212b(new KFunctionImpl$caller$2(this));
        this.f38979A = ta5.m72212b(new KFunctionImpl$defaultCaller$2(this));
    }

    public Object invoke(Object obj, Object obj2) {
        return de2.C6972a.m56840c(this, obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return de2.C6972a.m56841d(this, obj, obj2, obj3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return de2.C6972a.m56842e(this, obj, obj2, obj3, obj4);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return de2.C6972a.m56843f(this, obj, obj2, obj3, obj4, obj5);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return de2.C6972a.m56844g(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return de2.C6972a.m56845h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, (C7425c) null, obj);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KFunctionImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r10, kotlin.reflect.jvm.internal.impl.descriptors.C7425c r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "descriptor"
            p000.vx2.m53591g(r11, r0)
            r24 r0 = r11.getName()
            java.lang.String r3 = r0.mo65594d()
            java.lang.String r0 = "descriptor.name.asString()"
            p000.vx2.m53590f(r3, r0)
            si5 r0 = p000.si5.f44568a
            kotlin.reflect.jvm.internal.JvmFunctionSignature r0 = r0.mo65862g(r11)
            java.lang.String r4 = r0.mo52967a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.c):void");
    }
}
