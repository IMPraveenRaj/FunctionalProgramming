package com.springheaven.functional.labs;

public class Family {

    private String id;
    private String name;
    private String status;

    public Family() {
    }

    @Override
    public String toString() {
        return "Family{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Family(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public static class FamilyBuilder {
        private String id;
        private String name;
        private String status;

        public FamilyBuilder() {
        }

        public FamilyBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FamilyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FamilyBuilder status(String status) {
            this.status = status;
            return this;
        }

        public Family build() {
            return new Family(this.id, this.name, this.status);
        }
    }
}
