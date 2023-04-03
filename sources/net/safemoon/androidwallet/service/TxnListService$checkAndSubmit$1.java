package net.safemoon.androidwallet.service;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.service.TxnListService$checkAndSubmit$1", mo48632f = "TxnListService.kt", mo48633l = {111}, mo48634m = "invokeSuspend")
/* compiled from: TxnListService.kt */
public final class TxnListService$checkAndSubmit$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ TxnListService this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.service.TxnListService$checkAndSubmit$1$1", mo48632f = "TxnListService.kt", mo48633l = {124, 126, 139, 160, 171, 204, 219, 234, 247}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.service.TxnListService$checkAndSubmit$1$1 */
    /* compiled from: TxnListService.kt */
    public static final class C86261 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86261(txnListService, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86261) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.Iterator} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v21, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v25, resolved type: net.safemoon.androidwallet.common.TokenType} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v29, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v30, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v41, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v45, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v43, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v46, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v52, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v54, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v51, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v60, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v62, resolved type: java.util.Iterator<T>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v59, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v43, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v60, resolved type: net.safemoon.androidwallet.service.TxnListService} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v63, resolved type: java.util.Iterator} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v64, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v46, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v51, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v65, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v54, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v56, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v66, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v67, resolved type: java.util.Iterator} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v68, resolved type: java.util.Iterator<T>} */
        /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x05d9: MOVE  (r1v7 net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) = 
              (r1v6 net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction)
            
            	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
            */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:147|148|149|150|151|152|153|(1:155)|156|(13:160|(3:162|163|164)(3:167|168|169)|170|171|172|173|174|175|176|177|(1:179)|180|(1:182))) */
        /* JADX WARNING: Can't wrap try/catch for region: R(13:160|(3:162|163|164)(3:167|168|169)|170|171|172|173|174|175|176|177|(1:179)|180|(1:182)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:205|206|207|208|228|229|(9:231|(1:235)|236|(1:241)(1:240)|242|243|244|245|(3:247|(1:249)(1:250)|(3:252|(1:254)(25:255|256|257|(11:274|(1:276)(1:277)|(1:279)|280|289|(1:291)(1:292)|(12:298|(4:300|301|302|303)(3:305|306|307)|308|309|310|311|(1:313)|314|(1:316)|331|51|(0)(0))|189|331|51|(0))(22:261|(2:262|(5:264|(1:266)(1:267)|268|(2:334|270)|271)(2:335|272))|273|(0)(0)|(0)|280|289|(0)(0)|294|296|298|(0)(0)|308|309|310|311|(0)|314|(0)|331|51|(0)(0))|259|274|(0)(0)|(0)|280|289|(0)(0)|294|296|298|(0)(0)|308|309|310|311|(0)|314|(0)|331|51|(0))|254)))(4:283|284|285|(1:287))|288|289|(0)(0)|294|296|298|(0)(0)|308|309|310|311|(0)|314|(0)|331|51|(0)(0)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:60|(7:115|(7:117|(9:119|120|121|122|123|124|125|(1:127)(5:128|129|(1:136)(5:135|(1:141)|142|(1:144)(1:145)|(10:147|148|149|150|151|152|153|(1:155)|156|(13:160|(3:162|163|164)(3:167|168|169)|170|171|172|173|174|175|176|177|(1:179)|180|(1:182))))|131|136)|127)|139|(0)|142|(0)(0)|(0))|188|189|331|51|(1:332)(0))|62|63|64|65|(6:67|68|69|70|(1:72)(26:73|74|76|(2:78|(9:80|82|(1:84)(1:85)|(13:89|(3:91|92|93)(3:94|95|96)|97|98|99|100|101|102|103|104|(1:106)|107|(1:109))|188|189|331|51|(0)))|81|82|(0)(0)|87|89|(0)(0)|97|98|99|100|101|102|103|104|(0)|107|(0)|188|189|331|51|(0)(0))|72)|75|76|(0)|81|82|(0)(0)|87|89|(0)(0)|97|98|99|100|101|102|103|104|(0)|107|(0)|188|189|331|51|(0)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:119|120|121|122|123|124|125|(1:127)(5:128|129|(1:136)(5:135|(1:141)|142|(1:144)(1:145)|(10:147|148|149|150|151|152|153|(1:155)|156|(13:160|(3:162|163|164)(3:167|168|169)|170|171|172|173|174|175|176|177|(1:179)|180|(1:182))))|131|136)|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:231|(1:235)|236|(1:241)(1:240)|242|243|244|245|(3:247|(1:249)(1:250)|(3:252|(1:254)(25:255|256|257|(11:274|(1:276)(1:277)|(1:279)|280|289|(1:291)(1:292)|(12:298|(4:300|301|302|303)(3:305|306|307)|308|309|310|311|(1:313)|314|(1:316)|331|51|(0)(0))|189|331|51|(0))(22:261|(2:262|(5:264|(1:266)(1:267)|268|(2:334|270)|271)(2:335|272))|273|(0)(0)|(0)|280|289|(0)(0)|294|296|298|(0)(0)|308|309|310|311|(0)|314|(0)|331|51|(0)(0))|259|274|(0)(0)|(0)|280|289|(0)(0)|294|296|298|(0)(0)|308|309|310|311|(0)|314|(0)|331|51|(0))|254))) */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0299 A[Catch:{ Exception -> 0x0691 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x02a2 A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x033d A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0344 A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x0346 A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0349 A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x04e8 A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:276:0x0594 A[Catch:{ Exception -> 0x05a2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:277:0x0599 A[Catch:{ Exception -> 0x05a2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x059c A[Catch:{ Exception -> 0x05a2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:283:0x05a6  */
        /* JADX WARNING: Removed duplicated region for block: B:291:0x05d0 A[Catch:{ Exception -> 0x0678 }] */
        /* JADX WARNING: Removed duplicated region for block: B:292:0x05d2 A[Catch:{ Exception -> 0x0678 }] */
        /* JADX WARNING: Removed duplicated region for block: B:300:0x05ec  */
        /* JADX WARNING: Removed duplicated region for block: B:305:0x05f7  */
        /* JADX WARNING: Removed duplicated region for block: B:313:0x0654 A[Catch:{ Exception -> 0x0673 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:316:0x065d A[Catch:{ Exception -> 0x0673 }] */
        /* JADX WARNING: Removed duplicated region for block: B:330:0x069a  */
        /* JADX WARNING: Removed duplicated region for block: B:332:0x06a7  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6 A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x020d A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x020f A[Catch:{ Exception -> 0x0691 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x024c  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0252  */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
                r37 = this;
                r1 = r37
                java.lang.String r2 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                java.lang.String r3 = ""
                java.lang.Object r4 = p000.wx2.m54101d()
                int r0 = r1.label
                java.lang.String r5 = "0x"
                java.lang.String r6 = "1"
                java.lang.String r8 = "0"
                switch(r0) {
                    case 0: goto L_0x0132;
                    case 1: goto L_0x0109;
                    case 2: goto L_0x00eb;
                    case 3: goto L_0x00b6;
                    case 4: goto L_0x0097;
                    case 5: goto L_0x007c;
                    case 6: goto L_0x0068;
                    case 7: goto L_0x004d;
                    case 8: goto L_0x0032;
                    case 9: goto L_0x001d;
                    default: goto L_0x0015;
                }
            L_0x0015:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001d:
                java.lang.Object r0 = r1.L$2
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r11 = r1.L$1
                java.util.Iterator r11 = (java.util.Iterator) r11
                java.lang.Object r12 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r12 = (net.safemoon.androidwallet.service.TxnListService) r12
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x00b0 }
                r7 = r1
                r1 = r0
                r0 = r38
                goto L_0x041b
            L_0x0032:
                java.lang.Object r0 = r1.L$3
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r0 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r0
                java.lang.Object r11 = r1.L$2
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r12 = r1.L$1
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r13 = (net.safemoon.androidwallet.service.TxnListService) r13
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x0127 }
                r9 = r38
                r7 = r1
                r1 = r11
                r11 = r12
                r12 = r13
                goto L_0x03b4
            L_0x004d:
                java.lang.Object r0 = r1.L$3
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r0 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r0
                java.lang.Object r11 = r1.L$2
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r12 = r1.L$1
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r13 = (net.safemoon.androidwallet.service.TxnListService) r13
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x0127 }
                r9 = r38
                r7 = r1
                r1 = r11
                r11 = r12
                r12 = r13
                goto L_0x0318
            L_0x0068:
                java.lang.Object r0 = r1.L$2
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r11 = r1.L$1
                java.util.Iterator r11 = (java.util.Iterator) r11
                java.lang.Object r12 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r12 = (net.safemoon.androidwallet.service.TxnListService) r12
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x00b0 }
                r7 = r1
                r1 = r38
                goto L_0x029a
            L_0x007c:
                java.lang.Object r0 = r1.L$3
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r0 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r0
                java.lang.Object r11 = r1.L$2
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r12 = r1.L$1
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r13 = (net.safemoon.androidwallet.service.TxnListService) r13
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x0127 }
                r9 = r38
                r7 = r1
                r10 = r11
                r11 = r12
                r12 = r13
                goto L_0x01c7
            L_0x0097:
                java.lang.Object r0 = r1.L$2
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r11 = r1.L$1
                java.util.Iterator r11 = (java.util.Iterator) r11
                java.lang.Object r12 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r12 = (net.safemoon.androidwallet.service.TxnListService) r12
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x00b0 }
                r9 = r38
                r7 = r1
                r16 = r2
                r1 = 1
                r2 = 0
                r10 = 0
                goto L_0x0655
            L_0x00b0:
                r0 = move-exception
                r7 = r1
            L_0x00b2:
                r16 = r2
                goto L_0x012d
            L_0x00b6:
                java.lang.Object r0 = r1.L$6
                kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
                java.lang.Object r11 = r1.L$5
                kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref$ObjectRef) r11
                java.lang.Object r12 = r1.L$4
                kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref$ObjectRef) r12
                java.lang.Object r13 = r1.L$3
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r13 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r13
                java.lang.Object r14 = r1.L$2
                java.util.Map$Entry r14 = (java.util.Map.Entry) r14
                java.lang.Object r15 = r1.L$1
                java.util.Iterator r15 = (java.util.Iterator) r15
                java.lang.Object r7 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r7 = (net.safemoon.androidwallet.service.TxnListService) r7
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x00e0 }
                r16 = r2
                r9 = r12
                r12 = r7
                r7 = r1
                r1 = r15
                r15 = r0
                r0 = r38
                goto L_0x054f
            L_0x00e0:
                r0 = move-exception
                r16 = r2
                r12 = r7
                r11 = r15
                r2 = 0
                r10 = 0
                r7 = r1
                r1 = 1
                goto L_0x0694
            L_0x00eb:
                java.lang.Object r0 = r1.L$4
                net.safemoon.androidwallet.common.TokenType r0 = (net.safemoon.androidwallet.common.TokenType) r0
                java.lang.Object r7 = r1.L$3
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r7 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r7
                java.lang.Object r11 = r1.L$2
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r12 = r1.L$1
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r13 = (net.safemoon.androidwallet.service.TxnListService) r13
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x0127 }
                r9 = r13
                r13 = r7
                r7 = r1
                r1 = r38
                goto L_0x04cc
            L_0x0109:
                java.lang.Object r0 = r1.L$4
                net.safemoon.androidwallet.common.TokenType r0 = (net.safemoon.androidwallet.common.TokenType) r0
                java.lang.Object r7 = r1.L$3
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r7 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r7
                java.lang.Object r11 = r1.L$2
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r12 = r1.L$1
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r1.L$0
                net.safemoon.androidwallet.service.TxnListService r13 = (net.safemoon.androidwallet.service.TxnListService) r13
                p000.hg5.m45199b(r38)     // Catch:{ Exception -> 0x0127 }
                r9 = r13
                r13 = r7
                r7 = r1
                r1 = r38
                goto L_0x0484
            L_0x0127:
                r0 = move-exception
                r7 = r1
                r16 = r2
                r11 = r12
                r12 = r13
            L_0x012d:
                r1 = 1
            L_0x012e:
                r2 = 0
            L_0x012f:
                r10 = 0
                goto L_0x0694
            L_0x0132:
                p000.hg5.m45199b(r38)
                net.safemoon.androidwallet.service.TxnListService r0 = r3
                android.content.SharedPreferences r0 = r0.mo60826l()
                java.util.Map r0 = r0.getAll()
                java.util.Set r0 = r0.entrySet()
                net.safemoon.androidwallet.service.TxnListService r7 = r3
                java.util.Iterator r0 = r0.iterator()
                r11 = r0
                r12 = r7
                r7 = r1
            L_0x014c:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x06a7
                java.lang.Object r0 = r11.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.google.gson.Gson r13 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0691 }
                r13.<init>()     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r14 = r0.getValue()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0691 }
                java.lang.Class<net.safemoon.androidwallet.model.request.EvmRequestTransaction> r15 = net.safemoon.androidwallet.model.request.EvmRequestTransaction.class
                java.lang.Object r13 = r13.fromJson((java.lang.String) r14, r15)     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r13 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r13     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.TokenType$a r14 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x0691 }
                java.lang.String r15 = r13.getChainName()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.TokenType r14 = r14.mo57100c(r15)     // Catch:{ Exception -> 0x0691 }
                int r15 = r14.getChainId()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.TokenType r16 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN     // Catch:{ Exception -> 0x0691 }
                int r9 = r16.getChainId()     // Catch:{ Exception -> 0x0691 }
                r10 = 2
                if (r15 == r9) goto L_0x0453
                int r9 = r14.getChainId()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.TokenType r15 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ Exception -> 0x0691 }
                int r15 = r15.getChainId()     // Catch:{ Exception -> 0x0691 }
                if (r9 != r15) goto L_0x0192
                goto L_0x0453
            L_0x0192:
                int r9 = r14.getChainId()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.TokenType r15 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ Exception -> 0x0691 }
                int r15 = r15.getChainId()     // Catch:{ Exception -> 0x0691 }
                if (r9 != r15) goto L_0x02c7
                i30 r9 = p000.ol0.m70377s(r14)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r14 = r13.getTransactionHash()     // Catch:{ Exception -> 0x0691 }
                r15 = 0
                k90 r9 = p000.i30.C7204a.m58796e(r9, r14, r15, r10, r15)     // Catch:{ Exception -> 0x02bf }
                if (r9 == 0) goto L_0x01cc
                r7.L$0 = r12     // Catch:{ Exception -> 0x02bf }
                r7.L$1 = r11     // Catch:{ Exception -> 0x02bf }
                r7.L$2 = r0     // Catch:{ Exception -> 0x02bf }
                r7.L$3 = r13     // Catch:{ Exception -> 0x02bf }
                r7.L$4 = r15     // Catch:{ Exception -> 0x02bf }
                r7.L$5 = r15     // Catch:{ Exception -> 0x02bf }
                r7.L$6 = r15     // Catch:{ Exception -> 0x02bf }
                r10 = 5
                r7.label = r10     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r9 = retrofit2.KotlinExtensions.m71521c(r9, r7)     // Catch:{ Exception -> 0x0691 }
                if (r9 != r4) goto L_0x01c5
                return r4
            L_0x01c5:
                r10 = r0
                r0 = r13
            L_0x01c7:
                bg5 r9 = (p000.bg5) r9     // Catch:{ Exception -> 0x0691 }
                r13 = r0
                r0 = r10
                goto L_0x01cd
            L_0x01cc:
                r9 = 0
            L_0x01cd:
                p000.vx2.m53588d(r9)     // Catch:{ Exception -> 0x0691 }
                boolean r10 = r9.mo50581e()     // Catch:{ Exception -> 0x0691 }
                if (r10 == 0) goto L_0x0205
                java.lang.Object r10 = r9.mo50578a()     // Catch:{ Exception -> 0x0691 }
                p000.vx2.m53588d(r10)     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.transaction.solana.SolStatus r10 = (net.safemoon.androidwallet.model.transaction.solana.SolStatus) r10     // Catch:{ Exception -> 0x0691 }
                java.lang.String r14 = r10.getStatus()     // Catch:{ Exception -> 0x0691 }
                java.util.Locale r15 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x0691 }
                java.lang.String r14 = r14.toLowerCase(r15)     // Catch:{ Exception -> 0x0691 }
                p000.vx2.m53590f(r14, r2)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r1 = "Success"
                java.lang.String r1 = r1.toLowerCase(r15)     // Catch:{ Exception -> 0x0691 }
                p000.vx2.m53590f(r1, r2)     // Catch:{ Exception -> 0x0691 }
                boolean r1 = p000.vx2.m53586b(r14, r1)     // Catch:{ Exception -> 0x0691 }
                if (r1 == 0) goto L_0x0205
                int r1 = r10.getFee()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0691 }
                r10 = r6
                goto L_0x0207
            L_0x0205:
                r1 = r8
                r10 = r1
            L_0x0207:
                int r14 = r10.length()     // Catch:{ Exception -> 0x0691 }
                if (r14 <= 0) goto L_0x020f
                r14 = 1
                goto L_0x0210
            L_0x020f:
                r14 = 0
            L_0x0210:
                if (r14 == 0) goto L_0x0446
                java.lang.Object r9 = r9.mo50578a()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.transaction.solana.SolStatus r9 = (net.safemoon.androidwallet.model.transaction.solana.SolStatus) r9     // Catch:{ Exception -> 0x0691 }
                if (r9 == 0) goto L_0x0446
                int r14 = r9.getSlot()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r14 = okhttp3.internal.Util.toHexString((int) r14)     // Catch:{ Exception -> 0x0691 }
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0691 }
                r15.<init>()     // Catch:{ Exception -> 0x0691 }
                r15.append(r5)     // Catch:{ Exception -> 0x0691 }
                r15.append(r14)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r14 = r15.toString()     // Catch:{ Exception -> 0x0691 }
                r13.setTransactionIndex(r14)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r14 = r9.getTxHash()     // Catch:{ Exception -> 0x0691 }
                r13.setBlockHash(r14)     // Catch:{ Exception -> 0x0691 }
                int r9 = r9.getSlot()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0691 }
                r13.setBlockNumber(r9)     // Catch:{ Exception -> 0x0691 }
                boolean r9 = p000.vx2.m53586b(r10, r6)     // Catch:{ Exception -> 0x0691 }
                if (r9 == 0) goto L_0x0252
                r9 = 1
                java.lang.Integer r10 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x0494 }
                goto L_0x0257
            L_0x0252:
                r9 = 0
                java.lang.Integer r10 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x02b9 }
            L_0x0257:
                r13.setStatus(r10)     // Catch:{ Exception -> 0x0691 }
                long r9 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r1 = okhttp3.internal.Util.toHexString((long) r9)     // Catch:{ Exception -> 0x0691 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0691 }
                r9.<init>()     // Catch:{ Exception -> 0x0691 }
                r9.append(r5)     // Catch:{ Exception -> 0x0691 }
                r9.append(r1)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x0691 }
                r13.setGasUsed(r1)     // Catch:{ Exception -> 0x0691 }
                tk5 r1 = p000.C9384u3.m72574o()     // Catch:{ Exception -> 0x0691 }
                k90 r1 = r1.mo66091j(r13)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r9 = "getSafeMoonClient()\n    …ction(requestTransaction)"
                p000.vx2.m53590f(r1, r9)     // Catch:{ Exception -> 0x0691 }
                r7.L$0 = r12     // Catch:{ Exception -> 0x0691 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0691 }
                r7.L$2 = r0     // Catch:{ Exception -> 0x0691 }
                r9 = 0
                r7.L$3 = r9     // Catch:{ Exception -> 0x0439 }
                r7.L$4 = r9     // Catch:{ Exception -> 0x0439 }
                r7.L$5 = r9     // Catch:{ Exception -> 0x0439 }
                r7.L$6 = r9     // Catch:{ Exception -> 0x0439 }
                r9 = 6
                r7.label = r9     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r7)     // Catch:{ Exception -> 0x0691 }
                if (r1 != r4) goto L_0x029a
                return r4
            L_0x029a:
                bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x0691 }
                boolean r1 = r1.mo50581e()     // Catch:{ Exception -> 0x0691 }
                if (r1 == 0) goto L_0x0446
                android.content.SharedPreferences r1 = r12.mo60826l()     // Catch:{ Exception -> 0x0691 }
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r0 = r0.getKey()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0691 }
                android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ Exception -> 0x0691 }
                r0.apply()     // Catch:{ Exception -> 0x0691 }
                goto L_0x0446
            L_0x02b9:
                r0 = move-exception
                r16 = r2
                r2 = r9
                goto L_0x0443
            L_0x02bf:
                r0 = move-exception
                r16 = r2
                r10 = r15
            L_0x02c3:
                r1 = 1
                r2 = 0
                goto L_0x0694
            L_0x02c7:
                net.safemoon.androidwallet.common.MyCoinType r1 = r14.getCoinType()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.SimilarTypeGroup r1 = r1.getSimilarTypeGroup()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.SimilarTypeGroup r9 = net.safemoon.androidwallet.common.SimilarTypeGroup.EVM_CAPABILITY     // Catch:{ Exception -> 0x0691 }
                if (r1 != r9) goto L_0x0446
                com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0691 }
                r1.<init>()     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r9 = r0.getValue()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0691 }
                java.lang.Class<net.safemoon.androidwallet.model.request.EvmRequestTransaction> r10 = net.safemoon.androidwallet.model.request.EvmRequestTransaction.class
                java.lang.Object r1 = r1.fromJson((java.lang.String) r9, r10)     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.request.EvmRequestTransaction r1 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r1     // Catch:{ Exception -> 0x0691 }
                i30 r9 = p000.ol0.m70377s(r14)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r10 = r1.getTransactionHash()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r13 = p000.ol0.m70382x(r14)     // Catch:{ Exception -> 0x0691 }
                k90 r9 = r9.mo52378a(r10, r13)     // Catch:{ Exception -> 0x0691 }
                if (r9 == 0) goto L_0x0335
                r7.L$0 = r12     // Catch:{ Exception -> 0x0691 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0691 }
                r7.L$2 = r0     // Catch:{ Exception -> 0x0691 }
                r7.L$3 = r1     // Catch:{ Exception -> 0x0691 }
                r10 = 0
                r7.L$4 = r10     // Catch:{ Exception -> 0x0331 }
                r7.L$5 = r10     // Catch:{ Exception -> 0x0331 }
                r7.L$6 = r10     // Catch:{ Exception -> 0x0331 }
                r10 = 7
                r7.label = r10     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r9 = retrofit2.KotlinExtensions.m71521c(r9, r7)     // Catch:{ Exception -> 0x0691 }
                if (r9 != r4) goto L_0x0313
                return r4
            L_0x0313:
                r36 = r1
                r1 = r0
                r0 = r36
            L_0x0318:
                bg5 r9 = (p000.bg5) r9     // Catch:{ Exception -> 0x0691 }
                if (r9 == 0) goto L_0x032b
                java.lang.Object r9 = r9.mo50578a()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.ReceiptStatus r9 = (net.safemoon.androidwallet.model.ReceiptStatus) r9     // Catch:{ Exception -> 0x0691 }
                if (r9 == 0) goto L_0x032b
                net.safemoon.androidwallet.model.ReceiptStatus$Result r9 = r9.result     // Catch:{ Exception -> 0x0691 }
                if (r9 == 0) goto L_0x032b
                java.lang.String r9 = r9.status     // Catch:{ Exception -> 0x0691 }
                goto L_0x033b
            L_0x032b:
                r36 = r1
                r1 = r0
                r0 = r36
                goto L_0x0335
            L_0x0331:
                r0 = move-exception
                r16 = r2
                goto L_0x02c3
            L_0x0335:
                r9 = 0
                r36 = r1
                r1 = r0
                r0 = r36
            L_0x033b:
                if (r9 != 0) goto L_0x033e
                r9 = r8
            L_0x033e:
                int r9 = r9.length()     // Catch:{ Exception -> 0x0691 }
                if (r9 <= 0) goto L_0x0346
                r9 = 1
                goto L_0x0347
            L_0x0346:
                r9 = 0
            L_0x0347:
                if (r9 == 0) goto L_0x0446
                net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r9 = new net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer     // Catch:{ Exception -> 0x0691 }
                android.app.Application r10 = r12.getApplication()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r13 = "application"
                p000.vx2.m53590f(r10, r13)     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.token.gson.GsonToken r13 = new net.safemoon.androidwallet.model.token.gson.GsonToken     // Catch:{ Exception -> 0x0691 }
                java.lang.String r18 = "Fake"
                java.lang.String r19 = ""
                java.lang.String r20 = ""
                java.lang.String r21 = ""
                net.safemoon.androidwallet.common.TokenType$a r14 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x0691 }
                java.lang.String r15 = r0.getChainName()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.TokenType r14 = r14.mo57100c(r15)     // Catch:{ Exception -> 0x0691 }
                int r22 = r14.getChainId()     // Catch:{ Exception -> 0x0691 }
                r23 = 0
                r24 = 0
                java.lang.String r25 = ""
                r26 = 0
                r27 = 0
                r28 = 0
                r30 = 0
                r32 = 0
                r34 = 7936(0x1f00, float:1.1121E-41)
                r35 = 0
                r17 = r13
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r35)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r20 = r0.getTo()     // Catch:{ Exception -> 0x0691 }
                double r21 = r0.getAmount()     // Catch:{ Exception -> 0x0691 }
                r17 = r9
                r18 = r10
                r19 = r13
                r17.<init>(r18, r19, r20, r21)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r10 = r0.getTransactionHash()     // Catch:{ Exception -> 0x0691 }
                r7.L$0 = r12     // Catch:{ Exception -> 0x0691 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0691 }
                r7.L$2 = r1     // Catch:{ Exception -> 0x0691 }
                r7.L$3 = r0     // Catch:{ Exception -> 0x0691 }
                r13 = 0
                r7.L$4 = r13     // Catch:{ Exception -> 0x044d }
                r7.L$5 = r13     // Catch:{ Exception -> 0x044d }
                r7.L$6 = r13     // Catch:{ Exception -> 0x044d }
                r13 = 8
                r7.label = r13     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r9 = r9.mo61867o(r10, r7)     // Catch:{ Exception -> 0x0691 }
                if (r9 != r4) goto L_0x03b4
                return r4
            L_0x03b4:
                ks1 r9 = (p000.ks1) r9     // Catch:{ Exception -> 0x0691 }
                if (r9 == 0) goto L_0x0446
                ag5$a r10 = r9.getError()     // Catch:{ Exception -> 0x0691 }
                if (r10 != 0) goto L_0x0446
                java.lang.Object r9 = r9.getResult()     // Catch:{ Exception -> 0x0691 }
                au6 r9 = (p000.au6) r9     // Catch:{ Exception -> 0x0691 }
                java.lang.String r10 = r9.getTransactionIndexRaw()     // Catch:{ Exception -> 0x0691 }
                r0.setTransactionIndex(r10)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r10 = r9.getBlockHash()     // Catch:{ Exception -> 0x0691 }
                r0.setBlockHash(r10)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r10 = r9.getBlockNumberRaw()     // Catch:{ Exception -> 0x0691 }
                r0.setBlockNumber(r10)     // Catch:{ Exception -> 0x0691 }
                boolean r10 = r9.isStatusOK()     // Catch:{ Exception -> 0x0691 }
                if (r10 == 0) goto L_0x03eb
                r10 = 1
                java.lang.Integer r13 = p000.a40.m31673d(r10)     // Catch:{ Exception -> 0x03e5 }
                goto L_0x03f0
            L_0x03e5:
                r0 = move-exception
                r16 = r2
                r1 = r10
                goto L_0x012e
            L_0x03eb:
                r10 = 0
                java.lang.Integer r13 = p000.a40.m31673d(r10)     // Catch:{ Exception -> 0x043f }
            L_0x03f0:
                r0.setStatus(r13)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r9 = r9.getGasUsedRaw()     // Catch:{ Exception -> 0x0691 }
                r0.setGasUsed(r9)     // Catch:{ Exception -> 0x0691 }
                tk5 r9 = p000.C9384u3.m72574o()     // Catch:{ Exception -> 0x0691 }
                k90 r0 = r9.mo66091j(r0)     // Catch:{ Exception -> 0x0691 }
                java.lang.String r9 = "getSafeMoonClient()\n    …on(requestTransactionEvm)"
                p000.vx2.m53590f(r0, r9)     // Catch:{ Exception -> 0x0691 }
                r7.L$0 = r12     // Catch:{ Exception -> 0x0691 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0691 }
                r7.L$2 = r1     // Catch:{ Exception -> 0x0691 }
                r9 = 0
                r7.L$3 = r9     // Catch:{ Exception -> 0x0439 }
                r9 = 9
                r7.label = r9     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r7)     // Catch:{ Exception -> 0x0691 }
                if (r0 != r4) goto L_0x041b
                return r4
            L_0x041b:
                bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0691 }
                boolean r0 = r0.mo50581e()     // Catch:{ Exception -> 0x0691 }
                if (r0 == 0) goto L_0x0446
                android.content.SharedPreferences r0 = r12.mo60826l()     // Catch:{ Exception -> 0x0691 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r1 = r1.getKey()     // Catch:{ Exception -> 0x0691 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0691 }
                android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch:{ Exception -> 0x0691 }
                r0.apply()     // Catch:{ Exception -> 0x0691 }
                goto L_0x0446
            L_0x0439:
                r0 = move-exception
                r16 = r2
                r10 = r9
                goto L_0x02c3
            L_0x043f:
                r0 = move-exception
                r16 = r2
                r2 = r10
            L_0x0443:
                r1 = 1
                goto L_0x012f
            L_0x0446:
                r16 = r2
            L_0x0448:
                r1 = 1
                r2 = 0
                r10 = 0
                goto L_0x06a1
            L_0x044d:
                r0 = move-exception
                r16 = r2
                r10 = r13
                goto L_0x02c3
            L_0x0453:
                int r1 = r14.getChainId()     // Catch:{ Exception -> 0x0691 }
                int r9 = r16.getChainId()     // Catch:{ Exception -> 0x0691 }
                if (r1 != r9) goto L_0x049a
                ll1 r1 = p000.ll1.f40640a     // Catch:{ Exception -> 0x0691 }
                java.lang.String r9 = r13.getTransactionHash()     // Catch:{ Exception -> 0x0691 }
                k90 r1 = r1.mo55916b(r9)     // Catch:{ Exception -> 0x0691 }
                r7.L$0 = r12     // Catch:{ Exception -> 0x0691 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0691 }
                r7.L$2 = r0     // Catch:{ Exception -> 0x0691 }
                r7.L$3 = r13     // Catch:{ Exception -> 0x0691 }
                r7.L$4 = r14     // Catch:{ Exception -> 0x0691 }
                r9 = 0
                r7.L$5 = r9     // Catch:{ Exception -> 0x0439 }
                r7.L$6 = r9     // Catch:{ Exception -> 0x0439 }
                r9 = 1
                r7.label = r9     // Catch:{ Exception -> 0x0494 }
                java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r7)     // Catch:{ Exception -> 0x0691 }
                if (r1 != r4) goto L_0x0480
                return r4
            L_0x0480:
                r9 = r12
                r12 = r11
                r11 = r0
                r0 = r14
            L_0x0484:
                bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x048a }
            L_0x0486:
                r14 = r11
                r11 = r12
                r12 = r9
                goto L_0x04cf
            L_0x048a:
                r0 = move-exception
                r16 = r2
                r11 = r12
                r1 = 1
                r2 = 0
                r10 = 0
            L_0x0491:
                r12 = r9
                goto L_0x0694
            L_0x0494:
                r0 = move-exception
                r16 = r2
                r1 = r9
                goto L_0x012e
            L_0x049a:
                int r1 = r14.getChainId()     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.common.TokenType r9 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ Exception -> 0x0691 }
                int r9 = r9.getChainId()     // Catch:{ Exception -> 0x0691 }
                if (r1 != r9) goto L_0x0684
                ll1 r1 = p000.ll1.f40640a     // Catch:{ Exception -> 0x0691 }
                java.lang.String r9 = r13.getTransactionHash()     // Catch:{ Exception -> 0x0691 }
                k90 r1 = r1.mo55919e(r9)     // Catch:{ Exception -> 0x0691 }
                r7.L$0 = r12     // Catch:{ Exception -> 0x0691 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0691 }
                r7.L$2 = r0     // Catch:{ Exception -> 0x0691 }
                r7.L$3 = r13     // Catch:{ Exception -> 0x0691 }
                r7.L$4 = r14     // Catch:{ Exception -> 0x0691 }
                r9 = 0
                r7.L$5 = r9     // Catch:{ Exception -> 0x0439 }
                r7.L$6 = r9     // Catch:{ Exception -> 0x0439 }
                r7.label = r10     // Catch:{ Exception -> 0x0691 }
                java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r7)     // Catch:{ Exception -> 0x0691 }
                if (r1 != r4) goto L_0x04c8
                return r4
            L_0x04c8:
                r9 = r12
                r12 = r11
                r11 = r0
                r0 = r14
            L_0x04cc:
                bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x067b }
                goto L_0x0486
            L_0x04cf:
                kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x0691 }
                r9.<init>()     // Catch:{ Exception -> 0x0691 }
                r9.element = r8     // Catch:{ Exception -> 0x0691 }
                kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x0691 }
                r10.<init>()     // Catch:{ Exception -> 0x0691 }
                r10.element = r3     // Catch:{ Exception -> 0x0691 }
                kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x0691 }
                r15.<init>()     // Catch:{ Exception -> 0x0691 }
                boolean r16 = r1.mo50581e()     // Catch:{ Exception -> 0x0691 }
                if (r16 == 0) goto L_0x05a6
                java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x0691 }
                r15.element = r1     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction r1 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r1     // Catch:{ Exception -> 0x0691 }
                if (r1 == 0) goto L_0x04f8
                java.lang.String r1 = r1.getFees()     // Catch:{ Exception -> 0x0691 }
                if (r1 != 0) goto L_0x04f9
            L_0x04f8:
                r1 = r8
            L_0x04f9:
                r9.element = r1     // Catch:{ Exception -> 0x0691 }
                T r1 = r15.element     // Catch:{ Exception -> 0x0691 }
                net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction r1 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r1     // Catch:{ Exception -> 0x0691 }
                if (r1 == 0) goto L_0x0509
                java.lang.String r1 = r1.getBlockhash()     // Catch:{ Exception -> 0x0691 }
                if (r1 == 0) goto L_0x0509
                r1 = r6
                goto L_0x050a
            L_0x0509:
                r1 = r3
            L_0x050a:
                r10.element = r1     // Catch:{ Exception -> 0x0691 }
                r16 = r2
                net.safemoon.androidwallet.common.TokenType r2 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN     // Catch:{ Exception -> 0x0678 }
                if (r0 != r2) goto L_0x05c5
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0678 }
                int r1 = r1.length()     // Catch:{ Exception -> 0x0678 }
                if (r1 != 0) goto L_0x051c
                r1 = 1
                goto L_0x051d
            L_0x051c:
                r1 = 0
            L_0x051d:
                if (r1 == 0) goto L_0x05c5
                i30 r17 = p000.ol0.m70377s(r0)     // Catch:{ Exception -> 0x0678 }
                java.lang.String r18 = r13.getFrom()     // Catch:{ Exception -> 0x0678 }
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 14
                r23 = 0
                k90 r0 = p000.i30.C7204a.m58792a(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0678 }
                r7.L$0 = r12     // Catch:{ Exception -> 0x0678 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0678 }
                r7.L$2 = r14     // Catch:{ Exception -> 0x0678 }
                r7.L$3 = r13     // Catch:{ Exception -> 0x0678 }
                r7.L$4 = r9     // Catch:{ Exception -> 0x0678 }
                r7.L$5 = r10     // Catch:{ Exception -> 0x0678 }
                r7.L$6 = r15     // Catch:{ Exception -> 0x0678 }
                r1 = 3
                r7.label = r1     // Catch:{ Exception -> 0x0678 }
                java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r7)     // Catch:{ Exception -> 0x0678 }
                if (r0 != r4) goto L_0x054d
                return r4
            L_0x054d:
                r1 = r11
                r11 = r10
            L_0x054f:
                bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x05a2 }
                java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x05a2 }
                net.safemoon.androidwallet.model.rpc2.bitcoin.BlockChainTransactionList r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BlockChainTransactionList) r0     // Catch:{ Exception -> 0x05a2 }
                if (r0 == 0) goto L_0x0591
                java.util.List r0 = r0.getTxs()     // Catch:{ Exception -> 0x05a2 }
                if (r0 == 0) goto L_0x0591
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x05a2 }
            L_0x0563:
                boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x05a2 }
                if (r2 == 0) goto L_0x058c
                java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x05a2 }
                r10 = r2
                net.safemoon.androidwallet.model.rpc2.bitcoin.Tx r10 = (net.safemoon.androidwallet.model.rpc2.bitcoin.C8602Tx) r10     // Catch:{ Exception -> 0x05a2 }
                java.lang.String r10 = r10.getHash()     // Catch:{ Exception -> 0x05a2 }
                r38 = r0
                T r0 = r15.element     // Catch:{ Exception -> 0x05a2 }
                net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r0     // Catch:{ Exception -> 0x05a2 }
                if (r0 == 0) goto L_0x0581
                java.lang.String r0 = r0.getTxid()     // Catch:{ Exception -> 0x05a2 }
                goto L_0x0582
            L_0x0581:
                r0 = 0
            L_0x0582:
                boolean r0 = p000.vx2.m53586b(r10, r0)     // Catch:{ Exception -> 0x05a2 }
                if (r0 == 0) goto L_0x0589
                goto L_0x058d
            L_0x0589:
                r0 = r38
                goto L_0x0563
            L_0x058c:
                r2 = 0
            L_0x058d:
                r0 = r2
                net.safemoon.androidwallet.model.rpc2.bitcoin.Tx r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.C8602Tx) r0     // Catch:{ Exception -> 0x05a2 }
                goto L_0x0592
            L_0x0591:
                r0 = 0
            L_0x0592:
                if (r0 == 0) goto L_0x0599
                java.lang.Integer r0 = r0.getBlockHeight()     // Catch:{ Exception -> 0x05a2 }
                goto L_0x059a
            L_0x0599:
                r0 = 0
            L_0x059a:
                if (r0 == 0) goto L_0x059e
                r11.element = r6     // Catch:{ Exception -> 0x05a2 }
            L_0x059e:
                r10 = r11
                r0 = r14
                r11 = r1
                goto L_0x05c6
            L_0x05a2:
                r0 = move-exception
                r11 = r1
                goto L_0x012d
            L_0x05a6:
                r16 = r2
                int r0 = r1.mo50579b()     // Catch:{ Exception -> 0x0678 }
                r1 = 400(0x190, float:5.6E-43)
                if (r0 != r1) goto L_0x05c5
                android.content.SharedPreferences r0 = r12.mo60826l()     // Catch:{ Exception -> 0x0678 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0678 }
                java.lang.Object r1 = r14.getKey()     // Catch:{ Exception -> 0x0678 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0678 }
                android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch:{ Exception -> 0x0678 }
                r0.apply()     // Catch:{ Exception -> 0x0678 }
            L_0x05c5:
                r0 = r14
            L_0x05c6:
                T r1 = r10.element     // Catch:{ Exception -> 0x0678 }
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0678 }
                int r1 = r1.length()     // Catch:{ Exception -> 0x0678 }
                if (r1 <= 0) goto L_0x05d2
                r1 = 1
                goto L_0x05d3
            L_0x05d2:
                r1 = 0
            L_0x05d3:
                if (r1 == 0) goto L_0x0448
                T r1 = r15.element     // Catch:{ Exception -> 0x0678 }
                if (r1 == 0) goto L_0x0448
                net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction r1 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r1     // Catch:{ Exception -> 0x0678 }
                if (r1 == 0) goto L_0x0448
                java.lang.String r1 = r1.getTxid()     // Catch:{ Exception -> 0x0678 }
                r13.setBlockHash(r1)     // Catch:{ Exception -> 0x0678 }
                T r1 = r10.element     // Catch:{ Exception -> 0x0678 }
                boolean r1 = p000.vx2.m53586b(r1, r6)     // Catch:{ Exception -> 0x0678 }
                if (r1 == 0) goto L_0x05f7
                r1 = 1
                java.lang.Integer r2 = p000.a40.m31673d(r1)     // Catch:{ Exception -> 0x05f4 }
                r10 = r2
                r2 = 0
                goto L_0x05fd
            L_0x05f4:
                r0 = move-exception
                goto L_0x012e
            L_0x05f7:
                r1 = 1
                r2 = 0
                java.lang.Integer r10 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x0675 }
            L_0x05fd:
                r13.setStatus(r10)     // Catch:{ Exception -> 0x0675 }
                T r9 = r9.element     // Catch:{ Exception -> 0x0675 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0675 }
                long r9 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x0675 }
                java.lang.String r9 = okhttp3.internal.Util.toHexString((long) r9)     // Catch:{ Exception -> 0x0675 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0675 }
                r10.<init>()     // Catch:{ Exception -> 0x0675 }
                r10.append(r5)     // Catch:{ Exception -> 0x0675 }
                r10.append(r9)     // Catch:{ Exception -> 0x0675 }
                java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x0675 }
                r13.setGasUsed(r9)     // Catch:{ Exception -> 0x0675 }
                com.google.gson.Gson r9 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0675 }
                r9.<init>()     // Catch:{ Exception -> 0x0675 }
                java.lang.String r10 = r13.toString()     // Catch:{ Exception -> 0x0675 }
                java.lang.Class<net.safemoon.androidwallet.model.request.RequestTransaction> r13 = net.safemoon.androidwallet.model.request.RequestTransaction.class
                java.lang.Object r9 = r9.fromJson((java.lang.String) r10, r13)     // Catch:{ Exception -> 0x0675 }
                net.safemoon.androidwallet.model.request.RequestTransaction r9 = (net.safemoon.androidwallet.model.request.RequestTransaction) r9     // Catch:{ Exception -> 0x0675 }
                tk5 r10 = p000.C9384u3.m72574o()     // Catch:{ Exception -> 0x0675 }
                k90 r9 = r10.mo66090i(r9)     // Catch:{ Exception -> 0x0675 }
                java.lang.String r10 = "getSafeMoonClient().saveTransaction(newRequest)"
                p000.vx2.m53590f(r9, r10)     // Catch:{ Exception -> 0x0675 }
                r7.L$0 = r12     // Catch:{ Exception -> 0x0675 }
                r7.L$1 = r11     // Catch:{ Exception -> 0x0675 }
                r7.L$2 = r0     // Catch:{ Exception -> 0x0675 }
                r10 = 0
                r7.L$3 = r10     // Catch:{ Exception -> 0x0673 }
                r7.L$4 = r10     // Catch:{ Exception -> 0x0673 }
                r7.L$5 = r10     // Catch:{ Exception -> 0x0673 }
                r7.L$6 = r10     // Catch:{ Exception -> 0x0673 }
                r13 = 4
                r7.label = r13     // Catch:{ Exception -> 0x0673 }
                java.lang.Object r9 = retrofit2.KotlinExtensions.m71521c(r9, r7)     // Catch:{ Exception -> 0x0673 }
                if (r9 != r4) goto L_0x0655
                return r4
            L_0x0655:
                bg5 r9 = (p000.bg5) r9     // Catch:{ Exception -> 0x0673 }
                boolean r9 = r9.mo50581e()     // Catch:{ Exception -> 0x0673 }
                if (r9 == 0) goto L_0x06a1
                android.content.SharedPreferences r9 = r12.mo60826l()     // Catch:{ Exception -> 0x0673 }
                android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ Exception -> 0x0673 }
                java.lang.Object r0 = r0.getKey()     // Catch:{ Exception -> 0x0673 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0673 }
                android.content.SharedPreferences$Editor r0 = r9.remove(r0)     // Catch:{ Exception -> 0x0673 }
                r0.apply()     // Catch:{ Exception -> 0x0673 }
                goto L_0x06a1
            L_0x0673:
                r0 = move-exception
                goto L_0x0694
            L_0x0675:
                r0 = move-exception
                goto L_0x012f
            L_0x0678:
                r0 = move-exception
                goto L_0x012d
            L_0x067b:
                r0 = move-exception
                r16 = r2
                r1 = 1
                r2 = 0
                r10 = 0
                r11 = r12
                goto L_0x0491
            L_0x0684:
                r16 = r2
                r1 = 1
                r2 = 0
                r10 = 0
                java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0673 }
                java.lang.String r9 = "Response Fail"
                r0.<init>(r9)     // Catch:{ Exception -> 0x0673 }
                throw r0     // Catch:{ Exception -> 0x0673 }
            L_0x0691:
                r0 = move-exception
                goto L_0x00b2
            L_0x0694:
                java.lang.String r0 = r0.getMessage()
                if (r0 == 0) goto L_0x06a1
                java.lang.String r9 = "TxnListService-Error"
                p000.ol0.m70350b0(r0, r9)
                r37 r0 = p000.r37.f33317a
            L_0x06a1:
                r1 = r37
                r2 = r16
                goto L_0x014c
            L_0x06a7:
                r37 r0 = p000.r37.f33317a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.service.TxnListService$checkAndSubmit$1.C86261.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TxnListService$checkAndSubmit$1(TxnListService txnListService, ns0<? super TxnListService$checkAndSubmit$1> ns0) {
        super(2, ns0);
        this.this$0 = txnListService;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TxnListService$checkAndSubmit$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TxnListService$checkAndSubmit$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final TxnListService txnListService = this.this$0;
            C86261 r1 = new C86261((ns0<? super C86261>) null);
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
