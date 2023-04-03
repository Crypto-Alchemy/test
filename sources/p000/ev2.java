package p000;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, mo44877d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "Landroid/view/inputmethod/ExtractedText;", "a", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ev2 */
/* compiled from: InputState.android.kt */
public final class ev2 {
    /* renamed from: a */
    public static final ExtractedText m16347a(TextFieldValue textFieldValue) {
        vx2.m53591g(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.mo4124c();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.mo4124c().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = ao6.m10682i(textFieldValue.mo4123b());
        extractedText.selectionEnd = ao6.m10681h(textFieldValue.mo4123b());
        extractedText.flags = StringsKt__StringsKt.m63079Q(textFieldValue.mo4124c(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
