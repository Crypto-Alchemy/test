package p000;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import p000.mi4;

/* renamed from: ia0 */
/* compiled from: CancelWorkRunnable */
public abstract class ia0 implements Runnable {

    /* renamed from: a */
    public final ni4 f13225a = new ni4();

    /* renamed from: ia0$a */
    /* compiled from: CancelWorkRunnable */
    public class C2536a extends ia0 {

        /* renamed from: d */
        public final /* synthetic */ nm7 f13226d;

        /* renamed from: e */
        public final /* synthetic */ UUID f13227e;

        public C2536a(nm7 nm7, UUID uuid) {
            this.f13226d = nm7;
            this.f13227e = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: h */
        public void mo21512h() {
            WorkDatabase q = this.f13226d.mo23743q();
            q.mo10119e();
            try {
                mo21508a(this.f13226d, this.f13227e.toString());
                q.mo10115C();
                q.mo10124j();
                mo21511g(this.f13226d);
            } catch (Throwable th) {
                q.mo10124j();
                throw th;
            }
        }
    }

    /* renamed from: ia0$b */
    /* compiled from: CancelWorkRunnable */
    public class C2537b extends ia0 {

        /* renamed from: d */
        public final /* synthetic */ nm7 f13228d;

        /* renamed from: e */
        public final /* synthetic */ String f13229e;

        public C2537b(nm7 nm7, String str) {
            this.f13228d = nm7;
            this.f13229e = str;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: h */
        public void mo21512h() {
            WorkDatabase q = this.f13228d.mo23743q();
            q.mo10119e();
            try {
                for (String a : q.mo10955N().mo11717h(this.f13229e)) {
                    mo21508a(this.f13228d, a);
                }
                q.mo10115C();
                q.mo10124j();
                mo21511g(this.f13228d);
            } catch (Throwable th) {
                q.mo10124j();
                throw th;
            }
        }
    }

    /* renamed from: ia0$c */
    /* compiled from: CancelWorkRunnable */
    public class C2538c extends ia0 {

        /* renamed from: d */
        public final /* synthetic */ nm7 f13230d;

        /* renamed from: e */
        public final /* synthetic */ String f13231e;

        /* renamed from: g */
        public final /* synthetic */ boolean f13232g;

        public C2538c(nm7 nm7, String str, boolean z) {
            this.f13230d = nm7;
            this.f13231e = str;
            this.f13232g = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: h */
        public void mo21512h() {
            WorkDatabase q = this.f13230d.mo23743q();
            q.mo10119e();
            try {
                for (String a : q.mo10955N().mo11712d(this.f13231e)) {
                    mo21508a(this.f13230d, a);
                }
                q.mo10115C();
                q.mo10124j();
                if (this.f13232g) {
                    mo21511g(this.f13230d);
                }
            } catch (Throwable th) {
                q.mo10124j();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static ia0 m19526b(UUID uuid, nm7 nm7) {
        return new C2536a(nm7, uuid);
    }

    /* renamed from: c */
    public static ia0 m19527c(String str, nm7 nm7, boolean z) {
        return new C2538c(nm7, str, z);
    }

    /* renamed from: d */
    public static ia0 m19528d(String str, nm7 nm7) {
        return new C2537b(nm7, str);
    }

    /* renamed from: a */
    public void mo21508a(nm7 nm7, String str) {
        mo21510f(nm7.mo23743q(), str);
        nm7.mo23741o().mo26583l(str);
        for (om5 a : nm7.mo23742p()) {
            a.mo24003a(str);
        }
    }

    /* renamed from: e */
    public mi4 mo21509e() {
        return this.f13225a;
    }

    /* renamed from: f */
    public final void mo21510f(WorkDatabase workDatabase, String str) {
        bn7 N = workDatabase.mo10955N();
        kc1 F = workDatabase.mo10950F();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State e = N.mo11714e(str2);
            if (!(e == WorkInfo.State.SUCCEEDED || e == WorkInfo.State.FAILED)) {
                N.mo11709a(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(F.mo22245a(str2));
        }
    }

    /* renamed from: g */
    public void mo21511g(nm7 nm7) {
        tm5.m27833b(nm7.mo23739k(), nm7.mo23743q(), nm7.mo23742p());
    }

    /* renamed from: h */
    public abstract void mo21512h();

    public void run() {
        try {
            mo21512h();
            this.f13225a.mo23691a(mi4.f14990a);
        } catch (Throwable th) {
            this.f13225a.mo23691a(new mi4.C2835b.C2836a(th));
        }
    }
}
