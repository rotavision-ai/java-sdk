package com.rotavision;

/**
 * Gati - Fleet & Mobility Intelligence API.
 */
public class Gati {
    private final Rotavision client;

    Gati(Rotavision client) {
        this.client = client;
    }

    public OptimizeRequest optimize() {
        return new OptimizeRequest(this);
    }

    public static class OptimizeRequest {
        private final Gati gati;

        OptimizeRequest(Gati gati) {
            this.gati = gati;
        }

        public OptimizeRequest fleetId(String fleetId) { return this; }
        public OptimizeRequest vehicles(String... vehicles) { return this; }

        public OptimizeResult execute() {
            throw new UnsupportedOperationException("Coming soon. Contact developers@rotavision.com");
        }
    }

    public static class OptimizeResult {
        private String id;

        public String getId() { return id; }
    }
}
