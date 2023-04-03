package p000;

import java.util.Iterator;

/* renamed from: l07 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l07 {
    /* renamed from: a */
    public static /* synthetic */ String m63654a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
