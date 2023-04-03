package net.safemoon.androidwallet.mapper.token;

import android.content.Context;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/mapper/token/TokenDisplayModelMapper;", "Lyo2;", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "tokenList", "Lnet/safemoon/androidwallet/common/TokenType;", "_selectedTokenType", "Lvc;", "a", "(Landroidx/lifecycle/LiveData;Lnet/safemoon/androidwallet/common/TokenType;Lns0;)Ljava/lang/Object;", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lco2;", "b", "Lco2;", "getIsUserHasTokenUseCase", "<init>", "(Landroid/content/Context;Lco2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TokenDisplayModelMapper.kt */
public final class TokenDisplayModelMapper implements yo2 {

    /* renamed from: a */
    public final Context f42442a;

    /* renamed from: b */
    public final co2 f42443b;

    public TokenDisplayModelMapper(Context context, co2 co2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(co2, "getIsUserHasTokenUseCase");
        this.f42442a = context;
        this.f42443b = co2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: net.safemoon.androidwallet.model.token.abstraction.IToken} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo58178a(androidx.lifecycle.LiveData<java.util.List<net.safemoon.androidwallet.model.token.abstraction.IToken>> r27, net.safemoon.androidwallet.common.TokenType r28, p000.ns0<? super androidx.lifecycle.LiveData<java.util.List<p000.C9449vc>>> r29) {
        /*
            r26 = this;
            r0 = r29
            boolean r1 = r0 instanceof net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper$map$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper$map$1 r1 = (net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper$map$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r26
            goto L_0x001e
        L_0x0017:
            net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper$map$1 r1 = new net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper$map$1
            r2 = r26
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L_0x006d
            if (r4 != r5) goto L_0x0065
            int r4 = r1.I$0
            java.lang.Object r6 = r1.L$9
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$8
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.L$7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.L$6
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.L$4
            net.safemoon.androidwallet.model.token.abstraction.IToken r11 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r11
            java.lang.Object r12 = r1.L$3
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r1.L$2
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r1.L$1
            net.safemoon.androidwallet.common.TokenType r14 = (net.safemoon.androidwallet.common.TokenType) r14
            java.lang.Object r15 = r1.L$0
            net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper r15 = (net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper) r15
            p000.hg5.m45199b(r0)
            r17 = r4
            r20 = r7
            r19 = r8
            r18 = r9
            r16 = r10
            r4 = r15
            goto L_0x0105
        L_0x0065:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x006d:
            p000.hg5.m45199b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r4 = r27.getValue()
            p000.vx2.m53588d(r4)
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            r6 = r0
            r15 = r2
            r12 = r4
            r0 = r28
        L_0x0087:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0129
            java.lang.Object r4 = r12.next()
            r11 = r4
            net.safemoon.androidwallet.model.token.abstraction.IToken r11 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r11
            net.safemoon.androidwallet.common.TokenType r4 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN
            if (r0 != r4) goto L_0x00a3
            net.safemoon.androidwallet.common.TokenType$a r4 = net.safemoon.androidwallet.common.TokenType.Companion
            int r7 = r11.getChainId()
            net.safemoon.androidwallet.common.TokenType r4 = r4.mo57099b(r7)
            goto L_0x00a4
        L_0x00a3:
            r4 = r0
        L_0x00a4:
            java.lang.String r10 = r11.getSymbolWithType()
            java.lang.String r7 = r11.getIconResName()
            java.lang.Integer r7 = p000.xb6.m73916n(r7)
            if (r7 != 0) goto L_0x00c9
            android.content.Context r7 = r15.f42442a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r8 = r11.getIconResName()
            android.content.Context r9 = r15.f42442a
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r13 = "drawable"
            int r7 = r7.getIdentifier(r8, r13, r9)
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            java.lang.String r9 = r11.getIconResName()
            java.lang.String r8 = r11.getName()
            java.lang.String r13 = r11.getSymbol()
            co2 r14 = r15.f42443b
            r1.L$0 = r15
            r1.L$1 = r0
            r1.L$2 = r6
            r1.L$3 = r12
            r1.L$4 = r11
            r1.L$5 = r10
            r1.L$6 = r9
            r1.L$7 = r8
            r1.L$8 = r13
            r1.L$9 = r6
            r1.I$0 = r7
            r1.label = r5
            java.lang.Object r4 = r14.mo50927a(r11, r4, r1)
            if (r4 != r3) goto L_0x00f7
            return r3
        L_0x00f7:
            r14 = r0
            r0 = r4
            r17 = r7
            r19 = r8
            r18 = r9
            r16 = r10
            r20 = r13
            r4 = r15
            r13 = r6
        L_0x0105:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r21 = r0.booleanValue()
            java.lang.String r22 = r11.getContractAddress()
            int r24 = r11.getDecimals()
            int r23 = r11.getChainId()
            boolean r25 = r11.getAllowSwap()
            vc r0 = new vc
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.add(r0)
            r15 = r4
            r6 = r13
            r0 = r14
            goto L_0x0087
        L_0x0129:
            k04 r0 = new k04
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper.mo58178a(androidx.lifecycle.LiveData, net.safemoon.androidwallet.common.TokenType, ns0):java.lang.Object");
    }
}
