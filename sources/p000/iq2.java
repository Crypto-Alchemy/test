package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* renamed from: iq2 */
/* compiled from: IidStore */
public class iq2 {

    /* renamed from: c */
    public static final String[] f30100c = {Marker.ANY_MARKER, "FCM", "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f30101a;

    /* renamed from: b */
    public final String f30102b;

    public iq2(f22 f22) {
        this.f30101a = f22.mo42485h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f30102b = m45909b(f22);
    }

    /* renamed from: b */
    public static String m45909b(f22 f22) {
        String d = f22.mo42488k().mo29853d();
        if (d != null) {
            return d;
        }
        String c = f22.mo42488k().mo29852c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m45910c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo43894a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String mo43895d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final PublicKey mo43896e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid key stored ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: f */
    public String mo43897f() {
        synchronized (this.f30101a) {
            String g = mo43898g();
            if (g != null) {
                return g;
            }
            String h = mo43899h();
            return h;
        }
    }

    /* renamed from: g */
    public final String mo43898g() {
        String string;
        synchronized (this.f30101a) {
            string = this.f30101a.getString("|S|id", (String) null);
        }
        return string;
    }

    /* renamed from: h */
    public final String mo43899h() {
        synchronized (this.f30101a) {
            String string = this.f30101a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = mo43896e(string);
            if (e == null) {
                return null;
            }
            String c = m45910c(e);
            return c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo43900i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f30101a
            monitor-enter(r0)
            java.lang.String[] r1 = f30100c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f30102b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.mo43894a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f30101a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.mo43895d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iq2.mo43900i():java.lang.String");
    }
}
