package com.onesignal;

import com.onesignal.C5296n1;
import com.onesignal.C5355z0;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignalStateSynchronizer {

    /* renamed from: a */
    public static final Object f26092a = new Object();

    /* renamed from: b */
    public static HashMap<UserStateSynchronizerType, C5296n1> f26093b = new HashMap<>();

    public enum UserStateSynchronizerType {
        PUSH,
        EMAIL,
        SMS;

        public boolean isEmail() {
            return equals(EMAIL);
        }

        public boolean isPush() {
            return equals(PUSH);
        }

        public boolean isSMS() {
            return equals(SMS);
        }
    }

    /* renamed from: com.onesignal.OneSignalStateSynchronizer$a */
    public interface C5161a {
        /* renamed from: a */
        void mo38599a(String str);

        /* renamed from: b */
        void mo38600b(C5162b bVar);
    }

    /* renamed from: com.onesignal.OneSignalStateSynchronizer$b */
    public static class C5162b {

        /* renamed from: a */
        public int f26095a;

        /* renamed from: b */
        public String f26096b;

        public C5162b(int i, String str) {
            this.f26095a = i;
            this.f26096b = str;
        }
    }

    /* renamed from: a */
    public static void m40476a() {
        m40479d().mo39020o();
        m40477b().mo39020o();
        m40481f().mo39020o();
    }

    /* renamed from: b */
    public static C5269j1 m40477b() {
        HashMap<UserStateSynchronizerType, C5296n1> hashMap = f26093b;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.EMAIL;
        if (!hashMap.containsKey(userStateSynchronizerType) || f26093b.get(userStateSynchronizerType) == null) {
            synchronized (f26092a) {
                if (f26093b.get(userStateSynchronizerType) == null) {
                    f26093b.put(userStateSynchronizerType, new C5269j1());
                }
            }
        }
        return (C5269j1) f26093b.get(userStateSynchronizerType);
    }

    /* renamed from: c */
    public static String m40478c() {
        return m40479d().mo38955g0();
    }

    /* renamed from: d */
    public static C5279k1 m40479d() {
        HashMap<UserStateSynchronizerType, C5296n1> hashMap = f26093b;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.PUSH;
        if (!hashMap.containsKey(userStateSynchronizerType) || f26093b.get(userStateSynchronizerType) == null) {
            synchronized (f26092a) {
                if (f26093b.get(userStateSynchronizerType) == null) {
                    f26093b.put(userStateSynchronizerType, new C5279k1());
                }
            }
        }
        return (C5279k1) f26093b.get(userStateSynchronizerType);
    }

    /* renamed from: e */
    public static String m40480e() {
        return m40479d().mo38997E();
    }

    /* renamed from: f */
    public static C5290l1 m40481f() {
        HashMap<UserStateSynchronizerType, C5296n1> hashMap = f26093b;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.SMS;
        if (!hashMap.containsKey(userStateSynchronizerType) || f26093b.get(userStateSynchronizerType) == null) {
            synchronized (f26092a) {
                if (f26093b.get(userStateSynchronizerType) == null) {
                    f26093b.put(userStateSynchronizerType, new C5290l1());
                }
            }
        }
        return (C5290l1) f26093b.get(userStateSynchronizerType);
    }

    /* renamed from: g */
    public static boolean m40482g() {
        if (m40479d().mo38998F() || m40477b().mo38998F() || m40481f().mo38998F()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static C5296n1.C5301e m40483h(boolean z) {
        return m40479d().mo38956h0(z);
    }

    /* renamed from: i */
    public static List<C5296n1> m40484i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m40479d());
        if (OneSignal.m40326H0()) {
            arrayList.add(m40477b());
        }
        if (OneSignal.m40329I0()) {
            arrayList.add(m40481f());
        }
        return arrayList;
    }

    /* renamed from: j */
    public static boolean m40485j() {
        return m40479d().mo38957i0();
    }

    /* renamed from: k */
    public static void m40486k() {
        m40479d().mo39003K();
        m40477b().mo39003K();
        m40481f().mo39003K();
    }

    /* renamed from: l */
    public static boolean m40487l() {
        boolean Q = m40479d().mo39007Q();
        boolean Q2 = m40477b().mo39007Q();
        boolean Q3 = m40481f().mo39007Q();
        if (Q2) {
            if (m40477b().mo38997E() != null) {
                Q2 = true;
            } else {
                Q2 = false;
            }
        }
        if (Q3) {
            if (m40481f().mo38997E() != null) {
                Q3 = true;
            } else {
                Q3 = false;
            }
        }
        if (Q || Q2 || Q3) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static void m40488m(boolean z) {
        m40479d().mo39008R(z);
        m40477b().mo39008R(z);
        m40481f().mo39008R(z);
    }

    /* renamed from: n */
    public static void m40489n() {
        m40477b().mo38993k0();
        m40481f().mo38993k0();
    }

    /* renamed from: o */
    public static void m40490o() {
        m40479d().mo39009S();
        m40477b().mo39009S();
        m40481f().mo39009S();
        m40479d().mo38958j0((String) null);
        m40477b().mo38939l0((String) null);
        m40481f().mo38984l0((String) null);
        OneSignal.m40315D1(-3660);
    }

    /* renamed from: p */
    public static void m40491p(JSONObject jSONObject, C5355z0.C5362g gVar) {
        for (C5296n1 V : m40484i()) {
            V.mo39011V(jSONObject, gVar);
        }
    }

    /* renamed from: q */
    public static void m40492q(JSONObject jSONObject, OneSignal.C5153s sVar) {
        try {
            JSONObject put = new JSONObject().put("tags", jSONObject);
            m40479d().mo39012W(put, sVar);
            m40477b().mo39012W(put, sVar);
            m40481f().mo39012W(put, sVar);
        } catch (JSONException e) {
            if (sVar != null) {
                sVar.mo38590b(new OneSignal.C5143i0(-1, "Encountered an error attempting to serialize your tags into JSON: " + e.getMessage() + "\n" + e.getStackTrace()));
            }
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public static void m40493r() {
        m40479d().mo39015Z();
        m40477b().mo39015Z();
        m40481f().mo39015Z();
    }

    /* renamed from: s */
    public static void m40494s() {
        m40477b().mo39015Z();
    }

    /* renamed from: t */
    public static void m40495t(boolean z) {
        m40479d().mo38959k0(z);
    }

    /* renamed from: u */
    public static void m40496u(boolean z) {
        m40479d().mo39017b0(z);
        m40477b().mo39017b0(z);
        m40481f().mo39017b0(z);
    }

    /* renamed from: v */
    public static void m40497v(JSONObject jSONObject, C5161a aVar) {
        m40479d().mo39018c0(jSONObject, aVar);
        m40477b().mo39018c0(jSONObject, aVar);
        m40481f().mo39018c0(jSONObject, aVar);
    }

    /* renamed from: w */
    public static void m40498w(LocationController.C5105d dVar) {
        m40479d().mo39019e0(dVar);
        m40477b().mo39019e0(dVar);
        m40481f().mo39019e0(dVar);
    }

    /* renamed from: x */
    public static void m40499x(JSONObject jSONObject) {
        m40479d().mo38960l0(jSONObject);
    }
}
