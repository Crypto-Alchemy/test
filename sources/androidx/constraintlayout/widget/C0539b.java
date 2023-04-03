package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.widget.b */
/* compiled from: SharedValues */
public class C0539b {

    /* renamed from: a */
    public SparseIntArray f3344a = new SparseIntArray();

    /* renamed from: b */
    public HashMap<Integer, HashSet<WeakReference<C0540a>>> f3345b = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    /* compiled from: SharedValues */
    public interface C0540a {
    }

    /* renamed from: a */
    public void mo5192a(int i, C0540a aVar) {
        HashSet hashSet = this.f3345b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3345b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }

    /* renamed from: b */
    public void mo5193b(int i, C0540a aVar) {
        HashSet hashSet = this.f3345b.get(Integer.valueOf(i));
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0540a aVar2 = (C0540a) weakReference.get();
                if (aVar2 == null || aVar2 == aVar) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }
}
