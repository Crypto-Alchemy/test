package p000;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006("}, mo44877d2 = {"Lpd4;", "Lwc4;", "", "id", "Lorg/json/JSONArray;", "m", "channelObjects", "Lr37;", "u", "p", "Lorg/json/JSONObject;", "jsonObject", "Lid4;", "influence", "a", "b", "l", "()Lorg/json/JSONArray;", "lastChannelObjects", "h", "()Ljava/lang/String;", "idTag", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "d", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "channelType", "", "c", "()I", "channelLimit", "i", "indirectAttributionWindow", "Lkd4;", "dataRepository", "Lld4;", "logger", "Lne4;", "timeProvider", "<init>", "(Lkd4;Lld4;Lne4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: pd4 */
/* compiled from: OSNotificationTracker.kt */
public final class pd4 extends wc4 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pd4(kd4 kd4, ld4 ld4, ne4 ne4) {
        super(kd4, ld4, ne4);
        vx2.m53591g(kd4, "dataRepository");
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(ne4, "timeProvider");
    }

    /* renamed from: a */
    public void mo43152a(JSONObject jSONObject, id4 id4) {
        vx2.m53591g(jSONObject, "jsonObject");
        vx2.m53591g(id4, "influence");
        if (id4.mo43566d().isAttributed()) {
            try {
                jSONObject.put("direct", id4.mo43566d().isDirect());
                jSONObject.put("notification_ids", id4.mo43564b());
            } catch (JSONException e) {
                mo49157o().error("Generating notification tracker addSessionData JSONObject ", e);
            }
        }
    }

    /* renamed from: b */
    public void mo43153b() {
        kd4 f = mo49151f();
        OSInfluenceType k = mo49155k();
        if (k == null) {
            k = OSInfluenceType.UNATTRIBUTED;
        }
        f.mo44749b(k);
        mo49151f().mo44750c(mo49152g());
    }

    /* renamed from: c */
    public int mo43154c() {
        return mo49151f().mo44759l();
    }

    /* renamed from: d */
    public OSInfluenceChannel mo43155d() {
        return OSInfluenceChannel.NOTIFICATION;
    }

    /* renamed from: h */
    public String mo43156h() {
        return "notification_id";
    }

    /* renamed from: i */
    public int mo43157i() {
        return mo49151f().mo44758k();
    }

    /* renamed from: l */
    public JSONArray mo43158l() throws JSONException {
        return mo49151f().mo44756i();
    }

    /* renamed from: m */
    public JSONArray mo43159m(String str) {
        try {
            return mo43158l();
        } catch (JSONException e) {
            mo49157o().error("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    /* renamed from: p */
    public void mo43160p() {
        OSInfluenceType j = mo49151f().mo44757j();
        if (j.isIndirect()) {
            mo49165x(mo49156n());
        } else if (j.isDirect()) {
            mo49164w(mo49151f().mo44751d());
        }
        r37 r37 = r37.f33317a;
        mo49166y(j);
        ld4 o = mo49157o();
        o.debug("OneSignal NotificationTracker initInfluencedTypeFromCache: " + this);
    }

    /* renamed from: u */
    public void mo43161u(JSONArray jSONArray) {
        vx2.m53591g(jSONArray, "channelObjects");
        mo49151f().mo44765r(jSONArray);
    }
}
