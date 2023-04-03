package androidx.work;

import androidx.work.C1519b;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends yu2 {
    /* renamed from: b */
    public C1519b mo10845b(List<C1519b> list) {
        C1519b.C1520a aVar = new C1519b.C1520a();
        HashMap hashMap = new HashMap();
        for (C1519b j : list) {
            hashMap.putAll(j.mo10925j());
        }
        aVar.mo10933d(hashMap);
        return aVar.mo10930a();
    }
}
