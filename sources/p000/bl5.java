package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b\u0018\u00010\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b0\u0006H\u0016R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR(\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR.\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00110\u00100\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, mo44877d2 = {"Lbl5;", "Lal5;", "", "value", "", "b", "", "", "", "a", "Lkotlin/Function1;", "Lrc2;", "canBeSaved", "", "Ljava/util/Map;", "restored", "", "Lkotlin/Function0;", "c", "valueProviders", "<init>", "(Ljava/util/Map;Lrc2;)V", "runtime-saveable_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bl5 */
/* compiled from: SaveableStateRegistry.kt */
public final class bl5 implements al5 {

    /* renamed from: a */
    public final rc2<Object, Boolean> f8184a;

    /* renamed from: b */
    public final Map<String, List<Object>> f8185b;

    /* renamed from: c */
    public final Map<String, List<pc2<Object>>> f8186c;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = kotlin.collections.C6177b.m47373u(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl5(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r2, p000.rc2<java.lang.Object, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "canBeSaved"
            p000.vx2.m53591g(r3, r0)
            r1.<init>()
            r1.f8184a = r3
            if (r2 == 0) goto L_0x0012
            java.util.Map r2 = kotlin.collections.C6177b.m47373u(r2)
            if (r2 != 0) goto L_0x0017
        L_0x0012:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L_0x0017:
            r1.f8185b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f8186c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bl5.<init>(java.util.Map, rc2):void");
    }

    /* renamed from: a */
    public Map<String, List<Object>> mo310a() {
        Map<String, List<Object>> u = C6177b.m47373u(this.f8185b);
        for (Map.Entry next : this.f8186c.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((pc2) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (mo11698b(invoke)) {
                    u.put(str, ck0.m33058f(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Object invoke2 = ((pc2) list.get(i)).invoke();
                    if (invoke2 == null || mo11698b(invoke2)) {
                        arrayList.add(invoke2);
                        i++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                u.put(str, arrayList);
            }
        }
        return u;
    }

    /* renamed from: b */
    public boolean mo11698b(Object obj) {
        vx2.m53591g(obj, "value");
        return this.f8184a.invoke(obj).booleanValue();
    }
}
