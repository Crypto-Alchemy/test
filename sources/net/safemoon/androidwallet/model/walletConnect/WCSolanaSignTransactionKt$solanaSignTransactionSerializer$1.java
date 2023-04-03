package net.safemoon.androidwallet.model.walletConnect;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lae1;", "it", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "invoke", "(Lae1;)Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCSolanaSignTransaction.kt */
public final class WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1 extends Lambda implements rc2<ae1, WCSolanaSignTransaction> {
    public static final WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1 INSTANCE = new WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1();

    public WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1() {
        super(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransaction invoke(p000.ae1 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "it"
            p000.vx2.m53591g(r10, r0)
            net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransaction r0 = new net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransaction
            ae1$a r1 = r10.mo164a()
            com.google.gson.JsonElement r2 = r10.mo165b()
            net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey r3 = net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey.SIGNATURES
            java.lang.String r3 = r3.getKey()
            com.google.gson.JsonElement r2 = p000.xn1.m30225b(r2, r3)
            com.google.gson.JsonArray r2 = p000.xn1.m30226c(r2)
            com.google.gson.JsonDeserializationContext r1 = r1.mo169a()
            net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1$invoke$$inlined$deserialize$1 r3 = new net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1$invoke$$inlined$deserialize$1
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.String r4 = "object : TypeToken<T>() {} .type"
            p000.vx2.m53587c(r3, r4)
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r6 = "type.rawType"
            if (r5 == 0) goto L_0x0046
            r5 = r3
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r7 = p000.xj2.m30136a(r5)
            if (r7 == 0) goto L_0x0046
            java.lang.reflect.Type r3 = r5.getRawType()
            p000.vx2.m53587c(r3, r6)
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x004a:
            java.lang.Object r1 = r1.deserialize(r2, r3)
            java.lang.String r2 = "it.context.deserialize(i…ey.SIGNATURES.key].array)"
            p000.vx2.m53590f(r1, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.gson.JsonElement r2 = r10.mo165b()
            net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey r3 = net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey.FEEPAYER
            java.lang.String r3 = r3.getKey()
            com.google.gson.JsonElement r2 = p000.xn1.m30225b(r2, r3)
            java.lang.String r2 = p000.xn1.m30231h(r2)
            ae1$a r3 = r10.mo164a()
            com.google.gson.JsonElement r5 = r10.mo165b()
            net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey r7 = net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey.INSTRUCTIONS
            java.lang.String r7 = r7.getKey()
            com.google.gson.JsonElement r5 = p000.xn1.m30225b(r5, r7)
            com.google.gson.JsonArray r5 = p000.xn1.m30226c(r5)
            com.google.gson.JsonDeserializationContext r3 = r3.mo169a()
            net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1$invoke$$inlined$deserialize$2 r7 = new net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1$invoke$$inlined$deserialize$2
            r7.<init>()
            java.lang.reflect.Type r7 = r7.getType()
            p000.vx2.m53587c(r7, r4)
            boolean r4 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x00a2
            r4 = r7
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r8 = p000.xj2.m30136a(r4)
            if (r8 == 0) goto L_0x00a2
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r6)
            goto L_0x00a6
        L_0x00a2:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r7)
        L_0x00a6:
            java.lang.Object r3 = r3.deserialize(r5, r4)
            java.lang.String r4 = "it.context.deserialize(i….INSTRUCTIONS.key].array)"
            p000.vx2.m53590f(r3, r4)
            java.util.List r3 = (java.util.List) r3
            com.google.gson.JsonElement r10 = r10.mo165b()
            net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey r4 = net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKey.RECENTBLOCKHASH
            java.lang.String r4 = r4.getKey()
            com.google.gson.JsonElement r10 = p000.xn1.m30225b(r10, r4)
            java.lang.String r10 = p000.xn1.m30231h(r10)
            r0.<init>(r1, r2, r3, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransactionKt$solanaSignTransactionSerializer$1.invoke(ae1):net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransaction");
    }
}
