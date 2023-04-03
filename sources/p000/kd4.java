package p000;

import com.onesignal.C5346y0;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b4\u00105J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010)\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010+\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00103\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b2\u0010.¨\u00066"}, mo44877d2 = {"Lkd4;", "", "Lcom/onesignal/influence/domain/OSInfluenceType;", "influenceType", "Lr37;", "b", "a", "", "id", "c", "Lorg/json/JSONArray;", "notifications", "r", "iams", "p", "Lcom/onesignal/y0$e;", "influenceParams", "q", "Lje4;", "Lje4;", "preferences", "j", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "notificationCachedInfluenceType", "e", "iamCachedInfluenceType", "d", "()Ljava/lang/String;", "cachedNotificationOpenId", "i", "()Lorg/json/JSONArray;", "lastNotificationsReceivedData", "h", "lastIAMsReceivedData", "", "l", "()I", "notificationLimit", "g", "iamLimit", "k", "notificationIndirectAttributionWindow", "f", "iamIndirectAttributionWindow", "", "m", "()Z", "isDirectInfluenceEnabled", "n", "isIndirectInfluenceEnabled", "o", "isUnattributedInfluenceEnabled", "<init>", "(Lje4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: kd4 */
/* compiled from: OSInfluenceDataRepository.kt */
public final class kd4 {

    /* renamed from: a */
    public final je4 f30851a;

    public kd4(je4 je4) {
        vx2.m53591g(je4, "preferences");
        this.f30851a = je4;
    }

    /* renamed from: a */
    public final void mo44748a(OSInfluenceType oSInfluenceType) {
        vx2.m53591g(oSInfluenceType, "influenceType");
        je4 je4 = this.f30851a;
        je4.mo44441f(je4.mo44444i(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", oSInfluenceType.toString());
    }

    /* renamed from: b */
    public final void mo44749b(OSInfluenceType oSInfluenceType) {
        vx2.m53591g(oSInfluenceType, "influenceType");
        je4 je4 = this.f30851a;
        je4.mo44441f(je4.mo44444i(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", oSInfluenceType.toString());
    }

    /* renamed from: c */
    public final void mo44750c(String str) {
        je4 je4 = this.f30851a;
        je4.mo44441f(je4.mo44444i(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str);
    }

    /* renamed from: d */
    public final String mo44751d() {
        je4 je4 = this.f30851a;
        return je4.mo44439d(je4.mo44444i(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", (String) null);
    }

    /* renamed from: e */
    public final OSInfluenceType mo44752e() {
        String obj = OSInfluenceType.UNATTRIBUTED.toString();
        je4 je4 = this.f30851a;
        return OSInfluenceType.Companion.mo38919a(je4.mo44439d(je4.mo44444i(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", obj));
    }

    /* renamed from: f */
    public final int mo44753f() {
        je4 je4 = this.f30851a;
        return je4.mo44443h(je4.mo44444i(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    /* renamed from: g */
    public final int mo44754g() {
        je4 je4 = this.f30851a;
        return je4.mo44443h(je4.mo44444i(), "PREFS_OS_IAM_LIMIT", 10);
    }

    /* renamed from: h */
    public final JSONArray mo44755h() throws JSONException {
        JSONArray jSONArray;
        je4 je4 = this.f30851a;
        String d = je4.mo44439d(je4.mo44444i(), "PREFS_OS_LAST_IAMS_RECEIVED", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        if (d == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    /* renamed from: i */
    public final JSONArray mo44756i() throws JSONException {
        JSONArray jSONArray;
        je4 je4 = this.f30851a;
        String d = je4.mo44439d(je4.mo44444i(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        if (d == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    /* renamed from: j */
    public final OSInfluenceType mo44757j() {
        je4 je4 = this.f30851a;
        return OSInfluenceType.Companion.mo38919a(je4.mo44439d(je4.mo44444i(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", OSInfluenceType.UNATTRIBUTED.toString()));
    }

    /* renamed from: k */
    public final int mo44758k() {
        je4 je4 = this.f30851a;
        return je4.mo44443h(je4.mo44444i(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    /* renamed from: l */
    public final int mo44759l() {
        je4 je4 = this.f30851a;
        return je4.mo44443h(je4.mo44444i(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    /* renamed from: m */
    public final boolean mo44760m() {
        je4 je4 = this.f30851a;
        return je4.mo44442g(je4.mo44444i(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    /* renamed from: n */
    public final boolean mo44761n() {
        je4 je4 = this.f30851a;
        return je4.mo44442g(je4.mo44444i(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    /* renamed from: o */
    public final boolean mo44762o() {
        je4 je4 = this.f30851a;
        return je4.mo44442g(je4.mo44444i(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    /* renamed from: p */
    public final void mo44763p(JSONArray jSONArray) {
        vx2.m53591g(jSONArray, "iams");
        je4 je4 = this.f30851a;
        je4.mo44441f(je4.mo44444i(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    /* renamed from: q */
    public final void mo44764q(C5346y0.C5352e eVar) {
        vx2.m53591g(eVar, "influenceParams");
        je4 je4 = this.f30851a;
        je4.mo44437b(je4.mo44444i(), "PREFS_OS_DIRECT_ENABLED", eVar.mo39173e());
        je4 je42 = this.f30851a;
        je42.mo44437b(je42.mo44444i(), "PREFS_OS_INDIRECT_ENABLED", eVar.mo39174f());
        je4 je43 = this.f30851a;
        je43.mo44437b(je43.mo44444i(), "PREFS_OS_UNATTRIBUTED_ENABLED", eVar.mo39175g());
        je4 je44 = this.f30851a;
        je44.mo44436a(je44.mo44444i(), "PREFS_OS_NOTIFICATION_LIMIT", eVar.mo39172d());
        je4 je45 = this.f30851a;
        je45.mo44436a(je45.mo44444i(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", eVar.mo39171c());
        je4 je46 = this.f30851a;
        je46.mo44436a(je46.mo44444i(), "PREFS_OS_IAM_LIMIT", eVar.mo39169a());
        je4 je47 = this.f30851a;
        je47.mo44436a(je47.mo44444i(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", eVar.mo39170b());
    }

    /* renamed from: r */
    public final void mo44765r(JSONArray jSONArray) {
        vx2.m53591g(jSONArray, "notifications");
        je4 je4 = this.f30851a;
        je4.mo44441f(je4.mo44444i(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}
