package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo44877d2 = {"Landroidx/fragment/app/strictmode/FragmentReuseViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment", "Landroidx/fragment/app/Fragment;", "previousFragmentId", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "getPreviousFragmentId", "()Ljava/lang/String;", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: FragmentReuseViolation.kt */
public final class FragmentReuseViolation extends Violation {
    private final String previousFragmentId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        vx2.m53591g(fragment, "fragment");
        vx2.m53591g(str, "previousFragmentId");
        this.previousFragmentId = str;
    }

    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
