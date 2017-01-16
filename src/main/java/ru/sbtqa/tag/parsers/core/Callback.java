package ru.sbtqa.tag.parsers.core;

/**
 * Simple callback
 *
 * @param <P> Object to inject
 * @param <R> Object to return
 */
public interface Callback<P extends Object, R extends Object> {

    /**
     *
     * @param p Object to inject
     * @return callback result
     */
    public R call(P p);
}
