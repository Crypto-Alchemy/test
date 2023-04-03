package p000;

import android.text.TextUtils;
import androidx.work.C1523d;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: em7 */
/* compiled from: WorkContinuationImpl */
public class em7 extends dm7 {

    /* renamed from: j */
    public static final String f11272j = qk3.m25728f("WorkContinuationImpl");

    /* renamed from: a */
    public final nm7 f11273a;

    /* renamed from: b */
    public final String f11274b;

    /* renamed from: c */
    public final ExistingWorkPolicy f11275c;

    /* renamed from: d */
    public final List<? extends C1523d> f11276d;

    /* renamed from: e */
    public final List<String> f11277e;

    /* renamed from: f */
    public final List<String> f11278f;

    /* renamed from: g */
    public final List<em7> f11279g;

    /* renamed from: h */
    public boolean f11280h;

    /* renamed from: i */
    public mi4 f11281i;

    public em7(nm7 nm7, List<? extends C1523d> list) {
        this(nm7, (String) null, ExistingWorkPolicy.KEEP, list, (List<em7>) null);
    }

    /* renamed from: i */
    public static boolean m16211i(em7 em7, Set<String> set) {
        set.addAll(em7.mo19382c());
        Set<String> l = m16212l(em7);
        for (String contains : set) {
            if (l.contains(contains)) {
                return true;
            }
        }
        List<em7> e = em7.mo19384e();
        if (e != null && !e.isEmpty()) {
            for (em7 i : e) {
                if (m16211i(i, set)) {
                    return true;
                }
            }
        }
        set.removeAll(em7.mo19382c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m16212l(em7 em7) {
        HashSet hashSet = new HashSet();
        List<em7> e = em7.mo19384e();
        if (e != null && !e.isEmpty()) {
            for (em7 c : e) {
                hashSet.addAll(c.mo19382c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public mi4 mo19380a() {
        if (!this.f11280h) {
            oq1 oq1 = new oq1(this);
            this.f11273a.mo23744r().mo11700b(oq1);
            this.f11281i = oq1.mo24045d();
        } else {
            qk3.m25726c().mo25139h(f11272j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f11277e)}), new Throwable[0]);
        }
        return this.f11281i;
    }

    /* renamed from: b */
    public ExistingWorkPolicy mo19381b() {
        return this.f11275c;
    }

    /* renamed from: c */
    public List<String> mo19382c() {
        return this.f11277e;
    }

    /* renamed from: d */
    public String mo19383d() {
        return this.f11274b;
    }

    /* renamed from: e */
    public List<em7> mo19384e() {
        return this.f11279g;
    }

    /* renamed from: f */
    public List<? extends C1523d> mo19385f() {
        return this.f11276d;
    }

    /* renamed from: g */
    public nm7 mo19386g() {
        return this.f11273a;
    }

    /* renamed from: h */
    public boolean mo19387h() {
        return m16211i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean mo19388j() {
        return this.f11280h;
    }

    /* renamed from: k */
    public void mo19389k() {
        this.f11280h = true;
    }

    public em7(nm7 nm7, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends C1523d> list) {
        this(nm7, str, existingWorkPolicy, list, (List<em7>) null);
    }

    public em7(nm7 nm7, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends C1523d> list, List<em7> list2) {
        this.f11273a = nm7;
        this.f11274b = str;
        this.f11275c = existingWorkPolicy;
        this.f11276d = list;
        this.f11279g = list2;
        this.f11277e = new ArrayList(list.size());
        this.f11278f = new ArrayList();
        if (list2 != null) {
            for (em7 em7 : list2) {
                this.f11278f.addAll(em7.f11278f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((C1523d) list.get(i)).mo10942a();
            this.f11277e.add(a);
            this.f11278f.add(a);
        }
    }
}
