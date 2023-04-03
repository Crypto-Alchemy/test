package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.e */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class C4809e {

    /* renamed from: a */
    public final SharedPreferences f25452a;

    /* renamed from: b */
    public final Context f25453b;

    /* renamed from: com.google.firebase.messaging.e$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class C4810a {

        /* renamed from: d */
        public static final long f25454d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f25455a;

        /* renamed from: b */
        public final String f25456b;

        /* renamed from: c */
        public final long f25457c;

        public C4810a(String str, String str2, long j) {
            this.f25455a = str;
            this.f25456b = str2;
            this.f25457c = j;
        }

        /* renamed from: a */
        public static String m38693a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                return null;
            }
        }

        /* renamed from: c */
        public static C4810a m38694c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C4810a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C4810a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                return null;
            }
        }

        /* renamed from: b */
        public boolean mo36282b(String str) {
            if (System.currentTimeMillis() > this.f25457c + f25454d || !str.equals(this.f25456b)) {
                return true;
            }
            return false;
        }
    }

    public C4809e(Context context) {
        this.f25453b = context;
        this.f25452a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        mo36275a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    public final void mo36275a(String str) {
        File file = new File(zr0.m31445h(this.f25453b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo36280f()) {
                    mo36277c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Error creating file in no backup dir: ".concat(valueOf);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo36276b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    /* renamed from: c */
    public synchronized void mo36277c() {
        this.f25452a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void mo36278d(String str, String str2) {
        String b = mo36276b(str, str2);
        SharedPreferences.Editor edit = this.f25452a.edit();
        edit.remove(b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C4810a mo36279e(String str, String str2) {
        return C4810a.m38694c(this.f25452a.getString(mo36276b(str, str2), (String) null));
    }

    /* renamed from: f */
    public synchronized boolean mo36280f() {
        return this.f25452a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void mo36281g(String str, String str2, String str3, String str4) {
        String a = C4810a.m38693a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f25452a.edit();
            edit.putString(mo36276b(str, str2), a);
            edit.commit();
        }
    }
}
