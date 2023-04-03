package net.safemoon.androidwallet.worker.nfts.solana;

import android.content.Context;
import androidx.work.C1519b;
import androidx.work.C1521c;
import androidx.work.C1523d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts;
import net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource;
import net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0013\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo44877d2 = {"Lnet/safemoon/androidwallet/worker/nfts/solana/SolanaNftWorker;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker$a;", "r", "(Lns0;)Ljava/lang/Object;", "T", "", "src", "key", "C", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "Lv56;", "kotlin.jvm.PlatformType", "y", "Lef3;", "B", "()Lv56;", "solanaMoralisClient", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "A", "z", "()Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "db", "Lnet/safemoon/androidwallet/repository/dataSource/collection/CollectionDataSource;", "()Lnet/safemoon/androidwallet/repository/dataSource/collection/CollectionDataSource;", "collectionDataSource", "Lnet/safemoon/androidwallet/repository/dataSource/collection/NftDataSource;", "()Lnet/safemoon/androidwallet/repository/dataSource/collection/NftDataSource;", "nftDataSource", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "H", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SolanaNftWorker.kt */
public final class SolanaNftWorker extends CoroutineWorker {

    /* renamed from: H */
    public static final C8978a f43460H = new C8978a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f43461A;

    /* renamed from: B */
    public final ef3 f43462B;

    /* renamed from: C */
    public final ef3 f43463C;

    /* renamed from: y */
    public final ef3 f43464y = C6169a.m47232a(SolanaNftWorker$solanaMoralisClient$2.INSTANCE);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/worker/nfts/solana/SolanaNftWorker$a;", "", "", "mint", "Landroidx/work/c;", "a", "MINT_ARRAY", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$a */
    /* compiled from: SolanaNftWorker.kt */
    public static final class C8978a {
        public C8978a() {
        }

        public /* synthetic */ C8978a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1521c mo62357a(String str) {
            vx2.m53591g(str, "mint");
            C1521c.C1522a aVar = new C1521c.C1522a(SolanaNftWorker.class);
            C1519b.C1520a aVar2 = new C1519b.C1520a();
            aVar2.mo10937h("MINT_ARRAY", str);
            aVar.mo10949g(aVar2.mo10930a());
            C1523d b = aVar.mo10946b();
            vx2.m53590f(b, "OneTimeWorkRequestBuilde…())\n            }.build()");
            return (C1521c) b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/worker/nfts/solana/SolanaNftWorker$b", "Lcom/google/gson/reflect/TypeToken;", "", "Lnet/safemoon/androidwallet/model/rpc2/solana/collections/SolanaNfts;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$b */
    /* compiled from: SolanaNftWorker.kt */
    public static final class C8979b extends TypeToken<List<? extends SolanaNfts>> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SolanaNftWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        vx2.m53591g(context, "appContext");
        vx2.m53591g(workerParameters, "params");
        this.f43461A = C6169a.m47232a(new SolanaNftWorker$db$2(context));
        this.f43462B = C6169a.m47232a(new SolanaNftWorker$collectionDataSource$2(this));
        this.f43463C = C6169a.m47232a(new SolanaNftWorker$nftDataSource$2(this));
    }

    /* renamed from: A */
    public final NftDataSource mo62352A() {
        return (NftDataSource) this.f43463C.getValue();
    }

    /* renamed from: B */
    public final v56 mo62353B() {
        return (v56) this.f43464y.getValue();
    }

    /* renamed from: C */
    public final <T> T mo62354C(String str, String str2) {
        try {
            vx2.m53588d(str);
            T obj = new JSONObject(str).get(str2).toString();
            if (obj == null) {
                return null;
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v48, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker} */
    /* JADX WARNING: type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r14 = ((java.lang.Number) r0).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0292, code lost:
        if (r14 <= 0) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0294, code lost:
        r16 = net.safemoon.androidwallet.common.TokenType.SOLANA.getChainId();
        r18 = r11.getMint();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a1, code lost:
        if (r8 == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a3, code lost:
        r19 = r8.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02aa, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b4, code lost:
        if (r8 == null) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b6, code lost:
        r8 = r8.getMetaplex();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ba, code lost:
        if (r8 == null) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02bc, code lost:
        r24 = r8.getMetadataUri();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c3, code lost:
        r24 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c7, code lost:
        if (r4 == null) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c9, code lost:
        r26 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02cc, code lost:
        r26 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ce, code lost:
        r8 = r13;
        r34 = r14;
        r13 = new net.safemoon.androidwallet.model.collectible.RoomNFT((java.lang.Long) null, r16, r34, r18, r19, "", "", "", (java.lang.String) null, r24, (java.lang.String) null, r26, (java.lang.String) null, (java.lang.String) null, java.lang.System.currentTimeMillis(), 0, 46337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r0 = net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource.f42537c;
        r4 = java.lang.String.valueOf(r4);
        r1.L$0 = r12;
        r1.L$1 = r10;
        r1.L$2 = r9;
        r1.L$3 = r11;
        r1.L$4 = r8;
        r1.L$5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02fa, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r1.J$0 = r13;
        r1.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0305, code lost:
        if (r0.mo60789b(r8, r4, r1) != r3) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0307, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0308, code lost:
        r4 = r8;
        r36 = r11;
        r11 = r9;
        r8 = r13;
        r13 = r12;
        r12 = r10;
        r10 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0311, code lost:
        r36 = r11;
        r11 = r10;
        r10 = r13;
        r13 = r8;
        r8 = r36;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x031a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x031c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x031d, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031f, code lost:
        r4 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r12 = r0.getLocalizedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0327, code lost:
        if (r12 == 0) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032a, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x032b, code lost:
        p000.ol0.m70350b0(java.lang.String.valueOf(r0), "fetchAttributes()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0334, code lost:
        r0 = r10.mo62352A();
        r1.L$0 = r10;
        r1.L$1 = r9;
        r1.L$2 = r8;
        r1.L$3 = r11;
        r1.L$4 = r4;
        r1.L$5 = null;
        r1.J$0 = r13;
        r1.label = 5;
        r0 = r0.mo60808i(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x034d, code lost:
        if (r0 == r3) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x034f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0350, code lost:
        r12 = r9;
        r36 = r11;
        r11 = r8;
        r8 = r13;
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x035d, code lost:
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035f, code lost:
        r0 = r10.mo62352A();
        r1.L$0 = r10;
        r1.L$1 = r12;
        r1.L$2 = r11;
        r1.L$3 = null;
        r1.L$4 = null;
        r1.label = 6;
        r0 = r0.mo60810k(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0374, code lost:
        if (r0 == r3) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0376, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0377, code lost:
        r8 = r11;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r11 = ((java.lang.Number) r0).longValue();
        r4 = r10.mo10869a();
        p000.vx2.m53590f(r4, "applicationContext");
        new net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource(r4, r11).mo60785a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r0 = r10.mo62352A();
        r13 = r13.getMint();
        p000.vx2.m53588d(r13);
        r1.L$0 = r10;
        r1.L$1 = r12;
        r1.L$2 = r11;
        r1.L$3 = r4;
        r1.L$4 = null;
        r1.label = 7;
        r0 = r0.mo60807h(r13, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ac, code lost:
        if (r0 == r3) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03ae, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03af, code lost:
        r8 = r11;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r0 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c6, code lost:
        if ((r0.getUpdatedTime() + java.util.concurrent.TimeUnit.HOURS.toMillis(1)) < java.lang.System.currentTimeMillis()) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c8, code lost:
        r11 = r10.mo62352A();
        r1.L$0 = r10;
        r1.L$1 = r9;
        r1.L$2 = r8;
        r1.L$3 = r0;
        r1.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03dc, code lost:
        if (r11.mo60811l(r4, r1) == r3) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03de, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03df, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e0, code lost:
        r11 = r10.mo10869a();
        p000.vx2.m53590f(r11, "applicationContext");
        r4 = r4.getId();
        p000.vx2.m53588d(r4);
        new net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource(r11, r4.longValue()).mo60785a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03fb, code lost:
        r8 = r11;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03fe, code lost:
        r8 = r9;
        r4 = r10;
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0403, code lost:
        r8 = r9;
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0407, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0409, code lost:
        r10 = r0;
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0432, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0433, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x044f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016e, code lost:
        r9 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r10 = r0.mo62353B();
        r11 = r9.getMint();
        p000.vx2.m53588d(r11);
        r10 = r10.mo66421a(r11);
        r1.L$0 = r0;
        r1.L$1 = r4;
        r1.L$2 = r8;
        r1.L$3 = r9;
        r1.L$4 = null;
        r1.L$5 = null;
        r1.label = 1;
        r10 = retrofit2.KotlinExtensions.m71521c(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019c, code lost:
        if (r10 == r3) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019f, code lost:
        r36 = r10;
        r10 = r0;
        r0 = r36;
        r37 = r9;
        r9 = r4;
        r4 = r8;
        r8 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r0 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft) ((p000.bg5) r0).mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b2, code lost:
        if (r0 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b4, code lost:
        r11 = r0.getMetaplex();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b8, code lost:
        if (r11 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ba, code lost:
        r11 = r11.getMetadataUri();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01be, code lost:
        if (r11 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c0, code lost:
        r11 = p000.C9384u3.m72570k().mo52740c(r11);
        r1.L$0 = r10;
        r1.L$1 = r9;
        r1.L$2 = r4;
        r1.L$3 = r8;
        r1.L$4 = r0;
        r1.label = 2;
        r11 = retrofit2.KotlinExtensions.m71521c(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d9, code lost:
        if (r11 != r3) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01db, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01dc, code lost:
        r36 = r4;
        r4 = r0;
        r0 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r36 = r4;
        r4 = (java.lang.String) ((p000.bg5) r0).mo50578a();
        r0 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r11 = r10;
        r10 = r9;
        r9 = r4;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f6, code lost:
        r16 = net.safemoon.androidwallet.common.TokenType.SOLANA.getChainId();
        r17 = r8.getMint();
        p000.vx2.m53588d(r17);
        r12 = (java.lang.String) r11.mo62354C((java.lang.String) r11.mo62354C(r4, "collection"), org.web3j.ens.contracts.generated.PublicResolver.FUNC_NAME);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0213, code lost:
        if (r12 != null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0215, code lost:
        if (r0 == null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0217, code lost:
        r12 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021c, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021f, code lost:
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0221, code lost:
        if (r0 == null) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0223, code lost:
        r12 = r0.getStandard();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0227, code lost:
        if (r12 != null) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0229, code lost:
        r12 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022b, code lost:
        r18 = r12;
        r20 = (java.lang.String) r11.mo62354C(r4, "description");
        r21 = (java.lang.String) r11.mo62354C(r4, "image");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0241, code lost:
        if (r0 == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0243, code lost:
        r22 = r0.getSymbol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024a, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024c, code lost:
        r14 = new net.safemoon.androidwallet.model.collectible.RoomCollection((java.lang.Long) null, r16, r17, r18, r19, r20, r21, r22, "MORALIS_SOLANA", (java.lang.String) null, java.lang.System.currentTimeMillis(), 0, 0, r8.toString(), 6145, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r13 = r11.mo62355y();
        r1.L$0 = r11;
        r1.L$1 = r10;
        r1.L$2 = r9;
        r1.L$3 = r8;
        r1.L$4 = r0;
        r1.L$5 = r4;
        r1.label = 3;
        r12 = r13.mo60797f(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x027e, code lost:
        if (r12 != r3) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0280, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0281, code lost:
        r36 = r8;
        r8 = r0;
        r0 = r12;
        r12 = r11;
        r11 = r36;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036 A[SYNTHETIC, Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x040f A[SYNTHETIC, Splitter:B:173:0x040f] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0432 A[Catch:{ Exception -> 0x045a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0433 A[Catch:{ Exception -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x044f A[Catch:{ Exception -> 0x045a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016e A[Catch:{ Exception -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo10853r(p000.ns0<? super androidx.work.ListenableWorker.C1509a> r39) {
        /*
            r38 = this;
            r0 = r39
            boolean r1 = r0 instanceof net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$doWork$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$doWork$1 r1 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$doWork$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r38
            goto L_0x001e
        L_0x0017:
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$doWork$1 r1 = new net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$doWork$1
            r2 = r38
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r1.label
            java.lang.String r5 = "applicationContext"
            java.lang.String r6 = "mintAddress"
            r7 = 0
            switch(r4) {
                case 0: goto L_0x0131;
                case 1: goto L_0x0117;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00ab;
                case 5: goto L_0x0086;
                case 6: goto L_0x0072;
                case 7: goto L_0x005d;
                case 8: goto L_0x0048;
                case 9: goto L_0x003b;
                case 10: goto L_0x0036;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x045a }
            goto L_0x0450
        L_0x003b:
            java.lang.Object r4 = r1.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r5 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r5
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x045a }
            goto L_0x0434
        L_0x0048:
            java.lang.Object r4 = r1.L$3
            net.safemoon.androidwallet.model.collectible.RoomNFT r4 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r4
            java.lang.Object r8 = r1.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r1.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r10 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r10
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x040b }
            goto L_0x03e0
        L_0x005d:
            java.lang.Object r4 = r1.L$3
            net.safemoon.androidwallet.model.collectible.RoomNFT r4 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r4
            java.lang.Object r8 = r1.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r1.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r10 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r10
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x040b }
            goto L_0x03b1
        L_0x0072:
            java.lang.Object r4 = r1.L$2
            r8 = r4
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r4 = r1.L$1
            r9 = r4
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r4 = r1.L$0
            r10 = r4
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r10 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r10
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x040b }
            goto L_0x0379
        L_0x0086:
            long r8 = r1.J$0
            java.lang.Object r4 = r1.L$4
            net.safemoon.androidwallet.model.collectible.RoomNFT r4 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r4
            java.lang.Object r10 = r1.L$3
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r10 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r10
            java.lang.Object r11 = r1.L$2
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.L$1
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r13 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r13
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00a6 }
            r36 = r13
            r13 = r10
            r10 = r36
            goto L_0x0357
        L_0x00a6:
            r8 = r11
            r9 = r12
            r10 = r13
            goto L_0x040b
        L_0x00ab:
            long r8 = r1.J$0
            java.lang.Object r4 = r1.L$4
            net.safemoon.androidwallet.model.collectible.RoomNFT r4 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r4
            java.lang.Object r10 = r1.L$3
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r10 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r10
            java.lang.Object r11 = r1.L$2
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.L$1
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r13 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r13
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x0311
        L_0x00c6:
            r0 = move-exception
            r36 = r11
            r11 = r10
            r10 = r13
            r13 = r8
            r8 = r36
            r9 = r12
            goto L_0x0323
        L_0x00d1:
            java.lang.Object r4 = r1.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r1.L$4
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft r8 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft) r8
            java.lang.Object r9 = r1.L$3
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r9 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r9
            java.lang.Object r10 = r1.L$2
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r1.L$1
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r12 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r12
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00f4 }
            r36 = r11
            r11 = r9
            r9 = r10
            r10 = r36
            goto L_0x0288
        L_0x00f4:
            r8 = r10
            r9 = r11
        L_0x00f6:
            r10 = r12
            goto L_0x040b
        L_0x00f9:
            java.lang.Object r4 = r1.L$4
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft r4 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft) r4
            java.lang.Object r8 = r1.L$3
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r8 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r8
            java.lang.Object r9 = r1.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r1.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r11 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r11
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0112 }
            goto L_0x01e4
        L_0x0112:
            r8 = r9
            r9 = r10
            r10 = r11
            goto L_0x040b
        L_0x0117:
            java.lang.Object r4 = r1.L$3
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r4 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r4
            java.lang.Object r8 = r1.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r1.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r1.L$0
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker r10 = (net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker) r10
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x040b }
            r36 = r8
            r8 = r4
            r4 = r36
            goto L_0x01aa
        L_0x0131:
            p000.hg5.m45199b(r0)
            androidx.work.b r0 = r38.mo10872g()
            java.lang.String r4 = "MINT_ARRAY"
            java.lang.String r0 = r0.mo10927l(r4)
            if (r0 != 0) goto L_0x014a
            androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.C1509a.m10432a()
            java.lang.String r1 = "failure()"
            p000.vx2.m53590f(r0, r1)
            return r0
        L_0x014a:
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$b r4 = new net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$b
            r4.<init>()
            java.lang.reflect.Type r4 = r4.getType()
            com.google.gson.Gson r8 = new com.google.gson.Gson
            r8.<init>()
            java.lang.Object r0 = r8.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r4)
            java.util.List r0 = (java.util.List) r0
            p000.vx2.m53590f(r0, r6)     // Catch:{ Exception -> 0x045a }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x045a }
            r8 = r4
            r4 = r0
            r0 = r2
        L_0x0168:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x045a }
            if (r9 == 0) goto L_0x040f
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x045a }
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r9 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r9     // Catch:{ Exception -> 0x045a }
            java.lang.String r10 = r9.getMint()     // Catch:{ Exception -> 0x045a }
            if (r10 == 0) goto L_0x0168
            v56 r10 = r0.mo62353B()     // Catch:{ Exception -> 0x0409 }
            java.lang.String r11 = r9.getMint()     // Catch:{ Exception -> 0x0409 }
            p000.vx2.m53588d(r11)     // Catch:{ Exception -> 0x0409 }
            k90 r10 = r10.mo66421a(r11)     // Catch:{ Exception -> 0x0409 }
            r1.L$0 = r0     // Catch:{ Exception -> 0x0409 }
            r1.L$1 = r4     // Catch:{ Exception -> 0x0409 }
            r1.L$2 = r8     // Catch:{ Exception -> 0x0409 }
            r1.L$3 = r9     // Catch:{ Exception -> 0x0409 }
            r1.L$4 = r7     // Catch:{ Exception -> 0x0409 }
            r1.L$5 = r7     // Catch:{ Exception -> 0x0409 }
            r11 = 1
            r1.label = r11     // Catch:{ Exception -> 0x0409 }
            java.lang.Object r10 = retrofit2.KotlinExtensions.m71521c(r10, r1)     // Catch:{ Exception -> 0x0409 }
            if (r10 != r3) goto L_0x019f
            return r3
        L_0x019f:
            r36 = r10
            r10 = r0
            r0 = r36
            r37 = r9
            r9 = r4
            r4 = r8
            r8 = r37
        L_0x01aa:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0407 }
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x0407 }
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft r0 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNft) r0     // Catch:{ Exception -> 0x0407 }
            if (r0 == 0) goto L_0x01f2
            net.safemoon.androidwallet.model.rpc2.solana.collections.Metaplex r11 = r0.getMetaplex()     // Catch:{ Exception -> 0x0407 }
            if (r11 == 0) goto L_0x01f2
            java.lang.String r11 = r11.getMetadataUri()     // Catch:{ Exception -> 0x0407 }
            if (r11 == 0) goto L_0x01f2
            jl1 r12 = p000.C9384u3.m72570k()     // Catch:{ Exception -> 0x0407 }
            k90 r11 = r12.mo52740c(r11)     // Catch:{ Exception -> 0x0407 }
            r1.L$0 = r10     // Catch:{ Exception -> 0x0407 }
            r1.L$1 = r9     // Catch:{ Exception -> 0x0407 }
            r1.L$2 = r4     // Catch:{ Exception -> 0x0407 }
            r1.L$3 = r8     // Catch:{ Exception -> 0x0407 }
            r1.L$4 = r0     // Catch:{ Exception -> 0x0407 }
            r12 = 2
            r1.label = r12     // Catch:{ Exception -> 0x0407 }
            java.lang.Object r11 = retrofit2.KotlinExtensions.m71521c(r11, r1)     // Catch:{ Exception -> 0x0407 }
            if (r11 != r3) goto L_0x01dc
            return r3
        L_0x01dc:
            r36 = r4
            r4 = r0
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r36
        L_0x01e4:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0112 }
            r36 = r4
            r4 = r0
            r0 = r36
            goto L_0x01f6
        L_0x01f2:
            r11 = r10
            r10 = r9
            r9 = r4
            r4 = r7
        L_0x01f6:
            java.lang.String r12 = "collection"
            java.lang.Object r12 = r11.mo62354C(r4, r12)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0112 }
            net.safemoon.androidwallet.common.TokenType r13 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ Exception -> 0x0112 }
            int r16 = r13.getChainId()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r17 = r8.getMint()     // Catch:{ Exception -> 0x0112 }
            p000.vx2.m53588d(r17)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r13 = "name"
            java.lang.Object r12 = r11.mo62354C(r12, r13)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0112 }
            if (r12 != 0) goto L_0x021f
            if (r0 == 0) goto L_0x021c
            java.lang.String r12 = r0.getName()     // Catch:{ Exception -> 0x0112 }
            goto L_0x021f
        L_0x021c:
            r19 = r7
            goto L_0x0221
        L_0x021f:
            r19 = r12
        L_0x0221:
            if (r0 == 0) goto L_0x0229
            java.lang.String r12 = r0.getStandard()     // Catch:{ Exception -> 0x0112 }
            if (r12 != 0) goto L_0x022b
        L_0x0229:
            java.lang.String r12 = "unknown"
        L_0x022b:
            r18 = r12
            java.lang.String r12 = "description"
            java.lang.Object r12 = r11.mo62354C(r4, r12)     // Catch:{ Exception -> 0x0112 }
            r20 = r12
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x0112 }
            java.lang.String r12 = "image"
            java.lang.Object r12 = r11.mo62354C(r4, r12)     // Catch:{ Exception -> 0x0112 }
            r21 = r12
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x024a
            java.lang.String r12 = r0.getSymbol()     // Catch:{ Exception -> 0x0112 }
            r22 = r12
            goto L_0x024c
        L_0x024a:
            r22 = r7
        L_0x024c:
            long r25 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r29 = r8.toString()     // Catch:{ Exception -> 0x0112 }
            net.safemoon.androidwallet.model.collectible.RoomCollection r12 = new net.safemoon.androidwallet.model.collectible.RoomCollection     // Catch:{ Exception -> 0x0112 }
            r15 = 0
            java.lang.String r23 = "MORALIS_SOLANA"
            r24 = 0
            r27 = 0
            r28 = 0
            r30 = 6145(0x1801, float:8.611E-42)
            r31 = 0
            r14 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0112 }
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r13 = r11.mo62355y()     // Catch:{ Exception -> 0x0112 }
            r1.L$0 = r11     // Catch:{ Exception -> 0x0112 }
            r1.L$1 = r10     // Catch:{ Exception -> 0x0112 }
            r1.L$2 = r9     // Catch:{ Exception -> 0x0112 }
            r1.L$3 = r8     // Catch:{ Exception -> 0x0112 }
            r1.L$4 = r0     // Catch:{ Exception -> 0x0112 }
            r1.L$5 = r4     // Catch:{ Exception -> 0x0112 }
            r14 = 3
            r1.label = r14     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r12 = r13.mo60797f(r12, r1)     // Catch:{ Exception -> 0x0112 }
            if (r12 != r3) goto L_0x0281
            return r3
        L_0x0281:
            r36 = r8
            r8 = r0
            r0 = r12
            r12 = r11
            r11 = r36
        L_0x0288:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x0403 }
            long r14 = r0.longValue()     // Catch:{ Exception -> 0x0403 }
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x03fe
            net.safemoon.androidwallet.model.collectible.RoomNFT r13 = new net.safemoon.androidwallet.model.collectible.RoomNFT     // Catch:{ Exception -> 0x0403 }
            r0 = 0
            net.safemoon.androidwallet.common.TokenType r16 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ Exception -> 0x0403 }
            int r16 = r16.getChainId()     // Catch:{ Exception -> 0x0403 }
            java.lang.String r18 = r11.getMint()     // Catch:{ Exception -> 0x0403 }
            if (r8 == 0) goto L_0x02aa
            java.lang.String r17 = r8.getName()     // Catch:{ Exception -> 0x0403 }
            r19 = r17
            goto L_0x02ac
        L_0x02aa:
            r19 = r7
        L_0x02ac:
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            java.lang.String r22 = ""
            r23 = 0
            if (r8 == 0) goto L_0x02c3
            net.safemoon.androidwallet.model.rpc2.solana.collections.Metaplex r8 = r8.getMetaplex()     // Catch:{ Exception -> 0x0403 }
            if (r8 == 0) goto L_0x02c3
            java.lang.String r8 = r8.getMetadataUri()     // Catch:{ Exception -> 0x0403 }
            r24 = r8
            goto L_0x02c5
        L_0x02c3:
            r24 = r7
        L_0x02c5:
            r25 = 0
            if (r4 == 0) goto L_0x02cc
            r26 = r4
            goto L_0x02ce
        L_0x02cc:
            r26 = r7
        L_0x02ce:
            r27 = 0
            r28 = 0
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0403 }
            r31 = 0
            r32 = 46337(0xb501, float:6.4932E-41)
            r33 = 0
            r8 = r13
            r34 = r14
            r14 = r0
            r15 = r16
            r16 = r34
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33)     // Catch:{ Exception -> 0x0403 }
            net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion r0 = net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource.f42537c     // Catch:{ Exception -> 0x031c }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x031c }
            r1.L$0 = r12     // Catch:{ Exception -> 0x031c }
            r1.L$1 = r10     // Catch:{ Exception -> 0x031c }
            r1.L$2 = r9     // Catch:{ Exception -> 0x031c }
            r1.L$3 = r11     // Catch:{ Exception -> 0x031c }
            r1.L$4 = r8     // Catch:{ Exception -> 0x031c }
            r1.L$5 = r7     // Catch:{ Exception -> 0x031c }
            r13 = r34
            r1.J$0 = r13     // Catch:{ Exception -> 0x031a }
            r15 = 4
            r1.label = r15     // Catch:{ Exception -> 0x031a }
            java.lang.Object r0 = r0.mo60789b(r8, r4, r1)     // Catch:{ Exception -> 0x031a }
            if (r0 != r3) goto L_0x0308
            return r3
        L_0x0308:
            r4 = r8
            r36 = r11
            r11 = r9
            r8 = r13
            r13 = r12
            r12 = r10
            r10 = r36
        L_0x0311:
            r36 = r11
            r11 = r10
            r10 = r13
            r13 = r8
            r8 = r36
            r9 = r12
            goto L_0x0334
        L_0x031a:
            r0 = move-exception
            goto L_0x031f
        L_0x031c:
            r0 = move-exception
            r13 = r34
        L_0x031f:
            r4 = r8
            r8 = r9
            r9 = r10
            r10 = r12
        L_0x0323:
            java.lang.String r12 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x040b }
            if (r12 != 0) goto L_0x032a
            goto L_0x032b
        L_0x032a:
            r0 = r12
        L_0x032b:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x040b }
            java.lang.String r12 = "fetchAttributes()"
            p000.ol0.m70350b0(r0, r12)     // Catch:{ Exception -> 0x040b }
        L_0x0334:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r0 = r10.mo62352A()     // Catch:{ Exception -> 0x040b }
            r1.L$0 = r10     // Catch:{ Exception -> 0x040b }
            r1.L$1 = r9     // Catch:{ Exception -> 0x040b }
            r1.L$2 = r8     // Catch:{ Exception -> 0x040b }
            r1.L$3 = r11     // Catch:{ Exception -> 0x040b }
            r1.L$4 = r4     // Catch:{ Exception -> 0x040b }
            r1.L$5 = r7     // Catch:{ Exception -> 0x040b }
            r1.J$0 = r13     // Catch:{ Exception -> 0x040b }
            r12 = 5
            r1.label = r12     // Catch:{ Exception -> 0x040b }
            java.lang.Object r0 = r0.mo60808i(r4, r1)     // Catch:{ Exception -> 0x040b }
            if (r0 != r3) goto L_0x0350
            return r3
        L_0x0350:
            r12 = r9
            r36 = r11
            r11 = r8
            r8 = r13
            r13 = r36
        L_0x0357:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x03fb }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x03fb }
            if (r0 != 0) goto L_0x0390
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r0 = r10.mo62352A()     // Catch:{ Exception -> 0x03fb }
            r1.L$0 = r10     // Catch:{ Exception -> 0x03fb }
            r1.L$1 = r12     // Catch:{ Exception -> 0x03fb }
            r1.L$2 = r11     // Catch:{ Exception -> 0x03fb }
            r1.L$3 = r7     // Catch:{ Exception -> 0x03fb }
            r1.L$4 = r7     // Catch:{ Exception -> 0x03fb }
            r8 = 6
            r1.label = r8     // Catch:{ Exception -> 0x03fb }
            java.lang.Object r0 = r0.mo60810k(r4, r1)     // Catch:{ Exception -> 0x03fb }
            if (r0 != r3) goto L_0x0377
            return r3
        L_0x0377:
            r8 = r11
            r9 = r12
        L_0x0379:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x040b }
            long r11 = r0.longValue()     // Catch:{ Exception -> 0x040b }
            net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource r0 = new net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource     // Catch:{ Exception -> 0x040b }
            android.content.Context r4 = r10.mo10869a()     // Catch:{ Exception -> 0x040b }
            p000.vx2.m53590f(r4, r5)     // Catch:{ Exception -> 0x040b }
            r0.<init>(r4, r11)     // Catch:{ Exception -> 0x040b }
            r0.mo60785a()     // Catch:{ Exception -> 0x040b }
            goto L_0x040b
        L_0x0390:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r0 = r10.mo62352A()     // Catch:{ Exception -> 0x03fb }
            java.lang.String r13 = r13.getMint()     // Catch:{ Exception -> 0x03fb }
            p000.vx2.m53588d(r13)     // Catch:{ Exception -> 0x03fb }
            r1.L$0 = r10     // Catch:{ Exception -> 0x03fb }
            r1.L$1 = r12     // Catch:{ Exception -> 0x03fb }
            r1.L$2 = r11     // Catch:{ Exception -> 0x03fb }
            r1.L$3 = r4     // Catch:{ Exception -> 0x03fb }
            r1.L$4 = r7     // Catch:{ Exception -> 0x03fb }
            r14 = 7
            r1.label = r14     // Catch:{ Exception -> 0x03fb }
            java.lang.Object r0 = r0.mo60807h(r13, r8, r1)     // Catch:{ Exception -> 0x03fb }
            if (r0 != r3) goto L_0x03af
            return r3
        L_0x03af:
            r8 = r11
            r9 = r12
        L_0x03b1:
            net.safemoon.androidwallet.model.collectible.RoomNFT r0 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r0     // Catch:{ Exception -> 0x040b }
            long r11 = r0.getUpdatedTime()     // Catch:{ Exception -> 0x040b }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ Exception -> 0x040b }
            r14 = 1
            long r13 = r13.toMillis(r14)     // Catch:{ Exception -> 0x040b }
            long r11 = r11 + r13
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x040b }
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x040b
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r11 = r10.mo62352A()     // Catch:{ Exception -> 0x040b }
            r1.L$0 = r10     // Catch:{ Exception -> 0x040b }
            r1.L$1 = r9     // Catch:{ Exception -> 0x040b }
            r1.L$2 = r8     // Catch:{ Exception -> 0x040b }
            r1.L$3 = r0     // Catch:{ Exception -> 0x040b }
            r12 = 8
            r1.label = r12     // Catch:{ Exception -> 0x040b }
            java.lang.Object r4 = r11.mo60811l(r4, r1)     // Catch:{ Exception -> 0x040b }
            if (r4 != r3) goto L_0x03df
            return r3
        L_0x03df:
            r4 = r0
        L_0x03e0:
            net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource r0 = new net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource     // Catch:{ Exception -> 0x040b }
            android.content.Context r11 = r10.mo10869a()     // Catch:{ Exception -> 0x040b }
            p000.vx2.m53590f(r11, r5)     // Catch:{ Exception -> 0x040b }
            java.lang.Long r4 = r4.getId()     // Catch:{ Exception -> 0x040b }
            p000.vx2.m53588d(r4)     // Catch:{ Exception -> 0x040b }
            long r12 = r4.longValue()     // Catch:{ Exception -> 0x040b }
            r0.<init>(r11, r12)     // Catch:{ Exception -> 0x040b }
            r0.mo60785a()     // Catch:{ Exception -> 0x040b }
            goto L_0x040b
        L_0x03fb:
            r8 = r11
            r9 = r12
            goto L_0x040b
        L_0x03fe:
            r8 = r9
            r4 = r10
            r0 = r12
            goto L_0x0168
        L_0x0403:
            r8 = r9
            r9 = r10
            goto L_0x00f6
        L_0x0407:
            r8 = r4
            goto L_0x040b
        L_0x0409:
            r10 = r0
            r9 = r4
        L_0x040b:
            r4 = r9
            r0 = r10
            goto L_0x0168
        L_0x040f:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r5 = r0.mo62355y()     // Catch:{ Exception -> 0x045a }
            p000.vx2.m53590f(r4, r6)     // Catch:{ Exception -> 0x045a }
            net.safemoon.androidwallet.common.TokenType r8 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ Exception -> 0x045a }
            int r8 = r8.getChainId()     // Catch:{ Exception -> 0x045a }
            r1.L$0 = r0     // Catch:{ Exception -> 0x045a }
            r1.L$1 = r4     // Catch:{ Exception -> 0x045a }
            r1.L$2 = r7     // Catch:{ Exception -> 0x045a }
            r1.L$3 = r7     // Catch:{ Exception -> 0x045a }
            r1.L$4 = r7     // Catch:{ Exception -> 0x045a }
            r1.L$5 = r7     // Catch:{ Exception -> 0x045a }
            r9 = 9
            r1.label = r9     // Catch:{ Exception -> 0x045a }
            java.lang.Object r5 = r5.mo60792a(r4, r8, r1)     // Catch:{ Exception -> 0x045a }
            if (r5 != r3) goto L_0x0433
            return r3
        L_0x0433:
            r5 = r0
        L_0x0434:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r0 = r5.mo62352A()     // Catch:{ Exception -> 0x045a }
            p000.vx2.m53590f(r4, r6)     // Catch:{ Exception -> 0x045a }
            net.safemoon.androidwallet.common.TokenType r5 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ Exception -> 0x045a }
            int r5 = r5.getChainId()     // Catch:{ Exception -> 0x045a }
            r1.L$0 = r7     // Catch:{ Exception -> 0x045a }
            r1.L$1 = r7     // Catch:{ Exception -> 0x045a }
            r6 = 10
            r1.label = r6     // Catch:{ Exception -> 0x045a }
            java.lang.Object r0 = r0.mo60800a(r4, r5, r1)     // Catch:{ Exception -> 0x045a }
            if (r0 != r3) goto L_0x0450
            return r3
        L_0x0450:
            androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.C1509a.m10434c()     // Catch:{ Exception -> 0x045a }
            java.lang.String r1 = "{\n            mintAddres…esult.success()\n        }"
            p000.vx2.m53590f(r0, r1)     // Catch:{ Exception -> 0x045a }
            goto L_0x0463
        L_0x045a:
            androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.C1509a.m10432a()
            java.lang.String r1 = "{\n            Result.failure()\n        }"
            p000.vx2.m53590f(r0, r1)
        L_0x0463:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker.mo10853r(ns0):java.lang.Object");
    }

    /* renamed from: y */
    public final CollectionDataSource mo62355y() {
        return (CollectionDataSource) this.f43462B.getValue();
    }

    /* renamed from: z */
    public final ApplicationRoomDatabase mo62356z() {
        return (ApplicationRoomDatabase) this.f43461A.getValue();
    }
}
