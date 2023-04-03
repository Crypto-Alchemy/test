package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C4013a.C4017d, ReflectedParcelable {

    /* renamed from: C */
    public static final GoogleSignInOptions f22056C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new t18();

    /* renamed from: H */
    public static final GoogleSignInOptions f22057H;

    /* renamed from: I */
    public static final Scope f22058I = new Scope("profile");

    /* renamed from: L */
    public static final Scope f22059L = new Scope("email");

    /* renamed from: M */
    public static final Scope f22060M = new Scope("openid");

    /* renamed from: P */
    public static final Scope f22061P;

    /* renamed from: Q */
    public static final Scope f22062Q = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: U */
    public static Comparator f22063U = new k08();

    /* renamed from: A */
    public String f22064A;

    /* renamed from: B */
    public Map f22065B;

    /* renamed from: a */
    public final int f22066a;

    /* renamed from: d */
    public final ArrayList f22067d;

    /* renamed from: e */
    public Account f22068e;

    /* renamed from: g */
    public boolean f22069g;

    /* renamed from: k */
    public final boolean f22070k;

    /* renamed from: r */
    public final boolean f22071r;

    /* renamed from: s */
    public String f22072s;

    /* renamed from: x */
    public String f22073x;

    /* renamed from: y */
    public ArrayList f22074y;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class C4002a {

        /* renamed from: a */
        public Set f22075a = new HashSet();

        /* renamed from: b */
        public boolean f22076b;

        /* renamed from: c */
        public boolean f22077c;

        /* renamed from: d */
        public boolean f22078d;

        /* renamed from: e */
        public String f22079e;

        /* renamed from: f */
        public Account f22080f;

        /* renamed from: g */
        public String f22081g;

        /* renamed from: h */
        public Map f22082h = new HashMap();

        /* renamed from: i */
        public String f22083i;

        /* renamed from: a */
        public GoogleSignInOptions mo30413a() {
            if (this.f22075a.contains(GoogleSignInOptions.f22062Q)) {
                Set set = this.f22075a;
                Scope scope = GoogleSignInOptions.f22061P;
                if (set.contains(scope)) {
                    this.f22075a.remove(scope);
                }
            }
            if (this.f22078d && (this.f22080f == null || !this.f22075a.isEmpty())) {
                mo30414b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f22075a), this.f22080f, this.f22078d, this.f22076b, this.f22077c, this.f22079e, this.f22081g, this.f22082h, this.f22083i, (i18) null);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C4002a mo30414b() {
            this.f22075a.add(GoogleSignInOptions.f22060M);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4002a mo30415c() {
            this.f22075a.add(GoogleSignInOptions.f22058I);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C4002a mo30416d(Scope scope, Scope... scopeArr) {
            this.f22075a.add(scope);
            this.f22075a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f22061P = scope;
        C4002a aVar = new C4002a();
        aVar.mo30414b();
        aVar.mo30415c();
        f22056C = aVar.mo30413a();
        C4002a aVar2 = new C4002a();
        aVar2.mo30416d(scope, new Scope[0]);
        f22057H = aVar2.mo30413a();
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m33515y1(arrayList2), str3);
    }

    public /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, i18 i18) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    /* renamed from: y1 */
    public static Map m33515y1(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo30417r1()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.getAccount()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f22074y     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f22074y     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f22067d     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo30407t1()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f22067d     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo30407t1()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f22068e     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f22072s     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo30408u1()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f22072s     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo30408u1()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f22071r     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo30409v1()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f22069g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo30410w1()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f22070k     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo30412x1()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f22064A     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo30406s1()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public Account getAccount() {
        return this.f22068e;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f22067d;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).mo30516r1());
        }
        Collections.sort(arrayList);
        kl2 kl2 = new kl2();
        kl2.mo44823a(arrayList);
        kl2.mo44823a(this.f22068e);
        kl2.mo44823a(this.f22072s);
        kl2.mo44825c(this.f22071r);
        kl2.mo44825c(this.f22069g);
        kl2.mo44825c(this.f22070k);
        kl2.mo44823a(this.f22064A);
        return kl2.mo44824b();
    }

    /* renamed from: r1 */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo30405r1() {
        return this.f22074y;
    }

    /* renamed from: s1 */
    public String mo30406s1() {
        return this.f22064A;
    }

    /* renamed from: t1 */
    public ArrayList<Scope> mo30407t1() {
        return new ArrayList<>(this.f22067d);
    }

    /* renamed from: u1 */
    public String mo30408u1() {
        return this.f22072s;
    }

    /* renamed from: v1 */
    public boolean mo30409v1() {
        return this.f22071r;
    }

    /* renamed from: w1 */
    public boolean mo30410w1() {
        return this.f22069g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22066a);
        rk5.m51147w(parcel, 2, mo30407t1(), false);
        rk5.m51142r(parcel, 3, getAccount(), i, false);
        rk5.m51127c(parcel, 4, mo30410w1());
        rk5.m51127c(parcel, 5, mo30412x1());
        rk5.m51127c(parcel, 6, mo30409v1());
        rk5.m51143s(parcel, 7, mo30408u1(), false);
        rk5.m51143s(parcel, 8, this.f22073x, false);
        rk5.m51147w(parcel, 9, mo30405r1(), false);
        rk5.m51143s(parcel, 10, mo30406s1(), false);
        rk5.m51126b(parcel, a);
    }

    /* renamed from: x1 */
    public boolean mo30412x1() {
        return this.f22070k;
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.f22066a = i;
        this.f22067d = arrayList;
        this.f22068e = account;
        this.f22069g = z;
        this.f22070k = z2;
        this.f22071r = z3;
        this.f22072s = str;
        this.f22073x = str2;
        this.f22074y = new ArrayList(map.values());
        this.f22065B = map;
        this.f22064A = str3;
    }
}
