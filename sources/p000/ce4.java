package p000;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, mo44877d2 = {"Lce4;", "Lud4;", "Lorg/json/JSONObject;", "jsonObject", "Lai4;", "responseHandler", "Lr37;", "a", "Lyh4;", "client", "<init>", "(Lyh4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: ce4 */
/* compiled from: OSOutcomeEventsV2Service.kt */
public final class ce4 extends ud4 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ce4(yh4 yh4) {
        super(yh4);
        vx2.m53591g(yh4, "client");
    }

    /* renamed from: a */
    public void mo28931a(JSONObject jSONObject, ai4 ai4) {
        vx2.m53591g(jSONObject, "jsonObject");
        vx2.m53591g(ai4, "responseHandler");
        mo48386b().mo38680a("outcomes/measure_sources", jSONObject, ai4);
    }
}
