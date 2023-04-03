package p000;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: ox0 */
/* compiled from: CursorFilter */
public class ox0 extends Filter {

    /* renamed from: a */
    public C3005a f16198a;

    /* renamed from: ox0$a */
    /* compiled from: CursorFilter */
    public interface C3005a {
        /* renamed from: a */
        void mo22722a(Cursor cursor);

        /* renamed from: b */
        Cursor mo22723b(CharSequence charSequence);

        /* renamed from: c */
        Cursor mo23813c();

        CharSequence convertToString(Cursor cursor);
    }

    public ox0(C3005a aVar) {
        this.f16198a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f16198a.convertToString((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor b = this.f16198a.mo22723b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (b != null) {
            filterResults.count = b.getCount();
            filterResults.values = b;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c = this.f16198a.mo23813c();
        Object obj = filterResults.values;
        if (obj != null && obj != c) {
            this.f16198a.mo22722a((Cursor) obj);
        }
    }
}
