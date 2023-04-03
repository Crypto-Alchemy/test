package zendesk.messaging;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.messaging.components.DateProvider;

public final class MessagingDialog_Factory implements ry1<MessagingDialog> {
    private final ky4<AppCompatActivity> appCompatActivityProvider;
    private final ky4<DateProvider> dateProvider;
    private final ky4<MessagingViewModel> messagingViewModelProvider;

    public MessagingDialog_Factory(ky4<AppCompatActivity> ky4, ky4<MessagingViewModel> ky42, ky4<DateProvider> ky43) {
        this.appCompatActivityProvider = ky4;
        this.messagingViewModelProvider = ky42;
        this.dateProvider = ky43;
    }

    public static MessagingDialog_Factory create(ky4<AppCompatActivity> ky4, ky4<MessagingViewModel> ky42, ky4<DateProvider> ky43) {
        return new MessagingDialog_Factory(ky4, ky42, ky43);
    }

    public static MessagingDialog newInstance(AppCompatActivity appCompatActivity, MessagingViewModel messagingViewModel, DateProvider dateProvider2) {
        return new MessagingDialog(appCompatActivity, messagingViewModel, dateProvider2);
    }

    public MessagingDialog get() {
        return newInstance(this.appCompatActivityProvider.get(), this.messagingViewModelProvider.get(), this.dateProvider.get());
    }
}
