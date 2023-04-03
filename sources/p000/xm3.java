package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lxm3;", "", "Lvm3;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lvm3;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: xm3 */
/* compiled from: MainDispatchers.kt */
public final class xm3 {

    /* renamed from: a */
    public static final xm3 f45966a;

    /* renamed from: b */
    public static final boolean f45967b = dl6.m56900e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final vm3 f45968c;

    static {
        xm3 xm3 = new xm3();
        f45966a = xm3;
        f45968c = xm3.mo66890a();
    }

    /* renamed from: a */
    public final vm3 mo66890a() {
        List<wm3> list;
        T t;
        vm3 e;
        Class cls = wm3.class;
        try {
            if (f45967b) {
                list = dz1.f37433a.mo51337c();
            } else {
                list = SequencesKt___SequencesKt.m63020D(SequencesKt__SequencesKt.m63008c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int c = ((wm3) t).mo51925c();
                    do {
                        T next = it.next();
                        int c2 = ((wm3) next).mo51925c();
                        if (c < c2) {
                            t = next;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            wm3 wm3 = (wm3) t;
            if (wm3 == null || (e = ym3.m74474e(wm3, list)) == null) {
                return ym3.m74471b((Throwable) null, (String) null, 3, (Object) null);
            }
            return e;
        } catch (Throwable th) {
            return ym3.m74471b(th, (String) null, 2, (Object) null);
        }
    }
}
