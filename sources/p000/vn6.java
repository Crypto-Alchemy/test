package p000;

import android.view.inputmethod.EditorInfo;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import p000.is2;
import p000.mb3;
import p000.nb3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\f"}, mo44877d2 = {"Landroid/view/inputmethod/EditorInfo;", "Ljs2;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Lr37;", "b", "", "bits", "flag", "", "a", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: vn6 */
/* compiled from: TextInputServiceAndroid.android.kt */
public final class vn6 {
    /* renamed from: a */
    public static final boolean m28924a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    public static final void m28925b(EditorInfo editorInfo, js2 js2, TextFieldValue textFieldValue) {
        vx2.m53591g(editorInfo, "<this>");
        vx2.m53591g(js2, "imeOptions");
        vx2.m53591g(textFieldValue, "textFieldValue");
        int d = js2.mo22076d();
        is2.C2569a aVar = is2.f13376b;
        int i = 6;
        if (is2.m19801l(d, aVar.mo21624a())) {
            if (!js2.mo22079f()) {
                i = 0;
            }
        } else if (is2.m19801l(d, aVar.mo21628e())) {
            i = 1;
        } else if (is2.m19801l(d, aVar.mo21626c())) {
            i = 2;
        } else if (is2.m19801l(d, aVar.mo21627d())) {
            i = 5;
        } else if (is2.m19801l(d, aVar.mo21629f())) {
            i = 7;
        } else if (is2.m19801l(d, aVar.mo21630g())) {
            i = 3;
        } else if (is2.m19801l(d, aVar.mo21631h())) {
            i = 4;
        } else if (!is2.m19801l(d, aVar.mo21625b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int e = js2.mo22077e();
        nb3.C2890a aVar2 = nb3.f15513a;
        if (nb3.m23085k(e, aVar2.mo23646h())) {
            editorInfo.inputType = 1;
        } else if (nb3.m23085k(e, aVar2.mo23639a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (nb3.m23085k(e, aVar2.mo23642d())) {
            editorInfo.inputType = 2;
        } else if (nb3.m23085k(e, aVar2.mo23645g())) {
            editorInfo.inputType = 3;
        } else if (nb3.m23085k(e, aVar2.mo23647i())) {
            editorInfo.inputType = 17;
        } else if (nb3.m23085k(e, aVar2.mo23641c())) {
            editorInfo.inputType = 33;
        } else if (nb3.m23085k(e, aVar2.mo23644f())) {
            editorInfo.inputType = 129;
        } else if (nb3.m23085k(e, aVar2.mo23643e())) {
            editorInfo.inputType = 18;
        } else if (nb3.m23085k(e, aVar2.mo23640b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!js2.mo22079f() && m28924a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (is2.m19801l(js2.mo22076d(), aVar.mo21624a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m28924a(editorInfo.inputType, 1)) {
            int c = js2.mo22075c();
            mb3.C2821a aVar3 = mb3.f14923a;
            if (mb3.m22144f(c, aVar3.mo23119a())) {
                editorInfo.inputType |= 4096;
            } else if (mb3.m22144f(c, aVar3.mo23122d())) {
                editorInfo.inputType |= 8192;
            } else if (mb3.m22144f(c, aVar3.mo23121c())) {
                editorInfo.inputType |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (js2.mo22074b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = ao6.m10683j(textFieldValue.mo4123b());
        editorInfo.initialSelEnd = ao6.m10680g(textFieldValue.mo4123b());
        un1.m28364f(editorInfo, textFieldValue.mo4124c());
        editorInfo.imeOptions |= 33554432;
    }
}
