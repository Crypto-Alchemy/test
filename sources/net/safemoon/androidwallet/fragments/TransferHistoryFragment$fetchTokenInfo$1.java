package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.TransferHistoryFragment$fetchTokenInfo$1", mo48632f = "TransferHistoryFragment.kt", mo48633l = {254}, mo48634m = "invokeSuspend")
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$fetchTokenInfo$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ UserTokenItemDisplayModel $token;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$fetchTokenInfo$1(UserTokenItemDisplayModel userTokenItemDisplayModel, TransferHistoryFragment transferHistoryFragment, ns0<? super TransferHistoryFragment$fetchTokenInfo$1> ns0) {
        super(2, ns0);
        this.$token = userTokenItemDisplayModel;
        this.this$0 = transferHistoryFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransferHistoryFragment$fetchTokenInfo$1(this.$token, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransferHistoryFragment$fetchTokenInfo$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A[Catch:{ Exception -> 0x00bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r5.L$1
            net.safemoon.androidwallet.fragments.TransferHistoryFragment r0 = (net.safemoon.androidwallet.fragments.TransferHistoryFragment) r0
            java.lang.Object r1 = r5.L$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r1 = (net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel) r1
            p000.hg5.m45199b(r6)     // Catch:{ Exception -> 0x006d }
            goto L_0x004f
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001f:
            p000.hg5.m45199b(r6)
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r6 = r5.$token     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = r6.getCmcId()     // Catch:{ Exception -> 0x00bf }
            if (r6 == 0) goto L_0x00bf
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r1 = r5.$token     // Catch:{ Exception -> 0x00bf }
            net.safemoon.androidwallet.fragments.TransferHistoryFragment r3 = r5.this$0     // Catch:{ Exception -> 0x00bf }
            int r4 = r6.length()     // Catch:{ Exception -> 0x006c }
            if (r4 != 0) goto L_0x0036
            r4 = r2
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            if (r4 != 0) goto L_0x0064
            ho3 r4 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x006c }
            k90 r6 = r4.mo52273b(r6)     // Catch:{ Exception -> 0x006c }
            r5.L$0 = r1     // Catch:{ Exception -> 0x006c }
            r5.L$1 = r3     // Catch:{ Exception -> 0x006c }
            r5.label = r2     // Catch:{ Exception -> 0x006c }
            java.lang.Object r6 = retrofit2.KotlinExtensions.m71521c(r6, r5)     // Catch:{ Exception -> 0x006c }
            if (r6 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r0 = r3
        L_0x004f:
            bg5 r6 = (p000.bg5) r6     // Catch:{ Exception -> 0x006d }
            java.lang.Object r6 = r6.mo50578a()     // Catch:{ Exception -> 0x006d }
            p000.vx2.m53588d(r6)     // Catch:{ Exception -> 0x006d }
            com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6     // Catch:{ Exception -> 0x006d }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x006d }
            java.lang.String r2 = "{\n                      …g()\n                    }"
            p000.vx2.m53590f(r6, r2)     // Catch:{ Exception -> 0x006d }
            goto L_0x006f
        L_0x0064:
            java.lang.Exception r6 = new java.lang.Exception     // Catch:{ Exception -> 0x006c }
            java.lang.String r0 = ""
            r6.<init>(r0)     // Catch:{ Exception -> 0x006c }
            throw r6     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            r0 = r3
        L_0x006d:
            java.lang.String r6 = "{}"
        L_0x006f:
            java.lang.String r1 = r1.getSymbol()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = p000.q70.m71189e(r1)     // Catch:{ Exception -> 0x00bf }
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = r1.toUpperCase(r2)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r2 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            p000.vx2.m53590f(r1, r2)     // Catch:{ Exception -> 0x00bf }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bf }
            r2.<init>(r6)     // Catch:{ Exception -> 0x00bf }
            boolean r2 = r2.has(r1)     // Catch:{ Exception -> 0x00bf }
            if (r2 == 0) goto L_0x008e
            goto L_0x00a2
        L_0x008e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bf }
            r1.<init>(r6)     // Catch:{ Exception -> 0x00bf }
            java.util.Iterator r1 = r1.keys()     // Catch:{ Exception -> 0x00bf }
            java.lang.Object r1 = r1.next()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r2 = "{\n                      …                        }"
            p000.vx2.m53590f(r1, r2)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00bf }
        L_0x00a2:
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00bf }
            r2.<init>()     // Catch:{ Exception -> 0x00bf }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bf }
            r3.<init>(r6)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = r3.getString(r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.Class<net.safemoon.androidwallet.model.Coin> r1 = net.safemoon.androidwallet.model.Coin.class
            java.lang.Object r6 = r2.fromJson((java.lang.String) r6, r1)     // Catch:{ Exception -> 0x00bf }
            net.safemoon.androidwallet.model.Coin r6 = (net.safemoon.androidwallet.model.Coin) r6     // Catch:{ Exception -> 0x00bf }
            k04 r0 = r0.mo57894j0()     // Catch:{ Exception -> 0x00bf }
            r0.postValue(r6)     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            r37 r6 = p000.r37.f33317a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.TransferHistoryFragment$fetchTokenInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
