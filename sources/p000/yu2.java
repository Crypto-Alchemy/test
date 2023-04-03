package p000;

import androidx.work.C1519b;
import java.util.List;

/* renamed from: yu2 */
/* compiled from: InputMerger */
public abstract class yu2 {

    /* renamed from: a */
    public static final String f20381a = qk3.m25728f("InputMerger");

    /* renamed from: a */
    public static yu2 m30835a(String str) {
        try {
            return (yu2) Class.forName(str).newInstance();
        } catch (Exception e) {
            qk3 c = qk3.m25726c();
            String str2 = f20381a;
            c.mo25136b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C1519b mo10845b(List<C1519b> list);
}
