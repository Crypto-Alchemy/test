package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import zendesk.configurations.Configuration;

@Deprecated
/* renamed from: so0 */
/* compiled from: ConfigurationUtil */
public class so0 {

    /* renamed from: a */
    public static ro0 f46534a = new ro0();

    /* renamed from: a */
    public static List<Configuration> m75303a(List<Configuration> list, Configuration configuration) {
        return f46534a.mo67435a(list, configuration);
    }

    /* renamed from: b */
    public static void m75304b(Bundle bundle, Configuration configuration) {
        f46534a.mo67436b(bundle, configuration);
    }

    /* renamed from: c */
    public static void m75305c(Intent intent, Configuration configuration) {
        f46534a.mo67437c(intent, configuration);
    }

    /* renamed from: d */
    public static <E extends Configuration> E m75306d(List<Configuration> list, Class<E> cls) {
        return f46534a.mo67439e(list, cls);
    }

    /* renamed from: e */
    public static <E extends Configuration> E m75307e(Bundle bundle, Class<E> cls) {
        return f46534a.mo67440f(bundle, cls);
    }

    /* renamed from: f */
    public static <E extends Configuration> E m75308f(Map<String, Object> map, Class<E> cls) {
        return f46534a.mo67441g(map, cls);
    }
}
