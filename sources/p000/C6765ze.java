package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, mo44877d2 = {"Lze;", "", "Landroid/app/Activity;", "activity", "", "titlePrefix", "previouslyDeniedPostfix", "Lze$a;", "callback", "Lr37;", "a", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: ze */
/* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
public final class C6765ze {

    /* renamed from: a */
    public static final C6765ze f36124a = new C6765ze();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo44877d2 = {"Lze$a;", "", "Lr37;", "a", "b", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: ze$a */
    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    public interface C6766a {
        /* renamed from: a */
        void mo38923a();

        /* renamed from: b */
        void mo38924b();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "Lr37;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    /* renamed from: ze$b */
    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    public static final class C6767b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C6766a f36125a;

        public C6767b(C6766a aVar) {
            this.f36125a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f36125a.mo38923a();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "Lr37;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    /* renamed from: ze$c */
    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    public static final class C6768c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C6766a f36126a;

        public C6768c(C6766a aVar) {
            this.f36126a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f36126a.mo38924b();
        }
    }

    /* renamed from: a */
    public final void mo49824a(Activity activity, String str, String str2, C6766a aVar) {
        vx2.m53591g(activity, "activity");
        vx2.m53591g(str, "titlePrefix");
        vx2.m53591g(str2, "previouslyDeniedPostfix");
        vx2.m53591g(aVar, "callback");
        String string = activity.getString(z45.permission_not_available_title);
        vx2.m53590f(string, "activity.getString(R.str…sion_not_available_title)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        vx2.m53590f(format, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(z45.permission_not_available_message);
        vx2.m53590f(string2, "activity.getString(R.str…on_not_available_message)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        vx2.m53590f(format2, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(z45.permission_not_available_open_settings_option, new C6767b(aVar)).setNegativeButton(17039369, new C6768c(aVar)).show();
    }
}
