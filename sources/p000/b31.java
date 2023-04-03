package p000;

import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Lns0;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: b31 */
/* compiled from: DebugStrings.kt */
public final class b31 {
    /* renamed from: a */
    public static final String m55722a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m55723b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m55724c(ns0<?> ns0) {
        Object obj;
        if (ns0 instanceof lh1) {
            return ns0.toString();
        }
        try {
            Result.C6167a aVar = Result.Companion;
            obj = Result.m75635constructorimpl(ns0 + '@' + m55723b(ns0));
        } catch (Throwable th) {
            Result.C6167a aVar2 = Result.Companion;
            obj = Result.m75635constructorimpl(hg5.m45198a(th));
        }
        Throwable r2 = Result.m75638exceptionOrNullimpl(obj);
        String str = obj;
        if (r2 != null) {
            str = ns0.getClass().getName() + '@' + m55723b(ns0);
        }
        return (String) str;
    }
}
