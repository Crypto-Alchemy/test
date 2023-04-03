package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"6\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\">\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\n0\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028FX\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0007\u001a\u0004\b\u000b\u0010\f\"\u001c\u0010\u0013\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0015\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"", "T", "Lq83;", "Lz83;", "b", "(Lq83;)Lz83;", "getPrimaryConstructor$annotations", "(Lq83;)V", "primaryConstructor", "", "Lk93;", "a", "(Lq83;)Ljava/util/Collection;", "getMemberProperties$annotations", "memberProperties", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "c", "(Lkotlin/reflect/jvm/internal/KCallableImpl;)Z", "isExtension", "d", "isNotExtension", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: u83 */
/* compiled from: KClasses.kt */
public final class u83 {
    /* renamed from: a */
    public static final <T> Collection<k93<T, ?>> m52673a(q83<T> q83) {
        boolean z;
        vx2.m53591g(q83, "<this>");
        Collection<KCallableImpl<?>> g = ((KClassImpl) q83).mo52991M().invoke().mo53003g();
        ArrayList arrayList = new ArrayList();
        for (T next : g) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (!m52676d(kCallableImpl) || !(kCallableImpl instanceof k93)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final <T> z83<T> m52674b(q83<T> q83) {
        Object obj;
        vx2.m53591g(q83, "<this>");
        Iterator it = ((KClassImpl) q83).mo52990L().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            z83 z83 = (z83) obj;
            vx2.m53589e(z83, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            C7425c K = ((KFunctionImpl) z83).mo52984x();
            vx2.m53589e(K, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((C7424b) K).mo51657W()) {
                break;
            }
        }
        return (z83) obj;
    }

    /* renamed from: c */
    public static final boolean m52675c(KCallableImpl<?> kCallableImpl) {
        if (kCallableImpl.mo52984x().mo51315J() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m52676d(KCallableImpl<?> kCallableImpl) {
        return !m52675c(kCallableImpl);
    }
}
