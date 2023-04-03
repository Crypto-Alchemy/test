package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4013a.C4017d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.C4033b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p000.C6462ry;

/* renamed from: com.google.android.gms.common.api.a */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class C4013a<O extends C4017d> {

    /* renamed from: a */
    public final C4014a f22199a;

    /* renamed from: b */
    public final C4022g f22200b;

    /* renamed from: c */
    public final String f22201c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class C4014a<T extends C4021f, O> extends C4020e<T, O> {
        /* renamed from: c */
        public T mo30537c(Context context, Looper looper, sg0 sg0, O o, np0 np0, dh4 dh4) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        /* renamed from: d */
        public T mo30538d(Context context, Looper looper, sg0 sg0, O o, GoogleApiClient.C4011b bVar, GoogleApiClient.C4012c cVar) {
            return mo30537c(context, looper, sg0, o, bVar, cVar);
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface C4015b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class C4016c<C extends C4015b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface C4017d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface C4018a extends C4017d {
            Account getAccount();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface C4019b extends C4017d {
            /* renamed from: S0 */
            GoogleSignInAccount mo30540S0();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class C4020e<T extends C4015b, O> {
        /* renamed from: a */
        public List<Scope> mo30541a(O o) {
            return Collections.emptyList();
        }

        /* renamed from: b */
        public int mo30542b() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface C4021f extends C4015b {
        /* renamed from: a */
        void mo30543a();

        /* renamed from: b */
        boolean mo30544b();

        /* renamed from: c */
        boolean mo30545c();

        /* renamed from: d */
        void mo30546d(String str);

        /* renamed from: e */
        boolean mo30547e();

        /* renamed from: f */
        String mo30548f();

        /* renamed from: g */
        boolean mo30549g();

        /* renamed from: h */
        void mo30550h(C6462ry.C6467e eVar);

        /* renamed from: j */
        boolean mo30551j();

        /* renamed from: l */
        Set<Scope> mo30552l();

        /* renamed from: m */
        void mo30553m(C4033b bVar, Set<Scope> set);

        /* renamed from: n */
        void mo30554n(C6462ry.C6465c cVar);

        /* renamed from: o */
        void mo30555o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: p */
        int mo28794p();

        /* renamed from: q */
        Feature[] mo30556q();

        /* renamed from: s */
        String mo30557s();

        /* renamed from: t */
        Intent mo30558t();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class C4022g<C extends C4021f> extends C4016c<C> {
    }

    public <C extends C4021f> C4013a(String str, C4014a<C, O> aVar, C4022g<C> gVar) {
        cu4.m43222l(aVar, "Cannot construct an Api with a null ClientBuilder");
        cu4.m43222l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f22201c = str;
        this.f22199a = aVar;
        this.f22200b = gVar;
    }

    /* renamed from: a */
    public final C4014a mo30533a() {
        return this.f22199a;
    }

    /* renamed from: b */
    public final C4016c mo30534b() {
        return this.f22200b;
    }

    /* renamed from: c */
    public final C4020e mo30535c() {
        return this.f22199a;
    }

    /* renamed from: d */
    public final String mo30536d() {
        return this.f22201c;
    }
}
