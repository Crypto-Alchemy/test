package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB%\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001c¨\u0006\""}, mo44877d2 = {"Lju2;", "Ljava/lang/reflect/Member;", "M", "Lu90;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lu90;", "caller", "", "b", "Z", "isDefault", "Lju2$a;", "c", "Lju2$a;", "data", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lu90;Z)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ju2 */
/* compiled from: InlineClassAwareCaller.kt */
public final class ju2<M extends Member> implements u90<M> {

    /* renamed from: a */
    public final u90<M> f38791a;

    /* renamed from: b */
    public final boolean f38792b;

    /* renamed from: c */
    public final C7312a f38793c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lju2$a;", "", "Lrw2;", "a", "", "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "Lrw2;", "getArgumentRange", "()Lrw2;", "argumentRange", "[Ljava/lang/reflect/Method;", "getUnbox", "unbox", "Ljava/lang/reflect/Method;", "getBox", "()Ljava/lang/reflect/Method;", "box", "<init>", "(Lrw2;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ju2$a */
    /* compiled from: InlineClassAwareCaller.kt */
    public static final class C7312a {

        /* renamed from: a */
        public final rw2 f38794a;

        /* renamed from: b */
        public final Method[] f38795b;

        /* renamed from: c */
        public final Method f38796c;

        public C7312a(rw2 rw2, Method[] methodArr, Method method) {
            vx2.m53591g(rw2, "argumentRange");
            vx2.m53591g(methodArr, "unbox");
            this.f38794a = rw2;
            this.f38795b = methodArr;
            this.f38796c = method;
        }

        /* renamed from: a */
        public final rw2 mo52790a() {
            return this.f38794a;
        }

        /* renamed from: b */
        public final Method[] mo52791b() {
            return this.f38795b;
        }

        /* renamed from: c */
        public final Method mo52792c() {
            return this.f38796c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if ((r12 instanceof p000.x30) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ju2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r11, p000.u90<? extends M> r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "descriptor"
            p000.vx2.m53591g(r11, r0)
            java.lang.String r0 = "caller"
            p000.vx2.m53591g(r12, r0)
            r10.<init>()
            r10.f38791a = r12
            r10.f38792b = r13
            xc3 r0 = r11.getReturnType()
            p000.vx2.m53588d(r0)
            java.lang.Class r0 = p000.ku2.m63621i(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.reflect.Method r0 = p000.ku2.m63616d(r0, r11)
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            boolean r2 = p000.nu2.m70089a(r11)
            r3 = 0
            if (r2 == 0) goto L_0x003b
            ju2$a r11 = new ju2$a
            rw2$a r12 = p000.rw2.f33621k
            rw2 r12 = r12.mo47516a()
            java.lang.reflect.Method[] r13 = new java.lang.reflect.Method[r3]
            r11.<init>(r12, r13, r0)
            goto L_0x0146
        L_0x003b:
            boolean r2 = r12 instanceof p000.w90.C9504h.C9507c
            java.lang.String r4 = "descriptor.containingDeclaration"
            r5 = -1
            r6 = 1
            if (r2 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            boolean r2 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C7424b
            if (r2 == 0) goto L_0x004d
            boolean r12 = r12 instanceof p000.x30
            if (r12 == 0) goto L_0x0067
            goto L_0x0068
        L_0x004d:
            h85 r2 = r11.mo51311G()
            if (r2 == 0) goto L_0x0067
            boolean r12 = r12 instanceof p000.x30
            if (r12 != 0) goto L_0x0067
            d31 r12 = r11.mo51119b()
            p000.vx2.m53590f(r12, r4)
            boolean r12 = p000.nu2.m70090b(r12)
            if (r12 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r5 = r6
            goto L_0x0068
        L_0x0067:
            r5 = r3
        L_0x0068:
            if (r13 == 0) goto L_0x006c
            r12 = 2
            goto L_0x006d
        L_0x006c:
            r12 = r3
        L_0x006d:
            boolean r13 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C7425c
            if (r13 == 0) goto L_0x007c
            r13 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.c r13 = (kotlin.reflect.jvm.internal.impl.descriptors.C7425c) r13
            boolean r13 = r13.isSuspend()
            if (r13 == 0) goto L_0x007c
            r13 = r6
            goto L_0x007d
        L_0x007c:
            r13 = r3
        L_0x007d:
            int r12 = r12 + r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            h85 r2 = r11.mo51315J()
            if (r2 == 0) goto L_0x008e
            xc3 r2 = r2.getType()
            goto L_0x008f
        L_0x008e:
            r2 = r1
        L_0x008f:
            if (r2 == 0) goto L_0x0095
            r13.add(r2)
            goto L_0x00d8
        L_0x0095:
            boolean r2 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C7424b
            if (r2 == 0) goto L_0x00be
            r2 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.b r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C7424b) r2
            if0 r2 = r2.mo51658X()
            java.lang.String r4 = "descriptor.constructedClass"
            p000.vx2.m53590f(r2, r4)
            boolean r4 = r2.mo51669i()
            if (r4 == 0) goto L_0x00d8
            d31 r2 = r2.mo51119b()
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            p000.vx2.m53589e(r2, r4)
            if0 r2 = (p000.if0) r2
            d36 r2 = r2.mo51464n()
            r13.add(r2)
            goto L_0x00d8
        L_0x00be:
            d31 r2 = r11.mo51119b()
            p000.vx2.m53590f(r2, r4)
            boolean r4 = r2 instanceof p000.if0
            if (r4 == 0) goto L_0x00d8
            boolean r4 = p000.nu2.m70090b(r2)
            if (r4 == 0) goto L_0x00d8
            if0 r2 = (p000.if0) r2
            d36 r2 = r2.mo51464n()
            r13.add(r2)
        L_0x00d8:
            java.util.List r2 = r11.mo51763f()
            java.lang.String r4 = "descriptor.valueParameters"
            p000.vx2.m53590f(r2, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x00e5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00f9
            java.lang.Object r4 = r2.next()
            n87 r4 = (p000.n87) r4
            xc3 r4 = r4.getType()
            r13.add(r4)
            goto L_0x00e5
        L_0x00f9:
            int r2 = r13.size()
            int r2 = r2 + r5
            int r2 = r2 + r12
            int r12 = p000.x90.m73892a(r10)
            if (r12 != r2) goto L_0x0149
            int r12 = java.lang.Math.max(r5, r3)
            int r4 = r13.size()
            int r4 = r4 + r5
            rw2 r12 = p000.d75.m43395q(r12, r4)
            java.lang.reflect.Method[] r4 = new java.lang.reflect.Method[r2]
            r7 = r3
        L_0x0115:
            if (r7 >= r2) goto L_0x0141
            int r8 = r12.mo46910n()
            int r9 = r12.mo46911q()
            if (r7 > r9) goto L_0x0125
            if (r8 > r7) goto L_0x0125
            r8 = r6
            goto L_0x0126
        L_0x0125:
            r8 = r3
        L_0x0126:
            if (r8 == 0) goto L_0x013b
            int r8 = r7 - r5
            java.lang.Object r8 = r13.get(r8)
            xc3 r8 = (p000.xc3) r8
            java.lang.Class r8 = p000.ku2.m63621i(r8)
            if (r8 == 0) goto L_0x013b
            java.lang.reflect.Method r8 = p000.ku2.m63618f(r8, r11)
            goto L_0x013c
        L_0x013b:
            r8 = r1
        L_0x013c:
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x0115
        L_0x0141:
            ju2$a r11 = new ju2$a
            r11.<init>(r12, r4, r0)
        L_0x0146:
            r10.f38793c = r11
            return
        L_0x0149:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r12 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r13.append(r0)
            int r0 = p000.x90.m73892a(r10)
            r13.append(r0)
            java.lang.String r0 = " != "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r0 = "\nCalling: "
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = "\nParameter types: "
            r13.append(r11)
            java.util.List r11 = r10.mo52786a()
            r13.append(r11)
            java.lang.String r11 = ")\nDefault: "
            r13.append(r11)
            boolean r11 = r10.f38792b
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ju2.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, u90, boolean):void");
    }

    /* renamed from: a */
    public List<Type> mo52786a() {
        return this.f38791a.mo52786a();
    }

    public Object call(Object[] objArr) {
        Object invoke;
        vx2.m53591g(objArr, "args");
        C7312a aVar = this.f38793c;
        rw2 a = aVar.mo52790a();
        Method[] b = aVar.mo52791b();
        Method c = aVar.mo52792c();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        vx2.m53590f(copyOf, "copyOf(this, size)");
        vx2.m53589e(copyOf, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int n = a.mo46910n();
        int q = a.mo46911q();
        if (n <= q) {
            while (true) {
                Method method = b[n];
                Object obj = objArr[n];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        vx2.m53590f(returnType, "method.returnType");
                        obj = y67.m74277g(returnType);
                    }
                }
                copyOf[n] = obj;
                if (n == q) {
                    break;
                }
                n++;
            }
        }
        Object call = this.f38791a.call(copyOf);
        if (c == null || (invoke = c.invoke((Object) null, new Object[]{call})) == null) {
            return call;
        }
        return invoke;
    }

    public M getMember() {
        return this.f38791a.getMember();
    }

    public Type getReturnType() {
        return this.f38791a.getReturnType();
    }
}
