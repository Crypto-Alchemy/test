package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "Ll9;", "r", "Lef3;", "U", "()Ll9;", "binding", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTActivity.kt */
public final class AKTActivity extends BasicActivity {

    /* renamed from: s */
    public static final C8119a f41227s = new C8119a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public final ef3 f41228r = C6169a.m47232a(new AKTActivity$binding$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTActivity$a */
    /* compiled from: AKTActivity.kt */
    public static final class C8119a {
        public C8119a() {
        }

        public /* synthetic */ C8119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56538a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, AKTActivity.class));
        }
    }

    /* renamed from: V */
    public static final void m64725V(AKTActivity aKTActivity, View view) {
        vx2.m53591g(aKTActivity, "this$0");
        aKTActivity.startActivity(new Intent(aKTActivity, AKTRegisterGuideActivity.class));
    }

    /* renamed from: W */
    public static final void m64726W(AKTActivity aKTActivity, View view) {
        vx2.m53591g(aKTActivity, "this$0");
        AKTLoginActivity.f41302L.mo56678a(aKTActivity, true);
    }

    /* renamed from: X */
    public static final void m64727X(AKTActivity aKTActivity, View view) {
        vx2.m53591g(aKTActivity, "this$0");
        aKTActivity.onBackPressed();
    }

    /* renamed from: U */
    public final C6208l9 mo56537U() {
        return (C6208l9) this.f41228r.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56537U().mo45389b());
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
        C6208l9 U = mo56537U();
        U.f31218c.setOnClickListener(new C6913c(this));
        U.f31217b.setOnClickListener(new C6956d(this));
        U.f31219d.setOnClickListener(new C7006e(this));
    }
}
