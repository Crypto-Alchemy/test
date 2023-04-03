package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.C4013a.C4017d;
import com.google.android.gms.common.api.internal.C4028a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p000.sg0;

/* renamed from: com.google.android.gms.common.api.b */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class C4023b<O extends C4013a.C4017d> implements C4026c<O> {

    /* renamed from: a */
    public final Context f22202a;

    /* renamed from: b */
    public final String f22203b;

    /* renamed from: c */
    public final C4013a f22204c;

    /* renamed from: d */
    public final C4013a.C4017d f22205d;

    /* renamed from: e */
    public final C6286nm f22206e;

    /* renamed from: f */
    public final Looper f22207f;

    /* renamed from: g */
    public final int f22208g;
    @NotOnlyInitialized

    /* renamed from: h */
    public final GoogleApiClient f22209h;

    /* renamed from: i */
    public final q96 f22210i;

    /* renamed from: j */
    public final bi2 f22211j;

    /* renamed from: com.google.android.gms.common.api.b$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class C4024a {

        /* renamed from: c */
        public static final C4024a f22212c = new C4025a().mo30572a();

        /* renamed from: a */
        public final q96 f22213a;

        /* renamed from: b */
        public final Looper f22214b;

        /* renamed from: com.google.android.gms.common.api.b$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public static class C4025a {

            /* renamed from: a */
            public q96 f22215a;

            /* renamed from: b */
            public Looper f22216b;

            /* renamed from: a */
            public C4024a mo30572a() {
                if (this.f22215a == null) {
                    this.f22215a = new C6222lm();
                }
                if (this.f22216b == null) {
                    this.f22216b = Looper.getMainLooper();
                }
                return new C4024a(this.f22215a, this.f22216b);
            }

            @CanIgnoreReturnValue
            /* renamed from: b */
            public C4025a mo30573b(q96 q96) {
                cu4.m43222l(q96, "StatusExceptionMapper must not be null.");
                this.f22215a = q96;
                return this;
            }
        }

        public C4024a(q96 q96, Account account, Looper looper) {
            this.f22213a = q96;
            this.f22214b = looper;
        }
    }

    public C4023b(Context context, Activity activity, C4013a aVar, C4013a.C4017d dVar, C4024a aVar2) {
        cu4.m43222l(context, "Null context is not permitted.");
        cu4.m43222l(aVar, "Api must not be null.");
        cu4.m43222l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f22202a = context.getApplicationContext();
        String str = null;
        if (xp4.m54486k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f22203b = str;
        this.f22204c = aVar;
        this.f22205d = dVar;
        this.f22207f = aVar2.f22214b;
        C6286nm a = C6286nm.m48824a(aVar, dVar, str);
        this.f22206e = a;
        this.f22209h = new zz7(this);
        bi2 x = bi2.m32559x(this.f22202a);
        this.f22211j = x;
        this.f22208g = x.mo29608m();
        this.f22210i = aVar2.f22213a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            dy7.m43736u(activity, x, a);
        }
        x.mo29598b(this);
    }

    /* renamed from: c */
    public final C6286nm<O> mo30559c() {
        return this.f22206e;
    }

    /* renamed from: d */
    public GoogleApiClient mo30560d() {
        return this.f22209h;
    }

    /* renamed from: e */
    public sg0.C6484a mo30561e() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount S0;
        sg0.C6484a aVar = new sg0.C6484a();
        C4013a.C4017d dVar = this.f22205d;
        if (!(dVar instanceof C4013a.C4017d.C4019b) || (S0 = ((C4013a.C4017d.C4019b) dVar).mo30540S0()) == null) {
            C4013a.C4017d dVar2 = this.f22205d;
            if (dVar2 instanceof C4013a.C4017d.C4018a) {
                account = ((C4013a.C4017d.C4018a) dVar2).getAccount();
            } else {
                account = null;
            }
        } else {
            account = S0.getAccount();
        }
        aVar.mo47786d(account);
        C4013a.C4017d dVar3 = this.f22205d;
        if (dVar3 instanceof C4013a.C4017d.C4019b) {
            GoogleSignInAccount S02 = ((C4013a.C4017d.C4019b) dVar3).mo30540S0();
            if (S02 == null) {
                set = Collections.emptySet();
            } else {
                set = S02.mo30400y1();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.mo47785c(set);
        aVar.mo47787e(this.f22202a.getClass().getName());
        aVar.mo47784b(this.f22202a.getPackageName());
        return aVar;
    }

    /* renamed from: f */
    public <TResult, A extends C4013a.C4015b> tl6<TResult> mo30562f(wl6<A, TResult> wl6) {
        return mo30571o(2, wl6);
    }

    /* renamed from: g */
    public <A extends C4013a.C4015b, T extends C4028a<? extends eg5, A>> T mo30563g(T t) {
        mo30570n(2, t);
        return t;
    }

    /* renamed from: h */
    public <A extends C4013a.C4015b, T extends C4028a<? extends eg5, A>> T mo30564h(T t) {
        mo30570n(1, t);
        return t;
    }

    /* renamed from: i */
    public String mo30565i() {
        return this.f22203b;
    }

    /* renamed from: j */
    public Looper mo30566j() {
        return this.f22207f;
    }

    /* renamed from: k */
    public final int mo30567k() {
        return this.f22208g;
    }

    /* renamed from: l */
    public final C4013a.C4021f mo30568l(Looper looper, uz7 uz7) {
        Looper looper2 = looper;
        C4013a.C4021f d = ((C4013a.C4014a) cu4.m43221k(this.f22204c.mo30533a())).mo30538d(this.f22202a, looper2, mo30561e().mo47783a(), this.f22205d, uz7, uz7);
        String i = mo30565i();
        if (i != null && (d instanceof C6462ry)) {
            ((C6462ry) d).mo47540U(i);
        }
        if (i != null && (d instanceof l84)) {
            ((l84) d).mo45385w(i);
        }
        return d;
    }

    /* renamed from: m */
    public final w08 mo30569m(Context context, Handler handler) {
        return new w08(context, handler, mo30561e().mo47783a());
    }

    /* renamed from: n */
    public final C4028a mo30570n(int i, C4028a aVar) {
        aVar.mo30583k();
        this.f22211j.mo29593D(this, i, aVar);
        return aVar;
    }

    /* renamed from: o */
    public final tl6 mo30571o(int i, wl6 wl6) {
        xl6 xl6 = new xl6();
        this.f22211j.mo29594E(this, i, wl6, xl6, this.f22210i);
        return xl6.mo49503a();
    }

    public C4023b(Context context, C4013a<O> aVar, O o, C4024a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4023b(android.content.Context r2, com.google.android.gms.common.api.C4013a<O> r3, O r4, p000.q96 r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.b$a$a r0 = new com.google.android.gms.common.api.b$a$a
            r0.<init>()
            r0.mo30573b(r5)
            com.google.android.gms.common.api.b$a r5 = r0.mo30572a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C4023b.C4024a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C4023b.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, q96):void");
    }
}
