package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.InputStream;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: com.squareup.picasso.d */
/* compiled from: ContactsPhotoRequestHandler */
public class C5438d extends C5454m {

    /* renamed from: b */
    public static final UriMatcher f26854b;

    /* renamed from: a */
    public final Context f26855a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f26854b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C5438d(Context context) {
        this.f26855a = context;
    }

    /* renamed from: c */
    public boolean mo39454c(C5450k kVar) {
        Uri uri = kVar.f26891d;
        if (!PublicResolver.FUNC_CONTENT.equals(uri.getScheme()) || !ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || f26854b.match(kVar.f26891d) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
        InputStream j = mo39527j(kVar);
        if (j == null) {
            return null;
        }
        return new C5454m.C5455a(sg4.m71937l(j), Picasso.LoadedFrom.DISK);
    }

    /* renamed from: j */
    public final InputStream mo39527j(C5450k kVar) throws IOException {
        ContentResolver contentResolver = this.f26855a.getContentResolver();
        Uri uri = kVar.f26891d;
        int match = f26854b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
