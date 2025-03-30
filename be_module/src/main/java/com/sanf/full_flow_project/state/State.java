package com.sanf.full_flow_project.state;

public enum State {
    TODO,
    IN_PROGRESS,
    VALIDATION,
    DONE;

    public State next() {
        switch (this) {
            case TODO:
                return IN_PROGRESS;
            case IN_PROGRESS:
                return VALIDATION;
            case VALIDATION:
                return DONE;
            default:
                throw new IllegalStateException("No next state for DONE.");
        }
    }

    public State prev() {
        switch (this) {
            case IN_PROGRESS:
                return TODO;
            case VALIDATION:
                return IN_PROGRESS;
            case DONE:
                return VALIDATION;
            default:
                throw new IllegalStateException("No previous state for TODO.");
        }
    }
}
