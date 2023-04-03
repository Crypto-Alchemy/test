package zendesk.messaging.p026ui;

import android.view.MenuItem;
import android.view.View;
import java.util.Set;
import p000.it4;
import zendesk.messaging.R$id;
import zendesk.messaging.R$menu;

/* renamed from: zendesk.messaging.ui.MessagePopUpHelper */
class MessagePopUpHelper {

    /* renamed from: zendesk.messaging.ui.MessagePopUpHelper$Option */
    public enum Option {
        COPY,
        RETRY,
        DELETE
    }

    private static it4.C2573d createOnMenuItemClickListener(final MessageActionListener messageActionListener, final String str) {
        if (messageActionListener == null) {
            return null;
        }
        return new it4.C2573d() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R$id.zui_failed_message_retry) {
                    MessageActionListener.this.retry(str);
                    return true;
                } else if (menuItem.getItemId() == R$id.zui_failed_message_delete) {
                    MessageActionListener.this.delete(str);
                    return true;
                } else if (menuItem.getItemId() != R$id.zui_message_copy) {
                    return false;
                } else {
                    MessageActionListener.this.copy(str);
                    return true;
                }
            }
        };
    }

    private static it4 createPopUpMenu(View view, int i, it4.C2573d dVar) {
        it4 it4 = new it4(view.getContext(), view);
        it4.mo21634c(i);
        it4.mo21636e(dVar);
        it4.mo21635d(8388613);
        return it4;
    }

    public static void showPopUpMenu(View view, Set<Option> set, MessageActionListener messageActionListener, String str) {
        it4 createPopUpMenu = createPopUpMenu(view, R$menu.zui_message_options_copy_retry_delete, createOnMenuItemClickListener(messageActionListener, str));
        createPopUpMenu.mo21632a().getItem(0).setVisible(set.contains(Option.COPY));
        createPopUpMenu.mo21632a().getItem(1).setVisible(set.contains(Option.RETRY));
        createPopUpMenu.mo21632a().getItem(2).setVisible(set.contains(Option.DELETE));
        createPopUpMenu.mo21637f();
    }
}
