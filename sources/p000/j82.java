package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j82 */
/* compiled from: ForwardingImageOriginListener */
public class j82 implements ar2 {

    /* renamed from: a */
    public final List<ar2> f13566a;

    public j82(ar2... ar2Arr) {
        ArrayList arrayList = new ArrayList(ar2Arr.length);
        this.f13566a = arrayList;
        Collections.addAll(arrayList, ar2Arr);
    }

    /* renamed from: a */
    public synchronized void mo11078a(String str, int i, boolean z, String str2) {
        int size = this.f13566a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ar2 ar2 = this.f13566a.get(i2);
            if (ar2 != null) {
                try {
                    ar2.mo11078a(str, i, z, str2);
                } catch (Exception e) {
                    oy1.m24422i("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo21793b(ar2 ar2) {
        this.f13566a.add(ar2);
    }

    /* renamed from: c */
    public synchronized void mo21794c(ar2 ar2) {
        this.f13566a.remove(ar2);
    }
}
