package p000;

/* renamed from: ax8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ax8 extends lx8<Double> {
    public ax8(gx8 gx8, String str, Double d, boolean z) {
        super(gx8, "measurement.test.double_flag", d, true, (ww8) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29378a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String d = super.mo45549d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            return null;
        }
    }
}
