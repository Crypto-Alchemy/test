package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.u90;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000  *\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\b\u000e\u0007\u0015 !\"#B5\b\u0004\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\b\u0010\u001a\u0001\u0007$%&'()*¨\u0006+"}, mo44877d2 = {"Lw90;", "Ljava/lang/reflect/Member;", "M", "Lu90;", "", "obj", "Lr37;", "c", "a", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "b", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "instanceClass", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "e", "f", "g", "h", "Lw90$a;", "Lw90$b;", "Lw90$c;", "Lw90$e;", "Lw90$f;", "Lw90$g;", "Lw90$h;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: w90 */
/* compiled from: CallerImpl.kt */
public abstract class w90<M extends Member> implements u90<M> {

    /* renamed from: e */
    public static final C9490d f45471e = new C9490d((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final M f45472a;

    /* renamed from: b */
    public final Type f45473b;

    /* renamed from: c */
    public final Class<?> f45474c;

    /* renamed from: d */
    public final List<Type> f45475d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, mo44877d2 = {"Lw90$a;", "Lw90;", "Ljava/lang/reflect/Constructor;", "Lx30;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$a */
    /* compiled from: CallerImpl.kt */
    public static final class C9487a extends w90<Constructor<?>> implements x30 {

        /* renamed from: f */
        public final Object f45476f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9487a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p000.vx2.m53591g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p000.vx2.m53590f(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                p000.vx2.m53590f(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x002b
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = p000.C6706xq.m54501o(r0, r2, r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirstAndLast>"
                p000.vx2.m53589e(r0, r1)
            L_0x002b:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f45476f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9487a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            vx2.m53591g(objArr, "args");
            mo66665b(objArr);
            g76 g76 = new g76(3);
            g76.mo42841a(this.f45476f);
            g76.mo42842b(objArr);
            g76.mo42841a((Object) null);
            return ((Constructor) getMember()).newInstance(g76.mo42844d(new Object[g76.mo42843c()]));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lw90$b;", "Lw90;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$b */
    /* compiled from: CallerImpl.kt */
    public static final class C9488b extends w90<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9488b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p000.vx2.m53591g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p000.vx2.m53590f(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                p000.vx2.m53590f(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x002a
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = p000.C6706xq.m54501o(r0, r2, r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropLast>"
                p000.vx2.m53589e(r0, r1)
            L_0x002a:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9488b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            vx2.m53591g(objArr, "args");
            mo66665b(objArr);
            g76 g76 = new g76(2);
            g76.mo42842b(objArr);
            g76.mo42841a((Object) null);
            return ((Constructor) getMember()).newInstance(g76.mo42844d(new Object[g76.mo42843c()]));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, mo44877d2 = {"Lw90$c;", "Lx30;", "Lw90;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$c */
    /* compiled from: CallerImpl.kt */
    public static final class C9489c extends w90<Constructor<?>> implements x30 {

        /* renamed from: f */
        public final Object f45477f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9489c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p000.vx2.m53591g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p000.vx2.m53590f(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                p000.vx2.m53590f(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f45477f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9489c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            vx2.m53591g(objArr, "args");
            mo66665b(objArr);
            g76 g76 = new g76(2);
            g76.mo42841a(this.f45477f);
            g76.mo42842b(objArr);
            return ((Constructor) getMember()).newInstance(g76.mo42844d(new Object[g76.mo42843c()]));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\n"}, mo44877d2 = {"Lw90$d;", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$d */
    /* compiled from: CallerImpl.kt */
    public static final class C9490d {
        public C9490d() {
        }

        public /* synthetic */ C9490d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lw90$e;", "Lw90;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$e */
    /* compiled from: CallerImpl.kt */
    public static final class C9491e extends w90<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9491e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                p000.vx2.m53591g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                p000.vx2.m53590f(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0024
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0024
                r4 = r1
                goto L_0x0026
            L_0x0024:
                r0 = 0
                r4 = r0
            L_0x0026:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                p000.vx2.m53590f(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9491e.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            vx2.m53591g(objArr, "args");
            mo66665b(objArr);
            return ((Constructor) getMember()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, mo44877d2 = {"Lw90$f;", "Lw90;", "Ljava/lang/reflect/Field;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "a", "b", "c", "d", "e", "Lw90$f$a;", "Lw90$f$b;", "Lw90$f$c;", "Lw90$f$d;", "Lw90$f$e;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$f */
    /* compiled from: CallerImpl.kt */
    public static abstract class C9492f extends w90<Field> {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo44877d2 = {"Lw90$f$a;", "Lx30;", "Lw90$f;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$f$a */
        /* compiled from: CallerImpl.kt */
        public static final class C9493a extends C9492f implements x30 {

            /* renamed from: f */
            public final Object f45478f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9493a(Field field, Object obj) {
                super(field, false, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
                this.f45478f = obj;
            }

            public Object call(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                return ((Field) getMember()).get(this.f45478f);
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lw90$f$b;", "Lx30;", "Lw90$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$f$b */
        /* compiled from: CallerImpl.kt */
        public static final class C9494b extends C9492f implements x30 {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9494b(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lw90$f$c;", "Lw90$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$f$c */
        /* compiled from: CallerImpl.kt */
        public static final class C9495c extends C9492f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9495c(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lw90$f$d;", "Lw90$f;", "", "args", "Lr37;", "b", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$f$d */
        /* compiled from: CallerImpl.kt */
        public static final class C9496d extends C9492f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9496d(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }

            /* renamed from: b */
            public void mo66665b(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                w90.super.mo66665b(objArr);
                mo66666c(ArraysKt___ArraysKt.m47257I(objArr));
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lw90$f$e;", "Lw90$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$f$e */
        /* compiled from: CallerImpl.kt */
        public static final class C9497e extends C9492f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9497e(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9492f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                p000.vx2.m53590f(r2, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r8 = new java.lang.reflect.Type[r8]
                r4 = r8
                java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9492f.<init>(java.lang.reflect.Field, boolean):void");
        }

        public /* synthetic */ C9492f(Field field, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }

        public Object call(Object[] objArr) {
            Object obj;
            vx2.m53591g(objArr, "args");
            mo66665b(objArr);
            Field field = (Field) getMember();
            if (mo66667d() != null) {
                obj = ArraysKt___ArraysKt.m47256H(objArr);
            } else {
                obj = null;
            }
            return field.get(obj);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0006\u0014\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, mo44877d2 = {"Lw90$g;", "Lw90;", "Ljava/lang/reflect/Field;", "", "args", "Lr37;", "b", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "Z", "notNull", "field", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "a", "c", "d", "e", "Lw90$g$a;", "Lw90$g$b;", "Lw90$g$c;", "Lw90$g$d;", "Lw90$g$e;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$g */
    /* compiled from: CallerImpl.kt */
    public static abstract class C9498g extends w90<Field> {

        /* renamed from: f */
        public final boolean f45479f;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, mo44877d2 = {"Lw90$g$a;", "Lx30;", "Lw90$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$g$a */
        /* compiled from: CallerImpl.kt */
        public static final class C9499a extends C9498g implements x30 {

            /* renamed from: g */
            public final Object f45480g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9499a(Field field, boolean z, Object obj) {
                super(field, z, false, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
                this.f45480g = obj;
            }

            public Object call(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                ((Field) getMember()).set(this.f45480g, ArraysKt___ArraysKt.m47256H(objArr));
                return r37.f33317a;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, mo44877d2 = {"Lw90$g$b;", "Lx30;", "Lw90$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$g$b */
        /* compiled from: CallerImpl.kt */
        public static final class C9500b extends C9498g implements x30 {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9500b(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }

            public Object call(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                ((Field) getMember()).set((Object) null, ArraysKt___ArraysKt.m47270V(objArr));
                return r37.f33317a;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"Lw90$g$c;", "Lw90$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$g$c */
        /* compiled from: CallerImpl.kt */
        public static final class C9501c extends C9498g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9501c(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo44877d2 = {"Lw90$g$d;", "Lw90$g;", "", "args", "Lr37;", "b", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$g$d */
        /* compiled from: CallerImpl.kt */
        public static final class C9502d extends C9498g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9502d(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }

            /* renamed from: b */
            public void mo66665b(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                super.mo66665b(objArr);
                mo66666c(ArraysKt___ArraysKt.m47257I(objArr));
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"Lw90$g$e;", "Lw90$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$g$e */
        /* compiled from: CallerImpl.kt */
        public static final class C9503e extends C9498g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9503e(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                vx2.m53591g(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9498g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "TYPE"
                p000.vx2.m53590f(r2, r0)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r0 = r7.getGenericType()
                java.lang.String r1 = "field.genericType"
                p000.vx2.m53590f(r0, r1)
                r4[r9] = r0
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f45479f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9498g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }

        public /* synthetic */ C9498g(Field field, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }

        /* renamed from: b */
        public void mo66665b(Object[] objArr) {
            vx2.m53591g(objArr, "args");
            w90.super.mo66665b(objArr);
            if (this.f45479f && ArraysKt___ArraysKt.m47270V(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        public Object call(Object[] objArr) {
            Object obj;
            vx2.m53591g(objArr, "args");
            mo66665b(objArr);
            Field field = (Field) getMember();
            if (mo66667d() != null) {
                obj = ArraysKt___ArraysKt.m47256H(objArr);
            } else {
                obj = null;
            }
            field.set(obj, ArraysKt___ArraysKt.m47270V(objArr));
            return r37.f33317a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w90(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f45472a = r1
            r0.f45473b = r2
            r0.f45474c = r3
            if (r3 == 0) goto L_0x0027
            g76 r1 = new g76
            r2 = 2
            r1.<init>(r2)
            r1.mo42841a(r3)
            r1.mo42842b(r4)
            int r2 = r1.mo42843c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.mo42844d(r2)
            java.util.List r1 = p000.ck0.m33065m(r1)
            if (r1 != 0) goto L_0x002b
        L_0x0027:
            java.util.List r1 = kotlin.collections.ArraysKt___ArraysKt.m47291q0(r4)
        L_0x002b:
            r0.f45475d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w90.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    public /* synthetic */ w90(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    /* renamed from: a */
    public List<Type> mo52786a() {
        return this.f45475d;
    }

    /* renamed from: b */
    public void mo66665b(Object[] objArr) {
        u90.C9393a.m72663a(this, objArr);
    }

    /* renamed from: c */
    public final void mo66666c(Object obj) {
        if (obj == null || !this.f45472a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* renamed from: d */
    public final Class<?> mo66667d() {
        return this.f45474c;
    }

    public final M getMember() {
        return this.f45472a;
    }

    public final Type getReturnType() {
        return this.f45473b;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0013\u0014\u0015\u0016\u0007\nB+\b\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, mo44877d2 = {"Lw90$h;", "Lw90;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "e", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "Z", "isVoidMethod", "method", "requiresInstance", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "a", "b", "c", "d", "Lw90$h$a;", "Lw90$h$b;", "Lw90$h$c;", "Lw90$h$d;", "Lw90$h$e;", "Lw90$h$f;", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w90$h */
    /* compiled from: CallerImpl.kt */
    public static abstract class C9504h extends w90<Method> {

        /* renamed from: f */
        public final boolean f45481f;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo44877d2 = {"Lw90$h$a;", "Lx30;", "Lw90$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$h$a */
        /* compiled from: CallerImpl.kt */
        public static final class C9505a extends C9504h implements x30 {

            /* renamed from: g */
            public final Object f45482g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9505a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                vx2.m53591g(method, "method");
                this.f45482g = obj;
            }

            public Object call(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                return mo66668e(this.f45482g, objArr);
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, mo44877d2 = {"Lw90$h$b;", "Lx30;", "Lw90$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$h$b */
        /* compiled from: CallerImpl.kt */
        public static final class C9506b extends C9504h implements x30 {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9506b(Method method) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                vx2.m53591g(method, "method");
            }

            public Object call(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                return mo66668e((Object) null, objArr);
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo44877d2 = {"Lw90$h$c;", "Lx30;", "Lw90$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$h$c */
        /* compiled from: CallerImpl.kt */
        public static final class C9507c extends C9504h implements x30 {

            /* renamed from: g */
            public final Object f45483g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C9507c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    p000.vx2.m53591g(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    p000.vx2.m53590f(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x0020
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = p000.C6706xq.m54501o(r0, r2, r1)
                    java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>"
                    p000.vx2.m53589e(r0, r1)
                L_0x0020:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r3, r0, r1)
                    r4.f45483g = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9504h.C9507c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            public Object call(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                g76 g76 = new g76(2);
                g76.mo42841a(this.f45483g);
                g76.mo42842b(objArr);
                return mo66668e((Object) null, g76.mo42844d(new Object[g76.mo42843c()]));
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lw90$h$d;", "Lw90$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$h$d */
        /* compiled from: CallerImpl.kt */
        public static final class C9508d extends C9504h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9508d(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                vx2.m53591g(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C6706xq.m54501o(objArr, 1, objArr.length);
                    vx2.m53589e(objArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
                }
                return mo66668e(obj, objArr2);
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lw90$h$e;", "Lw90$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$h$e */
        /* compiled from: CallerImpl.kt */
        public static final class C9509e extends C9504h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9509e(Method method) {
                super(method, true, (Type[]) null, 4, (DefaultConstructorMarker) null);
                vx2.m53591g(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                mo66666c(ArraysKt___ArraysKt.m47257I(objArr));
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C6706xq.m54501o(objArr, 1, objArr.length);
                    vx2.m53589e(objArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
                }
                return mo66668e((Object) null, objArr2);
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lw90$h$f;", "Lw90$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: w90$h$f */
        /* compiled from: CallerImpl.kt */
        public static final class C9510f extends C9504h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9510f(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                vx2.m53591g(method, "method");
            }

            public Object call(Object[] objArr) {
                vx2.m53591g(objArr, "args");
                mo66665b(objArr);
                return mo66668e((Object) null, objArr);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C9504h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x001b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                p000.vx2.m53590f(r3, r4)
            L_0x001b:
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9504h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public /* synthetic */ C9504h(Method method, boolean z, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }

        /* renamed from: e */
        public final Object mo66668e(Object obj, Object[] objArr) {
            vx2.m53591g(objArr, "args");
            Object invoke = ((Method) getMember()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            if (this.f45481f) {
                return r37.f33317a;
            }
            return invoke;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9504h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                p000.vx2.m53590f(r2, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = p000.vx2.m53586b(r7, r8)
                r6.f45481f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.w90.C9504h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
