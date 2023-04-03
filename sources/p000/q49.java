package p000;

/* renamed from: q49 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class q49 implements n59 {

    /* renamed from: a */
    public n59[] f32941a;

    public q49(n59... n59Arr) {
        this.f32941a = n59Arr;
    }

    /* renamed from: a */
    public final boolean mo43462a(Class<?> cls) {
        for (n59 a : this.f32941a) {
            if (a.mo43462a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final e59 mo43463b(Class<?> cls) {
        String str;
        for (n59 n59 : this.f32941a) {
            if (n59.mo43462a(cls)) {
                return n59.mo43463b(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
