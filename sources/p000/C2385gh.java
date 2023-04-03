package p000;

import androidx.compose.p004ui.autofill.AutofillType;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.C6177b;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, mo44877d2 = {"Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "androidType", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: gh */
/* compiled from: AndroidAutofillType.android.kt */
public final class C2385gh {

    /* renamed from: a */
    public static final HashMap<AutofillType, String> f12320a = C6177b.m47363k(wy6.m54142a(AutofillType.EmailAddress, "emailAddress"), wy6.m54142a(AutofillType.Username, "username"), wy6.m54142a(AutofillType.Password, "password"), wy6.m54142a(AutofillType.NewUsername, "newUsername"), wy6.m54142a(AutofillType.NewPassword, "newPassword"), wy6.m54142a(AutofillType.PostalAddress, "postalAddress"), wy6.m54142a(AutofillType.PostalCode, "postalCode"), wy6.m54142a(AutofillType.CreditCardNumber, "creditCardNumber"), wy6.m54142a(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), wy6.m54142a(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), wy6.m54142a(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), wy6.m54142a(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), wy6.m54142a(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), wy6.m54142a(AutofillType.AddressCountry, "addressCountry"), wy6.m54142a(AutofillType.AddressRegion, "addressRegion"), wy6.m54142a(AutofillType.AddressLocality, "addressLocality"), wy6.m54142a(AutofillType.AddressStreet, "streetAddress"), wy6.m54142a(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), wy6.m54142a(AutofillType.PostalCodeExtended, "extendedPostalCode"), wy6.m54142a(AutofillType.PersonFullName, "personName"), wy6.m54142a(AutofillType.PersonFirstName, "personGivenName"), wy6.m54142a(AutofillType.PersonLastName, "personFamilyName"), wy6.m54142a(AutofillType.PersonMiddleName, "personMiddleName"), wy6.m54142a(AutofillType.PersonMiddleInitial, "personMiddleInitial"), wy6.m54142a(AutofillType.PersonNamePrefix, "personNamePrefix"), wy6.m54142a(AutofillType.PersonNameSuffix, "personNameSuffix"), wy6.m54142a(AutofillType.PhoneNumber, "phoneNumber"), wy6.m54142a(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), wy6.m54142a(AutofillType.PhoneCountryCode, "phoneCountryCode"), wy6.m54142a(AutofillType.PhoneNumberNational, "phoneNational"), wy6.m54142a(AutofillType.Gender, "gender"), wy6.m54142a(AutofillType.BirthDateFull, "birthDateFull"), wy6.m54142a(AutofillType.BirthDateDay, "birthDateDay"), wy6.m54142a(AutofillType.BirthDateMonth, "birthDateMonth"), wy6.m54142a(AutofillType.BirthDateYear, "birthDateYear"), wy6.m54142a(AutofillType.SmsOtpCode, "smsOTPCode"));

    /* renamed from: a */
    public static final String m18065a(AutofillType autofillType) {
        vx2.m53591g(autofillType, "<this>");
        String str = f12320a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}
