package p000;

/* renamed from: q16 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q16 {
    /* renamed from: a */
    public static /* synthetic */ int m50218a(String str, int i) {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }
}
