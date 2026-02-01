package com.rotavision;

/**
 * Vishwas - Trust, Fairness & Explainability API.
 */
public class Vishwas {
    private final Rotavision client;

    Vishwas(Rotavision client) {
        this.client = client;
    }

    /**
     * Start building an analyze request.
     */
    public AnalyzeRequest analyze() {
        return new AnalyzeRequest(this);
    }

    /**
     * Start building an explain request.
     */
    public ExplainRequest explain() {
        return new ExplainRequest(this);
    }

    public static class AnalyzeRequest {
        private final Vishwas vishwas;
        private String text;
        private String context;
        private String[] demographics;
        private String modelId;
        private double threshold = 0.7;

        AnalyzeRequest(Vishwas vishwas) {
            this.vishwas = vishwas;
        }

        public AnalyzeRequest text(String text) {
            this.text = text;
            return this;
        }

        public AnalyzeRequest context(String context) {
            this.context = context;
            return this;
        }

        public AnalyzeRequest demographics(String... demographics) {
            this.demographics = demographics;
            return this;
        }

        public AnalyzeRequest modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        public AnalyzeRequest threshold(double threshold) {
            this.threshold = threshold;
            return this;
        }

        public AnalyzeResult execute() {
            throw new UnsupportedOperationException("Coming soon. Contact developers@rotavision.com");
        }
    }

    public static class ExplainRequest {
        private final Vishwas vishwas;

        ExplainRequest(Vishwas vishwas) {
            this.vishwas = vishwas;
        }

        public ExplainResult execute() {
            throw new UnsupportedOperationException("Coming soon. Contact developers@rotavision.com");
        }
    }

    public static class AnalyzeResult {
        private String id;
        private boolean biasDetected;
        private double biasScore;
        private String recommendation;

        public String getId() { return id; }
        public boolean isBiasDetected() { return biasDetected; }
        public double getBiasScore() { return biasScore; }
        public String getRecommendation() { return recommendation; }
    }

    public static class ExplainResult {
        private String id;
        private String summary;

        public String getId() { return id; }
        public String getSummary() { return summary; }
    }
}
