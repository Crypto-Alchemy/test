package p000;

/* renamed from: mb6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class mb6 {
    /* renamed from: a */
    public static /* synthetic */ String m64291a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            if (charSequenceArr.length > 0) {
                sb.append(charSequenceArr[0]);
                for (int i = 1; i < charSequenceArr.length; i++) {
                    sb.append(charSequence);
                    sb.append(charSequenceArr[i]);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
