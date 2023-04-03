package p000;

import androidx.work.BackoffPolicy;
import androidx.work.C1519b;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: an7 */
/* compiled from: WorkSpec */
public final class an7 {

    /* renamed from: s */
    public static final String f202s = qk3.m25728f("WorkSpec");

    /* renamed from: t */
    public static final sd2<List<C0042c>, List<WorkInfo>> f203t = new C0040a();

    /* renamed from: a */
    public String f204a;

    /* renamed from: b */
    public WorkInfo.State f205b = WorkInfo.State.ENQUEUED;

    /* renamed from: c */
    public String f206c;

    /* renamed from: d */
    public String f207d;

    /* renamed from: e */
    public C1519b f208e;

    /* renamed from: f */
    public C1519b f209f;

    /* renamed from: g */
    public long f210g;

    /* renamed from: h */
    public long f211h;

    /* renamed from: i */
    public long f212i;

    /* renamed from: j */
    public nq0 f213j;

    /* renamed from: k */
    public int f214k;

    /* renamed from: l */
    public BackoffPolicy f215l;

    /* renamed from: m */
    public long f216m;

    /* renamed from: n */
    public long f217n;

    /* renamed from: o */
    public long f218o;

    /* renamed from: p */
    public long f219p;

    /* renamed from: q */
    public boolean f220q;

    /* renamed from: r */
    public OutOfQuotaPolicy f221r;

    /* renamed from: an7$a */
    /* compiled from: WorkSpec */
    public class C0040a implements sd2<List<C0042c>, List<WorkInfo>> {
        /* renamed from: a */
        public List<WorkInfo> apply(List<C0042c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C0042c a : list) {
                arrayList.add(a.mo442a());
            }
            return arrayList;
        }
    }

    /* renamed from: an7$b */
    /* compiled from: WorkSpec */
    public static class C0041b {

        /* renamed from: a */
        public String f222a;

        /* renamed from: b */
        public WorkInfo.State f223b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0041b)) {
                return false;
            }
            C0041b bVar = (C0041b) obj;
            if (this.f223b != bVar.f223b) {
                return false;
            }
            return this.f222a.equals(bVar.f222a);
        }

        public int hashCode() {
            return (this.f222a.hashCode() * 31) + this.f223b.hashCode();
        }
    }

    /* renamed from: an7$c */
    /* compiled from: WorkSpec */
    public static class C0042c {

        /* renamed from: a */
        public String f224a;

        /* renamed from: b */
        public WorkInfo.State f225b;

        /* renamed from: c */
        public C1519b f226c;

        /* renamed from: d */
        public int f227d;

        /* renamed from: e */
        public List<String> f228e;

        /* renamed from: f */
        public List<C1519b> f229f;

        /* renamed from: a */
        public WorkInfo mo442a() {
            C1519b bVar;
            List<C1519b> list = this.f229f;
            if (list == null || list.isEmpty()) {
                bVar = C1519b.f7528c;
            } else {
                bVar = this.f229f.get(0);
            }
            return new WorkInfo(UUID.fromString(this.f224a), this.f225b, this.f226c, this.f228e, bVar, this.f227d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0042c)) {
                return false;
            }
            C0042c cVar = (C0042c) obj;
            if (this.f227d != cVar.f227d) {
                return false;
            }
            String str = this.f224a;
            if (str == null ? cVar.f224a != null : !str.equals(cVar.f224a)) {
                return false;
            }
            if (this.f225b != cVar.f225b) {
                return false;
            }
            C1519b bVar = this.f226c;
            if (bVar == null ? cVar.f226c != null : !bVar.equals(cVar.f226c)) {
                return false;
            }
            List<String> list = this.f228e;
            if (list == null ? cVar.f228e != null : !list.equals(cVar.f228e)) {
                return false;
            }
            List<C1519b> list2 = this.f229f;
            List<C1519b> list3 = cVar.f229f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String str = this.f224a;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            WorkInfo.State state = this.f225b;
            if (state != null) {
                i2 = state.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            C1519b bVar = this.f226c;
            if (bVar != null) {
                i3 = bVar.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (((i7 + i3) * 31) + this.f227d) * 31;
            List<String> list = this.f228e;
            if (list != null) {
                i4 = list.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            List<C1519b> list2 = this.f229f;
            if (list2 != null) {
                i5 = list2.hashCode();
            }
            return i9 + i5;
        }
    }

    public an7(String str, String str2) {
        C1519b bVar = C1519b.f7528c;
        this.f208e = bVar;
        this.f209f = bVar;
        this.f213j = nq0.f15632i;
        this.f215l = BackoffPolicy.EXPONENTIAL;
        this.f216m = 30000;
        this.f219p = -1;
        this.f221r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f204a = str;
        this.f206c = str2;
    }

    /* renamed from: a */
    public long mo431a() {
        long j;
        long j2;
        boolean z = false;
        if (mo433c()) {
            if (this.f215l == BackoffPolicy.LINEAR) {
                z = true;
            }
            if (z) {
                j2 = this.f216m * ((long) this.f214k);
            } else {
                j2 = (long) Math.scalb((float) this.f216m, this.f214k - 1);
            }
            return this.f217n + Math.min(18000000, j2);
        }
        long j3 = 0;
        if (mo434d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.f217n;
            if (j4 == 0) {
                j = currentTimeMillis + this.f210g;
            } else {
                j = j4;
            }
            long j5 = this.f212i;
            long j6 = this.f211h;
            if (j5 != j6) {
                z = true;
            }
            if (z) {
                if (j4 == 0) {
                    j3 = j5 * -1;
                }
                return j + j6 + j3;
            }
            if (j4 != 0) {
                j3 = j6;
            }
            return j + j3;
        }
        long j7 = this.f217n;
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        return j7 + this.f210g;
    }

    /* renamed from: b */
    public boolean mo432b() {
        return !nq0.f15632i.equals(this.f213j);
    }

    /* renamed from: c */
    public boolean mo433c() {
        if (this.f205b != WorkInfo.State.ENQUEUED || this.f214k <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo434d() {
        if (this.f211h != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || an7.class != obj.getClass()) {
            return false;
        }
        an7 an7 = (an7) obj;
        if (this.f210g != an7.f210g || this.f211h != an7.f211h || this.f212i != an7.f212i || this.f214k != an7.f214k || this.f216m != an7.f216m || this.f217n != an7.f217n || this.f218o != an7.f218o || this.f219p != an7.f219p || this.f220q != an7.f220q || !this.f204a.equals(an7.f204a) || this.f205b != an7.f205b || !this.f206c.equals(an7.f206c)) {
            return false;
        }
        String str = this.f207d;
        if (str == null ? an7.f207d != null : !str.equals(an7.f207d)) {
            return false;
        }
        if (!this.f208e.equals(an7.f208e) || !this.f209f.equals(an7.f209f) || !this.f213j.equals(an7.f213j) || this.f215l != an7.f215l) {
            return false;
        }
        if (this.f221r == an7.f221r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f204a.hashCode() * 31) + this.f205b.hashCode()) * 31) + this.f206c.hashCode()) * 31;
        String str = this.f207d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f210g;
        long j2 = this.f211h;
        long j3 = this.f212i;
        long j4 = this.f216m;
        long j5 = this.f217n;
        long j6 = this.f218o;
        long j7 = this.f219p;
        return ((((((((((((((((((((((((((((hashCode + i) * 31) + this.f208e.hashCode()) * 31) + this.f209f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f213j.hashCode()) * 31) + this.f214k) * 31) + this.f215l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f220q ? 1 : 0)) * 31) + this.f221r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f204a + "}";
    }

    public an7(an7 an7) {
        C1519b bVar = C1519b.f7528c;
        this.f208e = bVar;
        this.f209f = bVar;
        this.f213j = nq0.f15632i;
        this.f215l = BackoffPolicy.EXPONENTIAL;
        this.f216m = 30000;
        this.f219p = -1;
        this.f221r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f204a = an7.f204a;
        this.f206c = an7.f206c;
        this.f205b = an7.f205b;
        this.f207d = an7.f207d;
        this.f208e = new C1519b(an7.f208e);
        this.f209f = new C1519b(an7.f209f);
        this.f210g = an7.f210g;
        this.f211h = an7.f211h;
        this.f212i = an7.f212i;
        this.f213j = new nq0(an7.f213j);
        this.f214k = an7.f214k;
        this.f215l = an7.f215l;
        this.f216m = an7.f216m;
        this.f217n = an7.f217n;
        this.f218o = an7.f218o;
        this.f219p = an7.f219p;
        this.f220q = an7.f220q;
        this.f221r = an7.f221r;
    }
}
