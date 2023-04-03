package p000;

import android.text.TextUtils;
import androidx.work.C1519b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import p000.mi4;

/* renamed from: oq1 */
/* compiled from: EnqueueRunnable */
public class oq1 implements Runnable {

    /* renamed from: e */
    public static final String f15969e = qk3.m25728f("EnqueueRunnable");

    /* renamed from: a */
    public final em7 f15970a;

    /* renamed from: d */
    public final ni4 f15971d = new ni4();

    public oq1(em7 em7) {
        this.f15970a = em7;
    }

    /* renamed from: b */
    public static boolean m23953b(em7 em7) {
        boolean c = m23954c(em7.mo19386g(), em7.mo19385f(), (String[]) em7.m16212l(em7).toArray(new String[0]), em7.mo19383d(), em7.mo19381b());
        em7.mo19389k();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0147  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m23954c(p000.nm7 r16, java.util.List<? extends androidx.work.C1523d> r17, java.lang.String[] r18, java.lang.String r19, androidx.work.ExistingWorkPolicy r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r16.mo23743q()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0017
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0017
            r8 = r6
            goto L_0x0018
        L_0x0017:
            r8 = r7
        L_0x0018:
            if (r8 == 0) goto L_0x005b
            int r9 = r0.length
            r11 = r6
            r10 = r7
            r12 = r10
            r13 = r12
        L_0x001f:
            if (r10 >= r9) goto L_0x005e
            r14 = r0[r10]
            bn7 r15 = r5.mo10955N()
            an7 r15 = r15.mo11715f(r14)
            if (r15 != 0) goto L_0x0043
            qk3 r0 = p000.qk3.m25726c()
            java.lang.String r1 = f15969e
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r14
            java.lang.String r3 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r7]
            r0.mo25136b(r1, r2, r3)
            return r7
        L_0x0043:
            androidx.work.WorkInfo$State r14 = r15.f205b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r14 != r15) goto L_0x004b
            r15 = r6
            goto L_0x004c
        L_0x004b:
            r15 = r7
        L_0x004c:
            r11 = r11 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r14 != r15) goto L_0x0053
            r13 = r6
            goto L_0x0058
        L_0x0053:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r14 != r15) goto L_0x0058
            r12 = r6
        L_0x0058:
            int r10 = r10 + 1
            goto L_0x001f
        L_0x005b:
            r11 = r6
            r12 = r7
            r13 = r12
        L_0x005e:
            boolean r9 = android.text.TextUtils.isEmpty(r19)
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x0069
            if (r8 != 0) goto L_0x0069
            r10 = r6
            goto L_0x006a
        L_0x0069:
            r10 = r7
        L_0x006a:
            if (r10 == 0) goto L_0x013c
            bn7 r10 = r5.mo10955N()
            java.util.List r10 = r10.mo11722m(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x013c
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND
            if (r2 == r14) goto L_0x00c5
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x0083
            goto L_0x00c5
        L_0x0083:
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.KEEP
            if (r2 != r14) goto L_0x00a2
            java.util.Iterator r2 = r10.iterator()
        L_0x008b:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00a2
            java.lang.Object r14 = r2.next()
            an7$b r14 = (p000.an7.C0041b) r14
            androidx.work.WorkInfo$State r14 = r14.f223b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r14 == r15) goto L_0x00a1
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.RUNNING
            if (r14 != r15) goto L_0x008b
        L_0x00a1:
            return r7
        L_0x00a2:
            r2 = r16
            ia0 r2 = p000.ia0.m19527c(r1, r2, r7)
            r2.run()
            bn7 r2 = r5.mo10955N()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b3:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x013d
            java.lang.Object r14 = r10.next()
            an7$b r14 = (p000.an7.C0041b) r14
            java.lang.String r14 = r14.f222a
            r2.delete(r14)
            goto L_0x00b3
        L_0x00c5:
            kc1 r8 = r5.mo10950F()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d2:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x0104
            java.lang.Object r15 = r10.next()
            an7$b r15 = (p000.an7.C0041b) r15
            java.lang.String r6 = r15.f222a
            boolean r6 = r8.mo22248d(r6)
            if (r6 != 0) goto L_0x0101
            androidx.work.WorkInfo$State r6 = r15.f223b
            androidx.work.WorkInfo$State r7 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r6 != r7) goto L_0x00ee
            r7 = 1
            goto L_0x00ef
        L_0x00ee:
            r7 = 0
        L_0x00ef:
            r7 = r7 & r11
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.FAILED
            if (r6 != r11) goto L_0x00f6
            r13 = 1
            goto L_0x00fb
        L_0x00f6:
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.CANCELLED
            if (r6 != r11) goto L_0x00fb
            r12 = 1
        L_0x00fb:
            java.lang.String r6 = r15.f222a
            r14.add(r6)
            r11 = r7
        L_0x0101:
            r6 = 1
            r7 = 0
            goto L_0x00d2
        L_0x0104:
            androidx.work.ExistingWorkPolicy r6 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0130
            if (r12 != 0) goto L_0x010c
            if (r13 == 0) goto L_0x0130
        L_0x010c:
            bn7 r2 = r5.mo10955N()
            java.util.List r6 = r2.mo11722m(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0118:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x012a
            java.lang.Object r7 = r6.next()
            an7$b r7 = (p000.an7.C0041b) r7
            java.lang.String r7 = r7.f222a
            r2.delete(r7)
            goto L_0x0118
        L_0x012a:
            java.util.List r14 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0130:
            java.lang.Object[] r0 = r14.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x013b
            r8 = 1
            goto L_0x013c
        L_0x013b:
            r8 = 0
        L_0x013c:
            r6 = 0
        L_0x013d:
            java.util.Iterator r2 = r17.iterator()
        L_0x0141:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01f0
            java.lang.Object r7 = r2.next()
            androidx.work.d r7 = (androidx.work.C1523d) r7
            an7 r10 = r7.mo10944c()
            if (r8 == 0) goto L_0x0168
            if (r11 != 0) goto L_0x0168
            if (r13 == 0) goto L_0x015c
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.FAILED
            r10.f205b = r14
            goto L_0x0175
        L_0x015c:
            if (r12 == 0) goto L_0x0163
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.CANCELLED
            r10.f205b = r14
            goto L_0x0175
        L_0x0163:
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.BLOCKED
            r10.f205b = r14
            goto L_0x0175
        L_0x0168:
            boolean r14 = r10.mo434d()
            if (r14 != 0) goto L_0x0171
            r10.f217n = r3
            goto L_0x0175
        L_0x0171:
            r14 = 0
            r10.f217n = r14
        L_0x0175:
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 25
            if (r14 > r15) goto L_0x017e
            m23956g(r10)
        L_0x017e:
            androidx.work.WorkInfo$State r14 = r10.f205b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r14 != r15) goto L_0x0185
            r6 = 1
        L_0x0185:
            bn7 r14 = r5.mo10955N()
            r14.mo11716g(r10)
            if (r8 == 0) goto L_0x01af
            int r10 = r0.length
            r14 = 0
        L_0x0190:
            if (r14 >= r10) goto L_0x01af
            r15 = r0[r14]
            r16 = r0
            hc1 r0 = new hc1
            r17 = r2
            java.lang.String r2 = r7.mo10942a()
            r0.<init>(r2, r15)
            kc1 r2 = r5.mo10950F()
            r2.mo22247c(r0)
            int r14 = r14 + 1
            r0 = r16
            r2 = r17
            goto L_0x0190
        L_0x01af:
            r16 = r0
            r17 = r2
            java.util.Set r0 = r7.mo10943b()
            java.util.Iterator r0 = r0.iterator()
        L_0x01bb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01d8
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            en7 r10 = r5.mo10956O()
            dn7 r14 = new dn7
            java.lang.String r15 = r7.mo10942a()
            r14.<init>(r2, r15)
            r10.mo19429b(r14)
            goto L_0x01bb
        L_0x01d8:
            if (r9 == 0) goto L_0x01ea
            qm7 r0 = r5.mo10953L()
            pm7 r2 = new pm7
            java.lang.String r7 = r7.mo10942a()
            r2.<init>(r1, r7)
            r0.mo25154a(r2)
        L_0x01ea:
            r0 = r16
            r2 = r17
            goto L_0x0141
        L_0x01f0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oq1.m23954c(nm7, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    /* renamed from: e */
    public static boolean m23955e(em7 em7) {
        List<em7> e = em7.mo19384e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (em7 next : e) {
                if (!next.mo19388j()) {
                    z2 |= m23955e(next);
                } else {
                    qk3.m25726c().mo25139h(f15969e, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.mo19382c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m23953b(em7) | z;
    }

    /* renamed from: g */
    public static void m23956g(an7 an7) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        nq0 nq0 = an7.f213j;
        String str = an7.f206c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (nq0.mo23764f() || nq0.mo23768i()) {
            C1519b.C1520a aVar = new C1519b.C1520a();
            aVar.mo10932c(an7.f208e).mo10937h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            an7.f206c = cls.getName();
            an7.f208e = aVar.mo10930a();
        }
    }

    /* renamed from: a */
    public boolean mo24044a() {
        WorkDatabase q = this.f15970a.mo19386g().mo23743q();
        q.mo10119e();
        try {
            boolean e = m23955e(this.f15970a);
            q.mo10115C();
            return e;
        } finally {
            q.mo10124j();
        }
    }

    /* renamed from: d */
    public mi4 mo24045d() {
        return this.f15971d;
    }

    /* renamed from: f */
    public void mo24046f() {
        nm7 g = this.f15970a.mo19386g();
        tm5.m27833b(g.mo23739k(), g.mo23743q(), g.mo23742p());
    }

    public void run() {
        try {
            if (!this.f15970a.mo19387h()) {
                if (mo24044a()) {
                    kk4.m20801a(this.f15970a.mo19386g().mo23738j(), RescheduleReceiver.class, true);
                    mo24046f();
                }
                this.f15971d.mo23691a(mi4.f14990a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f15970a}));
        } catch (Throwable th) {
            this.f15971d.mo23691a(new mi4.C2835b.C2836a(th));
        }
    }
}
