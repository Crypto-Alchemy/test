package p000;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0014"}, mo44877d2 = {"Lbe4;", "Lxd4;", "", "appId", "", "deviceType", "Lrd4;", "event", "Lai4;", "responseHandler", "Lr37;", "f", "Lld4;", "logger", "Ltd4;", "outcomeEventsCache", "Lej4;", "outcomeEventsService", "<init>", "(Lld4;Ltd4;Lej4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: be4 */
/* compiled from: OSOutcomeEventsV2Repository.kt */
public final class be4 extends xd4 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public be4(ld4 ld4, td4 td4, ej4 ej4) {
        super(ld4, td4, ej4);
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(td4, "outcomeEventsCache");
        vx2.m53591g(ej4, "outcomeEventsService");
    }

    /* renamed from: f */
    public void mo29560f(String str, int i, rd4 rd4, ai4 ai4) {
        vx2.m53591g(str, "appId");
        vx2.m53591g(rd4, "event");
        vx2.m53591g(ai4, "responseHandler");
        try {
            JSONObject put = rd4.mo47388g().put("app_id", str).put("device_type", i);
            ej4 k = mo49472k();
            vx2.m53590f(put, "jsonObject");
            k.mo28931a(put, ai4);
        } catch (JSONException e) {
            mo49471j().error("Generating indirect outcome:JSON Failed.", e);
        }
    }
}
