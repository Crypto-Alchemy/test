package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.C4485a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.play.core.assetpacks.i */
public final class C4477i {

    /* renamed from: g */
    public static final pq7 f24741g = new pq7("ExtractorSessionStoreView");

    /* renamed from: a */
    public final C4469b f24742a;

    /* renamed from: b */
    public final rt7<yw7> f24743b;

    /* renamed from: c */
    public final rs7 f24744c;

    /* renamed from: d */
    public final rt7<Executor> f24745d;

    /* renamed from: e */
    public final Map<Integer, ht7> f24746e = new HashMap();

    /* renamed from: f */
    public final ReentrantLock f24747f = new ReentrantLock();

    public C4477i(C4469b bVar, rt7<yw7> rt7, rs7 rs7, rt7<Executor> rt72) {
        this.f24742a = bVar;
        this.f24743b = rt7;
        this.f24744c = rs7;
        this.f24745d = rt72;
    }

    /* renamed from: s */
    public static String m36426s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C4470bj("Session without pack received.");
    }

    /* renamed from: t */
    public static <T> List<T> m36427t(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final void mo34203a() {
        this.f24747f.lock();
    }

    /* renamed from: b */
    public final void mo34204b() {
        this.f24747f.unlock();
    }

    /* renamed from: c */
    public final Map<Integer, ht7> mo34205c() {
        return this.f24746e;
    }

    /* renamed from: d */
    public final boolean mo34206d(Bundle bundle) {
        return ((Boolean) mo34219q(new us7(this, bundle, (byte[]) null))).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo34207e(Bundle bundle) {
        return ((Boolean) mo34219q(new us7(this, bundle))).booleanValue();
    }

    /* renamed from: f */
    public final void mo34208f(String str, int i, long j) {
        mo34219q(new vs7(this, str, i, j));
    }

    /* renamed from: g */
    public final void mo34209g(int i) {
        mo34219q(new xs7(this, i));
    }

    /* renamed from: h */
    public final /* synthetic */ Map mo34210h(List list) {
        int i;
        Map<String, ht7> p = mo34218p(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ht7 ht7 = p.get(str);
            if (ht7 == null) {
                i = 8;
            } else {
                if (cu7.m43232d(ht7.f29727c.f28967c)) {
                    try {
                        ht7.f29727c.f28967c = 6;
                        this.f24745d.mo47486a().execute(new bt7(this, ht7));
                        this.f24744c.mo47475a(str);
                    } catch (C4470bj unused) {
                        f24741g.mo46855d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(ht7.f29725a), str);
                    }
                }
                i = ht7.f29727c.f28967c;
            }
            hashMap.put(str, Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: i */
    public final /* synthetic */ Map mo34211i(List list) {
        HashMap hashMap = new HashMap();
        for (ht7 next : this.f24746e.values()) {
            String str = next.f29727c.f28965a;
            if (list.contains(str)) {
                ht7 ht7 = (ht7) hashMap.get(str);
                if ((ht7 == null ? -1 : ht7.f29725a) < next.f29725a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public final /* synthetic */ Boolean mo34212j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, ht7> map = this.f24746e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        ht7 ht7 = this.f24746e.get(valueOf);
        if (ht7.f29727c.f28967c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!cu7.m43235g(ht7.f29727c.f28967c, bundle.getInt(C4485a.m36484e("status", m36426s(bundle)))));
    }

    /* renamed from: k */
    public final /* synthetic */ Boolean mo34213k(Bundle bundle) {
        jt7 jt7;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, ht7> map = this.f24746e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        boolean z2 = false;
        if (map.containsKey(valueOf)) {
            ht7 r = mo34220r(i);
            int i2 = bundle2.getInt(C4485a.m36484e("status", r.f29727c.f28965a));
            if (cu7.m43235g(r.f29727c.f28967c, i2)) {
                f24741g.mo46852a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(r.f29727c.f28967c));
                ft7 ft7 = r.f29727c;
                String str = ft7.f28965a;
                int i3 = ft7.f28967c;
                if (i3 == 4) {
                    this.f24743b.mo47486a().mo29744d(i, str);
                } else if (i3 == 5) {
                    this.f24743b.mo47486a().mo29742b(i);
                } else if (i3 == 6) {
                    this.f24743b.mo47486a().mo29747g(Arrays.asList(new String[]{str}));
                }
            } else {
                r.f29727c.f28967c = i2;
                if (cu7.m43233e(i2)) {
                    mo34209g(i);
                    this.f24744c.mo47475a(r.f29727c.f28965a);
                } else {
                    for (jt7 next : r.f29727c.f28969e) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C4485a.m36485f("chunk_intents", r.f29727c.f28965a, next.f30608a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    next.f30611d.get(i4).f28294a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String s = m36426s(bundle);
            long j = bundle2.getLong(C4485a.m36484e("pack_version", s));
            int i5 = bundle2.getInt(C4485a.m36484e("status", s));
            long j2 = bundle2.getLong(C4485a.m36484e("total_bytes_to_download", s));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(C4485a.m36484e("slice_ids", s));
            ArrayList arrayList = new ArrayList();
            for (T t : m36427t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(C4485a.m36485f("chunk_intents", s, t));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m36427t(parcelableArrayList2)) {
                    if (intent == null) {
                        z = z2;
                    }
                    arrayList2.add(new dt7(z));
                    z = true;
                    z2 = false;
                }
                String string = bundle2.getString(C4485a.m36485f("uncompressed_hash_sha256", s, t));
                long j3 = bundle2.getLong(C4485a.m36485f("uncompressed_size", s, t));
                int i6 = bundle2.getInt(C4485a.m36485f("patch_format", s, t), 0);
                if (i6 != 0) {
                    jt7 = new jt7(t, string, j3, arrayList2, 0, i6);
                    z2 = false;
                } else {
                    z2 = false;
                    jt7 = new jt7(t, string, j3, arrayList2, bundle2.getInt(C4485a.m36485f("compression_format", s, t), 0), 0);
                }
                arrayList.add(jt7);
                z = true;
            }
            this.f24746e.put(Integer.valueOf(i), new ht7(i, bundle2.getInt("app_version_code"), new ft7(s, j, i5, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* renamed from: l */
    public final /* synthetic */ void mo34214l(String str, int i, long j) {
        ht7 ht7 = mo34218p(Arrays.asList(new String[]{str})).get(str);
        if (ht7 == null || cu7.m43233e(ht7.f29727c.f28967c)) {
            f24741g.mo46853b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f24742a.mo34165b(str, i, j);
        ht7.f29727c.f28967c = 4;
    }

    /* renamed from: m */
    public final /* synthetic */ void mo34215m(int i) {
        mo34220r(i).f29727c.f28967c = 5;
    }

    /* renamed from: n */
    public final /* synthetic */ void mo34216n(int i) {
        ht7 r = mo34220r(i);
        if (cu7.m43233e(r.f29727c.f28967c)) {
            C4469b bVar = this.f24742a;
            ft7 ft7 = r.f29727c;
            bVar.mo34165b(ft7.f28965a, r.f29726b, ft7.f28966b);
            ft7 ft72 = r.f29727c;
            int i2 = ft72.f28967c;
            if (i2 == 5 || i2 == 6) {
                this.f24742a.mo34166c(ft72.f28965a, r.f29726b, ft72.f28966b);
                return;
            }
            return;
        }
        throw new C4470bj(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* renamed from: o */
    public final void mo34217o(int i) {
        mo34219q(new xs7(this, i, (byte[]) null));
    }

    /* renamed from: p */
    public final Map<String, ht7> mo34218p(List<String> list) {
        return (Map) mo34219q(new zs7(this, list, (byte[]) null));
    }

    /* renamed from: q */
    public final <T> T mo34219q(lt7<T> lt7) {
        try {
            mo34203a();
            return lt7.mo45522a();
        } finally {
            mo34204b();
        }
    }

    /* renamed from: r */
    public final ht7 mo34220r(int i) {
        Map<Integer, ht7> map = this.f24746e;
        Integer valueOf = Integer.valueOf(i);
        ht7 ht7 = map.get(valueOf);
        if (ht7 != null) {
            return ht7;
        }
        throw new C4470bj(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }
}
