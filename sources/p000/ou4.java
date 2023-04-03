package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\tB%\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0017"}, mo44877d2 = {"Lou4;", "Lyj3;", "Ljava/util/Locale;", "d", "locale", "Lr37;", "c", "", "value", "a", "b", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "prefs", "Ljava/util/Locale;", "defaultLocale", "Landroid/content/Context;", "context", "", "preferenceName", "<init>", "(Landroid/content/Context;Ljava/util/Locale;Ljava/lang/String;)V", "com.yariksoffice.lingver.library"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* renamed from: ou4 */
/* compiled from: PreferenceLocaleStore.kt */
public final class ou4 implements yj3 {

    /* renamed from: c */
    public static final C6328a f32447c = new C6328a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final SharedPreferences f32448a;

    /* renamed from: b */
    public final Locale f32449b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, mo44877d2 = {"Lou4$a;", "", "", "COUNTRY_JSON_KEY", "Ljava/lang/String;", "DEFAULT_PREFERENCE_NAME", "FOLLOW_SYSTEM_LOCALE_KEY", "LANGUAGE_JSON_KEY", "LANGUAGE_KEY", "VARIANT_JSON_KEY", "<init>", "()V", "com.yariksoffice.lingver.library"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: ou4$a */
    /* compiled from: PreferenceLocaleStore.kt */
    public static final class C6328a {
        public C6328a() {
        }

        public /* synthetic */ C6328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ou4(Context context, Locale locale, String str) {
        vx2.m53592h(context, "context");
        vx2.m53592h(locale, "defaultLocale");
        vx2.m53592h(str, "preferenceName");
        this.f32449b = locale;
        this.f32448a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public void mo46542a(boolean z) {
        this.f32448a.edit().putBoolean("follow_system_locale_key", z).apply();
    }

    /* renamed from: b */
    public boolean mo46543b() {
        return this.f32448a.getBoolean("follow_system_locale_key", false);
    }

    /* renamed from: c */
    public void mo46544c(Locale locale) {
        vx2.m53592h(locale, "locale");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("language", locale.getLanguage());
        jSONObject.put("country", locale.getCountry());
        jSONObject.put("variant", locale.getVariant());
        this.f32448a.edit().putString("language_key", jSONObject.toString()).apply();
    }

    /* renamed from: d */
    public Locale mo46545d() {
        boolean z;
        String string = this.f32448a.getString("language_key", (String) null);
        if (string == null || yb6.m74325B(string)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f32449b;
        }
        String string2 = this.f32448a.getString("language_key", (String) null);
        if (string2 == null) {
            vx2.m53601q();
        }
        JSONObject jSONObject = new JSONObject(string2);
        return new Locale(jSONObject.getString("language"), jSONObject.getString("country"), jSONObject.getString("variant"));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ou4(android.content.Context r1, java.util.Locale r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000d
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = "Locale.getDefault()"
            p000.vx2.m53587c(r2, r5)
        L_0x000d:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0013
            java.lang.String r3 = "lingver_preference"
        L_0x0013:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ou4.<init>(android.content.Context, java.util.Locale, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
