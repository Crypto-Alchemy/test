package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p000.rr0;

/* renamed from: hn */
/* compiled from: AppCompatReceiveContentHelper */
public final class C2496hn {

    /* renamed from: hn$a */
    /* compiled from: AppCompatReceiveContentHelper */
    public static final class C2497a {
        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public static boolean m19103a(DragEvent dragEvent, TextView textView, Activity activity) {
            DragAndDropPermissions unused = activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ga7.m17765f0(textView, new rr0.C3216a(dragEvent.getClipData(), 3).mo25506a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        public static boolean m19104b(DragEvent dragEvent, View view, Activity activity) {
            DragAndDropPermissions unused = activity.requestDragAndDropPermissions(dragEvent);
            ga7.m17765f0(view, new rr0.C3216a(dragEvent.getClipData(), 3).mo25506a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m19100a(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && ga7.m17721E(view) != null) {
            Activity c = m19102c(view);
            if (c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C2497a.m19103a(dragEvent, (TextView) view, c);
                    }
                    return C2497a.m19104b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m19101b(TextView textView, int i) {
        ClipData clipData;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || ga7.m17721E(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            rr0.C3216a aVar = new rr0.C3216a(clipData, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            ga7.m17765f0(textView, aVar.mo25508c(i2).mo25506a());
        }
        return true;
    }

    /* renamed from: c */
    public static Activity m19102c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
