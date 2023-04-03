package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.p001os.VibrationEffect;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C0684j;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTImportExistingWalletsActivity;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.FullScreenWebViewFragment;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 f2\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\bd\u0010eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001c\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J+\u0010'\u001a\u00020\u00022\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001b\u00107\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u00106R\u001b\u0010=\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u00106R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010E\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010\u00070\u00070A8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0F8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010K\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010\t0\t0A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010DR$\u0010M\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010\t0\t0A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010DR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010?R\u0016\u0010P\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010?R\u0016\u0010Q\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010?R\u0016\u0010T\u001a\u00020R8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b!\u0010SR\u0016\u0010V\u001a\u00020R8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bU\u0010SR\u001b\u0010Y\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\bW\u0010+\u001a\u0004\bX\u00106R\u001b\u0010[\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\bX\u0010+\u001a\u0004\bZ\u00106R\u0016\u0010\\\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010?R\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010;R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006h"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTSecurityQuestionsActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "Lr37;", "z1", "X0", "D1", "U0", "", "E1", "", "d1", "x1", "registerStr", "v1", "Y0", "A1", "", "parts", "u1", "([Ljava/lang/String;)V", "mnemonic", "C1", "B1", "y1", "h1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "message", "d0", "Low7;", "safeMoonppp", "e0", "toSend", "w1", "i1", "X", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "A", "Lef3;", "g1", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "Ls9;", "B", "Z0", "()Ls9;", "binding", "C", "a1", "()Ljava/lang/String;", "displayUsername", "H", "f1", "username", "I", "c1", "password", "L", "Z", "isImportWallet", "Lk04;", "kotlin.jvm.PlatformType", "M", "Lk04;", "termsAndConditions", "", "P", "Ljava/util/List;", "questionList", "Q", "firstQuestion", "U", "secondQuestion", "useFirstMyOwnQuestion", "Y", "useSecondMyOwnQuestion", "didEnterFirstAnswer", "Lwg;", "Lwg;", "firstQuestionsDialog", "k0", "secondQuestionsDialog", "v0", "b1", "firstMyQuestionHint", "e1", "secondMyQuestionHint", "isExistingWallets", "", "o1", "tryingLoginCount", "Lnet/safemoon/androidwallet/utils/Common$RequestSocketState;", "p1", "Lnet/safemoon/androidwallet/utils/Common$RequestSocketState;", "socketState", "<init>", "()V", "q1", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTSecurityQuestionsActivity.kt */
public final class AKTSecurityQuestionsActivity extends AKTServerFunctions {

    /* renamed from: q1 */
    public static final C8159a f41338q1 = new C8159a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41339A = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new C8165xdfefcdda(this), new C8164xdfefcdd9(this), new C8166xdfefcddb((pc2) null, this));

    /* renamed from: B */
    public final ef3 f41340B = C6169a.m47232a(new AKTSecurityQuestionsActivity$binding$2(this));

    /* renamed from: C */
    public final ef3 f41341C = C6169a.m47232a(new AKTSecurityQuestionsActivity$displayUsername$2(this));

    /* renamed from: H */
    public final ef3 f41342H = C6169a.m47232a(new AKTSecurityQuestionsActivity$username$2(this));

    /* renamed from: I */
    public final ef3 f41343I = C6169a.m47232a(new AKTSecurityQuestionsActivity$password$2(this));

    /* renamed from: L */
    public boolean f41344L;

    /* renamed from: M */
    public final k04<Boolean> f41345M = new k04<>(Boolean.FALSE);

    /* renamed from: P */
    public List<String> f41346P;

    /* renamed from: Q */
    public k04<String> f41347Q = new k04<>("");

    /* renamed from: U */
    public k04<String> f41348U = new k04<>("");

    /* renamed from: X */
    public boolean f41349X;

    /* renamed from: Y */
    public boolean f41350Y;

    /* renamed from: Z */
    public boolean f41351Z;

    /* renamed from: b1 */
    public final ef3 f41352b1 = C6169a.m47232a(new AKTSecurityQuestionsActivity$secondMyQuestionHint$2(this));

    /* renamed from: e0 */
    public C9517wg f41353e0;

    /* renamed from: e1 */
    public boolean f41354e1;

    /* renamed from: k0 */
    public C9517wg f41355k0;

    /* renamed from: o1 */
    public int f41356o1 = 2;

    /* renamed from: p1 */
    public Common.RequestSocketState f41357p1 = Common.RequestSocketState.NONE;

    /* renamed from: v0 */
    public final ef3 f41358v0 = C6169a.m47232a(new AKTSecurityQuestionsActivity$firstMyQuestionHint$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTSecurityQuestionsActivity$a;", "", "Landroid/content/Context;", "context", "", "username", "password", "displayUsername", "Lr37;", "a", "KEY_DISPLAY_USERNAME", "Ljava/lang/String;", "KEY_PASSWORD", "KEY_USERNAME", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$a */
    /* compiled from: AKTSecurityQuestionsActivity.kt */
    public static final class C8159a {
        public C8159a() {
        }

        public /* synthetic */ C8159a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56758a(Context context, String str, String str2, String str3) {
            vx2.m53591g(context, "context");
            vx2.m53591g(str, "username");
            vx2.m53591g(str2, "password");
            vx2.m53591g(str3, "displayUsername");
            Intent intent = new Intent(context, AKTSecurityQuestionsActivity.class);
            intent.putExtra("KEY_USERNAME", str);
            intent.putExtra("KEY_DISPLAY_USERNAME", str3);
            intent.putExtra("KEY_PASSWORD", str2);
            context.startActivity(intent);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSecurityQuestionsActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$b */
    /* compiled from: AKTSecurityQuestionsActivity.kt */
    public static final class C8160b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTSecurityQuestionsActivity f41359a;

        public C8160b(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
            this.f41359a = aKTSecurityQuestionsActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            this.f41359a.mo56740X0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSecurityQuestionsActivity$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$c */
    /* compiled from: AKTSecurityQuestionsActivity.kt */
    public static final class C8161c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTSecurityQuestionsActivity f41360a;

        public C8161c(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
            this.f41360a = aKTSecurityQuestionsActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            this.f41360a.mo56740X0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSecurityQuestionsActivity$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$d */
    /* compiled from: AKTSecurityQuestionsActivity.kt */
    public static final class C8162d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTSecurityQuestionsActivity f41361a;

        public C8162d(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
            this.f41361a = aKTSecurityQuestionsActivity;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            vx2.m53591g(editable, "s");
            this.f41361a.mo56740X0();
            if (editable.toString().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f41361a.f41351Z = true;
                this.f41361a.mo56757z1();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSecurityQuestionsActivity$e", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$e */
    /* compiled from: AKTSecurityQuestionsActivity.kt */
    public static final class C8163e implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTSecurityQuestionsActivity f41362a;

        public C8163e(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
            this.f41362a = aKTSecurityQuestionsActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            this.f41362a.mo56740X0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    /* renamed from: V0 */
    public static final void m65128V0(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, View view) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        if (aKTSecurityQuestionsActivity.mo56738E1()) {
            aKTSecurityQuestionsActivity.mo56756y1();
        }
    }

    /* renamed from: W0 */
    public static final void m65129W0(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, View view) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        a77.m55427e(aKTSecurityQuestionsActivity);
        C0684j q = aKTSecurityQuestionsActivity.getSupportFragmentManager().mo5996q();
        vx2.m53590f(q, "supportFragmentManager.beginTransaction()");
        q.mo6270s(R.id.content_main, FullScreenWebViewFragment.f41947s.mo57487a("https://safemoon.com/legal/wallet/eula", R.string.terms_of_service, false));
        q.mo6267h(FullScreenWebViewFragment.class.getSimpleName());
        q.mo6139j();
    }

    /* renamed from: j1 */
    public static final void m65130j1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m65131k1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        aKTSecurityQuestionsActivity.mo56734A1();
    }

    /* renamed from: l1 */
    public static final void m65132l1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: m1 */
    public static final void m65133m1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, C6472s9 s9Var, View view) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        vx2.m53591g(s9Var, "$this_apply");
        a77.m55427e(aKTSecurityQuestionsActivity);
        List p = ck0.m33068p(aKTSecurityQuestionsActivity.mo56744b1());
        List<String> list = aKTSecurityQuestionsActivity.f41346P;
        if (list == null) {
            vx2.m53605u("questionList");
            list = null;
        }
        p.addAll(list);
        aKTSecurityQuestionsActivity.f41353e0 = new C9517wg(p);
        new Handler(Looper.getMainLooper()).postDelayed(new C7156h2(aKTSecurityQuestionsActivity, s9Var), 200);
    }

    /* renamed from: n1 */
    public static final void m65135n1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, C6472s9 s9Var) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        vx2.m53591g(s9Var, "$this_apply");
        C9517wg wgVar = aKTSecurityQuestionsActivity.f41353e0;
        if (wgVar == null) {
            vx2.m53605u("firstQuestionsDialog");
            wgVar = null;
        }
        LinearLayout linearLayout = s9Var.f33776n;
        vx2.m53590f(linearLayout, "firstQuestionLayout");
        wgVar.mo66699g(aKTSecurityQuestionsActivity, linearLayout, s9Var.mo47702b(), new AKTSecurityQuestionsActivity$onPostCreate$1$2$1$1(aKTSecurityQuestionsActivity, s9Var));
    }

    /* renamed from: o1 */
    public static final void m65137o1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: p1 */
    public static final void m65139p1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, C6472s9 s9Var, View view) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        vx2.m53591g(s9Var, "$this_apply");
        a77.m55427e(aKTSecurityQuestionsActivity);
        List<String> list = aKTSecurityQuestionsActivity.f41346P;
        if (list == null) {
            vx2.m53605u("questionList");
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (true ^ vx2.m53586b((String) next, aKTSecurityQuestionsActivity.f41347Q.getValue())) {
                arrayList.add(next);
            }
        }
        List p = ck0.m33068p(aKTSecurityQuestionsActivity.mo56747e1());
        p.addAll(arrayList);
        aKTSecurityQuestionsActivity.f41355k0 = new C9517wg(p);
        new Handler(Looper.getMainLooper()).postDelayed(new C7113g2(aKTSecurityQuestionsActivity, s9Var), 200);
    }

    /* renamed from: q1 */
    public static final void m65141q1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, C6472s9 s9Var) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        vx2.m53591g(s9Var, "$this_apply");
        C9517wg wgVar = aKTSecurityQuestionsActivity.f41355k0;
        if (wgVar == null) {
            vx2.m53605u("secondQuestionsDialog");
            wgVar = null;
        }
        LinearLayout linearLayout = s9Var.f33777o;
        vx2.m53590f(linearLayout, "secondQuestionLayout");
        wgVar.mo66699g(aKTSecurityQuestionsActivity, linearLayout, s9Var.mo47702b(), new AKTSecurityQuestionsActivity$onPostCreate$1$4$1$1(aKTSecurityQuestionsActivity, s9Var));
    }

    /* renamed from: r1 */
    public static final void m65143r1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        aKTSecurityQuestionsActivity.f41345M.setValue(Boolean.valueOf(z));
        aKTSecurityQuestionsActivity.mo56740X0();
    }

    /* renamed from: s1 */
    public static final void m65145s1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, View view) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        aKTSecurityQuestionsActivity.onBackPressed();
    }

    /* renamed from: t1 */
    public static final void m65147t1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, View view) {
        vx2.m53591g(aKTSecurityQuestionsActivity, "this$0");
        a77.m55427e(aKTSecurityQuestionsActivity);
    }

    /* renamed from: A1 */
    public final void mo56734A1() {
        String str;
        if (C9198q.f44131b) {
            str = C2127d2.m14640e(this.f8531y, mo56748f1(), mo56745c1());
            vx2.m53590f(str, "{\n            AKTSecpUti…d\n            )\n        }");
        } else {
            str = mo12156T(this.f8531y, mo56748f1(), mo56745c1());
            vx2.m53590f(str, "{\n            anonymizeA…name, password)\n        }");
        }
        this.f41357p1 = Common.RequestSocketState.LOGIN;
        mo56749g1().mo60956l(str);
    }

    /* renamed from: B1 */
    public final void mo56735B1(String str) {
        AKTImportExistingWalletsActivity.C8133a aVar = AKTImportExistingWalletsActivity.f41282Y;
        String f1 = mo56748f1();
        vx2.m53590f(f1, "username");
        String c1 = mo56745c1();
        vx2.m53590f(c1, "password");
        AKTImportExistingWalletsActivity.C8133a.m64946b(aVar, this, str, false, (String) null, f1, c1, 12, (Object) null);
    }

    /* renamed from: C1 */
    public final void mo56736C1(String str) {
        StartWalletActivity.f41482b1.mo56907a(this, true, str, this.f41344L);
        finish();
    }

    /* renamed from: D1 */
    public final void mo56737D1() {
        if (vx2.m53586b(this.f41347Q.getValue(), this.f41348U.getValue())) {
            List<String> list = this.f41346P;
            if (list == null) {
                vx2.m53605u("questionList");
                list = null;
            }
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (!vx2.m53586b((String) next, this.f41347Q.getValue())) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f41348U.postValue(arrayList.get(0));
            }
        }
    }

    /* renamed from: E1 */
    public final boolean mo56738E1() {
        if (!vx2.m53586b(this.f41345M.getValue(), Boolean.FALSE)) {
            return true;
        }
        mo56755x1();
        return false;
    }

    /* renamed from: U0 */
    public final void mo56739U0() {
        mo56742Z0().f33765c.setOnClickListener(new C9231r2(this));
        mo56742Z0().f33767e.setOnClickListener(new C7063f2(this));
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56749g1().mo60951g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c5  */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56740X0() {
        /*
            r6 = this;
            s9 r0 = r6.mo56742Z0()
            boolean r1 = r6.f41349X
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            android.widget.EditText r1 = r0.f33773k
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x001b
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = r3
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            if (r1 == 0) goto L_0x0020
            r1 = r3
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            boolean r4 = r6.f41350Y
            if (r4 == 0) goto L_0x003a
            android.widget.EditText r4 = r0.f33775m
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L_0x0036
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r4 = r3
            goto L_0x0037
        L_0x0036:
            r4 = r2
        L_0x0037:
            if (r4 == 0) goto L_0x003a
            r1 = r3
        L_0x003a:
            android.widget.EditText r4 = r0.f33772j
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L_0x004b
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r4 = r3
            goto L_0x004c
        L_0x004b:
            r4 = r2
        L_0x004c:
            if (r4 == 0) goto L_0x004f
            r1 = r3
        L_0x004f:
            android.widget.EditText r4 = r0.f33772j
            android.text.Editable r4 = r4.getText()
            int r4 = r4.length()
            r5 = 8
            if (r4 != r2) goto L_0x0064
            android.widget.TextView r1 = r0.f33779q
            r1.setVisibility(r3)
            r1 = r3
            goto L_0x0069
        L_0x0064:
            android.widget.TextView r4 = r0.f33779q
            r4.setVisibility(r5)
        L_0x0069:
            android.widget.EditText r4 = r0.f33774l
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L_0x007a
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r4 = r3
            goto L_0x007b
        L_0x007a:
            r4 = r2
        L_0x007b:
            if (r4 == 0) goto L_0x007e
            r1 = r3
        L_0x007e:
            android.widget.EditText r4 = r0.f33774l
            android.text.Editable r4 = r4.getText()
            int r4 = r4.length()
            if (r4 != r2) goto L_0x0091
            android.widget.TextView r1 = r0.f33780r
            r1.setVisibility(r3)
            r1 = r3
            goto L_0x0096
        L_0x0091:
            android.widget.TextView r4 = r0.f33780r
            r4.setVisibility(r5)
        L_0x0096:
            k04<java.lang.Boolean> r4 = r6.f41345M
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x00a5
            r1 = r3
        L_0x00a5:
            if (r1 == 0) goto L_0x00c5
            com.google.android.material.button.MaterialButton r1 = r0.f33765c
            r3 = 2131099707(0x7f06003b, float:1.7811775E38)
            int r3 = r6.getColor(r3)
            r1.setTextColor(r3)
            com.google.android.material.button.MaterialButton r1 = r0.f33765c
            r1.setEnabled(r2)
            com.google.android.material.button.MaterialButton r0 = r0.f33765c
            r1 = 2131099676(0x7f06001c, float:1.7811712E38)
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
            goto L_0x00e2
        L_0x00c5:
            com.google.android.material.button.MaterialButton r1 = r0.f33765c
            r2 = 2131100019(0x7f060173, float:1.7812408E38)
            int r2 = r6.getColor(r2)
            r1.setTextColor(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f33765c
            r1.setEnabled(r3)
            com.google.android.material.button.MaterialButton r0 = r0.f33765c
            r1 = 2131099677(0x7f06001d, float:1.7811714E38)
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity.mo56740X0():void");
    }

    /* renamed from: Y0 */
    public final String mo56741Y0(String str) {
        String str2;
        String[] w = C2127d2.m14658w(str, "|");
        vx2.m53590f(w, "mySplit(registerStr, \"|\")");
        String v = C2127d2.m14657v(w[1], w[2]);
        if (C9198q.f44131b) {
            String str3 = w[0];
            String str4 = w[1];
            str2 = mo12166i0(str3, str4, w[2], w[3], w[4], w[5], w[6], w[7], w[8], v);
        } else {
            str2 = C2127d2.m14661z(this.f8531y, w[0], w[1], w[2], w[3], w[4], w[5], w[6], v);
        }
        vx2.m53590f(str2, "toSend");
        return str2;
    }

    /* renamed from: Z0 */
    public final C6472s9 mo56742Z0() {
        return (C6472s9) this.f41340B.getValue();
    }

    /* renamed from: a1 */
    public final String mo56743a1() {
        return (String) this.f41341C.getValue();
    }

    /* renamed from: b1 */
    public final String mo56744b1() {
        return (String) this.f41358v0.getValue();
    }

    /* renamed from: c1 */
    public final String mo56745c1() {
        return (String) this.f41343I.getValue();
    }

    /* renamed from: d0 */
    public boolean mo12163d0(String str) {
        String str2;
        int i;
        if (str != null) {
            str2 = str.toUpperCase(Locale.ROOT);
            vx2.m53590f(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        boolean b = vx2.m53586b(str2, "CONNECTION_REFUSED");
        if (b && this.f41357p1 == Common.RequestSocketState.LOGIN && (i = this.f41356o1) > 0) {
            this.f41356o1 = i - 1;
            mo12159X();
            new Handler(Looper.getMainLooper()).postDelayed(new C7201i2(this), 300);
            return true;
        } else if (!b) {
            return false;
        } else {
            this.f41357p1 = Common.RequestSocketState.NONE;
            ProgressLoading progressLoading = this.f8528r;
            if (progressLoading != null) {
                progressLoading.mo22266k();
            }
            mo57001Q(true);
            mo12159X();
            return true;
        }
    }

    /* renamed from: d1 */
    public final String mo56746d1() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String i = f06.m57518i(this, "EMAILRAW");
        boolean z = this.f41349X;
        if (this.f41350Y) {
            if (!z) {
                z = true;
            } else {
                z = true;
            }
        }
        String str6 = "36";
        String str7 = "";
        if (z) {
            if (z) {
                String obj = mo56742Z0().f33773k.getText().toString();
                String obj2 = mo56742Z0().f33772j.getText().toString();
                String value = this.f41348U.getValue();
                vx2.m53588d(value);
                String[] strArr = (String[]) StringsKt__StringsKt.m63061B0(value, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                String str8 = strArr[0];
                str3 = strArr[1];
                str = obj2;
                str4 = obj;
                str7 = mo56742Z0().f33774l.getText().toString();
                String str9 = str8;
                str2 = str6;
                str6 = str9;
            } else if (z) {
                String value2 = this.f41347Q.getValue();
                vx2.m53588d(value2);
                String[] strArr2 = (String[]) StringsKt__StringsKt.m63061B0(value2, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                String str10 = strArr2[0];
                String str11 = strArr2[1];
                String obj3 = mo56742Z0().f33772j.getText().toString();
                String obj4 = mo56742Z0().f33775m.getText().toString();
                str = mo56742Z0().f33774l.getText().toString();
                str5 = str11;
                str7 = obj3;
                str4 = obj4;
                str2 = str6;
                str6 = str10;
            } else if (!z) {
                str4 = str7;
                str6 = str4;
                str3 = str6;
                str2 = str3;
                str = str2;
            } else {
                String obj5 = mo56742Z0().f33773k.getText().toString();
                String str12 = obj5;
                str7 = mo56742Z0().f33772j.getText().toString();
                str4 = mo56742Z0().f33775m.getText().toString();
                str3 = str12;
                str = mo56742Z0().f33774l.getText().toString();
                str2 = "37";
            }
            Common common = Common.f42577a;
            String q = common.mo60910q(str7);
            String q2 = common.mo60910q(str);
            return i + "|" + mo56748f1() + "|" + mo56745c1() + "|" + str6 + "|" + q + "|" + str2 + "|" + q2 + "|" + str3 + "|" + str4 + "|";
        }
        String value3 = this.f41347Q.getValue();
        vx2.m53588d(value3);
        String[] strArr3 = (String[]) StringsKt__StringsKt.m63061B0(value3, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
        str6 = strArr3[0];
        String str13 = strArr3[1];
        String obj6 = mo56742Z0().f33772j.getText().toString();
        String value4 = this.f41348U.getValue();
        vx2.m53588d(value4);
        String[] strArr4 = (String[]) StringsKt__StringsKt.m63061B0(value4, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
        str2 = strArr4[0];
        String str14 = strArr4[1];
        str = mo56742Z0().f33774l.getText().toString();
        str5 = str13;
        str7 = obj6;
        str4 = str14;
        str3 = str5;
        Common common2 = Common.f42577a;
        String q3 = common2.mo60910q(str7);
        String q22 = common2.mo60910q(str);
        return i + "|" + mo56748f1() + "|" + mo56745c1() + "|" + str6 + "|" + q3 + "|" + str2 + "|" + q22 + "|" + str3 + "|" + str4 + "|";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f3, code lost:
        if (r4.equals("GR8REG02") == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0110, code lost:
        if (r4.equals("AKTSFMREG02") == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        if (r4.equals("SFMREG02") == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011c, code lost:
        if (r1 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011e, code lost:
        r1.mo24209c("KA", p000.f06.m57518i(r0, "KA"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        p000.f06.m57522m(r0, "TIMENOW", p000.C2127d2.m14635B());
        mo56734A1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0132, code lost:
        r3 = r0.f8528r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0134, code lost:
        if (r3 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0136, code lost:
        r3.mo22266k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0139, code lost:
        super.mo12164e0(r21, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12164e0(p000.ow7 r21, java.lang.String r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            s9 r3 = r20.mo56742Z0()
            com.google.android.material.button.MaterialButton r3 = r3.f33765c
            r4 = 1
            r3.setEnabled(r4)
            boolean r3 = r0.mo12163d0(r2)
            if (r3 == 0) goto L_0x0017
            return
        L_0x0017:
            net.safemoon.androidwallet.utils.Common$RequestSocketState r3 = net.safemoon.androidwallet.utils.Common.RequestSocketState.NONE
            r0.f41357p1 = r3
            net.safemoon.androidwallet.utils.Common r3 = net.safemoon.androidwallet.utils.Common.f42577a
            java.lang.String r3 = r3.mo60918y(r0, r2)
            java.lang.String r5 = "|"
            java.lang.String[] r3 = p000.C2127d2.m14658w(r3, r5)
            java.lang.String r5 = "parts"
            p000.vx2.m53590f(r3, r5)
            int r5 = r3.length
            r6 = 0
            if (r5 != 0) goto L_0x0032
            r5 = r4
            goto L_0x0033
        L_0x0032:
            r5 = r6
        L_0x0033:
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x013c
            r7 = r3[r6]
            java.lang.String r5 = "parts[0]"
            p000.vx2.m53590f(r7, r5)
            java.lang.String r13 = "="
            java.lang.String[] r8 = new java.lang.String[]{r13}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.util.List r7 = kotlin.text.StringsKt__StringsKt.m63061B0(r7, r8, r9, r10, r11, r12)
            int r7 = r7.size()
            r8 = 2
            if (r7 < r8) goto L_0x013c
            r14 = r3[r6]
            p000.vx2.m53590f(r14, r5)
            java.lang.String[] r15 = new java.lang.String[]{r13}
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            java.util.List r5 = kotlin.text.StringsKt__StringsKt.m63061B0(r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r5)
            java.lang.String r5 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            p000.vx2.m53590f(r4, r5)
            r20.mo12159X()
            int r5 = r4.hashCode()
            r7 = 0
            java.lang.String r8 = "KA"
            switch(r5) {
                case -1392583332: goto L_0x0113;
                case -1291267898: goto L_0x010a;
                case 325952731: goto L_0x00f6;
                case 627426537: goto L_0x00ed;
                case 789732987: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x0132
        L_0x0087:
            java.lang.String r5 = "AKTSFMUSER"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0091
            goto L_0x0132
        L_0x0091:
            net.safemoon.androidwallet.dialogs.ProgressLoading r2 = r0.f8528r
            if (r2 == 0) goto L_0x0098
            r2.mo22266k()
        L_0x0098:
            r0.mo56752u1(r3)
            if (r1 == 0) goto L_0x00a2
            java.lang.String r2 = r1.mo24213g(r8)
            goto L_0x00a3
        L_0x00a2:
            r2 = r7
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
            java.lang.String r4 = "UK5"
            java.lang.String r7 = r1.mo24213g(r4)
        L_0x00ab:
            p000.C2127d2.m14660y(r1, r3)
            java.lang.String r3 = p000.C2935o.m23571f(r7, r2)
            java.lang.String r3 = p000.C2127d2.m14648m(r3)
            java.lang.String r4 = "MNEMONIC"
            if (r1 == 0) goto L_0x00bd
            r1.mo24209c(r4, r3)
        L_0x00bd:
            p000.f06.m57524o(r0, r4, r3)
            p000.f06.m57524o(r0, r8, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2 = 2131951748(0x7f130084, float:1.953992E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2131951747(0x7f130083, float:1.9539917E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2131951746(0x7f130082, float:1.9539915E38)
            net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$parseMessage$dialog$1 r7 = new net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$parseMessage$dialog$1
            r7.<init>(r0, r3)
            android.app.Dialog r1 = p000.C9001np.m69938W(r1, r2, r4, r5, r7)
            if (r1 == 0) goto L_0x00e7
            r1.setCancelable(r6)
        L_0x00e7:
            if (r1 == 0) goto L_0x013c
            r1.setCanceledOnTouchOutside(r6)
            goto L_0x013c
        L_0x00ed:
            java.lang.String r3 = "GR8REG02"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x011c
            goto L_0x0132
        L_0x00f6:
            java.lang.String r5 = "AKTSERVERERROR"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00ff
            goto L_0x0132
        L_0x00ff:
            net.safemoon.androidwallet.dialogs.ProgressLoading r1 = r0.f8528r
            if (r1 == 0) goto L_0x0106
            r1.mo22266k()
        L_0x0106:
            r0.mo12165f0(r3, r7)
            goto L_0x013c
        L_0x010a:
            java.lang.String r3 = "AKTSFMREG02"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x011c
            goto L_0x0132
        L_0x0113:
            java.lang.String r3 = "SFMREG02"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x011c
            goto L_0x0132
        L_0x011c:
            if (r1 == 0) goto L_0x0125
            java.lang.String r2 = p000.f06.m57518i(r0, r8)
            r1.mo24209c(r8, r2)
        L_0x0125:
            long r1 = p000.C2127d2.m14635B()
            java.lang.String r3 = "TIMENOW"
            p000.f06.m57522m(r0, r3, r1)
            r20.mo56734A1()
            goto L_0x013c
        L_0x0132:
            net.safemoon.androidwallet.dialogs.ProgressLoading r3 = r0.f8528r
            if (r3 == 0) goto L_0x0139
            r3.mo22266k()
        L_0x0139:
            super.mo12164e0(r21, r22)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity.mo12164e0(ow7, java.lang.String):void");
    }

    /* renamed from: e1 */
    public final String mo56747e1() {
        return (String) this.f41352b1.getValue();
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        this.f8528r.mo22266k();
        C9001np.m69939X(new WeakReference(this), Integer.valueOf(R.string.akt_error_cannot_register_new_key_message), (Integer) null, 0, (pc2) null, 28, (Object) null);
    }

    /* renamed from: f1 */
    public final String mo56748f1() {
        return (String) this.f41342H.getValue();
    }

    /* renamed from: g1 */
    public final AKTWebSocketHandlingViewModel mo56749g1() {
        return (AKTWebSocketHandlingViewModel) this.f41339A.getValue();
    }

    /* renamed from: h1 */
    public final void mo56750h1() {
        Object systemService = getSystemService("vibrator");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(50, 10));
        } else {
            vibrator.vibrate(50);
        }
    }

    /* renamed from: i1 */
    public void mo56751i1() {
        mo56749g1().mo60953i().observe(this, new C9201q2(new AKTSecurityQuestionsActivity$initReceiveResponse$1(this)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56742Z0().mo47702b());
        mo56749g1().mo60957m();
        mo56751i1();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        String[] w = C2127d2.m14658w(C2127d2.m14651p(this.f8531y), "|");
        vx2.m53590f(w, "mySplit(questions, \"|\")");
        this.f41346P = C6706xq.m54490d(w);
        mo56739U0();
        this.f8530x.mo61256r(new AKTSecurityQuestionsActivity$onCreate$1(this));
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        String i = f06.m57518i(this, "EMAILRAW");
        C6472s9 Z0 = mo56742Z0();
        Z0.f33781s.setText(i);
        Z0.f33788z.setText(mo56743a1());
        mo56740X0();
        this.f41347Q.observe(this, new C7238j2(new AKTSecurityQuestionsActivity$onPostCreate$1$1(Z0, this)));
        List<String> list = this.f41346P;
        List<String> list2 = null;
        if (list == null) {
            vx2.m53605u("questionList");
            list = null;
        }
        if (!list.isEmpty()) {
            k04<String> k04 = this.f41347Q;
            List<String> list3 = this.f41346P;
            if (list3 == null) {
                vx2.m53605u("questionList");
            } else {
                list2 = list3;
            }
            k04.postValue(list2.get(0));
        }
        Z0.f33776n.setOnClickListener(new C7331k2(this, Z0));
        this.f41348U.observe(this, new C7816l2(new AKTSecurityQuestionsActivity$onPostCreate$1$3(Z0)));
        Z0.f33777o.setOnClickListener(new C7856m2(this, Z0));
        Z0.f33773k.addTextChangedListener(new C8160b(this));
        Z0.f33775m.addTextChangedListener(new C8161c(this));
        Z0.f33772j.addTextChangedListener(new C8162d(this));
        Z0.f33774l.addTextChangedListener(new C8163e(this));
        Z0.f33766d.setOnCheckedChangeListener(new C7923n2(this));
        Z0.f33778p.f21597e.setText(getString(R.string.akt_activity_register_txt));
        Z0.f33778p.f21594b.setVisibility(0);
        Z0.f33778p.f21594b.setOnClickListener(new C9011o2(this));
        Z0.f33768f.setOnClickListener(new C9154p2(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r0 == true) goto L_0x0059;
     */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56752u1(java.lang.String[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            r1 = 1
            r2 = 0
            r3 = r1
        L_0x0004:
            r4 = 0
            if (r3 >= r0) goto L_0x0032
            r5 = r12[r3]
            java.lang.String r6 = "="
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r5 = kotlin.text.StringsKt__StringsKt.m63061B0(r5, r6, r7, r8, r9, r10)
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r6 = r5.length
            r7 = 2
            if (r6 < r7) goto L_0x002f
            r4 = r5[r4]
            java.lang.String r6 = "APIKEY"
            boolean r4 = p000.vx2.m53586b(r4, r6)
            if (r4 == 0) goto L_0x002f
            r2 = r5[r1]
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x0004
        L_0x0032:
            java.lang.String r12 = "PB5K"
            java.lang.String r0 = ""
            java.lang.String r12 = p000.f06.m57519j(r11, r12, r0)
            ex7 r0 = new ex7
            r0.<init>()
            java.lang.String r12 = p000.C3311sx.m27171a(r12)
            r0.mo19535t(r12)
            java.lang.String r12 = r0.mo19517b(r2)
            if (r12 == 0) goto L_0x0058
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x0054
            r0 = r1
            goto L_0x0055
        L_0x0054:
            r0 = r4
        L_0x0055:
            if (r0 != r1) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = r4
        L_0x0059:
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "API_KEY"
            p000.up1.m72960e(r11, r0, r12)
        L_0x0060:
            net.safemoon.androidwallet.utils.Common r12 = net.safemoon.androidwallet.utils.Common.f42577a
            r12.mo60898d(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity.mo56752u1(java.lang.String[]):void");
    }

    /* renamed from: v1 */
    public final void mo56753v1(String str) {
        mo56754w1(mo56741Y0(str));
    }

    /* renamed from: w1 */
    public void mo56754w1(String str) {
        if (str != null) {
            mo56742Z0().f33765c.setEnabled(false);
            mo56749g1().mo60956l(str);
        }
    }

    /* renamed from: x1 */
    public final void mo56755x1() {
        mo56750h1();
        mo56742Z0().f33766d.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake));
    }

    /* renamed from: y1 */
    public final void mo56756y1() {
        C9001np.m69955g0(new WeakReference(this), Integer.valueOf(R.string.akt_reset_password_confirm_dialog_header), mo56742Z0().f33772j.getText().toString(), mo56742Z0().f33774l.getText().toString(), R.string.confirm, R.string.ca_alert_save_continue_editing, new C8167x737284b1(this), C8168x737284b2.INSTANCE);
    }

    /* renamed from: z1 */
    public final void mo56757z1() {
        if (this.f41351Z) {
            C6472s9 Z0 = mo56742Z0();
            Z0.f33787y.setVisibility(0);
            Z0.f33771i.setVisibility(0);
            Z0.f33774l.setVisibility(0);
            Z0.f33770h.setVisibility(0);
            Z0.f33777o.setVisibility(0);
            if (this.f41350Y) {
                Z0.f33786x.setVisibility(8);
                Z0.f33775m.setVisibility(0);
                return;
            }
            Z0.f33786x.setVisibility(0);
            Z0.f33775m.setVisibility(8);
        }
    }
}
