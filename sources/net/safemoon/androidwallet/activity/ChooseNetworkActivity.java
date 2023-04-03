package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ChooseNetworkActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "Lu9;", "r", "Lef3;", "T", "()Lu9;", "binding", "Lne0;", "s", "U", "()Lne0;", "chainNetworkAdapter", "<init>", "()V", "x", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ChooseNetworkActivity.kt */
public final class ChooseNetworkActivity extends BasicActivity {

    /* renamed from: x */
    public static final C8180a f41399x = new C8180a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public final ef3 f41400r = C6169a.m47232a(new ChooseNetworkActivity$binding$2(this));

    /* renamed from: s */
    public final ef3 f41401s = C6169a.m47232a(new ChooseNetworkActivity$chainNetworkAdapter$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ChooseNetworkActivity$a;", "", "Landroid/content/Context;", "context", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Landroid/content/Intent;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.ChooseNetworkActivity$a */
    /* compiled from: ChooseNetworkActivity.kt */
    public static final class C8180a {
        public C8180a() {
        }

        public /* synthetic */ C8180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo56828a(Context context, TokenType tokenType) {
            vx2.m53591g(context, "context");
            vx2.m53591g(tokenType, "tokenType");
            Intent intent = new Intent(context, ChooseNetworkActivity.class);
            intent.putExtra("ARG_SELECTED_TOKEN_NETWORK", tokenType);
            return intent;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/ChooseNetworkActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.ChooseNetworkActivity$b */
    /* compiled from: ChooseNetworkActivity.kt */
    public static final class C8181b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ ChooseNetworkActivity f41402a;

        public C8181b(ChooseNetworkActivity chooseNetworkActivity) {
            this.f41402a = chooseNetworkActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f41402a.mo56827U().getFilter().filter(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: V */
    public static final void m65292V(ChooseNetworkActivity chooseNetworkActivity, View view) {
        vx2.m53591g(chooseNetworkActivity, "this$0");
        chooseNetworkActivity.onBackPressed();
    }

    /* renamed from: T */
    public final C6561u9 mo56826T() {
        return (C6561u9) this.f41400r.getValue();
    }

    /* renamed from: U */
    public final ne0 mo56827U() {
        return (ne0) this.f41401s.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56826T().mo48349b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6561u9 T = mo56826T();
        T.f34481d.f21125c.setOnClickListener(new me0(this));
        T.f34481d.f21127e.setText(R.string.screen_title_cc_network);
        RecyclerView recyclerView = T.f34479b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(mo56827U());
        mo56826T().f34480c.f34980b.addTextChangedListener(new C8181b(this));
    }
}
