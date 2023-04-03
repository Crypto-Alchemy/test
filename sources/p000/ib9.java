package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: ib9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ib9 {

    /* renamed from: f */
    public static final Uri f29878f = new Uri.Builder().scheme(PublicResolver.FUNC_CONTENT).authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f29879a;

    /* renamed from: b */
    public final String f29880b;

    /* renamed from: c */
    public final ComponentName f29881c = null;

    /* renamed from: d */
    public final int f29882d;

    /* renamed from: e */
    public final boolean f29883e;

    public ib9(String str, String str2, int i, boolean z) {
        cu4.m43217g(str);
        this.f29879a = str;
        cu4.m43217g(str2);
        this.f29880b = str2;
        this.f29882d = i;
        this.f29883e = z;
    }

    /* renamed from: a */
    public final int mo43535a() {
        return this.f29882d;
    }

    /* renamed from: b */
    public final ComponentName mo43536b() {
        return this.f29881c;
    }

    /* renamed from: c */
    public final Intent mo43537c(Context context) {
        Bundle bundle;
        if (this.f29879a == null) {
            return new Intent().setComponent(this.f29881c);
        }
        Intent intent = null;
        if (this.f29883e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f29879a);
            try {
                bundle = context.getContentResolver().call(f29878f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f29879a));
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f29879a).setPackage(this.f29880b);
    }

    /* renamed from: d */
    public final String mo43538d() {
        return this.f29880b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib9)) {
            return false;
        }
        ib9 ib9 = (ib9) obj;
        if (!if4.m45709a(this.f29879a, ib9.f29879a) || !if4.m45709a(this.f29880b, ib9.f29880b) || !if4.m45709a(this.f29881c, ib9.f29881c) || this.f29882d != ib9.f29882d || this.f29883e != ib9.f29883e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return if4.m45710b(this.f29879a, this.f29880b, this.f29881c, Integer.valueOf(this.f29882d), Boolean.valueOf(this.f29883e));
    }

    public final String toString() {
        String str = this.f29879a;
        if (str != null) {
            return str;
        }
        cu4.m43221k(this.f29881c);
        return this.f29881c.flattenToString();
    }
}
