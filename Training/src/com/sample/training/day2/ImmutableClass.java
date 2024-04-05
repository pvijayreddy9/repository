package com.sample.training.day2;

import com.sample.training.exception.Person;

public final class ImmutableClass {
    private final int immutableField;
    private final Person p;

    public ImmutableClass(Person p, int immutableField) {
        this.immutableField = immutableField;
        this.p = p;
    }

    public int getImmutableField() {
        return immutableField;
    }

	public Person getP() {
		return p;
	}
    
}

