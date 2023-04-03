package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bJ)\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Lzi7;", "", "Landroid/content/Context;", "context", "", "key", "value", "Lr37;", "e", "", "b", "", "defaultValue", "a", "d", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V", "name", "f", "Landroid/content/SharedPreferences;", "c", "Ljava/lang/String;", "getSHARED_PREFS_FILE_NAME", "()Ljava/lang/String;", "setSHARED_PREFS_FILE_NAME", "(Ljava/lang/String;)V", "SHARED_PREFS_FILE_NAME", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zi7 */
/* compiled from: WalletPrefs.kt */
public final class zi7 {

    /* renamed from: a */
    public static final zi7 f46397a = new zi7();

    /* renamed from: b */
    public static String f46398b = "safemoon";

    /* renamed from: a */
    public final boolean mo67313a(Context context, String str, boolean z) {
        vx2.m53591g(context, "context");
        return mo67315c(context).getBoolean(str, z);
    }

    /* renamed from: b */
    public final Set<String> mo67314b(Context context, String str) {
        Set<String> N0;
        vx2.m53591g(context, "context");
        vx2.m53591g(str, "key");
        Set<String> stringSet = mo67315c(context).getStringSet(str, ny5.m49095e());
        if (stringSet == null || (N0 = CollectionsKt___CollectionsKt.m47314N0(stringSet)) == null) {
            return new LinkedHashSet();
        }
        return N0;
    }

    /* renamed from: c */
    public final SharedPreferences mo67315c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f46398b, 0);
        vx2.m53590f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* renamed from: d */
    public final void mo67316d(Context context, String str, Boolean bool) {
        vx2.m53591g(context, "context");
        SharedPreferences.Editor edit = mo67315c(context).edit();
        vx2.m53588d(bool);
        edit.putBoolean(str, bool.booleanValue()).apply();
    }

    /* renamed from: e */
    public final void mo67317e(Context context, String str, String str2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(str, "key");
        vx2.m53591g(str2, "value");
        Set<String> b = mo67314b(context, str);
        b.add(str2);
        mo67315c(context).edit().putStringSet(str, b).apply();
    }

    /* renamed from: f */
    public final void mo67318f(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        f46398b = str;
    }
}
