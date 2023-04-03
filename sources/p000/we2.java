package p000;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: we2 */
/* compiled from: GaplessInfoHolder */
public final class we2 {

    /* renamed from: c */
    public static final Pattern f19071c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f19072a = -1;

    /* renamed from: b */
    public int f19073b = -1;

    /* renamed from: a */
    public boolean mo27485a() {
        if (this.f19072a == -1 || this.f19073b == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo27486b(String str) {
        Matcher matcher = f19071c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) w67.m29360j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) w67.m29360j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f19072a = parseInt;
            this.f19073b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo27487c(Metadata metadata) {
        for (int i = 0; i < metadata.mo6545d(); i++) {
            Metadata.Entry c = metadata.mo6544c(i);
            if (c instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) c;
                if ("iTunSMPB".equals(commentFrame.f5603e) && mo27486b(commentFrame.f5604g)) {
                    return true;
                }
            } else if (c instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) c;
                if ("com.apple.iTunes".equals(internalFrame.f5610d) && "iTunSMPB".equals(internalFrame.f5611e) && mo27486b(internalFrame.f5612g)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo27488d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f19072a = i2;
        this.f19073b = i3;
        return true;
    }
}
