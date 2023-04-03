package p000;

/* renamed from: i5 */
public abstract class C7207i5 {
    /* renamed from: a */
    public static String m58862a(int i, int i2) {
        StringBuilder sb;
        String str;
        if (i == 64) {
            sb = new StringBuilder();
            str = "[APPLICATION ";
        } else if (i == 128) {
            sb = new StringBuilder();
            str = "[CONTEXT ";
        } else if (i != 192) {
            sb = new StringBuilder();
            str = "[UNIVERSAL ";
        } else {
            sb = new StringBuilder();
            str = "[PRIVATE ";
        }
        sb.append(str);
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }
}
