package zendesk.messaging.p026ui;

import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import okhttp3.internal.p023ws.RealWebSocket;

/* renamed from: zendesk.messaging.ui.UtilsAttachment */
class UtilsAttachment {
    public static String formatFileSize(Context context, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            j = (((j * 1000) * 1000) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        return Formatter.formatFileSize(context, j);
    }
}
