package ru.sbtqa.tag.parsers.core;

public interface ParserCallback extends Callback<ParserItem, Object> {

    /**
     * Callback implementation
     *
     * @param item a {@link ru.sbtqa.tag.parsers.core.ParserItem} object
     * @return an object received after parser item applied
     */
    @Override
    public String call(ParserItem item);

}
