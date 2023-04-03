package net.safemoon.androidwallet.fragments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.swap.Swap;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/swap/Swap;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$11 extends Lambda implements rc2<List<? extends Swap>, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$11(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends Swap>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        if (p000.vx2.m53586b(r4 != null ? r4.getSymbol() : null, r0.this$0.f42142C) != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        r4 = r2.chainId;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x028f A[LOOP:3: B:117:0x020e->B:138:0x028f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0319 A[LOOP:4: B:141:0x029c->B:162:0x0319, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0294 A[EDGE_INSN: B:192:0x0294->B:140:0x0294 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x031d A[EDGE_INSN: B:195:0x031d->B:164:0x031d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<? extends net.safemoon.androidwallet.model.swap.Swap> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "it"
            p000.vx2.m53590f(r1, r2)
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r19)
            net.safemoon.androidwallet.model.swap.Swap r2 = (net.safemoon.androidwallet.model.swap.Swap) r2
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            net.safemoon.androidwallet.common.TokenType r3 = r3.mo57710e1()
            int r3 = r3.getChainId()
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            int r4 = r4.f42148Q
            java.lang.String r5 = "USDC"
            java.lang.String r6 = "it.address"
            java.lang.String r7 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r9 = 1
            r10 = 0
            if (r4 >= 0) goto L_0x01f6
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            int r4 = r4.f42149U
            if (r4 >= 0) goto L_0x01f6
            if (r2 == 0) goto L_0x0040
            java.lang.Integer r4 = r2.chainId
            if (r4 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0040
            r4 = r9
            goto L_0x0041
        L_0x0040:
            r4 = r10
        L_0x0041:
            if (r4 == 0) goto L_0x01f6
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r4 = r2.mo57704Y0()
            r11 = -1
            if (r4 == 0) goto L_0x0100
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r4 = r4.mo57704Y0()
            if (r4 == 0) goto L_0x0067
            java.lang.String r4 = r4.getContractAddress()
            if (r4 == 0) goto L_0x0067
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0062
            r4 = r9
            goto L_0x0063
        L_0x0062:
            r4 = r10
        L_0x0063:
            if (r4 != r9) goto L_0x0067
            r4 = r9
            goto L_0x0068
        L_0x0067:
            r4 = r10
        L_0x0068:
            if (r4 == 0) goto L_0x0100
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r4 = r4.mo57704Y0()
            if (r4 == 0) goto L_0x0077
            java.lang.String r4 = r4.getSymbol()
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            net.safemoon.androidwallet.fragments.SwapFragment r12 = r0.this$0
            java.lang.String r12 = r12.f42140A
            boolean r4 = p000.vx2.m53586b(r4, r12)
            if (r4 != 0) goto L_0x00b8
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r4 = r4.mo57704Y0()
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = r4.getSymbol()
            goto L_0x0092
        L_0x0091:
            r4 = 0
        L_0x0092:
            net.safemoon.androidwallet.fragments.SwapFragment r12 = r0.this$0
            java.lang.String r12 = r12.f42141B
            boolean r4 = p000.vx2.m53586b(r4, r12)
            if (r4 != 0) goto L_0x00b8
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r4 = r4.mo57704Y0()
            if (r4 == 0) goto L_0x00ab
            java.lang.String r4 = r4.getSymbol()
            goto L_0x00ac
        L_0x00ab:
            r4 = 0
        L_0x00ac:
            net.safemoon.androidwallet.fragments.SwapFragment r12 = r0.this$0
            java.lang.String r12 = r12.f42142C
            boolean r4 = p000.vx2.m53586b(r4, r12)
            if (r4 == 0) goto L_0x0100
        L_0x00b8:
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            java.util.Iterator r12 = r19.iterator()
            r13 = r10
        L_0x00bf:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00fa
            java.lang.Object r14 = r12.next()
            net.safemoon.androidwallet.model.swap.Swap r14 = (net.safemoon.androidwallet.model.swap.Swap) r14
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r15 = r4.mo57704Y0()
            if (r15 == 0) goto L_0x00e1
            java.lang.String r15 = r15.getContractAddress()
            if (r15 == 0) goto L_0x00e1
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r15.toLowerCase(r8)
            p000.vx2.m53590f(r8, r7)
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            java.lang.String r14 = r14.address
            p000.vx2.m53590f(r14, r6)
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            p000.vx2.m53590f(r14, r7)
            boolean r8 = p000.vx2.m53586b(r8, r14)
            if (r8 == 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            int r13 = r13 + 1
            goto L_0x00bf
        L_0x00fa:
            r13 = r11
        L_0x00fb:
            int r4 = p000.d75.m43382d(r13, r10)
            goto L_0x0101
        L_0x0100:
            r4 = r10
        L_0x0101:
            r2.f42148Q = r4
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r4 = r2.mo57704Y0()
            if (r4 == 0) goto L_0x017b
            net.safemoon.androidwallet.fragments.SwapFragment r4 = r0.this$0
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r4 = r4.mo57704Y0()
            if (r4 == 0) goto L_0x0127
            java.lang.String r4 = r4.getContractAddress()
            if (r4 == 0) goto L_0x0127
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0122
            r4 = r9
            goto L_0x0123
        L_0x0122:
            r4 = r10
        L_0x0123:
            if (r4 != r9) goto L_0x0127
            r4 = r9
            goto L_0x0128
        L_0x0127:
            r4 = r10
        L_0x0128:
            if (r4 == 0) goto L_0x017b
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            int r3 = r3.f42148Q
            if (r3 != 0) goto L_0x0179
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            java.util.Iterator r4 = r19.iterator()
        L_0x0138:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0174
            java.lang.Object r5 = r4.next()
            net.safemoon.androidwallet.model.swap.Swap r5 = (net.safemoon.androidwallet.model.swap.Swap) r5
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r8 = r3.mo57704Y0()
            if (r8 == 0) goto L_0x015a
            java.lang.String r8 = r8.getContractAddress()
            if (r8 == 0) goto L_0x015a
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r12)
            p000.vx2.m53590f(r8, r7)
            goto L_0x015b
        L_0x015a:
            r8 = 0
        L_0x015b:
            java.lang.String r5 = r5.address
            p000.vx2.m53590f(r5, r6)
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r12)
            p000.vx2.m53590f(r5, r7)
            boolean r5 = p000.vx2.m53586b(r8, r5)
            if (r5 == 0) goto L_0x0171
            r11 = r10
            goto L_0x0174
        L_0x0171:
            int r10 = r10 + 1
            goto L_0x0138
        L_0x0174:
            int r9 = p000.d75.m43382d(r11, r9)
            goto L_0x01a7
        L_0x0179:
            r9 = r10
            goto L_0x01a7
        L_0x017b:
            net.safemoon.androidwallet.common.TokenType r4 = net.safemoon.androidwallet.common.TokenType.ERC_20
            int r4 = r4.getChainId()
            if (r3 != r4) goto L_0x01a7
            java.util.Iterator r3 = r19.iterator()
        L_0x0187:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x019e
            java.lang.Object r4 = r3.next()
            r6 = r4
            net.safemoon.androidwallet.model.swap.Swap r6 = (net.safemoon.androidwallet.model.swap.Swap) r6
            java.lang.String r6 = r6.symbol
            boolean r6 = p000.vx2.m53586b(r6, r5)
            if (r6 == 0) goto L_0x0187
            r8 = r4
            goto L_0x019f
        L_0x019e:
            r8 = 0
        L_0x019f:
            net.safemoon.androidwallet.model.swap.Swap r8 = (net.safemoon.androidwallet.model.swap.Swap) r8
            if (r8 == 0) goto L_0x01a7
            int r9 = r1.indexOf(r8)
        L_0x01a7:
            r2.f42149U = r9
            int r2 = r19.size()
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            int r3 = r3.f42148Q
            if (r2 <= r3) goto L_0x01cf
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            int r2 = r2.f42148Q
            java.lang.Object r2 = r1.get(r2)
            net.safemoon.androidwallet.model.swap.Swap r2 = (net.safemoon.androidwallet.model.swap.Swap) r2
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r3 = r3.mo57712g1()
            k04 r3 = r3.mo61553B0()
            r3.setValue(r2)
        L_0x01cf:
            int r2 = r19.size()
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            int r3 = r3.f42149U
            if (r2 <= r3) goto L_0x03a6
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            int r2 = r2.f42149U
            java.lang.Object r1 = r1.get(r2)
            net.safemoon.androidwallet.model.swap.Swap r1 = (net.safemoon.androidwallet.model.swap.Swap) r1
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r2 = r2.mo57712g1()
            k04 r2 = r2.mo61604c0()
            r2.setValue(r1)
            goto L_0x03a6
        L_0x01f6:
            if (r2 == 0) goto L_0x0205
            java.lang.Integer r2 = r2.chainId
            if (r2 != 0) goto L_0x01fd
            goto L_0x0205
        L_0x01fd:
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x0205
            r2 = r9
            goto L_0x0206
        L_0x0205:
            r2 = r10
        L_0x0206:
            if (r2 == 0) goto L_0x03a6
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            java.util.Iterator r4 = r19.iterator()
        L_0x020e:
            boolean r8 = r4.hasNext()
            java.lang.String r11 = "symbol"
            java.lang.String r12 = "it.symbol"
            java.lang.String r13 = "address"
            if (r8 == 0) goto L_0x0293
            java.lang.Object r8 = r4.next()
            r14 = r8
            net.safemoon.androidwallet.model.swap.Swap r14 = (net.safemoon.androidwallet.model.swap.Swap) r14
            java.lang.String r15 = r14.address
            p000.vx2.m53590f(r15, r6)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r15 = r15.toLowerCase(r9)
            p000.vx2.m53590f(r15, r7)
            net.safemoon.androidwallet.viewmodels.SwapViewModel r16 = r2.mo57712g1()
            k04 r16 = r16.mo61553B0()
            java.lang.Object r16 = r16.getValue()
            r10 = r16
            net.safemoon.androidwallet.model.swap.Swap r10 = (net.safemoon.androidwallet.model.swap.Swap) r10
            if (r10 == 0) goto L_0x0250
            java.lang.String r10 = r10.address
            if (r10 == 0) goto L_0x0250
            p000.vx2.m53590f(r10, r13)
            java.lang.String r10 = r10.toLowerCase(r9)
            p000.vx2.m53590f(r10, r7)
            goto L_0x0251
        L_0x0250:
            r10 = 0
        L_0x0251:
            boolean r10 = p000.vx2.m53586b(r15, r10)
            if (r10 == 0) goto L_0x028b
            java.lang.String r10 = r14.symbol
            p000.vx2.m53590f(r10, r12)
            java.lang.String r10 = r10.toLowerCase(r9)
            p000.vx2.m53590f(r10, r7)
            net.safemoon.androidwallet.viewmodels.SwapViewModel r14 = r2.mo57712g1()
            k04 r14 = r14.mo61553B0()
            java.lang.Object r14 = r14.getValue()
            net.safemoon.androidwallet.model.swap.Swap r14 = (net.safemoon.androidwallet.model.swap.Swap) r14
            if (r14 == 0) goto L_0x0282
            java.lang.String r14 = r14.symbol
            if (r14 == 0) goto L_0x0282
            p000.vx2.m53590f(r14, r11)
            java.lang.String r9 = r14.toLowerCase(r9)
            p000.vx2.m53590f(r9, r7)
            goto L_0x0283
        L_0x0282:
            r9 = 0
        L_0x0283:
            boolean r9 = p000.vx2.m53586b(r10, r9)
            if (r9 == 0) goto L_0x028b
            r9 = 1
            goto L_0x028c
        L_0x028b:
            r9 = 0
        L_0x028c:
            if (r9 == 0) goto L_0x028f
            goto L_0x0294
        L_0x028f:
            r9 = 1
            r10 = 0
            goto L_0x020e
        L_0x0293:
            r8 = 0
        L_0x0294:
            net.safemoon.androidwallet.model.swap.Swap r8 = (net.safemoon.androidwallet.model.swap.Swap) r8
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            java.util.Iterator r4 = r19.iterator()
        L_0x029c:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x031c
            java.lang.Object r9 = r4.next()
            r10 = r9
            net.safemoon.androidwallet.model.swap.Swap r10 = (net.safemoon.androidwallet.model.swap.Swap) r10
            java.lang.String r14 = r10.address
            p000.vx2.m53590f(r14, r6)
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            p000.vx2.m53590f(r14, r7)
            net.safemoon.androidwallet.viewmodels.SwapViewModel r16 = r2.mo57712g1()
            k04 r16 = r16.mo61604c0()
            java.lang.Object r16 = r16.getValue()
            r17 = r4
            r4 = r16
            net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4
            if (r4 == 0) goto L_0x02da
            java.lang.String r4 = r4.address
            if (r4 == 0) goto L_0x02da
            p000.vx2.m53590f(r4, r13)
            java.lang.String r4 = r4.toLowerCase(r15)
            p000.vx2.m53590f(r4, r7)
            goto L_0x02db
        L_0x02da:
            r4 = 0
        L_0x02db:
            boolean r4 = p000.vx2.m53586b(r14, r4)
            if (r4 == 0) goto L_0x0315
            java.lang.String r4 = r10.symbol
            p000.vx2.m53590f(r4, r12)
            java.lang.String r4 = r4.toLowerCase(r15)
            p000.vx2.m53590f(r4, r7)
            net.safemoon.androidwallet.viewmodels.SwapViewModel r10 = r2.mo57712g1()
            k04 r10 = r10.mo61604c0()
            java.lang.Object r10 = r10.getValue()
            net.safemoon.androidwallet.model.swap.Swap r10 = (net.safemoon.androidwallet.model.swap.Swap) r10
            if (r10 == 0) goto L_0x030c
            java.lang.String r10 = r10.symbol
            if (r10 == 0) goto L_0x030c
            p000.vx2.m53590f(r10, r11)
            java.lang.String r10 = r10.toLowerCase(r15)
            p000.vx2.m53590f(r10, r7)
            goto L_0x030d
        L_0x030c:
            r10 = 0
        L_0x030d:
            boolean r4 = p000.vx2.m53586b(r4, r10)
            if (r4 == 0) goto L_0x0315
            r4 = 1
            goto L_0x0316
        L_0x0315:
            r4 = 0
        L_0x0316:
            if (r4 == 0) goto L_0x0319
            goto L_0x031d
        L_0x0319:
            r4 = r17
            goto L_0x029c
        L_0x031c:
            r9 = 0
        L_0x031d:
            net.safemoon.androidwallet.model.swap.Swap r9 = (net.safemoon.androidwallet.model.swap.Swap) r9
            if (r8 == 0) goto L_0x0323
            if (r9 != 0) goto L_0x03a6
        L_0x0323:
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            r4 = 0
            r2.f42148Q = r4
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            net.safemoon.androidwallet.common.TokenType r4 = net.safemoon.androidwallet.common.TokenType.ERC_20
            int r4 = r4.getChainId()
            if (r3 != r4) goto L_0x0358
            java.util.Iterator r3 = r19.iterator()
        L_0x0337:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x034e
            java.lang.Object r4 = r3.next()
            r6 = r4
            net.safemoon.androidwallet.model.swap.Swap r6 = (net.safemoon.androidwallet.model.swap.Swap) r6
            java.lang.String r6 = r6.symbol
            boolean r6 = p000.vx2.m53586b(r6, r5)
            if (r6 == 0) goto L_0x0337
            r8 = r4
            goto L_0x034f
        L_0x034e:
            r8 = 0
        L_0x034f:
            net.safemoon.androidwallet.model.swap.Swap r8 = (net.safemoon.androidwallet.model.swap.Swap) r8
            if (r8 == 0) goto L_0x0358
            int r9 = r1.indexOf(r8)
            goto L_0x0359
        L_0x0358:
            r9 = 1
        L_0x0359:
            r2.f42149U = r9
            int r2 = r19.size()
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            int r3 = r3.f42148Q
            if (r2 <= r3) goto L_0x0381
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            int r2 = r2.f42148Q
            java.lang.Object r2 = r1.get(r2)
            net.safemoon.androidwallet.model.swap.Swap r2 = (net.safemoon.androidwallet.model.swap.Swap) r2
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r3 = r3.mo57712g1()
            k04 r3 = r3.mo61553B0()
            r3.setValue(r2)
        L_0x0381:
            int r2 = r19.size()
            net.safemoon.androidwallet.fragments.SwapFragment r3 = r0.this$0
            int r3 = r3.f42149U
            if (r2 <= r3) goto L_0x03a6
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            int r2 = r2.f42149U
            java.lang.Object r1 = r1.get(r2)
            net.safemoon.androidwallet.model.swap.Swap r1 = (net.safemoon.androidwallet.model.swap.Swap) r1
            net.safemoon.androidwallet.fragments.SwapFragment r2 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r2 = r2.mo57712g1()
            k04 r2 = r2.mo61604c0()
            r2.setValue(r1)
        L_0x03a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwapFragment$onViewCreated$11.invoke(java.util.List):void");
    }
}
