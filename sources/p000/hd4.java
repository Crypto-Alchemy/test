package p000;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006("}, mo44877d2 = {"Lhd4;", "Lwc4;", "", "id", "Lorg/json/JSONArray;", "m", "channelObjects", "Lr37;", "u", "p", "Lorg/json/JSONObject;", "jsonObject", "Lid4;", "influence", "a", "b", "h", "()Ljava/lang/String;", "idTag", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "d", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "channelType", "l", "()Lorg/json/JSONArray;", "lastChannelObjects", "", "c", "()I", "channelLimit", "i", "indirectAttributionWindow", "Lkd4;", "dataRepository", "Lld4;", "logger", "Lne4;", "timeProvider", "<init>", "(Lkd4;Lld4;Lne4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: hd4 */
/* compiled from: OSInAppMessageTracker.kt */
public final class hd4 extends wc4 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hd4(kd4 kd4, ld4 ld4, ne4 ne4) {
        super(kd4, ld4, ne4);
        vx2.m53591g(kd4, "dataRepository");
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(ne4, "timeProvider");
    }

    /* renamed from: a */
    public void mo43152a(JSONObject jSONObject, id4 id4) {
        vx2.m53591g(jSONObject, "jsonObject");
        vx2.m53591g(id4, "influence");
    }

    /* renamed from: b */
    public void mo43153b() {
        OSInfluenceType k = mo49155k();
        if (k == null) {
            k = OSInfluenceType.UNATTRIBUTED;
        }
        kd4 f = mo49151f();
        if (k == OSInfluenceType.DIRECT) {
            k = OSInfluenceType.INDIRECT;
        }
        f.mo44748a(k);
    }

    /* renamed from: c */
    public int mo43154c() {
        return mo49151f().mo44754g();
    }

    /* renamed from: d */
    public OSInfluenceChannel mo43155d() {
        return OSInfluenceChannel.IAM;
    }

    /* renamed from: h */
    public String mo43156h() {
        return "iam_id";
    }

    /* renamed from: i */
    public int mo43157i() {
        return mo49151f().mo44753f();
    }

    /* renamed from: l */
    public JSONArray mo43158l() throws JSONException {
        return mo49151f().mo44755h();
    }

    /* renamed from: m */
    public JSONArray mo43159m(String str) {
        try {
            JSONArray l = mo43158l();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = l.length();
                for (int i = 0; i < length; i++) {
                    if (!vx2.m53586b(str, l.getJSONObject(i).getString(mo43156h()))) {
                        jSONArray.put(l.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e) {
                mo49157o().error("Generating tracker lastChannelObjectReceived get JSONObject ", e);
                return l;
            }
        } catch (JSONException e2) {
            mo49157o().error("Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    /* renamed from: p */
    public void mo43160p() {
        OSInfluenceType e = mo49151f().mo44752e();
        if (e.isIndirect()) {
            mo49165x(mo49156n());
        }
        r37 r37 = r37.f33317a;
        mo49166y(e);
        ld4 o = mo49157o();
        o.debug("OneSignal InAppMessageTracker initInfluencedTypeFromCache: " + this);
    }

    /* renamed from: u */
    public void mo43161u(JSONArray jSONArray) {
        vx2.m53591g(jSONArray, "channelObjects");
        mo49151f().mo44763p(jSONArray);
    }
}
