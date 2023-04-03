package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: NavController.kt */
public final class NavController$restoreStateInternal$1 extends Lambda implements rc2<String, Boolean> {
    public final /* synthetic */ String $backStackId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$restoreStateInternal$1(String str) {
        super(1);
        this.$backStackId = str;
    }

    public final Boolean invoke(String str) {
        return Boolean.valueOf(vx2.m53586b(str, this.$backStackId));
    }
}
