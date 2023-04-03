package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTSelectLanguageActivity$defaultLanguageAdapter$2;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.model.common.LanguageItem;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\f*\u0001\u0012\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTSelectLanguageActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "", "searchField", "", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "Z", "Lt9;", "r", "Lef3;", "X", "()Lt9;", "binding", "net/safemoon/androidwallet/activity/AKTSelectLanguageActivity$defaultLanguageAdapter$2$a", "s", "Y", "()Lnet/safemoon/androidwallet/activity/AKTSelectLanguageActivity$defaultLanguageAdapter$2$a;", "defaultLanguageAdapter", "x", "Ljava/lang/String;", "<init>", "()V", "y", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTSelectLanguageActivity.kt */
public final class AKTSelectLanguageActivity extends BasicActivity {

    /* renamed from: y */
    public static final C8173a f41371y = new C8173a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public final ef3 f41372r = C6169a.m47232a(new AKTSelectLanguageActivity$binding$2(this));

    /* renamed from: s */
    public final ef3 f41373s = C6169a.m47232a(new AKTSelectLanguageActivity$defaultLanguageAdapter$2(this));

    /* renamed from: x */
    public String f41374x = "";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTSelectLanguageActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectLanguageActivity$a */
    /* compiled from: AKTSelectLanguageActivity.kt */
    public static final class C8173a {
        public C8173a() {
        }

        public /* synthetic */ C8173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56793a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, AKTSelectLanguageActivity.class));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectLanguageActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectLanguageActivity$b */
    /* compiled from: AKTSelectLanguageActivity.kt */
    public static final class C8174b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTSelectLanguageActivity f41375a;

        public C8174b(AKTSelectLanguageActivity aKTSelectLanguageActivity) {
            this.f41375a = aKTSelectLanguageActivity;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            AKTSelectLanguageActivity aKTSelectLanguageActivity = this.f41375a;
            CharSequence charSequence = editable;
            if (editable == null) {
                charSequence = "";
            }
            aKTSelectLanguageActivity.f41374x = charSequence.toString();
            AKTSelectLanguageActivity aKTSelectLanguageActivity2 = this.f41375a;
            List U = aKTSelectLanguageActivity2.mo56792Z(aKTSelectLanguageActivity2.f41374x);
            TextView textView = this.f41375a.mo56790X().f34151f;
            if (U.size() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f41375a.mo56791Y().mo50155g(U);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: a0 */
    public static final void m65214a0(AKTSelectLanguageActivity aKTSelectLanguageActivity, View view) {
        vx2.m53591g(aKTSelectLanguageActivity, "this$0");
        aKTSelectLanguageActivity.onBackPressed();
    }

    /* renamed from: X */
    public final C6518t9 mo56790X() {
        return (C6518t9) this.f41372r.getValue();
    }

    /* renamed from: Y */
    public final AKTSelectLanguageActivity$defaultLanguageAdapter$2.C8175a mo56791Y() {
        return (AKTSelectLanguageActivity$defaultLanguageAdapter$2.C8175a) this.f41373s.getValue();
    }

    /* renamed from: Z */
    public final List<LanguageItem> mo56792Z(String str) {
        boolean z;
        List<LanguageItem> b = ee3.f37527a.mo51453b();
        ArrayList arrayList = new ArrayList();
        for (T next : b) {
            LanguageItem languageItem = (LanguageItem) next;
            String string = getString(languageItem.getTitleResId());
            vx2.m53590f(string, "getString(it.titleResId)");
            String string2 = getString(languageItem.getRegionResId());
            vx2.m53590f(string2, "getString(it.regionResId)");
            boolean z2 = true;
            if (StringsKt__StringsKt.m63090V0(str).toString().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Locale locale = Locale.ROOT;
                String lowerCase = string.toLowerCase(locale);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = str.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!StringsKt__StringsKt.m63081R(lowerCase, StringsKt__StringsKt.m63090V0(lowerCase2).toString(), false, 2, (Object) null)) {
                    String lowerCase3 = languageItem.getLanguageCode().toLowerCase(locale);
                    vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase4 = str.toLowerCase(locale);
                    vx2.m53590f(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (!StringsKt__StringsKt.m63081R(lowerCase3, StringsKt__StringsKt.m63090V0(lowerCase4).toString(), false, 2, (Object) null)) {
                        String lowerCase5 = string2.toLowerCase(locale);
                        vx2.m53590f(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase6 = str.toLowerCase(locale);
                        vx2.m53590f(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!StringsKt__StringsKt.m63081R(lowerCase5, StringsKt__StringsKt.m63090V0(lowerCase6).toString(), false, 2, (Object) null)) {
                            z2 = false;
                        }
                    }
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.m47313M0(arrayList);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56790X().mo48033b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6518t9 X = mo56790X();
        X.f34150e.f21597e.setText(R.string.default_language);
        X.f34150e.f21594b.setOnClickListener(new C9382u2(this));
        X.f34149d.setLayoutManager(new LinearLayoutManager(this, 1, false));
        X.f34149d.setAdapter(mo56791Y());
        X.f34148c.addTextChangedListener(new C8174b(this));
        mo56791Y().mo50155g(mo56792Z(this.f41374x));
    }
}
