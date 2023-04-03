package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1515a;
import androidx.work.WorkInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: rj2 */
/* compiled from: GreedyScheduler */
public class rj2 implements om5, bm7, tu1 {

    /* renamed from: y */
    public static final String f17255y = qk3.m25728f("GreedyScheduler");

    /* renamed from: a */
    public final Context f17256a;

    /* renamed from: d */
    public final nm7 f17257d;

    /* renamed from: e */
    public final cm7 f17258e;

    /* renamed from: g */
    public final Set<an7> f17259g = new HashSet();

    /* renamed from: k */
    public mb1 f17260k;

    /* renamed from: r */
    public boolean f17261r;

    /* renamed from: s */
    public final Object f17262s;

    /* renamed from: x */
    public Boolean f17263x;

    public rj2(Context context, C1515a aVar, bm6 bm6, nm7 nm7) {
        this.f17256a = context;
        this.f17257d = nm7;
        this.f17258e = new cm7(context, bm6, this);
        this.f17260k = new mb1(this, aVar.mo10915k());
        this.f17262s = new Object();
    }

    /* renamed from: a */
    public void mo24003a(String str) {
        if (this.f17263x == null) {
            mo25394g();
        }
        if (!this.f17263x.booleanValue()) {
            qk3.m25726c().mo25137d(f17255y, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        mo25395h();
        qk3.m25726c().mo25135a(f17255y, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        mb1 mb1 = this.f17260k;
        if (mb1 != null) {
            mb1.mo23117b(str);
        }
        this.f17257d.mo23752z(str);
    }

    /* renamed from: b */
    public void mo10982b(List<String> list) {
        for (String next : list) {
            qk3.m25726c().mo25135a(f17255y, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f17257d.mo23752z(next);
        }
    }

    /* renamed from: c */
    public void mo24004c(an7... an7Arr) {
        if (this.f17263x == null) {
            mo25394g();
        }
        if (!this.f17263x.booleanValue()) {
            qk3.m25726c().mo25137d(f17255y, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        mo25395h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (an7 an7 : an7Arr) {
            long a = an7.mo431a();
            long currentTimeMillis = System.currentTimeMillis();
            if (an7.f205b == WorkInfo.State.ENQUEUED) {
                if (currentTimeMillis < a) {
                    mb1 mb1 = this.f17260k;
                    if (mb1 != null) {
                        mb1.mo23116a(an7);
                    }
                } else if (an7.mo432b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (an7.f213j.mo23766h()) {
                        qk3.m25726c().mo25135a(f17255y, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{an7}), new Throwable[0]);
                    } else if (i < 24 || !an7.f213j.mo23762e()) {
                        hashSet.add(an7);
                        hashSet2.add(an7.f204a);
                    } else {
                        qk3.m25726c().mo25135a(f17255y, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{an7}), new Throwable[0]);
                    }
                } else {
                    qk3.m25726c().mo25135a(f17255y, String.format("Starting work for %s", new Object[]{an7.f204a}), new Throwable[0]);
                    this.f17257d.mo23749w(an7.f204a);
                }
            }
        }
        synchronized (this.f17262s) {
            if (!hashSet.isEmpty()) {
                qk3.m25726c().mo25135a(f17255y, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f17259g.addAll(hashSet);
                this.f17258e.mo12128d(this.f17259g);
            }
        }
    }

    /* renamed from: d */
    public boolean mo24005d() {
        return false;
    }

    /* renamed from: e */
    public void mo10971e(String str, boolean z) {
        mo25396i(str);
    }

    /* renamed from: f */
    public void mo10985f(List<String> list) {
        for (String next : list) {
            qk3.m25726c().mo25135a(f17255y, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f17257d.mo23749w(next);
        }
    }

    /* renamed from: g */
    public final void mo25394g() {
        this.f17263x = Boolean.valueOf(sv4.m27137b(this.f17256a, this.f17257d.mo23739k()));
    }

    /* renamed from: h */
    public final void mo25395h() {
        if (!this.f17261r) {
            this.f17257d.mo23741o().mo26576c(this);
            this.f17261r = true;
        }
    }

    /* renamed from: i */
    public final void mo25396i(String str) {
        synchronized (this.f17262s) {
            Iterator<an7> it = this.f17259g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                an7 next = it.next();
                if (next.f204a.equals(str)) {
                    qk3.m25726c().mo25135a(f17255y, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f17259g.remove(next);
                    this.f17258e.mo12128d(this.f17259g);
                    break;
                }
            }
        }
    }
}
