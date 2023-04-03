package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C9800a;
import zendesk.belvedere.MediaResult;
import zendesk.support.IdUtil;

class UtilsAttachment {
    private static final String ATTACHMENT_SEPARATOR = ", ";
    private static final String ATTACHMENT_TEXT_BODY = "[%s]";
    private static final String PATH_PLACEHOLDER = "%s%s%s";
    private static final AttachmentNameComparator REQUEST_ATTACHMENT_COMPARATOR = new AttachmentNameComparator();
    private static final String REQUEST_BELVEDERE_PATH;
    private static final String SUPPORT_BELVEDERE_BASE_PATH;

    public static class AttachmentNameComparator implements Comparator<StateRequestAttachment> {
        private AttachmentNameComparator() {
        }

        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getName().compareTo(stateRequestAttachment2.getName());
        }
    }

    static {
        Locale locale = Locale.US;
        String str = File.separator;
        String format = String.format(locale, PATH_PLACEHOLDER, new Object[]{"zendesk", str, ZendeskSupportSettingsProvider.SUPPORT_KEY});
        SUPPORT_BELVEDERE_BASE_PATH = format;
        REQUEST_BELVEDERE_PATH = String.format(locale, PATH_PLACEHOLDER, new Object[]{format, str, "request"});
    }

    private UtilsAttachment() {
    }

    public static Drawable getAppIcon(Context context, ResolveInfo resolveInfo) {
        Drawable drawable;
        if (resolveInfo != null) {
            drawable = resolveInfo.loadIcon(context.getPackageManager());
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return zr0.m31442e(context, 17301651);
    }

    public static ResolveInfo getAppInfoForFile(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        MediaResult d = C9800a.m75438c(context).mo73725d("tmp", str);
        if (d == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(d.mo73704m());
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!kj0.m47116g(queryIntentActivities)) {
            return queryIntentActivities.get(0);
        }
        return null;
    }

    public static CharSequence getAppName(Context context, ResolveInfo resolveInfo) {
        CharSequence charSequence;
        if (resolveInfo != null) {
            charSequence = resolveInfo.loadLabel(context.getPackageManager());
        } else {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        return context.getString(o45.request_attachment_generic_unknown_app);
    }

    public static String getAttachmentSubDir(String str, long j) {
        return String.format(Locale.US, PATH_PLACEHOLDER, new Object[]{str, File.separator, Long.valueOf(j)});
    }

    public static String getCacheDirForRequestId(String str) {
        return String.format(Locale.US, PATH_PLACEHOLDER, new Object[]{REQUEST_BELVEDERE_PATH, File.separator, str});
    }

    public static String getContentDescriptionForAttachmentButton(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(o45.request_menu_button_label_add_attachments));
        sb.append(". ");
        if (i == 0) {
            sb.append(context.getString(o45.f32274x5c772881));
        } else if (i == 1) {
            sb.append(context.getString(o45.f32275x73d0b8a8));
        } else {
            sb.append(context.getString(o45.f32273x38b7f720, new Object[]{Integer.valueOf(i)}));
        }
        return sb.toString();
    }

    public static MediaResult getLocalFile(C9800a aVar, String str, long j, String str2) {
        return aVar.mo73725d(getAttachmentSubDir(getCacheDirForRequestId(str), j), str2);
    }

    public static String getMessageBodyForAttachments(List<StateRequestAttachment> list) {
        List<TypeT> c = kj0.m47112c(list);
        Collections.sort(c, REQUEST_ATTACHMENT_COMPARATOR);
        StringBuilder sb = new StringBuilder();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            sb.append(((StateRequestAttachment) c.get(i)).getName());
            if (i < size - 1) {
                sb.append(ATTACHMENT_SEPARATOR);
            }
        }
        return String.format(Locale.US, ATTACHMENT_TEXT_BODY, new Object[]{sb.toString()});
    }

    public static String getTemporaryRequestCacheDir() {
        return String.format(Locale.US, PATH_PLACEHOLDER, new Object[]{REQUEST_BELVEDERE_PATH, File.separator, IdUtil.newStringId()});
    }

    public static boolean hasAttachmentBody(StateMessage stateMessage) {
        if (!kj0.m47118i(stateMessage.getAttachments())) {
            return false;
        }
        return stateMessage.getBody().equals(getMessageBodyForAttachments(stateMessage.getAttachments()));
    }

    public static boolean isImageAttachment(StateRequestAttachment stateRequestAttachment) {
        String mimeType = stateRequestAttachment.getMimeType();
        if (!kb6.m46949b(mimeType) || !mimeType.toLowerCase(Locale.US).startsWith("image")) {
            return false;
        }
        return true;
    }
}
