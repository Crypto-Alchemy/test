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
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity$defaultCurrencyAdapter$2;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\n*\u0001\u001b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTSelectCurrencyActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "Lt9;", "r", "Lef3;", "Z", "()Lt9;", "binding", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "s", "b0", "()Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loader", "Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "x", "c0", "()Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "selectFiatViewModel", "", "y", "Ljava/lang/String;", "searchField", "net/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$a", "A", "a0", "()Lnet/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$a;", "defaultCurrencyAdapter", "<init>", "()V", "B", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTSelectCurrencyActivity.kt */
public final class AKTSelectCurrencyActivity extends BasicActivity {

    /* renamed from: B */
    public static final C8169a f41363B = new C8169a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41364A = C6169a.m47232a(new AKTSelectCurrencyActivity$defaultCurrencyAdapter$2(this));

    /* renamed from: r */
    public final ef3 f41365r = C6169a.m47232a(new AKTSelectCurrencyActivity$binding$2(this));

    /* renamed from: s */
    public final ef3 f41366s = C6169a.m47232a(new AKTSelectCurrencyActivity$loader$2(this));

    /* renamed from: x */
    public final ef3 f41367x = new dd7(ua5.m52727b(SelectFiatViewModel.class), new AKTSelectCurrencyActivity$special$$inlined$viewModels$default$2(this), new AKTSelectCurrencyActivity$selectFiatViewModel$2(this), new AKTSelectCurrencyActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: y */
    public String f41368y = "";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity$a */
    /* compiled from: AKTSelectCurrencyActivity.kt */
    public static final class C8169a {
        public C8169a() {
        }

        public /* synthetic */ C8169a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56783a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, AKTSelectCurrencyActivity.class));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity$b */
    /* compiled from: AKTSelectCurrencyActivity.kt */
    public static final class C8170b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTSelectCurrencyActivity f41369a;

        public C8170b(AKTSelectCurrencyActivity aKTSelectCurrencyActivity) {
            this.f41369a = aKTSelectCurrencyActivity;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            AKTSelectCurrencyActivity aKTSelectCurrencyActivity = this.f41369a;
            CharSequence charSequence = editable;
            if (editable == null) {
                charSequence = "";
            }
            aKTSelectCurrencyActivity.f41368y = charSequence.toString();
            List<HistoryListItem> l = this.f41369a.mo56782c0().mo61377l(this.f41369a.f41368y);
            this.f41369a.mo56779Z().f34151f.setText(R.string.currency_not_found);
            TextView textView = this.f41369a.mo56779Z().f34151f;
            if (l.size() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f41369a.mo56780a0().mo66796d(l);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: d0 */
    public static final void m65199d0(AKTSelectCurrencyActivity aKTSelectCurrencyActivity, View view) {
        vx2.m53591g(aKTSelectCurrencyActivity, "this$0");
        aKTSelectCurrencyActivity.onBackPressed();
    }

    /* renamed from: e0 */
    public static final void m65200e0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Z */
    public final C6518t9 mo56779Z() {
        return (C6518t9) this.f41365r.getValue();
    }

    /* renamed from: a0 */
    public final AKTSelectCurrencyActivity$defaultCurrencyAdapter$2.C8171a mo56780a0() {
        return (AKTSelectCurrencyActivity$defaultCurrencyAdapter$2.C8171a) this.f41364A.getValue();
    }

    /* renamed from: b0 */
    public final ProgressLoading mo56781b0() {
        return (ProgressLoading) this.f41366s.getValue();
    }

    /* renamed from: c0 */
    public final SelectFiatViewModel mo56782c0() {
        return (SelectFiatViewModel) this.f41367x.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56779Z().mo48033b());
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
        ProgressLoading b0 = mo56781b0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        b0.mo57295D(supportFragmentManager);
        C6518t9 Z = mo56779Z();
        Z.f34150e.f21597e.setText(R.string.default_currency);
        Z.f34150e.f21594b.setOnClickListener(new C9300s2(this));
        Z.f34149d.setLayoutManager(new LinearLayoutManager(this, 1, false));
        Z.f34149d.setAdapter(mo56780a0());
        Z.f34148c.addTextChangedListener(new C8170b(this));
        mo56782c0().mo61374i().observe(this, new C9324t2(new AKTSelectCurrencyActivity$onPostCreate$2(this)));
    }
}
