package p000;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u00103\u001a\u00020,\u0012\u0006\u0010;\u001a\u000204\u0012\u0006\u0010>\u001a\u00020<¢\u0006\u0004\bU\u0010VJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0006\u0010\u0010\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010=R\u0014\u0010A\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010E\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010G\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010(R\u0014\u0010J\u001a\u00020H8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010IR\u0014\u0010L\u001a\u00020\u00048fX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010!R\u0014\u0010N\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010MR\u0014\u0010P\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0011\u0010R\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u0010QR\u0011\u0010T\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bS\u0010!¨\u0006W"}, mo44877d2 = {"Lwc4;", "", "", "id", "Lorg/json/JSONArray;", "m", "channelObjects", "Lr37;", "u", "p", "b", "Lorg/json/JSONObject;", "jsonObject", "Lid4;", "influence", "a", "t", "v", "toString", "other", "", "equals", "", "hashCode", "Lcom/onesignal/influence/domain/OSInfluenceType;", "Lcom/onesignal/influence/domain/OSInfluenceType;", "k", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "y", "(Lcom/onesignal/influence/domain/OSInfluenceType;)V", "influenceType", "Lorg/json/JSONArray;", "j", "()Lorg/json/JSONArray;", "x", "(Lorg/json/JSONArray;)V", "indirectIds", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "directId", "Lkd4;", "d", "Lkd4;", "f", "()Lkd4;", "setDataRepository", "(Lkd4;)V", "dataRepository", "Lld4;", "e", "Lld4;", "o", "()Lld4;", "setLogger", "(Lld4;)V", "logger", "Lne4;", "Lne4;", "timeProvider", "q", "()Z", "isDirectSessionEnabled", "r", "isIndirectSessionEnabled", "s", "isUnattributedSessionEnabled", "h", "idTag", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "channelType", "l", "lastChannelObjects", "()I", "channelLimit", "i", "indirectAttributionWindow", "()Lid4;", "currentSessionInfluence", "n", "lastReceivedIds", "<init>", "(Lkd4;Lld4;Lne4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: wc4 */
/* compiled from: OSChannelTracker.kt */
public abstract class wc4 {

    /* renamed from: a */
    public OSInfluenceType f35290a;

    /* renamed from: b */
    public JSONArray f35291b;

    /* renamed from: c */
    public String f35292c;

    /* renamed from: d */
    public kd4 f35293d;

    /* renamed from: e */
    public ld4 f35294e;

    /* renamed from: f */
    public ne4 f35295f;

    public wc4(kd4 kd4, ld4 ld4, ne4 ne4) {
        vx2.m53591g(kd4, "dataRepository");
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(ne4, "timeProvider");
        this.f35293d = kd4;
        this.f35294e = ld4;
        this.f35295f = ne4;
    }

    /* renamed from: a */
    public abstract void mo43152a(JSONObject jSONObject, id4 id4);

    /* renamed from: b */
    public abstract void mo43153b();

    /* renamed from: c */
    public abstract int mo43154c();

    /* renamed from: d */
    public abstract OSInfluenceChannel mo43155d();

    /* renamed from: e */
    public final id4 mo49149e() {
        OSInfluenceChannel d = mo43155d();
        OSInfluenceType oSInfluenceType = OSInfluenceType.DISABLED;
        id4 id4 = new id4(d, oSInfluenceType, (JSONArray) null);
        if (this.f35290a == null) {
            mo43160p();
        }
        OSInfluenceType oSInfluenceType2 = this.f35290a;
        if (oSInfluenceType2 != null) {
            oSInfluenceType = oSInfluenceType2;
        }
        if (oSInfluenceType.isDirect()) {
            if (mo49158q()) {
                id4.mo43567e(new JSONArray().put(this.f35292c));
                id4.mo43569f(OSInfluenceType.DIRECT);
            }
        } else if (oSInfluenceType.isIndirect()) {
            if (mo49159r()) {
                id4.mo43567e(this.f35291b);
                id4.mo43569f(OSInfluenceType.INDIRECT);
            }
        } else if (mo49160s()) {
            id4.mo43569f(OSInfluenceType.UNATTRIBUTED);
        }
        return id4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!vx2.m53586b(getClass(), obj.getClass()))) {
            return false;
        }
        wc4 wc4 = (wc4) obj;
        if (this.f35290a != wc4.f35290a || !vx2.m53586b(wc4.mo43156h(), mo43156h())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final kd4 mo49151f() {
        return this.f35293d;
    }

    /* renamed from: g */
    public final String mo49152g() {
        return this.f35292c;
    }

    /* renamed from: h */
    public abstract String mo43156h();

    public int hashCode() {
        int i;
        OSInfluenceType oSInfluenceType = this.f35290a;
        if (oSInfluenceType != null) {
            i = oSInfluenceType.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + mo43156h().hashCode();
    }

    /* renamed from: i */
    public abstract int mo43157i();

    /* renamed from: j */
    public final JSONArray mo49154j() {
        return this.f35291b;
    }

    /* renamed from: k */
    public final OSInfluenceType mo49155k() {
        return this.f35290a;
    }

    /* renamed from: l */
    public abstract JSONArray mo43158l() throws JSONException;

    /* renamed from: m */
    public abstract JSONArray mo43159m(String str);

    /* renamed from: n */
    public final JSONArray mo49156n() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray l = mo43158l();
            ld4 ld4 = this.f35294e;
            ld4.debug("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + l);
            long i = ((long) (mo43157i() * 60)) * 1000;
            long a = this.f35295f.mo46064a();
            int length = l.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = l.getJSONObject(i2);
                if (a - jSONObject.getLong("time") <= i) {
                    jSONArray.put(jSONObject.getString(mo43156h()));
                }
            }
        } catch (JSONException e) {
            this.f35294e.error("Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return jSONArray;
    }

    /* renamed from: o */
    public final ld4 mo49157o() {
        return this.f35294e;
    }

    /* renamed from: p */
    public abstract void mo43160p();

    /* renamed from: q */
    public final boolean mo49158q() {
        return this.f35293d.mo44760m();
    }

    /* renamed from: r */
    public final boolean mo49159r() {
        return this.f35293d.mo44761n();
    }

    /* renamed from: s */
    public final boolean mo49160s() {
        return this.f35293d.mo44762o();
    }

    /* renamed from: t */
    public final void mo49161t() {
        int i;
        OSInfluenceType oSInfluenceType;
        this.f35292c = null;
        JSONArray n = mo49156n();
        this.f35291b = n;
        if (n != null) {
            i = n.length();
        } else {
            i = 0;
        }
        if (i > 0) {
            oSInfluenceType = OSInfluenceType.INDIRECT;
        } else {
            oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
        }
        this.f35290a = oSInfluenceType;
        mo43153b();
        ld4 ld4 = this.f35294e;
        ld4.debug("OneSignal OSChannelTracker resetAndInitInfluence: " + mo43156h() + " finish with influenceType: " + this.f35290a);
    }

    public String toString() {
        return "OSChannelTracker{tag=" + mo43156h() + ", influenceType=" + this.f35290a + ", indirectIds=" + this.f35291b + ", directId=" + this.f35292c + '}';
    }

    /* renamed from: u */
    public abstract void mo43161u(JSONArray jSONArray);

    /* renamed from: v */
    public final void mo49163v(String str) {
        boolean z;
        ld4 ld4 = this.f35294e;
        ld4.debug("OneSignal OSChannelTracker for: " + mo43156h() + " saveLastId: " + str);
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                JSONArray m = mo43159m(str);
                ld4 ld42 = this.f35294e;
                ld42.debug("OneSignal OSChannelTracker for: " + mo43156h() + " saveLastId with lastChannelObjectsReceived: " + m);
                try {
                    m.put(new JSONObject().put(mo43156h(), str).put("time", this.f35295f.mo46064a()));
                    if (m.length() > mo43154c()) {
                        JSONArray jSONArray = new JSONArray();
                        int length = m.length();
                        for (int length2 = m.length() - mo43154c(); length2 < length; length2++) {
                            try {
                                jSONArray.put(m.get(length2));
                            } catch (JSONException e) {
                                this.f35294e.error("Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                            }
                        }
                        m = jSONArray;
                    }
                    ld4 ld43 = this.f35294e;
                    ld43.debug("OneSignal OSChannelTracker for: " + mo43156h() + " with channelObjectToSave: " + m);
                    mo43161u(m);
                } catch (JSONException e2) {
                    this.f35294e.error("Generating tracker newInfluenceId JSONObject ", e2);
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo49164w(String str) {
        this.f35292c = str;
    }

    /* renamed from: x */
    public final void mo49165x(JSONArray jSONArray) {
        this.f35291b = jSONArray;
    }

    /* renamed from: y */
    public final void mo49166y(OSInfluenceType oSInfluenceType) {
        this.f35290a = oSInfluenceType;
    }
}
