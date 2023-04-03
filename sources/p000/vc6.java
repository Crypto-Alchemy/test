package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: vc6 */
/* compiled from: SubstituteLoggerFactory */
public class vc6 implements io2 {

    /* renamed from: a */
    public boolean f45273a = false;

    /* renamed from: b */
    public final Map<String, uc6> f45274b = new HashMap();

    /* renamed from: c */
    public final LinkedBlockingQueue<wc6> f45275c = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public synchronized uk3 mo52516a(String str) {
        uc6 uc6;
        uc6 = this.f45274b.get(str);
        if (uc6 == null) {
            uc6 = new uc6(str, this.f45275c, this.f45273a);
            this.f45274b.put(str, uc6);
        }
        return uc6;
    }

    /* renamed from: b */
    public void mo66483b() {
        this.f45274b.clear();
        this.f45275c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue<wc6> mo66484c() {
        return this.f45275c;
    }

    /* renamed from: d */
    public List<uc6> mo66485d() {
        return new ArrayList(this.f45274b.values());
    }

    /* renamed from: e */
    public void mo66486e() {
        this.f45273a = true;
    }
}
