package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$isUnmergedLeafNode$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class C0408x54deba10 extends Lambda implements rc2<LayoutNode, Boolean> {
    public static final C0408x54deba10 INSTANCE = new C0408x54deba10();

    public C0408x54deba10() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        vt5 a;
        vx2.m53591g(layoutNode, "it");
        yt5 j = au5.m10806j(layoutNode);
        boolean z = true;
        if (j == null || (a = zt5.m31502a(j)) == null || !a.mo27326u()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
