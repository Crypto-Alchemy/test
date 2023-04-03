package com.walletconnect.auth.engine.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.auth.engine.domain.AuthEngine$setup$3", mo48632f = "AuthEngine.kt", mo48633l = {78}, mo48634m = "invokeSuspend")
/* compiled from: AuthEngine.kt */
public final class AuthEngine$setup$3 extends SuspendLambda implements fd2<Boolean, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ AuthEngine this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Ly23;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.auth.engine.domain.AuthEngine$setup$3$1", mo48632f = "AuthEngine.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.auth.engine.domain.AuthEngine$setup$3$1 */
    /* compiled from: AuthEngine.kt */
    public static final class C55951 extends SuspendLambda implements fd2<hu0, ns0<? super y23>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C55951 r0 = new C55951(authEngine, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(hu0 hu0, ns0<? super y23> ns0) {
            return ((C55951) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                CoroutineDispatcher b = qh1.m71265b();
                final AuthEngine authEngine = authEngine;
                return d50.m56748b((hu0) this.L$0, b, (CoroutineStart) null, new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C55961>) null) {
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public AuthEngine$setup$3(AuthEngine authEngine, ns0<? super AuthEngine$setup$3> ns0) {
                            super(2, ns0);
                            this.this$0 = authEngine;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new AuthEngine$setup$3(this.this$0, ns0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (ns0<? super r37>) (ns0) obj2);
                        }

                        public final Object invoke(boolean z, ns0<? super r37> ns0) {
                            return ((AuthEngine$setup$3) create(Boolean.valueOf(z), ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                final AuthEngine authEngine = this.this$0;
                                C55951 r5 = new C55951((ns0<? super C55951>) null);
                                this.label = 1;
                                if (qd6.m71251c(r5, this) == d) {
                                    return d;
                                }
                            } else if (i == 1) {
                                hg5.m45199b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            if (this.this$0.f27333j == null) {
                                AuthEngine authEngine2 = this.this$0;
                                authEngine2.f27333j = authEngine2.mo40673o();
                            }
                            if (this.this$0.f27334k == null) {
                                AuthEngine authEngine3 = this.this$0;
                                authEngine3.f27334k = authEngine3.mo40674p();
                            }
                            if (this.this$0.f27335l == null) {
                                AuthEngine authEngine4 = this.this$0;
                                authEngine4.f27335l = authEngine4.mo40672n();
                            }
                            return r37.f33317a;
                        }
                    }
