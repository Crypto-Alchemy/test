package androidx.compose.p004ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "", "", "isFocused", "()Z", "getHasFocus", "hasFocus", "isCaptured", "isDeactivated", "<init>", "(Ljava/lang/String;I)V", "Active", "ActiveParent", "Captured", "Deactivated", "DeactivatedParent", "Inactive", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.FocusStateImpl */
/* compiled from: FocusState.kt */
public enum FocusStateImpl {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusStateImpl$a */
    /* compiled from: FocusState.kt */
    public /* synthetic */ class C0360a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1659a = null;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Captured.ordinal()] = 1;
            iArr[FocusStateImpl.Active.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f1659a = iArr;
        }
    }

    public boolean getHasFocus() {
        switch (C0360a.f1659a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean isCaptured() {
        switch (C0360a.f1659a[ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isDeactivated() {
        switch (C0360a.f1659a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean isFocused() {
        switch (C0360a.f1659a[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
