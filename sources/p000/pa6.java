package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: pa6 */
/* compiled from: StreamLocalUriFetcher */
public class pa6 extends oj3<InputStream> {

    /* renamed from: g */
    public static final UriMatcher f16389g;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f16389g = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public pa6(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public Class<InputStream> mo11939a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo23315c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo23316f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i = mo24514i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream mo24514i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f16389g.match(uri);
        if (match != 1) {
            if (match == 3) {
                return mo24515j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return mo24515j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream mo24515j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
