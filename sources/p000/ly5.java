package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ly5 */
/* compiled from: Sets */
public final class ly5 {
    /* renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m21894a() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m21895b() {
        return m21896c(new IdentityHashMap());
    }

    /* renamed from: c */
    public static <E> Set<E> m21896c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
