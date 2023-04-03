package p000;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, mo44877d2 = {"Lch;", "Li8;", "Landroid/view/accessibility/AccessibilityManager;", "a", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ch */
/* compiled from: AndroidAccessibilityManager.android.kt */
public final class C1679ch implements C2530i8 {

    /* renamed from: b */
    public static final C1680a f8437b = new C1680a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final AccessibilityManager f8438a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, mo44877d2 = {"Lch$a;", "", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ch$a */
    /* compiled from: AndroidAccessibilityManager.android.kt */
    public static final class C1680a {
        public C1680a() {
        }

        public /* synthetic */ C1680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1679ch(Context context) {
        vx2.m53591g(context, "context");
        Object systemService = context.getSystemService("accessibility");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f8438a = (AccessibilityManager) systemService;
    }
}
