package p000;

import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J(\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u0019"}, mo44877d2 = {"Lzd4;", "Lxd4;", "", "appId", "", "deviceType", "Lrd4;", "eventParams", "Lai4;", "responseHandler", "Lr37;", "f", "Lqd4;", "event", "l", "m", "n", "Lld4;", "logger", "Ltd4;", "outcomeEventsCache", "Lej4;", "outcomeEventsService", "<init>", "(Lld4;Ltd4;Lej4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: zd4 */
/* compiled from: OSOutcomeEventsV1Repository.kt */
public final class zd4 extends xd4 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zd4(ld4 ld4, td4 td4, ej4 ej4) {
        super(ld4, td4, ej4);
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(td4, "outcomeEventsCache");
        vx2.m53591g(ej4, "outcomeEventsService");
    }

    /* renamed from: f */
    public void mo29560f(String str, int i, rd4 rd4, ai4 ai4) {
        vx2.m53591g(str, "appId");
        vx2.m53591g(rd4, "eventParams");
        vx2.m53591g(ai4, "responseHandler");
        qd4 a = qd4.m50522a(rd4);
        vx2.m53590f(a, "event");
        OSInfluenceType b = a.mo47066b();
        if (b != null) {
            int i2 = yd4.f35851a[b.ordinal()];
            if (i2 == 1) {
                mo49821l(str, i, a, ai4);
            } else if (i2 == 2) {
                mo49822m(str, i, a, ai4);
            } else if (i2 == 3) {
                mo49823n(str, i, a, ai4);
            }
        }
    }

    /* renamed from: l */
    public final void mo49821l(String str, int i, qd4 qd4, ai4 ai4) {
        try {
            JSONObject put = qd4.mo47067c().put("app_id", str).put("device_type", i).put("direct", true);
            ej4 k = mo49472k();
            vx2.m53590f(put, "jsonObject");
            k.mo28931a(put, ai4);
        } catch (JSONException e) {
            mo49471j().error("Generating direct outcome:JSON Failed.", e);
        }
    }

    /* renamed from: m */
    public final void mo49822m(String str, int i, qd4 qd4, ai4 ai4) {
        try {
            JSONObject put = qd4.mo47067c().put("app_id", str).put("device_type", i).put("direct", false);
            ej4 k = mo49472k();
            vx2.m53590f(put, "jsonObject");
            k.mo28931a(put, ai4);
        } catch (JSONException e) {
            mo49471j().error("Generating indirect outcome:JSON Failed.", e);
        }
    }

    /* renamed from: n */
    public final void mo49823n(String str, int i, qd4 qd4, ai4 ai4) {
        try {
            JSONObject put = qd4.mo47067c().put("app_id", str).put("device_type", i);
            ej4 k = mo49472k();
            vx2.m53590f(put, "jsonObject");
            k.mo28931a(put, ai4);
        } catch (JSONException e) {
            mo49471j().error("Generating unattributed outcome:JSON Failed.", e);
        }
    }
}
