package net.safemoon.androidwallet.viewmodels;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.GoogleAuthViewModel$generateAuthKey$1", mo48632f = "GoogleAuthViewModel.kt", mo48633l = {36}, mo48634m = "invokeSuspend")
/* compiled from: GoogleAuthViewModel.kt */
public final class GoogleAuthViewModel$generateAuthKey$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ GoogleAuthViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.GoogleAuthViewModel$generateAuthKey$1$1", mo48632f = "GoogleAuthViewModel.kt", mo48633l = {41}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.GoogleAuthViewModel$generateAuthKey$1$1 */
    /* compiled from: GoogleAuthViewModel.kt */
    public static final class C86831 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86831(googleAuthViewModel, il6, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86831) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final GoogleAuthViewModel googleAuthViewModel = googleAuthViewModel;
                final il6 il6 = il6;
                z42 f = e52.m57214f(e52.m57228t(new fd2<a52<? super Bitmap>, ns0<? super r37>, Object>((ns0<? super C86841>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C86841 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public GoogleAuthViewModel$generateAuthKey$1(GoogleAuthViewModel googleAuthViewModel, ns0<? super GoogleAuthViewModel$generateAuthKey$1> ns0) {
                            super(2, ns0);
                            this.this$0 = googleAuthViewModel;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new GoogleAuthViewModel$generateAuthKey$1(this.this$0, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((GoogleAuthViewModel$generateAuthKey$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                final il6 il6 = new il6("Safemoon", "Android", il6.m58998a());
                                CoroutineDispatcher b = qh1.m71265b();
                                final GoogleAuthViewModel googleAuthViewModel = this.this$0;
                                C86831 r3 = new C86831((ns0<? super C86831>) null);
                                this.label = 1;
                                if (b50.m55768e(b, r3, this) == d) {
                                    return d;
                                }
                            } else if (i == 1) {
                                hg5.m45199b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return r37.f33317a;
                        }
                    }
