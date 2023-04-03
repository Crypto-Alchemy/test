package net.safemoon.androidwallet.repository;

import android.app.Application;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b'\u0010(J#\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/TransactionDataSource;", "Ldl4;", "", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "Lfl4;", "state", "l", "(Lfl4;)Ljava/lang/Integer;", "Ldl4$a;", "params", "Ldl4$b;", "f", "(Ldl4$a;Lns0;)Ljava/lang/Object;", "Landroid/app/Application;", "c", "Landroid/app/Application;", "application", "", "d", "Ljava/lang/String;", "address", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "e", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "userTokenItemDisplayModel", "Lnet/safemoon/androidwallet/common/TokenType;", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lk04;", "Lnet/safemoon/androidwallet/model/common/LoadingState;", "g", "Lk04;", "transactionLoadingState", "", "h", "Lef3;", "k", "()Ljava/util/List;", "pendinTxList", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;Lnet/safemoon/androidwallet/common/TokenType;Lk04;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransactionDataSource.kt */
public final class TransactionDataSource extends dl4<Integer, Result> {

    /* renamed from: c */
    public final Application f42530c;

    /* renamed from: d */
    public final String f42531d;

    /* renamed from: e */
    public final UserTokenItemDisplayModel f42532e;

    /* renamed from: f */
    public final TokenType f42533f;

    /* renamed from: g */
    public final k04<LoadingState> f42534g;

    /* renamed from: h */
    public final ef3 f42535h = C6169a.m47232a(new TransactionDataSource$pendinTxList$2(this));

    public TransactionDataSource(Application application, String str, UserTokenItemDisplayModel userTokenItemDisplayModel, TokenType tokenType, k04<LoadingState> k04) {
        vx2.m53591g(application, "application");
        vx2.m53591g(str, Address.TYPE_NAME);
        vx2.m53591g(userTokenItemDisplayModel, "userTokenItemDisplayModel");
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(k04, "transactionLoadingState");
        this.f42530c = application;
        this.f42531d = str;
        this.f42532e = userTokenItemDisplayModel;
        this.f42533f = tokenType;
        this.f42534g = k04;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0234, code lost:
        r7 = (net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTransaction) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0246, code lost:
        if (java.lang.Double.parseDouble(r7.getValue()) > com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0248, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024a, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024b, code lost:
        if (r8 == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024d, code lost:
        r35 = r3.f42531d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0252, code lost:
        r35 = "-";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0254, code lost:
        if (r8 == false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0256, code lost:
        r36 = "-";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0259, code lost:
        r36 = r3.f42531d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025d, code lost:
        r8 = java.lang.Math.abs(java.lang.Double.parseDouble(r7.getValue())) * ((double) java.math.BigDecimal.ONE.multiply(java.math.BigDecimal.TEN.pow(8)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0285, code lost:
        if (r7.getBlock() <= 0) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0287, code lost:
        r41 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028a, code lost:
        r41 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x028c, code lost:
        r6.add(new net.safemoon.androidwallet.model.transaction.history.Result(java.lang.String.valueOf(r7.getTime()), r7.getHash(), r35, r36, java.lang.String.valueOf(r8), (java.lang.String) null, java.math.BigDecimal.ONE.multiply(java.math.BigDecimal.TEN.pow(9)).toPlainString(), r4.getDecimals(), r41));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c0, code lost:
        r6 = p000.ck0.m33062j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c4, code lost:
        r5.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BlockChainTransactionList) ((p000.bg5) r0).mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0328, code lost:
        if (r2 != 1) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x032a, code lost:
        r7 = r3.mo60767k();
        r8 = new java.util.ArrayList();
        r7 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x033b, code lost:
        if (r7.hasNext() == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x033d, code lost:
        r9 = r7.next();
        r11 = (net.safemoon.androidwallet.model.transaction.history.Result) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0344, code lost:
        if (r0 == null) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0346, code lost:
        r12 = r0.getTxs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x034a, code lost:
        if (r12 == null) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x034c, code lost:
        r13 = new java.util.ArrayList();
        r12 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0359, code lost:
        if (r12.hasNext() == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x035b, code lost:
        r14 = ((net.safemoon.androidwallet.model.rpc2.bitcoin.C8602Tx) r12.next()).getHash();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0365, code lost:
        if (r14 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0367, code lost:
        r13.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0372, code lost:
        if (r13.contains(r11.hash) != true) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0374, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0376, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0377, code lost:
        if (r11 != false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0379, code lost:
        r8.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x037d, code lost:
        r7 = new java.util.ArrayList();
        r8 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038a, code lost:
        if (r8.hasNext() == false) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038c, code lost:
        r9 = r8.next();
        r11 = ((net.safemoon.androidwallet.model.transaction.history.Result) r9).from;
        p000.vx2.m53590f(r11, "it.from");
        r12 = java.util.Locale.ROOT;
        r11 = r11.toLowerCase(r12);
        p000.vx2.m53590f(r11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        r12 = r3.f42531d.toLowerCase(r12);
        p000.vx2.m53590f(r12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ae, code lost:
        if (p000.vx2.m53586b(r11, r12) == false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03b0, code lost:
        r7.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03b4, code lost:
        r6 = new java.util.ArrayList(p000.dk0.m43495u(r7, 10));
        r7 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03c7, code lost:
        if (r7.hasNext() == false) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c9, code lost:
        r8 = (net.safemoon.androidwallet.model.transaction.history.Result) r7.next();
        r8.f42485to = "-";
        r6.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03d5, code lost:
        r5.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03d8, code lost:
        if (r0 == null) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03da, code lost:
        r6 = r0.getTxs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03df, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e0, code lost:
        if (r6 == null) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03e6, code lost:
        if (r6.isEmpty() == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03e9, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03eb, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ec, code lost:
        if (r6 == false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ee, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03f0, code lost:
        r2 = p000.a40.m31673d(r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03f6, code lost:
        if (r0 == null) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03f8, code lost:
        r0 = r0.getTxs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03fc, code lost:
        if (r0 == null) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03fe, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0406, code lost:
        if (r0.hasNext() == false) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0408, code lost:
        r6 = (net.safemoon.androidwallet.model.rpc2.bitcoin.C8602Tx) r0.next();
        r7 = r6.getResult();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0412, code lost:
        if (r7 == null) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0414, code lost:
        r30 = r7.longValue();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x041d, code lost:
        r7 = 0;
        r30 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0423, code lost:
        if (r30 > r7) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0425, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0427, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x042c, code lost:
        if (r6.getBlockHeight() != null) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x042e, code lost:
        r41 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0431, code lost:
        r41 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0433, code lost:
        if (r7 == false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0435, code lost:
        r7 = r3.f42531d;
        r8 = r6.getResult();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x043b, code lost:
        if (r8 == null) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x043d, code lost:
        r8 = r8.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0442, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0444, code lost:
        r8 = java.lang.Math.abs(r8);
        r10 = r6.getFee();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x044c, code lost:
        if (r10 == null) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x044e, code lost:
        r10 = r10.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0453, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0454, code lost:
        r8 = r8 - ((long) java.lang.Math.abs(r10));
        r35 = r7;
        r36 = "-";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x045f, code lost:
        r7 = r3.f42531d;
        r8 = r6.getResult();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0465, code lost:
        if (r8 == null) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0467, code lost:
        r8 = r8.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x046c, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x046e, code lost:
        r8 = java.lang.Math.abs(r8);
        r36 = r7;
        r35 = "-";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0476, code lost:
        r5.add(new net.safemoon.androidwallet.model.transaction.history.Result(java.lang.String.valueOf(r6.getTime()), r6.getHash(), r35, r36, java.lang.String.valueOf(r8), java.lang.String.valueOf(r6.getFee()), java.math.BigDecimal.ONE.multiply(java.math.BigDecimal.TEN.pow(10)).toPlainString(), r4.getDecimals(), r41));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b0, code lost:
        r0 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b2, code lost:
        r3.f42534g.postValue(net.safemoon.androidwallet.model.common.LoadingState.Normal);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        r0 = (p000.bg5) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x050a, code lost:
        if (r0 == null) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x050c, code lost:
        r0 = (net.safemoon.androidwallet.model.transaction.history.SolNativeModel) r0.mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0513, code lost:
        r12 = r2;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0517, code lost:
        r4 = r6;
        r2 = r12;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051a, code lost:
        p000.vx2.m53588d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0523, code lost:
        if (r0.data.isEmpty() == false) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0525, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0527, code lost:
        r2 = p000.a40.m31673d(r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x052d, code lost:
        r0 = r0.data;
        p000.vx2.m53590f(r0, "response.data");
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x053c, code lost:
        if (r0.hasNext() == false) goto L_0x0797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x053e, code lost:
        r5 = (net.safemoon.androidwallet.model.transaction.history.SolNativeModel.SolNativeData) r0.next();
        r6 = r5.status;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x054c, code lost:
        if (p000.vx2.m53586b(r6, "Success") == false) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x054e, code lost:
        r16 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0557, code lost:
        if (p000.vx2.m53586b(r6, "Fail") == false) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0559, code lost:
        r16 = "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x055e, code lost:
        r16 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0560, code lost:
        r4.add(new net.safemoon.androidwallet.model.transaction.history.Result(java.lang.String.valueOf(r5.blockTime), r5.txHash, r5.src, r5.dst, java.lang.String.valueOf(java.lang.Math.abs(r5.lamport)), java.lang.String.valueOf(r5.fee), java.math.BigDecimal.ONE.multiply(java.math.BigDecimal.TEN.pow(9)).toPlainString(), r5.decimals, r16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        r0 = (p000.bg5) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05df, code lost:
        if (r0 == null) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05e1, code lost:
        r0 = (net.safemoon.androidwallet.model.transaction.history.SolSplFromExplorer) r0.mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05e7, code lost:
        if (r0 == null) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05e9, code lost:
        r0 = r0.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05ed, code lost:
        if (r0 == null) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05ef, code lost:
        r0 = r0.getTx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05f3, code lost:
        if (r0 == null) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05f5, code lost:
        r0 = r0.getTransactions();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05f9, code lost:
        if (r0 == null) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05fb, code lost:
        r11 = new java.util.ArrayList<>(p000.dk0.m43495u(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x060e, code lost:
        if (r0.hasNext() == false) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0610, code lost:
        r11.add(((net.safemoon.androidwallet.model.transaction.history.Transactions) r0.next()).getChange());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x061e, code lost:
        r12 = r5;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0622, code lost:
        r8 = r5;
        r5 = r12;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0625, code lost:
        r4 = r6;
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        r0 = (net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel) ((p000.bg5) r0).mo50578a();
        p000.vx2.m53588d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0810, code lost:
        if (r0.result.size() != 0) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0812, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0814, code lost:
        r4 = p000.a40.m31673d(r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x081a, code lost:
        r0 = r0.result;
        r3.f42534g.postValue(net.safemoon.androidwallet.model.common.LoadingState.Normal);
        p000.vx2.m53590f(r0, "postResult");
        r2 = new p000.dl4.C2176b.C2178b(r0, null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        return new p000.dl4.C2176b.C2178b(r5, null, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        return new p000.dl4.C2176b.C2178b(r5, null, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0 = (net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTxList) ((p000.bg5) r0).mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r2 != 1) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012b, code lost:
        r7 = r3.mo60767k();
        r11 = new java.util.ArrayList();
        r7 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013c, code lost:
        if (r7.hasNext() == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013e, code lost:
        r12 = r7.next();
        r13 = (net.safemoon.androidwallet.model.transaction.history.Result) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
        if (r0 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0147, code lost:
        r14 = r0.getDogeTransactions();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014b, code lost:
        if (r14 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014d, code lost:
        r43 = r7;
        r24 = r8;
        r25 = r9;
        r7 = new java.util.ArrayList(p000.dk0.m43495u(r14, 10));
        r8 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0166, code lost:
        if (r8.hasNext() == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0168, code lost:
        r7.add(((net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTransaction) r8.next()).getHash());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017d, code lost:
        if (r7.contains(r13.hash) != true) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
        r43 = r7;
        r24 = r8;
        r25 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0187, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0188, code lost:
        if (r7 != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018a, code lost:
        r11.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018d, code lost:
        r7 = r43;
        r8 = r24;
        r9 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0195, code lost:
        r24 = r8;
        r25 = r9;
        r7 = new java.util.ArrayList();
        r8 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a6, code lost:
        if (r8.hasNext() == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a8, code lost:
        r9 = r8.next();
        r11 = ((net.safemoon.androidwallet.model.transaction.history.Result) r9).from;
        p000.vx2.m53590f(r11, "it.from");
        r12 = java.util.Locale.ROOT;
        r11 = r11.toLowerCase(r12);
        p000.vx2.m53590f(r11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        r12 = r3.f42531d.toLowerCase(r12);
        p000.vx2.m53590f(r12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        if (p000.vx2.m53586b(r11, r12) == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cc, code lost:
        r7.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d0, code lost:
        r6 = new java.util.ArrayList(p000.dk0.m43495u(r7, 10));
        r7 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e3, code lost:
        if (r7.hasNext() == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e5, code lost:
        r8 = (net.safemoon.androidwallet.model.transaction.history.Result) r7.next();
        r8.f42485to = "-";
        r6.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f1, code lost:
        r5.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f5, code lost:
        r24 = r8;
        r25 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f9, code lost:
        if (r0 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fb, code lost:
        r6 = r0.getDogeTransactions();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0200, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0201, code lost:
        if (r6 == null) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0207, code lost:
        if (r6.isEmpty() == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        if (r6 == false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020f, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0211, code lost:
        r2 = p000.a40.m31673d(r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0217, code lost:
        if (r0 == null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0219, code lost:
        r0 = r0.getDogeTransactions();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021d, code lost:
        if (r0 == null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021f, code lost:
        r6 = new java.util.ArrayList(p000.dk0.m43495u(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0232, code lost:
        if (r0.hasNext() == false) goto L_0x02c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0680 A[Catch:{ Exception -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0689 A[Catch:{ Exception -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x068d A[Catch:{ Exception -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x068f A[Catch:{ Exception -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0696 A[Catch:{ Exception -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06cd A[Catch:{ Exception -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x06d0 A[Catch:{ Exception -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x0121=Splitter:B:48:0x0121, B:274:0x0664=Splitter:B:274:0x0664, B:217:0x0508=Splitter:B:217:0x0508, B:125:0x031f=Splitter:B:125:0x031f, B:327:0x07ff=Splitter:B:327:0x07ff} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8656f(p000.dl4.C2171a<java.lang.Integer> r43, p000.ns0<? super p000.dl4.C2176b<java.lang.Integer, net.safemoon.androidwallet.model.transaction.history.Result>> r44) {
        /*
            r42 = this;
            r1 = r42
            r0 = r44
            java.lang.String r2 = "solSpl.changeAmount"
            boolean r3 = r0 instanceof net.safemoon.androidwallet.repository.TransactionDataSource$load$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            net.safemoon.androidwallet.repository.TransactionDataSource$load$1 r3 = (net.safemoon.androidwallet.repository.TransactionDataSource$load$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            net.safemoon.androidwallet.repository.TransactionDataSource$load$1 r3 = new net.safemoon.androidwallet.repository.TransactionDataSource$load$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            java.lang.Object r4 = p000.wx2.m54101d()
            int r5 = r3.label
            java.lang.String r6 = "it.from"
            java.lang.String r8 = ""
            java.lang.String r9 = "1"
            java.lang.String r10 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            java.lang.String r15 = "-"
            r14 = 1
            switch(r5) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x009f;
                case 2: goto L_0x0088;
                case 3: goto L_0x0075;
                case 4: goto L_0x005a;
                case 5: goto L_0x0047;
                case 6: goto L_0x003c;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003c:
            int r2 = r3.I$0
            java.lang.Object r3 = r3.L$0
            net.safemoon.androidwallet.repository.TransactionDataSource r3 = (net.safemoon.androidwallet.repository.TransactionDataSource) r3
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x07ff
        L_0x0047:
            int r4 = r3.I$0
            java.lang.Object r5 = r3.L$2
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r3.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.L$0
            net.safemoon.androidwallet.repository.TransactionDataSource r3 = (net.safemoon.androidwallet.repository.TransactionDataSource) r3
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0664
        L_0x005a:
            int r5 = r3.I$0
            java.lang.Object r6 = r3.L$3
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r8 = r3.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.L$1
            i30 r9 = (p000.i30) r9
            java.lang.Object r7 = r3.L$0
            net.safemoon.androidwallet.repository.TransactionDataSource r7 = (net.safemoon.androidwallet.repository.TransactionDataSource) r7
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x05dd
        L_0x0071:
            r17 = r9
            goto L_0x062e
        L_0x0075:
            int r2 = r3.I$0
            java.lang.Object r4 = r3.L$1
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r3 = r3.L$0
            net.safemoon.androidwallet.repository.TransactionDataSource r3 = (net.safemoon.androidwallet.repository.TransactionDataSource) r3
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00b2 }
            r24 = r8
            r25 = r9
            goto L_0x0508
        L_0x0088:
            int r2 = r3.I$0
            java.lang.Object r4 = r3.L$2
            net.safemoon.androidwallet.common.TokenType r4 = (net.safemoon.androidwallet.common.TokenType) r4
            java.lang.Object r5 = r3.L$1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r3 = r3.L$0
            net.safemoon.androidwallet.repository.TransactionDataSource r3 = (net.safemoon.androidwallet.repository.TransactionDataSource) r3
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00b2 }
            r24 = r8
            r25 = r9
            goto L_0x031f
        L_0x009f:
            int r2 = r3.I$0
            java.lang.Object r4 = r3.L$2
            net.safemoon.androidwallet.common.TokenType r4 = (net.safemoon.androidwallet.common.TokenType) r4
            java.lang.Object r5 = r3.L$1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r3 = r3.L$0
            net.safemoon.androidwallet.repository.TransactionDataSource r3 = (net.safemoon.androidwallet.repository.TransactionDataSource) r3
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0121
        L_0x00b2:
            r0 = move-exception
            goto L_0x0831
        L_0x00b5:
            p000.hg5.m45199b(r0)
            net.safemoon.androidwallet.common.TokenType r0 = r1.f42533f
            i30 r0 = p000.ol0.m70377s(r0)
            net.safemoon.androidwallet.common.TokenType r5 = r1.f42533f
            java.lang.String r21 = p000.ol0.m70382x(r5)
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r5 = r1.f42532e
            java.lang.String r5 = r5.getContractAddress()
            int r7 = r5.length()
            if (r7 != 0) goto L_0x00d2
            r7 = r14
            goto L_0x00d3
        L_0x00d2:
            r7 = 0
        L_0x00d3:
            k04<net.safemoon.androidwallet.model.common.LoadingState> r12 = r1.f42534g     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.model.common.LoadingState r13 = net.safemoon.androidwallet.model.common.LoadingState.Loading     // Catch:{ Exception -> 0x082f }
            r12.postValue(r13)     // Catch:{ Exception -> 0x082f }
            java.lang.Object r12 = r43.mo18814a()     // Catch:{ Exception -> 0x082f }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ Exception -> 0x082f }
            if (r12 == 0) goto L_0x00e7
            int r12 = r12.intValue()     // Catch:{ Exception -> 0x082f }
            goto L_0x00e8
        L_0x00e7:
            r12 = r14
        L_0x00e8:
            net.safemoon.androidwallet.common.TokenType r13 = r1.f42533f     // Catch:{ Exception -> 0x082f }
            int r13 = r13.getChainId()     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType r17 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ Exception -> 0x082f }
            int r11 = r17.getChainId()     // Catch:{ Exception -> 0x082f }
            if (r13 != r11) goto L_0x02cf
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x082f }
            r5.<init>()     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType r7 = r1.f42533f     // Catch:{ Exception -> 0x082f }
            int r7 = r7.getChainId()     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType r2 = r2.mo57099b(r7)     // Catch:{ Exception -> 0x082f }
            java.lang.String r7 = r1.f42531d     // Catch:{ Exception -> 0x082f }
            k90 r0 = r0.mo52380c(r7, r12)     // Catch:{ Exception -> 0x082f }
            r3.L$0 = r1     // Catch:{ Exception -> 0x082f }
            r3.L$1 = r5     // Catch:{ Exception -> 0x082f }
            r3.L$2 = r2     // Catch:{ Exception -> 0x082f }
            r3.I$0 = r12     // Catch:{ Exception -> 0x082f }
            r3.label = r14     // Catch:{ Exception -> 0x082f }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r3)     // Catch:{ Exception -> 0x082f }
            if (r0 != r4) goto L_0x011e
            return r4
        L_0x011e:
            r3 = r1
            r4 = r2
            r2 = r12
        L_0x0121:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTxList r0 = (net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTxList) r0     // Catch:{ Exception -> 0x00b2 }
            if (r2 != r14) goto L_0x01f5
            java.util.List r7 = r3.mo60767k()     // Catch:{ Exception -> 0x00b2 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r11.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0138:
            boolean r12 = r7.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r12 == 0) goto L_0x0195
            java.lang.Object r12 = r7.next()     // Catch:{ Exception -> 0x00b2 }
            r13 = r12
            net.safemoon.androidwallet.model.transaction.history.Result r13 = (net.safemoon.androidwallet.model.transaction.history.Result) r13     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0181
            java.util.List r14 = r0.getDogeTransactions()     // Catch:{ Exception -> 0x00b2 }
            if (r14 == 0) goto L_0x0181
            r43 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r24 = r8
            r25 = r9
            r8 = 10
            int r9 = p000.dk0.m43495u(r14, r8)     // Catch:{ Exception -> 0x00b2 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r8 = r14.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0162:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r9 == 0) goto L_0x0176
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTransaction r9 = (net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTransaction) r9     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = r9.getHash()     // Catch:{ Exception -> 0x00b2 }
            r7.add(r9)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0162
        L_0x0176:
            java.lang.String r8 = r13.hash     // Catch:{ Exception -> 0x00b2 }
            boolean r7 = r7.contains(r8)     // Catch:{ Exception -> 0x00b2 }
            r8 = 1
            if (r7 != r8) goto L_0x0187
            r7 = 1
            goto L_0x0188
        L_0x0181:
            r43 = r7
            r24 = r8
            r25 = r9
        L_0x0187:
            r7 = 0
        L_0x0188:
            if (r7 != 0) goto L_0x018d
            r11.add(r12)     // Catch:{ Exception -> 0x00b2 }
        L_0x018d:
            r7 = r43
            r8 = r24
            r9 = r25
            r14 = 1
            goto L_0x0138
        L_0x0195:
            r24 = r8
            r25 = r9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r7.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r8 = r11.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x01a2:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r9 == 0) goto L_0x01d0
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00b2 }
            r11 = r9
            net.safemoon.androidwallet.model.transaction.history.Result r11 = (net.safemoon.androidwallet.model.transaction.history.Result) r11     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = r11.from     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r11, r6)     // Catch:{ Exception -> 0x00b2 }
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = r11.toLowerCase(r12)     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r11, r10)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r13 = r3.f42531d     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r12 = r13.toLowerCase(r12)     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r12, r10)     // Catch:{ Exception -> 0x00b2 }
            boolean r11 = p000.vx2.m53586b(r11, r12)     // Catch:{ Exception -> 0x00b2 }
            if (r11 == 0) goto L_0x01a2
            r7.add(r9)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x01a2
        L_0x01d0:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r8 = 10
            int r9 = p000.dk0.m43495u(r7, r8)     // Catch:{ Exception -> 0x00b2 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x01df:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r8 == 0) goto L_0x01f1
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.Result r8 = (net.safemoon.androidwallet.model.transaction.history.Result) r8     // Catch:{ Exception -> 0x00b2 }
            r8.f42485to = r15     // Catch:{ Exception -> 0x00b2 }
            r6.add(r8)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x01df
        L_0x01f1:
            r5.addAll(r6)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x01f9
        L_0x01f5:
            r24 = r8
            r25 = r9
        L_0x01f9:
            if (r0 == 0) goto L_0x0200
            java.util.List r6 = r0.getDogeTransactions()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0201
        L_0x0200:
            r6 = 0
        L_0x0201:
            if (r6 == 0) goto L_0x020c
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x00b2 }
            if (r6 == 0) goto L_0x020a
            goto L_0x020c
        L_0x020a:
            r6 = 0
            goto L_0x020d
        L_0x020c:
            r6 = 1
        L_0x020d:
            if (r6 == 0) goto L_0x0211
            r2 = 0
            goto L_0x0217
        L_0x0211:
            r6 = 1
            int r2 = r2 + r6
            java.lang.Integer r2 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x00b2 }
        L_0x0217:
            if (r0 == 0) goto L_0x02c0
            java.util.List r0 = r0.getDogeTransactions()     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x02c0
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r7 = 10
            int r7 = p000.dk0.m43495u(r0, r7)     // Catch:{ Exception -> 0x00b2 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x022e:
            boolean r7 = r0.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r7 == 0) goto L_0x02c4
            java.lang.Object r7 = r0.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTransaction r7 = (net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTransaction) r7     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = r7.getValue()     // Catch:{ Exception -> 0x00b2 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x00b2 }
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x024a
            r8 = 1
            goto L_0x024b
        L_0x024a:
            r8 = 0
        L_0x024b:
            if (r8 == 0) goto L_0x0252
            java.lang.String r9 = r3.f42531d     // Catch:{ Exception -> 0x00b2 }
            r35 = r9
            goto L_0x0254
        L_0x0252:
            r35 = r15
        L_0x0254:
            if (r8 == 0) goto L_0x0259
            r36 = r15
            goto L_0x025d
        L_0x0259:
            java.lang.String r8 = r3.f42531d     // Catch:{ Exception -> 0x00b2 }
            r36 = r8
        L_0x025d:
            java.lang.String r8 = r7.getValue()     // Catch:{ Exception -> 0x00b2 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x00b2 }
            double r8 = java.lang.Math.abs(r8)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r10 = java.math.BigDecimal.ONE     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r11 = java.math.BigDecimal.TEN     // Catch:{ Exception -> 0x00b2 }
            r12 = 8
            java.math.BigDecimal r11 = r11.pow(r12)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r10 = r10.multiply(r11)     // Catch:{ Exception -> 0x00b2 }
            long r10 = r10.longValue()     // Catch:{ Exception -> 0x00b2 }
            double r10 = (double) r10     // Catch:{ Exception -> 0x00b2 }
            double r8 = r8 * r10
            long r10 = r7.getBlock()     // Catch:{ Exception -> 0x00b2 }
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x028a
            r41 = r25
            goto L_0x028c
        L_0x028a:
            r41 = r24
        L_0x028c:
            net.safemoon.androidwallet.model.transaction.history.Result r10 = new net.safemoon.androidwallet.model.transaction.history.Result     // Catch:{ Exception -> 0x00b2 }
            long r11 = r7.getTime()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r33 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r34 = r7.getHash()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r37 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00b2 }
            r38 = 0
            java.math.BigDecimal r7 = java.math.BigDecimal.ONE     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r8 = java.math.BigDecimal.TEN     // Catch:{ Exception -> 0x00b2 }
            r9 = 9
            java.math.BigDecimal r8 = r8.pow(r9)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r7 = r7.multiply(r8)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r39 = r7.toPlainString()     // Catch:{ Exception -> 0x00b2 }
            int r40 = r4.getDecimals()     // Catch:{ Exception -> 0x00b2 }
            r32 = r10
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x00b2 }
            r6.add(r10)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x022e
        L_0x02c0:
            java.util.List r6 = p000.ck0.m33062j()     // Catch:{ Exception -> 0x00b2 }
        L_0x02c4:
            r5.addAll(r6)     // Catch:{ Exception -> 0x00b2 }
            dl4$b$b r0 = new dl4$b$b     // Catch:{ Exception -> 0x00b2 }
            r4 = 0
            r0.<init>(r5, r4, r2)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0841
        L_0x02cf:
            r24 = r8
            r25 = r9
            net.safemoon.androidwallet.common.TokenType r8 = r1.f42533f     // Catch:{ Exception -> 0x082f }
            int r8 = r8.getChainId()     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType r9 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN     // Catch:{ Exception -> 0x082f }
            int r9 = r9.getChainId()     // Catch:{ Exception -> 0x082f }
            if (r8 != r9) goto L_0x04c1
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x082f }
            r5.<init>()     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType r7 = r1.f42533f     // Catch:{ Exception -> 0x082f }
            int r7 = r7.getChainId()     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType r2 = r2.mo57099b(r7)     // Catch:{ Exception -> 0x082f }
            java.lang.String r7 = r1.f42531d     // Catch:{ Exception -> 0x082f }
            int r8 = r12 + -1
            r9 = 50
            int r19 = r8 * 50
            r20 = 0
            r21 = 0
            r22 = 12
            r23 = 0
            r17 = r0
            r18 = r7
            k90 r0 = p000.i30.C7204a.m58792a(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x082f }
            r3.L$0 = r1     // Catch:{ Exception -> 0x082f }
            r3.L$1 = r5     // Catch:{ Exception -> 0x082f }
            r3.L$2 = r2     // Catch:{ Exception -> 0x082f }
            r3.I$0 = r12     // Catch:{ Exception -> 0x082f }
            r7 = 2
            r3.label = r7     // Catch:{ Exception -> 0x082f }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r3)     // Catch:{ Exception -> 0x082f }
            if (r0 != r4) goto L_0x031c
            return r4
        L_0x031c:
            r3 = r1
            r4 = r2
            r2 = r12
        L_0x031f:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.rpc2.bitcoin.BlockChainTransactionList r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BlockChainTransactionList) r0     // Catch:{ Exception -> 0x00b2 }
            r7 = 1
            if (r2 != r7) goto L_0x03d8
            java.util.List r7 = r3.mo60767k()     // Catch:{ Exception -> 0x00b2 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r8.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0337:
            boolean r9 = r7.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r9 == 0) goto L_0x037d
            java.lang.Object r9 = r7.next()     // Catch:{ Exception -> 0x00b2 }
            r11 = r9
            net.safemoon.androidwallet.model.transaction.history.Result r11 = (net.safemoon.androidwallet.model.transaction.history.Result) r11     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0376
            java.util.List r12 = r0.getTxs()     // Catch:{ Exception -> 0x00b2 }
            if (r12 == 0) goto L_0x0376
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r13.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0355:
            boolean r14 = r12.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r14 == 0) goto L_0x036b
            java.lang.Object r14 = r12.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.rpc2.bitcoin.Tx r14 = (net.safemoon.androidwallet.model.rpc2.bitcoin.C8602Tx) r14     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r14 = r14.getHash()     // Catch:{ Exception -> 0x00b2 }
            if (r14 == 0) goto L_0x0355
            r13.add(r14)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0355
        L_0x036b:
            java.lang.String r11 = r11.hash     // Catch:{ Exception -> 0x00b2 }
            boolean r11 = r13.contains(r11)     // Catch:{ Exception -> 0x00b2 }
            r12 = 1
            if (r11 != r12) goto L_0x0376
            r11 = 1
            goto L_0x0377
        L_0x0376:
            r11 = 0
        L_0x0377:
            if (r11 != 0) goto L_0x0337
            r8.add(r9)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0337
        L_0x037d:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r7.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0386:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r9 == 0) goto L_0x03b4
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00b2 }
            r11 = r9
            net.safemoon.androidwallet.model.transaction.history.Result r11 = (net.safemoon.androidwallet.model.transaction.history.Result) r11     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = r11.from     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r11, r6)     // Catch:{ Exception -> 0x00b2 }
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = r11.toLowerCase(r12)     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r11, r10)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r13 = r3.f42531d     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r12 = r13.toLowerCase(r12)     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r12, r10)     // Catch:{ Exception -> 0x00b2 }
            boolean r11 = p000.vx2.m53586b(r11, r12)     // Catch:{ Exception -> 0x00b2 }
            if (r11 == 0) goto L_0x0386
            r7.add(r9)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0386
        L_0x03b4:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r8 = 10
            int r9 = p000.dk0.m43495u(r7, r8)     // Catch:{ Exception -> 0x00b2 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x03c3:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r8 == 0) goto L_0x03d5
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.Result r8 = (net.safemoon.androidwallet.model.transaction.history.Result) r8     // Catch:{ Exception -> 0x00b2 }
            r8.f42485to = r15     // Catch:{ Exception -> 0x00b2 }
            r6.add(r8)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x03c3
        L_0x03d5:
            r5.addAll(r6)     // Catch:{ Exception -> 0x00b2 }
        L_0x03d8:
            if (r0 == 0) goto L_0x03df
            java.util.List r6 = r0.getTxs()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x03e0
        L_0x03df:
            r6 = 0
        L_0x03e0:
            if (r6 == 0) goto L_0x03eb
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x00b2 }
            if (r6 == 0) goto L_0x03e9
            goto L_0x03eb
        L_0x03e9:
            r6 = 0
            goto L_0x03ec
        L_0x03eb:
            r6 = 1
        L_0x03ec:
            if (r6 == 0) goto L_0x03f0
            r2 = 0
            goto L_0x03f6
        L_0x03f0:
            r6 = 1
            int r2 = r2 + r6
            java.lang.Integer r2 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x00b2 }
        L_0x03f6:
            if (r0 == 0) goto L_0x04b2
            java.util.List r0 = r0.getTxs()     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x04b2
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0402:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r6 == 0) goto L_0x04b0
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.rpc2.bitcoin.Tx r6 = (net.safemoon.androidwallet.model.rpc2.bitcoin.C8602Tx) r6     // Catch:{ Exception -> 0x00b2 }
            java.lang.Long r7 = r6.getResult()     // Catch:{ Exception -> 0x00b2 }
            if (r7 == 0) goto L_0x041d
            long r7 = r7.longValue()     // Catch:{ Exception -> 0x00b2 }
            r30 = r7
            r7 = 0
            goto L_0x0421
        L_0x041d:
            r7 = 0
            r30 = 0
        L_0x0421:
            int r9 = (r30 > r7 ? 1 : (r30 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0427
            r7 = 1
            goto L_0x0428
        L_0x0427:
            r7 = 0
        L_0x0428:
            java.lang.Integer r8 = r6.getBlockHeight()     // Catch:{ Exception -> 0x00b2 }
            if (r8 != 0) goto L_0x0431
            r41 = r24
            goto L_0x0433
        L_0x0431:
            r41 = r25
        L_0x0433:
            if (r7 == 0) goto L_0x045f
            java.lang.String r7 = r3.f42531d     // Catch:{ Exception -> 0x00b2 }
            java.lang.Long r8 = r6.getResult()     // Catch:{ Exception -> 0x00b2 }
            if (r8 == 0) goto L_0x0442
            long r8 = r8.longValue()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0444
        L_0x0442:
            r8 = 0
        L_0x0444:
            long r8 = java.lang.Math.abs(r8)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r10 = r6.getFee()     // Catch:{ Exception -> 0x00b2 }
            if (r10 == 0) goto L_0x0453
            int r10 = r10.intValue()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0454
        L_0x0453:
            r10 = 0
        L_0x0454:
            int r10 = java.lang.Math.abs(r10)     // Catch:{ Exception -> 0x00b2 }
            long r10 = (long) r10     // Catch:{ Exception -> 0x00b2 }
            long r8 = r8 - r10
            r35 = r7
            r36 = r15
            goto L_0x0476
        L_0x045f:
            java.lang.String r7 = r3.f42531d     // Catch:{ Exception -> 0x00b2 }
            java.lang.Long r8 = r6.getResult()     // Catch:{ Exception -> 0x00b2 }
            if (r8 == 0) goto L_0x046c
            long r8 = r8.longValue()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x046e
        L_0x046c:
            r8 = 0
        L_0x046e:
            long r8 = java.lang.Math.abs(r8)     // Catch:{ Exception -> 0x00b2 }
            r36 = r7
            r35 = r15
        L_0x0476:
            net.safemoon.androidwallet.model.transaction.history.Result r7 = new net.safemoon.androidwallet.model.transaction.history.Result     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r10 = r6.getTime()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r33 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r34 = r6.getHash()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r37 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r6 = r6.getFee()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r38 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r6 = java.math.BigDecimal.ONE     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r8 = java.math.BigDecimal.TEN     // Catch:{ Exception -> 0x00b2 }
            r9 = 10
            java.math.BigDecimal r8 = r8.pow(r9)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r6 = r6.multiply(r8)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r39 = r6.toPlainString()     // Catch:{ Exception -> 0x00b2 }
            int r40 = r4.getDecimals()     // Catch:{ Exception -> 0x00b2 }
            r32 = r7
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x00b2 }
            r5.add(r7)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0402
        L_0x04b0:
            r37 r0 = p000.r37.f33317a     // Catch:{ Exception -> 0x00b2 }
        L_0x04b2:
            k04<net.safemoon.androidwallet.model.common.LoadingState> r0 = r3.f42534g     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.common.LoadingState r4 = net.safemoon.androidwallet.model.common.LoadingState.Normal     // Catch:{ Exception -> 0x00b2 }
            r0.postValue(r4)     // Catch:{ Exception -> 0x00b2 }
            dl4$b$b r0 = new dl4$b$b     // Catch:{ Exception -> 0x00b2 }
            r4 = 0
            r0.<init>(r5, r4, r2)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0841
        L_0x04c1:
            net.safemoon.androidwallet.common.TokenType r6 = r1.f42533f     // Catch:{ Exception -> 0x082f }
            int r6 = r6.getChainId()     // Catch:{ Exception -> 0x082f }
            net.safemoon.androidwallet.common.TokenType r8 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ Exception -> 0x082f }
            int r8 = r8.getChainId()     // Catch:{ Exception -> 0x082f }
            if (r6 != r8) goto L_0x07aa
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x082f }
            r6.<init>()     // Catch:{ Exception -> 0x082f }
            if (r7 == 0) goto L_0x059a
            java.lang.String r2 = r1.f42531d     // Catch:{ Exception -> 0x082f }
            r5 = 50
            java.lang.Integer r19 = p000.a40.m31673d(r5)     // Catch:{ Exception -> 0x082f }
            int r7 = r12 + -1
            int r7 = r7 * r5
            java.lang.Integer r20 = p000.a40.m31673d(r7)     // Catch:{ Exception -> 0x082f }
            r21 = 0
            r22 = 8
            r23 = 0
            r17 = r0
            r18 = r2
            k90 r0 = p000.i30.C7204a.m58794c(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x082f }
            if (r0 == 0) goto L_0x0516
            r3.L$0 = r1     // Catch:{ Exception -> 0x082f }
            r3.L$1 = r6     // Catch:{ Exception -> 0x082f }
            r3.I$0 = r12     // Catch:{ Exception -> 0x082f }
            r2 = 3
            r3.label = r2     // Catch:{ Exception -> 0x082f }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r3)     // Catch:{ Exception -> 0x082f }
            if (r0 != r4) goto L_0x0505
            return r4
        L_0x0505:
            r3 = r1
            r4 = r6
            r2 = r12
        L_0x0508:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0513
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.SolNativeModel r0 = (net.safemoon.androidwallet.model.transaction.history.SolNativeModel) r0     // Catch:{ Exception -> 0x00b2 }
            goto L_0x051a
        L_0x0513:
            r12 = r2
            r6 = r4
            goto L_0x0517
        L_0x0516:
            r3 = r1
        L_0x0517:
            r4 = r6
            r2 = r12
            r0 = 0
        L_0x051a:
            p000.vx2.m53588d(r0)     // Catch:{ Exception -> 0x00b2 }
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.SolNativeModel$SolNativeData> r5 = r0.data     // Catch:{ Exception -> 0x00b2 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00b2 }
            if (r5 == 0) goto L_0x0527
            r2 = 0
            goto L_0x052d
        L_0x0527:
            r5 = 1
            int r2 = r2 + r5
            java.lang.Integer r2 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x00b2 }
        L_0x052d:
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.SolNativeModel$SolNativeData> r0 = r0.data     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "response.data"
            p000.vx2.m53590f(r0, r5)     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x0538:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r5 == 0) goto L_0x0797
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.SolNativeModel$SolNativeData r5 = (net.safemoon.androidwallet.model.transaction.history.SolNativeModel.SolNativeData) r5     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r6 = r5.status     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = "Success"
            boolean r7 = p000.vx2.m53586b(r6, r7)     // Catch:{ Exception -> 0x00b2 }
            if (r7 == 0) goto L_0x0551
            r16 = r25
            goto L_0x0560
        L_0x0551:
            java.lang.String r7 = "Fail"
            boolean r6 = p000.vx2.m53586b(r6, r7)     // Catch:{ Exception -> 0x00b2 }
            if (r6 == 0) goto L_0x055e
            java.lang.String r6 = "0"
            r16 = r6
            goto L_0x0560
        L_0x055e:
            r16 = r24
        L_0x0560:
            net.safemoon.androidwallet.model.transaction.history.Result r6 = new net.safemoon.androidwallet.model.transaction.history.Result     // Catch:{ Exception -> 0x00b2 }
            long r7 = r5.blockTime     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = r5.txHash     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r10 = r5.src     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = r5.dst     // Catch:{ Exception -> 0x00b2 }
            long r12 = r5.lamport     // Catch:{ Exception -> 0x00b2 }
            long r12 = java.lang.Math.abs(r12)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x00b2 }
            long r13 = r5.fee     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r7 = java.math.BigDecimal.ONE     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r14 = java.math.BigDecimal.TEN     // Catch:{ Exception -> 0x00b2 }
            r15 = 9
            java.math.BigDecimal r14 = r14.pow(r15)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r7 = r7.multiply(r14)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r14 = r7.toPlainString()     // Catch:{ Exception -> 0x00b2 }
            int r15 = r5.decimals     // Catch:{ Exception -> 0x00b2 }
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00b2 }
            r4.add(r6)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0538
        L_0x059a:
            jl1 r7 = p000.C9384u3.m72570k()     // Catch:{ Exception -> 0x0629 }
            java.lang.String r8 = "getDynamicClient()"
            p000.vx2.m53590f(r7, r8)     // Catch:{ Exception -> 0x0629 }
            r23 = 0
            java.lang.String r8 = r1.f42531d     // Catch:{ Exception -> 0x0629 }
            r9 = 50
            java.lang.Integer r26 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x0629 }
            int r11 = r12 + -1
            int r11 = r11 * r9
            java.lang.Integer r27 = p000.a40.m31673d(r11)     // Catch:{ Exception -> 0x0629 }
            r28 = 1
            r29 = 0
            r22 = r7
            r24 = r8
            r25 = r5
            k90 r7 = p000.jl1.C7299a.m59465a(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0629 }
            if (r7 == 0) goto L_0x0621
            r3.L$0 = r1     // Catch:{ Exception -> 0x0629 }
            r3.L$1 = r0     // Catch:{ Exception -> 0x0629 }
            r3.L$2 = r5     // Catch:{ Exception -> 0x0629 }
            r3.L$3 = r6     // Catch:{ Exception -> 0x0629 }
            r3.I$0 = r12     // Catch:{ Exception -> 0x0629 }
            r8 = 4
            r3.label = r8     // Catch:{ Exception -> 0x0629 }
            java.lang.Object r7 = retrofit2.KotlinExtensions.m71521c(r7, r3)     // Catch:{ Exception -> 0x0629 }
            if (r7 != r4) goto L_0x05d8
            return r4
        L_0x05d8:
            r9 = r0
            r8 = r5
            r0 = r7
            r5 = r12
            r7 = r1
        L_0x05dd:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x061e
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.transaction.history.SolSplFromExplorer r0 = (net.safemoon.androidwallet.model.transaction.history.SolSplFromExplorer) r0     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x061e
            net.safemoon.androidwallet.model.transaction.history.ExplorerData r0 = r0.getData()     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x061e
            net.safemoon.androidwallet.model.transaction.history.Tx r0 = r0.getTx()     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x061e
            java.util.ArrayList r0 = r0.getTransactions()     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x061e
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0071 }
            r12 = 10
            int r12 = p000.dk0.m43495u(r0, r12)     // Catch:{ Exception -> 0x0071 }
            r11.<init>(r12)     // Catch:{ Exception -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0071 }
        L_0x060a:
            boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x0071 }
            if (r12 == 0) goto L_0x0625
            java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.transaction.history.Transactions r12 = (net.safemoon.androidwallet.model.transaction.history.Transactions) r12     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.transaction.history.SolSplData r12 = r12.getChange()     // Catch:{ Exception -> 0x0071 }
            r11.add(r12)     // Catch:{ Exception -> 0x0071 }
            goto L_0x060a
        L_0x061e:
            r12 = r5
            r5 = r8
            goto L_0x0622
        L_0x0621:
            r7 = r1
        L_0x0622:
            r8 = r5
            r5 = r12
            r11 = 0
        L_0x0625:
            r4 = r6
            r3 = r7
            goto L_0x067e
        L_0x0629:
            r17 = r0
            r7 = r1
            r8 = r5
            r5 = r12
        L_0x062e:
            java.lang.String r0 = r7.f42531d     // Catch:{ Exception -> 0x07a6 }
            r9 = 50
            java.lang.Integer r19 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x07a6 }
            int r11 = r5 + -1
            int r11 = r11 * r9
            java.lang.Integer r20 = p000.a40.m31673d(r11)     // Catch:{ Exception -> 0x07a6 }
            r21 = 0
            r22 = 8
            r23 = 0
            r18 = r0
            k90 r0 = p000.i30.C7204a.m58795d(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x07a6 }
            if (r0 == 0) goto L_0x067a
            r3.L$0 = r7     // Catch:{ Exception -> 0x07a6 }
            r3.L$1 = r8     // Catch:{ Exception -> 0x07a6 }
            r3.L$2 = r6     // Catch:{ Exception -> 0x07a6 }
            r9 = 0
            r3.L$3 = r9     // Catch:{ Exception -> 0x07a6 }
            r3.I$0 = r5     // Catch:{ Exception -> 0x07a6 }
            r9 = 5
            r3.label = r9     // Catch:{ Exception -> 0x07a6 }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r3)     // Catch:{ Exception -> 0x07a6 }
            if (r0 != r4) goto L_0x0660
            return r4
        L_0x0660:
            r4 = r5
            r5 = r6
            r3 = r7
            r6 = r8
        L_0x0664:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0676
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.SolSplModel r0 = (net.safemoon.androidwallet.model.transaction.history.SolSplModel) r0     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0676
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.SolSplData> r0 = r0.data     // Catch:{ Exception -> 0x00b2 }
            r8 = r6
            r6 = r5
            r5 = r4
            goto L_0x067c
        L_0x0676:
            r7 = r3
            r8 = r6
            r6 = r5
            r5 = r4
        L_0x067a:
            r3 = r7
            r0 = 0
        L_0x067c:
            r11 = r0
            r4 = r6
        L_0x067e:
            if (r11 == 0) goto L_0x0689
            boolean r0 = r11.isEmpty()     // Catch:{ Exception -> 0x00b2 }
            r6 = 1
            if (r0 != r6) goto L_0x068a
            r0 = r6
            goto L_0x068b
        L_0x0689:
            r6 = 1
        L_0x068a:
            r0 = 0
        L_0x068b:
            if (r0 == 0) goto L_0x068f
            r0 = 0
            goto L_0x0694
        L_0x068f:
            int r5 = r5 + r6
            java.lang.Integer r0 = p000.a40.m31673d(r5)     // Catch:{ Exception -> 0x00b2 }
        L_0x0694:
            if (r11 == 0) goto L_0x06cd
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2 }
            r5.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.util.Iterator r6 = r11.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x069f:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r7 == 0) goto L_0x06ce
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00b2 }
            r9 = r7
            net.safemoon.androidwallet.model.transaction.history.SolSplData r9 = (net.safemoon.androidwallet.model.transaction.history.SolSplData) r9     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = r9.tokenAddress     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = "solSpl.tokenAddress"
            p000.vx2.m53590f(r9, r11)     // Catch:{ Exception -> 0x00b2 }
            java.util.Locale r11 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = r9.toLowerCase(r11)     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r9, r10)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r11 = r8.toLowerCase(r11)     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r11, r10)     // Catch:{ Exception -> 0x00b2 }
            boolean r9 = p000.vx2.m53586b(r9, r11)     // Catch:{ Exception -> 0x00b2 }
            if (r9 == 0) goto L_0x069f
            r5.add(r7)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x069f
        L_0x06cd:
            r5 = 0
        L_0x06ce:
            if (r5 == 0) goto L_0x0796
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x00b2 }
        L_0x06d4:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r6 == 0) goto L_0x0794
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.SolSplData r6 = (net.safemoon.androidwallet.model.transaction.history.SolSplData) r6     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r7 = r6.blockTime     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r18 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00b2 }
            java.util.List<java.lang.String> r7 = r6.signature     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = "solSpl.signature"
            p000.vx2.m53590f(r7, r8)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r7)     // Catch:{ Exception -> 0x00b2 }
            r19 = r7
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = r6.owner     // Catch:{ Exception -> 0x00b2 }
            java.lang.Long r8 = r6.changeAmount     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r8, r2)     // Catch:{ Exception -> 0x00b2 }
            long r8 = r8.longValue()     // Catch:{ Exception -> 0x00b2 }
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0709
            r20 = r15
            goto L_0x070b
        L_0x0709:
            r20 = r7
        L_0x070b:
            java.lang.String r7 = r6.owner     // Catch:{ Exception -> 0x00b2 }
            java.lang.Long r8 = r6.changeAmount     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r8, r2)     // Catch:{ Exception -> 0x00b2 }
            long r8 = r8.longValue()     // Catch:{ Exception -> 0x00b2 }
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x071f
            r21 = r15
            goto L_0x0721
        L_0x071f:
            r21 = r7
        L_0x0721:
            java.lang.String r7 = r6.symbol     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = r6.tokenAddress     // Catch:{ Exception -> 0x00b2 }
            java.lang.Long r9 = r6.changeAmount     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53590f(r9, r2)     // Catch:{ Exception -> 0x00b2 }
            long r12 = r9.longValue()     // Catch:{ Exception -> 0x00b2 }
            long r12 = java.lang.Math.abs(r12)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r24 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r9 = r6.fee     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r25 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r9 = java.math.BigDecimal.ONE     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r12 = java.math.BigDecimal.TEN     // Catch:{ Exception -> 0x00b2 }
            r13 = 9
            java.math.BigDecimal r12 = r12.pow(r13)     // Catch:{ Exception -> 0x00b2 }
            java.math.BigDecimal r9 = r9.multiply(r12)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r26 = r9.toPlainString()     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r9 = r6.decimals     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r12 = "solSpl.decimals"
            p000.vx2.m53590f(r9, r12)     // Catch:{ Exception -> 0x00b2 }
            int r27 = r9.intValue()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.Result r9 = new net.safemoon.androidwallet.model.transaction.history.Result     // Catch:{ Exception -> 0x00b2 }
            r17 = r9
            r22 = r7
            r23 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x00b2 }
            dq6$a r7 = p000.dq6.f37375a     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = "TAG-ASSO 3"
            dq6$b r8 = r7.mo51267e(r8)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r12 = r6.owner     // Catch:{ Exception -> 0x00b2 }
            r14 = 0
            java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x00b2 }
            r8.mo51265b(r12, r10)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = "TAG-ASSO 4"
            dq6$b r8 = r7.mo51267e(r8)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r6 = r6.address     // Catch:{ Exception -> 0x00b2 }
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00b2 }
            r8.mo51265b(r6, r11)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r6 = "TAG-ASSO 5"
            dq6$b r6 = r7.mo51267e(r6)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = "\n*********************\n"
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00b2 }
            r6.mo51265b(r7, r8)     // Catch:{ Exception -> 0x00b2 }
            r4.add(r9)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x06d4
        L_0x0794:
            r37 r2 = p000.r37.f33317a     // Catch:{ Exception -> 0x00b2 }
        L_0x0796:
            r2 = r0
        L_0x0797:
            k04<net.safemoon.androidwallet.model.common.LoadingState> r0 = r3.f42534g     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.common.LoadingState r5 = net.safemoon.androidwallet.model.common.LoadingState.Normal     // Catch:{ Exception -> 0x00b2 }
            r0.postValue(r5)     // Catch:{ Exception -> 0x00b2 }
            dl4$b$b r0 = new dl4$b$b     // Catch:{ Exception -> 0x00b2 }
            r5 = 0
            r0.<init>(r4, r5, r2)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0841
        L_0x07a6:
            r0 = move-exception
            r3 = r7
            goto L_0x0831
        L_0x07aa:
            r2 = 100
            if (r7 == 0) goto L_0x07ce
            java.lang.String r5 = r1.f42531d     // Catch:{ Exception -> 0x082f }
            java.lang.Integer r19 = p000.a40.m31673d(r12)     // Catch:{ Exception -> 0x082f }
            java.lang.Integer r20 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x082f }
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 112(0x70, float:1.57E-43)
            r26 = 0
            r17 = r0
            r18 = r5
            k90 r0 = p000.i30.C7204a.m58793b(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x082f }
            p000.vx2.m53588d(r0)     // Catch:{ Exception -> 0x082f }
            goto L_0x07ef
        L_0x07ce:
            java.lang.String r6 = r1.f42531d     // Catch:{ Exception -> 0x082f }
            java.lang.Integer r19 = p000.a40.m31673d(r12)     // Catch:{ Exception -> 0x082f }
            java.lang.Integer r20 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x082f }
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 224(0xe0, float:3.14E-43)
            r27 = 0
            r17 = r0
            r18 = r6
            r22 = r5
            k90 r0 = p000.i30.C7204a.m58798g(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x082f }
            p000.vx2.m53588d(r0)     // Catch:{ Exception -> 0x082f }
        L_0x07ef:
            r3.L$0 = r1     // Catch:{ Exception -> 0x082f }
            r3.I$0 = r12     // Catch:{ Exception -> 0x082f }
            r2 = 6
            r3.label = r2     // Catch:{ Exception -> 0x082f }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r3)     // Catch:{ Exception -> 0x082f }
            if (r0 != r4) goto L_0x07fd
            return r4
        L_0x07fd:
            r3 = r1
            r2 = r12
        L_0x07ff:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel r0 = (net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel) r0     // Catch:{ Exception -> 0x00b2 }
            p000.vx2.m53588d(r0)     // Catch:{ Exception -> 0x00b2 }
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.Result> r4 = r0.result     // Catch:{ Exception -> 0x00b2 }
            int r4 = r4.size()     // Catch:{ Exception -> 0x00b2 }
            if (r4 != 0) goto L_0x0814
            r4 = 0
            goto L_0x081a
        L_0x0814:
            r4 = 1
            int r2 = r2 + r4
            java.lang.Integer r4 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x00b2 }
        L_0x081a:
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.Result> r0 = r0.result     // Catch:{ Exception -> 0x00b2 }
            k04<net.safemoon.androidwallet.model.common.LoadingState> r2 = r3.f42534g     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.common.LoadingState r5 = net.safemoon.androidwallet.model.common.LoadingState.Normal     // Catch:{ Exception -> 0x00b2 }
            r2.postValue(r5)     // Catch:{ Exception -> 0x00b2 }
            dl4$b$b r2 = new dl4$b$b     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "postResult"
            p000.vx2.m53590f(r0, r5)     // Catch:{ Exception -> 0x00b2 }
            r5 = 0
            r2.<init>(r0, r5, r4)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0840
        L_0x082f:
            r0 = move-exception
            r3 = r1
        L_0x0831:
            r0.printStackTrace()
            k04<net.safemoon.androidwallet.model.common.LoadingState> r2 = r3.f42534g
            net.safemoon.androidwallet.model.common.LoadingState r3 = net.safemoon.androidwallet.model.common.LoadingState.Normal
            r2.postValue(r3)
            dl4$b$a r2 = new dl4$b$a
            r2.<init>(r0)
        L_0x0840:
            r0 = r2
        L_0x0841:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.TransactionDataSource.mo8656f(dl4$a, ns0):java.lang.Object");
    }

    /* renamed from: k */
    public final List<Result> mo60767k() {
        return (List) this.f42535h.getValue();
    }

    /* renamed from: l */
    public Integer mo8655d(fl4<Integer, Result> fl4) {
        vx2.m53591g(fl4, "state");
        return 1;
    }
}
