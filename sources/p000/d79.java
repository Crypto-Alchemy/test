package p000;

/* renamed from: d79 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class d79 implements p89 {

    /* renamed from: b */
    public static final n79 f28046b = new o69();

    /* renamed from: a */
    public final n79 f28047a;

    public d79() {
        n79 n79;
        n79[] n79Arr = new n79[2];
        n79Arr[0] = t39.m52064c();
        try {
            n79 = (n79) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            n79 = f28046b;
        }
        n79Arr[1] = n79;
        q69 q69 = new q69(n79Arr);
        p59.m49797b(q69, "messageInfoFactory");
        this.f28047a = q69;
    }

    /* renamed from: b */
    public static boolean m43399b(l79 l79) {
        if (l79.zzc() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final <T> n89<T> mo41858a(Class<T> cls) {
        Class<s49> cls2 = s49.class;
        q89.m50402A(cls);
        l79 a = this.f28047a.mo46027a(cls);
        if (a.zza()) {
            if (cls2.isAssignableFrom(cls)) {
                return z79.m55010i(q89.m50432c(), c39.m32850a(), a.zzb());
            }
            return z79.m55010i(q89.m50428a(), c39.m32851b(), a.zzb());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m43399b(a)) {
                return x79.m54260E(cls, a, d89.m43411b(), k69.m46903d(), q89.m50432c(), c39.m32850a(), j79.m46173b());
            }
            return x79.m54260E(cls, a, d89.m43411b(), k69.m46903d(), q89.m50432c(), (w29<?>) null, j79.m46173b());
        } else if (m43399b(a)) {
            return x79.m54260E(cls, a, d89.m43410a(), k69.m46902c(), q89.m50428a(), c39.m32851b(), j79.m46172a());
        } else {
            return x79.m54260E(cls, a, d89.m43410a(), k69.m46902c(), q89.m50430b(), (w29<?>) null, j79.m46172a());
        }
    }
}
