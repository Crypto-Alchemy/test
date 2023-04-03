package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.onesignal.C5179a;
import java.util.HashMap;

public class PermissionsActivity extends Activity {

    /* renamed from: e */
    public static final String f26097e = "com.onesignal.PermissionsActivity";

    /* renamed from: g */
    public static boolean f26098g;

    /* renamed from: k */
    public static boolean f26099k;

    /* renamed from: r */
    public static boolean f26100r;

    /* renamed from: s */
    public static C5179a.C5181b f26101s;

    /* renamed from: x */
    public static final HashMap<String, C5165c> f26102x = new HashMap<>();

    /* renamed from: a */
    public String f26103a;

    /* renamed from: d */
    public String f26104d;

    /* renamed from: com.onesignal.PermissionsActivity$a */
    public class C5163a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int[] f26105a;

        public C5163a(int[] iArr) {
            this.f26105a = iArr;
        }

        public void run() {
            int[] iArr = this.f26105a;
            boolean z = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            }
            C5165c cVar = (C5165c) PermissionsActivity.f26102x.get(PermissionsActivity.this.f26103a);
            if (cVar == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: " + PermissionsActivity.this.f26103a);
            } else if (z) {
                cVar.mo38610a();
            } else {
                cVar.mo38611b(PermissionsActivity.this.mo38604h());
            }
        }
    }

    /* renamed from: com.onesignal.PermissionsActivity$b */
    public class C5164b extends C5179a.C5181b {

        /* renamed from: a */
        public final /* synthetic */ String f26107a;

        /* renamed from: b */
        public final /* synthetic */ String f26108b;

        /* renamed from: c */
        public final /* synthetic */ Class f26109c;

        public C5164b(String str, String str2, Class cls) {
            this.f26107a = str;
            this.f26108b = str2;
            this.f26109c = cls;
        }

        /* renamed from: a */
        public void mo38609a(Activity activity) {
            Class<PermissionsActivity> cls = PermissionsActivity.class;
            if (!activity.getClass().equals(cls)) {
                Intent intent = new Intent(activity, cls);
                intent.setFlags(131072);
                intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f26107a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f26108b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f26109c.getName());
                activity.startActivity(intent);
                activity.overridePendingTransition(u05.onesignal_fade_in, u05.onesignal_fade_out);
            }
        }
    }

    /* renamed from: com.onesignal.PermissionsActivity$c */
    public interface C5165c {
        /* renamed from: a */
        void mo38610a();

        /* renamed from: b */
        void mo38611b(boolean z);
    }

    /* renamed from: e */
    public static void m40505e(String str, C5165c cVar) {
        f26102x.put(str, cVar);
    }

    /* renamed from: i */
    public static void m40506i(boolean z, String str, String str2, Class<?> cls) {
        if (!f26098g) {
            f26099k = z;
            f26101s = new C5164b(str, str2, cls);
            C5179a b = C6139ka.m46938b();
            if (b != null) {
                b.mo38651b(f26097e, f26101s);
            }
        }
    }

    /* renamed from: d */
    public final void mo38601d(Bundle bundle) {
        mo38603g(bundle);
        this.f26103a = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
        String string = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
        this.f26104d = string;
        mo38602f(string);
    }

    /* renamed from: f */
    public final void mo38602f(String str) {
        if (!f26098g) {
            f26098g = true;
            f26100r = !C6220lj.m47826b(this, str);
            C6220lj.m47825a(this, new String[]{str}, 2);
        }
    }

    /* renamed from: g */
    public final void mo38603g(Bundle bundle) {
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    /* renamed from: h */
    public final boolean mo38604h() {
        if (!f26099k || !f26100r || C6220lj.m47826b(this, this.f26104d)) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OneSignal.m40338L0(this);
        mo38601d(getIntent().getExtras());
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo38601d(intent.getExtras());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        f26098g = false;
        if (i == 2) {
            new Handler().postDelayed(new C5163a(iArr), 500);
        }
        C5179a b = C6139ka.m46938b();
        if (b != null) {
            b.mo38666q(f26097e);
        }
        finish();
        overridePendingTransition(u05.onesignal_fade_in, u05.onesignal_fade_out);
    }
}
