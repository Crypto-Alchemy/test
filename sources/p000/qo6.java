package p000;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* renamed from: qo6 */
/* compiled from: TextViewOnReceiveContentListener */
public final class qo6 implements ph4 {

    /* renamed from: qo6$a */
    /* compiled from: TextViewOnReceiveContentListener */
    public static final class C3159a {
        /* renamed from: a */
        public static CharSequence m25820a(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            if (coerceToText instanceof Spanned) {
                return coerceToText.toString();
            }
            return coerceToText;
        }
    }

    /* renamed from: b */
    public static CharSequence m25817b(Context context, ClipData.Item item, int i) {
        return C3159a.m25820a(context, item, i);
    }

    /* renamed from: c */
    public static void m25818c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* renamed from: a */
    public rr0 mo24602a(View view, rr0 rr0) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(rr0);
        }
        if (rr0.mo25503d() == 2) {
            return rr0;
        }
        ClipData b = rr0.mo25501b();
        int c = rr0.mo25502c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence b2 = m25817b(context, b.getItemAt(i), c);
            if (b2 != null) {
                if (!z) {
                    m25818c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
        }
        return null;
    }
}
