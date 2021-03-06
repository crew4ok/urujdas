package ru.uruydas.common.dao.exception;

public class NotFoundException extends RuntimeException {
    private final Class<?> entityClass;
    private final Object identifier;

    public NotFoundException(Class<?> entityClass, Object identifier) {
        this.entityClass = entityClass;
        this.identifier = identifier;
    }

    public Object getIdentifier() {
        return identifier;
    }

    public Class<?> getEntityClass() {
        return entityClass;
    }
}
