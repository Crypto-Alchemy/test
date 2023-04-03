package p000;

import android.content.Context;
import android.content.res.Resources;
import com.yariksoffice.lingver.Lingver;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.LanguageItem;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003¨\u0006\r"}, mo44877d2 = {"Lee3;", "", "", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "b", "a", "Landroid/content/Context;", "context", "item", "Lr37;", "c", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ee3 */
/* compiled from: Languages.kt */
public final class ee3 {

    /* renamed from: a */
    public static final ee3 f37527a = new ee3();

    /* renamed from: a */
    public final LanguageItem mo51452a() {
        String str;
        boolean z;
        Locale c = qo0.m25803a(Resources.getSystem().getConfiguration()).mo26464c(0);
        T t = null;
        if (c != null) {
            str = c.getLanguage();
        } else {
            str = null;
        }
        if (str == null) {
            str = "en";
        }
        List<LanguageItem> b = mo51453b();
        LanguageItem languageItem = new LanguageItem("en", R.string.language_english, R.string.language_english_location);
        Iterator<T> it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            LanguageItem languageItem2 = (LanguageItem) next;
            if (vx2.m53586b(languageItem2.getLanguageCode(), str) || StringsKt__StringsKt.m63081R(languageItem2.getLanguageCode(), str, false, 2, (Object) null)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        LanguageItem languageItem3 = (LanguageItem) t;
        if (languageItem3 != null) {
            return languageItem3;
        }
        return languageItem;
    }

    /* renamed from: b */
    public final List<LanguageItem> mo51453b() {
        return ck0.m33068p(new LanguageItem("zh", R.string.language_chinese_simple, R.string.language_chinese_simple_location), new LanguageItem("zh-rHK", R.string.language_chinese_hk, R.string.language_chinese_hk_location), new LanguageItem("nl", R.string.language_dutch, R.string.language_dutch_location), new LanguageItem("en", R.string.language_english, R.string.language_english_location), new LanguageItem("fr", R.string.language_french, R.string.language_french_location), new LanguageItem("de", R.string.language_german, R.string.language_german_location), new LanguageItem("hi", R.string.language_hindi, R.string.language_hindi_location), new LanguageItem("in", R.string.language_indonesian, R.string.language_indonesian_location), new LanguageItem("it", R.string.language_italian, R.string.language_italian_location), new LanguageItem("fa", R.string.language_persian, R.string.language_persian_location), new LanguageItem("pl", R.string.language_polish, R.string.language_polish_location), new LanguageItem("pt-rBR", R.string.language_portuguese_brazil, R.string.language_portuguese_brazil_location), new LanguageItem("pt-rPT", R.string.language_portuguese_portugal, R.string.language_portuguese_portugal_location), new LanguageItem("es", R.string.language_spanish, R.string.language_spanish_location), new LanguageItem("es-rMX", R.string.language_spanish_mexico, R.string.language_spanish_mexico_location), new LanguageItem("tr", R.string.language_turkish, R.string.language_turkish_location), new LanguageItem("vi", R.string.language_vietnamese, R.string.language_vietnamese_location));
    }

    /* renamed from: c */
    public final void mo51454c(Context context, LanguageItem languageItem) {
        vx2.m53591g(context, "context");
        vx2.m53591g(languageItem, "item");
        g06.f37938a.mo51836e(context, languageItem.getLanguageCode());
        if (StringsKt__StringsKt.m63081R(languageItem.getLanguageCode(), "-r", false, 2, (Object) null)) {
            List B0 = StringsKt__StringsKt.m63061B0(languageItem.getLanguageCode(), new String[]{"-r"}, false, 0, 6, (Object) null);
            Lingver b = Lingver.f27846f.mo41597b();
            Context applicationContext = context.getApplicationContext();
            vx2.m53590f(applicationContext, "context.applicationContext");
            Lingver.m43064m(b, applicationContext, (String) B0.get(0), (String) B0.get(1), (String) null, 8, (Object) null);
            return;
        }
        Lingver b2 = Lingver.f27846f.mo41597b();
        Context applicationContext2 = context.getApplicationContext();
        vx2.m53590f(applicationContext2, "context.applicationContext");
        Lingver.m43064m(b2, applicationContext2, languageItem.getLanguageCode(), (String) null, (String) null, 12, (Object) null);
    }
}
