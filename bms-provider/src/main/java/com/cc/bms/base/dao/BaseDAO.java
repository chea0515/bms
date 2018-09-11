package com.cc.bms.base.dao;

public interface BaseDAO {
    /**
     * get bean .
     * @param <T> return params.
     * @param <V> input params.
     * @return T
     */
    <T, V> T select(V v);

    /**
     * count bean total num.
     * @param <V> input params.
     * @return Integer.
     */
    <V> Integer count(V v);

    /**
     * save bean .
     * @param <V> input params.
     * @return Integer.
     */
    <V> Integer save(V v);

    /**
     * update bean.
     * @param <V> input params.
     * @return Integer.
     */
    <V> Integer update(V v);

    /**
     * delete bean .
     * @param <V>  input params.
     * @return Integer.
     */
    <V> Integer delete(V v);
}
