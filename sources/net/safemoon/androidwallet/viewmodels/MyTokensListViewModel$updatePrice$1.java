package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$updatePrice$1", mo48632f = "MyTokensListViewModel.kt", mo48633l = {315}, mo48634m = "invokeSuspend")
/* compiled from: MyTokensListViewModel.kt */
public final class MyTokensListViewModel$updatePrice$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ List<IToken> $iTokens;
    public int label;
    public final /* synthetic */ MyTokensListViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$updatePrice$1$1", mo48632f = "MyTokensListViewModel.kt", mo48633l = {345, 352, 360, 406, 407, 411, 437, 453}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$updatePrice$1$1 */
    /* compiled from: MyTokensListViewModel.kt */
    public static final class C87211 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87211(list, myTokensListViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87211) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v44, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: net.safemoon.androidwallet.viewmodels.MyTokensListViewModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v45, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v44, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: net.safemoon.androidwallet.viewmodels.MyTokensListViewModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v45, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v46, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:186|187|188|(1:190)|191|194|195|(4:198|(2:200|327)(1:326)|324|196)|325|183|(0)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:133|(1:135)|136|137|(1:139)(5:140|141|142|(1:144)(7:145|146|(1:148)|149|(4:152|(2:154|320)(1:319)|317|150)|318|157)|144)|139) */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0473, code lost:
            r14 = r2;
            r15 = r7;
            r28 = r13;
            r13 = r10;
            r10 = r28;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0215, code lost:
            r6 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokensInfoResult) ((p000.bg5) r6).mo50578a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x021d, code lost:
            if (r6 == null) goto L_0x0224;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x021f, code lost:
            r6 = r6.getData();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0224, code lost:
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0225, code lost:
            r28 = r6;
            r6 = r2;
            r2 = r28;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02ae A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x02af  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x02e1 A[LOOP:1: B:113:0x02d9->B:115:0x02e1, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0313 A[LOOP:2: B:117:0x030d->B:119:0x0313, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x033d  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x036a  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x0389  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x048d  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x0495 A[SYNTHETIC, Splitter:B:163:0x0495] */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x04fc  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0523  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x0577 A[Catch:{ Exception -> 0x051d }] */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x058c  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x05a7  */
        /* JADX WARNING: Removed duplicated region for block: B:217:0x05ea A[Catch:{ Exception -> 0x078c }] */
        /* JADX WARNING: Removed duplicated region for block: B:225:0x063d  */
        /* JADX WARNING: Removed duplicated region for block: B:240:0x0667 A[Catch:{ Exception -> 0x078c }] */
        /* JADX WARNING: Removed duplicated region for block: B:255:0x06a8 A[Catch:{ Exception -> 0x078a }] */
        /* JADX WARNING: Removed duplicated region for block: B:263:0x06ca A[Catch:{ Exception -> 0x078a }] */
        /* JADX WARNING: Removed duplicated region for block: B:268:0x06de A[Catch:{ Exception -> 0x078a }] */
        /* JADX WARNING: Removed duplicated region for block: B:274:0x070d A[Catch:{ Exception -> 0x078a }] */
        /* JADX WARNING: Removed duplicated region for block: B:331:0x06a1 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:334:0x0708 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0232  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                r30 = this;
                r1 = r30
                java.lang.Object r0 = p000.wx2.m54101d()
                int r2 = r1.label
                java.lang.String r3 = "USD"
                java.lang.String r4 = "{\n                    AP…tring()\n                }"
                java.lang.String r5 = "data"
                java.lang.String r6 = "it"
                java.lang.String r7 = "{}"
                java.lang.String r8 = "CUSTOM_"
                switch(r2) {
                    case 0: goto L_0x014e;
                    case 1: goto L_0x0131;
                    case 2: goto L_0x0114;
                    case 3: goto L_0x00f7;
                    case 4: goto L_0x00c3;
                    case 5: goto L_0x0086;
                    case 6: goto L_0x005f;
                    case 7: goto L_0x003e;
                    case 8: goto L_0x001f;
                    default: goto L_0x0017;
                }
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                java.lang.Object r2 = r1.L$2
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r1.L$1
                org.json.JSONObject r4 = (org.json.JSONObject) r4
                java.lang.Object r13 = r1.L$0
                java.util.List r13 = (java.util.List) r13
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x0037 }
                r9 = r1
                r11 = r6
                r18 = r7
                r10 = 1
                r1 = r31
                goto L_0x054d
            L_0x0037:
                r9 = r1
                r11 = r6
                r18 = r7
                r10 = 1
                goto L_0x0561
            L_0x003e:
                java.lang.Object r2 = r1.L$2
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.lang.Object r4 = r1.L$1
                org.json.JSONObject r4 = (org.json.JSONObject) r4
                java.lang.Object r13 = r1.L$0
                java.util.List r13 = (java.util.List) r13
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x0057 }
                r9 = r1
                r17 = r6
                r18 = r7
                r10 = 1
                r1 = r31
                goto L_0x04cf
            L_0x0057:
                r9 = r1
                r17 = r6
                r18 = r7
                r10 = 1
                goto L_0x04e5
            L_0x005f:
                java.lang.Object r2 = r1.L$6
                net.safemoon.androidwallet.model.token.abstraction.IToken r2 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r2
                java.lang.Object r4 = r1.L$5
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r13 = r1.L$4
                net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r13 = (net.safemoon.androidwallet.viewmodels.MyTokensListViewModel) r13
                java.lang.Object r14 = r1.L$3
                java.util.ArrayList r14 = (java.util.ArrayList) r14
                java.lang.Object r15 = r1.L$2
                java.util.ArrayList r15 = (java.util.ArrayList) r15
                java.lang.Object r9 = r1.L$1
                org.json.JSONObject r9 = (org.json.JSONObject) r9
                java.lang.Object r10 = r1.L$0
                java.util.List r10 = (java.util.List) r10
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x00ef }
                r17 = r6
                r18 = r7
                r6 = r9
                r9 = r1
                goto L_0x0449
            L_0x0086:
                java.lang.Object r2 = r1.L$7
                net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r2 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r2
                java.lang.Object r4 = r1.L$6
                net.safemoon.androidwallet.model.token.abstraction.IToken r4 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r4
                java.lang.Object r9 = r1.L$5
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r1.L$4
                r13 = r10
                net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r13 = (net.safemoon.androidwallet.viewmodels.MyTokensListViewModel) r13
                java.lang.Object r10 = r1.L$3
                r14 = r10
                java.util.ArrayList r14 = (java.util.ArrayList) r14
                java.lang.Object r10 = r1.L$2
                r15 = r10
                java.util.ArrayList r15 = (java.util.ArrayList) r15
                java.lang.Object r10 = r1.L$1
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                java.lang.Object r11 = r1.L$0
                java.util.List r11 = (java.util.List) r11
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x00bb }
                r17 = r6
                r18 = r7
                r6 = r10
                r10 = r11
                r28 = r9
                r9 = r1
                r1 = r2
                r2 = r4
                r4 = r28
                goto L_0x0420
            L_0x00bb:
                r17 = r6
                r18 = r7
                r4 = r9
                r6 = r10
                r10 = r11
                goto L_0x00f4
            L_0x00c3:
                java.lang.Object r2 = r1.L$6
                net.safemoon.androidwallet.model.token.abstraction.IToken r2 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r2
                java.lang.Object r4 = r1.L$5
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r9 = r1.L$4
                r13 = r9
                net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r13 = (net.safemoon.androidwallet.viewmodels.MyTokensListViewModel) r13
                java.lang.Object r9 = r1.L$3
                r14 = r9
                java.util.ArrayList r14 = (java.util.ArrayList) r14
                java.lang.Object r9 = r1.L$2
                r15 = r9
                java.util.ArrayList r15 = (java.util.ArrayList) r15
                java.lang.Object r9 = r1.L$1
                org.json.JSONObject r9 = (org.json.JSONObject) r9
                java.lang.Object r10 = r1.L$0
                java.util.List r10 = (java.util.List) r10
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x00ef }
                r17 = r6
                r18 = r7
                r6 = r9
                r9 = r1
                r1 = r31
                goto L_0x03de
            L_0x00ef:
                r17 = r6
                r18 = r7
                r6 = r9
            L_0x00f4:
                r9 = r1
                goto L_0x047a
            L_0x00f7:
                java.lang.Object r2 = r1.L$2
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r9 = r1.L$1
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r10 = r1.L$0
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x010e }
                r17 = r6
                r18 = r7
                r7 = r31
                goto L_0x02b0
            L_0x010e:
                r17 = r6
                r18 = r7
                goto L_0x02c4
            L_0x0114:
                java.lang.Object r2 = r1.L$2
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r9 = r1.L$1
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                java.lang.Object r10 = r1.L$0
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x012b }
                r17 = r6
                r18 = r7
                r7 = r31
                goto L_0x0263
            L_0x012b:
                r17 = r6
                r18 = r7
                goto L_0x027c
            L_0x0131:
                java.lang.Object r2 = r1.L$2
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.lang.Object r9 = r1.L$1
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                java.lang.Object r10 = r1.L$0
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                p000.hg5.m45199b(r31)     // Catch:{ Exception -> 0x0148 }
                r17 = r6
                r18 = r7
                r6 = r31
                goto L_0x0215
            L_0x0148:
                r17 = r6
                r18 = r7
                goto L_0x022b
            L_0x014e:
                p000.hg5.m45199b(r31)
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.List<net.safemoon.androidwallet.model.token.abstraction.IToken> r13 = r3
                java.util.Iterator r13 = r13.iterator()
            L_0x016b:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x01ee
                java.lang.Object r14 = r13.next()
                net.safemoon.androidwallet.model.token.abstraction.IToken r14 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r14
                java.lang.String r15 = r14.getContractAddress()
                java.lang.String r12 = r14.getSymbol()
                java.lang.String r17 = r14.getIconResName()
                r18 = r7
                java.lang.Integer r7 = p000.xb6.m73916n(r17)
                java.lang.String r7 = p000.q70.m71186b(r15, r12, r7)
                if (r7 == 0) goto L_0x01ad
                java.lang.String r12 = r14.getSymbolWithType()
                r17 = r6
                r31 = r13
                r6 = 0
                r13 = 0
                r15 = 2
                boolean r12 = p000.yb6.m74336M(r12, r8, r13, r15, r6)
                if (r12 == 0) goto L_0x01a5
                boolean r7 = r2.add(r7)
                goto L_0x01a9
            L_0x01a5:
                boolean r7 = r9.add(r7)
            L_0x01a9:
                p000.a40.m31670a(r7)
                goto L_0x01b4
            L_0x01ad:
                r17 = r6
                r31 = r13
                r6 = 0
                r13 = 0
                r15 = 2
            L_0x01b4:
                java.lang.String r7 = r14.getSymbolWithType()
                boolean r7 = p000.yb6.m74336M(r7, r8, r13, r15, r6)
                if (r7 != 0) goto L_0x01e6
                java.lang.String r6 = r14.getContractAddress()
                int r6 = r6.length()
                if (r6 != 0) goto L_0x01ca
                r6 = 1
                goto L_0x01cb
            L_0x01ca:
                r6 = 0
            L_0x01cb:
                if (r6 == 0) goto L_0x01df
                net.safemoon.androidwallet.common.TokenType$a r6 = net.safemoon.androidwallet.common.TokenType.Companion
                int r7 = r14.getChainId()
                net.safemoon.androidwallet.common.TokenType r6 = r6.mo57099b(r7)
                java.lang.String r6 = r6.getWrapAddress()
                r11.add(r6)
                goto L_0x01e6
            L_0x01df:
                java.lang.String r6 = r14.getContractAddress()
                r11.add(r6)
            L_0x01e6:
                r13 = r31
                r6 = r17
                r7 = r18
                goto L_0x016b
            L_0x01ee:
                r17 = r6
                r18 = r7
                r10.addAll(r2)
                r10.addAll(r9)
                ho3 r6 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x022b }
                net.safemoon.androidwallet.model.tokensInfo.Request r7 = new net.safemoon.androidwallet.model.tokensInfo.Request     // Catch:{ Exception -> 0x022b }
                r7.<init>(r11)     // Catch:{ Exception -> 0x022b }
                k90 r6 = r6.mo52276e(r7)     // Catch:{ Exception -> 0x022b }
                r1.L$0 = r10     // Catch:{ Exception -> 0x022b }
                r1.L$1 = r9     // Catch:{ Exception -> 0x022b }
                r1.L$2 = r2     // Catch:{ Exception -> 0x022b }
                r7 = 1
                r1.label = r7     // Catch:{ Exception -> 0x022b }
                java.lang.Object r6 = retrofit2.KotlinExtensions.m71521c(r6, r1)     // Catch:{ Exception -> 0x022b }
                if (r6 != r0) goto L_0x0215
                return r0
            L_0x0215:
                bg5 r6 = (p000.bg5) r6     // Catch:{ Exception -> 0x022b }
                java.lang.Object r6 = r6.mo50578a()     // Catch:{ Exception -> 0x022b }
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokensInfoResult r6 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokensInfoResult) r6     // Catch:{ Exception -> 0x022b }
                if (r6 == 0) goto L_0x0224
                java.util.List r6 = r6.getData()     // Catch:{ Exception -> 0x022b }
                goto L_0x0225
            L_0x0224:
                r6 = 0
            L_0x0225:
                r28 = r6
                r6 = r2
                r2 = r28
                goto L_0x022d
            L_0x022b:
                r6 = r2
                r2 = 0
            L_0x022d:
                if (r2 != 0) goto L_0x0232
                r37 r0 = p000.r37.f33317a
                return r0
            L_0x0232:
                java.util.List r19 = kotlin.collections.CollectionsKt___CollectionsKt.m47322S(r9)
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 62
                r27 = 0
                java.lang.String r20 = ","
                java.lang.String r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r19, r20, r21, r22, r23, r24, r25, r26, r27)
                ho3 r9 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x027b }
                k90 r7 = r9.mo52273b(r7)     // Catch:{ Exception -> 0x027b }
                r1.L$0 = r10     // Catch:{ Exception -> 0x027b }
                r1.L$1 = r6     // Catch:{ Exception -> 0x027b }
                r1.L$2 = r2     // Catch:{ Exception -> 0x027b }
                r9 = 2
                r1.label = r9     // Catch:{ Exception -> 0x027b }
                java.lang.Object r7 = retrofit2.KotlinExtensions.m71521c(r7, r1)     // Catch:{ Exception -> 0x027b }
                if (r7 != r0) goto L_0x0262
                return r0
            L_0x0262:
                r9 = r6
            L_0x0263:
                bg5 r7 = (p000.bg5) r7     // Catch:{ Exception -> 0x027c }
                java.lang.Object r6 = r7.mo50578a()     // Catch:{ Exception -> 0x027c }
                p000.vx2.m53588d(r6)     // Catch:{ Exception -> 0x027c }
                com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6     // Catch:{ Exception -> 0x027c }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x027c }
                p000.vx2.m53590f(r6, r4)     // Catch:{ Exception -> 0x027c }
                r28 = r6
                r6 = r2
                r2 = r28
                goto L_0x027f
            L_0x027b:
                r9 = r6
            L_0x027c:
                r6 = r2
                r2 = r18
            L_0x027f:
                java.util.List r19 = kotlin.collections.CollectionsKt___CollectionsKt.m47322S(r9)
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 62
                r27 = 0
                java.lang.String r20 = ","
                java.lang.String r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r19, r20, r21, r22, r23, r24, r25, r26, r27)
                ho3 r9 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x02c3 }
                k90 r7 = r9.mo52273b(r7)     // Catch:{ Exception -> 0x02c3 }
                r1.L$0 = r10     // Catch:{ Exception -> 0x02c3 }
                r1.L$1 = r6     // Catch:{ Exception -> 0x02c3 }
                r1.L$2 = r2     // Catch:{ Exception -> 0x02c3 }
                r9 = 3
                r1.label = r9     // Catch:{ Exception -> 0x02c3 }
                java.lang.Object r7 = retrofit2.KotlinExtensions.m71521c(r7, r1)     // Catch:{ Exception -> 0x02c3 }
                if (r7 != r0) goto L_0x02af
                return r0
            L_0x02af:
                r9 = r6
            L_0x02b0:
                bg5 r7 = (p000.bg5) r7     // Catch:{ Exception -> 0x02c4 }
                java.lang.Object r6 = r7.mo50578a()     // Catch:{ Exception -> 0x02c4 }
                p000.vx2.m53588d(r6)     // Catch:{ Exception -> 0x02c4 }
                com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02c4 }
                p000.vx2.m53590f(r6, r4)     // Catch:{ Exception -> 0x02c4 }
                goto L_0x02c6
            L_0x02c3:
                r9 = r6
            L_0x02c4:
                r6 = r18
            L_0x02c6:
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>(r2)
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>(r6)
                java.util.Iterator r6 = r2.keys()
                java.lang.String r7 = "customJsonObject.keys()"
                p000.vx2.m53590f(r6, r7)
            L_0x02d9:
                boolean r7 = r6.hasNext()
                java.lang.String r11 = "id"
                if (r7 == 0) goto L_0x02f7
                java.lang.Object r7 = r6.next()
                java.lang.String r7 = (java.lang.String) r7
                org.json.JSONObject r7 = r2.getJSONObject(r7)
                int r11 = r7.getInt(r11)
                java.lang.String r11 = java.lang.String.valueOf(r11)
                r4.put(r11, r7)
                goto L_0x02d9
            L_0x02f7:
                java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47322S(r10)
                java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r2)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r7 = r4.keys()
                java.lang.String r10 = "allTokens.keys()"
                p000.vx2.m53590f(r7, r10)
            L_0x030d:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x0329
                java.lang.Object r10 = r7.next()
                java.lang.String r10 = (java.lang.String) r10
                org.json.JSONObject r10 = r4.getJSONObject(r10)
                int r10 = r10.getInt(r11)
                java.lang.String r10 = java.lang.String.valueOf(r10)
                r6.add(r10)
                goto L_0x030d
            L_0x0329:
                r2.removeAll(r6)
                java.util.List<net.safemoon.androidwallet.model.token.abstraction.IToken> r6 = r3
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x0337:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x0362
                java.lang.Object r10 = r6.next()
                r11 = r10
                net.safemoon.androidwallet.model.token.abstraction.IToken r11 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r11
                java.lang.String r12 = r11.getContractAddress()
                java.lang.String r13 = r11.getSymbol()
                java.lang.String r11 = r11.getIconResName()
                java.lang.Integer r11 = p000.xb6.m73916n(r11)
                java.lang.String r11 = p000.q70.m71186b(r12, r13, r11)
                boolean r11 = kotlin.collections.CollectionsKt___CollectionsKt.m47320R(r2, r11)
                if (r11 == 0) goto L_0x0337
                r7.add(r10)
                goto L_0x0337
            L_0x0362:
                boolean r2 = r7.isEmpty()
                r6 = 1
                r2 = r2 ^ r6
                if (r2 == 0) goto L_0x058c
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r10 = r4
                java.util.Iterator r7 = r7.iterator()
                r13 = r9
                r9 = r1
                r28 = r7
                r7 = r2
                r2 = r6
                r6 = r4
                r4 = r28
            L_0x0383:
                boolean r11 = r4.hasNext()
                if (r11 == 0) goto L_0x048d
                java.lang.Object r11 = r4.next()
                net.safemoon.androidwallet.model.token.abstraction.IToken r11 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r11
                java.lang.String r12 = r11.getSymbolWithType()
                r1 = 0
                r14 = 2
                r15 = 0
                boolean r12 = p000.yb6.m74336M(r12, r8, r15, r14, r1)
                if (r12 == 0) goto L_0x0482
                java.lang.String r1 = r11.getIconResName()
                java.lang.Integer r1 = p000.xb6.m73916n(r1)
                if (r1 == 0) goto L_0x03af
                java.lang.String r1 = r11.getIconResName()
                r7.add(r1)
                goto L_0x0489
            L_0x03af:
                p70 r1 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x0473 }
                java.lang.String r12 = r11.getContractAddress()     // Catch:{ Exception -> 0x0473 }
                k90 r1 = r1.mo65252d(r12)     // Catch:{ Exception -> 0x0473 }
                r9.L$0 = r13     // Catch:{ Exception -> 0x0473 }
                r9.L$1 = r6     // Catch:{ Exception -> 0x0473 }
                r9.L$2 = r7     // Catch:{ Exception -> 0x0473 }
                r9.L$3 = r2     // Catch:{ Exception -> 0x0473 }
                r9.L$4 = r10     // Catch:{ Exception -> 0x0473 }
                r9.L$5 = r4     // Catch:{ Exception -> 0x0473 }
                r9.L$6 = r11     // Catch:{ Exception -> 0x0473 }
                r12 = 0
                r9.L$7 = r12     // Catch:{ Exception -> 0x0473 }
                r12 = 4
                r9.label = r12     // Catch:{ Exception -> 0x0473 }
                java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r9)     // Catch:{ Exception -> 0x0473 }
                if (r1 != r0) goto L_0x03d6
                return r0
            L_0x03d6:
                r14 = r2
                r15 = r7
                r2 = r11
                r28 = r13
                r13 = r10
                r10 = r28
            L_0x03de:
                bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x047a }
                java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x047a }
                p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x047a }
                net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo r1 = (net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo) r1     // Catch:{ Exception -> 0x047a }
                java.util.List r1 = r1.getTokenDetails()     // Catch:{ Exception -> 0x047a }
                r7 = 0
                java.lang.Object r1 = r1.get(r7)     // Catch:{ Exception -> 0x047a }
                net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r1 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r1     // Catch:{ Exception -> 0x047a }
                xy0 r7 = r13.mo61291C()     // Catch:{ Exception -> 0x047a }
                java.lang.String r11 = r2.getSymbolWithType()     // Catch:{ Exception -> 0x047a }
                java.lang.Integer r12 = r1.f42452id     // Catch:{ Exception -> 0x047a }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x047a }
                r9.L$0 = r10     // Catch:{ Exception -> 0x047a }
                r9.L$1 = r6     // Catch:{ Exception -> 0x047a }
                r9.L$2 = r15     // Catch:{ Exception -> 0x047a }
                r9.L$3 = r14     // Catch:{ Exception -> 0x047a }
                r9.L$4 = r13     // Catch:{ Exception -> 0x047a }
                r9.L$5 = r4     // Catch:{ Exception -> 0x047a }
                r9.L$6 = r2     // Catch:{ Exception -> 0x047a }
                r9.L$7 = r1     // Catch:{ Exception -> 0x047a }
                r31 = r1
                r1 = 5
                r9.label = r1     // Catch:{ Exception -> 0x047a }
                java.lang.Object r1 = r7.mo66980f(r11, r12, r9)     // Catch:{ Exception -> 0x047a }
                if (r1 != r0) goto L_0x041e
                return r0
            L_0x041e:
                r1 = r31
            L_0x0420:
                ip2 r7 = r13.f42771c     // Catch:{ Exception -> 0x047a }
                java.lang.String r11 = r2.getSymbolWithType()     // Catch:{ Exception -> 0x047a }
                java.lang.Integer r1 = r1.f42452id     // Catch:{ Exception -> 0x047a }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x047a }
                r9.L$0 = r10     // Catch:{ Exception -> 0x047a }
                r9.L$1 = r6     // Catch:{ Exception -> 0x047a }
                r9.L$2 = r15     // Catch:{ Exception -> 0x047a }
                r9.L$3 = r14     // Catch:{ Exception -> 0x047a }
                r9.L$4 = r13     // Catch:{ Exception -> 0x047a }
                r9.L$5 = r4     // Catch:{ Exception -> 0x047a }
                r9.L$6 = r2     // Catch:{ Exception -> 0x047a }
                r12 = 0
                r9.L$7 = r12     // Catch:{ Exception -> 0x047a }
                r12 = 6
                r9.label = r12     // Catch:{ Exception -> 0x047a }
                java.lang.Object r1 = r7.mo50493e(r11, r1, r9)     // Catch:{ Exception -> 0x047a }
                if (r1 != r0) goto L_0x0449
                return r0
            L_0x0449:
                java.util.Set r1 = r13.f42779k     // Catch:{ Exception -> 0x047a }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x047a }
            L_0x0451:
                boolean r7 = r1.hasNext()     // Catch:{ Exception -> 0x047a }
                if (r7 == 0) goto L_0x047a
                java.lang.Object r7 = r1.next()     // Catch:{ Exception -> 0x047a }
                net.safemoon.androidwallet.model.token.abstraction.IToken r7 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r7     // Catch:{ Exception -> 0x047a }
                java.lang.String r7 = r7.getSymbolWithType()     // Catch:{ Exception -> 0x047a }
                java.lang.String r11 = r2.getSymbolWithType()     // Catch:{ Exception -> 0x047a }
                boolean r7 = p000.vx2.m53586b(r7, r11)     // Catch:{ Exception -> 0x047a }
                if (r7 == 0) goto L_0x0451
                java.util.Set r7 = r13.f42779k     // Catch:{ Exception -> 0x047a }
                r7.remove(r2)     // Catch:{ Exception -> 0x047a }
                goto L_0x0451
            L_0x0473:
                r14 = r2
                r15 = r7
                r28 = r13
                r13 = r10
                r10 = r28
            L_0x047a:
                r2 = r14
                r7 = r15
                r28 = r13
                r13 = r10
                r10 = r28
                goto L_0x0489
            L_0x0482:
                java.lang.String r1 = r11.getSymbol()
                r2.add(r1)
            L_0x0489:
                r1 = r30
                goto L_0x0383
            L_0x048d:
                boolean r1 = r7.isEmpty()
                r10 = 1
                r1 = r1 ^ r10
                if (r1 == 0) goto L_0x0515
                p70 r1 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x04e4 }
                java.lang.String r20 = ","
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 62
                r27 = 0
                r19 = r7
                java.lang.String r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x04e4 }
                k90 r1 = r1.mo65249a(r4, r3)     // Catch:{ Exception -> 0x04e4 }
                r9.L$0 = r13     // Catch:{ Exception -> 0x04e4 }
                r9.L$1 = r6     // Catch:{ Exception -> 0x04e4 }
                r9.L$2 = r2     // Catch:{ Exception -> 0x04e4 }
                r4 = 0
                r9.L$3 = r4     // Catch:{ Exception -> 0x04e4 }
                r9.L$4 = r4     // Catch:{ Exception -> 0x04e4 }
                r9.L$5 = r4     // Catch:{ Exception -> 0x04e4 }
                r9.L$6 = r4     // Catch:{ Exception -> 0x04e4 }
                r9.L$7 = r4     // Catch:{ Exception -> 0x04e4 }
                r4 = 7
                r9.label = r4     // Catch:{ Exception -> 0x04e4 }
                java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r9)     // Catch:{ Exception -> 0x04e4 }
                if (r1 != r0) goto L_0x04ce
                return r0
            L_0x04ce:
                r4 = r6
            L_0x04cf:
                bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x04e5 }
                java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x04e5 }
                p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x04e5 }
                com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch:{ Exception -> 0x04e5 }
                com.google.gson.JsonObject r1 = r1.getAsJsonObject(r5)     // Catch:{ Exception -> 0x04e5 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04e5 }
                r6 = r4
                goto L_0x04e8
            L_0x04e4:
                r4 = r6
            L_0x04e5:
                r6 = r4
                r1 = r18
            L_0x04e8:
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>(r1)
                java.util.Iterator r1 = r4.keys()
                java.lang.String r7 = "resultById.keys()"
                p000.vx2.m53590f(r1, r7)
            L_0x04f6:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L_0x0515
                java.lang.Object r7 = r1.next()
                java.lang.String r7 = (java.lang.String) r7
                r11 = r17
                if (r7 == 0) goto L_0x0512
                p000.vx2.m53590f(r7, r11)
                java.lang.String r12 = r4.getString(r7)
                r6.put(r7, r12)
                r37 r7 = p000.r37.f33317a
            L_0x0512:
                r17 = r11
                goto L_0x04f6
            L_0x0515:
                r11 = r17
                java.util.Iterator r1 = r2.iterator()
                r2 = r1
                r4 = r6
            L_0x051d:
                boolean r1 = r2.hasNext()
                if (r1 == 0) goto L_0x0590
                java.lang.Object r1 = r2.next()
                java.lang.String r1 = (java.lang.String) r1
                p70 r6 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x0561 }
                k90 r1 = r6.mo65250b(r1, r3)     // Catch:{ Exception -> 0x0561 }
                r9.L$0 = r13     // Catch:{ Exception -> 0x0561 }
                r9.L$1 = r4     // Catch:{ Exception -> 0x0561 }
                r9.L$2 = r2     // Catch:{ Exception -> 0x0561 }
                r6 = 0
                r9.L$3 = r6     // Catch:{ Exception -> 0x0561 }
                r9.L$4 = r6     // Catch:{ Exception -> 0x0561 }
                r9.L$5 = r6     // Catch:{ Exception -> 0x0561 }
                r9.L$6 = r6     // Catch:{ Exception -> 0x0561 }
                r9.L$7 = r6     // Catch:{ Exception -> 0x0561 }
                r6 = 8
                r9.label = r6     // Catch:{ Exception -> 0x0561 }
                java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r9)     // Catch:{ Exception -> 0x0561 }
                if (r1 != r0) goto L_0x054d
                return r0
            L_0x054d:
                bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x0561 }
                java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x0561 }
                p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x0561 }
                com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch:{ Exception -> 0x0561 }
                com.google.gson.JsonObject r1 = r1.getAsJsonObject(r5)     // Catch:{ Exception -> 0x0561 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0561 }
                goto L_0x0563
            L_0x0561:
                r1 = r18
            L_0x0563:
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x051d }
                r6.<init>(r1)     // Catch:{ Exception -> 0x051d }
                java.util.Iterator r1 = r6.keys()     // Catch:{ Exception -> 0x051d }
                java.lang.String r7 = "resultBySymbol.keys()"
                p000.vx2.m53590f(r1, r7)     // Catch:{ Exception -> 0x051d }
            L_0x0571:
                boolean r7 = r1.hasNext()     // Catch:{ Exception -> 0x051d }
                if (r7 == 0) goto L_0x051d
                java.lang.Object r7 = r1.next()     // Catch:{ Exception -> 0x051d }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x051d }
                if (r7 == 0) goto L_0x0571
                p000.vx2.m53590f(r7, r11)     // Catch:{ Exception -> 0x051d }
                java.lang.String r12 = r6.getString(r7)     // Catch:{ Exception -> 0x051d }
                r4.put(r7, r12)     // Catch:{ Exception -> 0x051d }
                r37 r7 = p000.r37.f33317a     // Catch:{ Exception -> 0x051d }
                goto L_0x0571
            L_0x058c:
                r10 = 1
                r13 = r9
                r9 = r30
            L_0x0590:
                net.safemoon.androidwallet.MyApplicationClass r0 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
                java.util.ArrayList<net.safemoon.androidwallet.model.Coin> r0 = r0.f41190r
                r0.clear()
                java.util.List<net.safemoon.androidwallet.model.token.abstraction.IToken> r0 = r3
                net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r1 = r4
                java.util.Iterator r2 = r0.iterator()
            L_0x05a1:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x07ac
                java.lang.Object r0 = r2.next()
                net.safemoon.androidwallet.model.token.abstraction.IToken r0 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r0
                java.lang.String r3 = r0.getSymbolWithType()     // Catch:{ Exception -> 0x078c }
                r5 = 0
                r6 = 0
                r7 = 2
                boolean r3 = p000.yb6.m74336M(r3, r8, r5, r7, r6)     // Catch:{ Exception -> 0x078c }
                java.lang.String r9 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
                if (r3 == 0) goto L_0x05cb
                java.lang.String r3 = r0.getIconResName()     // Catch:{ Exception -> 0x078c }
                java.lang.Integer r3 = p000.xb6.m73916n(r3)     // Catch:{ Exception -> 0x078c }
                if (r3 == 0) goto L_0x05cb
                java.lang.String r3 = r0.getIconResName()     // Catch:{ Exception -> 0x078c }
                goto L_0x05dc
            L_0x05cb:
                java.lang.String r3 = r0.getSymbol()     // Catch:{ Exception -> 0x078c }
                java.lang.String r3 = p000.q70.m71189e(r3)     // Catch:{ Exception -> 0x078c }
                java.util.Locale r11 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x078c }
                java.lang.String r3 = r3.toUpperCase(r11)     // Catch:{ Exception -> 0x078c }
                p000.vx2.m53590f(r3, r9)     // Catch:{ Exception -> 0x078c }
            L_0x05dc:
                double r11 = r0.getPriceInUsdt()     // Catch:{ Exception -> 0x078c }
                double r14 = r0.getPercentChange1h()     // Catch:{ Exception -> 0x078c }
                boolean r16 = r4.has(r3)     // Catch:{ Exception -> 0x078c }
                if (r16 == 0) goto L_0x0630
                com.google.gson.Gson r11 = new com.google.gson.Gson     // Catch:{ Exception -> 0x078c }
                r11.<init>()     // Catch:{ Exception -> 0x078c }
                java.lang.String r3 = r4.getString(r3)     // Catch:{ Exception -> 0x078c }
                java.lang.Class<net.safemoon.androidwallet.model.Coin> r12 = net.safemoon.androidwallet.model.Coin.class
                java.lang.Object r3 = r11.fromJson((java.lang.String) r3, r12)     // Catch:{ Exception -> 0x078c }
                net.safemoon.androidwallet.model.Coin r3 = (net.safemoon.androidwallet.model.Coin) r3     // Catch:{ Exception -> 0x078c }
                net.safemoon.androidwallet.model.Quote r11 = r3.getQuote()     // Catch:{ Exception -> 0x078c }
                net.safemoon.androidwallet.model.USDT r11 = r11.getUSD()     // Catch:{ Exception -> 0x078c }
                java.lang.Double r12 = r11.getPrice()     // Catch:{ Exception -> 0x078c }
                java.lang.String r14 = "usdt.price"
                p000.vx2.m53590f(r12, r14)     // Catch:{ Exception -> 0x078c }
                double r14 = r12.doubleValue()     // Catch:{ Exception -> 0x078c }
                java.lang.Double r11 = r11.getPercentChange1h()     // Catch:{ Exception -> 0x078c }
                if (r11 != 0) goto L_0x0619
                r11 = 0
                goto L_0x0622
            L_0x0619:
                java.lang.String r12 = "usdt.percentChange1h ?: 0.0"
                p000.vx2.m53590f(r11, r12)     // Catch:{ Exception -> 0x078c }
                double r11 = r11.doubleValue()     // Catch:{ Exception -> 0x078c }
            L_0x0622:
                net.safemoon.androidwallet.MyApplicationClass r5 = net.safemoon.androidwallet.MyApplicationClass.m64669c()     // Catch:{ Exception -> 0x078c }
                java.util.ArrayList<net.safemoon.androidwallet.model.Coin> r5 = r5.f41190r     // Catch:{ Exception -> 0x078c }
                r5.add(r3)     // Catch:{ Exception -> 0x078c }
                r28 = r11
                r11 = r14
                r14 = r28
            L_0x0630:
                java.lang.String r3 = r0.getSymbol()     // Catch:{ Exception -> 0x078c }
                int r5 = r3.hashCode()     // Catch:{ Exception -> 0x078c }
                r6 = 65910(0x10176, float:9.236E-41)
                if (r5 == r6) goto L_0x06ca
                r6 = 68985(0x10d79, float:9.6669E-41)
                java.lang.String r7 = "WETH"
                if (r5 == r6) goto L_0x0654
                r6 = 2660802(0x2899c2, float:3.728578E-39)
                if (r5 == r6) goto L_0x064d
            L_0x0649:
                r16 = r2
                goto L_0x06d4
            L_0x064d:
                boolean r3 = r3.equals(r7)     // Catch:{ Exception -> 0x078c }
                if (r3 != 0) goto L_0x065d
                goto L_0x0649
            L_0x0654:
                java.lang.String r5 = "ETH"
                boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x078c }
                if (r3 != 0) goto L_0x065d
                goto L_0x0649
            L_0x065d:
                java.util.Iterator r3 = r13.iterator()     // Catch:{ Exception -> 0x078c }
            L_0x0661:
                boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x078c }
                if (r5 == 0) goto L_0x06a1
                java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x078c }
                r5 = r6
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r5 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r5     // Catch:{ Exception -> 0x078c }
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$BaseToken r16 = r5.getBaseToken()     // Catch:{ Exception -> 0x078c }
                java.lang.String r10 = r16.getSymbol()     // Catch:{ Exception -> 0x078c }
                r16 = r2
                java.util.Locale r2 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x078a }
                java.lang.String r2 = r10.toUpperCase(r2)     // Catch:{ Exception -> 0x078a }
                p000.vx2.m53590f(r2, r9)     // Catch:{ Exception -> 0x078a }
                boolean r2 = p000.vx2.m53586b(r2, r7)     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x0699
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$QuoteToken r2 = r5.getQuoteToken()     // Catch:{ Exception -> 0x078a }
                java.lang.String r2 = r2.getSymbol()     // Catch:{ Exception -> 0x078a }
                java.lang.String r5 = "USDC"
                boolean r2 = p000.vx2.m53586b(r2, r5)     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x0699
                r2 = 1
                goto L_0x069a
            L_0x0699:
                r2 = 0
            L_0x069a:
                if (r2 == 0) goto L_0x069d
                goto L_0x06a4
            L_0x069d:
                r2 = r16
                r10 = 1
                goto L_0x0661
            L_0x06a1:
                r16 = r2
                r6 = 0
            L_0x06a4:
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r6 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r6     // Catch:{ Exception -> 0x078a }
                if (r6 == 0) goto L_0x077a
                java.lang.String r2 = r6.getPriceUsd()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x06b5
                double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x078a }
                r37 r5 = p000.r37.f33317a     // Catch:{ Exception -> 0x078a }
                r11 = r2
            L_0x06b5:
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$PriceChange r2 = r6.getPriceChange()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x077a
                java.lang.Double r2 = r2.getH24()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x077a
                double r2 = r2.doubleValue()     // Catch:{ Exception -> 0x078a }
                r37 r5 = p000.r37.f33317a     // Catch:{ Exception -> 0x078a }
                r14 = r2
                goto L_0x077a
            L_0x06ca:
                r16 = r2
                java.lang.String r2 = "BNB"
                boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x078a }
                if (r2 != 0) goto L_0x072c
            L_0x06d4:
                java.util.Iterator r2 = r13.iterator()     // Catch:{ Exception -> 0x078a }
            L_0x06d8:
                boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x078a }
                if (r3 == 0) goto L_0x0708
                java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x078a }
                r3 = r6
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r3 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r3     // Catch:{ Exception -> 0x078a }
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$BaseToken r3 = r3.getBaseToken()     // Catch:{ Exception -> 0x078a }
                java.lang.String r3 = r3.getAddress()     // Catch:{ Exception -> 0x078a }
                java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x078a }
                java.lang.String r3 = r3.toUpperCase(r5)     // Catch:{ Exception -> 0x078a }
                p000.vx2.m53590f(r3, r9)     // Catch:{ Exception -> 0x078a }
                java.lang.String r7 = r0.getContractAddress()     // Catch:{ Exception -> 0x078a }
                java.lang.String r5 = r7.toUpperCase(r5)     // Catch:{ Exception -> 0x078a }
                p000.vx2.m53590f(r5, r9)     // Catch:{ Exception -> 0x078a }
                boolean r3 = p000.vx2.m53586b(r3, r5)     // Catch:{ Exception -> 0x078a }
                if (r3 == 0) goto L_0x06d8
                goto L_0x0709
            L_0x0708:
                r6 = 0
            L_0x0709:
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r6 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r6     // Catch:{ Exception -> 0x078a }
                if (r6 == 0) goto L_0x077a
                java.lang.String r2 = r6.getPriceUsd()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x0719
                double r11 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x078a }
                r37 r2 = p000.r37.f33317a     // Catch:{ Exception -> 0x078a }
            L_0x0719:
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$PriceChange r2 = r6.getPriceChange()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x077a
                java.lang.Double r2 = r2.getH24()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x077a
                double r14 = r2.doubleValue()     // Catch:{ Exception -> 0x078a }
                r37 r2 = p000.r37.f33317a     // Catch:{ Exception -> 0x078a }
                goto L_0x077a
            L_0x072c:
                java.util.Iterator r2 = r13.iterator()     // Catch:{ Exception -> 0x078a }
            L_0x0730:
                boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x078a }
                if (r3 == 0) goto L_0x0757
                java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x078a }
                r3 = r6
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r3 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r3     // Catch:{ Exception -> 0x078a }
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$BaseToken r3 = r3.getBaseToken()     // Catch:{ Exception -> 0x078a }
                java.lang.String r3 = r3.getSymbol()     // Catch:{ Exception -> 0x078a }
                java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x078a }
                java.lang.String r3 = r3.toUpperCase(r5)     // Catch:{ Exception -> 0x078a }
                p000.vx2.m53590f(r3, r9)     // Catch:{ Exception -> 0x078a }
                java.lang.String r5 = "WBNB"
                boolean r3 = p000.vx2.m53586b(r3, r5)     // Catch:{ Exception -> 0x078a }
                if (r3 == 0) goto L_0x0730
                goto L_0x0758
            L_0x0757:
                r6 = 0
            L_0x0758:
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r6 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r6     // Catch:{ Exception -> 0x078a }
                if (r6 == 0) goto L_0x077a
                java.lang.String r2 = r6.getPriceUsd()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x0768
                double r11 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x078a }
                r37 r2 = p000.r37.f33317a     // Catch:{ Exception -> 0x078a }
            L_0x0768:
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$PriceChange r2 = r6.getPriceChange()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x077a
                java.lang.Double r2 = r2.getH24()     // Catch:{ Exception -> 0x078a }
                if (r2 == 0) goto L_0x077a
                double r14 = r2.doubleValue()     // Catch:{ Exception -> 0x078a }
                r37 r2 = p000.r37.f33317a     // Catch:{ Exception -> 0x078a }
            L_0x077a:
                r19 = r11
                r21 = r14
                ip2 r17 = r1.f42771c     // Catch:{ Exception -> 0x078a }
                java.lang.String r18 = r0.getSymbolWithType()     // Catch:{ Exception -> 0x078a }
                r17.mo50491c(r18, r19, r21)     // Catch:{ Exception -> 0x078a }
                goto L_0x07a7
            L_0x078a:
                r0 = move-exception
                goto L_0x078f
            L_0x078c:
                r0 = move-exception
                r16 = r2
            L_0x078f:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r3 = "Key"
                java.lang.String r5 = "UpdatePriceError"
                r2.putString(r3, r5)
                java.lang.String r3 = "select_item"
                r2.putSerializable(r3, r0)
                com.google.firebase.analytics.FirebaseAnalytics r0 = r1.mo61290B()
                r0.mo36096a(r3, r2)
            L_0x07a7:
                r2 = r16
                r10 = 1
                goto L_0x05a1
            L_0x07ac:
                r37 r0 = p000.r37.f33317a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$updatePrice$1.C87211.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTokensListViewModel$updatePrice$1(List<? extends IToken> list, MyTokensListViewModel myTokensListViewModel, ns0<? super MyTokensListViewModel$updatePrice$1> ns0) {
        super(2, ns0);
        this.$iTokens = list;
        this.this$0 = myTokensListViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MyTokensListViewModel$updatePrice$1(this.$iTokens, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MyTokensListViewModel$updatePrice$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final List<IToken> list = this.$iTokens;
            final MyTokensListViewModel myTokensListViewModel = this.this$0;
            C87211 r1 = new C87211((ns0<? super C87211>) null);
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
