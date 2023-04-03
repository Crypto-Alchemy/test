package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.common.PlaybackException;
import com.onesignal.C5355z0;
import com.onesignal.OneSignal;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.h1 */
/* compiled from: TrackGooglePurchase */
public class C5244h1 {

    /* renamed from: i */
    public static int f26339i = -99;

    /* renamed from: j */
    public static Class<?> f26340j;

    /* renamed from: a */
    public ServiceConnection f26341a;

    /* renamed from: b */
    public Object f26342b;

    /* renamed from: c */
    public Method f26343c;

    /* renamed from: d */
    public Method f26344d;

    /* renamed from: e */
    public Context f26345e;

    /* renamed from: f */
    public ArrayList<String> f26346f;

    /* renamed from: g */
    public boolean f26347g = true;

    /* renamed from: h */
    public boolean f26348h;

    /* renamed from: com.onesignal.h1$a */
    /* compiled from: TrackGooglePurchase */
    public class C5245a implements ServiceConnection {
        public C5245a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Method h = C5244h1.m40877q(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                h.setAccessible(true);
                Object unused = C5244h1.this.f26342b = h.invoke((Object) null, new Object[]{iBinder});
                C5244h1.this.mo38834b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            int unused = C5244h1.f26339i = -99;
            Object unused2 = C5244h1.this.f26342b = null;
        }
    }

    /* renamed from: com.onesignal.h1$b */
    /* compiled from: TrackGooglePurchase */
    public class C5246b implements Runnable {
        public C5246b() {
        }

        public void run() {
            boolean unused = C5244h1.this.f26348h = true;
            try {
                if (C5244h1.this.f26343c == null) {
                    Method unused2 = C5244h1.this.f26343c = C5244h1.m40878r(C5244h1.f26340j);
                    C5244h1.this.f26343c.setAccessible(true);
                }
                Bundle bundle = (Bundle) C5244h1.this.f26343c.invoke(C5244h1.this.f26342b, new Object[]{3, C5244h1.this.f26345e.getPackageName(), "inapp", null});
                if (bundle.getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str = stringArrayList.get(i);
                        String string = new JSONObject(stringArrayList2.get(i)).getString("purchaseToken");
                        if (!C5244h1.this.f26346f.contains(string) && !arrayList2.contains(string)) {
                            arrayList2.add(string);
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() > 0) {
                        C5244h1.this.mo38835t(arrayList, arrayList2);
                    } else if (stringArrayList2.size() == 0) {
                        boolean unused3 = C5244h1.this.f26347g = false;
                        C5342x0.m41399j("GTPlayerPurchases", "ExistingPurchases", false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            boolean unused4 = C5244h1.this.f26348h = false;
        }
    }

    /* renamed from: com.onesignal.h1$c */
    /* compiled from: TrackGooglePurchase */
    public class C5247c extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f26351a;

        public C5247c(ArrayList arrayList) {
            this.f26351a = arrayList;
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            C5244h1.this.f26346f.addAll(this.f26351a);
            C5342x0.m41402m("GTPlayerPurchases", "purchaseTokens", C5244h1.this.f26346f.toString());
            C5342x0.m41399j("GTPlayerPurchases", "ExistingPurchases", true);
            boolean unused = C5244h1.this.f26347g = false;
            boolean unused2 = C5244h1.this.f26348h = false;
        }
    }

    public C5244h1(Context context) {
        boolean z = false;
        this.f26348h = false;
        this.f26345e = context;
        this.f26346f = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(C5342x0.m41395f("GTPlayerPurchases", "purchaseTokens", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f26346f.add(jSONArray.get(i).toString());
            }
            z = jSONArray.length() == 0 ? true : z;
            this.f26347g = z;
            if (z) {
                this.f26347g = C5342x0.m41391b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo38836u();
    }

    /* renamed from: a */
    public static boolean m40862a(Context context) {
        if (f26339i == -99) {
            f26339i = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (f26339i == 0) {
                f26340j = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            if (f26339i == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            f26339i = 0;
            return false;
        }
    }

    /* renamed from: q */
    public static Method m40877q(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<IBinder>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static Method m40878r(Class cls) {
        Class<String> cls2 = String.class;
        for (Method method : cls.getMethods()) {
            Class<String>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls2 && parameterTypes[2] == cls2 && parameterTypes[3] == cls2) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: s */
    public static Method m40879s(Class cls) {
        Class<String> cls2 = String.class;
        for (Method method : cls.getMethods()) {
            Class<Bundle>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls2 && parameterTypes[2] == cls2 && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo38834b() {
        if (!this.f26348h) {
            new Thread(new C5246b()).start();
        }
    }

    /* renamed from: t */
    public final void mo38835t(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.f26344d == null) {
                Method s = m40879s(f26340j);
                this.f26344d = s;
                s.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) this.f26344d.invoke(this.f26342b, new Object[]{3, this.f26345e.getPackageName(), "inapp", bundle});
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(PlaybackException.CUSTOM_ERROR_CODE_BASE));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (hashMap.containsKey(next)) {
                        jSONArray.put(hashMap.get(next));
                    }
                }
                if (jSONArray.length() > 0) {
                    OneSignal.m40450y1(jSONArray, this.f26347g, new C5247c(arrayList2));
                }
            }
        } catch (Throwable th) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.WARN, "Failed to track IAP purchases", th);
        }
    }

    /* renamed from: u */
    public void mo38836u() {
        if (this.f26341a == null) {
            this.f26341a = new C5245a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f26345e.bindService(intent, this.f26341a, 1);
        } else if (this.f26342b != null) {
            mo38834b();
        }
    }
}
