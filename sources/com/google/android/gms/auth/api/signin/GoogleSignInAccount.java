package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new fz7();

    /* renamed from: I */
    public static bh0 f22042I = e71.m43806c();

    /* renamed from: A */
    public List f22043A;

    /* renamed from: B */
    public String f22044B;

    /* renamed from: C */
    public String f22045C;

    /* renamed from: H */
    public Set f22046H = new HashSet();

    /* renamed from: a */
    public final int f22047a;

    /* renamed from: d */
    public String f22048d;

    /* renamed from: e */
    public String f22049e;

    /* renamed from: g */
    public String f22050g;

    /* renamed from: k */
    public String f22051k;

    /* renamed from: r */
    public Uri f22052r;

    /* renamed from: s */
    public String f22053s;

    /* renamed from: x */
    public long f22054x;

    /* renamed from: y */
    public String f22055y;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f22047a = i;
        this.f22048d = str;
        this.f22049e = str2;
        this.f22050g = str3;
        this.f22051k = str4;
        this.f22052r = uri;
        this.f22053s = str5;
        this.f22054x = j;
        this.f22055y = str6;
        this.f22043A = list;
        this.f22044B = str7;
        this.f22045C = str8;
    }

    /* renamed from: A1 */
    public static GoogleSignInAccount m33504A1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), cu4.m43217g(str7), new ArrayList((Collection) cu4.m43221k(set)), str5, str6);
    }

    /* renamed from: B1 */
    public static GoogleSignInAccount m33505B1(String str) throws JSONException {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount A1 = m33504A1(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        A1.f22053s = str7;
        return A1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f22055y.equals(this.f22055y) || !googleSignInAccount.mo30400y1().equals(mo30400y1())) {
            return false;
        }
        return true;
    }

    public Account getAccount() {
        String str = this.f22050g;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.f22055y.hashCode() + 527) * 31) + mo30400y1().hashCode();
    }

    /* renamed from: r1 */
    public String mo30392r1() {
        return this.f22051k;
    }

    /* renamed from: s1 */
    public String mo30393s1() {
        return this.f22050g;
    }

    /* renamed from: t1 */
    public String mo30394t1() {
        return this.f22045C;
    }

    /* renamed from: u1 */
    public String mo30395u1() {
        return this.f22044B;
    }

    /* renamed from: v1 */
    public String mo30396v1() {
        return this.f22048d;
    }

    /* renamed from: w1 */
    public String mo30397w1() {
        return this.f22049e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22047a);
        rk5.m51143s(parcel, 2, mo30396v1(), false);
        rk5.m51143s(parcel, 3, mo30397w1(), false);
        rk5.m51143s(parcel, 4, mo30393s1(), false);
        rk5.m51143s(parcel, 5, mo30392r1(), false);
        rk5.m51142r(parcel, 6, mo30399x1(), i, false);
        rk5.m51143s(parcel, 7, mo30401z1(), false);
        rk5.m51139o(parcel, 8, this.f22054x);
        rk5.m51143s(parcel, 9, this.f22055y, false);
        rk5.m51147w(parcel, 10, this.f22043A, false);
        rk5.m51143s(parcel, 11, mo30395u1(), false);
        rk5.m51143s(parcel, 12, mo30394t1(), false);
        rk5.m51126b(parcel, a);
    }

    /* renamed from: x1 */
    public Uri mo30399x1() {
        return this.f22052r;
    }

    /* renamed from: y1 */
    public Set<Scope> mo30400y1() {
        HashSet hashSet = new HashSet(this.f22043A);
        hashSet.addAll(this.f22046H);
        return hashSet;
    }

    /* renamed from: z1 */
    public String mo30401z1() {
        return this.f22053s;
    }
}
