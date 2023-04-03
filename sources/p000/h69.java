package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: h69 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class h69 extends k69 {

    /* renamed from: c */
    public static final Class<?> f29459c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ h69(e69 e69) {
        super((e69) null);
    }

    /* renamed from: a */
    public final void mo43099a(Object obj, long j) {
        Object obj2;
        List list = (List) ta9.m52179s(obj, j);
        if (list instanceof b69) {
            obj2 = ((b69) list).mo29467f();
        } else if (!f29459c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof f89) || !(list instanceof m59)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                m59 m59 = (m59) list;
                if (m59.zza()) {
                    m59.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        ta9.m52180t(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: y59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: y59} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: y59} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo43100b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = p000.ta9.m52179s(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p000.ta9.m52179s(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof p000.b69
            if (r2 == 0) goto L_0x0020
            y59 r1 = new y59
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof p000.f89
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof p000.m59
            if (r2 == 0) goto L_0x0030
            m59 r1 = (p000.m59) r1
            m59 r0 = r1.mo43048I(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            p000.ta9.m52180t(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = f29459c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            p000.ta9.m52180t(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof p000.ka9
            if (r2 == 0) goto L_0x0072
            y59 r2 = new y59
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            ka9 r1 = (p000.ka9) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            p000.ta9.m52180t(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof p000.f89
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof p000.m59
            if (r2 == 0) goto L_0x008f
            r2 = r1
            m59 r2 = (p000.m59) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            m59 r1 = r2.mo43048I(r1)
            p000.ta9.m52180t(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = r1
        L_0x00a2:
            p000.ta9.m52180t(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h69.mo43100b(java.lang.Object, java.lang.Object, long):void");
    }
}
