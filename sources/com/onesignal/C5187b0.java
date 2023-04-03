package com.onesignal;

import android.content.ContentValues;
import com.onesignal.C5355z0;
import com.onesignal.OneSignal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.b0 */
/* compiled from: OSInAppMessageRepository */
public class C5187b0 {

    /* renamed from: a */
    public final C5340w0 f26162a;

    /* renamed from: b */
    public final ld4 f26163b;

    /* renamed from: c */
    public final je4 f26164c;

    /* renamed from: d */
    public int f26165d = 0;

    /* renamed from: com.onesignal.b0$a */
    /* compiled from: OSInAppMessageRepository */
    public class C5188a extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f26166a;

        /* renamed from: b */
        public final /* synthetic */ int f26167b;

        /* renamed from: c */
        public final /* synthetic */ String f26168c;

        /* renamed from: d */
        public final /* synthetic */ String f26169d;

        /* renamed from: e */
        public final /* synthetic */ String f26170e;

        /* renamed from: f */
        public final /* synthetic */ boolean f26171f;

        public C5188a(String str, int i, String str2, String str3, String str4, boolean z) throws JSONException {
            this.f26166a = str;
            this.f26167b = i;
            this.f26168c = str2;
            this.f26169d = str3;
            this.f26170e = str4;
            this.f26171f = z;
            put("app_id", str);
            put("device_type", i);
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z) {
                put("first_click", true);
            }
        }
    }

    /* renamed from: com.onesignal.b0$b */
    /* compiled from: OSInAppMessageRepository */
    public class C5189b extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ Set f26173a;

        /* renamed from: b */
        public final /* synthetic */ C5196i f26174b;

        public C5189b(Set set, C5196i iVar) {
            this.f26173a = set;
            this.f26174b = iVar;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            C5187b0.this.mo38700u("engagement", i, str);
            this.f26174b.mo38523b(str);
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            C5187b0.this.mo38701v("engagement", str);
            C5187b0.this.mo38702w(this.f26173a);
        }
    }

    /* renamed from: com.onesignal.b0$c */
    /* compiled from: OSInAppMessageRepository */
    public class C5190c extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f26176a;

        /* renamed from: b */
        public final /* synthetic */ String f26177b;

        /* renamed from: c */
        public final /* synthetic */ String f26178c;

        /* renamed from: d */
        public final /* synthetic */ int f26179d;

        /* renamed from: e */
        public final /* synthetic */ String f26180e;

        public C5190c(String str, String str2, String str3, int i, String str4) throws JSONException {
            this.f26176a = str;
            this.f26177b = str2;
            this.f26178c = str3;
            this.f26179d = i;
            this.f26180e = str4;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i);
            put("page_id", str4);
        }
    }

    /* renamed from: com.onesignal.b0$d */
    /* compiled from: OSInAppMessageRepository */
    public class C5191d extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ Set f26182a;

        /* renamed from: b */
        public final /* synthetic */ C5196i f26183b;

        public C5191d(Set set, C5196i iVar) {
            this.f26182a = set;
            this.f26183b = iVar;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            C5187b0.this.mo38700u("page impression", i, str);
            this.f26183b.mo38523b(str);
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            C5187b0.this.mo38701v("page impression", str);
            C5187b0.this.mo38683C(this.f26182a);
        }
    }

    /* renamed from: com.onesignal.b0$e */
    /* compiled from: OSInAppMessageRepository */
    public class C5192e extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f26185a;

        /* renamed from: b */
        public final /* synthetic */ String f26186b;

        /* renamed from: c */
        public final /* synthetic */ String f26187c;

        /* renamed from: d */
        public final /* synthetic */ int f26188d;

        public C5192e(String str, String str2, String str3, int i) throws JSONException {
            this.f26185a = str;
            this.f26186b = str2;
            this.f26187c = str3;
            this.f26188d = i;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i);
            put("first_impression", true);
        }
    }

    /* renamed from: com.onesignal.b0$f */
    /* compiled from: OSInAppMessageRepository */
    public class C5193f extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ Set f26190a;

        /* renamed from: b */
        public final /* synthetic */ C5196i f26191b;

        public C5193f(Set set, C5196i iVar) {
            this.f26190a = set;
            this.f26191b = iVar;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            C5187b0.this.mo38700u("impression", i, str);
            this.f26191b.mo38523b(str);
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            C5187b0.this.mo38701v("impression", str);
            C5187b0.this.mo38705z(this.f26190a);
        }
    }

    /* renamed from: com.onesignal.b0$g */
    /* compiled from: OSInAppMessageRepository */
    public class C5194g extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ C5196i f26193a;

        public C5194g(C5196i iVar) {
            this.f26193a = iVar;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            C5187b0.this.mo38700u("html", i, str);
            this.f26193a.mo38523b(str);
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            this.f26193a.mo38522a(str);
        }
    }

    /* renamed from: com.onesignal.b0$h */
    /* compiled from: OSInAppMessageRepository */
    public class C5195h extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ C5196i f26195a;

        public C5195h(C5196i iVar) {
            this.f26195a = iVar;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            C5187b0.this.mo38700u("html", i, str);
            JSONObject jSONObject = new JSONObject();
            if (!OSUtils.m40272U(i) || C5187b0.this.f26165d >= OSUtils.f25992a) {
                int unused = C5187b0.this.f26165d = 0;
                try {
                    jSONObject.put("retry", false);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                C5187b0.m40605g(C5187b0.this);
                try {
                    jSONObject.put("retry", true);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            this.f26195a.mo38523b(jSONObject.toString());
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            int unused = C5187b0.this.f26165d = 0;
            this.f26195a.mo38522a(str);
        }
    }

    /* renamed from: com.onesignal.b0$i */
    /* compiled from: OSInAppMessageRepository */
    public interface C5196i {
        /* renamed from: a */
        void mo38522a(String str);

        /* renamed from: b */
        void mo38523b(String str);
    }

    public C5187b0(C5340w0 w0Var, ld4 ld4, je4 je4) {
        this.f26162a = w0Var;
        this.f26163b = ld4;
        this.f26164c = je4;
    }

    /* renamed from: g */
    public static /* synthetic */ int m40605g(C5187b0 b0Var) {
        int i = b0Var.f26165d;
        b0Var.f26165d = i + 1;
        return i;
    }

    /* renamed from: A */
    public synchronized void mo38681A(bd4 bd4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", bd4.f36112a);
        contentValues.put("display_quantity", Integer.valueOf(bd4.mo29536e().mo38670a()));
        contentValues.put("last_display", Long.valueOf(bd4.mo29536e().mo38671b()));
        contentValues.put("click_ids", bd4.mo29534c().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(bd4.mo29539g()));
        if (this.f26162a.mo39144a("in_app_message", contentValues, "message_id = ?", new String[]{bd4.f36112a}) == 0) {
            this.f26162a.mo39148e("in_app_message", (String) null, contentValues);
        }
    }

    /* renamed from: B */
    public void mo38682B(Date date) {
        String str;
        if (date != null) {
            str = date.toString();
        } else {
            str = null;
        }
        this.f26164c.mo44441f(C5342x0.f26571a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", str);
    }

    /* renamed from: C */
    public void mo38683C(Set<String> set) {
        this.f26164c.mo44440e(C5342x0.f26571a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }

    /* renamed from: D */
    public void mo38684D(String str, String str2, String str3, int i, String str4, String str5, boolean z, Set<String> set, C5196i iVar) {
        try {
            C5188a aVar = new C5188a(str, i, str2, str5, str3, z);
            StringBuilder sb = new StringBuilder();
            sb.append("in_app_messages/");
            String str6 = str4;
            sb.append(str4);
            sb.append("/click");
            C5355z0.m41445j(sb.toString(), aVar, new C5189b(set, iVar));
        } catch (JSONException e) {
            e.printStackTrace();
            this.f26163b.error("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    /* renamed from: E */
    public void mo38685E(String str, String str2, String str3, int i, String str4, Set<String> set, C5196i iVar) {
        try {
            C5192e eVar = new C5192e(str, str2, str3, i);
            C5355z0.m41445j("in_app_messages/" + str4 + "/impression", eVar, new C5193f(set, iVar));
        } catch (JSONException e) {
            e.printStackTrace();
            this.f26163b.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* renamed from: F */
    public void mo38686F(String str, String str2, String str3, int i, String str4, String str5, Set<String> set, C5196i iVar) {
        try {
            C5190c cVar = new C5190c(str, str2, str3, i, str5);
            StringBuilder sb = new StringBuilder();
            sb.append("in_app_messages/");
            String str6 = str4;
            sb.append(str4);
            sb.append("/pageImpression");
            C5355z0.m41445j(sb.toString(), cVar, new C5191d(set, iVar));
        } catch (JSONException e) {
            e.printStackTrace();
            this.f26163b.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r12.isClosed() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo38687h() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "message_id"
            java.lang.String r1 = "click_ids"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "last_display < ?"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b6 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            r5 = 15552000(0xed4e00, double:7.683709E-317)
            long r1 = r1 - r5
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00b6 }
            r2 = 1
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x00b6 }
            r2 = 0
            r10[r2] = r1     // Catch:{ all -> 0x00b6 }
            java.util.Set r1 = com.onesignal.OSUtils.m40262K()     // Catch:{ all -> 0x00b6 }
            java.util.Set r11 = com.onesignal.OSUtils.m40262K()     // Catch:{ all -> 0x00b6 }
            r12 = 0
            com.onesignal.w0 r2 = r13.f26162a     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "in_app_message"
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r0
            r6 = r10
            android.database.Cursor r12 = r2.mo39146c(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x008e }
            if (r12 == 0) goto L_0x0078
            int r2 = r12.getCount()     // Catch:{ JSONException -> 0x008e }
            if (r2 != 0) goto L_0x003f
            goto L_0x0078
        L_0x003f:
            boolean r2 = r12.moveToFirst()     // Catch:{ JSONException -> 0x008e }
            if (r2 == 0) goto L_0x006e
        L_0x0045:
            java.lang.String r2 = "message_id"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "click_ids"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ JSONException -> 0x008e }
            r1.add(r2)     // Catch:{ JSONException -> 0x008e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008e }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x008e }
            java.util.Set r2 = com.onesignal.OSUtils.m40263L(r2)     // Catch:{ JSONException -> 0x008e }
            r11.addAll(r2)     // Catch:{ JSONException -> 0x008e }
            boolean r2 = r12.moveToNext()     // Catch:{ JSONException -> 0x008e }
            if (r2 != 0) goto L_0x0045
        L_0x006e:
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x009b
        L_0x0074:
            r12.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x009b
        L_0x0078:
            com.onesignal.OneSignal$LOG_LEVEL r2 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "Attempted to clean 6 month old IAM data, but none exists!"
            com.onesignal.OneSignal.m40387d1(r2, r3)     // Catch:{ JSONException -> 0x008e }
            if (r12 == 0) goto L_0x008a
            boolean r0 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r0 != 0) goto L_0x008a
            r12.close()     // Catch:{ all -> 0x00b6 }
        L_0x008a:
            monitor-exit(r13)
            return
        L_0x008c:
            r0 = move-exception
            goto L_0x00aa
        L_0x008e:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x008c }
            if (r12 == 0) goto L_0x009b
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x009b
            goto L_0x0074
        L_0x009b:
            com.onesignal.w0 r2 = r13.f26162a     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "in_app_message"
            r2.mo39147d(r3, r0, r10)     // Catch:{ all -> 0x00b6 }
            r13.mo38689j(r1)     // Catch:{ all -> 0x00b6 }
            r13.mo38688i(r11)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r13)
            return
        L_0x00aa:
            if (r12 == 0) goto L_0x00b5
            boolean r1 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r1 != 0) goto L_0x00b5
            r12.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5187b0.mo38687h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = com.onesignal.C5342x0.f26571a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38688i(java.util.Set<java.lang.String> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x001f
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x001f
            java.lang.String r0 = com.onesignal.C5342x0.f26571a
            r1 = 0
            java.lang.String r2 = "PREFS_OS_CLICKED_CLICK_IDS_IAMS"
            java.util.Set r1 = com.onesignal.C5342x0.m41396g(r0, r2, r1)
            if (r1 == 0) goto L_0x001f
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x001f
            r1.removeAll(r5)
            com.onesignal.C5342x0.m41403n(r0, r2, r1)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5187b0.mo38688i(java.util.Set):void");
    }

    /* renamed from: j */
    public final void mo38689j(Set<String> set) {
        if (set != null && set.size() > 0) {
            String str = C5342x0.f26571a;
            Set<String> g = C5342x0.m41396g(str, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
            Set<String> g2 = C5342x0.m41396g(str, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
            if (g != null && g.size() > 0) {
                g.removeAll(set);
                C5342x0.m41403n(str, "PREFS_OS_DISPLAYED_IAMS", g);
            }
            if (g2 != null && g2.size() > 0) {
                g2.removeAll(set);
                C5342x0.m41403n(str, "PREFS_OS_IMPRESSIONED_IAMS", g2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        if (r1.isClosed() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1.isClosed() == false) goto L_0x0074;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<p000.bd4> mo38690k() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r0.<init>()     // Catch:{ all -> 0x0099 }
            r1 = 0
            com.onesignal.w0 r2 = r10.f26162a     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = "in_app_message"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.mo39146c(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x007a }
            boolean r2 = r1.moveToFirst()     // Catch:{ JSONException -> 0x007a }
            if (r2 == 0) goto L_0x006e
        L_0x001b:
            java.lang.String r2 = "message_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = "click_ids"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r4 = "display_quantity"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ JSONException -> 0x007a }
            int r4 = r1.getInt(r4)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r5 = "last_display"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ JSONException -> 0x007a }
            long r5 = r1.getLong(r5)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r7 = "displayed_in_session"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ JSONException -> 0x007a }
            int r7 = r1.getInt(r7)     // Catch:{ JSONException -> 0x007a }
            r8 = 1
            if (r7 != r8) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007a }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x007a }
            java.util.Set r3 = com.onesignal.OSUtils.m40263L(r7)     // Catch:{ JSONException -> 0x007a }
            bd4 r7 = new bd4     // Catch:{ JSONException -> 0x007a }
            com.onesignal.a0 r9 = new com.onesignal.a0     // Catch:{ JSONException -> 0x007a }
            r9.<init>(r4, r5)     // Catch:{ JSONException -> 0x007a }
            r7.<init>(r2, r3, r8, r9)     // Catch:{ JSONException -> 0x007a }
            r0.add(r7)     // Catch:{ JSONException -> 0x007a }
            boolean r2 = r1.moveToNext()     // Catch:{ JSONException -> 0x007a }
            if (r2 != 0) goto L_0x001b
        L_0x006e:
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x008b
        L_0x0074:
            r1.close()     // Catch:{ all -> 0x0099 }
            goto L_0x008b
        L_0x0078:
            r0 = move-exception
            goto L_0x008d
        L_0x007a:
            r2 = move-exception
            com.onesignal.OneSignal$LOG_LEVEL r3 = com.onesignal.OneSignal.LOG_LEVEL.ERROR     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "Generating JSONArray from iam click ids:JSON Failed."
            com.onesignal.OneSignal.m40379b(r3, r4, r2)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x008b
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x008b
            goto L_0x0074
        L_0x008b:
            monitor-exit(r10)
            return r0
        L_0x008d:
            if (r1 == 0) goto L_0x0098
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0099 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5187b0.mo38690k():java.util.List");
    }

    /* renamed from: l */
    public Set<String> mo38691l() {
        return this.f26164c.mo44438c(C5342x0.f26571a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set<String>) null);
    }

    /* renamed from: m */
    public Set<String> mo38692m() {
        return this.f26164c.mo44438c(C5342x0.f26571a, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
    }

    /* renamed from: n */
    public void mo38693n(String str, String str2, String str3, C5196i iVar) {
        C5355z0.m41440e(mo38699t(str2, str3, str), new C5195h(iVar), (String) null);
    }

    /* renamed from: o */
    public void mo38694o(String str, String str2, C5196i iVar) {
        C5355z0.m41440e("in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, new C5194g(iVar), (String) null);
    }

    /* renamed from: p */
    public Set<String> mo38695p() {
        return this.f26164c.mo44438c(C5342x0.f26571a, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
    }

    /* renamed from: q */
    public Date mo38696q() {
        String d = this.f26164c.mo44439d(C5342x0.f26571a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", (String) null);
        if (d == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(d);
        } catch (ParseException e) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.ERROR, e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: r */
    public String mo38697r() {
        return this.f26164c.mo44439d(C5342x0.f26571a, "PREFS_OS_CACHED_IAMS", (String) null);
    }

    /* renamed from: s */
    public Set<String> mo38698s() {
        return this.f26164c.mo44438c(C5342x0.f26571a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", (Set<String>) null);
    }

    /* renamed from: t */
    public final String mo38699t(String str, String str2, String str3) {
        if (str2 == null) {
            ld4 ld4 = this.f26163b;
            ld4.error("Unable to find a variant for in-app message " + str);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    /* renamed from: u */
    public final void mo38700u(String str, int i, String str2) {
        ld4 ld4 = this.f26163b;
        ld4.error("Encountered a " + i + " error while attempting in-app message " + str + " request: " + str2);
    }

    /* renamed from: v */
    public final void mo38701v(String str, String str2) {
        ld4 ld4 = this.f26163b;
        ld4.debug("Successful post for in-app message " + str + " request: " + str2);
    }

    /* renamed from: w */
    public final void mo38702w(Set<String> set) {
        this.f26164c.mo44440e(C5342x0.f26571a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    /* renamed from: x */
    public void mo38703x(Set<String> set) {
        this.f26164c.mo44440e(C5342x0.f26571a, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    /* renamed from: y */
    public void mo38704y(String str) {
        this.f26164c.mo44441f(C5342x0.f26571a, "PREFS_OS_CACHED_IAMS", str);
    }

    /* renamed from: z */
    public final void mo38705z(Set<String> set) {
        this.f26164c.mo44440e(C5342x0.f26571a, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }
}
