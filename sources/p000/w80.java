package p000;

import android.content.ClipboardManager;
import android.view.MenuItem;
import android.widget.PopupMenu;
import net.safemoon.androidwallet.fragments.CalculatorFragment;

/* renamed from: w80 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w80 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ CharSequence f45465a;

    /* renamed from: b */
    public final /* synthetic */ CalculatorFragment f45466b;

    /* renamed from: c */
    public final /* synthetic */ ClipboardManager f45467c;

    public /* synthetic */ w80(CharSequence charSequence, CalculatorFragment calculatorFragment, ClipboardManager clipboardManager) {
        this.f45465a = charSequence;
        this.f45466b = calculatorFragment;
        this.f45467c = clipboardManager;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return CalculatorFragment.m66469D0(this.f45465a, this.f45466b, this.f45467c, menuItem);
    }
}
