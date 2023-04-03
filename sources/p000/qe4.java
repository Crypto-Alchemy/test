package p000;

import com.onesignal.C5346y0;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000e\u001a\u00020\rR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001a¨\u0006,"}, mo44877d2 = {"Lqe4;", "", "Lr37;", "i", "Lcom/onesignal/y0$e;", "influenceParams", "j", "Lorg/json/JSONObject;", "jsonObject", "", "Lid4;", "influences", "a", "Lcom/onesignal/OneSignal$AppEntryAction;", "entryAction", "Lwc4;", "b", "d", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "trackers", "Lkd4;", "Lkd4;", "dataRepository", "f", "()Ljava/util/List;", "h", "sessionInfluences", "e", "()Lwc4;", "iAMChannelTracker", "g", "notificationChannelTracker", "c", "channels", "Lje4;", "preferences", "Lld4;", "logger", "Lne4;", "timeProvider", "<init>", "(Lje4;Lld4;Lne4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: qe4 */
/* compiled from: OSTrackerFactory.kt */
public final class qe4 {

    /* renamed from: a */
    public final ConcurrentHashMap<String, wc4> f33076a;

    /* renamed from: b */
    public final kd4 f33077b;

    public qe4(je4 je4, ld4 ld4, ne4 ne4) {
        vx2.m53591g(je4, "preferences");
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(ne4, "timeProvider");
        ConcurrentHashMap<String, wc4> concurrentHashMap = new ConcurrentHashMap<>();
        this.f33076a = concurrentHashMap;
        kd4 kd4 = new kd4(je4);
        this.f33077b = kd4;
        jd4 jd4 = jd4.f30467c;
        concurrentHashMap.put(jd4.mo44417a(), new hd4(kd4, ld4, ne4));
        concurrentHashMap.put(jd4.mo44418b(), new pd4(kd4, ld4, ne4));
    }

    /* renamed from: a */
    public final void mo47079a(JSONObject jSONObject, List<id4> list) {
        vx2.m53591g(jSONObject, "jsonObject");
        vx2.m53591g(list, "influences");
        for (id4 id4 : list) {
            if (pe4.f32672a[id4.mo43565c().ordinal()] == 1) {
                mo47085g().mo43152a(jSONObject, id4);
            }
        }
    }

    /* renamed from: b */
    public final wc4 mo47080b(OneSignal.AppEntryAction appEntryAction) {
        vx2.m53591g(appEntryAction, "entryAction");
        if (appEntryAction.isNotificationClick()) {
            return mo47085g();
        }
        return null;
    }

    /* renamed from: c */
    public final List<wc4> mo47081c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo47085g());
        arrayList.add(mo47083e());
        return arrayList;
    }

    /* renamed from: d */
    public final List<wc4> mo47082d(OneSignal.AppEntryAction appEntryAction) {
        wc4 wc4;
        vx2.m53591g(appEntryAction, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (appEntryAction.isAppClose()) {
            return arrayList;
        }
        if (appEntryAction.isAppOpen()) {
            wc4 = mo47085g();
        } else {
            wc4 = null;
        }
        if (wc4 != null) {
            arrayList.add(wc4);
        }
        arrayList.add(mo47083e());
        return arrayList;
    }

    /* renamed from: e */
    public final wc4 mo47083e() {
        wc4 wc4 = this.f33076a.get(jd4.f30467c.mo44417a());
        vx2.m53588d(wc4);
        return wc4;
    }

    /* renamed from: f */
    public final List<id4> mo47084f() {
        Collection<wc4> values = this.f33076a.values();
        vx2.m53590f(values, "trackers.values");
        ArrayList arrayList = new ArrayList(dk0.m43495u(values, 10));
        for (wc4 e : values) {
            arrayList.add(e.mo49149e());
        }
        return arrayList;
    }

    /* renamed from: g */
    public final wc4 mo47085g() {
        wc4 wc4 = this.f33076a.get(jd4.f30467c.mo44418b());
        vx2.m53588d(wc4);
        return wc4;
    }

    /* renamed from: h */
    public final List<id4> mo47086h() {
        Collection<wc4> values = this.f33076a.values();
        vx2.m53590f(values, "trackers.values");
        ArrayList<wc4> arrayList = new ArrayList<>();
        for (T next : values) {
            if (!vx2.m53586b(((wc4) next).mo43156h(), jd4.f30467c.mo44417a())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
        for (wc4 e : arrayList) {
            arrayList2.add(e.mo49149e());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void mo47087i() {
        Collection<wc4> values = this.f33076a.values();
        vx2.m53590f(values, "trackers.values");
        for (wc4 p : values) {
            p.mo43160p();
        }
    }

    /* renamed from: j */
    public final void mo47088j(C5346y0.C5352e eVar) {
        vx2.m53591g(eVar, "influenceParams");
        this.f33077b.mo44764q(eVar);
    }
}
