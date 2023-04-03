package zendesk.belvedere;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import zendesk.belvedere.BelvedereUi;

/* renamed from: zendesk.belvedere.e */
/* compiled from: ImageStreamModel */
public class C9819e implements tr2 {

    /* renamed from: a */
    public final ur2 f46722a;

    /* renamed from: b */
    public final List<MediaIntent> f46723b;

    /* renamed from: c */
    public final List<MediaResult> f46724c;

    /* renamed from: d */
    public final List<MediaResult> f46725d;

    /* renamed from: e */
    public final long f46726e;

    /* renamed from: f */
    public final boolean f46727f;

    public C9819e(Context context, BelvedereUi.UiConfig uiConfig) {
        this.f46722a = new ur2(context);
        this.f46723b = uiConfig.mo73617b();
        this.f46724c = uiConfig.mo73619d();
        this.f46725d = uiConfig.mo73616a();
        this.f46726e = uiConfig.mo73618c();
        this.f46727f = uiConfig.mo73622f();
    }

    /* renamed from: a */
    public MediaIntent mo67446a() {
        MediaIntent l = mo67457l();
        if (l == null) {
            return null;
        }
        Intent a = l.mo73678a();
        a.setPackage("com.google.android.apps.photos");
        a.setAction("android.intent.action.GET_CONTENT");
        return l;
    }

    /* renamed from: b */
    public long mo67447b() {
        return this.f46726e;
    }

    /* renamed from: c */
    public boolean mo67448c() {
        if (mo67457l() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo67449d() {
        if (mo67453h() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public List<MediaResult> mo67450e(MediaResult mediaResult) {
        this.f46724c.remove(mediaResult);
        return this.f46724c;
    }

    /* renamed from: f */
    public List<MediaResult> mo67451f() {
        return this.f46724c;
    }

    /* renamed from: g */
    public boolean mo67452g() {
        return this.f46727f;
    }

    /* renamed from: h */
    public MediaIntent mo67453h() {
        return mo73767m(2);
    }

    /* renamed from: i */
    public List<MediaResult> mo67454i(MediaResult mediaResult) {
        this.f46724c.add(mediaResult);
        return this.f46724c;
    }

    /* renamed from: j */
    public boolean mo67455j() {
        if (mo67457l() == null || !this.f46722a.mo67458a("com.google.android.apps.photos")) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public List<MediaResult> mo67456k() {
        return mo73768n(this.f46722a.mo67459b(500), mo73768n(this.f46725d, this.f46724c));
    }

    /* renamed from: l */
    public MediaIntent mo67457l() {
        return mo73767m(1);
    }

    /* renamed from: m */
    public final MediaIntent mo73767m(int i) {
        for (MediaIntent next : this.f46723b) {
            if (next.mo73680c() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final List<MediaResult> mo73768n(List<MediaResult> list, List<MediaResult> list2) {
        HashSet hashSet = new HashSet(list.size());
        for (MediaResult i : list) {
            hashSet.add(i.mo73702i());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        for (int size = list2.size() - 1; size >= 0; size--) {
            MediaResult mediaResult = list2.get(size);
            if (!hashSet.contains(mediaResult.mo73702i())) {
                arrayList.add(0, mediaResult);
            }
        }
        return arrayList;
    }
}
