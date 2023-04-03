package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zendesk.configurations.Configuration;

/* renamed from: ro0 */
/* compiled from: ConfigurationHelper */
public class ro0 {

    /* renamed from: a */
    public static String f46532a = "ZENDESK_CONFIGURATION";

    /* renamed from: b */
    public static ro0 f46533b = new ro0();

    /* renamed from: h */
    public static ro0 m75294h() {
        return f46533b;
    }

    /* renamed from: a */
    public List<Configuration> mo67435a(List<Configuration> list, Configuration configuration) {
        ArrayList arrayList = new ArrayList(list);
        if (mo67439e(list, configuration.getClass()) == null) {
            arrayList.add(configuration);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo67436b(Bundle bundle, Configuration configuration) {
        bundle.putSerializable(f46532a, configuration);
    }

    /* renamed from: c */
    public void mo67437c(Intent intent, Configuration configuration) {
        intent.putExtra(f46532a, configuration);
    }

    /* renamed from: d */
    public void mo67438d(Map<String, Object> map, Configuration configuration) {
        map.put(f46532a, configuration);
    }

    /* renamed from: e */
    public <E extends Configuration> E mo67439e(List<Configuration> list, Class<E> cls) {
        Iterator<Configuration> it = list.iterator();
        while (it.hasNext()) {
            E e = (Configuration) it.next();
            if (cls.isInstance(e)) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: f */
    public <E extends Configuration> E mo67440f(Bundle bundle, Class<E> cls) {
        if (bundle == null || !bundle.containsKey(f46532a)) {
            return null;
        }
        E serializable = bundle.getSerializable(f46532a);
        if (cls.isInstance(serializable)) {
            return (Configuration) serializable;
        }
        return null;
    }

    /* renamed from: g */
    public <E extends Configuration> E mo67441g(Map<String, Object> map, Class<E> cls) {
        if (map == null || !map.containsKey(f46532a)) {
            return null;
        }
        E e = map.get(f46532a);
        if (cls.isInstance(e)) {
            return (Configuration) e;
        }
        return null;
    }
}
