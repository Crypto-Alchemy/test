package p000;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ql */
/* compiled from: AnnotatedMethodMap */
public final class C3153ql implements Iterable<AnnotatedMethod> {

    /* renamed from: a */
    public Map<os3, AnnotatedMethod> f16968a;

    public C3153ql() {
    }

    public C3153ql(Map<os3, AnnotatedMethod> map) {
        this.f16968a = map;
    }

    /* renamed from: e */
    public AnnotatedMethod mo25140e(String str, Class<?>[] clsArr) {
        Map<os3, AnnotatedMethod> map = this.f16968a;
        if (map == null) {
            return null;
        }
        return map.get(new os3(str, clsArr));
    }

    public Iterator<AnnotatedMethod> iterator() {
        Map<os3, AnnotatedMethod> map = this.f16968a;
        if (map == null) {
            return Collections.emptyIterator();
        }
        return map.values().iterator();
    }
}
