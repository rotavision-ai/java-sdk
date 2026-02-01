package com.rotavision;

/**
 * Guardian - AI Reliability Monitoring API.
 */
public class Guardian {
    private final Rotavision client;

    Guardian(Rotavision client) {
        this.client = client;
    }

    public MonitorRequest monitor() {
        return new MonitorRequest(this);
    }

    public static class MonitorRequest {
        private final Guardian guardian;

        MonitorRequest(Guardian guardian) {
            this.guardian = guardian;
        }

        public MonitorRequest prompt(String prompt) { return this; }
        public MonitorRequest response(String response) { return this; }
        public MonitorRequest model(String model) { return this; }
        public MonitorRequest checks(String... checks) { return this; }

        public MonitorResult execute() {
            throw new UnsupportedOperationException("Coming soon. Contact developers@rotavision.com");
        }
    }

    public static class MonitorResult {
        private String id;
        private String status;

        public String getId() { return id; }
        public String getStatus() { return status; }
    }
}
