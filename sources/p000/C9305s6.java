package p000;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* renamed from: s6 */
/* compiled from: AbstractTypeChecker.kt */
public final class C9305s6 {

    /* renamed from: a */
    public static final C9305s6 f44534a = new C9305s6();

    /* renamed from: a */
    public final boolean mo65824a(TypeCheckerState typeCheckerState, f36 f36, TypeCheckerState.C7720b bVar) {
        boolean z;
        TypeCheckerState.C7720b bVar2;
        boolean z2;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        f36 f362 = f36;
        vx2.m53591g(typeCheckerState2, "<this>");
        vx2.m53591g(f362, "type");
        TypeCheckerState.C7720b bVar3 = bVar;
        vx2.m53591g(bVar3, "supertypesPolicy");
        s17 j = typeCheckerState.mo55324j();
        if ((!j.mo51077e0(f362) || j.mo51060N(f362)) && !j.mo51108v(f362)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            typeCheckerState.mo55325k();
            ArrayDeque<f36> h = typeCheckerState.mo55322h();
            vx2.m53588d(h);
            Set<f36> i = typeCheckerState.mo55323i();
            vx2.m53588d(i);
            h.push(f362);
            while (!h.isEmpty()) {
                if (i.size() <= 1000) {
                    f36 pop = h.pop();
                    vx2.m53590f(pop, "current");
                    if (i.add(pop)) {
                        if (j.mo51060N(pop)) {
                            bVar2 = TypeCheckerState.C7720b.C7723c.f40285a;
                        } else {
                            bVar2 = bVar3;
                        }
                        if (!(!vx2.m53586b(bVar2, TypeCheckerState.C7720b.C7723c.f40285a))) {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            continue;
                        } else {
                            s17 j2 = typeCheckerState.mo55324j();
                            for (ad3 a : j2.mo51079g0(j2.mo50570c(pop))) {
                                f36 a2 = bVar2.mo50575a(typeCheckerState2, a);
                                if ((!j.mo51077e0(a2) || j.mo51060N(a2)) && !j.mo51108v(a2)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    typeCheckerState.mo55320e();
                                } else {
                                    h.add(a2);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + f362 + ". Supertypes = " + CollectionsKt___CollectionsKt.m47338i0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null)).toString());
                }
            }
            typeCheckerState.mo55320e();
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo65825b(TypeCheckerState typeCheckerState, f36 f36, zz6 zz6) {
        TypeCheckerState.C7720b bVar;
        vx2.m53591g(typeCheckerState, "state");
        vx2.m53591g(f36, "start");
        vx2.m53591g(zz6, "end");
        s17 j = typeCheckerState.mo55324j();
        if (f44534a.mo65826c(typeCheckerState, f36, zz6)) {
            return true;
        }
        typeCheckerState.mo55325k();
        ArrayDeque<f36> h = typeCheckerState.mo55322h();
        vx2.m53588d(h);
        Set<f36> i = typeCheckerState.mo55323i();
        vx2.m53588d(i);
        h.push(f36);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                f36 pop = h.pop();
                vx2.m53590f(pop, "current");
                if (i.add(pop)) {
                    if (j.mo51060N(pop)) {
                        bVar = TypeCheckerState.C7720b.C7723c.f40285a;
                    } else {
                        bVar = TypeCheckerState.C7720b.C7722b.f40284a;
                    }
                    if (!(!vx2.m53586b(bVar, TypeCheckerState.C7720b.C7723c.f40285a))) {
                        bVar = null;
                    }
                    if (bVar == null) {
                        continue;
                    } else {
                        s17 j2 = typeCheckerState.mo55324j();
                        for (ad3 a : j2.mo51079g0(j2.mo50570c(pop))) {
                            f36 a2 = bVar.mo50575a(typeCheckerState, a);
                            if (f44534a.mo65826c(typeCheckerState, a2, zz6)) {
                                typeCheckerState.mo55320e();
                                return true;
                            }
                            h.add(a2);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + f36 + ". Supertypes = " + CollectionsKt___CollectionsKt.m47338i0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null)).toString());
            }
        }
        typeCheckerState.mo55320e();
        return false;
    }

    /* renamed from: c */
    public final boolean mo65826c(TypeCheckerState typeCheckerState, f36 f36, zz6 zz6) {
        s17 j = typeCheckerState.mo55324j();
        if (j.mo51085j0(f36)) {
            return true;
        }
        if (j.mo51060N(f36)) {
            return false;
        }
        if (!typeCheckerState.mo55328n() || !j.mo51083i0(f36)) {
            return j.mo51103s0(j.mo50570c(f36), zz6);
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo65827d(TypeCheckerState typeCheckerState, f36 f36, f36 f362) {
        vx2.m53591g(typeCheckerState, "state");
        vx2.m53591g(f36, "subType");
        vx2.m53591g(f362, "superType");
        return mo65828e(typeCheckerState, f36, f362);
    }

    /* renamed from: e */
    public final boolean mo65828e(TypeCheckerState typeCheckerState, f36 f36, f36 f362) {
        s17 j = typeCheckerState.mo55324j();
        if (AbstractTypeChecker.f40249b) {
            if (!j.mo50572e(f36) && !j.mo51090m(j.mo50570c(f36))) {
                boolean l = typeCheckerState.mo55326l(f36);
            }
            if (!j.mo50572e(f362)) {
                boolean l2 = typeCheckerState.mo55326l(f362);
            }
        }
        if (j.mo51060N(f362) || j.mo51108v(f36) || j.mo51059M(f36)) {
            return true;
        }
        if ((f36 instanceof nb0) && j.mo51117z0((nb0) f36)) {
            return true;
        }
        C9305s6 s6Var = f44534a;
        if (s6Var.mo65824a(typeCheckerState, f36, TypeCheckerState.C7720b.C7722b.f40284a)) {
            return true;
        }
        if (!j.mo51108v(f362) && !s6Var.mo65824a(typeCheckerState, f362, TypeCheckerState.C7720b.C7724d.f40286a) && !j.mo51077e0(f36)) {
            return s6Var.mo65825b(typeCheckerState, f36, j.mo50570c(f362));
        }
        return false;
    }
}
