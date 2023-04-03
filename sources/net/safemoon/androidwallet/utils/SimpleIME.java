package net.safemoon.androidwallet.utils;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/SimpleIME;", "Landroid/inputmethodservice/InputMethodService;", "()V", "onCreateInputView", "Landroid/view/View;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SimpleIME.kt */
public final class SimpleIME extends InputMethodService {
    public View onCreateInputView() {
        View inflate = getLayoutInflater().inflate(R.layout.view_custom_keyboard, (ViewGroup) null, false);
        vx2.m53590f(inflate, "layoutInflater.inflate(R…om_keyboard, null, false)");
        return inflate;
    }
}
