package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        mo10403L0();
    }

    /* renamed from: L0 */
    public final void mo10403L0() {
        mo10556H0(1);
        mo10562w0(new Fade(2)).mo10562w0(new ChangeBounds()).mo10562w0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo10403L0();
    }
}
