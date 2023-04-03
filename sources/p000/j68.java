package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: j68 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class j68 {

    /* renamed from: a */
    public final Map<Class<?>, ye4<?>> f30231a;

    /* renamed from: b */
    public final Map<Class<?>, j87<?>> f30232b;

    /* renamed from: c */
    public final ye4<Object> f30233c;

    public j68(Map<Class<?>, ye4<?>> map, Map<Class<?>, j87<?>> map2, ye4<Object> ye4) {
        this.f30231a = map;
        this.f30232b = map2;
        this.f30233c = ye4;
    }

    /* renamed from: a */
    public final void mo44058a(Object obj, OutputStream outputStream) throws IOException {
        new m58(outputStream, this.f30231a, this.f30232b, this.f30233c).mo45634j(obj);
    }
}
