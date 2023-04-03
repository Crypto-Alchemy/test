package p000;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000\"$\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, mo44877d2 = {"Lq83;", "", "a", "b", "", "Ljava/util/Map;", "classNames", "koin-core"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: s83 */
/* compiled from: KClassExt.kt */
public final class s83 {

    /* renamed from: a */
    public static final Map<q83<?>, String> f44543a = lc3.f40598a.mo55880d();

    /* renamed from: a */
    public static final String m71896a(q83<?> q83) {
        vx2.m53591g(q83, "<this>");
        String str = f44543a.get(q83);
        if (str == null) {
            return m71897b(q83);
        }
        return str;
    }

    /* renamed from: b */
    public static final String m71897b(q83<?> q83) {
        vx2.m53591g(q83, "<this>");
        String b = lc3.f40598a.mo55878b(q83);
        f44543a.put(q83, b);
        return b;
    }
}
