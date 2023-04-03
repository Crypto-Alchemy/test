package p000;

import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0007"}, mo44877d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "maxChars", "Lrl;", "c", "b", "a", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: mn6 */
/* compiled from: TextFieldValue.kt */
public final class mn6 {
    /* renamed from: a */
    public static final C3205rl m22403a(TextFieldValue textFieldValue) {
        vx2.m53591g(textFieldValue, "<this>");
        return textFieldValue.mo4122a().mo25436j(textFieldValue.mo4123b());
    }

    /* renamed from: b */
    public static final C3205rl m22404b(TextFieldValue textFieldValue, int i) {
        vx2.m53591g(textFieldValue, "<this>");
        return textFieldValue.mo4122a().subSequence(ao6.m10681h(textFieldValue.mo4123b()), Math.min(ao6.m10681h(textFieldValue.mo4123b()) + i, textFieldValue.mo4124c().length()));
    }

    /* renamed from: c */
    public static final C3205rl m22405c(TextFieldValue textFieldValue, int i) {
        vx2.m53591g(textFieldValue, "<this>");
        return textFieldValue.mo4122a().subSequence(Math.max(0, ao6.m10682i(textFieldValue.mo4123b()) - i), ao6.m10682i(textFieldValue.mo4123b()));
    }
}
