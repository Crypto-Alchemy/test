package p000;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo44877d2 = {"Lrz1;", "", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rz1 */
/* compiled from: FiatData.kt */
public final class rz1 {

    /* renamed from: a */
    public static final C9291a f44501a = new C9291a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final Map<String, String> f44502b = C6177b.m47364l(new Pair("USD", "$"), new Pair("EUR", "€"), new Pair("JPY", "¥"), new Pair("GBP", "£"));

    /* renamed from: c */
    public static Fiat f44503c = Fiat.Companion.getDEFAULT_CURRENCY();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Lrz1$a;", "", "", "b", "symbol", "c", "", "symbolMap", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "DefaultFiat", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "a", "()Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "e", "(Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;)V", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rz1$a */
    /* compiled from: FiatData.kt */
    public static final class C9291a {
        public C9291a() {
        }

        public /* synthetic */ C9291a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fiat mo65771a() {
            return rz1.f44503c;
        }

        /* renamed from: b */
        public final String mo65772b() {
            String str = mo65774d().get(mo65771a().getSymbol());
            if (str == null) {
                return mo65771a().getSymbol();
            }
            return str;
        }

        /* renamed from: c */
        public final String mo65773c(String str) {
            vx2.m53591g(str, "symbol");
            String str2 = mo65774d().get(str);
            if (str2 == null) {
                return str;
            }
            return str2;
        }

        /* renamed from: d */
        public final Map<String, String> mo65774d() {
            return rz1.f44502b;
        }

        /* renamed from: e */
        public final void mo65775e(Fiat fiat) {
            vx2.m53591g(fiat, "<set-?>");
            rz1.f44503c = fiat;
        }
    }
}
