package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.internal.C4028a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class GoogleApiClient {

    /* renamed from: a */
    public static final Set f22165a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class C4010a {

        /* renamed from: a */
        public Account f22166a;

        /* renamed from: b */
        public final Set f22167b = new HashSet();

        /* renamed from: c */
        public final Set f22168c = new HashSet();

        /* renamed from: d */
        public int f22169d;

        /* renamed from: e */
        public View f22170e;

        /* renamed from: f */
        public String f22171f;

        /* renamed from: g */
        public String f22172g;

        /* renamed from: h */
        public final Map f22173h = new C2781lq();

        /* renamed from: i */
        public final Context f22174i;

        /* renamed from: j */
        public final Map f22175j = new C2781lq();

        /* renamed from: k */
        public mg3 f22176k;

        /* renamed from: l */
        public int f22177l = -1;

        /* renamed from: m */
        public C4012c f22178m;

        /* renamed from: n */
        public Looper f22179n;

        /* renamed from: o */
        public yh2 f22180o = yh2.m54754p();

        /* renamed from: p */
        public C4013a.C4014a f22181p = g18.f29047c;

        /* renamed from: q */
        public final ArrayList f22182q = new ArrayList();

        /* renamed from: r */
        public final ArrayList f22183r = new ArrayList();

        public C4010a(Context context) {
            this.f22174i = context;
            this.f22179n = context.getMainLooper();
            this.f22171f = context.getPackageName();
            this.f22172g = context.getClass().getName();
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public C4010a mo30506a(C4013a<Object> aVar) {
            cu4.m43222l(aVar, "Api must not be null");
            this.f22175j.put(aVar, (Object) null);
            List<Scope> a = ((C4013a.C4020e) cu4.m43222l(aVar.mo30535c(), "Base client builder must not be null")).mo30541a(null);
            this.f22168c.addAll(a);
            this.f22167b.addAll(a);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C4010a mo30507b(C4011b bVar) {
            cu4.m43222l(bVar, "Listener must not be null");
            this.f22182q.add(bVar);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4010a mo30508c(C4012c cVar) {
            cu4.m43222l(cVar, "Listener must not be null");
            this.f22183r.add(cVar);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.GoogleApiClient mo30509d() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.f22175j
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                p000.cu4.m43212b(r0, r3)
                sg0 r0 = r22.mo30511f()
                java.util.Map r3 = r0.mo47781i()
                lq r11 = new lq
                r11.<init>()
                lq r14 = new lq
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.f22175j
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r13 = 0
                r4 = 0
                r16 = r4
                r17 = r13
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00c1
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.a r10 = (com.google.android.gms.common.api.C4013a) r10
                java.util.Map r4 = r1.f22175j
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = r2
                goto L_0x0052
            L_0x0051:
                r4 = r13
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                q38 r9 = new q38
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.a$a r4 = r10.mo30533a()
                java.lang.Object r4 = p000.cu4.m43221k(r4)
                r19 = r4
                com.google.android.gms.common.api.a$a r19 = (com.google.android.gms.common.api.C4013a.C4014a) r19
                android.content.Context r5 = r1.f22174i
                android.os.Looper r6 = r1.f22179n
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.a$f r4 = r4.mo30538d(r5, r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.a$c r5 = r21.mo30534b()
                r14.put(r5, r4)
                int r5 = r19.mo30542b()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = r2
                goto L_0x0094
            L_0x0092:
                r17 = r13
            L_0x0094:
                boolean r4 = r4.mo30545c()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.mo30536d()
                java.lang.String r3 = r16.mo30536d()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " cannot be used with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x00c1:
                if (r16 == 0) goto L_0x010f
                if (r17 != 0) goto L_0x00ef
                android.accounts.Account r3 = r1.f22166a
                if (r3 != 0) goto L_0x00cb
                r3 = r2
                goto L_0x00cc
            L_0x00cb:
                r3 = r13
            L_0x00cc:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo30536d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                p000.cu4.m43227q(r3, r5, r4)
                java.util.Set r3 = r1.f22167b
                java.util.Set r4 = r1.f22168c
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo30536d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                p000.cu4.m43227q(r3, r5, r4)
                goto L_0x010f
            L_0x00ef:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.mo30536d()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "With using "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x010f:
                java.util.Collection r3 = r14.values()
                int r16 = p000.iz7.m46066l(r3, r2)
                iz7 r2 = new iz7
                android.content.Context r5 = r1.f22174i
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.f22179n
                yh2 r9 = r1.f22180o
                com.google.android.gms.common.api.a$a r10 = r1.f22181p
                java.util.ArrayList r12 = r1.f22182q
                java.util.ArrayList r13 = r1.f22183r
                int r3 = r1.f22177l
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.GoogleApiClient.f22165a
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.f22165a     // Catch:{ all -> 0x0154 }
                r0.add(r2)     // Catch:{ all -> 0x0154 }
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                int r0 = r1.f22177l
                if (r0 < 0) goto L_0x0153
                mg3 r0 = r1.f22176k
                n28 r0 = p000.n28.m48592t(r0)
                int r3 = r1.f22177l
                com.google.android.gms.common.api.GoogleApiClient$c r4 = r1.f22178m
                r0.mo45950u(r3, r2, r4)
            L_0x0153:
                return r2
            L_0x0154:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient.C4010a.mo30509d():com.google.android.gms.common.api.GoogleApiClient");
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C4010a mo30510e(Handler handler) {
            cu4.m43222l(handler, "Handler must not be null");
            this.f22179n = handler.getLooper();
            return this;
        }

        /* renamed from: f */
        public final sg0 mo30511f() {
            n16 n16 = n16.f31943A;
            Map map = this.f22175j;
            C4013a aVar = g18.f29051g;
            if (map.containsKey(aVar)) {
                n16 = (n16) this.f22175j.get(aVar);
            }
            return new sg0(this.f22166a, this.f22167b, this.f22173h, this.f22169d, this.f22170e, this.f22171f, this.f22172g, n16, false);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface C4011b extends np0 {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface C4012c extends dh4 {
    }

    public abstract void connect();

    /* renamed from: d */
    public abstract void mo30498d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void disconnect();

    /* renamed from: e */
    public <A extends C4013a.C4015b, T extends C4028a<? extends eg5, A>> T mo30500e(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public Looper mo30501f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public abstract boolean mo30502g();

    /* renamed from: h */
    public abstract void mo30503h(C4012c cVar);

    /* renamed from: i */
    public abstract void mo30504i(C4012c cVar);

    /* renamed from: j */
    public void mo30505j(j18 j18) {
        throw new UnsupportedOperationException();
    }
}
