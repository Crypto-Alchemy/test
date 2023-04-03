package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.onesignal.OneSignal;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.f94;

/* renamed from: com.onesignal.e */
/* compiled from: GenerateNotification */
public class C5217e {

    /* renamed from: a */
    public static Class<?> f26291a = NotificationOpenedReceiver.class;

    /* renamed from: b */
    public static Class<?> f26292b = NotificationDismissReceiver.class;

    /* renamed from: c */
    public static Resources f26293c = null;

    /* renamed from: d */
    public static Context f26294d = null;

    /* renamed from: e */
    public static String f26295e = null;

    /* renamed from: f */
    public static Integer f26296f = null;

    /* renamed from: com.onesignal.e$b */
    /* compiled from: GenerateNotification */
    public static class C5219b {

        /* renamed from: a */
        public f94.C2277e f26297a;

        /* renamed from: b */
        public boolean f26298b;

        public C5219b() {
        }
    }

    /* renamed from: A */
    public static int m40770A(JSONObject jSONObject) {
        int z = m40808z(jSONObject.optString("sicon", (String) null));
        if (z != 0) {
            return z;
        }
        return m40803u();
    }

    /* renamed from: B */
    public static CharSequence m40771B(JSONObject jSONObject) {
        String optString = jSONObject.optString("title", (String) null);
        if (optString != null) {
            return optString;
        }
        return f26294d.getPackageManager().getApplicationLabel(f26294d.getApplicationInfo());
    }

    /* renamed from: C */
    public static void m40772C() {
        if (Build.VERSION.SDK_INT >= 24) {
            f26296f = 2;
        } else {
            f26296f = 1;
        }
    }

    /* renamed from: D */
    public static void m40773D() {
        if (OSUtils.m40259H()) {
            throw new OSThrowable$OSMainThreadException("Process for showing a notification should never been done on Main Thread!");
        }
    }

    /* renamed from: E */
    public static boolean m40774E(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", (String) null);
        if ("null".equals(optString) || "nil".equals(optString)) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public static void m40775F(f94.C2277e eVar) {
        eVar.mo19811x(true).mo19801n(0).mo19783B((Uri) null).mo19786E((long[]) null).mo19785D((CharSequence) null);
    }

    /* renamed from: G */
    public static Bitmap m40776G(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f26293c.getDimension(17104902);
            int dimension2 = (int) f26293c.getDimension(17104901);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (((float) dimension) * (((float) width) / ((float) height)));
            } else if (width > height) {
                dimension = (int) (((float) dimension2) * (((float) height) / ((float) width)));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    /* renamed from: H */
    public static Integer m40777H(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40778I(org.json.JSONObject r6, p000.f94.C2277e r7) {
        /*
            java.lang.String r0 = "pri"
            r1 = 6
            int r0 = r6.optInt(r0, r1)
            int r0 = m40787e(r0)
            r7.mo19812y(r0)
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r0 = "ledc"
            boolean r3 = r6.has(r0)
            r4 = 4
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = "led"
            int r3 = r6.optInt(r3, r2)
            if (r3 != r2) goto L_0x0040
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r6.optString(r0)     // Catch:{ all -> 0x0040 }
            r5 = 16
            r3.<init>(r0, r5)     // Catch:{ all -> 0x0040 }
            int r0 = r3.intValue()     // Catch:{ all -> 0x0040 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r5 = 5000(0x1388, float:7.006E-42)
            r7.mo19808u(r0, r3, r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r1 = r4
        L_0x0041:
            java.lang.String r0 = "vib"
            int r0 = r6.optInt(r0, r2)
            if (r0 != r2) goto L_0x005d
            java.lang.String r0 = "vib_pt"
            boolean r0 = r6.has(r0)
            if (r0 == 0) goto L_0x005b
            long[] r0 = com.onesignal.OSUtils.m40268Q(r6)
            if (r0 == 0) goto L_0x005d
            r7.mo19786E(r0)
            goto L_0x005d
        L_0x005b:
            r1 = r1 | 2
        L_0x005d:
            boolean r0 = m40774E(r6)
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = f26294d
            r2 = 0
            java.lang.String r3 = "sound"
            java.lang.String r6 = r6.optString(r3, r2)
            android.net.Uri r6 = com.onesignal.OSUtils.m40282n(r0, r6)
            if (r6 == 0) goto L_0x0076
            r7.mo19783B(r6)
            goto L_0x0078
        L_0x0076:
            r1 = r1 | 1
        L_0x0078:
            r7.mo19801n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5217e.m40778I(org.json.JSONObject, f94$e):void");
    }

    /* renamed from: J */
    public static void m40779J(Context context) {
        f26294d = context;
        f26295e = context.getPackageName();
        f26293c = f26294d.getResources();
    }

    /* renamed from: K */
    public static void m40780K(RemoteViews remoteViews, JSONObject jSONObject, int i, String str, String str2) {
        Integer H = m40777H(jSONObject, str);
        if (H != null) {
            remoteViews.setTextColor(i, H.intValue());
            return;
        }
        int identifier = f26293c.getIdentifier(str2, "color", f26295e);
        if (identifier != 0) {
            remoteViews.setTextColor(i, C6285nj.m48810b(f26294d, identifier));
        }
    }

    /* renamed from: L */
    public static boolean m40781L(md4 md4) {
        int i;
        Notification notification;
        int intValue = md4.mo45743a().intValue();
        JSONObject e = md4.mo45747e();
        String optString = e.optString("grp", (String) null);
        hx2 hx2 = new hx2(f26294d);
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = ei4.m43977c(f26294d);
            if (optString == null && arrayList.size() >= 3) {
                optString = ei4.m43981g();
                ei4.m43976b(f26294d, arrayList);
            }
        }
        C5219b p = m40798p(md4);
        f94.C2277e eVar = p.f26297a;
        m40784b(e, hx2, eVar, intValue, (String) null);
        try {
            m40783a(e, eVar);
        } catch (Throwable th) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Could not set background notification image!", th);
        }
        m40786d(md4, eVar);
        if (md4.mo45756n()) {
            m40775F(eVar);
        }
        if (optString != null) {
            i = 2;
        } else {
            i = 1;
        }
        C5291m.m41081a(f26294d, i);
        if (optString != null) {
            m40789g(eVar, hx2, e, optString, intValue);
            notification = m40792j(md4, eVar);
            if (Build.VERSION.SDK_INT < 24 || !optString.equals(ei4.m43981g())) {
                m40794l(md4, p);
            } else {
                m40791i(md4, hx2, arrayList.size() + 1);
            }
        } else {
            notification = m40790h(eVar, hx2, e, intValue);
        }
        m40785c(p, notification);
        qb4.m25577d(f26294d).mo25052f(intValue, notification);
        if (Build.VERSION.SDK_INT >= 26) {
            return ei4.m43975a(f26294d, notification.getChannelId());
        }
        return true;
    }

    /* renamed from: M */
    public static void m40782M(md4 md4) {
        m40779J(md4.mo45746d());
        m40794l(md4, (C5219b) null);
    }

    /* renamed from: a */
    public static void m40783a(JSONObject jSONObject, f94.C2277e eVar) throws Throwable {
        JSONObject jSONObject2;
        Bitmap bitmap;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.VERBOSE, "Cannot use background images in notifications for device on version: " + i);
            return;
        }
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = m40799q(jSONObject2.optString("img", (String) null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = m40800r("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            RemoteViews remoteViews = new RemoteViews(f26294d.getPackageName(), e45.onesignal_bgimage_notif_layout);
            int i2 = i35.os_bgimage_notif_title;
            remoteViews.setTextViewText(i2, m40771B(jSONObject));
            int i3 = i35.os_bgimage_notif_body;
            remoteViews.setTextViewText(i3, jSONObject.optString("alert"));
            m40780K(remoteViews, jSONObject2, i2, "tc", "onesignal_bgimage_notif_title_color");
            m40780K(remoteViews, jSONObject2, i3, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f26293c.getIdentifier("onesignal_bgimage_notif_image_align", Utf8String.TYPE_NAME, f26295e);
                if (identifier != 0) {
                    str = f26293c.getString(identifier);
                } else {
                    str = null;
                }
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(i35.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                int i4 = i35.os_bgimage_notif_bgimage_right_aligned;
                remoteViews.setImageViewBitmap(i4, bitmap);
                remoteViews.setViewVisibility(i4, 0);
                remoteViews.setViewVisibility(i35.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(i35.os_bgimage_notif_bgimage, bitmap);
            }
            eVar.mo19797j(remoteViews);
            eVar.mo19784C((f94.C2280h) null);
        }
    }

    /* renamed from: b */
    public static void m40784b(JSONObject jSONObject, hx2 hx2, f94.C2277e eVar, int i, String str) {
        int i2;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent b = hx2.mo43414b(i);
                        b.setAction("" + i3);
                        b.putExtra("action_button", true);
                        jSONObject4.put("actionId", optJSONObject.optString("id"));
                        b.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            b.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            b.putExtra("grp", jSONObject.optString("grp"));
                        }
                        PendingIntent a = hx2.mo43413a(i, b);
                        if (optJSONObject.has("icon")) {
                            i2 = m40808z(optJSONObject.optString("icon"));
                        } else {
                            i2 = 0;
                        }
                        eVar.mo19789a(i2, optJSONObject.optString(PublicResolver.FUNC_TEXT), a);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m40785c(C5219b bVar, Notification notification) {
        if (bVar.f26298b) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m40786d(md4 md4, f94.C2277e eVar) {
        Class<f94.C2277e> cls = f94.C2277e.class;
        if (md4.mo45754l()) {
            try {
                Field declaredField = cls.getDeclaredField("R");
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(eVar);
                md4.mo45761s(Integer.valueOf(notification.flags));
                md4.mo45762t(notification.sound);
                eVar.mo19791c(md4.mo45748f().mo38745f());
                Notification notification2 = (Notification) declaredField.get(eVar);
                Field declaredField2 = cls.getDeclaredField("f");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("e");
                declaredField3.setAccessible(true);
                md4.mo45764u((CharSequence) declaredField2.get(eVar));
                md4.mo45767x((CharSequence) declaredField3.get(eVar));
                if (!md4.mo45756n()) {
                    md4.mo45765v(Integer.valueOf(notification2.flags));
                    md4.mo45766w(notification2.sound);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static int m40787e(int i) {
        if (i > 9) {
            return 2;
        }
        if (i > 7) {
            return 1;
        }
        if (i > 4) {
            return 0;
        }
        return i > 2 ? -1 : -2;
    }

    /* renamed from: f */
    public static Intent m40788f(int i, hx2 hx2, JSONObject jSONObject, String str) {
        return hx2.mo43414b(i).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
    }

    /* renamed from: g */
    public static void m40789g(f94.C2277e eVar, hx2 hx2, JSONObject jSONObject, String str, int i) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.mo19798k(hx2.mo43413a(secureRandom.nextInt(), hx2.mo43414b(i).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str)));
        eVar.mo19802o(m40807y(secureRandom.nextInt(), m40806x(i).putExtra("grp", str)));
        eVar.mo19804q(str);
        try {
            eVar.mo19805r(f26296f.intValue());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public static Notification m40790h(f94.C2277e eVar, hx2 hx2, JSONObject jSONObject, int i) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.mo19798k(hx2.mo43413a(secureRandom.nextInt(), hx2.mo43414b(i).putExtra("onesignalData", jSONObject.toString())));
        eVar.mo19802o(m40807y(secureRandom.nextInt(), m40806x(i)));
        return eVar.mo19790b();
    }

    /* renamed from: i */
    public static void m40791i(md4 md4, hx2 hx2, int i) {
        JSONObject e = md4.mo45747e();
        SecureRandom secureRandom = new SecureRandom();
        String g = ei4.m43981g();
        String str = i + " new messages";
        int f = ei4.m43980f();
        m40793k(C5340w0.m41369g(f26294d), g, f);
        PendingIntent a = hx2.mo43413a(secureRandom.nextInt(), m40788f(f, hx2, e, g));
        PendingIntent y = m40807y(secureRandom.nextInt(), m40806x(0).putExtra("summary", g));
        f94.C2277e eVar = m40798p(md4).f26297a;
        if (md4.mo45751i() != null) {
            eVar.mo19783B(md4.mo45751i());
        }
        if (md4.mo45750h() != null) {
            eVar.mo19801n(md4.mo45750h().intValue());
        }
        eVar.mo19798k(a).mo19802o(y).mo19800m(f26294d.getPackageManager().getApplicationLabel(f26294d.getApplicationInfo())).mo19799l(str).mo19810w(i).mo19782A(m40803u()).mo19807t(m40802t()).mo19811x(true).mo19794g(false).mo19804q(g).mo19806s(true);
        try {
            eVar.mo19805r(f26296f.intValue());
        } catch (Throwable unused) {
        }
        f94.C2279g gVar = new f94.C2279g();
        gVar.mo19816i(str);
        eVar.mo19784C(gVar);
        qb4.m25577d(f26294d).mo25052f(f, eVar.mo19790b());
    }

    /* renamed from: j */
    public static Notification m40792j(md4 md4, f94.C2277e eVar) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24 || md4.mo45756n()) {
            z = false;
        } else {
            z = true;
        }
        if (z && md4.mo45751i() != null && !md4.mo45751i().equals(md4.mo45749g())) {
            eVar.mo19783B((Uri) null);
        }
        Notification b = eVar.mo19790b();
        if (z) {
            eVar.mo19783B(md4.mo45751i());
        }
        return b;
    }

    /* renamed from: k */
    public static void m40793k(C5340w0 w0Var, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", 1);
        w0Var.mo39151j("notification", (String) null, contentValues);
    }

    /* renamed from: l */
    public static void m40794l(md4 md4, C5219b bVar) {
        String str;
        String str2;
        Integer num;
        ArrayList<SpannableString> arrayList;
        JSONObject jSONObject;
        Notification notification;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C5219b bVar2 = bVar;
        String str9 = ThrowableDeserializer.PROP_NAME_MESSAGE;
        String str10 = "title";
        String str11 = "is_summary";
        boolean n = md4.mo45756n();
        JSONObject e = md4.mo45747e();
        hx2 hx2 = new hx2(f26294d);
        Cursor cursor = null;
        String optString = e.optString("grp", (String) null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent y = m40807y(secureRandom.nextInt(), m40806x(0).putExtra("summary", optString));
        C5340w0 g = C5340w0.m41369g(f26294d);
        try {
            String[] strArr = {"android_notification_id", "full_data", str11, str10, str9};
            JSONObject jSONObject2 = e;
            try {
                String[] strArr2 = {optString};
                if (!n) {
                    try {
                        str = "group_id = ? AND dismissed = 0 AND opened = 0" + " AND android_notification_id <> " + md4.mo45743a();
                    } catch (Throwable th) {
                        th = th;
                        cursor = null;
                        cursor.close();
                        throw th;
                    }
                } else {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0";
                }
                Cursor c = g.mo39146c("notification", strArr, str, strArr2, (String) null, (String) null, "_id DESC");
                try {
                    str2 = "";
                    if (c.moveToFirst()) {
                        arrayList = new ArrayList<>();
                        String str12 = null;
                        num = null;
                        while (true) {
                            String str13 = str11;
                            if (c.getInt(c.getColumnIndex(str11)) == 1) {
                                num = Integer.valueOf(c.getInt(c.getColumnIndex("android_notification_id")));
                                str6 = str9;
                                str7 = str10;
                            } else {
                                String string = c.getString(c.getColumnIndex(str10));
                                if (string == null) {
                                    str5 = str2;
                                } else {
                                    str5 = string + " ";
                                }
                                str6 = str9;
                                str7 = str10;
                                SpannableString spannableString = new SpannableString(str5 + c.getString(c.getColumnIndex(str9)));
                                if (str5.length() > 0) {
                                    spannableString.setSpan(new StyleSpan(1), 0, str5.length(), 0);
                                }
                                arrayList.add(spannableString);
                                if (str12 == null) {
                                    str12 = c.getString(c.getColumnIndex("full_data"));
                                }
                            }
                            str8 = str12;
                            if (!c.moveToNext()) {
                                break;
                            }
                            C5219b bVar3 = bVar;
                            str12 = str8;
                            str11 = str13;
                            str9 = str6;
                            str10 = str7;
                        }
                        if (n && str8 != null) {
                            jSONObject = new JSONObject(str8);
                        }
                        jSONObject = jSONObject2;
                    } else {
                        jSONObject = jSONObject2;
                        arrayList = null;
                        num = null;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                } catch (Throwable th2) {
                    th = th2;
                    cursor = c;
                    cursor.close();
                    throw th;
                }
                if (!c.isClosed()) {
                    c.close();
                }
                if (num == null) {
                    num = Integer.valueOf(secureRandom.nextInt());
                    m40793k(g, optString, num.intValue());
                }
                PendingIntent a = hx2.mo43413a(secureRandom.nextInt(), m40788f(num.intValue(), hx2, jSONObject, optString));
                if (arrayList == null || ((!n || arrayList.size() <= 1) && (n || arrayList.size() <= 0))) {
                    C5219b bVar4 = bVar;
                    f94.C2277e eVar = bVar4.f26297a;
                    eVar.f11625b.clear();
                    m40784b(jSONObject, hx2, eVar, num.intValue(), optString);
                    eVar.mo19798k(a).mo19802o(y).mo19811x(n).mo19794g(false).mo19804q(optString).mo19806s(true);
                    try {
                        eVar.mo19805r(f26296f.intValue());
                    } catch (Throwable unused) {
                    }
                    notification = eVar.mo19790b();
                    m40785c(bVar4, notification);
                } else {
                    int size = arrayList.size() + (n ^ true ? 1 : 0);
                    String optString2 = jSONObject.optString("grp_msg", (String) null);
                    if (optString2 == null) {
                        str3 = size + " new messages";
                    } else {
                        str3 = optString2.replace("$[notif_count]", str2 + size);
                    }
                    f94.C2277e eVar2 = m40798p(md4).f26297a;
                    if (n) {
                        m40775F(eVar2);
                    } else {
                        if (md4.mo45751i() != null) {
                            eVar2.mo19783B(md4.mo45751i());
                        }
                        if (md4.mo45750h() != null) {
                            eVar2.mo19801n(md4.mo45750h().intValue());
                        }
                    }
                    eVar2.mo19798k(a).mo19802o(y).mo19800m(f26294d.getPackageManager().getApplicationLabel(f26294d.getApplicationInfo())).mo19799l(str3).mo19810w(size).mo19782A(m40803u()).mo19807t(m40802t()).mo19811x(n).mo19794g(false).mo19804q(optString).mo19806s(true);
                    try {
                        eVar2.mo19805r(f26296f.intValue());
                    } catch (Throwable unused2) {
                    }
                    if (!n) {
                        eVar2.mo19785D(str3);
                    }
                    f94.C2279g gVar = new f94.C2279g();
                    if (!n) {
                        if (md4.mo45753k() != null) {
                            str4 = md4.mo45753k().toString();
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            str2 = str4 + " ";
                        }
                        SpannableString spannableString2 = new SpannableString(str2 + md4.mo45745c().toString());
                        if (str2.length() > 0) {
                            spannableString2.setSpan(new StyleSpan(1), 0, str2.length(), 0);
                        }
                        gVar.mo19815h(spannableString2);
                    }
                    for (SpannableString h : arrayList) {
                        gVar.mo19815h(h);
                    }
                    gVar.mo19816i(str3);
                    eVar2.mo19784C(gVar);
                    notification = eVar2.mo19790b();
                }
                qb4.m25577d(f26294d).mo25052f(num.intValue(), notification);
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                cursor.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static boolean m40795m(md4 md4) {
        m40779J(md4.mo45746d());
        return m40781L(md4);
    }

    /* renamed from: n */
    public static boolean m40796n(md4 md4) {
        m40779J(md4.mo45746d());
        m40773D();
        m40772C();
        return m40781L(md4);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:4|5)|6|7|(2:9|10)|11|12|(2:14|15)|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ all -> 0x0025 }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.math.BigInteger m40797o(org.json.JSONObject r4) {
        /*
            java.lang.String r0 = "bgac"
            r1 = 16
            r2 = 0
            boolean r3 = r4.has(r0)     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x0015
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0015 }
            java.lang.String r4 = r4.optString(r0, r2)     // Catch:{ all -> 0x0015 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            android.content.Context r4 = com.onesignal.OneSignal.f26030e     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "onesignal_notification_accent_color"
            java.lang.String r4 = com.onesignal.OSUtils.m40279k(r4, r0, r2)     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0025 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0025:
            android.content.Context r4 = com.onesignal.OneSignal.f26030e     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "com.onesignal.NotificationAccentColor.DEFAULT"
            java.lang.String r4 = com.onesignal.OSUtils.m40275f(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0035
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0035 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0035 }
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5217e.m40797o(org.json.JSONObject):java.math.BigInteger");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|5|(1:9)|10|11|(1:13)|14|15|(1:17)(1:18)|19|20|(1:23)|24|(1:26)|27|(2:29|30)|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074 A[Catch:{ all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d A[Catch:{ all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae A[SYNTHETIC, Splitter:B:29:0x00ae] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onesignal.C5217e.C5219b m40798p(p000.md4 r9) {
        /*
            java.lang.String r0 = "vis"
            org.json.JSONObject r1 = r9.mo45747e()
            com.onesignal.e$b r2 = new com.onesignal.e$b
            r3 = 0
            r2.<init>()
            java.lang.String r4 = com.onesignal.C5281l.m41044c(r9)     // Catch:{ all -> 0x0018 }
            f94$e r5 = new f94$e     // Catch:{ all -> 0x0018 }
            android.content.Context r6 = f26294d     // Catch:{ all -> 0x0018 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0018 }
            goto L_0x001f
        L_0x0018:
            f94$e r5 = new f94$e
            android.content.Context r4 = f26294d
            r5.<init>(r4)
        L_0x001f:
            java.lang.String r4 = "alert"
            java.lang.String r4 = r1.optString(r4, r3)
            r6 = 1
            f94$e r7 = r5.mo19794g(r6)
            int r8 = m40770A(r1)
            f94$e r7 = r7.mo19782A(r8)
            f94$c r8 = new f94$c
            r8.<init>()
            f94$c r8 = r8.mo19781h(r4)
            f94$e r7 = r7.mo19784C(r8)
            f94$e r7 = r7.mo19799l(r4)
            r7.mo19785D(r4)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 < r8) goto L_0x005a
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.optString(r7)
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0061
        L_0x005a:
            java.lang.CharSequence r7 = m40771B(r1)
            r5.mo19800m(r7)
        L_0x0061:
            java.math.BigInteger r7 = m40797o(r1)     // Catch:{ all -> 0x006e }
            if (r7 == 0) goto L_0x006e
            int r7 = r7.intValue()     // Catch:{ all -> 0x006e }
            r5.mo19796i(r7)     // Catch:{ all -> 0x006e }
        L_0x006e:
            boolean r7 = r1.has(r0)     // Catch:{ all -> 0x0081 }
            if (r7 == 0) goto L_0x007d
            java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x0081 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x007e
        L_0x007d:
            r0 = r6
        L_0x007e:
            r5.mo19787F(r0)     // Catch:{ all -> 0x0081 }
        L_0x0081:
            android.graphics.Bitmap r0 = m40805w(r1)
            if (r0 == 0) goto L_0x008c
            r2.f26298b = r6
            r5.mo19807t(r0)
        L_0x008c:
            java.lang.String r0 = "bicon"
            java.lang.String r0 = r1.optString(r0, r3)
            android.graphics.Bitmap r0 = m40799q(r0)
            if (r0 == 0) goto L_0x00a8
            f94$b r3 = new f94$b
            r3.<init>()
            f94$b r0 = r3.mo19778i(r0)
            f94$b r0 = r0.mo19779j(r4)
            r5.mo19784C(r0)
        L_0x00a8:
            java.lang.Long r0 = r9.mo45752j()
            if (r0 == 0) goto L_0x00bc
            java.lang.Long r9 = r9.mo45752j()     // Catch:{ all -> 0x00bc }
            long r3 = r9.longValue()     // Catch:{ all -> 0x00bc }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r6
            r5.mo19788G(r3)     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            m40778I(r1, r5)
            r2.f26297a = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5217e.m40798p(md4):com.onesignal.e$b");
    }

    /* renamed from: q */
    public static Bitmap m40799q(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("http://") || trim.startsWith("https://")) {
            return m40801s(trim);
        }
        return m40800r(str);
    }

    /* renamed from: r */
    public static Bitmap m40800r(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(f26294d.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    bitmap = BitmapFactory.decodeStream(f26294d.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int z = m40808z(str);
            if (z != 0) {
                return BitmapFactory.decodeResource(f26293c, z);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    /* renamed from: s */
    public static Bitmap m40801s(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.WARN, "Could not download image!", th);
            return null;
        }
    }

    /* renamed from: t */
    public static Bitmap m40802t() {
        return m40776G(m40800r("ic_onesignal_large_icon_default"));
    }

    /* renamed from: u */
    public static int m40803u() {
        int v = m40804v("ic_stat_onesignal_default");
        if (v != 0) {
            return v;
        }
        int v2 = m40804v("corona_statusbar_icon_default");
        if (v2 != 0) {
            return v2;
        }
        int v3 = m40804v("ic_os_notification_fallback_white_24dp");
        if (v3 != 0) {
            return v3;
        }
        return 17301598;
    }

    /* renamed from: v */
    public static int m40804v(String str) {
        return f26293c.getIdentifier(str, "drawable", f26295e);
    }

    /* renamed from: w */
    public static Bitmap m40805w(JSONObject jSONObject) {
        Bitmap q = m40799q(jSONObject.optString("licon"));
        if (q == null) {
            q = m40800r("ic_onesignal_large_icon_default");
        }
        if (q == null) {
            return null;
        }
        return m40776G(q);
    }

    /* renamed from: x */
    public static Intent m40806x(int i) {
        return new Intent(f26294d, f26292b).putExtra("androidNotificationId", i).putExtra("dismissed", true);
    }

    /* renamed from: y */
    public static PendingIntent m40807y(int i, Intent intent) {
        return PendingIntent.getBroadcast(f26294d, i, intent, 201326592);
    }

    /* renamed from: z */
    public static int m40808z(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (!OSUtils.m40261J(trim)) {
            return 0;
        }
        int v = m40804v(trim);
        if (v != 0) {
            return v;
        }
        try {
            return R.drawable.class.getField(str).getInt((Object) null);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
