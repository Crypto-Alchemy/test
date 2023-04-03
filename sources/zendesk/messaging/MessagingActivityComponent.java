package zendesk.messaging;

import androidx.appcompat.app.AppCompatActivity;

interface MessagingActivityComponent {

    public interface Builder {
        Builder activity(AppCompatActivity appCompatActivity);

        MessagingActivityComponent build();

        Builder messagingComponent(MessagingComponent messagingComponent);
    }

    void inject(MessagingActivity messagingActivity);
}
