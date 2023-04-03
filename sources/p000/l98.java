package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l98 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public abstract class l98 {

    /* renamed from: a */
    public final List<zzbl> f31222a = new ArrayList();

    /* renamed from: a */
    public abstract r88 mo28916a(String str, ps8 ps8, List<r88> list);

    /* renamed from: b */
    public final r88 mo45390b(String str) {
        String str2;
        if (this.f31222a.contains(gv8.m44950e(str))) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Command not implemented: ".concat(valueOf);
            } else {
                str2 = new String("Command not implemented: ");
            }
            throw new UnsupportedOperationException(str2);
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
