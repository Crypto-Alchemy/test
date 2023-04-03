package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: g69 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class g69 extends vt8 {

    /* renamed from: g */
    public static final String[] f29098g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f29099h = {"_err"};

    /* renamed from: c */
    public SecureRandom f29100c;

    /* renamed from: d */
    public final AtomicLong f29101d = new AtomicLong(0);

    /* renamed from: e */
    public int f29102e;

    /* renamed from: f */
    public Integer f29103f = null;

    public g69(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: B */
    public static MessageDigest m44574B() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: C */
    public static long m44575C(byte[] bArr) {
        boolean z;
        cu4.m43221k(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43225o(z);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: D */
    public static boolean m44576D(Context context, boolean z) {
        cu4.m43221k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m44584f0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m44584f0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: F */
    public static boolean m44577F(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m44578G(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: M */
    public static boolean m44579M(String str) {
        if (f29099h[0].equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public static ArrayList<Bundle> m44580Y(List<zzaa> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzaa next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f23064a);
            bundle.putString("origin", next.f23065d);
            bundle.putLong("creation_timestamp", next.f23067g);
            bundle.putString(PublicResolver.FUNC_NAME, next.f23066e.f23079d);
            zt8.m55251a(bundle, next.f23066e.mo31423r1());
            bundle.putBoolean("active", next.f23068k);
            String str = next.f23069r;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzas zzas = next.f23070s;
            if (zzas != null) {
                bundle.putString("timed_out_event_name", zzas.f23074a);
                zzaq zzaq = next.f23070s.f23075d;
                if (zzaq != null) {
                    bundle.putBundle("timed_out_event_params", zzaq.mo31419w1());
                }
            }
            bundle.putLong("trigger_timeout", next.f23071x);
            zzas zzas2 = next.f23072y;
            if (zzas2 != null) {
                bundle.putString("triggered_event_name", zzas2.f23074a);
                zzaq zzaq2 = next.f23072y.f23075d;
                if (zzaq2 != null) {
                    bundle.putBundle("triggered_event_params", zzaq2.mo31419w1());
                }
            }
            bundle.putLong("triggered_timestamp", next.f23066e.f23080e);
            bundle.putLong("time_to_live", next.f23062A);
            zzas zzas3 = next.f23063B;
            if (zzas3 != null) {
                bundle.putString("expired_event_name", zzas3.f23074a);
                zzaq zzaq3 = next.f23063B.f23075d;
                if (zzaq3 != null) {
                    bundle.putBundle("expired_event_params", zzaq3.mo31419w1());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: a0 */
    public static boolean m44581a0(Context context) {
        ActivityInfo receiverInfo;
        cu4.m43221k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b0 */
    public static final boolean m44582b0(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: c0 */
    public static final boolean m44583c0(String str) {
        cu4.m43221k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    public static boolean m44584f0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: g0 */
    public static boolean m44585g0(String str, String[] strArr) {
        cu4.m43221k(strArr);
        for (String G : strArr) {
            if (m44578G(str, G)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j0 */
    public static boolean m44586j0(String str) {
        cu4.m43217g(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo42791E(String str) {
        mo29006e();
        if (tn7.m52384a(this.f34342a.mo45271q()).mo45807a(str) == 0) {
            return true;
        }
        this.f34342a.mo45237A().mo29677u().mo48770b("Permission not granted", str);
        return false;
    }

    /* renamed from: H */
    public final boolean mo42792H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String D = this.f34342a.mo45274y().mo45979D();
        this.f34342a.mo45257b();
        return D.equals(str);
    }

    /* renamed from: I */
    public final Bundle mo42793I(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object p = mo42823p(next, bundle.get(next));
                if (p == null) {
                    this.f34342a.mo45237A().mo29675r().mo48770b("Param value can't be null", this.f34342a.mo45244H().mo45822n(next));
                } else {
                    mo42837y(bundle2, next, p);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: J */
    public final zzas mo42794J(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo42824p0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle r = mo42826r(str, str2, bundle3, lj0.m47828b("_o"), false);
            if (z) {
                r = mo42793I(r);
            }
            cu4.m43221k(r);
            return new zzas(str2, new zzaq(r), str3, j);
        }
        this.f34342a.mo45237A().mo29670l().mo48770b("Invalid conditional property event name", this.f34342a.mo45244H().mo45823o(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: K */
    public final boolean mo42795K(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = tn7.m52384a(context).mo45811e(str, 64);
            if (e == null || (signatureArr = e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Package name not found", e3);
            return true;
        }
    }

    /* renamed from: L */
    public final byte[] mo42796L(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: N */
    public final int mo42797N() {
        if (this.f29103f == null) {
            this.f29103f = Integer.valueOf(zh2.m55108h().mo49850b(this.f34342a.mo45271q()) / 1000);
        }
        return this.f29103f.intValue();
    }

    /* renamed from: O */
    public final int mo42798O(int i) {
        return zh2.m55108h().mo49670j(this.f34342a.mo45271q(), mi2.f31711a);
    }

    /* renamed from: P */
    public final long mo42799P(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* renamed from: Q */
    public final void mo42800Q(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: R */
    public final void mo42801R(lf8 lf8, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: S */
    public final void mo42802S(lf8 lf8, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: T */
    public final void mo42803T(lf8 lf8, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: U */
    public final void mo42804U(lf8 lf8, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: V */
    public final void mo42805V(lf8 lf8, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: W */
    public final void mo42806W(lf8 lf8, Bundle bundle) {
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: X */
    public final void mo42807X(lf8 lf8, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: Z */
    public final URL mo42808Z(long j, String str, String str2, long j2) {
        try {
            cu4.m43217g(str2);
            cu4.m43217g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{42004L, Integer.valueOf(mo42797N())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f34342a.mo45274y().mo45980E())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: d0 */
    public final Object mo42809d0(int i, Object obj, boolean z, boolean z2) {
        long j;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            return Long.valueOf(j);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo42819n(String.valueOf(obj), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle I = mo42793I((Bundle) parcelable);
                    if (!I.isEmpty()) {
                        arrayList.add(I);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: e0 */
    public final int mo42810e0(String str) {
        if ("_ldl".equals(str)) {
            this.f34342a.mo45274y();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f34342a.mo45274y();
            return 256;
        } else if (!this.f34342a.mo45274y().mo45997v((String) null, rl8.f33497g0) || !"_lgclid".equals(str)) {
            this.f34342a.mo45274y();
            return 36;
        } else {
            this.f34342a.mo45274y();
            return 100;
        }
    }

    /* renamed from: f */
    public final boolean mo29669f() {
        return true;
    }

    /* renamed from: g */
    public final void mo42811g() {
        mo29006e();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f34342a.mo45237A().mo29673o().mo48769a("Utils falling back to Random for random id");
            }
        }
        this.f29101d.set(nextLong);
    }

    /* renamed from: h0 */
    public final long mo42812h0() {
        long andIncrement;
        long j;
        if (this.f29101d.get() == 0) {
            synchronized (this.f29101d) {
                long nextLong = new Random(System.nanoTime() ^ this.f34342a.mo45256a().mo29580a()).nextLong();
                int i = this.f29102e + 1;
                this.f29102e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f29101d) {
            this.f29101d.compareAndSet(-1, 1);
            andIncrement = this.f29101d.getAndIncrement();
        }
        return andIncrement;
    }

    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: i0 */
    public final SecureRandom mo42813i0() {
        mo29006e();
        if (this.f29100c == null) {
            this.f29100c = new SecureRandom();
        }
        return this.f29100c;
    }

    /* renamed from: k0 */
    public final Bundle mo42814k0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("medium", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(PublicResolver.FUNC_CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f34342a.mo45237A().mo29673o().mo48770b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo42815l(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            le9.m47797a();
            if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33501i0) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (TextUtils.isEmpty(str2)) {
                if (this.f34342a.mo45247K()) {
                    this.f34342a.mo45237A().mo29672n().mo48769a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m44583c0(str2)) {
                return true;
            } else {
                this.f34342a.mo45237A().mo29672n().mo48770b("Invalid admob_app_id. Analytics disabled.", bn8.m32664w(str2));
                return false;
            }
        } else if (m44583c0(str)) {
            return true;
        } else {
            if (this.f34342a.mo45247K()) {
                this.f34342a.mo45237A().mo29672n().mo48770b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", bn8.m32664w(str));
            }
            return false;
        }
    }

    /* renamed from: l0 */
    public final boolean mo42816l0(String str, String str2) {
        if (str2 == null) {
            this.f34342a.mo45237A().mo29672n().mo48770b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f34342a.mo45237A().mo29672n().mo48770b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f34342a.mo45237A().mo29672n().mo48771c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f34342a.mo45237A().mo29672n().mo48771c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: m */
    public final boolean mo42817m(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            cu4.m43221k(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (!isEmpty || !isEmpty2) {
            if (!isEmpty) {
                if (TextUtils.isEmpty(str4)) {
                    return false;
                }
                if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        } else if (!str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: m0 */
    public final boolean mo42818m0(String str, String str2) {
        if (str2 == null) {
            this.f34342a.mo45237A().mo29672n().mo48770b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f34342a.mo45237A().mo29672n().mo48770b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f34342a.mo45237A().mo29672n().mo48771c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f34342a.mo45237A().mo29672n().mo48771c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: n */
    public final String mo42819n(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: n0 */
    public final boolean mo42820n0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f34342a.mo45237A().mo29672n().mo48770b("Name is required and can't be null. Type", str);
            return false;
        }
        cu4.m43221k(str2);
        String[] strArr3 = f29098g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f34342a.mo45237A().mo29672n().mo48771c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m44585g0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m44585g0(str2, strArr2)) {
            return true;
        }
        this.f34342a.mo45237A().mo29672n().mo48771c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo42821o(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.mo29006e()
            boolean r2 = r14.mo42830t0(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto L_0x00ac
            if (r22 == 0) goto L_0x00a9
            java.lang.String[] r2 = p000.eu8.f28684c
            boolean r2 = m44585g0(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            kr8 r2 = r7.f34342a
            g29 r2 = r2.mo45254R()
            r2.mo29006e()
            r2.mo47219g()
            boolean r6 = r2.mo42733o()
            if (r6 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            kr8 r2 = r2.f34342a
            g69 r2 = r2.mo45243G()
            int r2 = r2.mo42797N()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0047
            r0 = 25
            return r0
        L_0x0047:
            kr8 r2 = r7.f34342a
            r2.mo45274y()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0055
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x0060
        L_0x0055:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00ac
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x0060:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00ac
            kr8 r10 = r7.f34342a
            bn8 r10 = r10.mo45237A()
            vm8 r10 = r10.mo29675r()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.mo48772d(r11, r3, r8, r6)
            kr8 r6 = r7.f34342a
            r6.mo45274y()
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x00a7
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x00a7:
            r9 = r4
            goto L_0x00ad
        L_0x00a9:
            r0 = 21
            return r0
        L_0x00ac:
            r9 = r5
        L_0x00ad:
            kr8 r1 = r7.f34342a
            n68 r1 = r1.mo45274y()
            uk8<java.lang.Boolean> r2 = p000.rl8.f33477T
            r10 = r15
            boolean r1 = r1.mo45997v(r15, r2)
            if (r1 == 0) goto L_0x00c2
            boolean r1 = m44577F(r16)
            if (r1 != 0) goto L_0x00c8
        L_0x00c2:
            boolean r1 = m44577F(r17)
            if (r1 == 0) goto L_0x00d0
        L_0x00c8:
            kr8 r1 = r7.f34342a
            r1.mo45274y()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d7
        L_0x00d0:
            kr8 r1 = r7.f34342a
            r1.mo45274y()
            r1 = 100
        L_0x00d7:
            boolean r1 = r14.mo42832u0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00de
            return r9
        L_0x00de:
            if (r22 == 0) goto L_0x0171
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00f6
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo42834v0(r1, r2, r3, r4, r5, r6)
            goto L_0x0170
        L_0x00f6:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x012e
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = r5
        L_0x00ff:
            if (r13 >= r12) goto L_0x0170
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011b
            kr8 r1 = r7.f34342a
            bn8 r1 = r1.mo45237A()
            vm8 r1 = r1.mo29675r()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo48771c(r2, r0, r8)
            goto L_0x0171
        L_0x011b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo42834v0(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x00ff
        L_0x012e:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0171
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = r5
        L_0x013a:
            if (r13 >= r12) goto L_0x0170
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x015d
            kr8 r1 = r7.f34342a
            bn8 r1 = r1.mo45237A()
            vm8 r1 = r1.mo29675r()
            if (r0 == 0) goto L_0x0155
            java.lang.Class r0 = r0.getClass()
            goto L_0x0157
        L_0x0155:
            java.lang.String r0 = "null"
        L_0x0157:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo48771c(r2, r0, r8)
            goto L_0x0171
        L_0x015d:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo42834v0(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x013a
        L_0x0170:
            return r9
        L_0x0171:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g69.mo42821o(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: o0 */
    public final boolean mo42822o0(String str, int i, String str2) {
        if (str2 == null) {
            this.f34342a.mo45237A().mo29672n().mo48770b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f34342a.mo45237A().mo29672n().mo48772d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* renamed from: p */
    public final Object mo42823p(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f34342a.mo45274y();
            return mo42809d0(256, obj, true, true);
        }
        if (m44577F(str)) {
            this.f34342a.mo45274y();
        } else {
            this.f34342a.mo45274y();
            i = 100;
        }
        return mo42809d0(i, obj, false, true);
    }

    /* renamed from: p0 */
    public final int mo42824p0(String str) {
        if (!mo42818m0("event", str)) {
            return 2;
        }
        if (!mo42820n0("event", cu8.f27953a, cu8.f27954b, str)) {
            return 13;
        }
        this.f34342a.mo45274y();
        if (!mo42822o0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: q0 */
    public final int mo42825q0(String str) {
        if (!mo42818m0("user property", str)) {
            return 6;
        }
        if (!mo42820n0("user property", fu8.f28992a, (String[]) null, str)) {
            return 15;
        }
        this.f34342a.mo45274y();
        if (!mo42822o0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo42826r(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = p000.cu8.f27956d
            boolean r13 = m44585g0(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            kr8 r0 = r9.f34342a
            n68 r0 = r0.mo45274y()
            int r15 = r0.mo45987j()
            kr8 r0 = r9.f34342a
            n68 r0 = r0.mo45274y()
            uk8<java.lang.Boolean> r1 = p000.rl8.f33482Y
            r8 = r21
            boolean r0 = r0.mo45997v(r8, r1)
            if (r0 == 0) goto L_0x0037
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            goto L_0x003b
        L_0x0037:
            java.util.Set r0 = r23.keySet()
        L_0x003b:
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x0043:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x005c
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r2 = r17
            goto L_0x006c
        L_0x005c:
            if (r25 == 0) goto L_0x0063
            int r0 = r9.mo42827r0(r7)
            goto L_0x0065
        L_0x0063:
            r0 = r17
        L_0x0065:
            if (r0 != 0) goto L_0x006b
            int r0 = r9.mo42828s0(r7)
        L_0x006b:
            r2 = r0
        L_0x006c:
            if (r2 == 0) goto L_0x0082
            r0 = 3
            if (r2 != r0) goto L_0x0073
            r5 = r7
            goto L_0x0075
        L_0x0073:
            r0 = 0
            r5 = r0
        L_0x0075:
            r0 = r20
            r1 = r14
            r3 = r7
            r4 = r7
            r0.mo42833v(r1, r2, r3, r4, r5)
            r14.remove(r7)
            goto L_0x0120
        L_0x0082:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r14
            r6 = r24
            r19 = r7
            r7 = r25
            r8 = r13
            int r2 = r0.mo42821o(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x00ac
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r14
            r3 = r19
            r4 = r19
            r0.mo42833v(r1, r2, r3, r4, r5)
            goto L_0x00ce
        L_0x00ac:
            if (r2 == 0) goto L_0x00ce
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00d0
            r0 = 21
            if (r2 != r0) goto L_0x00be
            r3 = r10
            goto L_0x00bf
        L_0x00be:
            r3 = r6
        L_0x00bf:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r14
            r4 = r6
            r0.mo42833v(r1, r2, r3, r4, r5)
            r14.remove(r6)
            goto L_0x0120
        L_0x00ce:
            r6 = r19
        L_0x00d0:
            boolean r0 = m44586j0(r6)
            if (r0 == 0) goto L_0x0120
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x011a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            kr8 r2 = r9.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29672n()
            kr8 r3 = r9.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r10)
            kr8 r4 = r9.f34342a
            mm8 r4 = r4.mo45244H()
            java.lang.String r4 = r4.mo45824p(r11)
            r2.mo48771c(r1, r3, r4)
            r1 = 5
            m44582b0(r14, r1)
            r14.remove(r6)
        L_0x011a:
            r8 = r21
            r18 = r0
            goto L_0x0043
        L_0x0120:
            r8 = r21
            goto L_0x0043
        L_0x0124:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g69.mo42826r(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: r0 */
    public final int mo42827r0(String str) {
        if (!mo42816l0("event param", str)) {
            return 3;
        }
        if (!mo42820n0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f34342a.mo45274y();
        if (!mo42822o0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: s0 */
    public final int mo42828s0(String str) {
        if (!mo42818m0("event param", str)) {
            return 3;
        }
        if (!mo42820n0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f34342a.mo45274y();
        if (!mo42822o0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: t */
    public final void mo42829t(en8 en8, int i) {
        int i2 = 0;
        for (String str : new TreeSet(en8.f28641d.keySet())) {
            if (m44586j0(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                this.f34342a.mo45237A().mo29672n().mo48771c(sb.toString(), this.f34342a.mo45244H().mo45821m(en8.f28638a), this.f34342a.mo45244H().mo45824p(en8.f28641d));
                m44582b0(en8.f28641d, 5);
                en8.f28641d.remove(str);
            }
        }
    }

    /* renamed from: t0 */
    public final boolean mo42830t0(Object obj) {
        if ((obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void mo42831u(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    this.f34342a.mo45243G().mo42837y(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    /* renamed from: u0 */
    public final boolean mo42832u0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                this.f34342a.mo45237A().mo29675r().mo48772d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public final void mo42833v(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m44582b0(bundle, i)) {
            this.f34342a.mo45274y();
            bundle.putString("_ev", mo42819n(str, 40, true));
            if (obj != null) {
                cu4.m43221k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: v0 */
    public final void mo42834v0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5;
        int i3;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            this.f34342a.mo45274y();
            int i4 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    if (z) {
                        i3 = mo42827r0(str7);
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        i3 = mo42828s0(str7);
                    }
                    i = i3;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    if (i == 3) {
                        str5 = str7;
                    } else {
                        str5 = null;
                    }
                    mo42833v(bundle, i, str7, str7, str5);
                    bundle2.remove(str7);
                } else {
                    if (mo42830t0(bundle2.get(str7))) {
                        this.f34342a.mo45237A().mo29675r().mo48772d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i2 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i2 = mo42821o(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo42833v(bundle, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m44586j0(str4) && !m44585g0(str4, eu8.f28685d) && (i4 = i4 + 1) > 0) {
                        this.f34342a.mo45237A().mo29672n().mo48771c("Item cannot contain custom parameters", this.f34342a.mo45244H().mo45821m(str6), this.f34342a.mo45244H().mo45824p(bundle2));
                        m44582b0(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public final int mo42835w(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo42832u0("user property referrer", str, mo42810e0(str), obj);
        } else {
            z = mo42832u0("user property", str, mo42810e0(str), obj);
        }
        if (z) {
            return 0;
        }
        return 7;
    }

    /* renamed from: x */
    public final Object mo42836x(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return mo42809d0(mo42810e0(str), obj, true, false);
        }
        return mo42809d0(mo42810e0(str), obj, false, false);
    }

    /* renamed from: y */
    public final void mo42837y(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                this.f34342a.mo45237A().mo29675r().mo48771c("Not putting event parameter. Invalid value type. name, type", this.f34342a.mo45244H().mo45822n(str), str2);
            }
        }
    }

    /* renamed from: z */
    public final void mo42838z(d69 d69, String str, int i, String str2, String str3, int i2, boolean z) {
        Bundle bundle = new Bundle();
        m44582b0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        if (z) {
            d69.mo41855i(str, "_err", bundle);
            return;
        }
        this.f34342a.mo45257b();
        this.f34342a.mo45242F().mo47916X("auto", "_err", bundle);
    }
}
