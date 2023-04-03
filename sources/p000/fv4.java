package p000;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* renamed from: fv4 */
/* compiled from: PriorityMapping */
public final class fv4 {

    /* renamed from: a */
    public static SparseArray<Priority> f29008a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<Priority, Integer> f29009b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f29009b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f29009b.put(Priority.VERY_LOW, 1);
        f29009b.put(Priority.HIGHEST, 2);
        for (Priority next : f29009b.keySet()) {
            f29008a.append(f29009b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m44432a(Priority priority) {
        Integer num = f29009b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    /* renamed from: b */
    public static Priority m44433b(int i) {
        Priority priority = f29008a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
