package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.C4008a;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.slf4j.Marker;

/* renamed from: oh2 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class oh2 {

    /* renamed from: a */
    public final f22 f32376a;

    /* renamed from: b */
    public final zu3 f32377b;

    /* renamed from: c */
    public final C4008a f32378c;

    /* renamed from: d */
    public final ly4<q57> f32379d;

    /* renamed from: e */
    public final ly4<HeartBeatInfo> f32380e;

    /* renamed from: f */
    public final o22 f32381f;

    public oh2(f22 f22, zu3 zu3, C4008a aVar, ly4<q57> ly4, ly4<HeartBeatInfo> ly42, o22 o22) {
        this.f32376a = f22;
        this.f32377b = zu3;
        this.f32378c = aVar;
        this.f32379d = ly4;
        this.f32380e = ly42;
        this.f32381f = o22;
    }

    public oh2(f22 f22, zu3 zu3, ly4<q57> ly4, ly4<HeartBeatInfo> ly42, o22 o22) {
        this(f22, zu3, new C4008a(f22.mo42485h()), ly4, ly42, o22);
    }

    /* renamed from: a */
    public static String m49307a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: g */
    public static boolean m49308g(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public tl6<?> mo46397b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return mo46398c(mo46404j(str, zu3.m55265c(this.f32376a), Marker.ANY_MARKER, bundle));
    }

    /* renamed from: c */
    public final tl6<String> mo46398c(tl6<Bundle> tl6) {
        return tl6.mo48138i(mh2.f31697a, new nh2(this));
    }

    /* renamed from: d */
    public final String mo46399d() {
        try {
            return m49307a(MessageDigest.getInstance("SHA-1").digest(this.f32376a.mo42487j().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    public tl6<String> mo46400e(String str) {
        return mo46398c(mo46404j(str, zu3.m55265c(this.f32376a), Marker.ANY_MARKER, new Bundle()));
    }

    /* renamed from: f */
    public final String mo46401f(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: h */
    public final /* synthetic */ String mo46402h(tl6 tl6) throws Exception {
        return mo46401f((Bundle) tl6.mo48142m(IOException.class));
    }

    /* renamed from: i */
    public final Bundle mo46403i(String str, String str2, String str3, Bundle bundle) {
        HeartBeatInfo.HeartBeat a;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f32376a.mo42488k().mo29852c());
        bundle.putString("gmsv", Integer.toString(this.f32377b.mo49978d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f32377b.mo49976a());
        bundle.putString("app_ver_name", this.f32377b.mo49977b());
        bundle.putString("firebase-app-name-hash", mo46399d());
        try {
            String b = ((vv2) jm6.m46615a(this.f32381f.mo36110a(false))).mo42065b();
            if (!TextUtils.isEmpty(b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("cliv", "fcm-22.0.0");
        HeartBeatInfo heartBeatInfo = this.f32380e.get();
        q57 q57 = this.f32379d.get();
        if (!(heartBeatInfo == null || q57 == null || (a = heartBeatInfo.mo36104a("fire-iid")) == HeartBeatInfo.HeartBeat.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.getCode()));
            bundle.putString("Firebase-Client", q57.mo46970a());
        }
        return bundle;
    }

    /* renamed from: j */
    public final tl6<Bundle> mo46404j(String str, String str2, String str3, Bundle bundle) {
        mo46403i(str, str2, str3, bundle);
        return this.f32378c.mo30442a(bundle);
    }

    /* renamed from: k */
    public tl6<?> mo46405k(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return mo46398c(mo46404j(str, str2, str5, bundle));
    }

    /* renamed from: l */
    public tl6<?> mo46406l(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return mo46398c(mo46404j(str, str2, str5, bundle));
    }
}
