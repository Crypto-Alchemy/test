package p000;

import com.onesignal.C5183a0;
import com.onesignal.OSTrigger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bd4 */
/* compiled from: OSInAppMessageInternal */
public class bd4 extends zc4 {

    /* renamed from: b */
    public HashMap<String, HashMap<String, String>> f21246b;

    /* renamed from: c */
    public ArrayList<ArrayList<OSTrigger>> f21247c;

    /* renamed from: d */
    public Set<String> f21248d;

    /* renamed from: e */
    public C5183a0 f21249e;

    /* renamed from: f */
    public double f21250f;

    /* renamed from: g */
    public boolean f21251g;

    /* renamed from: h */
    public boolean f21252h;

    /* renamed from: i */
    public boolean f21253i;

    /* renamed from: j */
    public Date f21254j;

    /* renamed from: k */
    public boolean f21255k;

    /* renamed from: l */
    public boolean f21256l;

    public bd4(boolean z) {
        super("");
        this.f21249e = new C5183a0();
        this.f21251g = false;
        this.f21252h = false;
        this.f21255k = z;
    }

    /* renamed from: a */
    public void mo29532a(String str) {
        this.f21248d.add(str);
    }

    /* renamed from: b */
    public void mo29533b() {
        this.f21248d.clear();
    }

    /* renamed from: c */
    public Set<String> mo29534c() {
        return this.f21248d;
    }

    /* renamed from: d */
    public boolean mo29535d() {
        return this.f21256l;
    }

    /* renamed from: e */
    public C5183a0 mo29536e() {
        return this.f21249e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f36112a.equals(((bd4) obj).f36112a);
    }

    /* renamed from: f */
    public boolean mo29538f(String str) {
        return !this.f21248d.contains(str);
    }

    /* renamed from: g */
    public boolean mo29539g() {
        return this.f21251g;
    }

    /* renamed from: h */
    public boolean mo29540h() {
        if (this.f21254j == null) {
            return false;
        }
        return this.f21254j.before(new Date());
    }

    public int hashCode() {
        return this.f36112a.hashCode();
    }

    /* renamed from: i */
    public boolean mo29542i() {
        return this.f21252h;
    }

    /* renamed from: j */
    public final Date mo29543j(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("end_time");
            if (string.equals("null")) {
                return null;
            }
            try {
                return fi4.m44317a().parse(string);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public ArrayList<ArrayList<OSTrigger>> mo29544k(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<OSTrigger>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new OSTrigger(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: l */
    public final HashMap<String, HashMap<String, String>> mo29545l(JSONObject jSONObject) throws JSONException {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject2.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    /* renamed from: m */
    public void mo29546m(String str) {
        this.f21248d.remove(str);
    }

    /* renamed from: n */
    public void mo29547n(double d) {
        this.f21250f = d;
    }

    /* renamed from: o */
    public void mo29548o(boolean z) {
        this.f21251g = z;
    }

    /* renamed from: p */
    public void mo29549p(boolean z) {
        this.f21252h = z;
    }

    /* renamed from: q */
    public boolean mo29550q() {
        if (this.f21253i) {
            return false;
        }
        this.f21253i = true;
        return true;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + this.f36112a + '\'' + ", variants=" + this.f21246b + ", triggers=" + this.f21247c + ", clickedClickIds=" + this.f21248d + ", redisplayStats=" + this.f21249e + ", displayDuration=" + this.f21250f + ", displayedInSession=" + this.f21251g + ", triggerChanged=" + this.f21252h + ", actionTaken=" + this.f21253i + ", isPreview=" + this.f21255k + ", endTime=" + this.f21254j + ", hasLiquid=" + this.f21256l + '}';
    }

    public bd4(String str, Set<String> set, boolean z, C5183a0 a0Var) {
        super(str);
        new C5183a0();
        this.f21252h = false;
        this.f21248d = set;
        this.f21251g = z;
        this.f21249e = a0Var;
    }

    public bd4(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString("id"));
        this.f21249e = new C5183a0();
        this.f21251g = false;
        this.f21252h = false;
        this.f21246b = mo29545l(jSONObject.getJSONObject("variants"));
        this.f21247c = mo29544k(jSONObject.getJSONArray("triggers"));
        this.f21248d = new HashSet();
        this.f21254j = mo29543j(jSONObject);
        if (jSONObject.has("has_liquid")) {
            this.f21256l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            this.f21249e = new C5183a0(jSONObject.getJSONObject("redisplay"));
        }
    }
}
