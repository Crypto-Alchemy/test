package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.model.common.LanguageItem;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTConfigurationsActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onResume", "onPostCreate", "onBackPressed", "Ln9;", "r", "Lef3;", "U", "()Ln9;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "s", "V", "()Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "selectFiatViewModel", "<init>", "()V", "x", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTConfigurationsActivity.kt */
public final class AKTConfigurationsActivity extends BasicActivity {

    /* renamed from: x */
    public static final C8127a f41249x = new C8127a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public final ef3 f41250r = C6169a.m47232a(new AKTConfigurationsActivity$binding$2(this));

    /* renamed from: s */
    public final ef3 f41251s = new dd7(ua5.m52727b(SelectFiatViewModel.class), new AKTConfigurationsActivity$special$$inlined$viewModels$default$2(this), new AKTConfigurationsActivity$selectFiatViewModel$2(this), new AKTConfigurationsActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTConfigurationsActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "b", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTConfigurationsActivity$a */
    /* compiled from: AKTConfigurationsActivity.kt */
    public static final class C8127a {
        public C8127a() {
        }

        public /* synthetic */ C8127a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56590a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, AKTConfigurationsActivity.class));
        }

        /* renamed from: b */
        public final void mo56591b(Context context) {
            vx2.m53591g(context, "context");
            Intent intent = new Intent(context, AKTConfigurationsActivity.class);
            intent.setFlags(268468224);
            context.startActivity(intent);
        }
    }

    /* renamed from: W */
    public static final void m64795W(AKTConfigurationsActivity aKTConfigurationsActivity, View view) {
        vx2.m53591g(aKTConfigurationsActivity, "this$0");
        AKTActivity.f41227s.mo56538a(aKTConfigurationsActivity);
    }

    /* renamed from: X */
    public static final void m64796X(AKTConfigurationsActivity aKTConfigurationsActivity, View view) {
        vx2.m53591g(aKTConfigurationsActivity, "this$0");
        AKTSelectLanguageActivity.f41371y.mo56793a(aKTConfigurationsActivity);
    }

    /* renamed from: Y */
    public static final void m64797Y(AKTConfigurationsActivity aKTConfigurationsActivity, View view) {
        vx2.m53591g(aKTConfigurationsActivity, "this$0");
        AKTSelectCurrencyActivity.f41363B.mo56783a(aKTConfigurationsActivity);
    }

    /* renamed from: U */
    public final C6276n9 mo56588U() {
        return (C6276n9) this.f41250r.getValue();
    }

    /* renamed from: V */
    public final SelectFiatViewModel mo56589V() {
        return (SelectFiatViewModel) this.f41251s.getValue();
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56588U().mo46043b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        Fiat.Companion companion = Fiat.Companion;
        String j = f06.m57519j(this, "DEFAULT_FIAT", companion.getDEFAULT_CURRENCY_STRING());
        vx2.m53590f(j, "getString(\n            t…CURRENCY_STRING\n        )");
        SelectFiatViewModel.m68799o(mo56589V(), companion.mo58938to(j), false, (pc2) null, 6, (Object) null);
    }

    public void onPostCreate(Bundle bundle) {
        T t;
        super.onPostCreate(bundle);
        C6276n9 U = mo56588U();
        U.f32002b.setOnClickListener(new C9226r(this));
        U.f32006f.setOnClickListener(new C9293s(this));
        U.f32005e.setOnClickListener(new C9317t(this));
        String a = g06.f37938a.mo51832a(this);
        Iterator<T> it = ee3.f37527a.mo51453b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (vx2.m53586b(((LanguageItem) t).getLanguageCode(), a)) {
                break;
            }
        }
        LanguageItem languageItem = (LanguageItem) t;
        if (languageItem == null) {
            languageItem = new LanguageItem("en", R.string.language_english, R.string.language_english_location);
        }
        U.f32009i.setText(languageItem.getTitleResId());
    }

    public void onResume() {
        super.onResume();
        Fiat.Companion companion = Fiat.Companion;
        String j = f06.m57519j(this, "DEFAULT_FIAT", companion.getDEFAULT_CURRENCY_STRING());
        vx2.m53590f(j, "getString(\n             …ENCY_STRING\n            )");
        Fiat fiat = companion.mo58938to(j);
        AppCompatTextView appCompatTextView = mo56588U().f32008h;
        String symbol = fiat.getSymbol();
        String name = fiat.getName();
        appCompatTextView.setText(symbol + " - " + name);
    }
}
