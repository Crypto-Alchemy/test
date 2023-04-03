package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public class Barcode extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Barcode> CREATOR = new C4156b();
    @RecentlyNonNull

    /* renamed from: A */
    public UrlBookmark f23144A;
    @RecentlyNonNull

    /* renamed from: B */
    public GeoPoint f23145B;
    @RecentlyNonNull

    /* renamed from: C */
    public CalendarEvent f23146C;
    @RecentlyNonNull

    /* renamed from: H */
    public ContactInfo f23147H;
    @RecentlyNonNull

    /* renamed from: I */
    public DriverLicense f23148I;
    @RecentlyNonNull

    /* renamed from: L */
    public byte[] f23149L;

    /* renamed from: M */
    public boolean f23150M;

    /* renamed from: a */
    public int f23151a;
    @RecentlyNonNull

    /* renamed from: d */
    public String f23152d;
    @RecentlyNonNull

    /* renamed from: e */
    public String f23153e;

    /* renamed from: g */
    public int f23154g;
    @RecentlyNonNull

    /* renamed from: k */
    public Point[] f23155k;
    @RecentlyNonNull

    /* renamed from: r */
    public Email f23156r;
    @RecentlyNonNull

    /* renamed from: s */
    public Phone f23157s;
    @RecentlyNonNull

    /* renamed from: x */
    public Sms f23158x;
    @RecentlyNonNull

    /* renamed from: y */
    public WiFi f23159y;

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class Address extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Address> CREATOR = new C4155a();

        /* renamed from: a */
        public int f23160a;
        @RecentlyNonNull

        /* renamed from: d */
        public String[] f23161d;

        public Address() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51137m(parcel, 2, this.f23160a);
            rk5.m51144t(parcel, 3, this.f23161d, false);
            rk5.m51126b(parcel, a);
        }

        public Address(int i, @RecentlyNonNull String[] strArr) {
            this.f23160a = i;
            this.f23161d = strArr;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class CalendarDateTime extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<CalendarDateTime> CREATOR = new C4157c();

        /* renamed from: a */
        public int f23162a;

        /* renamed from: d */
        public int f23163d;

        /* renamed from: e */
        public int f23164e;

        /* renamed from: g */
        public int f23165g;

        /* renamed from: k */
        public int f23166k;

        /* renamed from: r */
        public int f23167r;

        /* renamed from: s */
        public boolean f23168s;
        @RecentlyNonNull

        /* renamed from: x */
        public String f23169x;

        public CalendarDateTime() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51137m(parcel, 2, this.f23162a);
            rk5.m51137m(parcel, 3, this.f23163d);
            rk5.m51137m(parcel, 4, this.f23164e);
            rk5.m51137m(parcel, 5, this.f23165g);
            rk5.m51137m(parcel, 6, this.f23166k);
            rk5.m51137m(parcel, 7, this.f23167r);
            rk5.m51127c(parcel, 8, this.f23168s);
            rk5.m51143s(parcel, 9, this.f23169x, false);
            rk5.m51126b(parcel, a);
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @RecentlyNonNull String str) {
            this.f23162a = i;
            this.f23163d = i2;
            this.f23164e = i3;
            this.f23165g = i4;
            this.f23166k = i5;
            this.f23167r = i6;
            this.f23168s = z;
            this.f23169x = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class CalendarEvent extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<CalendarEvent> CREATOR = new C4159e();
        @RecentlyNonNull

        /* renamed from: a */
        public String f23170a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23171d;
        @RecentlyNonNull

        /* renamed from: e */
        public String f23172e;
        @RecentlyNonNull

        /* renamed from: g */
        public String f23173g;
        @RecentlyNonNull

        /* renamed from: k */
        public String f23174k;
        @RecentlyNonNull

        /* renamed from: r */
        public CalendarDateTime f23175r;
        @RecentlyNonNull

        /* renamed from: s */
        public CalendarDateTime f23176s;

        public CalendarEvent() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51143s(parcel, 2, this.f23170a, false);
            rk5.m51143s(parcel, 3, this.f23171d, false);
            rk5.m51143s(parcel, 4, this.f23172e, false);
            rk5.m51143s(parcel, 5, this.f23173g, false);
            rk5.m51143s(parcel, 6, this.f23174k, false);
            rk5.m51142r(parcel, 7, this.f23175r, i, false);
            rk5.m51142r(parcel, 8, this.f23176s, i, false);
            rk5.m51126b(parcel, a);
        }

        public CalendarEvent(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull CalendarDateTime calendarDateTime, @RecentlyNonNull CalendarDateTime calendarDateTime2) {
            this.f23170a = str;
            this.f23171d = str2;
            this.f23172e = str3;
            this.f23173g = str4;
            this.f23174k = str5;
            this.f23175r = calendarDateTime;
            this.f23176s = calendarDateTime2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class ContactInfo extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<ContactInfo> CREATOR = new C4158d();
        @RecentlyNonNull

        /* renamed from: a */
        public PersonName f23177a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23178d;
        @RecentlyNonNull

        /* renamed from: e */
        public String f23179e;
        @RecentlyNonNull

        /* renamed from: g */
        public Phone[] f23180g;
        @RecentlyNonNull

        /* renamed from: k */
        public Email[] f23181k;
        @RecentlyNonNull

        /* renamed from: r */
        public String[] f23182r;
        @RecentlyNonNull

        /* renamed from: s */
        public Address[] f23183s;

        public ContactInfo() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51142r(parcel, 2, this.f23177a, i, false);
            rk5.m51143s(parcel, 3, this.f23178d, false);
            rk5.m51143s(parcel, 4, this.f23179e, false);
            rk5.m51146v(parcel, 5, this.f23180g, i, false);
            rk5.m51146v(parcel, 6, this.f23181k, i, false);
            rk5.m51144t(parcel, 7, this.f23182r, false);
            rk5.m51146v(parcel, 8, this.f23183s, i, false);
            rk5.m51126b(parcel, a);
        }

        public ContactInfo(@RecentlyNonNull PersonName personName, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Phone[] phoneArr, @RecentlyNonNull Email[] emailArr, @RecentlyNonNull String[] strArr, @RecentlyNonNull Address[] addressArr) {
            this.f23177a = personName;
            this.f23178d = str;
            this.f23179e = str2;
            this.f23180g = phoneArr;
            this.f23181k = emailArr;
            this.f23182r = strArr;
            this.f23183s = addressArr;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class DriverLicense extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<DriverLicense> CREATOR = new C4161g();
        @RecentlyNonNull

        /* renamed from: A */
        public String f23184A;
        @RecentlyNonNull

        /* renamed from: B */
        public String f23185B;
        @RecentlyNonNull

        /* renamed from: C */
        public String f23186C;
        @RecentlyNonNull

        /* renamed from: H */
        public String f23187H;
        @RecentlyNonNull

        /* renamed from: I */
        public String f23188I;
        @RecentlyNonNull

        /* renamed from: a */
        public String f23189a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23190d;
        @RecentlyNonNull

        /* renamed from: e */
        public String f23191e;
        @RecentlyNonNull

        /* renamed from: g */
        public String f23192g;
        @RecentlyNonNull

        /* renamed from: k */
        public String f23193k;
        @RecentlyNonNull

        /* renamed from: r */
        public String f23194r;
        @RecentlyNonNull

        /* renamed from: s */
        public String f23195s;
        @RecentlyNonNull

        /* renamed from: x */
        public String f23196x;
        @RecentlyNonNull

        /* renamed from: y */
        public String f23197y;

        public DriverLicense() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51143s(parcel, 2, this.f23189a, false);
            rk5.m51143s(parcel, 3, this.f23190d, false);
            rk5.m51143s(parcel, 4, this.f23191e, false);
            rk5.m51143s(parcel, 5, this.f23192g, false);
            rk5.m51143s(parcel, 6, this.f23193k, false);
            rk5.m51143s(parcel, 7, this.f23194r, false);
            rk5.m51143s(parcel, 8, this.f23195s, false);
            rk5.m51143s(parcel, 9, this.f23196x, false);
            rk5.m51143s(parcel, 10, this.f23197y, false);
            rk5.m51143s(parcel, 11, this.f23184A, false);
            rk5.m51143s(parcel, 12, this.f23185B, false);
            rk5.m51143s(parcel, 13, this.f23186C, false);
            rk5.m51143s(parcel, 14, this.f23187H, false);
            rk5.m51143s(parcel, 15, this.f23188I, false);
            rk5.m51126b(parcel, a);
        }

        public DriverLicense(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7, @RecentlyNonNull String str8, @RecentlyNonNull String str9, @RecentlyNonNull String str10, @RecentlyNonNull String str11, @RecentlyNonNull String str12, @RecentlyNonNull String str13, @RecentlyNonNull String str14) {
            this.f23189a = str;
            this.f23190d = str2;
            this.f23191e = str3;
            this.f23192g = str4;
            this.f23193k = str5;
            this.f23194r = str6;
            this.f23195s = str7;
            this.f23196x = str8;
            this.f23197y = str9;
            this.f23184A = str10;
            this.f23185B = str11;
            this.f23186C = str12;
            this.f23187H = str13;
            this.f23188I = str14;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class Email extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Email> CREATOR = new C4160f();

        /* renamed from: a */
        public int f23198a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23199d;
        @RecentlyNonNull

        /* renamed from: e */
        public String f23200e;
        @RecentlyNonNull

        /* renamed from: g */
        public String f23201g;

        public Email() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51137m(parcel, 2, this.f23198a);
            rk5.m51143s(parcel, 3, this.f23199d, false);
            rk5.m51143s(parcel, 4, this.f23200e, false);
            rk5.m51143s(parcel, 5, this.f23201g, false);
            rk5.m51126b(parcel, a);
        }

        public Email(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3) {
            this.f23198a = i;
            this.f23199d = str;
            this.f23200e = str2;
            this.f23201g = str3;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class GeoPoint extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<GeoPoint> CREATOR = new C4163i();

        /* renamed from: a */
        public double f23202a;

        /* renamed from: d */
        public double f23203d;

        public GeoPoint() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51132h(parcel, 2, this.f23202a);
            rk5.m51132h(parcel, 3, this.f23203d);
            rk5.m51126b(parcel, a);
        }

        public GeoPoint(double d, double d2) {
            this.f23202a = d;
            this.f23203d = d2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class PersonName extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<PersonName> CREATOR = new C4162h();
        @RecentlyNonNull

        /* renamed from: a */
        public String f23204a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23205d;
        @RecentlyNonNull

        /* renamed from: e */
        public String f23206e;
        @RecentlyNonNull

        /* renamed from: g */
        public String f23207g;
        @RecentlyNonNull

        /* renamed from: k */
        public String f23208k;
        @RecentlyNonNull

        /* renamed from: r */
        public String f23209r;
        @RecentlyNonNull

        /* renamed from: s */
        public String f23210s;

        public PersonName() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51143s(parcel, 2, this.f23204a, false);
            rk5.m51143s(parcel, 3, this.f23205d, false);
            rk5.m51143s(parcel, 4, this.f23206e, false);
            rk5.m51143s(parcel, 5, this.f23207g, false);
            rk5.m51143s(parcel, 6, this.f23208k, false);
            rk5.m51143s(parcel, 7, this.f23209r, false);
            rk5.m51143s(parcel, 8, this.f23210s, false);
            rk5.m51126b(parcel, a);
        }

        public PersonName(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7) {
            this.f23204a = str;
            this.f23205d = str2;
            this.f23206e = str3;
            this.f23207g = str4;
            this.f23208k = str5;
            this.f23209r = str6;
            this.f23210s = str7;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class Phone extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Phone> CREATOR = new C4165k();

        /* renamed from: a */
        public int f23211a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23212d;

        public Phone() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51137m(parcel, 2, this.f23211a);
            rk5.m51143s(parcel, 3, this.f23212d, false);
            rk5.m51126b(parcel, a);
        }

        public Phone(int i, @RecentlyNonNull String str) {
            this.f23211a = i;
            this.f23212d = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class Sms extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<Sms> CREATOR = new C4164j();
        @RecentlyNonNull

        /* renamed from: a */
        public String f23213a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23214d;

        public Sms() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51143s(parcel, 2, this.f23213a, false);
            rk5.m51143s(parcel, 3, this.f23214d, false);
            rk5.m51126b(parcel, a);
        }

        public Sms(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f23213a = str;
            this.f23214d = str2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class UrlBookmark extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<UrlBookmark> CREATOR = new C4167m();
        @RecentlyNonNull

        /* renamed from: a */
        public String f23215a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23216d;

        public UrlBookmark() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51143s(parcel, 2, this.f23215a, false);
            rk5.m51143s(parcel, 3, this.f23216d, false);
            rk5.m51126b(parcel, a);
        }

        public UrlBookmark(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f23215a = str;
            this.f23216d = str2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class WiFi extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator<WiFi> CREATOR = new C4166l();
        @RecentlyNonNull

        /* renamed from: a */
        public String f23217a;
        @RecentlyNonNull

        /* renamed from: d */
        public String f23218d;

        /* renamed from: e */
        public int f23219e;

        public WiFi() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51143s(parcel, 2, this.f23217a, false);
            rk5.m51143s(parcel, 3, this.f23218d, false);
            rk5.m51137m(parcel, 4, this.f23219e);
            rk5.m51126b(parcel, a);
        }

        public WiFi(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i) {
            this.f23217a = str;
            this.f23218d = str2;
            this.f23219e = i;
        }
    }

    public Barcode() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f23151a);
        rk5.m51143s(parcel, 3, this.f23152d, false);
        rk5.m51143s(parcel, 4, this.f23153e, false);
        rk5.m51137m(parcel, 5, this.f23154g);
        rk5.m51146v(parcel, 6, this.f23155k, i, false);
        rk5.m51142r(parcel, 7, this.f23156r, i, false);
        rk5.m51142r(parcel, 8, this.f23157s, i, false);
        rk5.m51142r(parcel, 9, this.f23158x, i, false);
        rk5.m51142r(parcel, 10, this.f23159y, i, false);
        rk5.m51142r(parcel, 11, this.f23144A, i, false);
        rk5.m51142r(parcel, 12, this.f23145B, i, false);
        rk5.m51142r(parcel, 13, this.f23146C, i, false);
        rk5.m51142r(parcel, 14, this.f23147H, i, false);
        rk5.m51142r(parcel, 15, this.f23148I, i, false);
        rk5.m51130f(parcel, 16, this.f23149L, false);
        rk5.m51127c(parcel, 17, this.f23150M);
        rk5.m51126b(parcel, a);
    }

    public Barcode(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, int i2, @RecentlyNonNull Point[] pointArr, @RecentlyNonNull Email email, @RecentlyNonNull Phone phone, @RecentlyNonNull Sms sms, @RecentlyNonNull WiFi wiFi, @RecentlyNonNull UrlBookmark urlBookmark, @RecentlyNonNull GeoPoint geoPoint, @RecentlyNonNull CalendarEvent calendarEvent, @RecentlyNonNull ContactInfo contactInfo, @RecentlyNonNull DriverLicense driverLicense, @RecentlyNonNull byte[] bArr, boolean z) {
        this.f23151a = i;
        this.f23152d = str;
        this.f23149L = bArr;
        this.f23153e = str2;
        this.f23154g = i2;
        this.f23155k = pointArr;
        this.f23150M = z;
        this.f23156r = email;
        this.f23157s = phone;
        this.f23158x = sms;
        this.f23159y = wiFi;
        this.f23144A = urlBookmark;
        this.f23145B = geoPoint;
        this.f23146C = calendarEvent;
        this.f23147H = contactInfo;
        this.f23148I = driverLicense;
    }
}
