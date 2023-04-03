package p000;

import com.github.mikephil.charting.utils.Utils;
import com.onesignal.influence.domain.OSInfluenceType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qd4 */
/* compiled from: OSOutcomeEvent */
public class qd4 {

    /* renamed from: a */
    public OSInfluenceType f33060a;

    /* renamed from: b */
    public JSONArray f33061b;

    /* renamed from: c */
    public String f33062c;

    /* renamed from: d */
    public long f33063d;

    /* renamed from: e */
    public Float f33064e;

    public qd4(OSInfluenceType oSInfluenceType, JSONArray jSONArray, String str, long j, float f) {
        this.f33060a = oSInfluenceType;
        this.f33061b = jSONArray;
        this.f33062c = str;
        this.f33063d = j;
        this.f33064e = Float.valueOf(f);
    }

    /* renamed from: a */
    public static qd4 m50522a(rd4 rd4) {
        JSONArray jSONArray;
        OSInfluenceType oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
        if (rd4.mo47383b() != null) {
            de4 b = rd4.mo47383b();
            if (b.mo41912a() != null && b.mo41912a().mo42304b() != null && b.mo41912a().mo42304b().length() > 0) {
                oSInfluenceType = OSInfluenceType.DIRECT;
                jSONArray = b.mo41912a().mo42304b();
                return new qd4(oSInfluenceType, jSONArray, rd4.mo47382a(), rd4.mo47384c(), rd4.mo47385d());
            } else if (!(b.mo41913b() == null || b.mo41913b().mo42304b() == null || b.mo41913b().mo42304b().length() <= 0)) {
                oSInfluenceType = OSInfluenceType.INDIRECT;
                jSONArray = b.mo41913b().mo42304b();
                return new qd4(oSInfluenceType, jSONArray, rd4.mo47382a(), rd4.mo47384c(), rd4.mo47385d());
            }
        }
        jSONArray = null;
        return new qd4(oSInfluenceType, jSONArray, rd4.mo47382a(), rd4.mo47384c(), rd4.mo47385d());
    }

    /* renamed from: b */
    public OSInfluenceType mo47066b() {
        return this.f33060a;
    }

    /* renamed from: c */
    public JSONObject mo47067c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f33061b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.f33061b);
        }
        jSONObject.put("id", this.f33062c);
        if (this.f33064e.floatValue() > Utils.FLOAT_EPSILON) {
            jSONObject.put("weight", this.f33064e);
        }
        long j = this.f33063d;
        if (j > 0) {
            jSONObject.put("timestamp", j);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qd4 qd4 = (qd4) obj;
        if (!this.f33060a.equals(qd4.f33060a) || !this.f33061b.equals(qd4.f33061b) || !this.f33062c.equals(qd4.f33062c) || this.f33063d != qd4.f33063d || !this.f33064e.equals(qd4.f33064e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 1;
        Object[] objArr = {this.f33060a, this.f33061b, this.f33062c, Long.valueOf(this.f33063d), this.f33064e};
        for (int i3 = 0; i3 < 5; i3++) {
            Object obj = objArr[i3];
            int i4 = i2 * 31;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i2 = i4 + i;
        }
        return i2;
    }

    public String toString() {
        return "OutcomeEvent{session=" + this.f33060a + ", notificationIds=" + this.f33061b + ", name='" + this.f33062c + '\'' + ", timestamp=" + this.f33063d + ", weight=" + this.f33064e + '}';
    }
}
