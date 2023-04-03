package com.walletconnect.sign.engine.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$setup$3", mo48632f = "SignEngine.kt", mo48633l = {87}, mo48634m = "invokeSuspend")
/* compiled from: SignEngine.kt */
public final class SignEngine$setup$3 extends SuspendLambda implements fd2<Boolean, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SignEngine this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Ly23;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$setup$3$1", mo48632f = "SignEngine.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.sign.engine.domain.SignEngine$setup$3$1 */
    /* compiled from: SignEngine.kt */
    public static final class C56501 extends SuspendLambda implements fd2<hu0, ns0<? super y23>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C56501 r0 = new C56501(signEngine, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(hu0 hu0, ns0<? super y23> ns0) {
            return ((C56501) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                CoroutineDispatcher b = qh1.m71265b();
                final SignEngine signEngine = signEngine;
                return d50.m56748b((hu0) this.L$0, b, (CoroutineStart) null, new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C56511>) null) {
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SignEngine$setup$3(SignEngine signEngine, ns0<? super SignEngine$setup$3> ns0) {
                            super(2, ns0);
                            this.this$0 = signEngine;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new SignEngine$setup$3(this.this$0, ns0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (ns0<? super r37>) (ns0) obj2);
                        }

                        public final Object invoke(boolean z, ns0<? super r37> ns0) {
                            return ((SignEngine$setup$3) create(Boolean.valueOf(z), ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                final SignEngine signEngine = this.this$0;
                                C56501 r5 = new C56501((ns0<? super C56501>) null);
                                this.label = 1;
                                if (qd6.m71251c(r5, this) == d) {
                                    return d;
                                }
                            } else if (i == 1) {
                                hg5.m45199b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            if (this.this$0.f27666j == null) {
                                SignEngine signEngine2 = this.this$0;
                                signEngine2.f27666j = signEngine2.mo41195E();
                            }
                            if (this.this$0.f27667k == null) {
                                SignEngine signEngine3 = this.this$0;
                                signEngine3.f27667k = signEngine3.mo41196F();
                            }
                            if (this.this$0.f27668l == null) {
                                SignEngine signEngine4 = this.this$0;
                                signEngine4.f27668l = signEngine4.mo41194D();
                            }
                            return r37.f33317a;
                        }
                    }
