package p000;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.gson.GsonToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lrr;", "Lnn2;", "Lnet/safemoon/androidwallet/common/TokenType;", "type", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "a", "Lnet/safemoon/androidwallet/model/token/gson/GsonToken;", "c", "", "d", "b", "Landroid/content/Context;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rr */
/* compiled from: AssetsAllTokenDataSource.kt */
public final class C9275rr implements nn2 {

    /* renamed from: a */
    public final Context f44446a;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: rr$a */
    /* compiled from: AssetsAllTokenDataSource.kt */
    public /* synthetic */ class C9276a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44447a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
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
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON_TEST     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_C     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_FUJI_TEST     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                f44447a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C9275rr.C9276a.<clinit>():void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, mo44877d2 = {"rr$b", "Lcom/google/gson/reflect/TypeToken;", "", "Lnet/safemoon/androidwallet/model/token/gson/GsonToken;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rr$b */
    /* compiled from: AssetsAllTokenDataSource.kt */
    public static final class C9277b extends TypeToken<List<? extends GsonToken>> {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, mo44877d2 = {"rr$c", "Lcom/google/gson/reflect/TypeToken;", "", "Lnet/safemoon/androidwallet/model/token/gson/GsonToken;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rr$c */
    /* compiled from: AssetsAllTokenDataSource.kt */
    public static final class C9278c extends TypeToken<List<? extends GsonToken>> {
    }

    public C9275rr(Context context) {
        vx2.m53591g(context, "context");
        this.f44446a = context;
    }

    /* renamed from: a */
    public List<IToken> mo62766a(TokenType tokenType) {
        vx2.m53591g(tokenType, "type");
        Object fromJson = new Gson().fromJson(mo65691d(tokenType), new C9277b().getType());
        vx2.m53590f(fromJson, "Gson().fromJson(readJson…st<GsonToken>>() {}.type)");
        return (List) fromJson;
    }

    /* renamed from: b */
    public final String mo65689b(TokenType tokenType) {
        String str;
        String str2;
        switch (C9276a.f44447a[tokenType.ordinal()]) {
            case 1:
            case 2:
                str = "bep_20";
                break;
            case 3:
            case 4:
                str = "erc_20";
                break;
            case 5:
            case 6:
                str = "matic_20";
                break;
            case 7:
            case 8:
                str = "avalanche_c";
                break;
            case 9:
                str = "solana";
                break;
            case 10:
                str = "multi_coin";
                break;
            default:
                str = "empty";
                break;
        }
        String str3 = str + "_tokens.json";
        Boolean bool = y40.f35761c;
        vx2.m53590f(bool, "IS_TEST_NET");
        if (bool.booleanValue()) {
            str2 = "test/";
        } else {
            str2 = "coin/";
        }
        return str2 + str3;
    }

    /* renamed from: c */
    public List<GsonToken> mo65690c(TokenType tokenType) {
        vx2.m53591g(tokenType, "type");
        Object fromJson = new Gson().fromJson(mo65691d(tokenType), new C9278c().getType());
        vx2.m53590f(fromJson, "Gson().fromJson(readJson…st<GsonToken>>() {}.type)");
        return (List) fromJson;
    }

    /* renamed from: d */
    public final String mo65691d(TokenType tokenType) {
        String str;
        try {
            AssetManager assets = this.f44446a.getAssets();
            if (tokenType.isPartOfMultiChainTokens()) {
                str = mo65689b(TokenType.MULTI_COIN);
            } else {
                str = mo65689b(tokenType);
            }
            InputStream open = assets.open(str);
            vx2.m53590f(open, "context.assets.open(if(t…tory(type)\n            })");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr, ae0.f36435b);
        } catch (IOException e) {
            throw e;
        }
    }
}
