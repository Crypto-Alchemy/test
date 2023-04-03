package p000;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.p004ui.text.input.TextFieldValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010b\u001a\u00020P\u0012\u0006\u0010I\u001a\u00020E\u0012\u0006\u0010M\u001a\u00020\u0006¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0016J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\tH\u0016J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010!\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\tH\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\tH\u0016J\u0012\u00100\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000101H\u0016J\n\u00105\u001a\u0004\u0018\u000104H\u0016J\u0010\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\tH\u0016J\u0010\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0016J\u001c\u0010@\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016J\"\u0010D\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010!\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010>H\u0016R\u0017\u0010I\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010M\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010NR*\u0010W\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8\u0000@@X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010NR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010JR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010J¨\u0006e"}, mo44877d2 = {"Lq85;", "Landroid/view/inputmethod/InputConnection;", "Lnn1;", "editCommand", "Lr37;", "a", "", "b", "c", "", "code", "d", "beginBatchEdit", "endBatchEdit", "closeConnection", "", "text", "newCursorPosition", "commitText", "start", "end", "setComposingRegion", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "maxChars", "flags", "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "Landroid/os/Handler;", "getHandler", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "reqModes", "getCursorCapsMode", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "Lwu2;", "Lwu2;", "getEventCallback", "()Lwu2;", "eventCallback", "Z", "getAutoCorrect", "()Z", "autoCorrect", "I", "batchDepth", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "mTextFieldValue", "e", "currentExtractedTextRequestToken", "f", "extractedTextMonitorMode", "", "g", "Ljava/util/List;", "editCommands", "h", "isActive", "initState", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Lwu2;Z)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: q85 */
/* compiled from: RecordingInputConnection.android.kt */
public final class q85 implements InputConnection {

    /* renamed from: a */
    public final wu2 f16874a;

    /* renamed from: b */
    public final boolean f16875b;

    /* renamed from: c */
    public int f16876c;

    /* renamed from: d */
    public TextFieldValue f16877d;

    /* renamed from: e */
    public int f16878e;

    /* renamed from: f */
    public boolean f16879f;

    /* renamed from: g */
    public final List<nn1> f16880g = new ArrayList();

    /* renamed from: h */
    public boolean f16881h = true;

    public q85(TextFieldValue textFieldValue, wu2 wu2, boolean z) {
        vx2.m53591g(textFieldValue, "initState");
        vx2.m53591g(wu2, "eventCallback");
        this.f16874a = wu2;
        this.f16875b = z;
        this.f16877d = textFieldValue;
    }

    /* renamed from: a */
    public final void mo25008a(nn1 nn1) {
        mo25009b();
        try {
            this.f16880g.add(nn1);
        } finally {
            mo25011c();
        }
    }

    /* renamed from: b */
    public final boolean mo25009b() {
        this.f16876c++;
        return true;
    }

    public boolean beginBatchEdit() {
        boolean z = this.f16881h;
        if (z) {
            return mo25009b();
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo25011c() {
        int i = this.f16876c - 1;
        this.f16876c = i;
        if (i == 0 && (!this.f16880g.isEmpty())) {
            this.f16874a.mo4139d(CollectionsKt___CollectionsKt.m47313M0(this.f16880g));
            this.f16880g.clear();
        }
        if (this.f16876c > 0) {
            return true;
        }
        return false;
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f16881h;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        this.f16880g.clear();
        this.f16876c = 0;
        this.f16881h = false;
        this.f16874a.mo4136a(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f16881h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        vx2.m53591g(inputContentInfo, "inputContentInfo");
        boolean z = this.f16881h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f16881h;
        if (z) {
            return this.f16875b;
        }
        return z;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f16881h;
        if (z) {
            mo25008a(new jl0(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* renamed from: d */
    public final void mo25018d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f16881h;
        if (!z) {
            return z;
        }
        mo25008a(new xb1(i, i2));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f16881h;
        if (!z) {
            return z;
        }
        mo25008a(new yb1(i, i2));
        return true;
    }

    public boolean endBatchEdit() {
        return mo25011c();
    }

    public boolean finishComposingText() {
        boolean z = this.f16881h;
        if (!z) {
            return z;
        }
        mo25008a(new b22());
        return true;
    }

    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f16877d.mo4124c(), ao6.m10682i(this.f16877d.mo4123b()), i);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f16879f = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.f16878e = i2;
        }
        return ev2.m16347a(this.f16877d);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i) {
        if (ao6.m10679f(this.f16877d.mo4123b())) {
            return null;
        }
        return mn6.m22403a(this.f16877d).toString();
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        return mn6.m22404b(this.f16877d, i).toString();
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        return mn6.m22405c(this.f16877d, i).toString();
    }

    public boolean performContextMenuAction(int i) {
        boolean z = this.f16881h;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    mo25008a(new ky5(0, this.f16877d.mo4124c().length()));
                    break;
                case 16908320:
                    mo25018d(277);
                    break;
                case 16908321:
                    mo25018d(278);
                    break;
                case 16908322:
                    mo25018d(279);
                    break;
            }
        }
        return z;
    }

    public boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f16881h;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = is2.f13376b.mo21626c();
                    break;
                case 3:
                    i2 = is2.f13376b.mo21630g();
                    break;
                case 4:
                    i2 = is2.f13376b.mo21631h();
                    break;
                case 5:
                    i2 = is2.f13376b.mo21627d();
                    break;
                case 6:
                    i2 = is2.f13376b.mo21625b();
                    break;
                case 7:
                    i2 = is2.f13376b.mo21629f();
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("IME sends unsupported Editor Action: ");
                    sb.append(i);
                    i2 = is2.f13376b.mo21624a();
                    break;
            }
        } else {
            i2 = is2.f13376b.mo21624a();
        }
        this.f16874a.mo4138c(i2);
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f16881h;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = this.f16881h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "event");
        boolean z = this.f16881h;
        if (!z) {
            return z;
        }
        this.f16874a.mo4137b(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f16881h;
        if (z) {
            mo25008a(new dy5(i, i2));
        }
        return z;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f16881h;
        if (z) {
            mo25008a(new ey5(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.f16881h;
        if (!z) {
            return z;
        }
        mo25008a(new ky5(i, i2));
        return true;
    }
}
