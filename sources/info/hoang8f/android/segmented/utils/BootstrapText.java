package info.hoang8f.android.segmented.utils;

import android.content.Context;
import android.text.SpannableString;
import info.hoang8f.android.segmented.font.AwesomeTypefaceSpan;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BootstrapText extends SpannableString implements Serializable {

    /* renamed from: info.hoang8f.android.segmented.utils.BootstrapText$b */
    public static class C5975b {

        /* renamed from: a */
        public final StringBuilder f29990a = new StringBuilder();

        /* renamed from: b */
        public final Context f29991b;

        /* renamed from: c */
        public final boolean f29992c;

        /* renamed from: d */
        public final Map<Integer, sp2> f29993d = new HashMap();

        public C5975b(Context context, boolean z) {
            this.f29991b = context.getApplicationContext();
            this.f29992c = z;
        }

        /* renamed from: a */
        public C5975b mo43686a(CharSequence charSequence, sp2 sp2) {
            this.f29990a.append(sp2.mo47847a(charSequence.toString().replaceAll("\\-", "_")));
            this.f29993d.put(Integer.valueOf(this.f29990a.length()), sp2);
            return this;
        }

        /* renamed from: b */
        public C5975b mo43687b(CharSequence charSequence) {
            this.f29990a.append(charSequence);
            return this;
        }

        /* renamed from: c */
        public BootstrapText mo43688c() {
            BootstrapText bootstrapText = new BootstrapText(this.f29990a.toString());
            for (Map.Entry next : this.f29993d.entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                bootstrapText.setSpan(new AwesomeTypefaceSpan(this.f29991b, (sp2) next.getValue()), intValue - 1, intValue, 18);
            }
            return bootstrapText;
        }
    }

    public BootstrapText(CharSequence charSequence) {
        super(charSequence);
    }
}
