package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1515a;
import androidx.work.C1519b;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: jn7 */
/* compiled from: WorkerWrapper */
public class jn7 implements Runnable {

    /* renamed from: X */
    public static final String f13727X = qk3.m25728f("WorkerWrapper");

    /* renamed from: A */
    public x72 f13728A;

    /* renamed from: B */
    public WorkDatabase f13729B;

    /* renamed from: C */
    public bn7 f13730C;

    /* renamed from: H */
    public kc1 f13731H;

    /* renamed from: I */
    public en7 f13732I;

    /* renamed from: L */
    public List<String> f13733L;

    /* renamed from: M */
    public String f13734M;

    /* renamed from: P */
    public ry5<Boolean> f13735P = ry5.m26468t();

    /* renamed from: Q */
    public hi3<ListenableWorker.C1509a> f13736Q = null;

    /* renamed from: U */
    public volatile boolean f13737U;

    /* renamed from: a */
    public Context f13738a;

    /* renamed from: d */
    public String f13739d;

    /* renamed from: e */
    public List<om5> f13740e;

    /* renamed from: g */
    public WorkerParameters.C1514a f13741g;

    /* renamed from: k */
    public an7 f13742k;

    /* renamed from: r */
    public ListenableWorker f13743r;

    /* renamed from: s */
    public bm6 f13744s;

    /* renamed from: x */
    public ListenableWorker.C1509a f13745x = ListenableWorker.C1509a.m10432a();

    /* renamed from: y */
    public C1515a f13746y;

    /* renamed from: jn7$a */
    /* compiled from: WorkerWrapper */
    public class C2620a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ hi3 f13747a;

        /* renamed from: d */
        public final /* synthetic */ ry5 f13748d;

        public C2620a(hi3 hi3, ry5 ry5) {
            this.f13747a = hi3;
            this.f13748d = ry5;
        }

        public void run() {
            try {
                this.f13747a.get();
                qk3.m25726c().mo25135a(jn7.f13727X, String.format("Starting work for %s", new Object[]{jn7.this.f13742k.f206c}), new Throwable[0]);
                jn7 jn7 = jn7.this;
                jn7.f13736Q = jn7.f13743r.mo10852p();
                this.f13748d.mo11046r(jn7.this.f13736Q);
            } catch (Throwable th) {
                this.f13748d.mo11045q(th);
            }
        }
    }

    /* renamed from: jn7$b */
    /* compiled from: WorkerWrapper */
    public class C2621b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ry5 f13750a;

        /* renamed from: d */
        public final /* synthetic */ String f13751d;

        public C2621b(ry5 ry5, String str) {
            this.f13750a = ry5;
            this.f13751d = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.C1509a aVar = (ListenableWorker.C1509a) this.f13750a.get();
                if (aVar == null) {
                    qk3.m25726c().mo25136b(jn7.f13727X, String.format("%s returned a null result. Treating it as a failure.", new Object[]{jn7.this.f13742k.f206c}), new Throwable[0]);
                } else {
                    qk3.m25726c().mo25135a(jn7.f13727X, String.format("%s returned a %s result.", new Object[]{jn7.this.f13742k.f206c, aVar}), new Throwable[0]);
                    jn7.this.f13745x = aVar;
                }
            } catch (CancellationException e) {
                qk3.m25726c().mo25137d(jn7.f13727X, String.format("%s was cancelled", new Object[]{this.f13751d}), e);
            } catch (InterruptedException | ExecutionException e2) {
                qk3.m25726c().mo25136b(jn7.f13727X, String.format("%s failed because it threw an exception/error", new Object[]{this.f13751d}), e2);
            } catch (Throwable th) {
                jn7.this.mo21991f();
                throw th;
            }
            jn7.this.mo21991f();
        }
    }

    /* renamed from: jn7$c */
    /* compiled from: WorkerWrapper */
    public static class C2622c {

        /* renamed from: a */
        public Context f13753a;

        /* renamed from: b */
        public ListenableWorker f13754b;

        /* renamed from: c */
        public x72 f13755c;

        /* renamed from: d */
        public bm6 f13756d;

        /* renamed from: e */
        public C1515a f13757e;

        /* renamed from: f */
        public WorkDatabase f13758f;

        /* renamed from: g */
        public String f13759g;

        /* renamed from: h */
        public List<om5> f13760h;

        /* renamed from: i */
        public WorkerParameters.C1514a f13761i = new WorkerParameters.C1514a();

        public C2622c(Context context, C1515a aVar, bm6 bm6, x72 x72, WorkDatabase workDatabase, String str) {
            this.f13753a = context.getApplicationContext();
            this.f13756d = bm6;
            this.f13755c = x72;
            this.f13757e = aVar;
            this.f13758f = workDatabase;
            this.f13759g = str;
        }

        /* renamed from: a */
        public jn7 mo22004a() {
            return new jn7(this);
        }

        /* renamed from: b */
        public C2622c mo22005b(WorkerParameters.C1514a aVar) {
            if (aVar != null) {
                this.f13761i = aVar;
            }
            return this;
        }

        /* renamed from: c */
        public C2622c mo22006c(List<om5> list) {
            this.f13760h = list;
            return this;
        }
    }

    public jn7(C2622c cVar) {
        this.f13738a = cVar.f13753a;
        this.f13744s = cVar.f13756d;
        this.f13728A = cVar.f13755c;
        this.f13739d = cVar.f13759g;
        this.f13740e = cVar.f13760h;
        this.f13741g = cVar.f13761i;
        this.f13743r = cVar.f13754b;
        this.f13746y = cVar.f13757e;
        WorkDatabase workDatabase = cVar.f13758f;
        this.f13729B = workDatabase;
        this.f13730C = workDatabase.mo10955N();
        this.f13731H = this.f13729B.mo10950F();
        this.f13732I = this.f13729B.mo10956O();
    }

    /* renamed from: a */
    public final String mo21986a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f13739d);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: b */
    public hi3<Boolean> mo21987b() {
        return this.f13735P;
    }

    /* renamed from: c */
    public final void mo21988c(ListenableWorker.C1509a aVar) {
        if (aVar instanceof ListenableWorker.C1509a.C1512c) {
            qk3.m25726c().mo25137d(f13727X, String.format("Worker result SUCCESS for %s", new Object[]{this.f13734M}), new Throwable[0]);
            if (this.f13742k.mo434d()) {
                mo21993h();
            } else {
                mo21998m();
            }
        } else if (aVar instanceof ListenableWorker.C1509a.C1511b) {
            qk3.m25726c().mo25137d(f13727X, String.format("Worker result RETRY for %s", new Object[]{this.f13734M}), new Throwable[0]);
            mo21992g();
        } else {
            qk3.m25726c().mo25137d(f13727X, String.format("Worker result FAILURE for %s", new Object[]{this.f13734M}), new Throwable[0]);
            if (this.f13742k.mo434d()) {
                mo21993h();
            } else {
                mo21997l();
            }
        }
    }

    /* renamed from: d */
    public void mo21989d() {
        boolean z;
        this.f13737U = true;
        mo21999n();
        hi3<ListenableWorker.C1509a> hi3 = this.f13736Q;
        if (hi3 != null) {
            z = hi3.isDone();
            this.f13736Q.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f13743r;
        if (listenableWorker == null || z) {
            qk3.m25726c().mo25135a(f13727X, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f13742k}), new Throwable[0]);
            return;
        }
        listenableWorker.mo10880q();
    }

    /* renamed from: e */
    public final void mo21990e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f13730C.mo11714e(str2) != WorkInfo.State.CANCELLED) {
                this.f13730C.mo11709a(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f13731H.mo22245a(str2));
        }
    }

    /* renamed from: f */
    public void mo21991f() {
        if (!mo21999n()) {
            this.f13729B.mo10119e();
            try {
                WorkInfo.State e = this.f13730C.mo11714e(this.f13739d);
                this.f13729B.mo10954M().delete(this.f13739d);
                if (e == null) {
                    mo21994i(false);
                } else if (e == WorkInfo.State.RUNNING) {
                    mo21988c(this.f13745x);
                } else if (!e.isFinished()) {
                    mo21992g();
                }
                this.f13729B.mo10115C();
            } finally {
                this.f13729B.mo10124j();
            }
        }
        List<om5> list = this.f13740e;
        if (list != null) {
            for (om5 a : list) {
                a.mo24003a(this.f13739d);
            }
            tm5.m27833b(this.f13746y, this.f13729B, this.f13740e);
        }
    }

    /* renamed from: g */
    public final void mo21992g() {
        this.f13729B.mo10119e();
        try {
            this.f13730C.mo11709a(WorkInfo.State.ENQUEUED, this.f13739d);
            this.f13730C.mo11729t(this.f13739d, System.currentTimeMillis());
            this.f13730C.mo11721l(this.f13739d, -1);
            this.f13729B.mo10115C();
        } finally {
            this.f13729B.mo10124j();
            mo21994i(true);
        }
    }

    /* renamed from: h */
    public final void mo21993h() {
        this.f13729B.mo10119e();
        try {
            this.f13730C.mo11729t(this.f13739d, System.currentTimeMillis());
            this.f13730C.mo11709a(WorkInfo.State.ENQUEUED, this.f13739d);
            this.f13730C.mo11727r(this.f13739d);
            this.f13730C.mo11721l(this.f13739d, -1);
            this.f13729B.mo10115C();
        } finally {
            this.f13729B.mo10124j();
            mo21994i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final void mo21994i(boolean z) {
        ListenableWorker listenableWorker;
        this.f13729B.mo10119e();
        try {
            if (!this.f13729B.mo10955N().mo11726q()) {
                kk4.m20801a(this.f13738a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f13730C.mo11709a(WorkInfo.State.ENQUEUED, this.f13739d);
                this.f13730C.mo11721l(this.f13739d, -1);
            }
            if (!(this.f13742k == null || (listenableWorker = this.f13743r) == null || !listenableWorker.mo10875j())) {
                this.f13728A.mo26575b(this.f13739d);
            }
            this.f13729B.mo10115C();
            this.f13729B.mo10124j();
            this.f13735P.mo11044p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f13729B.mo10124j();
            throw th;
        }
    }

    /* renamed from: j */
    public final void mo21995j() {
        WorkInfo.State e = this.f13730C.mo11714e(this.f13739d);
        if (e == WorkInfo.State.RUNNING) {
            qk3.m25726c().mo25135a(f13727X, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f13739d}), new Throwable[0]);
            mo21994i(true);
            return;
        }
        qk3.m25726c().mo25135a(f13727X, String.format("Status for %s is %s; not doing any work", new Object[]{this.f13739d, e}), new Throwable[0]);
        mo21994i(false);
    }

    /* renamed from: k */
    public final void mo21996k() {
        C1519b b;
        boolean z;
        if (!mo21999n()) {
            this.f13729B.mo10119e();
            try {
                an7 f = this.f13730C.mo11715f(this.f13739d);
                this.f13742k = f;
                if (f == null) {
                    qk3.m25726c().mo25136b(f13727X, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f13739d}), new Throwable[0]);
                    mo21994i(false);
                    this.f13729B.mo10115C();
                } else if (f.f205b != WorkInfo.State.ENQUEUED) {
                    mo21995j();
                    this.f13729B.mo10115C();
                    qk3.m25726c().mo25135a(f13727X, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f13742k.f206c}), new Throwable[0]);
                    this.f13729B.mo10124j();
                } else {
                    if (f.mo434d() || this.f13742k.mo433c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        an7 an7 = this.f13742k;
                        if (an7.f217n == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && currentTimeMillis < an7.mo431a()) {
                            qk3.m25726c().mo25135a(f13727X, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f13742k.f206c}), new Throwable[0]);
                            mo21994i(true);
                            this.f13729B.mo10115C();
                            this.f13729B.mo10124j();
                            return;
                        }
                    }
                    this.f13729B.mo10115C();
                    this.f13729B.mo10124j();
                    if (this.f13742k.mo434d()) {
                        b = this.f13742k.f208e;
                    } else {
                        yu2 b2 = this.f13746y.mo10910f().mo28573b(this.f13742k.f207d);
                        if (b2 == null) {
                            qk3.m25726c().mo25136b(f13727X, String.format("Could not create Input Merger %s", new Object[]{this.f13742k.f207d}), new Throwable[0]);
                            mo21997l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f13742k.f208e);
                        arrayList.addAll(this.f13730C.mo11718i(this.f13739d));
                        b = b2.mo10845b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f13739d), b, this.f13733L, this.f13741g, this.f13742k.f214k, this.f13746y.mo10909e(), this.f13744s, this.f13746y.mo10917m(), new vm7(this.f13729B, this.f13744s), new hm7(this.f13729B, this.f13728A, this.f13744s));
                    if (this.f13743r == null) {
                        this.f13743r = this.f13746y.mo10917m().mo21580b(this.f13738a, this.f13742k.f206c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f13743r;
                    if (listenableWorker == null) {
                        qk3.m25726c().mo25136b(f13727X, String.format("Could not create Worker %s", new Object[]{this.f13742k.f206c}), new Throwable[0]);
                        mo21997l();
                    } else if (listenableWorker.mo10877l()) {
                        qk3.m25726c().mo25136b(f13727X, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f13742k.f206c}), new Throwable[0]);
                        mo21997l();
                    } else {
                        this.f13743r.mo10879o();
                        if (!mo22000o()) {
                            mo21995j();
                        } else if (!mo21999n()) {
                            ry5 t = ry5.m26468t();
                            gm7 gm7 = new gm7(this.f13738a, this.f13742k, this.f13743r, workerParameters.mo10900b(), this.f13744s);
                            this.f13744s.mo11699a().execute(gm7);
                            hi3<Void> a = gm7.mo20702a();
                            a.mo10867l(new C2620a(a, t), this.f13744s.mo11699a());
                            t.mo10867l(new C2621b(t, this.f13734M), this.f13744s.mo11701c());
                        }
                    }
                }
            } finally {
                this.f13729B.mo10124j();
            }
        }
    }

    /* renamed from: l */
    public void mo21997l() {
        this.f13729B.mo10119e();
        try {
            mo21990e(this.f13739d);
            this.f13730C.mo11724o(this.f13739d, ((ListenableWorker.C1509a.C1510a) this.f13745x).mo10881e());
            this.f13729B.mo10115C();
        } finally {
            this.f13729B.mo10124j();
            mo21994i(false);
        }
    }

    /* renamed from: m */
    public final void mo21998m() {
        this.f13729B.mo10119e();
        try {
            this.f13730C.mo11709a(WorkInfo.State.SUCCEEDED, this.f13739d);
            this.f13730C.mo11724o(this.f13739d, ((ListenableWorker.C1509a.C1512c) this.f13745x).mo10888e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f13731H.mo22245a(this.f13739d)) {
                if (this.f13730C.mo11714e(next) == WorkInfo.State.BLOCKED && this.f13731H.mo22246b(next)) {
                    qk3.m25726c().mo25137d(f13727X, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f13730C.mo11709a(WorkInfo.State.ENQUEUED, next);
                    this.f13730C.mo11729t(next, currentTimeMillis);
                }
            }
            this.f13729B.mo10115C();
        } finally {
            this.f13729B.mo10124j();
            mo21994i(false);
        }
    }

    /* renamed from: n */
    public final boolean mo21999n() {
        if (!this.f13737U) {
            return false;
        }
        qk3.m25726c().mo25135a(f13727X, String.format("Work interrupted for %s", new Object[]{this.f13734M}), new Throwable[0]);
        WorkInfo.State e = this.f13730C.mo11714e(this.f13739d);
        if (e == null) {
            mo21994i(false);
        } else {
            mo21994i(!e.isFinished());
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo22000o() {
        this.f13729B.mo10119e();
        try {
            boolean z = true;
            if (this.f13730C.mo11714e(this.f13739d) == WorkInfo.State.ENQUEUED) {
                this.f13730C.mo11709a(WorkInfo.State.RUNNING, this.f13739d);
                this.f13730C.mo11728s(this.f13739d);
            } else {
                z = false;
            }
            this.f13729B.mo10115C();
            return z;
        } finally {
            this.f13729B.mo10124j();
        }
    }

    public void run() {
        List<String> a = this.f13732I.mo19428a(this.f13739d);
        this.f13733L = a;
        this.f13734M = mo21986a(a);
        mo21996k();
    }
}
