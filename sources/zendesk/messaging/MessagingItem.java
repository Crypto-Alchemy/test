package zendesk.messaging;

import java.util.Date;
import java.util.List;
import zendesk.messaging.Engine;

public abstract class MessagingItem implements MessagingEvent {

    /* renamed from: id */
    private final String f46792id;
    private final Date timestamp;

    public static class Action {
        private final String displayName;

        public String getDisplayName() {
            return this.displayName;
        }
    }

    public static class ActionResponse extends Response {
        private List<Action> actions;
        private final String message;

        public List<Action> getActions() {
            return this.actions;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static class ArticlesResponse extends Response {
        private final List<ArticleSuggestion> articleSuggestions;

        public static class ArticleSuggestion {
            private final String snippet;
            private final String title;

            public String getSnippet() {
                return this.snippet;
            }

            public String getTitle() {
                return this.title;
            }
        }

        public List<ArticleSuggestion> getArticleSuggestions() {
            return this.articleSuggestions;
        }
    }

    public static class FileQuery extends Query {
        private final FailureReason failureReason;

        public enum FailureReason {
            FILE_SIZE_TOO_LARGE,
            FILE_SENDING_DISABLED,
            UNSUPPORTED_FILE_TYPE
        }

        public Attachment getAttachment() {
            return null;
        }

        public FailureReason getFailureReason() {
            return this.failureReason;
        }
    }

    public static class FileResponse extends Response {
        public Attachment getAttachment() {
            return null;
        }
    }

    public static class ImageQuery extends FileQuery {
    }

    public static class ImageResponse extends FileResponse {
    }

    public static class Option {

        /* renamed from: id */
        private final String f46793id;
        private final String text;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Option option = (Option) obj;
            if (!this.f46793id.equals(option.f46793id)) {
                return false;
            }
            return this.text.equals(option.text);
        }

        public String getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.f46793id.hashCode() * 31) + this.text.hashCode();
        }
    }

    public static class OptionsResponse extends MessagingItem {
        private final List<Option> options;

        public List<Option> getOptions() {
            return this.options;
        }
    }

    public static abstract class Query extends MessagingItem {
        private final Status status;

        public enum Status {
            PENDING,
            DELIVERED,
            FAILED,
            FAILED_NO_RETRY
        }

        public Status getStatus() {
            return this.status;
        }
    }

    public static abstract class Response extends MessagingItem {
        private final AgentDetails agentDetails;

        public Response(Date date, String str, AgentDetails agentDetails2) {
            super(date, str);
            this.agentDetails = agentDetails2;
        }

        public AgentDetails getAgentDetails() {
            return this.agentDetails;
        }
    }

    public static class SystemMessage extends MessagingItem {
        private final String systemMessage;

        public String getSystemMessage() {
            return this.systemMessage;
        }
    }

    public static class TextQuery extends Query {
        private final String message;

        public String getMessage() {
            return this.message;
        }
    }

    public static class TextResponse extends Response {
        private final String message;

        public String getMessage() {
            return this.message;
        }
    }

    public static class TransferResponse extends Response {
        private final boolean enabled;
        private final List<Engine.TransferOptionDescription> engineOptions;
        private final String message;

        public TransferResponse(Date date, String str, AgentDetails agentDetails, String str2, List<Engine.TransferOptionDescription> list, boolean z) {
            super(date, str, agentDetails);
            this.message = str2;
            this.engineOptions = list;
            this.enabled = z;
        }

        public List<Engine.TransferOptionDescription> getEngineOptions() {
            return this.engineOptions;
        }

        public String getMessage() {
            return this.message;
        }

        public boolean isEnabled() {
            return this.enabled;
        }
    }

    public MessagingItem(Date date, String str) {
        this.timestamp = date;
        this.f46792id = str;
    }

    public String getId() {
        return this.f46792id;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }
}
