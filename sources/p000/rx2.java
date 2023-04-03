package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.u90;
import p000.w90;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u0007B\u001f\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0001\u0002\u001b\u001c¨\u0006\u001d"}, mo44877d2 = {"Lrx2;", "Lu90;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "b", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "c", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "d", "()Ljava/lang/reflect/Method;", "member", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "Lrx2$a;", "Lrx2$b;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rx2 */
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
public abstract class rx2 implements u90<Method> {

    /* renamed from: a */
    public final Method f44495a;

    /* renamed from: b */
    public final List<Type> f44496b;

    /* renamed from: c */
    public final Type f44497c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo44877d2 = {"Lrx2$a;", "Lrx2;", "Lx30;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rx2$a */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class C9289a extends rx2 implements x30 {

        /* renamed from: d */
        public final Object f44498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9289a(Method method, Object obj) {
            super(method, ck0.m33062j(), (DefaultConstructorMarker) null);
            vx2.m53591g(method, "unboxMethod");
            this.f44498d = obj;
        }

        public Object call(Object[] objArr) {
            vx2.m53591g(objArr, "args");
            mo65769c(objArr);
            return mo65768b(this.f44498d, objArr);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lrx2$b;", "Lrx2;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rx2$b */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class C9290b extends rx2 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9290b(Method method) {
            super(method, bk0.m32598e(method.getDeclaringClass()), (DefaultConstructorMarker) null);
            vx2.m53591g(method, "unboxMethod");
        }

        public Object call(Object[] objArr) {
            Object[] objArr2;
            vx2.m53591g(objArr, "args");
            mo65769c(objArr);
            Object obj = objArr[0];
            w90.C9490d dVar = w90.f45471e;
            if (objArr.length <= 1) {
                objArr2 = new Object[0];
            } else {
                objArr2 = C6706xq.m54501o(objArr, 1, objArr.length);
                vx2.m53589e(objArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
            }
            return mo65768b(obj, objArr2);
        }
    }

    public rx2(Method method, List<? extends Type> list) {
        this.f44495a = method;
        this.f44496b = list;
        Class<?> returnType = method.getReturnType();
        vx2.m53590f(returnType, "unboxMethod.returnType");
        this.f44497c = returnType;
    }

    public /* synthetic */ rx2(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    /* renamed from: a */
    public final List<Type> mo52786a() {
        return this.f44496b;
    }

    /* renamed from: b */
    public final Object mo65768b(Object obj, Object[] objArr) {
        vx2.m53591g(objArr, "args");
        return this.f44495a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: c */
    public void mo65769c(Object[] objArr) {
        u90.C9393a.m72663a(this, objArr);
    }

    /* renamed from: d */
    public final Method getMember() {
        return null;
    }

    public final Type getReturnType() {
        return this.f44497c;
    }
}
