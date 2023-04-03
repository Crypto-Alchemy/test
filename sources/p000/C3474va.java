package p000;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, mo44877d2 = {"Lva;", "Lsa;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "Landroid/content/Context;", "context", "input", "d", "", "resultCode", "intent", "e", "<init>", "()V", "a", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: va */
/* compiled from: ActivityResultContracts.kt */
public final class C3474va extends C3253sa<Intent, ActivityResult> {

    /* renamed from: a */
    public static final C3475a f18717a = new C3475a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lva$a;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "<init>", "()V", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: va$a */
    /* compiled from: ActivityResultContracts.kt */
    public static final class C3475a {
        public C3475a() {
        }

        public /* synthetic */ C3475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public Intent mo6044a(Context context, Intent intent) {
        vx2.m53591g(context, "context");
        vx2.m53591g(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public ActivityResult mo6045c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
