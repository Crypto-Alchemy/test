package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$onSearch$1", mo48632f = "AddNewTokensViewModel.kt", mo48633l = {92}, mo48634m = "invokeSuspend")
/* compiled from: AddNewTokensViewModel.kt */
public final class AddNewTokensViewModel$onSearch$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ AddNewTokensViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$onSearch$1$1", mo48632f = "AddNewTokensViewModel.kt", mo48633l = {95}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$onSearch$1$1 */
    /* compiled from: AddNewTokensViewModel.kt */
    public static final class C86411 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86411(addNewTokensViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86411) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x008a, code lost:
            if (kotlin.text.StringsKt__StringsKt.m63081R(r9, r10, false, 2, (java.lang.Object) null) != false) goto L_0x008c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0020
                if (r2 != r3) goto L_0x0018
                java.lang.Object r1 = r0.L$0
                k04 r1 = (p000.k04) r1
                p000.hg5.m45199b(r17)
                r3 = r17
                goto L_0x00c2
            L_0x0018:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0020:
                p000.hg5.m45199b(r17)
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r2 = r3
                k04 r2 = r2.mo60964k()
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r4 = r3
                yo2 r4 = r4.f42609b
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r5 = r3
                java.util.List r5 = r5.f42616i
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r6 = r3
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0040:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x0094
                java.lang.Object r8 = r5.next()
                r9 = r8
                net.safemoon.androidwallet.model.token.abstraction.IToken r9 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r9
                java.lang.String r10 = r9.getSymbol()
                java.util.Locale r11 = java.util.Locale.ROOT
                java.lang.String r10 = r10.toLowerCase(r11)
                java.lang.String r12 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                p000.vx2.m53590f(r10, r12)
                java.lang.String r13 = r6.f42613f
                java.lang.String r13 = r13.toLowerCase(r11)
                p000.vx2.m53590f(r13, r12)
                r14 = 0
                r15 = 2
                r3 = 0
                boolean r10 = kotlin.text.StringsKt__StringsKt.m63081R(r10, r13, r14, r15, r3)
                if (r10 != 0) goto L_0x008c
                java.lang.String r9 = r9.getName()
                java.lang.String r9 = r9.toLowerCase(r11)
                p000.vx2.m53590f(r9, r12)
                java.lang.String r10 = r6.f42613f
                java.lang.String r10 = r10.toLowerCase(r11)
                p000.vx2.m53590f(r10, r12)
                boolean r3 = kotlin.text.StringsKt__StringsKt.m63081R(r9, r10, r14, r15, r3)
                if (r3 == 0) goto L_0x008d
            L_0x008c:
                r14 = 1
            L_0x008d:
                if (r14 == 0) goto L_0x0092
                r7.add(r8)
            L_0x0092:
                r3 = 1
                goto L_0x0040
            L_0x0094:
                java.util.List r3 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r7)
                k04 r5 = new k04
                r5.<init>(r3)
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r3 = r3
                java.lang.Object r6 = r5.getValue()
                java.util.List r6 = (java.util.List) r6
                if (r6 != 0) goto L_0x00ac
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
            L_0x00ac:
                r3.f42615h = r6
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r3 = r3
                net.safemoon.androidwallet.common.TokenType r3 = r3.f42614g
                r0.L$0 = r2
                r6 = 1
                r0.label = r6
                java.lang.Object r3 = r4.mo58178a(r5, r3, r0)
                if (r3 != r1) goto L_0x00c1
                return r1
            L_0x00c1:
                r1 = r2
            L_0x00c2:
                androidx.lifecycle.LiveData r3 = (androidx.lifecycle.LiveData) r3
                java.lang.Object r2 = r3.getValue()
                r1.postValue(r2)
                r37 r1 = p000.r37.f33317a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$onSearch$1.C86411.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddNewTokensViewModel$onSearch$1(AddNewTokensViewModel addNewTokensViewModel, ns0<? super AddNewTokensViewModel$onSearch$1> ns0) {
        super(2, ns0);
        this.this$0 = addNewTokensViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AddNewTokensViewModel$onSearch$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AddNewTokensViewModel$onSearch$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final AddNewTokensViewModel addNewTokensViewModel = this.this$0;
            C86411 r1 = new C86411((ns0<? super C86411>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
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
