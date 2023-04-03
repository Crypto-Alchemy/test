package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: s89 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class s89 extends u99 {
    public s89(int i) {
        super(i, (s89) null);
    }

    /* renamed from: a */
    public final void mo47701a() {
        if (!mo48350b()) {
            for (int i = 0; i < mo48351c(); i++) {
                Map.Entry d = mo48354d(i);
                if (((f39) d.getKey()).zzc()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            for (Map.Entry entry : mo48355e()) {
                if (((f39) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo47701a();
    }
}
