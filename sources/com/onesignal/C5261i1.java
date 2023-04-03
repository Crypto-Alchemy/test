package com.onesignal;

import com.onesignal.LocationController;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.i1 */
/* compiled from: UserState */
public abstract class C5261i1 {

    /* renamed from: d */
    public static final Object f26401d = new Object();

    /* renamed from: e */
    public static final String[] f26402e;

    /* renamed from: f */
    public static final Set<String> f26403f;

    /* renamed from: a */
    public String f26404a;

    /* renamed from: b */
    public JSONObject f26405b;

    /* renamed from: c */
    public JSONObject f26406c;

    static {
        String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        f26402e = strArr;
        f26403f = new HashSet(Arrays.asList(strArr));
    }

    public C5261i1(String str, boolean z) {
        this.f26404a = str;
        if (z) {
            mo38897n();
            return;
        }
        this.f26405b = new JSONObject();
        this.f26406c = new JSONObject();
    }

    /* renamed from: e */
    public static JSONObject m40945e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject b;
        synchronized (f26401d) {
            b = vz2.m53658b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return b;
    }

    /* renamed from: a */
    public abstract void mo38885a();

    /* renamed from: b */
    public void mo38886b() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", (Object) null);
            hashMap.put("long", (Object) null);
            hashMap.put("loc_acc", (Object) null);
            hashMap.put("loc_type", (Object) null);
            hashMap.put("loc_bg", (Object) null);
            hashMap.put("loc_time_stamp", (Object) null);
            mo38905u(this.f26406c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", (Object) null);
            hashMap2.put("loc_time_stamp", (Object) null);
            mo38905u(this.f26405b, hashMap2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public C5261i1 mo38887c(String str) {
        C5261i1 p = mo38899p(str);
        try {
            p.f26405b = mo38893j();
            p.f26406c = mo38896m();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return p;
    }

    /* renamed from: d */
    public JSONObject mo38888d(C5261i1 i1Var, boolean z) {
        mo38885a();
        i1Var.mo38885a();
        JSONObject e = m40945e(this.f26406c, i1Var.f26406c, (JSONObject) null, mo38894k(i1Var));
        if (!z && e.toString().equals("{}")) {
            return null;
        }
        try {
            if (!e.has("app_id")) {
                e.put("app_id", this.f26406c.optString("app_id"));
            }
            if (this.f26406c.has("email_auth_hash")) {
                e.put("email_auth_hash", this.f26406c.optString("email_auth_hash"));
            }
            if (this.f26406c.has("sms_auth_hash")) {
                e.put("sms_auth_hash", this.f26406c.optString("sms_auth_hash"));
            }
            if (this.f26406c.has("external_user_id_auth_hash") && !e.has("external_user_id_auth_hash")) {
                e.put("external_user_id_auth_hash", this.f26406c.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return e;
    }

    /* renamed from: f */
    public JSONObject mo38889f(C5261i1 i1Var, Set<String> set) {
        JSONObject b;
        synchronized (f26401d) {
            b = vz2.m53658b(this.f26405b, i1Var.f26405b, (JSONObject) null, set);
        }
        return b;
    }

    /* renamed from: g */
    public JSONObject mo38890g(JSONObject jSONObject, Set<String> set) {
        JSONObject b;
        synchronized (f26401d) {
            JSONObject jSONObject2 = this.f26405b;
            b = vz2.m53658b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return b;
    }

    /* renamed from: h */
    public JSONObject mo38891h(JSONObject jSONObject, Set<String> set) {
        JSONObject b;
        synchronized (f26401d) {
            JSONObject jSONObject2 = this.f26406c;
            b = vz2.m53658b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return b;
    }

    /* renamed from: i */
    public ls2 mo38892i() {
        try {
            return new ls2(mo38893j());
        } catch (JSONException e) {
            e.printStackTrace();
            return new ls2();
        }
    }

    /* renamed from: j */
    public JSONObject mo38893j() throws JSONException {
        JSONObject jSONObject;
        synchronized (f26401d) {
            jSONObject = new JSONObject(this.f26405b.toString());
        }
        return jSONObject;
    }

    /* renamed from: k */
    public final Set<String> mo38894k(C5261i1 i1Var) {
        try {
            if (this.f26405b.optLong("loc_time_stamp") == i1Var.f26405b.getLong("loc_time_stamp")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("loc_bg", i1Var.f26405b.opt("loc_bg"));
            hashMap.put("loc_time_stamp", i1Var.f26405b.opt("loc_time_stamp"));
            mo38905u(i1Var.f26406c, hashMap);
            return f26403f;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: l */
    public ls2 mo38895l() {
        try {
            return new ls2(mo38896m());
        } catch (JSONException e) {
            e.printStackTrace();
            return new ls2();
        }
    }

    /* renamed from: m */
    public JSONObject mo38896m() throws JSONException {
        JSONObject jSONObject;
        synchronized (f26401d) {
            jSONObject = new JSONObject(this.f26406c.toString());
        }
        return jSONObject;
    }

    /* renamed from: n */
    public final void mo38897n() {
        int i;
        boolean z;
        String str = C5342x0.f26571a;
        String f = C5342x0.m41395f(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f26404a, (String) null);
        if (f == null) {
            mo38908x(new JSONObject());
            try {
                int i2 = 1;
                if (this.f26404a.equals("CURRENT_STATE")) {
                    i = C5342x0.m41392c(str, "ONESIGNAL_SUBSCRIPTION", 1);
                } else {
                    i = C5342x0.m41392c(str, "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                }
                if (i == -2) {
                    z = false;
                } else {
                    i2 = i;
                    z = true;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("subscribableStatus", Integer.valueOf(i2));
                hashMap.put("userSubscribePref", Boolean.valueOf(z));
                mo38905u(this.f26405b, hashMap);
            } catch (JSONException unused) {
            }
        } else {
            try {
                mo38908x(new JSONObject(f));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        String str2 = C5342x0.f26571a;
        String f2 = C5342x0.m41395f(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f26404a, (String) null);
        JSONObject jSONObject = new JSONObject();
        if (f2 == null) {
            try {
                jSONObject.put("identifier", C5342x0.m41395f(str2, "GT_REGISTRATION_ID", (String) null));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            jSONObject = new JSONObject(f2);
        }
        mo38910z(jSONObject);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38898o(org.json.JSONObject r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.String r0 = "tags"
            boolean r0 = r6.has(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            org.json.JSONObject r0 = r5.mo38896m()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "tags"
            boolean r1 = r0.has(r1)     // Catch:{ JSONException -> 0x0085 }
            if (r1 == 0) goto L_0x0027
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = "tags"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ JSONException -> 0x0021 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x002c
        L_0x0021:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
            goto L_0x002c
        L_0x0027:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
        L_0x002c:
            java.lang.String r0 = "tags"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r0 = r6.keys()     // Catch:{ JSONException -> 0x0085 }
        L_0x0036:
            boolean r2 = r0.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r3 = ""
            java.lang.String r4 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            boolean r3 = r3.equals(r4)     // Catch:{ JSONException -> 0x0085 }
            if (r3 == 0) goto L_0x0052
            r1.remove(r2)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0052:
            if (r7 == 0) goto L_0x005a
            boolean r3 = r7.has(r2)     // Catch:{ JSONException -> 0x0085 }
            if (r3 != 0) goto L_0x0036
        L_0x005a:
            java.lang.String r3 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0062:
            java.lang.Object r6 = f26401d     // Catch:{ JSONException -> 0x0085 }
            monitor-enter(r6)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "{}"
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0079
            org.json.JSONObject r7 = r5.f26406c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.remove(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0079:
            org.json.JSONObject r7 = r5.f26406c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.put(r0, r1)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r7     // Catch:{ JSONException -> 0x0085 }
        L_0x0085:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5261i1.mo38898o(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* renamed from: p */
    public abstract C5261i1 mo38899p(String str);

    /* renamed from: q */
    public void mo38900q() {
        synchronized (f26401d) {
            try {
                if (this.f26406c.has("external_user_id_auth_hash") && ((this.f26406c.has("external_user_id") && this.f26406c.get("external_user_id").toString() == "") || !this.f26406c.has("external_user_id"))) {
                    this.f26406c.remove("external_user_id_auth_hash");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String str = C5342x0.f26571a;
            C5342x0.m41402m(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f26404a, this.f26406c.toString());
            C5342x0.m41402m(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f26404a, this.f26405b.toString());
        }
    }

    /* renamed from: r */
    public void mo38901r(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f26405b;
            m40945e(jSONObject3, jSONObject, jSONObject3, (Set<String>) null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f26406c;
            m40945e(jSONObject4, jSONObject2, jSONObject4, (Set<String>) null);
            mo38898o(jSONObject2, (JSONObject) null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            mo38900q();
        }
    }

    /* renamed from: s */
    public void mo38902s(String str, Object obj) throws JSONException {
        synchronized (f26401d) {
            this.f26405b.put(str, obj);
        }
    }

    /* renamed from: t */
    public void mo38903t(String str, Object obj) throws JSONException {
        synchronized (f26401d) {
            this.f26406c.put(str, obj);
        }
    }

    public String toString() {
        return "UserState{persistKey='" + this.f26404a + '\'' + ", dependValues=" + this.f26405b + ", syncValues=" + this.f26406c + '}';
    }

    /* renamed from: u */
    public final void mo38905u(JSONObject jSONObject, HashMap<String, Object> hashMap) throws JSONException {
        synchronized (f26401d) {
            for (Map.Entry next : hashMap.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: v */
    public void mo38906v(String str) {
        synchronized (f26401d) {
            this.f26405b.remove(str);
        }
    }

    /* renamed from: w */
    public void mo38907w(String str) {
        synchronized (f26401d) {
            this.f26406c.remove(str);
        }
    }

    /* renamed from: x */
    public void mo38908x(JSONObject jSONObject) {
        synchronized (f26401d) {
            this.f26405b = jSONObject;
        }
    }

    /* renamed from: y */
    public void mo38909y(LocationController.C5105d dVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", dVar.f25892a);
            hashMap.put("long", dVar.f25893b);
            hashMap.put("loc_acc", dVar.f25894c);
            hashMap.put("loc_type", dVar.f25895d);
            mo38905u(this.f26406c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", dVar.f25896e);
            hashMap2.put("loc_time_stamp", dVar.f25897f);
            mo38905u(this.f26405b, hashMap2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: z */
    public void mo38910z(JSONObject jSONObject) {
        synchronized (f26401d) {
            this.f26406c = jSONObject;
        }
    }
}
