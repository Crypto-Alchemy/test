package p000;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: sg0 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class sg0 {

    /* renamed from: a */
    public final Account f33875a;

    /* renamed from: b */
    public final Set f33876b;

    /* renamed from: c */
    public final Set f33877c;

    /* renamed from: d */
    public final Map f33878d;

    /* renamed from: e */
    public final int f33879e;

    /* renamed from: f */
    public final View f33880f;

    /* renamed from: g */
    public final String f33881g;

    /* renamed from: h */
    public final String f33882h;

    /* renamed from: i */
    public final n16 f33883i;

    /* renamed from: j */
    public Integer f33884j;

    /* renamed from: sg0$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class C6484a {

        /* renamed from: a */
        public Account f33885a;

        /* renamed from: b */
        public C3162qq f33886b;

        /* renamed from: c */
        public String f33887c;

        /* renamed from: d */
        public String f33888d;

        /* renamed from: e */
        public n16 f33889e = n16.f31943A;

        /* renamed from: a */
        public sg0 mo47783a() {
            return new sg0(this.f33885a, this.f33886b, (Map) null, 0, (View) null, this.f33887c, this.f33888d, this.f33889e, false);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C6484a mo47784b(String str) {
            this.f33887c = str;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final C6484a mo47785c(Collection collection) {
            if (this.f33886b == null) {
                this.f33886b = new C3162qq();
            }
            this.f33886b.addAll(collection);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public final C6484a mo47786d(Account account) {
            this.f33885a = account;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public final C6484a mo47787e(String str) {
            this.f33888d = str;
            return this;
        }
    }

    public sg0(Account account, Set set, Map map, int i, View view, String str, String str2, n16 n16, boolean z) {
        Set set2;
        this.f33875a = account;
        if (set == null) {
            set2 = Collections.emptySet();
        } else {
            set2 = Collections.unmodifiableSet(set);
        }
        this.f33876b = set2;
        map = map == null ? Collections.emptyMap() : map;
        this.f33878d = map;
        this.f33880f = view;
        this.f33879e = i;
        this.f33881g = str;
        this.f33882h = str2;
        this.f33883i = n16 == null ? n16.f31943A : n16;
        HashSet hashSet = new HashSet(set2);
        for (yy7 yy7 : map.values()) {
            hashSet.addAll(yy7.f35959a);
        }
        this.f33877c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account mo47773a() {
        return this.f33875a;
    }

    /* renamed from: b */
    public Account mo47774b() {
        Account account = this.f33875a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public Set<Scope> mo47775c() {
        return this.f33877c;
    }

    /* renamed from: d */
    public String mo47776d() {
        return this.f33881g;
    }

    /* renamed from: e */
    public Set<Scope> mo47777e() {
        return this.f33876b;
    }

    /* renamed from: f */
    public final n16 mo47778f() {
        return this.f33883i;
    }

    /* renamed from: g */
    public final Integer mo47779g() {
        return this.f33884j;
    }

    /* renamed from: h */
    public final String mo47780h() {
        return this.f33882h;
    }

    /* renamed from: i */
    public final Map mo47781i() {
        return this.f33878d;
    }

    /* renamed from: j */
    public final void mo47782j(Integer num) {
        this.f33884j = num;
    }
}
