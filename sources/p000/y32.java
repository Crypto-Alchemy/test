package p000;

@Deprecated
/* renamed from: y32 */
public abstract class y32<T> {

    /* renamed from: a */
    public final int f35755a;

    /* renamed from: b */
    public final String f35756b;

    /* renamed from: c */
    public final T f35757c;

    @Deprecated
    /* renamed from: y32$a */
    public static class C6714a extends y32<Boolean> {
        public C6714a(int i, String str, Boolean bool) {
            super(i, str, bool);
        }
    }

    public y32(int i, String str, T t) {
        this.f35755a = i;
        this.f35756b = str;
        this.f35757c = t;
        r36.m50934a().mo28825a(this);
    }

    @Deprecated
    /* renamed from: a */
    public static C6714a m54610a(int i, String str, Boolean bool) {
        return new C6714a(i, str, bool);
    }
}
