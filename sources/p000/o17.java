package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p000.c23;

/* renamed from: o17 */
/* compiled from: typeSignatureMapping.kt */
public final class o17 {
    /* renamed from: a */
    public static final <T> T m70121a(k83<T> k83, T t, boolean z) {
        vx2.m53591g(k83, "<this>");
        vx2.m53591g(t, "possiblyPrimitiveType");
        if (z) {
            return k83.mo52876b(t);
        }
        return t;
    }

    /* renamed from: b */
    public static final <T> T m70122b(r17 r17, ad3 ad3, k83<T> k83, x07 x07) {
        nf0 nf0;
        vx2.m53591g(r17, "<this>");
        vx2.m53591g(ad3, "type");
        vx2.m53591g(k83, "typeFactory");
        vx2.m53591g(x07, "mode");
        zz6 u0 = r17.mo51107u0(ad3);
        if (!r17.mo51096p(u0)) {
            return null;
        }
        PrimitiveType v0 = r17.mo51109v0(u0);
        boolean z = true;
        if (v0 != null) {
            T c = k83.mo52877c(v0);
            if (!r17.mo51066T(ad3) && !q07.m71154c(r17, ad3)) {
                z = false;
            }
            return m70121a(k83, c, z);
        }
        PrimitiveType F = r17.mo51051F(u0);
        if (F != null) {
            return k83.mo52875a('[' + JvmPrimitiveType.get(F).getDesc());
        }
        if (r17.mo51093n0(u0)) {
            v82 r0 = r17.mo51101r0(u0);
            if (r0 != null) {
                nf0 = c23.f37039a.mo50793n(r0);
            } else {
                nf0 = null;
            }
            if (nf0 != null) {
                if (!x07.mo66806a()) {
                    List<c23.C6921a> i = c23.f37039a.mo50788i();
                    if (!(i instanceof Collection) || !i.isEmpty()) {
                        Iterator<T> it = i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (vx2.m53586b(((c23.C6921a) it.next()).mo50799d(), nf0)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                String f = y73.m74291b(nf0).mo67043f();
                vx2.m53590f(f, "byClassId(classId).internalName");
                return k83.mo52879e(f);
            }
        }
        return null;
    }
}
