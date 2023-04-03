package androidx.compose.p004ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.z00;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lz00$a;", "", "invoke", "(Lz00$a;)Ljava/lang/Boolean;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 */
/* compiled from: TwoDimensionalFocusSearch.kt */
public final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements rc2<z00.C3703a, Boolean> {
    public final /* synthetic */ int $direction;
    public final /* synthetic */ FocusModifier $focusedItem;
    public final /* synthetic */ rc2<FocusModifier, Boolean> $onFound;
    public final /* synthetic */ FocusModifier $this_generateAndSearchChildren;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusModifier focusModifier, FocusModifier focusModifier2, int i, rc2<? super FocusModifier, Boolean> rc2) {
        super(1);
        this.$this_generateAndSearchChildren = focusModifier;
        this.$focusedItem = focusModifier2;
        this.$direction = i;
        this.$onFound = rc2;
    }

    public final Boolean invoke(z00.C3703a aVar) {
        vx2.m53591g(aVar, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m2424q(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound));
        if (valueOf.booleanValue() || !aVar.mo28280a()) {
            return valueOf;
        }
        return null;
    }
}
