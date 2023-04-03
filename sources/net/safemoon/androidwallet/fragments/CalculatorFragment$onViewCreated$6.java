package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$onViewCreated$6 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ CalculatorFragment this$0;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.fragments.CalculatorFragment$onViewCreated$6$a */
    /* compiled from: CalculatorFragment.kt */
    public /* synthetic */ class C8374a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41928a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                net.safemoon.androidwallet.common.TokenType[] r0 = net.safemoon.androidwallet.common.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20_TEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20_TEST     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f41928a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.CalculatorFragment$onViewCreated$6.C8374a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$onViewCreated$6(CalculatorFragment calculatorFragment) {
        super(1);
        this.this$0 = calculatorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(net.safemoon.androidwallet.common.TokenType r8) {
        /*
            r7 = this;
            net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$m r0 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p
            java.util.List r0 = r0.mo57121d()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            r5 = r1
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r5 = r5.getFirst()
            if (r5 != r8) goto L_0x0022
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r3
        L_0x0023:
            if (r5 == 0) goto L_0x000a
            goto L_0x0027
        L_0x0026:
            r1 = r4
        L_0x0027:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = r1.getSecond()
            java.util.List r0 = (java.util.List) r0
            goto L_0x0033
        L_0x0032:
            r0 = r4
        L_0x0033:
            net.safemoon.androidwallet.fragments.CalculatorFragment r1 = r7.this$0
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel r1 = r1.mo57452j0()
            k04 r1 = r1.mo61011u()
            if (r8 != 0) goto L_0x0041
            r5 = -1
            goto L_0x0049
        L_0x0041:
            int[] r5 = net.safemoon.androidwallet.fragments.CalculatorFragment$onViewCreated$6.C8374a.f41928a
            int r6 = r8.ordinal()
            r5 = r5[r6]
        L_0x0049:
            if (r5 == r2) goto L_0x0068
            r6 = 2
            if (r5 == r6) goto L_0x0068
            r2 = 3
            if (r5 == r2) goto L_0x005e
            r2 = 4
            if (r5 == r2) goto L_0x005e
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47332c0(r0, r3)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0071
        L_0x005e:
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47332c0(r0, r3)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0071
        L_0x0068:
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47332c0(r0, r2)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x0071:
            r1.postValue(r4)
            net.safemoon.androidwallet.fragments.CalculatorFragment r0 = r7.this$0
            net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r0 = r0.mo57448f0()
            java.lang.String r1 = "it"
            p000.vx2.m53590f(r8, r1)
            r0.mo60966m(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.CalculatorFragment$onViewCreated$6.invoke(net.safemoon.androidwallet.common.TokenType):void");
    }
}
