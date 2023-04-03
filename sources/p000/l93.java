package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import p000.w90;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$a;", "", "isGetter", "Lu90;", "b", "Lfx4;", "g", "", "f", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: l93 */
/* compiled from: KPropertyImpl.kt */
public final class l93 {
    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.reflect.jvm.internal.KPropertyImpl$a, kotlin.reflect.jvm.internal.KPropertyImpl$a<?, ?>] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.u90<?> m63735b(kotlin.reflect.jvm.internal.KPropertyImpl.C7370a<?, ?> r6, boolean r7) {
        /*
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.f38970a
            kotlin.text.Regex r0 = r0.mo53032a()
            kotlin.reflect.jvm.internal.KPropertyImpl r1 = r6.mo53049B()
            java.lang.String r1 = r1.mo53080G()
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L_0x0017
            qp6 r6 = p000.qp6.f44223a
            return r6
        L_0x0017:
            si5 r0 = p000.si5.f44568a
            kotlin.reflect.jvm.internal.KPropertyImpl r1 = r6.mo53049B()
            fx4 r1 = r1.mo52984x()
            h83 r0 = r0.mo65861f(r1)
            boolean r1 = r0 instanceof p000.h83.C7169c
            r2 = 0
            if (r1 == 0) goto L_0x0168
            h83$c r0 = (p000.h83.C7169c) r0
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r1 = r0.mo52152f()
            if (r7 == 0) goto L_0x003d
            boolean r3 = r1.hasGetter()
            if (r3 == 0) goto L_0x0048
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r1.getGetter()
            goto L_0x0049
        L_0x003d:
            boolean r3 = r1.hasSetter()
            if (r3 == 0) goto L_0x0048
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r1.getSetter()
            goto L_0x0049
        L_0x0048:
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x0070
            kotlin.reflect.jvm.internal.KPropertyImpl r3 = r6.mo53049B()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r3 = r3.mo52982v()
            t24 r4 = r0.mo52150d()
            int r5 = r1.getName()
            java.lang.String r4 = r4.getString(r5)
            t24 r0 = r0.mo52150d()
            int r1 = r1.getDesc()
            java.lang.String r0 = r0.getString(r1)
            java.lang.reflect.Method r0 = r3.mo53027u(r4, r0)
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            if (r0 != 0) goto L_0x0118
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r6.mo53049B()
            fx4 r0 = r0.mo52984x()
            boolean r0 = p000.nu2.m70092d(r0)
            if (r0 == 0) goto L_0x00ed
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r6.mo53049B()
            fx4 r0 = r0.mo52984x()
            fd1 r0 = r0.getVisibility()
            fd1 r1 = p000.ed1.f37509d
            boolean r0 = p000.vx2.m53586b(r0, r1)
            if (r0 == 0) goto L_0x00ed
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r6.mo53049B()
            fx4 r7 = r7.mo52984x()
            d31 r7 = r7.mo51119b()
            java.lang.Class r7 = p000.ku2.m63620h(r7)
            if (r7 == 0) goto L_0x00cd
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r6.mo53049B()
            fx4 r0 = r0.mo52984x()
            java.lang.reflect.Method r7 = p000.ku2.m63618f(r7, r0)
            if (r7 == 0) goto L_0x00cd
            boolean r0 = r6.mo52986z()
            if (r0 == 0) goto L_0x00c6
            rx2$a r0 = new rx2$a
            java.lang.Object r1 = m63739f(r6)
            r0.<init>(r7, r1)
            goto L_0x01a1
        L_0x00c6:
            rx2$b r0 = new rx2$b
            r0.<init>(r7)
            goto L_0x01a1
        L_0x00cd:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Underlying property of inline class "
            r0.append(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.mo53049B()
            r0.append(r6)
            java.lang.String r6 = " should have a field"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00ed:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r6.mo53049B()
            java.lang.reflect.Field r0 = r0.mo53079F()
            if (r0 == 0) goto L_0x00fd
            w90 r0 = m63736c(r6, r7, r0)
            goto L_0x01a1
        L_0x00fd:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessors or field is found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.mo53049B()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0118:
            int r7 = r0.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L_0x013a
            boolean r7 = r6.mo52986z()
            if (r7 == 0) goto L_0x0132
            w90$h$a r7 = new w90$h$a
            java.lang.Object r1 = m63739f(r6)
            r7.<init>(r0, r1)
            goto L_0x0137
        L_0x0132:
            w90$h$d r7 = new w90$h$d
            r7.<init>(r0)
        L_0x0137:
            r0 = r7
            goto L_0x01a1
        L_0x013a:
            boolean r7 = m63737d(r6)
            if (r7 == 0) goto L_0x0152
            boolean r7 = r6.mo52986z()
            if (r7 == 0) goto L_0x014c
            w90$h$b r7 = new w90$h$b
            r7.<init>(r0)
            goto L_0x0137
        L_0x014c:
            w90$h$e r7 = new w90$h$e
            r7.<init>(r0)
            goto L_0x0137
        L_0x0152:
            boolean r7 = r6.mo52986z()
            if (r7 == 0) goto L_0x0162
            w90$h$c r7 = new w90$h$c
            java.lang.Object r1 = m63739f(r6)
            r7.<init>(r0, r1)
            goto L_0x0137
        L_0x0162:
            w90$h$f r7 = new w90$h$f
            r7.<init>(r0)
            goto L_0x0137
        L_0x0168:
            boolean r1 = r0 instanceof p000.h83.C7167a
            if (r1 == 0) goto L_0x0177
            h83$a r0 = (p000.h83.C7167a) r0
            java.lang.reflect.Field r0 = r0.mo52145b()
            w90 r0 = m63736c(r6, r7, r0)
            goto L_0x01a1
        L_0x0177:
            boolean r1 = r0 instanceof p000.h83.C7168b
            if (r1 == 0) goto L_0x01c7
            if (r7 == 0) goto L_0x0184
            h83$b r0 = (p000.h83.C7168b) r0
            java.lang.reflect.Method r7 = r0.mo52146b()
            goto L_0x018c
        L_0x0184:
            h83$b r0 = (p000.h83.C7168b) r0
            java.lang.reflect.Method r7 = r0.mo52147c()
            if (r7 == 0) goto L_0x01ac
        L_0x018c:
            boolean r0 = r6.mo52986z()
            if (r0 == 0) goto L_0x019c
            w90$h$a r0 = new w90$h$a
            java.lang.Object r1 = m63739f(r6)
            r0.<init>(r7, r1)
            goto L_0x01a1
        L_0x019c:
            w90$h$d r0 = new w90$h$d
            r0.<init>(r7)
        L_0x01a1:
            kotlin.reflect.jvm.internal.impl.descriptors.d r6 = r6.mo53084A()
            r7 = 0
            r1 = 2
            u90 r6 = p000.ku2.m63615c(r0, r6, r7, r1, r2)
            return r6
        L_0x01ac:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "No source found for setter of Java method property: "
            r7.append(r1)
            java.lang.reflect.Method r0 = r0.mo52146b()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x01c7:
            boolean r1 = r0 instanceof p000.h83.C7170d
            if (r1 == 0) goto L_0x0245
            if (r7 == 0) goto L_0x01d4
            h83$d r0 = (p000.h83.C7170d) r0
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = r0.mo52154b()
            goto L_0x01dc
        L_0x01d4:
            h83$d r0 = (p000.h83.C7170d) r0
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = r0.mo52155c()
            if (r7 == 0) goto L_0x022a
        L_0x01dc:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r6.mo53049B()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.mo52982v()
            java.lang.String r1 = r7.mo52974c()
            java.lang.String r7 = r7.mo52973b()
            java.lang.reflect.Method r7 = r0.mo53027u(r1, r7)
            if (r7 == 0) goto L_0x020f
            int r0 = r7.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r6.mo52986z()
            if (r0 == 0) goto L_0x0209
            w90$h$a r0 = new w90$h$a
            java.lang.Object r6 = m63739f(r6)
            r0.<init>(r7, r6)
            goto L_0x020e
        L_0x0209:
            w90$h$d r0 = new w90$h$d
            r0.<init>(r7)
        L_0x020e:
            return r0
        L_0x020f:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessor found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.mo53049B()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x022a:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No setter found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.mo53049B()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0245:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l93.m63735b(kotlin.reflect.jvm.internal.KPropertyImpl$a, boolean):u90");
    }

    /* renamed from: c */
    public static final w90<Field> m63736c(KPropertyImpl.C7370a<?, ?> aVar, boolean z, Field field) {
        w90<Field> w90;
        if (m63740g(aVar.mo53049B().mo52984x()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                if (!aVar.mo52986z()) {
                    return new w90.C9492f.C9495c(field);
                }
                w90 = new w90.C9492f.C9493a(field, m63739f(aVar));
            } else if (aVar.mo52986z()) {
                w90 = new w90.C9498g.C9499a(field, m63738e(aVar), m63739f(aVar));
            } else {
                w90 = new w90.C9498g.C9501c(field, m63738e(aVar));
            }
        } else if (m63737d(aVar)) {
            if (z) {
                if (aVar.mo52986z()) {
                    return new w90.C9492f.C9494b(field);
                }
                return new w90.C9492f.C9496d(field);
            } else if (aVar.mo52986z()) {
                w90 = new w90.C9498g.C9500b(field, m63738e(aVar));
            } else {
                w90 = new w90.C9498g.C9502d(field, m63738e(aVar));
            }
        } else if (z) {
            return new w90.C9492f.C9497e(field);
        } else {
            w90 = new w90.C9498g.C9503e(field, m63738e(aVar));
        }
        return w90;
    }

    /* renamed from: d */
    public static final boolean m63737d(KPropertyImpl.C7370a<?, ?> aVar) {
        return aVar.mo53049B().mo52984x().getAnnotations().mo51224C0(y67.m74280j());
    }

    /* renamed from: e */
    public static final boolean m63738e(KPropertyImpl.C7370a<?, ?> aVar) {
        return !x17.m73828l(aVar.mo53049B().mo52984x().getType());
    }

    /* renamed from: f */
    public static final Object m63739f(KPropertyImpl.C7370a<?, ?> aVar) {
        vx2.m53591g(aVar, "<this>");
        return aVar.mo53049B().mo53076B();
    }

    /* renamed from: g */
    public static final boolean m63740g(fx4 fx4) {
        d31 b = fx4.mo51119b();
        vx2.m53590f(b, "containingDeclaration");
        if (!dd1.m56832x(b)) {
            return false;
        }
        d31 b2 = b.mo51119b();
        if ((dd1.m56798C(b2) || dd1.m56828t(b2)) && (!(fx4 instanceof xd1) || !i83.m58870f(((xd1) fx4).mo65456Z()))) {
            return false;
        }
        return true;
    }
}
