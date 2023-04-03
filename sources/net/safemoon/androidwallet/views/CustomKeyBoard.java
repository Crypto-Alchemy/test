package net.safemoon.androidwallet.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b*\u0010.B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b*\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u00062"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/CustomKeyBoard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/EditText;", "editText", "Lr37;", "v", "", "isVisible", "w", "", "o1", "J", "COUNT_DOWN_TIMER", "p1", "COUNT_DOWN_INTERVAL", "Lzb7;", "q1", "Lef3;", "getBinding", "()Lzb7;", "binding", "Ljh4;", "r1", "getOnKeyboardVisibilityListener", "()Ljh4;", "onKeyboardVisibilityListener", "s1", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "Landroid/view/inputmethod/InputConnection;", "t1", "Landroid/view/inputmethod/InputConnection;", "inputConnection", "Landroid/view/View$OnClickListener;", "u1", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CustomKeyBoard.kt */
public final class CustomKeyBoard extends ConstraintLayout {

    /* renamed from: o1 */
    public final long f43223o1 = 9999999;

    /* renamed from: p1 */
    public final long f43224p1 = 200;

    /* renamed from: q1 */
    public final ef3 f43225q1 = C6169a.m47232a(new CustomKeyBoard$binding$2(this));

    /* renamed from: r1 */
    public final ef3 f43226r1 = C6169a.m47232a(new CustomKeyBoard$onKeyboardVisibilityListener$2(this));

    /* renamed from: s1 */
    public EditText f43227s1;

    /* renamed from: t1 */
    public InputConnection f43228t1;

    /* renamed from: u1 */
    public final View.OnClickListener f43229u1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomKeyBoard(Context context) {
        super(context);
        vx2.m53591g(context, "context");
        View.inflate(getContext(), R.layout.view_custom_keyboard, this);
        this.f43229u1 = new ay0(this);
    }

    private final zb7 getBinding() {
        return (zb7) this.f43225q1.getValue();
    }

    private final jh4 getOnKeyboardVisibilityListener() {
        return (jh4) this.f43226r1.getValue();
    }

    /* renamed from: x */
    public static final void m69489x(CustomKeyBoard customKeyBoard, View view) {
        InputConnection inputConnection;
        vx2.m53591g(customKeyBoard, "this$0");
        if (customKeyBoard.f43228t1 != null) {
            if (vx2.m53586b(view, customKeyBoard.getBinding().f36103m)) {
                InputConnection inputConnection2 = customKeyBoard.f43228t1;
                vx2.m53588d(inputConnection2);
                if (TextUtils.isEmpty(inputConnection2.getSelectedText(0))) {
                    InputConnection inputConnection3 = customKeyBoard.f43228t1;
                    if (inputConnection3 != null) {
                        inputConnection3.deleteSurroundingText(1, 0);
                        return;
                    }
                    return;
                }
                InputConnection inputConnection4 = customKeyBoard.f43228t1;
                if (inputConnection4 != null) {
                    inputConnection4.commitText("", 1);
                }
            } else if (vx2.m53586b(view, customKeyBoard.getBinding().f36104n)) {
                customKeyBoard.mo62098w(false);
            } else if ((view instanceof Button) && (inputConnection = customKeyBoard.f43228t1) != null) {
                CharSequence textBeforeCursor = inputConnection.getTextBeforeCursor(1, 0);
                if (vx2.m53586b(textBeforeCursor, ",")) {
                    Button button = (Button) view;
                    if (vx2.m53586b(button.getText(), ",") || vx2.m53586b(button.getText(), ".")) {
                        return;
                    }
                }
                if (vx2.m53586b(textBeforeCursor, ".")) {
                    Button button2 = (Button) view;
                    if (vx2.m53586b(button2.getText(), ",") || vx2.m53586b(button2.getText(), ".")) {
                        return;
                    }
                }
                inputConnection.commitText(((Button) view).getText(), 1);
            }
        }
    }

    public final EditText getEditText() {
        return this.f43227s1;
    }

    public final void setEditText(EditText editText) {
        this.f43227s1 = editText;
    }

    /* renamed from: v */
    public final void mo62097v(EditText editText) {
        vx2.m53591g(editText, "editText");
    }

    /* renamed from: w */
    public final void mo62098w(boolean z) {
        int i;
        getOnKeyboardVisibilityListener().mo52693e(z);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomKeyBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
        View.inflate(getContext(), R.layout.view_custom_keyboard, this);
        this.f43229u1 = new ay0(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomKeyBoard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        View.inflate(getContext(), R.layout.view_custom_keyboard, this);
        this.f43229u1 = new ay0(this);
    }
}
