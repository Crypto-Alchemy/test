package p000;

/* renamed from: ww8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ww8 extends lx8<Long> {
    public ww8(gx8 gx8, String str, Long l, boolean z) {
        super(gx8, str, l, true, (ww8) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29378a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String d = super.mo45549d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            return null;
        }
    }
}
