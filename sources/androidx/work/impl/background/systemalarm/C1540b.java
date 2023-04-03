package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C1542d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* compiled from: ConstraintsCommandHandler */
public class C1540b {

    /* renamed from: e */
    public static final String f7572e = qk3.m25728f("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f7573a;

    /* renamed from: b */
    public final int f7574b;

    /* renamed from: c */
    public final C1542d f7575c;

    /* renamed from: d */
    public final cm7 f7576d;

    public C1540b(Context context, int i, C1542d dVar) {
        this.f7573a = context;
        this.f7574b = i;
        this.f7575c = dVar;
        this.f7576d = new cm7(context, dVar.mo10991f(), (bm7) null);
    }

    /* renamed from: a */
    public void mo10980a() {
        List<an7> c = this.f7575c.mo10992g().mo23743q().mo10955N().mo11711c();
        ConstraintProxy.m10550a(this.f7573a, c);
        this.f7576d.mo12128d(c);
        ArrayList<an7> arrayList = new ArrayList<>(c.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (an7 next : c) {
            String str = next.f204a;
            if (currentTimeMillis >= next.mo431a() && (!next.mo432b() || this.f7576d.mo12127c(str))) {
                arrayList.add(next);
            }
        }
        for (an7 an7 : arrayList) {
            String str2 = an7.f204a;
            Intent b = C1539a.m10555b(this.f7573a, str2);
            qk3.m25726c().mo25135a(f7572e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            C1542d dVar = this.f7575c;
            dVar.mo10996k(new C1542d.C1544b(dVar, b, this.f7574b));
        }
        this.f7576d.mo12129e();
    }
}
