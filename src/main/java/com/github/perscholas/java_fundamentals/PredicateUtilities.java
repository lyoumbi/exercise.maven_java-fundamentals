package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        boolean isGreater = true;
        if(y >= x) isGreater = false;
        return isGreater;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        boolean isLess = true;
        if(y <= x) isLess = false;
        return isLess;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        boolean isGreaterOrEqual = true;
        if(x < y) isGreaterOrEqual = false;
        return isGreaterOrEqual;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        boolean isLessOrEqual = true;
        if(x > y) isLessOrEqual = false;
        return isLessOrEqual;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        return true;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
    }

}